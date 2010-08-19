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
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class PatientAwarenessOperationsTest extends CCDValidationTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.1.48";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDValidationTest(TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PatientAwarenessOperations
				.validatePatientAwarenessTemplateId(
						(PatientAwareness) objectToTest, diagnostician,
						map);
			}

		}

	}; // TEST_CASE_ARRAY

	private static final String AWARENESS_CODE = "whatever";

	private static final String AWARENESS_CODE_CODE_SYSTEM = "whatever2";

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
		return CCDFactory.eINSTANCE.createPatientAwareness();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createPatientAwareness().init();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.PatientAwarenessOperations#validatePatientAwarenessTypeCode(org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidatePatientAwarenessTypeCode() {
		final PatientAwareness pa = (PatientAwareness) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(pa);
		assertTrue(!PatientAwarenessOperations
				.validatePatientAwarenessTypeCode(pa, diagnostician, map));

		pa.setTypeCode(ParticipationType.ADM);
		assertTrue(!PatientAwarenessOperations
				.validatePatientAwarenessTypeCode(pa, diagnostician, map));

		pa.setTypeCode(ParticipationType.SBJ);
		assertTrue(PatientAwarenessOperations.validatePatientAwarenessTypeCode(
				pa, diagnostician, map));
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.PatientAwarenessOperations#validatePatientAwarenessTypeCode(org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidatePatientAwarenessAwarenessCode() {
		final PatientAwareness pa = (PatientAwareness) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(pa);
		assertTrue(!PatientAwarenessOperations
				.validatePatientAwarenessAwarenessCode(pa, diagnostician, map));

		final CE awarenessCode = DatatypesFactory.eINSTANCE.createCE(
				AWARENESS_CODE, AWARENESS_CODE_CODE_SYSTEM);
		pa.setAwarenessCode(awarenessCode);
		assertTrue(PatientAwarenessOperations
				.validatePatientAwarenessAwarenessCode(pa, diagnostician, map));
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.PatientAwarenessOperations#validatePatientAwarenessParticipantRoleId(org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidatePatientAwarenessParticipantRoleId() {
		final PatientAwareness pa = (PatientAwareness) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(pa);
		assertTrue(!PatientAwarenessOperations
				.validatePatientAwarenessParticipantRoleId(pa, diagnostician,
						map));

		final ParticipantRole participantRole = CDAFactory.eINSTANCE
		.createParticipantRole();

		final II roleId = DatatypesFactory.eINSTANCE.createII("root",
		"extension");

		participantRole.getIds().add(roleId);
		pa.setParticipantRole(participantRole);
		assertTrue(PatientAwarenessOperations
				.validatePatientAwarenessParticipantRoleId(pa, diagnostician,
						map));
	}
} // PatientAwarenessOperationsTest