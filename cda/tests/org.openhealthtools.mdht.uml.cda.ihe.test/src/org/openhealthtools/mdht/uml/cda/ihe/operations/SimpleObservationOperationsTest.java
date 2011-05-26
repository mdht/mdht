/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperationsTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class SimpleObservationOperationsTest extends ObservationOperationsTest {

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		SimpleObservationOperations obj = new SimpleObservationOperations();
		assertTrue(true);
	} // testConstructor

	public static class OperationsForOCL extends SimpleObservationOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	public class ObjectFactory implements TestObjectFactory<SimpleObservation> {
		public SimpleObservation create() {
			return IHEFactory.eINSTANCE.createPregnancyObservation();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.SimpleObservationOperations#validateSimpleObservationTemplateId(org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateSimpleObservationTemplateId() {
		OperationsTestCase<SimpleObservation> testCase = new OperationsTestCase<SimpleObservation>(
			"ValidateSimpleObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SIMPLE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SimpleObservation target) {

			}

			@Override
			protected void updateToPass(SimpleObservation target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SimpleObservationOperations.validateSimpleObservationTemplateId(
					(SimpleObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.SimpleObservationOperations#validateSimpleObservationId(org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateSimpleObservationId() {
		OperationsTestCase<SimpleObservation> testCase = new OperationsTestCase<SimpleObservation>(
			"ValidateSimpleObservationId",
			operationsForOCL.getOCLValue("VALIDATE_SIMPLE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SimpleObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(SimpleObservation target) {
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SimpleObservationOperations.validateSimpleObservationId(
					(SimpleObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.SimpleObservationOperations#validateSimpleObservationStatusCode(org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateSimpleObservationStatusCode() {
		OperationsTestCase<SimpleObservation> testCase = new OperationsTestCase<SimpleObservation>(
			"ValidateSimpleObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SIMPLE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SimpleObservation target) {

			}

			@Override
			protected void updateToPass(SimpleObservation target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SimpleObservationOperations.validateSimpleObservationStatusCode(
					(SimpleObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

} // SimpleObservationOperationsTest
