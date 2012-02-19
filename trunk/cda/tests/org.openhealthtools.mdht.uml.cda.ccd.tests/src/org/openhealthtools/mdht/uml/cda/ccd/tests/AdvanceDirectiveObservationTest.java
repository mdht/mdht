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
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectiveObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Advance Directive Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Adv Directive Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Adv Directive Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveVerification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Verification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationAdvanceDirectiveReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Advance Directive Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#getAdvanceDirectiveStatusObservation() <em>Get Advance Directive Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationAdvDirectiveCodeValueSet() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationAdvDirectiveCodeValueSetTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCodeSystem("2.16.840.1.113883.6.96");
				target.setCode(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationAdvDirectiveCodeValueSet(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationAdvDirectiveCodeValueSetTestCase.doValidationTest();
	}

	/**
	* 
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystemTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADV_DIRECTIVE_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCodeSystem("2.16.840.1.113883.6.96");
				cd.setCode("304251008");
				target.setCode(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystem(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationAdvDirectiveCodeCodeSystemTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationTemplateId() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationTemplateId(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationClassCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationClassCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationClassCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationMoodCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationMoodCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationMoodCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationId() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationId(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationStatusCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationStatusCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationStatusCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationEffectiveTime() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationEffectiveTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationEffectiveTime(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationAdvanceDirectiveVerification() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationAdvanceDirectiveVerificationTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationAdvanceDirectiveVerification",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_VERIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getParticipants().add(CCDFactory.eINSTANCE.createAdvanceDirectiveVerification().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationAdvanceDirectiveVerification(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationAdvanceDirectiveVerificationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservationTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();
				target.addObservation(CCDFactory.eINSTANCE.createAdvanceDirectiveStatusObservation());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservation(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationAdvanceDirectiveStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationAdvanceDirectiveReference() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationAdvanceDirectiveReferenceTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationAdvanceDirectiveReference",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getReferences().add(CCDFactory.eINSTANCE.createAdvanceDirectiveReference().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationAdvanceDirectiveReference(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationAdvanceDirectiveReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectiveStatusObservation() {

		AdvanceDirectiveObservation target = objectFactory.create();
		target.getAdvanceDirectiveStatusObservation();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends AdvanceDirectiveObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveObservation> {
		public AdvanceDirectiveObservation create() {
			return CCDFactory.eINSTANCE.createAdvanceDirectiveObservation();
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
	private static class ConstructorTestClass extends AdvanceDirectiveObservationOperations {
	}

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

} // AdvanceDirectiveObservationOperations
