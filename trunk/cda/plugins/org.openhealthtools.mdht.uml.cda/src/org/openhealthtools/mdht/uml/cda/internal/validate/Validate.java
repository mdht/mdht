/*******************************************************************************
 * Copyright (c) 2010, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     IBM Corporation - updated use of MDHT validation APIs
 *     Christian W. Damus - refactored CDAResource, CDAUtil, CDARegistry on the new flexible XML resource (artf3367)
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.internal.validate;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.openhealthtools.mdht.uml.cda.DocumentRoot;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.ValidationResult;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * Simple main validate routine used by the workspace xml instance validation in
 * the cda xml ui plugin
 * 
 * Step 1 Index XML Instance Step 2 Validation Instance Step 3 write results to
 * temp file
 * 
 */
public class Validate {

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

	/**
	 * arg0 = CDA input URI
	 * arg1 = output file for validation results
	 * arg3 = model qualified name for document type class, or null
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		final String DELIMITER = "~";

		CDAUtil.loadPackages();

		try {

			URI cdaURI = URI.createURI(args[0]);

			if (cdaURI.isFile()) {

				OutputStream fout = new FileOutputStream(args[1]);

				OutputStream bout = new BufferedOutputStream(fout);

				final OutputStreamWriter out = new OutputStreamWriter(bout);

				XMLReader parser = XMLReaderFactory.createXMLReader();

				// Install the Content Handler
				final XPathIndexer xpathIndexer = new XPathIndexer();

				parser.setContentHandler(xpathIndexer);

				// set the document type class, or null to discover from templateId
				String documentClassQName = null;
				if (args.length >= 3) {
					documentClassQName = args[2];
				}

				try {

					parser.parse(cdaURI.path());

					ValidationResult result = new ValidationResult();

					ResourceSet rset = CDAUtil.createResourceSet(documentClassQName);
					CDAUtil.load(rset, cdaURI, result);

					// handleError
					for (Diagnostic diagnostic : result.getErrorDiagnostics()) {
						String path = "";
						if (diagnostic.getData().size() > 0 && diagnostic.getData().get(0) instanceof EObject) {
							path = getPath((EObject) diagnostic.getData().get(0));
						}

						XPathIndexer.ElementLocationData eld = xpathIndexer.getElementLocationByPath(path.toUpperCase());

						try {
							if (eld != null) {
								out.write("error" + DELIMITER + eld.line + DELIMITER + eld.column + DELIMITER +
										diagnostic.getMessage() + "\n");
							} else {
								out.write("error" + DELIMITER + 0 + DELIMITER + 0 + DELIMITER +
										diagnostic.getMessage() + "(" + path + ")" + "\n");
							}

						} catch (IOException e) {
							e.printStackTrace();
						}
					}

					// handleInfo

					// handleWarning
					for (Diagnostic diagnostic : result.getWarningDiagnostics()) {
						String path = "";
						if (diagnostic.getData().size() > 0 && diagnostic.getData().get(0) instanceof EObject) {
							path = getPath((EObject) diagnostic.getData().get(0));

						}

						XPathIndexer.ElementLocationData eld = xpathIndexer.getElementLocationByPath(path.toUpperCase());

						try {
							if (eld != null) {
								out.write("warning" + DELIMITER + eld.line + DELIMITER + eld.column + DELIMITER +
										diagnostic.getMessage() + "\n");
							} else {
								out.write("warning" + DELIMITER + 0 + DELIMITER + 0 + DELIMITER +
										diagnostic.getMessage() + "(" + path + ")" + "\n");
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

				}

				catch (SAXParseException spe) {
					// Do not process because XML validation will highlight
					// issue
				} catch (Throwable t) {

					List<Throwable> list = new ArrayList<Throwable>();

					Throwable throwable = t;
					while (throwable != null && list.contains(throwable) == false) {
						list.add(throwable);
						throwable = throwable.getCause();
					}

					String rootMessage = list.get(list.size() - 1).getMessage();

					XPathIndexer.ElementLocationData eld = null;
					for (String value : rootMessage.split("'")) {

						eld = xpathIndexer.getAttributeLocationByValue(value);
						if (eld != null) {
							break;
						}
					}

					if (eld != null) {
						out.write("error" + DELIMITER + eld.line + DELIMITER + eld.column + DELIMITER +
								"CDA document load error : " + rootMessage + "\n");
					} else {
						out.write("error" + DELIMITER + 1 + DELIMITER + 1 + DELIMITER + "CDA document load error : " +
								rootMessage + "\n");
					}

				}

				out.flush();
				out.close();

			}

		} catch (Exception e1) {
		}

	}

}
