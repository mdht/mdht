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
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HitspFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

public class Main {
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		
		PatientSummary patientSummary = main.createPatientSummary();
		
		ActiveProblemsSection problemList = patientSummary.createProblemListSection();
		main.fillProblemList(problemList);
		
		patientSummary.addSection(main.createAllergiesSection());
		patientSummary.addSection(main.createMedicationsSection());
		
		main.save(patientSummary);
		main.validate(patientSummary);
	}
	
	public PatientSummary createPatientSummary() {
		PatientSummary doc = HitspFactory.eINSTANCE.createPatientSummary().init();

		II id = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72", 
				"CCD_HITSP_C32v2.4_16SectionsWithEntries_Rev6_Notes");
		id.setAssigningAuthorityName("NIST Healthcare Project");
		doc.setId(id);
		
		CE code = DatatypesFactory.eINSTANCE.createCE("34133-9", "2.16.840.1.113883.6.1", 
				"LOINC", "Summarization of episode note (CCD/CONF-1)");
		doc.setCode(code);
		
		TS ts = DatatypesFactory.eINSTANCE.createTS("20071204103022-0500");
		doc.setEffectiveTime(ts);

		CE langCode = DatatypesFactory.eINSTANCE.createCE();
		langCode.setCode("en-US");
		doc.setLanguageCode(langCode);
		
		ST title = DatatypesFactory.eINSTANCE.createST(
			"Test Instance of CCD Guide and HITSP C32,C83 and C80 Profiles");
		doc.setTitle(title);

		CE confCode = DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25");
		doc.setConfidentialityCode(confCode);
		
		Author author = CDAFactory.eINSTANCE.createAuthor();
		doc.getAuthor().add(author);
		author.setTime(DatatypesFactory.eINSTANCE.createTS("20070916130000"));
		//assignedAuthor
		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
		author.setAssignedAuthor(assignedAuthor);
		assignedAuthor.getId().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72.5.2", "LJG"));
		//assignedPerson
		Person person = CDAFactory.eINSTANCE.createPerson();
		assignedAuthor.setAssignedPerson(person);
		PN pn = DatatypesFactory.eINSTANCE.createPN();
		pn.addGiven("Len").addFamily("Gallagher");
		person.getName().add(pn);
		//representedOrganization
		Organization organization = CDAFactory.eINSTANCE.createOrganization();
		assignedAuthor.setRepresentedOrganization(organization);
		II orgId = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72");
		orgId.setAssigningAuthorityName("NIST Healthcare (NIST-H)");
		organization.getId().add(orgId);
		ON on = DatatypesFactory.eINSTANCE.createON();
		on.addText("NIST HL7 Test Laboratory");
		organization.getName().add(on);
		organization.getTelecom().add(DatatypesFactory.eINSTANCE.createTEL("+1-301-975-3251"));
		
		Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
		doc.setCustodian(custodian);
		AssignedCustodian assignedCustodian = CDAFactory.eINSTANCE.createAssignedCustodian();
		custodian.setAssignedCustodian(assignedCustodian);
		//representedOrganization
		CustodianOrganization custodianOrganization = CDAFactory.eINSTANCE.createCustodianOrganization();
		assignedCustodian.setRepresentedCustodianOrganization(custodianOrganization);
		II custodianId = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72.5");
		custodianId.setAssigningAuthorityName("NIST Healthcare (NIST-H)");
		custodianOrganization.getId().add(custodianId);
		ON custodianName = DatatypesFactory.eINSTANCE.createON();
		custodianName.addText("NIST HL7 Test Laboratory");
		custodianOrganization.setName(custodianName);
		custodianOrganization.setTelecom(DatatypesFactory.eINSTANCE.createTEL("+1-301-975-3251"));
		custodianOrganization.setAddr(DatatypesFactory.eINSTANCE.createAD());
		
		return doc;
	}
	
	public void fillProblemList(ActiveProblemsSection problemList) {
		Condition condition = HitspFactory.eINSTANCE.createCondition().init();
		problemList.addAct(condition);
		II id = DatatypesFactory.eINSTANCE.createII("ec8a6ff8-ed4b-4f7e-82c3-e98e58b45de7");
		condition.getId().add(id);
	}

	public Section createAllergiesSection() {
		Section section = CDAFactory.eINSTANCE.createSection();
		
		return section;
	}

	public Section createMedicationsSection() {
		Section section = CDAFactory.eINSTANCE.createSection();
		CE code = DatatypesFactory.eINSTANCE.createCE("10160-0", "2.16.840.1.113883.6.1");
		section.setCode(code);
		section.setTitle(DatatypesFactory.eINSTANCE.createST("Medications"));

		Medication meds = HitspFactory.eINSTANCE.createMedication().init();	
		section.addSubstanceAdministration(meds);
		
		return section;
	}

	public void save(ClinicalDocument clinicalDocument) throws Exception {
		CDAUtil.save(clinicalDocument, System.out);
	}
	
	public void validate(ClinicalDocument clinicalDocument) throws Exception {
		boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}
		});
		
		if (valid) {
			System.out.println("Document is valid");
		} else {
			System.out.println("Document is invalid");
		}
	}

	public void validateSampleC32() throws Exception {
		ClinicalDocument sampleDoc = CDAUtil.load(new FileInputStream("resources/SampleC32Document.xml"));
		System.out.println(sampleDoc);
		
		validate(sampleDoc);
	}
	
}
