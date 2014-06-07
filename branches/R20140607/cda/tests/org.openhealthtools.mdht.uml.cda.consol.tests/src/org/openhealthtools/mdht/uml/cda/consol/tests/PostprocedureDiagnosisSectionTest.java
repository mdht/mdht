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
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PostprocedureDiagnosisSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Postprocedure Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Postprocedure Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#getPostprocedureDiagnosis() <em>Get Postprocedure Diagnosis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PostprocedureDiagnosisSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisSectionTemplateId() {
		OperationsTestCase<PostprocedureDiagnosisSection> validatePostprocedureDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<PostprocedureDiagnosisSection>(
			"validatePostprocedureDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSectionOperations.validatePostprocedureDiagnosisSectionTemplateId(
					(PostprocedureDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisSectionCodeP() {
		OperationsTestCase<PostprocedureDiagnosisSection> validatePostprocedureDiagnosisSectionCodePTestCase = new OperationsTestCase<PostprocedureDiagnosisSection>(
			"validatePostprocedureDiagnosisSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSectionOperations.validatePostprocedureDiagnosisSectionCodeP(
					(PostprocedureDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisSectionCode() {
		OperationsTestCase<PostprocedureDiagnosisSection> validatePostprocedureDiagnosisSectionCodeTestCase = new OperationsTestCase<PostprocedureDiagnosisSection>(
			"validatePostprocedureDiagnosisSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSectionOperations.validatePostprocedureDiagnosisSectionCode(
					(PostprocedureDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisSectionText() {
		OperationsTestCase<PostprocedureDiagnosisSection> validatePostprocedureDiagnosisSectionTextTestCase = new OperationsTestCase<PostprocedureDiagnosisSection>(
			"validatePostprocedureDiagnosisSectionText",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSectionOperations.validatePostprocedureDiagnosisSectionText(
					(PostprocedureDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisSectionTitle() {
		OperationsTestCase<PostprocedureDiagnosisSection> validatePostprocedureDiagnosisSectionTitleTestCase = new OperationsTestCase<PostprocedureDiagnosisSection>(
			"validatePostprocedureDiagnosisSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSectionOperations.validatePostprocedureDiagnosisSectionTitle(
					(PostprocedureDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePostprocedureDiagnosisSectionPostprocedureDiagnosis() {
		OperationsTestCase<PostprocedureDiagnosisSection> validatePostprocedureDiagnosisSectionPostprocedureDiagnosisTestCase = new OperationsTestCase<PostprocedureDiagnosisSection>(
			"validatePostprocedureDiagnosisSectionPostprocedureDiagnosis",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection target) {
				target.init();

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection target) {
				target.addAct(ConsolFactory.eINSTANCE.createPostprocedureDiagnosis().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSectionOperations.validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(
					(PostprocedureDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisSectionPostprocedureDiagnosisTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPostprocedureDiagnosis() {

		PostprocedureDiagnosisSection target = objectFactory.create();
		target.getPostprocedureDiagnosis();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PostprocedureDiagnosisSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PostprocedureDiagnosisSection> {
		public PostprocedureDiagnosisSection create() {
			return ConsolFactory.eINSTANCE.createPostprocedureDiagnosisSection();
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
	private static class ConstructorTestClass extends PostprocedureDiagnosisSectionOperations {
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

} // PostprocedureDiagnosisSectionOperations
