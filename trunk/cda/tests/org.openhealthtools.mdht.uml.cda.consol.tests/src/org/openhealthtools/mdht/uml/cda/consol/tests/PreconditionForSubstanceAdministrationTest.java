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
import org.openhealthtools.mdht.uml.cda.Criterion;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.operations.PreconditionForSubstanceAdministrationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Precondition For Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationCriterionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationCriterionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationCriterionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationCriterion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PreconditionForSubstanceAdministrationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationCriterionCode() {
		OperationsTestCase<PreconditionForSubstanceAdministration> validatePreconditionForSubstanceAdministrationCriterionCodeTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration>(
			"validatePreconditionForSubstanceAdministrationCriterionCode",
			operationsForOCL.getOCLValue("VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration target) {
				target.init();
				Criterion criterion = CDAFactory.eINSTANCE.createCriterion();
				target.setCriterion(criterion);
			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration target) {

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.getCriterion().setCode(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationCriterionCode(
					(PreconditionForSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationCriterionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationCriterionText() {
		OperationsTestCase<PreconditionForSubstanceAdministration> validatePreconditionForSubstanceAdministrationCriterionTextTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration>(
			"validatePreconditionForSubstanceAdministrationCriterionText",
			operationsForOCL.getOCLValue("VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration target) {

				target.init();
				Criterion criterion = CDAFactory.eINSTANCE.createCriterion();
				target.setCriterion(criterion);
			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration target) {
				ED text = DatatypesFactory.eINSTANCE.createED();
				target.getCriterion().setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationCriterionText(
					(PreconditionForSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationCriterionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationCriterionValue() {
		OperationsTestCase<PreconditionForSubstanceAdministration> validatePreconditionForSubstanceAdministrationCriterionValueTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration>(
			"validatePreconditionForSubstanceAdministrationCriterionValue",
			operationsForOCL.getOCLValue("VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration target) {
				target.init();
				Criterion criterion = CDAFactory.eINSTANCE.createCriterion();
				target.setCriterion(criterion);

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration target) {

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getCriterion().setValue(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationCriterionValue(
					(PreconditionForSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationCriterionValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationTemplateId() {
		OperationsTestCase<PreconditionForSubstanceAdministration> validatePreconditionForSubstanceAdministrationTemplateIdTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration>(
			"validatePreconditionForSubstanceAdministrationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationTemplateId(
					(PreconditionForSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationCriterion() {
		OperationsTestCase<PreconditionForSubstanceAdministration> validatePreconditionForSubstanceAdministrationCriterionTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration>(
			"validatePreconditionForSubstanceAdministrationCriterion",
			operationsForOCL.getOCLValue("VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration target) {
				target.init();
				target.setCriterion(CDAFactory.eINSTANCE.createCriterion());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationCriterion(
					(PreconditionForSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationCriterionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PreconditionForSubstanceAdministrationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PreconditionForSubstanceAdministration> {
		public PreconditionForSubstanceAdministration create() {
			return ConsolFactory.eINSTANCE.createPreconditionForSubstanceAdministration();
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
	private static class ConstructorTestClass extends PreconditionForSubstanceAdministrationOperations {
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

} // PreconditionForSubstanceAdministrationOperations
