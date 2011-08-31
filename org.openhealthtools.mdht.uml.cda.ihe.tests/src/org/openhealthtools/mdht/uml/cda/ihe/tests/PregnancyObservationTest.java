/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PregnancyObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validateSimpleObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Simple Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PregnancyObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePregnancyObservationInterpretationCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationInterpretationCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				target.getInterpretationCodes().add(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationInterpretationCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePregnancyObservationMethodCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationMethodCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				target.getMethodCodes().add(ce);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationMethodCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePregnancyObservationRepeatNumber() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationRepeatNumberTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				IVL_INT rn = DatatypesFactory.eINSTANCE.createIVL_INT();
				;
				target.setRepeatNumber(rn);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationRepeatNumber(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePregnancyObservationTargetSiteCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationTargetSiteCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.getTargetSiteCodes().add(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationTargetSiteCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationValue() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationValueTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationValue(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSimpleObservationTemplateId() {
		OperationsTestCase<PregnancyObservation> validateSimpleObservationTemplateIdTestCase = new OperationsTestCase<PregnancyObservation>(
			"validateSimpleObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SIMPLE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validateSimpleObservationTemplateId(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSimpleObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PregnancyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PregnancyObservation> {

		public PregnancyObservation create() {
			return IHEFactory.eINSTANCE.createPregnancyObservation();
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
	private static class ConstructorTestClass extends PregnancyObservationOperations {
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

} // PregnancyObservationOperations
