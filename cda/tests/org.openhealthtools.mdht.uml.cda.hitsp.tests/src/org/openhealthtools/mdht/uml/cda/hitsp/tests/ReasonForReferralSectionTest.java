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
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.ReasonForReferralSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Reason For Referral Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection#validateHITSPReasonForReferralSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Reason For Referral Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection#validateHITSPReasonForReferralSectionResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Reason For Referral Section Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection#getConditions() <em>Get Conditions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection#getResults() <em>Get Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection#validateCodedReasonForReferralSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReasonForReferralSectionTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPReasonForReferralSectionCondition() {
		OperationsTestCase<ReasonForReferralSection> validateHITSPReasonForReferralSectionConditionTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateHITSPReasonForReferralSectionCondition",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();
				Condition condition = HITSPFactory.eINSTANCE.createCondition().init();
				target.addAct(condition);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateHITSPReasonForReferralSectionCondition(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPReasonForReferralSectionConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPReasonForReferralSectionResult() {
		OperationsTestCase<ReasonForReferralSection> validateHITSPReasonForReferralSectionResultTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateHITSPReasonForReferralSectionResult",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

				Result result = HITSPFactory.eINSTANCE.createResult().init();

				target.addObservation(result);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateHITSPReasonForReferralSectionResult(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPReasonForReferralSectionResultTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConditions() {

		ReasonForReferralSection target = objectFactory.create();
		target.getConditions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResults() {

		ReasonForReferralSection target = objectFactory.create();
		target.getResults();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedReasonForReferralSectionTemplateId() {
		OperationsTestCase<ReasonForReferralSection> validateCodedReasonForReferralSectionTemplateIdTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateCodedReasonForReferralSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateCodedReasonForReferralSectionTemplateId(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedReasonForReferralSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ReasonForReferralSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReasonForReferralSection> {

		public ReasonForReferralSection create() {
			return HITSPFactory.eINSTANCE.createReasonForReferralSection();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends ReasonForReferralSectionOperations {
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // ReasonForReferralSectionOperations
