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
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationTemplateId() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationTemplateIdTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationTemplateId(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationClassCode() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationClassCodeTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationClassCode(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationMoodCode() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationMoodCodeTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationMoodCode(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyStatusObservationCode() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationCodeTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationCode(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationStatusCode() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationStatusCodeTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationStatusCode(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT 
	*/
	@Test
	public void testValidateAllergyStatusObservationValue() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationValueTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

				CE value = DatatypesFactory.eINSTANCE.createCE();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("55561003");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationValue(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyStatusObservation> {
		public AllergyStatusObservation create() {
			return ConsolFactory.eINSTANCE.createAllergyStatusObservation();
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
	private static class ConstructorTestClass extends AllergyStatusObservationOperations {
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

} // AllergyStatusObservationOperations
