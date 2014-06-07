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
import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor;
import org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.SC;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

public class TestUnstructuredDocument {
	public static final IVXB_TS TS_UNK = DatatypesFactory.eINSTANCE.createIVXB_TS();
	
	{
		TS_UNK.setNullFlavor(NullFlavor.UNK);
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("***** Generate Unstructured Document *****");
		UnstructuredDocument unstructuredDoc = createUnstructuredDocuments();
		save(unstructuredDoc);
		System.out.println("\n\n***** Validate generated Unstructured Document *****");
		validate(unstructuredDoc);

		System.out.println("\n***** Validate C62 sample *****");
		ClinicalDocument c62Sample = CDAUtil.load(new FileInputStream("samples/HITSP_C62.xml"));
		validate(c62Sample);
	}

	public static UnstructuredDocument createUnstructuredDocuments() {
		UnstructuredDocument doc = HITSPFactory.eINSTANCE.createUnstructuredDocument().init();
		addOriginalAuthor(doc);
		addScanningDevice(doc);
		addDocumentCustodian(doc);
		addPatient(doc);
		// adding second patient should produce validation error
//		addPatient(doc);

		II id = DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString());
		doc.setId(id);
		
		CE code = DatatypesFactory.eINSTANCE.createCE("34133-9", "2.16.840.1.113883.6.1", 
				"LOINC", "Summarization of episode note (CCD/CONF-1)");
		doc.setCode(code);
		
		TS ts = DatatypesFactory.eINSTANCE.createTS("20071204103022-0500");
		doc.setEffectiveTime(ts);

		CS langCode = DatatypesFactory.eINSTANCE.createCS();
		langCode.setCode("en-US");
		doc.setLanguageCode(langCode);

//		ST title = DatatypesFactory.eINSTANCE.createST(
//			"Test Instance of HITSP C62 Unstructured Document");
//		doc.setTitle(title);

		CE confCode = DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25");
		doc.setConfidentialityCode(confCode);
		
		return doc;
	}
	
	public static void addPatient(ClinicalDocument doc) {
		RecordTarget target = CDAFactory.eINSTANCE.createRecordTarget();
		PatientRole patientRole =  CDAFactory.eINSTANCE.createPatientRole();
		Patient patient = CDAFactory.eINSTANCE.createPatient();
		doc.getRecordTargets().add(target);
		target.setPatientRole(patientRole);
		patientRole.setPatient(patient);

		II id = DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString());
		patientRole.getIds().add(id);
		
		AD addr = DatatypesFactory.eINSTANCE.createAD();
		ADXP country = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CNT, "US");
		addr.getCountries().add(country);
		patientRole.getAddrs().add(addr);
	}

	public static void addOriginalAuthor(ClinicalDocument doc) {
		ScanOriginalAuthor author = IHEFactory.eINSTANCE.createScanOriginalAuthor().init();
		doc.getAuthors().add(author);
		author.setTime(DatatypesFactory.eINSTANCE.createTS("20070916130000"));
		//assignedAuthor
		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
		author.setAssignedAuthor(assignedAuthor);
		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString()));
		//assignedPerson
		Person person = CDAFactory.eINSTANCE.createPerson();
		assignedAuthor.setAssignedPerson(person);
		PN pn = DatatypesFactory.eINSTANCE.createPN();
		pn.addGiven("John").addFamily("Doe");
		person.getNames().add(pn);
		
		//representedOrganization
		Organization organization = CDAFactory.eINSTANCE.createOrganization();
		assignedAuthor.setRepresentedOrganization(organization);
		II orgId = DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString());
		organization.getIds().add(orgId);
		ON on = DatatypesFactory.eINSTANCE.createON();
		on.addText("Happy Valley Hospital");
		organization.getNames().add(on);
		organization.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL("+1-800-555-1212"));
	}

	public static void addScanningDevice(ClinicalDocument doc) {
		ScanningDevice scanningDevice = IHEFactory.eINSTANCE.createScanningDevice().init();
		doc.getAuthors().add(scanningDevice);
		
		// should produce error when time is != document.effectiveTime
//		scanningDevice.setTime(DatatypesFactory.eINSTANCE.createTS("20070916130000"));
		scanningDevice.setTime(DatatypesFactory.eINSTANCE.createTS("20071204103022-0500"));
		
		//assignedAuthor
		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
		scanningDevice.setAssignedAuthor(assignedAuthor);
		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString()));
		//assignedAuthoringDevice
		AuthoringDevice assignedDevice = CDAFactory.eINSTANCE.createAuthoringDevice();
		assignedAuthor.setAssignedAuthoringDevice(assignedDevice);
		assignedDevice.setManufacturerModelName((SC)DatatypesFactory.eINSTANCE.createSC().addText("Nikon"));
		assignedDevice.setSoftwareName((SC)DatatypesFactory.eINSTANCE.createSC().addText("HewlettPackard"));

		//representedOrganization
		Organization organization = CDAFactory.eINSTANCE.createOrganization();
		assignedAuthor.setRepresentedOrganization(organization);
		II orgId = DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString());
		organization.getIds().add(orgId);
		ON on = DatatypesFactory.eINSTANCE.createON();
		on.addText("Happy Valley Hospital");
		organization.getNames().add(on);
		organization.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL("+1-800-555-1212"));
	}

	public static void addDocumentCustodian(ClinicalDocument doc) {
		Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
		doc.setCustodian(custodian);
		AssignedCustodian assignedCustodian = CDAFactory.eINSTANCE.createAssignedCustodian();
		custodian.setAssignedCustodian(assignedCustodian);
		//representedOrganization
		CustodianOrganization custodianOrganization = CDAFactory.eINSTANCE.createCustodianOrganization();
		assignedCustodian.setRepresentedCustodianOrganization(custodianOrganization);
		II custodianId = DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString());
		custodianOrganization.getIds().add(custodianId);
		ON custodianName = DatatypesFactory.eINSTANCE.createON();
		custodianName.addText("MDHT Test Suite");
		custodianOrganization.setName(custodianName);
		custodianOrganization.setTelecom(DatatypesFactory.eINSTANCE.createTEL("+1-800-555-1212"));

		AD addr = DatatypesFactory.eINSTANCE.createAD();
		ADXP country = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CNT, "US");
		addr.getCountries().add(country);
		custodianOrganization.setAddr(addr);
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
