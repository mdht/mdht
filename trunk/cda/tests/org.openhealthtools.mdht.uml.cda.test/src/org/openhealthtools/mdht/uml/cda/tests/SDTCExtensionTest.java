/*******************************************************************************
 * Copyright (c) 2013 Dan Brown (Drajer).
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.ValidationResult;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * This class ensures the various SDTC extensions (starting with sdtc:dischargeDispositionCode) 
 * are operating correctly within the base CDA model.
 * General tests:
 * Instance creation, extension snippet and document serialization, 
 * document deserialization/(re)serialization equality (object and sdtc properties), 
 * schema and EMF based validation (positive and negative enforcement)
 * 
 * @author Dan Brown (Drajer)
 *
 */
public class SDTCExtensionTest {

	// define fields
	private ClinicalDocument clinicalDocument, clinicalDocumentUnchanged;

	private Section section;

	private Encounter encounter;

	private CE sdtcCode, sdtcCodeUnchanged;

	// define/setup constants
	// constant codeSystem for sdtc:dischargeDispositionCode
	private static final String DDC_CODESYSTEM_VALUE = "2.16.840.1.113883.12.112";

	// documents (Mu2Consol) provided for deserialization
	private static final String MU2_DOC_VALID = "resources/CCDA_CCD_b1_Amb_SDTC_DisDisCode.xml";

	private static final String MU2_DOC_INVALID = "resources/CCDA_CCD_b1_Amb_SDTC_DisDisCodeWrongNS.xml";

