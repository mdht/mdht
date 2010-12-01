/*******************************************************************************
 * Copyright (c) 2010 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.internal.validate;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.DocumentRoot;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * Simple main validate routine used by the workspace xml instance validation in the cda xml ui plugin
 * 
 *  Step 1 Index XML Instance 
 *  Step 2 Validation Instance
 *  Step 3 write results to temp file
 *
 */
public class Validate {

	public static void main(String[] args) {
		

		final String DELIMITER = "~";
		
		ClinicalDocument clinicalDocument;
		
		CDAUtil.loadPackages();
			
		try {
			
			URI cdaURI = URI.createURI(args[0]);

			if (cdaURI.isFile()) {

				InputSource inputSource = new InputSource(cdaURI.path());

				inputSource.setEncoding("UTF-8");

				OutputStream fout = new FileOutputStream(args[1]);
				OutputStream bout = new BufferedOutputStream(fout);
				final OutputStreamWriter out = new OutputStreamWriter(bout);

				XMLReader parser = XMLReaderFactory.createXMLReader();

				// Install the Content Handler
				final XPathIndexer xpathIndexer = new XPathIndexer();

				parser.setContentHandler(xpathIndexer);

				parser.parse(cdaURI.path());

				clinicalDocument = CDAUtil.load(inputSource);

				CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {

					public void handleError(Diagnostic diagnostic) {

						String path = "";
						if (diagnostic.getData().size() > 0 && diagnostic.getData().get(0) instanceof EObject) {
							path = getPath((EObject) diagnostic.getData().get(0));
						}

						XPathIndexer.ElementLocationData eld = xpathIndexer.getElementLocationByPath(path.toUpperCase());

						try {
							if (eld != null) {
								out.write("error" + DELIMITER + eld.line + DELIMITER + eld.column + DELIMITER + diagnostic.getMessage() + "\n");
							} else {
								out.write("error" + DELIMITER + 0 + DELIMITER + 0 + DELIMITER + diagnostic.getMessage() + "(" + path + ")" + "\n");
							}

						} catch (IOException e) {
							e.printStackTrace();
						}

					}

					public void handleInfo(Diagnostic diagnostic) {

					}

					public void handleWarning(Diagnostic diagnostic) {
						
						String path = "";
						if (diagnostic.getData().size() > 0 && diagnostic.getData().get(0) instanceof EObject) {
							path = getPath((EObject) diagnostic.getData().get(0));

						}

						XPathIndexer.ElementLocationData eld = xpathIndexer.getElementLocationByPath(path.toUpperCase());

						try {
							if (eld != null) {
								out.write("warning" + DELIMITER + eld.line + DELIMITER + eld.column + DELIMITER + diagnostic.getMessage() + "\n");
							} else {
								out.write("warning" + DELIMITER + 0 + DELIMITER + 0 + DELIMITER + diagnostic.getMessage() + "(" + path + ")" + "\n");
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

				});

				out.flush();
				out.close();

			}

		} catch (Exception e1) {
		
			e1.printStackTrace();
		}

	}

	public static String getPath(EObject eObject) {
		String path = "";
		while (eObject != null && !(eObject instanceof DocumentRoot)) {
			EStructuralFeature feature = eObject.eContainingFeature();
			EObject container = eObject.eContainer();
			Object value = container.eGet(feature);
			if (feature.isMany()) {
				List<?> list = (List<?>) value;
				int index = list.indexOf(eObject) + 1;
				path = "/" + feature.getName() + "[" + index + "]" + path;
			} else {
				path = "/" + feature.getName() + "[1]" + path;
			}
			eObject = eObject.eContainer();
		}
		return path;
	}
	
	


}
