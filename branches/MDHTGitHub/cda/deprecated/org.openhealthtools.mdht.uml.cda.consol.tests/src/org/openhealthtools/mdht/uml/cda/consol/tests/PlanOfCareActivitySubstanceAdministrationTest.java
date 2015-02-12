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
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivitySubstanceAdministrationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration#validatePlanOfCareActivitySubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration#validatePlanOfCareActivitySubstanceAdministrationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration#validatePlanOfCareActivitySubstanceAdministrationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration#validatePlanOfCareActivitySubstanceAdministrationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareActivitySubstanceAdministrationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivitySubstanceAdministrationTemplateId() {
		OperationsTestCase<PlanOfCareActivitySubstanceAdministration> validatePlanOfCareActivitySubstanceAdministrationTemplateIdTestCase = new OperationsTestCase<PlanOfCareActivitySubstanceAdministration>(
			"validatePlanOfCareActivitySubstanceAdministrationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivitySubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationTemplateId(
					(PlanOfCareActivitySubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySubstanceAdministrationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivitySubstanceAdministrationClassCode() {
		OperationsTestCase<PlanOfCareActivitySubstanceAdministration> validatePlanOfCareActivitySubstanceAdministrationClassCodeTestCase = new OperationsTestCase<PlanOfCareActivitySubstanceAdministration>(
			"validatePlanOfCareActivitySubstanceAdministrationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// we cannot violate the constraint because it only checks that the class
				// code is non-null and of type ActClass but EMF and Java enforce this
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PlanOfCareActivitySubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationClassCode(
					(PlanOfCareActivitySubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySubstanceAdministrationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivitySubstanceAdministrationMoodCode() {
		OperationsTestCase<PlanOfCareActivitySubstanceAdministration> validatePlanOfCareActivitySubstanceAdministrationMoodCodeTestCase = new OperationsTestCase<PlanOfCareActivitySubstanceAdministration>(
			"validatePlanOfCareActivitySubstanceAdministrationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// we cannot violate the constraint because it only checks that the mood
				// code is non-null and of type x_DocumentSubstanceMood but EMF and Java
				// enforce this
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PlanOfCareActivitySubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySubstanceAdministration target) {
				target.init();
				target.setMoodCode(x_DocumentSubstanceMood.INT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationMoodCode(
					(PlanOfCareActivitySubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySubstanceAdministrationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivitySubstanceAdministrationId() {
		OperationsTestCase<PlanOfCareActivitySubstanceAdministration> validatePlanOfCareActivitySubstanceAdministrationIdTestCase = new OperationsTestCase<PlanOfCareActivitySubstanceAdministration>(
			"validatePlanOfCareActivitySubstanceAdministrationId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivitySubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySubstanceAdministration target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationId(
					(PlanOfCareActivitySubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySubstanceAdministrationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlanOfCareActivitySubstanceAdministrationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfCareActivitySubstanceAdministration> {
		public PlanOfCareActivitySubstanceAdministration create() {
			return ConsolFactory.eINSTANCE.createPlanOfCareActivitySubstanceAdministration();
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
	private static class ConstructorTestClass extends PlanOfCareActivitySubstanceAdministrationOperations {
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

} // PlanOfCareActivitySubstanceAdministrationOperations
