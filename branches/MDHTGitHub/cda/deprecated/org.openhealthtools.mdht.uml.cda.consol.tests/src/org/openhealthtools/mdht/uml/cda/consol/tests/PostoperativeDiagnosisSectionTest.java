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
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PostoperativeDiagnosisSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Postoperative Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection#validatePostoperativeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection#validatePostoperativeDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection#validatePostoperativeDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection#validatePostoperativeDiagnosisSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection#validatePostoperativeDiagnosisSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PostoperativeDiagnosisSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostoperativeDiagnosisSectionTemplateId() {
		OperationsTestCase<PostoperativeDiagnosisSection> validatePostoperativeDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<PostoperativeDiagnosisSection>(
			"validatePostoperativeDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostoperativeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostoperativeDiagnosisSectionOperations.validatePostoperativeDiagnosisSectionTemplateId(
					(PostoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostoperativeDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostoperativeDiagnosisSectionCode() {
		OperationsTestCase<PostoperativeDiagnosisSection> validatePostoperativeDiagnosisSectionCodeTestCase = new OperationsTestCase<PostoperativeDiagnosisSection>(
			"validatePostoperativeDiagnosisSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostoperativeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostoperativeDiagnosisSectionOperations.validatePostoperativeDiagnosisSectionCode(
					(PostoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostoperativeDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostoperativeDiagnosisSectionCodeP() {
		OperationsTestCase<PostoperativeDiagnosisSection> validatePostoperativeDiagnosisSectionCodePTestCase = new OperationsTestCase<PostoperativeDiagnosisSection>(
			"validatePostoperativeDiagnosisSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostoperativeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostoperativeDiagnosisSectionOperations.validatePostoperativeDiagnosisSectionCodeP(
					(PostoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostoperativeDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostoperativeDiagnosisSectionText() {
		OperationsTestCase<PostoperativeDiagnosisSection> validatePostoperativeDiagnosisSectionTextTestCase = new OperationsTestCase<PostoperativeDiagnosisSection>(
			"validatePostoperativeDiagnosisSectionText",
			operationsForOCL.getOCLValue("VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostoperativeDiagnosisSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostoperativeDiagnosisSectionOperations.validatePostoperativeDiagnosisSectionText(
					(PostoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostoperativeDiagnosisSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostoperativeDiagnosisSectionTitle() {
		OperationsTestCase<PostoperativeDiagnosisSection> validatePostoperativeDiagnosisSectionTitleTestCase = new OperationsTestCase<PostoperativeDiagnosisSection>(
			"validatePostoperativeDiagnosisSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostoperativeDiagnosisSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostoperativeDiagnosisSectionOperations.validatePostoperativeDiagnosisSectionTitle(
					(PostoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostoperativeDiagnosisSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PostoperativeDiagnosisSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PostoperativeDiagnosisSection> {
		public PostoperativeDiagnosisSection create() {
			return ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection();
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
	private static class ConstructorTestClass extends PostoperativeDiagnosisSectionOperations {
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

} // PostoperativeDiagnosisSectionOperations
