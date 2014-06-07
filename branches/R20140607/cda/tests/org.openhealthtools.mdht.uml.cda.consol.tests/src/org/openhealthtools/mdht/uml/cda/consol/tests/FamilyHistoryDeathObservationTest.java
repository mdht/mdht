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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryDeathObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Death Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryDeathObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationTemplateId() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationTemplateIdTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationTemplateId(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationClassCode() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationClassCodeTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationClassCode(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationMoodCode() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationMoodCodeTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationMoodCode(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationCode() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationCodeTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCodeSystem("2.16.840.1.113883.5.4");
				cd.setCode("ASSERTION");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationCode(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationStatusCode() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationStatusCodeTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationStatusCode(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationValue() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationValueTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("419099009");
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationValue(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationValueP() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationValuePTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

				// must exist as the correct type but the code value is not checked
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationValueP(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryDeathObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryDeathObservation> {
		public FamilyHistoryDeathObservation create() {
			return ConsolFactory.eINSTANCE.createFamilyHistoryDeathObservation();
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
	private static class ConstructorTestClass extends FamilyHistoryDeathObservationOperations {
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

} // FamilyHistoryDeathObservationOperations
