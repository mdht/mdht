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
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivitySupplyOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Supply</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareActivitySupplyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyTemplateId() {
		OperationsTestCase<PlanOfCareActivitySupply> validatePlanOfCareActivitySupplyTemplateIdTestCase = new OperationsTestCase<PlanOfCareActivitySupply>(
			"validatePlanOfCareActivitySupplyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivitySupply target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySupply target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyTemplateId(
					(PlanOfCareActivitySupply) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyClassCode() {
		OperationsTestCase<PlanOfCareActivitySupply> validatePlanOfCareActivitySupplyClassCodeTestCase = new OperationsTestCase<PlanOfCareActivitySupply>(
			"validatePlanOfCareActivitySupplyClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// we cannot violate the constraint because it only checks that the class
				// code is non-null and of type ActClassSupply but EMF and Java enforce this
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PlanOfCareActivitySupply target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySupply target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyClassCode(
					(PlanOfCareActivitySupply) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyMoodCode() {
		OperationsTestCase<PlanOfCareActivitySupply> validatePlanOfCareActivitySupplyMoodCodeTestCase = new OperationsTestCase<PlanOfCareActivitySupply>(
			"validatePlanOfCareActivitySupplyMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// we cannot violate the constraint because it only checks that the mood
				// code is non-null and of type x_DocumentSubstanceMood but EMF and Java
				// enforce this
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PlanOfCareActivitySupply target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySupply target) {
				target.init();
				target.setMoodCode(x_DocumentSubstanceMood.INT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyMoodCode(
					(PlanOfCareActivitySupply) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyId() {
		OperationsTestCase<PlanOfCareActivitySupply> validatePlanOfCareActivitySupplyIdTestCase = new OperationsTestCase<PlanOfCareActivitySupply>(
			"validatePlanOfCareActivitySupplyId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivitySupply target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySupply target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyId(
					(PlanOfCareActivitySupply) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlanOfCareActivitySupplyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfCareActivitySupply> {
		public PlanOfCareActivitySupply create() {
			return ConsolFactory.eINSTANCE.createPlanOfCareActivitySupply();
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
	private static class ConstructorTestClass extends PlanOfCareActivitySupplyOperations {
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

} // PlanOfCareActivitySupplyOperations
