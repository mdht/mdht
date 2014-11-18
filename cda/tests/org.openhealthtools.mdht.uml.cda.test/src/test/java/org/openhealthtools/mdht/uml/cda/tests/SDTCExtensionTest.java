/*******************************************************************************
 * Copyright (c) 2013/2014 Dan Brown (Drajer/Ai).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     MDHT - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.RelatedSubject;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.Subject;
import org.openhealthtools.mdht.uml.cda.SubjectPerson;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * This class ensures the various SDTC extensions (starting with sdtc:dischargeDispositionCode) 
 * are operating correctly within the base CDA model.
 * General tests:
 * Instance creation, extension snippet and document serialization, 
 * document deserialization/(re)serialization equality (object and sdtc properties)
 * 
 * @author Dan Brown (Ai)
 *
 */
public class SDTCExtensionTest {

	// define fields
	// removed to ensure no side effects with DocumentRoot

	// define/setup constants
	// constants for sdtc:dischargeDispositionCode
	private static final String DDC_CODESYSTEM_VALUE = "2.16.840.1.113883.12.112";

	private static final String DDC_CODESYSTEMNAME_VALUE = "HL7 Discharge Disposition";

	private static final String DDC_CODE_VALUE = "42";

	private static final String ERROR_DDC_NO_DATA = "Error: No CE data was found in the external document for sdtc:dischargeDispositionCode. It is likley an empty element.";

	private static final String ERROR_DDC_NO_CODE = "Error: No code was found in the external document for sdtc:dischargeDispositionCode.";

	private static final String ERROR_DDC_NO_ELEMENT = "Error: No sdtc:dischargeDispositionCode element exists in the external document.";

	// constant for sdtc:deceasedTime
	private static final String DECTIME_TS_VALUE = "1967";

	// constant for sdtc:deceasedInd
	private static final boolean DECIND_BL_VALUE = true;

	// constants for sdtc:id
	private static final String ID_ROOT_VALUE = "root";

	private static final String ID_EXT_VALUE = "extension";

	private static final String ID_AAN_VALUE = "assigningAuthorityName";

	private static final boolean ID_DISP_VALUE = false;

	// constant for sdtc:birthTime
	private static final String BT_TS_VALUE = "19880907";

	// constants for sdtc:raceCode
	private static final String RACE_CODE_VALUE = "1002-5";

	private static final String RACE_CODESYSTEM_VALUE = "2.16.840.1.113883.6.238";

	private static final String RACE_CODESYSTEMNAME_VALUE = "RACE_CODESYSTEMNAME_VALUE";

	private static final String ERROR_RC_NO_DATA = "Error: No CE data was found in the external document for sdtc:raceCode.";

	private static final String ERROR_RC_NO_CODE = "Error: No code was found in the external document for sdtc:raceCode.";

	private static final String ERROR_RC_NO_ELEMENT = "Error: No sdtc:raceCode element exists in the external document. It is likley an empty element.";

	// documents (Mu2Consol) provided for deserialization
	private static final String MU2_DOC_VALID = "resources/CCDA_CCD_b1_Amb_SDTC.xml";

