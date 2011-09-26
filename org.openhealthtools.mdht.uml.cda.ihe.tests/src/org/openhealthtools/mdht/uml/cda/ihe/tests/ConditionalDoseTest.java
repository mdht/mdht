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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.ConditionalDose;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ConditionalDoseOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Conditional Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ConditionalDose#validateConditionalDoseConditionalDosingSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Conditional Dose Conditional Dosing Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ConditionalDose#validateConditionalDoseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Conditional Dose Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ConditionalDoseTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConditionalDoseConditionalDosingSubstanceAdministration() {
		OperationsTestCase<ConditionalDose> validateConditionalDoseConditionalDosingSubstanceAdministrationTestCase = new OperationsTestCase<ConditionalDose>(
			"validateConditionalDoseConditionalDosingSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_CONDITIONAL_DOSE_CONDITIONAL_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionalDose target) {
				target.init();
			}

			@Override
			protected void updateToPass(ConditionalDose target) {
				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(sa);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionalDoseOperations.validateConditionalDoseConditionalDosingSubstanceAdministration(
					(ConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateConditionalDoseConditionalDosingSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionalDoseTemplateId() {
		OperationsTestCase<ConditionalDose> validateConditionalDoseTemplateIdTestCase = new OperationsTestCase<ConditionalDose>(
			"validateConditionalDoseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CONDITIONAL_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionalDose target) {

			}

			@Override
			protected void updateToPass(ConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionalDoseOperations.validateConditionalDoseTemplateId(
					(ConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateConditionalDoseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ConditionalDoseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ConditionalDose> {

		public ConditionalDose create() {
			return IHEFactory.eINSTANCE.createConditionalDose();
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
	private static class ConstructorTestClass extends ConditionalDoseOperations {
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

} // ConditionalDoseOperations
