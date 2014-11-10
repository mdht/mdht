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
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional#validateProblemSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional#validateProblemSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional#validateProblemSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional#validateProblemSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional#validateProblemSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional#validateProblemSectionEntriesOptionalProblemConcern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Problem Concern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional#getProblemConcerns() <em>Get Problem Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProblemSectionEntriesOptional> validateProblemSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProblemSectionEntriesOptional>(
			"validateProblemSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProblemSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionEntriesOptionalOperations.validateProblemSectionEntriesOptionalTemplateId(
					(ProblemSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalCode() {
		OperationsTestCase<ProblemSectionEntriesOptional> validateProblemSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ProblemSectionEntriesOptional>(
			"validateProblemSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProblemSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionEntriesOptionalOperations.validateProblemSectionEntriesOptionalCode(
					(ProblemSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalCodeP() {
		OperationsTestCase<ProblemSectionEntriesOptional> validateProblemSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ProblemSectionEntriesOptional>(
			"validateProblemSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProblemSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionEntriesOptionalOperations.validateProblemSectionEntriesOptionalCodeP(
					(ProblemSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalTitle() {
		OperationsTestCase<ProblemSectionEntriesOptional> validateProblemSectionEntriesOptionalTitleTestCase = new OperationsTestCase<ProblemSectionEntriesOptional>(
			"validateProblemSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProblemSectionEntriesOptional target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionEntriesOptionalOperations.validateProblemSectionEntriesOptionalTitle(
					(ProblemSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalText() {
		OperationsTestCase<ProblemSectionEntriesOptional> validateProblemSectionEntriesOptionalTextTestCase = new OperationsTestCase<ProblemSectionEntriesOptional>(
			"validateProblemSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProblemSectionEntriesOptional target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionEntriesOptionalOperations.validateProblemSectionEntriesOptionalText(
					(ProblemSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalProblemConcern() {
		OperationsTestCase<ProblemSectionEntriesOptional> validateProblemSectionEntriesOptionalProblemConcernTestCase = new OperationsTestCase<ProblemSectionEntriesOptional>(
			"validateProblemSectionEntriesOptionalProblemConcern",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProblemSectionEntriesOptional target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createProblemConcernAct().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionEntriesOptionalOperations.validateProblemSectionEntriesOptionalProblemConcern(
					(ProblemSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalProblemConcernTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemConcerns() {

		ProblemSectionEntriesOptional target = objectFactory.create();
		target.getProblemConcerns();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemSectionEntriesOptional> {
		public ProblemSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createProblemSectionEntriesOptional();
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
	private static class ConstructorTestClass extends ProblemSectionEntriesOptionalOperations {
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

} // ProblemSectionEntriesOptionalOperations