	// setUp/tearDown required fields (as fixtures)
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		clinicalDocument = clinicalDocumentUnchanged = CDAFactory.eINSTANCE.createClinicalDocument();
		section = CDAFactory.eINSTANCE.createSection();
		encounter = CDAFactory.eINSTANCE.createEncounter();
		sdtcCode = sdtcCodeUnchanged = DatatypesFactory.eINSTANCE.createCE();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		clinicalDocument = clinicalDocumentUnchanged = null;
		encounter = null;
		sdtcCode = sdtcCodeUnchanged = null;
		section = null;
	}

	// custom helper methods
	/**
	 * Helper method: Via iteration, locates sdtc:dischargeDispositionCode in a deserialized document and extracts the CE data.
	 * This enables access to code, codeSystem, and codeSystemName, among other things.
	 */
	private CE extractDischargeDispositionCECodes(ClinicalDocument doc) {
		CE ceToReturn = null;
		for (Section sec : doc.getSections()) {
			// start searching the document via Section
			for (Encounter enc : sec.getEncounters()) {
				// found Encounter in Section
				for (CE ce : enc.getSDTCDischargeDispositionCodes()) {
					// found a CE in Encounter
					// capture the data (this can be multiple items) for testing
					ceToReturn = ce;
				}
			}
		}
		return ceToReturn;
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
	 * Helper method: Deserialize a specific ClinicalDocument and store the validation results.
	 * If the method cannot be executed without error, a failing value is returned.
	 */
	private boolean deserializeWithResults(ClinicalDocument doc, String fileName, ValidationResult valResult) {
		try {
			doc = CDAUtil.load(new FileInputStream(fileName), valResult);
		} catch (FileNotFoundException eFileNotFound) {
			eFileNotFound.printStackTrace();
			return false;
		} catch (Exception eGeneral) {
			eGeneral.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Helper method: Serialize snippet to the console.
	 * If the method cannot be executed without error, a failing value is returned.
	 */
	private boolean serializeDischargeDispositionCode(Encounter enc, String msg) {
		try {
			System.out.println(msg);
			CDAUtil.saveSnippet(enc, System.out);
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
	private boolean serializeDischargeDispositionCode(ClinicalDocument doc, String msg) {
		try {
			System.out.println(msg);
			CDAUtil.save(doc, System.out);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// test methods
	/**
	 * Ensures a generated snippet instance with sdtc:dischargeDispositionCode can be properly serialized.
	 */
	@Test
	public void testDischargeDispositionCodeSerializationOfSnippet() {
		populateEncounter(sdtcCode, encounter, "42", DDC_CODESYSTEM_VALUE, "HL7 Discharge Disposition Snippet Only");

		// private class method to serialize to the console and return success/failure boolean
		if (!serializeDischargeDispositionCode(
			encounter, "\n\n---testDischargeDispositionCodeSerialization extension snippet serialization---"))
			fail("Unable to save/serialize sdtc:dischargeDispositionCode as a snippet.");

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
		populateEncounter(sdtcCode, encounter, "18", DDC_CODESYSTEM_VALUE, "HL7 Discharge Disposition Entire Document");

		section.addEncounter(encounter);
		clinicalDocument.addSection(section);

		if (!serializeDischargeDispositionCode(
			clinicalDocument,
			"\n\n---testDischargeDispositionCodeSerializationOfGeneratedDoc extension document serialization---"))
			fail("Unable to save/serialize sdtc:dischargeDispositionCode within a document.");

		// check after serialization that sdtc specific properties are the same
		assertEquals("The code has changed after serialization.", "18", sdtcCode.getCode()); // String, expected, actual
		assertEquals("The codeSystem has changed after serialization.", DDC_CODESYSTEM_VALUE, sdtcCode.getCodeSystem());
		assertEquals(
			"The codeSystemName has changed after serialization.", "HL7 Discharge Disposition Entire Document",
			sdtcCode.getCodeSystemName());
	}

	/**
	 * Deserializes an external XML document and (re)serializes it to check for general and specific equality.
	 * Breaks down the deserialized document to retrieve and compare included data with expected results. 
	 */
	@Test
	public void testDischargeDispositionCodeDeserialization() {
		// deserialize external document
		try {
			clinicalDocument = CDAUtil.load((new FileInputStream(MU2_DOC_VALID))); // Mu2 Doc
			System.out.println("\n\n...Running Deserialization");
			// copy input value to store for comparison later
			clinicalDocumentUnchanged = clinicalDocument;
		} catch (FileNotFoundException eFileNotFound) {
			eFileNotFound.printStackTrace();
			fail("XML document not Found. Cannot complete test.");
		} catch (Exception eGeneral) {
			eGeneral.printStackTrace();
			fail("Failed to load XML document. Cannot complete test.");
		}

		// run custom helper method to locate sdtc:dischargeDispositionCode in deserialized document and extract data to sdtcCode field
		sdtcCode = extractDischargeDispositionCECodes(clinicalDocument);

		// begin tests: first asserNotNull provided to end test early if it fails since all other tests rely on it
		assertNotNull(sdtcCode);
		// check that a deserialized version of the document contains the same sdtc specific properties as the original external document text
		assertEquals(
			"The code in the deserialized document is not the same as the code in the original external document.",
			"42", sdtcCode.getCode()); // String, expected, actual
		assertEquals(
			"The codeSystem in the deserialized document is not the same as the codeSystem in the original external document.",
			DDC_CODESYSTEM_VALUE, sdtcCode.getCodeSystem());
		assertEquals(
			"The codeSystemName in the deserialized document is not the same as the codeSystemName in the original external document.",
			"HL7 Discharge Disposition", sdtcCode.getCodeSystemName());

		// reserialize
		if (!serializeDischargeDispositionCode(
			clinicalDocument, "\n\n---testDischargeDispositionCodeDeserialization Reserialized Document---"))
			fail("Unable to reserialize sdtc:dischargeDispositionCode within a document.");

		// ensure (through assertion tests) trivial equality to the copy of the original deserialized instance
		assertNotNull(clinicalDocument);
		assertNotNull(clinicalDocumentUnchanged);
		assertEquals(clinicalDocument, clinicalDocumentUnchanged);

		// locate sdtc:dischargeDispositionCode in copy of original deserialized document and extract data to sdtcCodeUnchanged field
		sdtcCodeUnchanged = extractDischargeDispositionCECodes(clinicalDocumentUnchanged);

		assertNotNull(sdtcCodeUnchanged);
		// ensure exact (and specific to sdtcDischargeDisposition) equality by comparing sdtc CE results to each other.
		// The comparison is between the previously stored copy of the orignial deserialized document and the current reserialized document
		assertEquals("The code has changed after de/reserialization.", sdtcCode.getCode(), sdtcCodeUnchanged.getCode()); // String, expected, actual
		assertEquals(
			"The codeSystem has changed after de/rerialization.", sdtcCode.getCodeSystem(),
			sdtcCodeUnchanged.getCodeSystem());
		assertEquals(
			"The codeSystemName has changed after de/reserialization.", sdtcCode.getCodeSystemName(),
			sdtcCodeUnchanged.getCodeSystemName());
	}
}
