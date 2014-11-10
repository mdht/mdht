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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentAndPlanSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment And Plan Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionPlanOfCareActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Plan Of Care Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#getPlanOfCareActivityActs() <em>Get Plan Of Care Activity Acts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentAndPlanSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionTemplateId() {
		OperationsTestCase<AssessmentAndPlanSection> validateAssessmentAndPlanSectionTemplateIdTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateAssessmentAndPlanSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionTemplateId(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionCode() {
		OperationsTestCase<AssessmentAndPlanSection> validateAssessmentAndPlanSectionCodeTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateAssessmentAndPlanSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionCode(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionCodeP() {
		OperationsTestCase<AssessmentAndPlanSection> validateAssessmentAndPlanSectionCodePTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateAssessmentAndPlanSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionCodeP(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionText() {
		OperationsTestCase<AssessmentAndPlanSection> validateAssessmentAndPlanSectionTextTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateAssessmentAndPlanSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionText(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionPlanOfCareActivityAct() {
		OperationsTestCase<AssessmentAndPlanSection> validateAssessmentAndPlanSectionPlanOfCareActivityActTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateAssessmentAndPlanSectionPlanOfCareActivityAct",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createPlanOfCareActivityAct().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionPlanOfCareActivityAct(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionPlanOfCareActivityActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivityActs() {

		AssessmentAndPlanSection target = objectFactory.create();
		target.getPlanOfCareActivityActs();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssessmentAndPlanSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssessmentAndPlanSection> {
		public AssessmentAndPlanSection create() {
			return ConsolFactory.eINSTANCE.createAssessmentAndPlanSection();
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
	private static class ConstructorTestClass extends AssessmentAndPlanSectionOperations {
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

} // AssessmentAndPlanSectionOperations
