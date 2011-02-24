/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.io.FileInputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.NormalDose;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

public class TestPatientSummary {
	public static final IVXB_TS TS_UNK = DatatypesFactory.eINSTANCE.createIVXB_TS();
	
	{
		TS_UNK.setNullFlavor(NullFlavor.UNK);
	}
	
	public static void main(String[] args) throws Exception {
		PatientSummary patientSummary = createPatientSummary();
		
		ActiveProblemsSection problemList = patientSummary.createProblemListSection();
		fillProblemList(problemList);
		
		patientSummary.addSection(createAllergiesSection());
		patientSummary.addSection(createMedicationsSection());

		System.out.println("***** Generate Patient Summary *****");
		save(patientSummary);
		System.out.println("\n\n***** Validate generated Patient Summary *****");
		validate(patientSummary);

		System.out.println("\n***** Validate minimal NIST sample *****");
		ClinicalDocument minimalSample = CDAUtil.load(new FileInputStream("samples/CCD_HITSP_C32v2.5_Minimal_WithEntries_Valid.xml"));
		validate(minimalSample);
		
		System.out.println("\n***** Validate complete NIST sample *****");
		ClinicalDocument completeSample = CDAUtil.load(new FileInputStream("samples/HITSP_C32v2.5_Rev6_16Sections_Entries_MinimalErrors.xml"));
		validate(completeSample);
	}
	
	public static PatientSummary createPatientSummary() {
		PatientSummary doc = HITSPFactory.eINSTANCE.createPatientSummary().init();

		II id = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72", 
				"CCD_HITSP_C32v2.4_16SectionsWithEntries_Rev6_Notes");
		id.setAssigningAuthorityName("NIST Healthcare Project");
		doc.setId(id);
		
		CE code = DatatypesFactory.eINSTANCE.createCE("34133-9", "2.16.840.1.113883.6.1", 
				"LOINC", "Summarization of episode note (CCD/CONF-1)");
		doc.setCode(code);
		
		TS ts = DatatypesFactory.eINSTANCE.createTS("20071204103022-0500");
		doc.setEffectiveTime(ts);

		CS langCode = DatatypesFactory.eINSTANCE.createCS();
		langCode.setCode("en-US");
		doc.setLanguageCode(langCode);
		
		ST title = DatatypesFactory.eINSTANCE.createST(
			"Test Instance of CCD Guide and HITSP C32,C83 and C80 Profiles");
		doc.setTitle(title);

		CE confCode = DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25");
		doc.setConfidentialityCode(confCode);
		
		Author author = CDAFactory.eINSTANCE.createAuthor();
		doc.getAuthors().add(author);
		author.setTime(DatatypesFactory.eINSTANCE.createTS("20070916130000"));
		//assignedAuthor
		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
		author.setAssignedAuthor(assignedAuthor);
		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72.5.2", "LJG"));
		//assignedPerson
		Person person = CDAFactory.eINSTANCE.createPerson();
		assignedAuthor.setAssignedPerson(person);
		PN pn = DatatypesFactory.eINSTANCE.createPN();
		pn.addGiven("Len").addFamily("Gallagher");
		person.getNames().add(pn);
		//representedOrganization
		Organization organization = CDAFactory.eINSTANCE.createOrganization();
		assignedAuthor.setRepresentedOrganization(organization);
		II orgId = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72");
		orgId.setAssigningAuthorityName("NIST Healthcare (NIST-H)");
		organization.getIds().add(orgId);
		ON on = DatatypesFactory.eINSTANCE.createON();
		on.addText("NIST HL7 Test Laboratory");
		organization.getNames().add(on);
		organization.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL("+1-301-975-3251"));
		
		Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
		doc.setCustodian(custodian);
		AssignedCustodian assignedCustodian = CDAFactory.eINSTANCE.createAssignedCustodian();
		custodian.setAssignedCustodian(assignedCustodian);
		//representedOrganization
		CustodianOrganization custodianOrganization = CDAFactory.eINSTANCE.createCustodianOrganization();
		assignedCustodian.setRepresentedCustodianOrganization(custodianOrganization);
		II custodianId = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72.5");
		custodianId.setAssigningAuthorityName("NIST Healthcare (NIST-H)");
		custodianOrganization.getIds().add(custodianId);
		ON custodianName = DatatypesFactory.eINSTANCE.createON();
		custodianName.addText("NIST HL7 Test Laboratory");
		custodianOrganization.setName(custodianName);
		custodianOrganization.setTelecom(DatatypesFactory.eINSTANCE.createTEL("+1-301-975-3251"));
		custodianOrganization.setAddr(DatatypesFactory.eINSTANCE.createAD());
		
		return doc;
	}
	
	public static void fillProblemList(ActiveProblemsSection problemList) {
		Condition condition = HITSPFactory.eINSTANCE.createCondition().init();
		problemList.addAct(condition);
		condition.getIds().add(DatatypesFactory.eINSTANCE.createII("ec8a6ff8-ed4b-4f7e-82c3-e98e58b45de7"));
		
		IVL_TS effectiveTime = DatatypesFactory.eINSTANCE.createIVL_TS();
		effectiveTime.setLow(TS_UNK);
		condition.setEffectiveTime(effectiveTime);
		
		ConditionEntry problemEntry = condition.createConditionEntry();
		problemEntry.getIds().add(DatatypesFactory.eINSTANCE.createII("ab1791b0-5c71-11db-b0de-0800200c9a66"));
		problemEntry.setCode(DatatypesFactory.eINSTANCE.createCD(
				"64572001", "2.16.840.1.113883.6.96", "SNOMED-CT", "Condition"));
		problemEntry.getValues().add(DatatypesFactory.eINSTANCE.createCD(
				"233604007", "2.16.840.1.113883.6.96", "SNOMED-CT", "Pneumonia"));
		effectiveTime = DatatypesFactory.eINSTANCE.createIVL_TS("199701", null);
		effectiveTime.setHigh(TS_UNK);
		problemEntry.setEffectiveTime(effectiveTime);
		
		ProblemHealthStatusObservation healthStatus = CCDFactory.eINSTANCE.createProblemHealthStatusObservation().init();
		problemEntry.addObservation(healthStatus);
		CE healthStatusValue = DatatypesFactory.eINSTANCE.createCE("xyz", "2.16.840.1.113883.1.11.20.12",
				"ProblemHealthStatusCode", null);
		healthStatusValue.setCodeSystemVersion("20061017");
		healthStatus.getValues().add(healthStatusValue);
	}

	public static Section createAllergiesSection() {
		Section section = CDAFactory.eINSTANCE.createSection();
		
		return section;
	}

	public static MedicationsSection createMedicationsSection() {
		MedicationsSection section = IHEFactory.eINSTANCE.createMedicationsSection().init();
		section.setTitle(DatatypesFactory.eINSTANCE.createST("Medications"));

		NormalDose meds = IHEFactory.eINSTANCE.createNormalDose().init();	
		section.addSubstanceAdministration(meds);
		II id = DatatypesFactory.eINSTANCE.createII("cdbd33f0-6cde-11db-9fe1-0800200c9a66");
		meds.getIds().add(id);
		
		return section;
	}

	public static void save(ClinicalDocument clinicalDocument) throws Exception {
		CDAUtil.save(clinicalDocument, System.out);
	}
	
	public static void validate(ClinicalDocument clinicalDocument) throws Exception {
		boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}
//			@Override
//			public void handleWarning(Diagnostic diagnostic) {
//				System.out.println("WARNING: " + diagnostic.getMessage());
//			}
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
