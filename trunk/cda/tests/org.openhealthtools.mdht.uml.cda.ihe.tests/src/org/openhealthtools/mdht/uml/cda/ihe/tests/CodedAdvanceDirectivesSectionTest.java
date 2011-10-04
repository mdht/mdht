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
import org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedAdvanceDirectivesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Advance Directives Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection#validateCodedAdvanceDirectivesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Advance Directives Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection#validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Advance Directives Section Advance Directives Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection#getAdvanceDirectivesObservations() <em>Get Advance Directives Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CodedAdvanceDirectivesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedAdvanceDirectivesSectionTemplateId() {
		OperationsTestCase<CodedAdvanceDirectivesSection> validateCodedAdvanceDirectivesSectionTemplateIdTestCase = new OperationsTestCase<CodedAdvanceDirectivesSection>(
			"validateCodedAdvanceDirectivesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedAdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(CodedAdvanceDirectivesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedAdvanceDirectivesSectionOperations.validateCodedAdvanceDirectivesSectionTemplateId(
					(CodedAdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedAdvanceDirectivesSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCodedAdvanceDirectivesSectionAdvanceDirectivesObservation() {
		OperationsTestCase<CodedAdvanceDirectivesSection> validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservationTestCase = new OperationsTestCase<CodedAdvanceDirectivesSection>(
			"validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservation",
			operationsForOCL.getOCLValue("VALIDATE_CODED_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedAdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(CodedAdvanceDirectivesSection target) {
				target.init();
				target.addObservation(IHEFactory.eINSTANCE.createAdvanceDirectiveObservation());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedAdvanceDirectivesSectionOperations.validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservation(
					(CodedAdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedAdvanceDirectivesSectionAdvanceDirectivesObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectivesObservations() {

		CodedAdvanceDirectivesSection target = objectFactory.create();
		target.getAdvanceDirectivesObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CodedAdvanceDirectivesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CodedAdvanceDirectivesSection> {

		public CodedAdvanceDirectivesSection create() {
			return IHEFactory.eINSTANCE.createCodedAdvanceDirectivesSection();
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
	private static class ConstructorTestClass extends CodedAdvanceDirectivesSectionOperations {
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

} // CodedAdvanceDirectivesSectionOperations
