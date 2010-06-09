/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.io.FileInputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class Main {
	public static void main(String[] args) throws Exception {	
		ContinuityOfCareDocument doc = CCDFactory.eINSTANCE.createContinuityOfCareDocument().init();
		
		Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
		AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		informant.setAssignedEntity(assignedEntity);
		doc.getInformants().add(informant);
		
		PurposeSection purposeSection = CCDFactory.eINSTANCE.createPurposeSection().init();
		doc.addSection(purposeSection);
		PurposeActivity purposeActivity = CCDFactory.eINSTANCE.createPurposeActivity().init();
		purposeSection.addAct(purposeActivity);
		SubstanceAdministration purposeReason = CDAFactory.eINSTANCE.createSubstanceAdministration();
		purposeActivity.addSubstanceAdministration(purposeReason);
		// should produce validation error for incorrect reason type
//		Organizer purposeReason = CDAFactory.eINSTANCE.createOrganizer();
//		purposeActivity.addOrganizer(purposeReason);
		purposeActivity.getEntryRelationships().get(0).setTypeCode(x_ActRelationshipEntryRelationship.RSON);
		
		ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();
		ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();	
		ProblemStatusObservation problemStatus = CCDFactory.eINSTANCE.createProblemStatusObservation().init();
		ProblemHealthStatusObservation problemHealthStatus = CCDFactory.eINSTANCE.createProblemHealthStatusObservation().init();
		EpisodeObservation episodeObservation = CCDFactory.eINSTANCE.createEpisodeObservation().init();
		
		ProblemSection problemSection = CCDFactory.eINSTANCE.createProblemSection().init();
		doc.addSection(problemSection);
		problemSection.addAct(problemAct);
		problemAct.addObservation(problemObservation);
		
		problemSection.addObservation(problemStatus);
		problemSection.addObservation(problemHealthStatus);
		problemSection.addObservation(episodeObservation);

		ResultsSection resultsSection = CCDFactory.eINSTANCE.createResultsSection().init();
		doc.addSection(resultsSection);
		ResultOrganizer resultOrganizer = CCDFactory.eINSTANCE.createResultOrganizer().init();
		resultsSection.addOrganizer(resultOrganizer);
		ResultObservation resultObservation = CCDFactory.eINSTANCE.createResultObservation().init();
		resultOrganizer.addObservation(resultObservation);

		System.out.println("***** Generate CCD *****");
		CDAUtil.save(doc, System.out);

		System.out.println("\n\n***** Validate generated CCD *****");
		validate(doc);

		System.out.println("\n***** Validate sample CCD *****");
		ClinicalDocument sampleCCD = CDAUtil.load(new FileInputStream("samples/SampleCCDDocument.xml"));
		validate(sampleCCD);
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
//			@Override
//			public void handleInfo(Diagnostic diagnostic) {
//				System.out.println("INFO: " + diagnostic.getMessage());
//			}
		});
		
		if (valid) {
			System.out.println("Document is valid");
		} else {
			System.out.println("Document is invalid");
		}
	}
}
