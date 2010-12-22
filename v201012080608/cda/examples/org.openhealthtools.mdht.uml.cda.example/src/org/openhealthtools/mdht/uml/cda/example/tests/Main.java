/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation, David A Carlson, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.example.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.example.ExampleFactory;
import org.openhealthtools.mdht.uml.cda.example.MyDocument;
import org.openhealthtools.mdht.uml.cda.example.MyObservation;
import org.openhealthtools.mdht.uml.cda.example.MySection;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

public class Main {
	public static void main(String[] args) throws Exception {
		MyDocument clinicalDocument = ExampleFactory.eINSTANCE.createMyDocument().init();
		MySection section = ExampleFactory.eINSTANCE.createMySection().init();
		MyObservation obs = ExampleFactory.eINSTANCE.createMyObservation().init();
		
		clinicalDocument.addSection(section);
		section.addObservation(obs);
		
		save(clinicalDocument);
		validate(clinicalDocument);
	}
	
	private static void save(ClinicalDocument clinicalDocument) throws Exception {
		CDAUtil.save(clinicalDocument, System.out);
	}
	
	private static void validate(ClinicalDocument clinicalDocument) throws Exception {
		boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}
			@Override
			public void handleWarning(Diagnostic diagnostic) {
				System.out.println("WARNING: " + diagnostic.getMessage());
			}
			@Override
			public void handleInfo(Diagnostic diagnostic) {
				System.out.println("INFO: " + diagnostic.getMessage());
			}
		});
		
		if (valid) {
			System.out.println("Document is valid");
		} else {
			System.out.println("Document is invalid");
		}
	}
}
