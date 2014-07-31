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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivityActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct#validatePlanOfCareActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct#validatePlanOfCareActivityActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct#validatePlanOfCareActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct#validatePlanOfCareActivityActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareActivityActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityActTemplateId() {
		OperationsTestCase<PlanOfCareActivityAct> validatePlanOfCareActivityActTemplateIdTestCase = new OperationsTestCase<PlanOfCareActivityAct>(
			"validatePlanOfCareActivityActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityAct target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityActOperations.validatePlanOfCareActivityActTemplateId(
					(PlanOfCareActivityAct) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityActClassCode() {
		OperationsTestCase<PlanOfCareActivityAct> validatePlanOfCareActivityActClassCodeTestCase = new OperationsTestCase<PlanOfCareActivityAct>(
			"validatePlanOfCareActivityActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityAct target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityActOperations.validatePlanOfCareActivityActClassCode(
					(PlanOfCareActivityAct) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivityActMoodCode() {
		OperationsTestCase<PlanOfCareActivityAct> validatePlanOfCareActivityActMoodCodeTestCase = new OperationsTestCase<PlanOfCareActivityAct>(
			"validatePlanOfCareActivityActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// we cannot violate the constraint because it only checks that the mood
				// code is non-null and of type x_DocumentActMood but EMF and Java enforce
				// this
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PlanOfCareActivityAct target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityAct target) {
				target.init();
				target.setMoodCode(x_DocumentActMood.INT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityActOperations.validatePlanOfCareActivityActMoodCode(
					(PlanOfCareActivityAct) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivityActId() {
		OperationsTestCase<PlanOfCareActivityAct> validatePlanOfCareActivityActIdTestCase = new OperationsTestCase<PlanOfCareActivityAct>(
			"validatePlanOfCareActivityActId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityAct target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityAct target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityActOperations.validatePlanOfCareActivityActId(
					(PlanOfCareActivityAct) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlanOfCareActivityActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfCareActivityAct> {
		public PlanOfCareActivityAct create() {
			return ConsolFactory.eINSTANCE.createPlanOfCareActivityAct();
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
	private static class ConstructorTestClass extends PlanOfCareActivityActOperations {
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

} // PlanOfCareActivityActOperations
