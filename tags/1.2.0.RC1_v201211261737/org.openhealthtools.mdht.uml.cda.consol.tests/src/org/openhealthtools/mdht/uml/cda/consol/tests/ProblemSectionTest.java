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
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionProblemConcern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Problem Concern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#getConsolProblemConcerns() <em>Get Consol Problem Concerns</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionCodeP() {
		OperationsTestCase<ProblemSection> validateProblemSectionCodePTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionCodeP(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionCode() {
		OperationsTestCase<ProblemSection> validateProblemSectionCodeTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionCode(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionText() {
		OperationsTestCase<ProblemSection> validateProblemSectionTextTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionText(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionTitle() {
		OperationsTestCase<ProblemSection> validateProblemSectionTitleTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionTitle(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemSectionProblemConcern() {
		OperationsTestCase<ProblemSection> validateProblemSectionProblemConcernTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionProblemConcern",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createProblemConcernAct());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionProblemConcern(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionProblemConcernTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemConcerns() {

		ProblemSection target = objectFactory.create();
		target.getConsolProblemConcerns();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProblemSection> validateProblemSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionEntriesOptionalTemplateId(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemSection> {
		public ProblemSection create() {
			return ConsolFactory.eINSTANCE.createProblemSection();
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
	private static class ConstructorTestClass extends ProblemSectionOperations {
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

} // ProblemSectionOperations
