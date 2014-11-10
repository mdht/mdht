/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AgeObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Age Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation#validateAgeObservationValueUnits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Value Units</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation#validateAgeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation#validateAgeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation#validateAgeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation#validateAgeObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation#validateAgeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation#validateAgeObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation#validateAgeObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation#validateAgeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AgeObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAgeObservationValueUnits() {
		OperationsTestCase<AgeObservation> validateAgeObservationValueUnitsTestCase = new OperationsTestCase<AgeObservation>(
			"validateAgeObservationValueUnits",
			operationsForOCL.getOCLValue("VALIDATE_AGE_OBSERVATION_VALUE_UNITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AgeObservation target) {
						// empty
					}
				}

				);

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AgeObservation target) {
						// check against two units
						target.init();
						PQ val1 = DatatypesFactory.eINSTANCE.createPQ();
						PQ val2 = DatatypesFactory.eINSTANCE.createPQ();
						val1.setUnit("Unit 1");
						val2.setUnit("Unit 2");
						target.getValues().add(val1);
						target.getValues().add(val2);
					}
				}

				);

			}

			@Override
			protected void updateToPass(AgeObservation target) {
				target.init();
				PQ val = DatatypesFactory.eINSTANCE.createPQ();
				val.setUnit("meter");
				target.getValues().add(val);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AgeObservationOperations.validateAgeObservationValueUnits(
					(AgeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAgeObservationValueUnitsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAgeObservationTemplateId() {
		OperationsTestCase<AgeObservation> validateAgeObservationTemplateIdTestCase = new OperationsTestCase<AgeObservation>(
			"validateAgeObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_AGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AgeObservation target) {

			}

			@Override
			protected void updateToPass(AgeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AgeObservationOperations.validateAgeObservationTemplateId(
					(AgeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAgeObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAgeObservationClassCode() {
		OperationsTestCase<AgeObservation> validateAgeObservationClassCodeTestCase = new OperationsTestCase<AgeObservation>(
			"validateAgeObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_AGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AgeObservation target) {

			}

			@Override
			protected void updateToPass(AgeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AgeObservationOperations.validateAgeObservationClassCode(
					(AgeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAgeObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAgeObservationMoodCode() {
		OperationsTestCase<AgeObservation> validateAgeObservationMoodCodeTestCase = new OperationsTestCase<AgeObservation>(
			"validateAgeObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_AGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AgeObservation target) {

			}

			@Override
			protected void updateToPass(AgeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AgeObservationOperations.validateAgeObservationMoodCode(
					(AgeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAgeObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAgeObservationCodeP() {
		OperationsTestCase<AgeObservation> validateAgeObservationCodePTestCase = new OperationsTestCase<AgeObservation>(
			"validateAgeObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_AGE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AgeObservation target) {

			}

			@Override
			protected void updateToPass(AgeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AgeObservationOperations.validateAgeObservationCodeP(
					(AgeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAgeObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAgeObservationCode() {
		OperationsTestCase<AgeObservation> validateAgeObservationCodeTestCase = new OperationsTestCase<AgeObservation>(
			"validateAgeObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_AGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AgeObservation target) {

			}

			@Override
			protected void updateToPass(AgeObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCodeSystem("2.16.840.1.113883.6.96");
				cd.setCode("445518008");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AgeObservationOperations.validateAgeObservationCode(
					(AgeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAgeObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAgeObservationStatusCode() {
		OperationsTestCase<AgeObservation> validateAgeObservationStatusCodeTestCase = new OperationsTestCase<AgeObservation>(
			"validateAgeObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_AGE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AgeObservation target) {

			}

			@Override
			protected void updateToPass(AgeObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AgeObservationOperations.validateAgeObservationStatusCode(
					(AgeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAgeObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAgeObservationStatusCodeP() {
		OperationsTestCase<AgeObservation> validateAgeObservationStatusCodePTestCase = new OperationsTestCase<AgeObservation>(
			"validateAgeObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_AGE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AgeObservation target) {

			}

			@Override
			protected void updateToPass(AgeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AgeObservationOperations.validateAgeObservationStatusCodeP(
					(AgeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAgeObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAgeObservationValue() {
		OperationsTestCase<AgeObservation> validateAgeObservationValueTestCase = new OperationsTestCase<AgeObservation>(
			"validateAgeObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_AGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AgeObservation target) {

			}

			@Override
			protected void updateToPass(AgeObservation target) {
				target.init();

				PQ value = DatatypesFactory.eINSTANCE.createPQ();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AgeObservationOperations.validateAgeObservationValue(
					(AgeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAgeObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AgeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AgeObservation> {
		public AgeObservation create() {
			return ConsolFactory.eINSTANCE.createAgeObservation();
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
	private static class ConstructorTestClass extends AgeObservationOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // AgeObservationOperations
