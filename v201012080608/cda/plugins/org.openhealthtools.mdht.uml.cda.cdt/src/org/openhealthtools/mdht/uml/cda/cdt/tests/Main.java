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
package org.openhealthtools.mdht.uml.cda.cdt.tests;

import java.io.FileInputStream;
import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;

public class Main {
	public static void main(String[] args) throws Exception {
		ConsultationNote consultationNote = CDTFactory.eINSTANCE.createConsultationNote().init();
		consultationNote.getCode().setCode("11488-4");
		consultationNote.getCode().setDisplayName("CONSULTATION NOTE");
		consultationNote.setTitle(DatatypesFactory.eINSTANCE.createST("Good Health Pain Management Consultants Consultation Note"));
		consultationNote.setEffectiveTime(DatatypesFactory.eINSTANCE.createTS("20070303171504+0500"));
		consultationNote.setId(DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString(), "999021"));
		consultationNote.setConfidentialityCode(DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25"));
		INT one = DatatypesFactory.eINSTANCE.createINT();
		one.setValue(1);
		consultationNote.setVersionNumber(one);

//		ReasonForVisitSectionConsult visitSection = CDTFactory.eINSTANCE.createReasonForVisitSectionConsult().init();
//		consultationNote.addSection(visitSection);
		
		ReasonForReferralSection referralSection = CDTFactory.eINSTANCE.createReasonForReferralSection().init();
		consultationNote.addSection(referralSection);

		System.out.println("***** Generate Consultation Note *****");
		save(consultationNote);
		System.out.println("\n\n***** Validate generated Consultation Note *****");
		validate(consultationNote);

		System.out.println("\n***** Validate sample H & P *****");
		ClinicalDocument sampleHandP = CDAUtil.load(new FileInputStream("samples/HandP.sample.xml"));
		validate(sampleHandP);
		
		System.out.println("\n***** Validate sample Consultation Note *****");
		ClinicalDocument sampleConsultNote = CDAUtil.load(new FileInputStream("samples/Consults.Sample.xml"));
		validate(sampleConsultNote);
		
		System.out.println("\n***** Validate sample Progress Note *****");
		ClinicalDocument sampleProgressNote = CDAUtil.load(new FileInputStream("samples/Progress_Note.xml"));
		validate(sampleProgressNote);
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
