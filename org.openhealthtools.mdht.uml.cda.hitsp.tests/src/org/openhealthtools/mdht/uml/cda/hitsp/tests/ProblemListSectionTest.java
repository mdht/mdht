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
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.ProblemListSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Problem List Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection#validateProblemListSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection#validateProblemListSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection#getConditions() <em>Get Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemListSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemListSectionTemplateId() {
		OperationsTestCase<ProblemListSection> validateProblemListSectionTemplateIdTestCase = new OperationsTestCase<ProblemListSection>(
			"validateProblemListSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemListSection target) {

			}

			@Override
			protected void updateToPass(ProblemListSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemListSectionOperations.validateProblemListSectionTemplateId(
					(ProblemListSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemListSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProblemListSectionCondition() {
		OperationsTestCase<ProblemListSection> validateProblemListSectionConditionTestCase = new OperationsTestCase<ProblemListSection>(
			"validateProblemListSectionCondition",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_LIST_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemListSection target) {

			}

			@Override
			protected void updateToPass(ProblemListSection target) {
				target.init();
				Condition act = HITSPFactory.eINSTANCE.createCondition();
				target.addAct(act);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemListSectionOperations.validateProblemListSectionCondition(
					(ProblemListSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemListSectionConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConditions() {

		ProblemListSection target = objectFactory.create();
		target.getConditions();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ProblemListSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemListSection> {

		public ProblemListSection create() {
			return HITSPFactory.eINSTANCE.createProblemListSection();
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
	private static class ConstructorTestClass extends ProblemListSectionOperations {
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

} // ProblemListSectionOperations