	// setUp/tearDown required fields (as fixtures)
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// removed fields to ensure no side effects with DocumentRoot
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		// removed fields to ensure no side effects with DocumentRoot
	}

	// custom helper methods
	/**
	 * Helper method: Via iteration, locates sdtc:dischargeDispositionCode in a deserialized document and extracts the CE data.
	 * This enables access to code, codeSystem, and codeSystemName, among other things.
	 * ceToReturn is used to capture specific errors as well as passing data if available
	 */
	private CE extractDischargeDispositionCECodes(ClinicalDocument doc) {
		CE ceToReturn = DatatypesFactory.eINSTANCE.createCE();
		ceToReturn.setCode(ERROR_DDC_NO_ELEMENT);
		// start searching the document via Section
		for (Section sec : doc.getSections()) {
			// find Encounter in Section
			for (Encounter enc : sec.getEncounters()) {
				// if codes exist in encounter, return them
				if (!enc.getSDTCDischargeDispositionCodes().isEmpty()) {
					ceToReturn = enc.getSDTCDischargeDispositionCodes().get(0);
					if (ceToReturn.getCode() == null && ceToReturn.getCodeSystemName() == null &&
							ceToReturn.getCodeSystem() == null) {
						ceToReturn.setCode(ERROR_DDC_NO_DATA);
					} else if (ceToReturn.getCode() == null && ceToReturn.getCodeSystemName() != null &&
							ceToReturn.getCodeSystem() != null) {
						ceToReturn.setCode(ERROR_DDC_NO_CODE);
					}
					break;
				}
			}
		}
		return ceToReturn;
	}

	/**
	* Helper method: Locates SubjectPerson in a deserialized document and captures/returns the data.
	*/
	private SubjectPerson findSubjectPerson(ClinicalDocument doc, String curSDTCname) {
		Subject sub = null;

		// collect all organizers first
		List<Organizer> organizers = new ArrayList<Organizer>();
		// start searching the document via Section
		for (Section sec : doc.getSections()) {
			for (Organizer org : sec.getOrganizers()) {
				// found Organizer in Section, capture it
				organizers.add(org);
			}
		}

		// for each organizer, find the first non-null subject
		for (Organizer organizer : organizers) {
			if (organizer.getSubject() != null) {
				sub = organizer.getSubject();
				break;
			}
		}

		if (sub == null) {
			fail("Unable to capture any non-null subject data. Ensure the document contains subject data and try again.");
		}

		// Navigate down multiple levels to subject person
		RelatedSubject relsub = sub.getRelatedSubject();
		SubjectPerson subper = relsub.getSubject();

		if (subper == null) {
			fail("Unable to find/capture any non-null data. Ensure " + curSDTCname + " data exists in the document.");
		}

		return subper;
	}

	/**
	* Helper method: Locates (with findSubjectPerson()) sdtc:deceasedInd in a deserialized document and extracts the BL data.
	*/
	private BL extractDeceasedIndBLData(ClinicalDocument doc) {
		// find the BL data
		SubjectPerson subper = findSubjectPerson(doc, "sdtc:deceasedInd");
		// capture and return the BL data
		BL blToReturn = subper.getSDTCDeceasedInd();
		return blToReturn;
	}

	/**
	* Helper method: Locates (with findSubjectPerson()) sdtc:deceasedTime in a deserialized document and extracts the TS data.
	*/
	private TS extractDeceasedTimeTSData(ClinicalDocument doc) {
		// find the TS data
		SubjectPerson subper = findSubjectPerson(doc, "sdtc:deceasedTime");
		// capture and return the TS data
		TS tsToReturn = subper.getSDTCDeceasedTime();
		return tsToReturn;
	}

	/**
	* Helper method: Locates (with findSubjectPerson()) sdtc:id in a deserialized document and extracts the II List data.
	*/
	private EList<II> extractIdIIData(ClinicalDocument doc) {
		// find the II data
		SubjectPerson subper = findSubjectPerson(doc, "sdtc:id");
		// capture the II list data
		EList<II> iiListToReturn = subper.getSDTCIds();

		assertFalse(
			"sdtc II data could not be collected. Ensure there is an sdtc:id element within the document and try the test again.",
			iiListToReturn.isEmpty());

		return iiListToReturn;
	}

	// custom helper methods
	/**
	 * Helper method: Locates sdtc:raceCode in a deserialized document and extracts the CE data.
	 */
	private CE extractRaceCodeCECodes(ClinicalDocument doc) {
		CE ceToReturn = DatatypesFactory.eINSTANCE.createCE();
		ceToReturn.setCode(ERROR_RC_NO_ELEMENT);
		// start searching the document via RecordTarget
		for (RecordTarget rectar : doc.getRecordTargets()) {
			if (rectar.getPatientRole() != null) {
				// Extract PatientRole from RecordTarget
				PatientRole patrole = rectar.getPatientRole();
				// Extract Patient from PatientRole
				if (patrole.getPatient() != null) {
					Patient pat = patrole.getPatient();
					// if codes exist in patient, return them
					if (!pat.getSDTCRaceCodes().isEmpty()) {
						ceToReturn = pat.getSDTCRaceCodes().get(0);
						if (ceToReturn.getCode() == null && ceToReturn.getCodeSystemName() == null &&
								ceToReturn.getCodeSystem() == null) {
							ceToReturn.setCode(ERROR_RC_NO_DATA);
						} else if (ceToReturn.getCode() == null && ceToReturn.getCodeSystemName() != null &&
								ceToReturn.getCodeSystem() != null) {
							ceToReturn.setCode(ERROR_RC_NO_CODE);
						}
						break;
					}
				}
			}
		}
		return ceToReturn;
	}

	/**
	* Helper method: Locates sdtc:birthTime in a deserialized document and extracts the TS data.
	*/
	private TS extractBirthTimeTSData(ClinicalDocument doc) {
		TS tsToReturn = null;

		for (Author auth : doc.getAuthors()) {
			if (auth.getAssignedAuthor() != null) {
				AssignedAuthor aAuth = auth.getAssignedAuthor();
				if (aAuth.getAssignedPerson() != null) {
					Person aPers = aAuth.getAssignedPerson();
					if (aPers.getSDTCBirthTime() != null) {
						tsToReturn = aPers.getSDTCBirthTime();
						break;
					}
				}
			}
		}

		if (tsToReturn == null) {
			fail("Unable to find/capture any non-null data. Ensure sdtc:birthTime data exists in the document.");
		}

		return tsToReturn;
	}

	/**
	 * Helper method: Populate encounter with specified CE (sdtc) codes.
	 */
	private void populateEncounter(CE code, Encounter enc, String codeValue, String codeSystemValue,
			String codeSystemNameValue) {
		// populate
		code.setCode(codeValue); // Required to be defined, but not to any specific String
		code.setCodeSystem(codeSystemValue); // the actual constraint checked which must be accurate (and is)
		code.setCodeSystemName(codeSystemNameValue); // not required (not checked as a constraint)
		// add an sdtc element to the Encounter element
		enc.getSDTCDischargeDispositionCodes().add(code);
	}

	/**
	 * Helper method: Serialize snippet to the console.
	 * If the method cannot be executed without error, a failing value is returned.
	 */
	private boolean serializeDischargeDispositionCodeSnippet(Encounter enc, String msg) {
		try {
			System.out.println(msg);
			CDAUtil.saveSnippet(EcoreUtil.copy(enc), System.out); // works with or without copy, but copy is safer
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Helper method: Serialize an entire document to the console.
	 * If the method cannot be executed without error, a failing value is returned.
	 */
	private boolean serializeDocument(ClinicalDocument doc, String msg) {
		try {
			System.out.println(msg);
			CDAUtil.save(doc, System.out);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Helper method: Deserialize a specific external XML document file and return it
	 */
	private ClinicalDocument deserializeExternalDocument(ClinicalDocument doc, String curFile) {
		// deserialize external document
		try {
			doc = CDAUtil.load((new FileInputStream(curFile))); // Mu2 Doc
			System.out.println("\n\n...Running Deserialization");
			// copy input value to store for comparison later
			// docUnchanged = doc; //why not just do this after catches? what's the difference?
		} catch (FileNotFoundException eFileNotFound) {
			eFileNotFound.printStackTrace();
			fail("XML document not Found. Cannot complete test.");
		} catch (Exception eGeneral) {
			eGeneral.printStackTrace();
			fail("Failed to load XML document. Cannot complete test.");
		}
		return doc;
	}

	// test methods
	/**
	 * Ensures a generated snippet instance with sdtc:dischargeDispositionCode can be properly serialized.
	 */
	@Test
	public void testDischargeDispositionCodeSerializationOfSnippet() {
		CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
		Encounter encounter = CDAFactory.eINSTANCE.createEncounter();

		populateEncounter(sdtcCode, encounter, "42", DDC_CODESYSTEM_VALUE, "HL7 Discharge Disposition Snippet Only");

		// private class method to serialize to the console and return success/failure boolean
		if (!serializeDischargeDispositionCodeSnippet(
			encounter, "\n\n---testDischargeDispositionCodeSerialization extension snippet serialization---")) {
			fail("Unable to save/serialize sdtc:dischargeDispositionCode as a snippet.");
		}

		// check after serialization that sdtc specific properties are the same
		assertEquals("The code has changed after serialization.", "42", sdtcCode.getCode()); // String, expected, actual
		assertEquals("The codeSystem has changed after serialization.", DDC_CODESYSTEM_VALUE, sdtcCode.getCodeSystem());
		assertEquals(
			"The codeSystemName has changed after serialization.", "HL7 Discharge Disposition Snippet Only",
			sdtcCode.getCodeSystemName());
	}

	/**
	 * Ensures a generated document instance with sdtc:dischargeDispositionCode can be properly serialized.
	 */
	@Test
	public void testDischargeDispositionCodeSerializationOfGeneratedDoc() {
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
		Encounter encounter = CDAFactory.eINSTANCE.createEncounter();
		Section section = CDAFactory.eINSTANCE.createSection();

		populateEncounter(
			sdtcCode, encounter, "18", DDC_CODESYSTEM_VALUE, "HL7 Discharge Disposition Generated Document");

		section.addEncounter(encounter);
		clinicalDocument.addSection(section);

		if (!serializeDocument(
			clinicalDocument,
			"\n\n---testDischargeDispositionCodeSerializationOfGeneratedDoc extension document serialization---")) {
			fail("Unable to save/serialize sdtc:dischargeDispositionCode within a generated document.");
		}

		// check after serialization that sdtc specific properties are the same
		assertEquals(
			"The code has changed after serialization.", "18",
			encounter.getSDTCDischargeDispositionCodes().get(0).getCode()); // String, expected, actual // sdtcCode.getCode()
		assertEquals(
			"The codeSystem has changed after serialization.", DDC_CODESYSTEM_VALUE,
			encounter.getSDTCDischargeDispositionCodes().get(0).getCodeSystem()); // sdtcCode.getCodeSystem()
		assertEquals(
			"The codeSystemName has changed after serialization.", "HL7 Discharge Disposition Generated Document",
			encounter.getSDTCDischargeDispositionCodes().get(0).getCodeSystemName()); // sdtcCode.getCodeSystemName()
	}

	/**
	 * Ensures a generated document instance with sdtc:deceasedInd can be properly serialized.
	 */
	@Test
	public void testDeceasedIndSerializationOfGeneratedDoc() {
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();
		Organizer organizer = CDAFactory.eINSTANCE.createOrganizer();
		Subject subject = CDAFactory.eINSTANCE.createSubject();
		RelatedSubject relsub = CDAFactory.eINSTANCE.createRelatedSubject();
		SubjectPerson subper = CDAFactory.eINSTANCE.createSubjectPerson();

		BL indBL = DatatypesFactory.eINSTANCE.createBL();
		indBL.setValue(!DECIND_BL_VALUE);
		subper.setSDTCDeceasedInd(indBL);

		relsub.setSubject(subper);
		subject.setRelatedSubject(relsub);
		organizer.setSubject(subject);
		section.addOrganizer(organizer);
		clinicalDocument.addSection(section);

		if (!serializeDocument(
			clinicalDocument, "\n\n---testDeceasedIndSerializationOfGeneratedDoc extension document serialization---")) {
			fail("Unable to save/serialize sdtc:deceasedInd within a generated document.");
		}

		// check after serialization that sdtc specific properties are the same
		assertEquals(
			"The BL value has changed after serialization.", !DECIND_BL_VALUE, subper.getSDTCDeceasedInd().getValue());
	}

	/**
	 * Ensures a generated document instance with sdtc:deceasedTime can be properly serialized.
	 */
	@Test
	public void testDeceasedTimeSerializationOfGeneratedDoc() {
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();
		Organizer organizer = CDAFactory.eINSTANCE.createOrganizer();
		Subject subject = CDAFactory.eINSTANCE.createSubject();
		RelatedSubject relsub = CDAFactory.eINSTANCE.createRelatedSubject();
		SubjectPerson subper = CDAFactory.eINSTANCE.createSubjectPerson();

		TS timeTS = DatatypesFactory.eINSTANCE.createTS();
		timeTS.setValue("2013");
		subper.setSDTCDeceasedTime(timeTS);

		relsub.setSubject(subper);
		subject.setRelatedSubject(relsub);
		organizer.setSubject(subject);
		section.addOrganizer(organizer);
		clinicalDocument.addSection(section);

		if (!serializeDocument(
			clinicalDocument, "\n\n---testDeceasedTimeSerializationOfGeneratedDoc extension document serialization---")) {
			fail("Unable to save/serialize sdtc:deceasedTime within a generated document.");
		}

		// check after serialization that sdtc specific properties are the same
		assertEquals("The TS value has changed after serialization.", "2013", subper.getSDTCDeceasedTime().getValue());
	}

	/**
	 * Ensures a generated document instance with sdtc:id can be properly serialized.
	 */
	@Test
	public void testIdSerializationOfGeneratedDoc() {
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();
		Organizer organizer = CDAFactory.eINSTANCE.createOrganizer();
		Subject subject = CDAFactory.eINSTANCE.createSubject();
		RelatedSubject relsub = CDAFactory.eINSTANCE.createRelatedSubject();
		SubjectPerson subper = CDAFactory.eINSTANCE.createSubjectPerson();

		II idII = DatatypesFactory.eINSTANCE.createII();
		idII.setAssigningAuthorityName(ID_AAN_VALUE + " Generated Document");
		idII.setDisplayable(true);
		idII.setExtension(ID_EXT_VALUE);
		idII.setRoot(ID_ROOT_VALUE);
		subper.getSDTCIds().add(idII);

		relsub.setSubject(subper);
		subject.setRelatedSubject(relsub);
		organizer.setSubject(subject);
		section.addOrganizer(organizer);
		clinicalDocument.addSection(section);

		if (!serializeDocument(
			clinicalDocument, "\n\n---testIdSerializationOfGeneratedDoc extension document serialization---")) {
			fail("Unable to save/serialize sdtc:id within a generated document.");
		}

		// check after serialization that sdtc specific properties are the same
		assertEquals("The root has changed after serialization.", ID_ROOT_VALUE, subper.getSDTCIds().get(0).getRoot()); // String, expected, actual
		assertEquals(
			"The extension has changed after serialization.", ID_EXT_VALUE, subper.getSDTCIds().get(0).getExtension());
		assertEquals("The assigningAuthorityName has changed after serialization.", ID_AAN_VALUE +
				" Generated Document", subper.getSDTCIds().get(0).getAssigningAuthorityName());
		assertEquals(
			"The displayable attribute has changed after serialization.", true,
			subper.getSDTCIds().get(0).getDisplayable());
	}

	/**
	 * Ensures a generated document instance with sdtc:birthTime can be properly serialized.
	 */
	@Test
	public void testBirthTimeSerializationOfGeneratedDoc() {
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();

		Observation obs = CDAFactory.eINSTANCE.createObservation();
		Author auth = CDAFactory.eINSTANCE.createAuthor();
		AssignedAuthor asAuth = CDAFactory.eINSTANCE.createAssignedAuthor();
		Person asPerson = CDAFactory.eINSTANCE.createPerson();

		TS birthTS = DatatypesFactory.eINSTANCE.createTS();
		birthTS.setValue("19820607");
		asPerson.setSDTCBirthTime(birthTS);
		asAuth.setAssignedPerson(asPerson);
		auth.setAssignedAuthor(asAuth);
		obs.getAuthors().add(auth);
		section.addObservation(obs);
		clinicalDocument.addSection(section);

		if (!serializeDocument(
			clinicalDocument, "\n\n---testBirthTimeSerializationOfGeneratedDoc extension document serialization---")) {
			fail("Unable to save/serialize sdtc:birthTime within a generated document.");
		}

		// check after serialization that sdtc specific properties are the same
		assertEquals(
			"The TS value has changed after serialization.", "19820607", asPerson.getSDTCBirthTime().getValue());
	}

	/**
	 * Ensures a generated document instance with sdtc:birthTime can be properly serialized.
	 */
	@Test
	public void testRaceCodeSerializationOfGeneratedDoc() {
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		CE raceCE = DatatypesFactory.eINSTANCE.createCE();
		Patient patient = CDAFactory.eINSTANCE.createPatient();

		raceCE.setCode("sdtc:raceCode code");
		raceCE.setCodeSystem("5.4.3.2.1");
		raceCE.setCodeSystemName("sdtc:raceCode codeSystemName");
		patient.getSDTCRaceCodes().add(raceCE);
		clinicalDocument.addPatient(patient);

		if (!serializeDocument(
			clinicalDocument, "\n\n---testRaceCodeSerializationOfGeneratedDoc extension document serialization---")) {
			fail("Unable to save/serialize sdtc:raceCode within a generated document.");
		}

		// check after serialization that sdtc specific properties are the same
		assertEquals(
			"The code has changed after serialization.", "sdtc:raceCode code",
			patient.getSDTCRaceCodes().get(0).getCode()); // String, expected, actual
		assertEquals(
			"The codeSystem has changed after serialization.", "5.4.3.2.1",
			patient.getSDTCRaceCodes().get(0).getCodeSystem());
		assertEquals(
			"The codeSystemName has changed after serialization.", "sdtc:raceCode codeSystemName",
			patient.getSDTCRaceCodes().get(0).getCodeSystemName());
	}

	/**
	 * Ensures a generated document instance with sdtc:signatureText can be properly serialized.
	 */
	@Test
	public void testSignatureTextSerializationOfGeneratedDoc() {
		final String sigTextText = "omSJUEdmde9j44zmMiromSJUEdmde9j44zmMirdMDSsWdIJdksIJR3373jeu83";
		ClinicalDocument doc = CDAFactory.eINSTANCE.createClinicalDocument();
		ED sigText = DatatypesFactory.eINSTANCE.createED(sigTextText);
		LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
		la.setSDTCSignatureText(sigText);
		doc.setLegalAuthenticator(la);

		if (!serializeDocument(
			doc, "\n\n---testSignatureTestSerializationOfGeneratedDoc extension document serialization---")) {
			fail("Unable to save/serialize sdtc:signatureText within a generated document.");
		}

		// check after serialization that sdtc specific properties are the same
		assertEquals("The text has changed after serialization.", sigTextText, la.getSDTCSignatureText().getText()); // msg, expected, actual
	}

	/**
	 * Deserializes an external XML document and (re)serializes it to check for general and specific equality.
	 * Breaks down the deserialized document to retrieve and compare included data with expected results.
	 * The tests are specific to the sdtc:DischargeDispositionCode extension.
	 */
	@Test
	public void testDischargeDispositionCodeDeserialization() {
		ClinicalDocument clinicalDocument = null;
		ClinicalDocument clinicalDocumentUnchanged = null;

		// deserialize
		clinicalDocument = deserializeExternalDocument(clinicalDocument, MU2_DOC_VALID);
		// copy input value to store for comparison later // maybe do this a better (more accurate way)
		clinicalDocumentUnchanged = clinicalDocument;
		// clinicalDocumentUnchanged = EcoreUtil.copy(clinicalDocument); //more precise, less coverage

		// locate sdtc:dischargeDispositionCode in deserialized document and extract data to sdtcCode
		CE sdtcCode = extractDischargeDispositionCECodes(clinicalDocument);

		// begin tests:
		assertFalse(ERROR_DDC_NO_DATA, sdtcCode.getCode().equals(ERROR_DDC_NO_DATA)); // string message, boolean condition
		assertFalse(ERROR_DDC_NO_CODE, sdtcCode.getCode().equals(ERROR_DDC_NO_CODE));
		assertFalse(ERROR_DDC_NO_ELEMENT, sdtcCode.getCode().equals(ERROR_DDC_NO_ELEMENT));
		assertNotNull(sdtcCode);
		// check that a deserialized version of the document contains the same sdtc specific properties as the original external document text
		assertEquals(
			"The code in the deserialized document is not the same as the code in the original external document (or is null/did not exist in the external document).",
			DDC_CODE_VALUE, sdtcCode.getCode()); // String, expected, actual
		assertEquals(
			"The codeSystem in the deserialized document is not the same as the codeSystem in the original external document (or is null/did not exist in the external document).",
			DDC_CODESYSTEM_VALUE, sdtcCode.getCodeSystem());
		assertEquals(
			"The codeSystemName in the deserialized document is not the same as the codeSystemName in the original external document (or is null/did not exist in the external document).",
			DDC_CODESYSTEMNAME_VALUE, sdtcCode.getCodeSystemName());

		// reserialize
		if (!serializeDocument(
			clinicalDocument, "\n\n---testDischargeDispositionCodeDeserialization Reserialized Document---")) {
			fail("Unable to reserialize sdtc:dischargeDispositionCode within a document.");
		}

		// ensure (through assertion tests) trivial equality to the copy of the original deserialized instance
		assertNotNull(clinicalDocument);
		assertNotNull(clinicalDocumentUnchanged);
		// general test, if the memory address is the same, then it theoretically has not been edited
		assertEquals(clinicalDocument, clinicalDocumentUnchanged);
		// more specific (and limited) but only used with EcoreUtil.copy(clinicalDocument);
		// assertEquals(clinicalDocument.getTitle().getText(), clinicalDocument.getTitle().getText());

		// locate sdtc:dischargeDispositionCode in copy of original deserialized document and extract data to sdtcCodeUnchanged
		CE sdtcCodeUnchanged = extractDischargeDispositionCECodes(clinicalDocumentUnchanged);

		assertNotNull(sdtcCodeUnchanged);
		// ensure exact (and specific to sdtcDischargeDisposition) equality by comparing sdtc CE results to each other.
		// The comparison is between the previously stored copy of the original deserialized document and the current reserialized document
		assertEquals("The code has changed after de/reserialization.", sdtcCode.getCode(), sdtcCodeUnchanged.getCode()); // String, expected, actual
		assertEquals(
			"The codeSystem has changed after de/rerialization.", sdtcCode.getCodeSystem(),
			sdtcCodeUnchanged.getCodeSystem());
		assertEquals(
			"The codeSystemName has changed after de/reserialization.", sdtcCode.getCodeSystemName(),
			sdtcCodeUnchanged.getCodeSystemName());
	}

	/**
	 * Deserializes an external XML document and (re)serializes it to check for general and specific equality.
	 * Breaks down the deserialized document to retrieve and compare included data with expected results.
	 * The tests are specific to the sdtc:DeceasedInd extension. 
	 */
	@Test
	public void testDeceasedIndDeserialization() {
		ClinicalDocument clinicalDocument = null;
		ClinicalDocument clinicalDocumentUnchanged = null;

		// deserialize
		clinicalDocument = deserializeExternalDocument(clinicalDocument, MU2_DOC_VALID);
		// copy input value to store for comparison later
		clinicalDocumentUnchanged = clinicalDocument;

		// locate sdtc:deceasedInd in deserialized document and extract boolean data
		BL indBL = extractDeceasedIndBLData(clinicalDocument);

		// begin tests:
		assertNotNull(indBL);
		// check that a deserialized version of the document contains the same sdtc specific properties as the original external document text
		assertEquals(
			"The boolean value in the deserialized document is not the same as the boolean value in the original external document (or is null/did not exist in the external document).",
			DECIND_BL_VALUE, indBL.getValue()); // String, expected, actual

		// reserialize
		if (!serializeDocument(clinicalDocument, "\n\n---testDeceasedIndDeserialization Reserialized Document---")) {
			fail("Unable to reserialize sdtc:deceasedInd within a document.");
		}

		// ensure (through assertion tests) trivial equality to the copy of the original deserialized instance
		assertNotNull(clinicalDocument);
		assertNotNull(clinicalDocumentUnchanged);
		assertEquals(clinicalDocument, clinicalDocumentUnchanged);

		// locate sdtc:deceasedInd in copy of original deserialized document and extract data to indBLUnchanged
		BL indBLUnchanged = extractDeceasedIndBLData(clinicalDocumentUnchanged);

		assertNotNull(indBLUnchanged);
		// ensure exact (and specific to sdtc:deceasedInd) equality by comparing sdtc BL results to each other.
		// The comparison is between the previously stored copy of the original deserialized document and the current reserialized document
		assertEquals("The BL value has changed after de/reserialization.", indBL.getValue(), indBLUnchanged.getValue()); // String, expected, actual

	}

	/**
	 * Deserializes an external XML document and (re)serializes it to check for general and specific equality.
	 * Breaks down the deserialized document to retrieve and compare included data with expected results.
	 * The tests are specific to the sdtc:deceasedTime extension. 
	 */
	@Test
	public void testDeceasedTimeDeserialization() {
		ClinicalDocument clinicalDocument = null;
		ClinicalDocument clinicalDocumentUnchanged = null;

		// deserialize
		clinicalDocument = deserializeExternalDocument(clinicalDocument, MU2_DOC_VALID);
		// copy input value to store for comparison later
		clinicalDocumentUnchanged = clinicalDocument;

		// locate sdtc:deceasedTime in deserialized document and extract TS data
		TS timeTS = extractDeceasedTimeTSData(clinicalDocument);

		// begin tests:
		assertNotNull(timeTS);
		// check that a deserialized version of the document contains the same sdtc specific properties as the original external document text
		assertEquals(
			"The TS value in the deserialized document is not the same as the TS value in the original external document (or is null/did not exist in the external document).",
			DECTIME_TS_VALUE, timeTS.getValue()); // String, expected, actual

		// reserialize
		if (!serializeDocument(clinicalDocument, "\n\n---testDeceasedTimeDeserialization Reserialized Document---")) {
			fail("Unable to reserialize sdtc:deceasedTime within a document.");
		}

		// ensure (through assertion tests) trivial equality to the copy of the original deserialized instance
		assertNotNull(clinicalDocument);
		assertNotNull(clinicalDocumentUnchanged);
		assertEquals(clinicalDocument, clinicalDocumentUnchanged);

		// locate sdtc:deceasedTime in copy of original deserialized document and extract data to timeTSUnchanged
		TS timeTSUnchanged = this.extractDeceasedTimeTSData(clinicalDocumentUnchanged);

		assertNotNull(timeTSUnchanged);
		// ensure exact (and specific to sdtc:deceasedTime) equality by comparing sdtc TS results to each other.
		// The comparison is between the previously stored copy of the original deserialized document and the current reserialized document
		assertEquals(
			"The TS value has changed after de/reserialization.", timeTS.getValue(), timeTSUnchanged.getValue()); // String, expected, actual

	}

	/**
	 * Deserializes an external XML document and (re)serializes it to check for general and specific equality.
	 * Breaks down the deserialized document to retrieve and compare included data with expected results.
	 * The tests are specific to the sdtc:id extension.
	 */
	@Test
	public void testIdDeserialization() {
		ClinicalDocument clinicalDocument = null;
		ClinicalDocument clinicalDocumentUnchanged = null;

		// deserialize
		clinicalDocument = deserializeExternalDocument(clinicalDocument, MU2_DOC_VALID);
		// copy input value to store for comparison later
		clinicalDocumentUnchanged = clinicalDocument;

		// locate sdtc:id in deserialized document and extract data to idII
		EList<II> idII = extractIdIIData(clinicalDocument);

		// begin tests:
		assertNotNull(idII);
		// check that a deserialized version of the document contains the same sdtc specific properties as the original external document text
		assertEquals(
			"The root in the deserialized document is not the same as the root in the original external document (or is null/did not exist in the external document).",
			ID_ROOT_VALUE, idII.get(0).getRoot()); // String, expected, actual
		assertEquals(
			"The extension in the deserialized document is not the same as the extension in the original external document (or is null/did not exist in the external document).",
			ID_EXT_VALUE, idII.get(0).getExtension());
		assertEquals(
			"The assigningAuthorityName in the deserialized document is not the same as the assigningAuthorityName in the original external document (or is null/did not exist in the external document).",
			ID_AAN_VALUE, idII.get(0).getAssigningAuthorityName());
		assertEquals(
			"The displayable attribute in the deserialized document is not the same as the displayable attribute in the original external document (or is null/did not exist in the external document).",
			ID_DISP_VALUE, idII.get(0).getDisplayable());

		// reserialize
		if (!serializeDocument(clinicalDocument, "\n\n---testIdDeserialization Reserialized Document---")) {
			fail("Unable to reserialize sdtc:id within a document.");
		}

		// ensure (through assertion tests) trivial equality to the copy of the original deserialized instance
		assertNotNull(clinicalDocument);
		assertNotNull(clinicalDocumentUnchanged);
		// general test, if the memory address is the same, then it theoretically has not been edited
		assertEquals(clinicalDocument, clinicalDocumentUnchanged);

		// locate sdtc:id in copy of original deserialized document and extract data to idIIUnchanged
		EList<II> idIIUnchanged = extractIdIIData(clinicalDocumentUnchanged);

		assertNotNull(idIIUnchanged);
		// ensure exact (and specific to sdtc:id) equality by comparing sdtc II results to each other.
		// The comparison is between the previously stored copy of the original deserialized document and the current reserialized document
		assertEquals(
			"The root has changed after de/reserialization.", idII.get(0).getRoot(), idIIUnchanged.get(0).getRoot()); // String, expected, actual
		assertEquals(
			"The extension has changed after de/rerialization.", idII.get(0).getExtension(),
			idIIUnchanged.get(0).getExtension());
		assertEquals(
			"The assigningAuthorityName has changed after de/reserialization.",
			idII.get(0).getAssigningAuthorityName(), idIIUnchanged.get(0).getAssigningAuthorityName());
		assertEquals(
			"The displayable attribute has changed after de/reserialization.", idII.get(0).getDisplayable(),
			idIIUnchanged.get(0).getDisplayable());
	}

	/**
	 * Deserializes an external XML document and (re)serializes it to check for general and specific equality.
	 * Breaks down the deserialized document to retrieve and compare included data with expected results.
	 * The tests are specific to the sdtc:birthTime extension. 
	 */
	@Test
	public void testBirthTimeDeserialization() {
		ClinicalDocument clinicalDocument = null;
		ClinicalDocument clinicalDocumentUnchanged = null;

		// deserialize
		clinicalDocument = deserializeExternalDocument(clinicalDocument, MU2_DOC_VALID);
		// copy input value to store for comparison later
		clinicalDocumentUnchanged = clinicalDocument;

		// locate sdtc:deceasedTime in deserialized document and extract TS data
		TS birthTS = extractBirthTimeTSData(clinicalDocument);

		// begin tests:
		assertNotNull(birthTS);
		// check that a deserialized version of the document contains the same sdtc specific properties as the original external document text
		assertEquals(
			"The TS value in the deserialized document is not the same as the TS value in the original external document (or is null/did not exist in the external document).",
			BT_TS_VALUE, birthTS.getValue()); // String, expected, actual

		// reserialize
		if (!serializeDocument(clinicalDocument, "\n\n---testBirthTimeDeserialization Reserialized Document---")) {
			fail("Unable to reserialize sdtc:birthTime within a document.");
		}

		// ensure (through assertion tests) trivial equality to the copy of the original deserialized instance
		assertNotNull(clinicalDocument);
		assertNotNull(clinicalDocumentUnchanged);
		assertEquals(clinicalDocument, clinicalDocumentUnchanged);

		// locate sdtc:birthTime in copy of original deserialized document and extract data to birthTSUnchanged
		TS birthTSUnchanged = extractBirthTimeTSData(clinicalDocumentUnchanged);

		assertNotNull(birthTSUnchanged);
		// ensure exact (and specific to sdtc:birthTime) equality by comparing sdtc TS results to each other.
		// The comparison is between the previously stored copy of the original deserialized document and the current reserialized document
		assertEquals(
			"The TS value has changed after de/reserialization.", birthTS.getValue(), birthTSUnchanged.getValue()); // String, expected, actual
	}

	/**
	 * Deserializes an external XML document and (re)serializes it to check for general and specific equality.
	 * Breaks down the deserialized document to retrieve and compare included data with expected results.
	 * The tests are specific to the sdtc:raceCode extension.
	 */
	@Test
	public void testRaceCodeDeserialization() {
		ClinicalDocument clinicalDocument = null;
		ClinicalDocument clinicalDocumentUnchanged = null;

		// deserialize
		clinicalDocument = deserializeExternalDocument(clinicalDocument, MU2_DOC_VALID);
		// copy input value to store for comparison later // maybe do this a better (more accurate way)
		clinicalDocumentUnchanged = clinicalDocument;

		// locate sdtc:raceCode in deserialized document and extract data to raceCE
		CE raceCE = extractRaceCodeCECodes(clinicalDocument);

		// begin tests:
		assertFalse(ERROR_RC_NO_DATA, raceCE.getCode().equals(ERROR_RC_NO_DATA)); // string message, boolean condition
		assertFalse(ERROR_RC_NO_CODE, raceCE.getCode().equals(ERROR_RC_NO_CODE));
		assertFalse(ERROR_RC_NO_ELEMENT, raceCE.getCode().equals(ERROR_RC_NO_ELEMENT));
		assertNotNull(raceCE);
		// check that a deserialized version of the document contains the same sdtc specific properties as the original external document text
		assertEquals(
			"The code in the deserialized document is not the same as the code in the original external document (or is null/did not exist in the external document).",
			RACE_CODE_VALUE, raceCE.getCode()); // String, expected, actual
		assertEquals(
			"The codeSystem in the deserialized document is not the same as the codeSystem in the original external document (or is null/did not exist in the external document).",
			RACE_CODESYSTEM_VALUE, raceCE.getCodeSystem());
		assertEquals(
			"The codeSystemName in the deserialized document is not the same as the codeSystemName in the original external document (or is null/did not exist in the external document).",
			RACE_CODESYSTEMNAME_VALUE, raceCE.getCodeSystemName());

		// reserialize
		if (!serializeDocument(
			clinicalDocument, "\n\n---testDischargeDispositionCodeDeserialization Reserialized Document---")) {
			fail("Unable to reserialize sdtc:dischargeDispositionCode within a document.");
		}

		// ensure (through assertion tests) trivial equality to the copy of the original deserialized instance
		assertNotNull(clinicalDocument);
		assertNotNull(clinicalDocumentUnchanged);
		assertEquals(clinicalDocument, clinicalDocumentUnchanged);

		// locate sdtc:raceCode in copy of original deserialized document and extract data to raceCEUnchanged
		CE raceCEUnchanged = extractRaceCodeCECodes(clinicalDocumentUnchanged);

		assertNotNull(raceCEUnchanged);
		// ensure exact (and specific to sdtc:raceCode) equality by comparing sdtc CE results to each other.
		// The comparison is between the previously stored copy of the original deserialized document and the current reserialized document
		assertEquals("The code has changed after de/reserialization.", raceCE.getCode(), raceCEUnchanged.getCode()); // String, expected, actual
		assertEquals(
			"The codeSystem has changed after de/rerialization.", raceCE.getCodeSystem(),
			raceCEUnchanged.getCodeSystem());
		assertEquals(
			"The codeSystemName has changed after de/reserialization.", raceCE.getCodeSystemName(),
			raceCEUnchanged.getCodeSystemName());
	}

}
