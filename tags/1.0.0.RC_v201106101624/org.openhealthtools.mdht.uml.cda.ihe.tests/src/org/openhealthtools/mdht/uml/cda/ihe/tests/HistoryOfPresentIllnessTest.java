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
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.HistoryOfPresentIllnessOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Present Illness</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness#validateHistoryOfPresentIllnessTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness#validateHistoryOfPresentIllnessCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryOfPresentIllnessTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPresentIllnessTemplateId() {
		OperationsTestCase<HistoryOfPresentIllness> validateHistoryOfPresentIllnessTemplateIdTestCase = new OperationsTestCase<HistoryOfPresentIllness>(
			"validateHistoryOfPresentIllnessTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPresentIllness target) {

			}

			@Override
			protected void updateToPass(HistoryOfPresentIllness target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPresentIllnessOperations.validateHistoryOfPresentIllnessTemplateId(
					(HistoryOfPresentIllness) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPresentIllnessTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPresentIllnessCode() {
		OperationsTestCase<HistoryOfPresentIllness> validateHistoryOfPresentIllnessCodeTestCase = new OperationsTestCase<HistoryOfPresentIllness>(
			"validateHistoryOfPresentIllnessCode",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PRESENT_ILLNESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPresentIllness target) {

			}

			@Override
			protected void updateToPass(HistoryOfPresentIllness target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPresentIllnessOperations.validateHistoryOfPresentIllnessCode(
					(HistoryOfPresentIllness) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPresentIllnessCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryOfPresentIllnessOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryOfPresentIllness> {

		public HistoryOfPresentIllness create() {
			return IHEFactory.eINSTANCE.createHistoryOfPresentIllness();
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
	private static class ConstructorTestClass extends HistoryOfPresentIllnessOperations {
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

} // HistoryOfPresentIllnessOperations
