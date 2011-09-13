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
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.HistoryOfPastIllnessSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Past Illness Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryOfPastIllnessSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionTemplateId() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionTemplateIdTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionTemplateId(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionCode() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionCodeTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionCode(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryOfPastIllnessSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryOfPastIllnessSection> {

		public HistoryOfPastIllnessSection create() {
			return IHEFactory.eINSTANCE.createHistoryOfPastIllnessSection();
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
	private static class ConstructorTestClass extends HistoryOfPastIllnessSectionOperations {
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

} // HistoryOfPastIllnessSectionOperations
