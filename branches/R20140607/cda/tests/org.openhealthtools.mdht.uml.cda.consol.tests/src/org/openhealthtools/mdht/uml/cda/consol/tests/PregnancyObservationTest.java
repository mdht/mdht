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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PregnancyObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationEstimatedDateOfDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Estimated Date Of Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#getEstimatedDateOfDelivery() <em>Get Estimated Date Of Delivery</em>}</li>
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
	public void testValidatePregnancyObservationTemplateId() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationTemplateIdTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PregnancyObservationOperations.validatePregnancyObservationTemplateId(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationClassCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationClassCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PregnancyObservationOperations.validatePregnancyObservationClassCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationMoodCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationMoodCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PregnancyObservationOperations.validatePregnancyObservationMoodCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
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

				CE cd = DatatypesFactory.eINSTANCE.createCE();
				cd.setCode("ASSERTION");
				cd.setCodeSystem("2.16.840.1.113883.5.4");
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
	* @generated not
	*/
	@Test
	public void testValidatePregnancyObservationCodeP() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationCodePTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationCodeP(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationStatusCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationStatusCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationStatusCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
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
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("77386006");
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
	* @generated NOT
	*/
	@Test
	public void testValidatePregnancyObservationValueP() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationValuePTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

				// must exist as the correct type but the code value is not checked
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationValueP(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationEffectiveTime() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationEffectiveTimeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationEffectiveTime(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePregnancyObservationEstimatedDateOfDelivery() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationEstimatedDateOfDeliveryTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationEstimatedDateOfDelivery",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_ESTIMATED_DATE_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createEstimatedDateOfDelivery().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationEstimatedDateOfDelivery(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationEstimatedDateOfDeliveryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEstimatedDateOfDelivery() {

		PregnancyObservation target = objectFactory.create();
		target.getEstimatedDateOfDelivery();

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
			return ConsolFactory.eINSTANCE.createPregnancyObservation();
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
