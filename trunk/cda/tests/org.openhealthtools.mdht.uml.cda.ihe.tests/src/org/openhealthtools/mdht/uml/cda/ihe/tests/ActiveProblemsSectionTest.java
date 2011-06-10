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
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ActiveProblemsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Active Problems Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection#validateActiveProblemsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Active Problems Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection#validateActiveProblemsSectionProblemConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Active Problems Section Problem Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection#getProblemConcernEntries() <em>Get Problem Concern Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ActiveProblemsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateActiveProblemsSectionTemplateId() {
		OperationsTestCase<ActiveProblemsSection> validateActiveProblemsSectionTemplateIdTestCase = new OperationsTestCase<ActiveProblemsSection>(
			"validateActiveProblemsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ActiveProblemsSection target) {

			}

			@Override
			protected void updateToPass(ActiveProblemsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ActiveProblemsSectionOperations.validateActiveProblemsSectionTemplateId(
					(ActiveProblemsSection) objectToTest, diagnostician, map);
			}

		};

		validateActiveProblemsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateActiveProblemsSectionProblemConcernEntry() {
		OperationsTestCase<ActiveProblemsSection> validateActiveProblemsSectionProblemConcernEntryTestCase = new OperationsTestCase<ActiveProblemsSection>(
			"validateActiveProblemsSectionProblemConcernEntry",
			operationsForOCL.getOCLValue("VALIDATE_ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ActiveProblemsSection target) {

			}

			@Override
			protected void updateToPass(ActiveProblemsSection target) {
				target.init();
				target.addAct(IHEFactory.eINSTANCE.createProblemConcernEntry().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ActiveProblemsSectionOperations.validateActiveProblemsSectionProblemConcernEntry(
					(ActiveProblemsSection) objectToTest, diagnostician, map);
			}

		};

		validateActiveProblemsSectionProblemConcernEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemConcernEntries() {

		ActiveProblemsSection target = objectFactory.create();
		target.getProblemConcernEntries();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ActiveProblemsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ActiveProblemsSection> {

		public ActiveProblemsSection create() {
			return IHEFactory.eINSTANCE.createActiveProblemsSection();
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
	private static class ConstructorTestClass extends ActiveProblemsSectionOperations {
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

} // ActiveProblemsSectionOperations
