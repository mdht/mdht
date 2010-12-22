/**
 * Copyright (c) 2010 IBM Corporation
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
package org.openhealthtools.mdht.uml.cda.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StructuredBody;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ClinicalDocumentOperationsTest extends CDAValidationTest {

	/**
	 * The template id to use for the has* tests.
	 */
	protected static final String TEMPLATE_ID = "1.2.3.4";
	protected static final II THE_II = DatatypesFactory.eINSTANCE.createII();

	protected static final String CODE = "code";
	protected static final String CODE_SYSTEM = "codeSystem";
	protected static final String CODE_SYSTEM_NAME = "codeSystemName";
	protected static final String CODE_DISPLAY_NAME = "codeDisplayName";
	protected static final CD THE_CODE = DatatypesFactory.eINSTANCE.createCD(
			CODE, CODE_SYSTEM, CODE_SYSTEM_NAME, CODE_DISPLAY_NAME);

	static {
		THE_II.setRoot(TEMPLATE_ID);
	}

	private static final CDATestCase TEST_CASE_ARRAY[] = {

		// Section
		// -------------------------------------------------------------
		new CDAAddTestCase("Section") {

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {

				final Section section = (Section) getEObjectToAdd();

				ClinicalDocumentOperations.addSection(
						(ClinicalDocument) objectToTest, section);

				assertTrue(ClinicalDocumentOperations.getSections(
						(ClinicalDocument) objectToTest).get(0).equals(
								section));
			}

			@Override
			protected EObject getEObjectToAdd() {
				return CDAFactory.eINSTANCE.createSection();
			}

			@Override
			protected void doAdd(final EObject objectToTest,
					final EObject eObjectToAdd) {
				// Nothing
			}

			@Override
			protected EStructuralFeature getFeature() {
				return null;
			}

		},

		// Section
		// -------------------------------------------------------------
		new CDAGetTestCase("Section") {

			@Override
			protected EObject getEObjectToAdd() {
				return CDAFactory.eINSTANCE.createSection();
			}

			@Override
			protected void doAdd(final EObject objectToTest,
					final EObject eObjectToAdd) {
				((ClinicalDocument) objectToTest)
				.addSection((Section) eObjectToAdd);
			}

			@Override
			protected Object doGet(final EObject objectToTest) {
				return ClinicalDocumentOperations
				.getSections((ClinicalDocument) objectToTest);
			}

			@SuppressWarnings("unchecked")
			@Override
			protected boolean isGetGood(final EObject eObjectToAdd,
					final Object value) {
				return ((EList<Section>) value).get(0).equals(eObjectToAdd);
			}
		},

		// Code
		// -------------------------------------------------------------
		new CDAHasTestCase("Code") {

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {

				final CE code = DatatypesFactory.eINSTANCE.createCE(CODE,
						CODE_SYSTEM);
				code.setCodeSystemName(CODE_SYSTEM_NAME);
				((ClinicalDocument) objectToTest).setCode(code);
				final boolean hasIsGood = doHas(objectToTest, TEMPLATE_ID);
				assertTrue("Has \"" + getTestTargetDescription()
						+ "\" failed for \""
						+ objectToTest.eClass().getName() + "\"",
						hasIsGood);
			}

			@Override
			protected EObject getEObjectToAdd() {
				return null;
			}

			@Override
			protected void doAdd(final EObject objectToTest,
					final EObject eObjectToAdd) {
				// Nothing
			}

			@Override
			protected boolean doHas(final EObject objectToTest,
					final String templateId) {
				return ClinicalDocumentOperations.hasCode(
						(ClinicalDocument) objectToTest, CODE,
						CODE_SYSTEM, CODE_SYSTEM_NAME);
			}

			@Override
			protected void doAddTemplateId(final EObject eObjectToAdd,
					final II theIi) {
				// Nothing
			}
		},

		// TemplateID
		// -------------------------------------------------------------
		new CDAHasTestCase("TemplateID") {

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				((ClinicalDocument) objectToTest).getTemplateIds().add(
						THE_II);
				final boolean hasIsGood = doHas(objectToTest, TEMPLATE_ID);
				assertTrue("Has \"" + getTestTargetDescription()
						+ "\" failed for \""
						+ objectToTest.eClass().getName() + "\"",
						hasIsGood);
			}

			@Override
			protected EObject getEObjectToAdd() {
				return null;
			}

			@Override
			protected void doAdd(final EObject objectToTest,
					final EObject eObjectToAdd) {
				// Nothing
			}

			@Override
			protected boolean doHas(final EObject objectToTest,
					final String templateId) {
				return ClinicalDocumentOperations.hasTemplateId(
						(ClinicalDocument) objectToTest, templateId);
			}

			@Override
			protected void doAddTemplateId(final EObject eObjectToAdd,
					final II theIi) {
				// Nothing
			}
		},

		// SetStructureBody
		// -------------------------------------------------------------
		new CDATestCase("SetStructureBody") {

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				final StructuredBody sb = CDAFactory.eINSTANCE
				.createStructuredBody();
				ClinicalDocumentOperations.setStructuredBody(
						(ClinicalDocument) objectToTest, sb);
				assertTrue(((ClinicalDocument) objectToTest)
						.getComponent().getStructuredBody().equals(sb));
			}
		},

		// GetPatients
		// -------------------------------------------------------------
		new CDATestCase("GetPatients") {

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				assertTrue(ClinicalDocumentOperations.getPatients(
						(ClinicalDocument) objectToTest).isEmpty());
				final Patient patient = CDAFactory.eINSTANCE
				.createPatient();
				ClinicalDocumentOperations.addPatient(
						(ClinicalDocument) objectToTest, patient);
				assertTrue(!ClinicalDocumentOperations.getPatients(
						(ClinicalDocument) objectToTest).isEmpty());
			}
		},

		// GetPatientRoles
		// -------------------------------------------------------------
		new CDATestCase("GetPatientRoles") {

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				assertTrue(ClinicalDocumentOperations.getPatientRoles(
						(ClinicalDocument) objectToTest).isEmpty());
				final PatientRole patientRole = CDAFactory.eINSTANCE
				.createPatientRole();
				ClinicalDocumentOperations.addPatientRole(
						(ClinicalDocument) objectToTest, patientRole);
				assertTrue(!ClinicalDocumentOperations.getPatientRoles(
						(ClinicalDocument) objectToTest).isEmpty());
			}
		},
		// HasSectionTemplate
		// -------------------------------------------------------------
		new CDATestCase("HasSectionTemplate") {

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				assertTrue(!ClinicalDocumentOperations.hasSectionTemplate(
						(ClinicalDocument) objectToTest, TEMPLATE_ID));
			}
		} };

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	@Override
	protected EObject getObjectToTest() {
		return CDAFactory.eINSTANCE.createClinicalDocument();
	}

} // ClinicalDocumentOperationsTest