/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.BoundaryObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Boundary Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation#validateBoundaryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation#validateBoundaryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation#validateBoundaryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation#validateBoundaryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation#validateBoundaryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class BoundaryObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBoundaryObservationTemplateId() {
		OperationsTestCase<BoundaryObservation> validateBoundaryObservationTemplateIdTestCase = new OperationsTestCase<BoundaryObservation>(
			"validateBoundaryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_BOUNDARY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BoundaryObservation target) {

			}

			@Override
			protected void updateToPass(BoundaryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BoundaryObservationOperations.validateBoundaryObservationTemplateId(
					(BoundaryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBoundaryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBoundaryObservationClassCode() {
		OperationsTestCase<BoundaryObservation> validateBoundaryObservationClassCodeTestCase = new OperationsTestCase<BoundaryObservation>(
			"validateBoundaryObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_BOUNDARY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BoundaryObservation target) {

			}

			@Override
			protected void updateToPass(BoundaryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BoundaryObservationOperations.validateBoundaryObservationClassCode(
					(BoundaryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBoundaryObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateBoundaryObservationCode() {
		OperationsTestCase<BoundaryObservation> validateBoundaryObservationCodeTestCase = new OperationsTestCase<BoundaryObservation>(
			"validateBoundaryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_BOUNDARY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BoundaryObservation target) {

			}

			@Override
			protected void updateToPass(BoundaryObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("113036", "1.2.840.10008.2.16.4", "", "");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BoundaryObservationOperations.validateBoundaryObservationCode(
					(BoundaryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBoundaryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBoundaryObservationMoodCode() {
		OperationsTestCase<BoundaryObservation> validateBoundaryObservationMoodCodeTestCase = new OperationsTestCase<BoundaryObservation>(
			"validateBoundaryObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_BOUNDARY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BoundaryObservation target) {

			}

			@Override
			protected void updateToPass(BoundaryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BoundaryObservationOperations.validateBoundaryObservationMoodCode(
					(BoundaryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBoundaryObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateBoundaryObservationValue() {
		OperationsTestCase<BoundaryObservation> validateBoundaryObservationValueTestCase = new OperationsTestCase<BoundaryObservation>(
			"validateBoundaryObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_BOUNDARY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BoundaryObservation target) {
				target.init();

			}

			@Override
			protected void updateToPass(BoundaryObservation target) {
				target.getValues().add(DatatypesFactory.eINSTANCE.createINT());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BoundaryObservationOperations.validateBoundaryObservationValue(
					(BoundaryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBoundaryObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends BoundaryObservationOperations {
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

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<BoundaryObservation> {
		public BoundaryObservation create() {
			return ConsolFactory.eINSTANCE.createBoundaryObservation();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends BoundaryObservationOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // BoundaryObservationOperations
