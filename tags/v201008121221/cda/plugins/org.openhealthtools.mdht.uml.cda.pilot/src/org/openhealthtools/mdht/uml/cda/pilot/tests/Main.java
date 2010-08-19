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
package org.openhealthtools.mdht.uml.cda.pilot.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNFactory;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultObservation;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultOrganizer;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection;
import org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryOrganizer;

public class Main {
	public static void main(String[] args) throws Exception {
		TuberculosisFollowUpProgressNote clinicalDocument = 
			TBPNFactory.eINSTANCE.createTuberculosisFollowUpProgressNote().init();
		TBResultsSection section = TBPNFactory.eINSTANCE.createTBResultsSection().init();
		TBResultOrganizer organizer = TBPNFactory.eINSTANCE.createTBResultOrganizer().init();
		TBResultObservation observation = TBPNFactory.eINSTANCE.createTBResultObservation().init();
		
		observation.getCode().setCode("645-2");
		
		clinicalDocument.addSection(section);
		section.addOrganizer(organizer);
		organizer.addObservation(observation);
		organizer.setClassCode(x_ActClassDocumentEntryOrganizer.BATTERY);
		
		Patient patient = CDAFactory.eINSTANCE.createPatient();
		clinicalDocument.addPatient(patient);
		PN name = DatatypesFactory.eINSTANCE.createPN();
		patient.getNames().add(name);
		name.addFamily("Doe").addGiven("John").addPrefix("Dr.");
		// to test the constraint, replace above line with this
		//name.addGiven("John").addPrefix("Dr.");
		PN name2 = DatatypesFactory.eINSTANCE.createPN();
		patient.getNames().add(name2);
		name2.addFamily("Doe").addSuffix("M.D.");
		
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
