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
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivityProcedureOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure#validatePlanOfCareActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure#validatePlanOfCareActivityProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure#validatePlanOfCareActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure#validatePlanOfCareActivityProcedureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareActivityProcedureTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityProcedureTemplateId() {
		OperationsTestCase<PlanOfCareActivityProcedure> validatePlanOfCareActivityProcedureTemplateIdTestCase = new OperationsTestCase<PlanOfCareActivityProcedure>(
			"validatePlanOfCareActivityProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityProcedure target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityProcedureOperations.validatePlanOfCareActivityProcedureTemplateId(
					(PlanOfCareActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivityProcedureClassCode() {
		OperationsTestCase<PlanOfCareActivityProcedure> validatePlanOfCareActivityProcedureClassCodeTestCase = new OperationsTestCase<PlanOfCareActivityProcedure>(
			"validatePlanOfCareActivityProcedureClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// we cannot violate the constraint because it only checks that the class
				// code is non-null and of type ActClass but EMF and Java enforce this
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PlanOfCareActivityProcedure target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityProcedureOperations.validatePlanOfCareActivityProcedureClassCode(
					(PlanOfCareActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityProcedureClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivityProcedureMoodCode() {
		OperationsTestCase<PlanOfCareActivityProcedure> validatePlanOfCareActivityProcedureMoodCodeTestCase = new OperationsTestCase<PlanOfCareActivityProcedure>(
			"validatePlanOfCareActivityProcedureMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// we cannot violate the constraint because it only checks that the mood
				// code is non-null and of type x_DocumentProcedureMood but EMF and Java
				// enforce this
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PlanOfCareActivityProcedure target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityProcedure target) {
				target.init();
				target.setMoodCode(x_DocumentProcedureMood.INT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityProcedureOperations.validatePlanOfCareActivityProcedureMoodCode(
					(PlanOfCareActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityProcedureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivityProcedureId() {
		OperationsTestCase<PlanOfCareActivityProcedure> validatePlanOfCareActivityProcedureIdTestCase = new OperationsTestCase<PlanOfCareActivityProcedure>(
			"validatePlanOfCareActivityProcedureId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityProcedure target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityProcedure target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityProcedureOperations.validatePlanOfCareActivityProcedureId(
					(PlanOfCareActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityProcedureIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlanOfCareActivityProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfCareActivityProcedure> {
		public PlanOfCareActivityProcedure create() {
			return ConsolFactory.eINSTANCE.createPlanOfCareActivityProcedure();
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
	private static class ConstructorTestClass extends PlanOfCareActivityProcedureOperations {
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

} // PlanOfCareActivityProcedureOperations
