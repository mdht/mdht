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
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PreoperativeDiagnosisSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Preoperative Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection#validatePreoperativeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection#validatePreoperativeDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection#validatePreoperativeDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection#validatePreoperativeDiagnosisSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection#validatePreoperativeDiagnosisSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection#validatePreoperativeDiagnosisSectionPreoperativeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Section Preoperative Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection#getPreoperativeDiagnosis() <em>Get Preoperative Diagnosis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PreoperativeDiagnosisSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisSectionTemplateId() {
		OperationsTestCase<PreoperativeDiagnosisSection> validatePreoperativeDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<PreoperativeDiagnosisSection>(
			"validatePreoperativeDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisSectionOperations.validatePreoperativeDiagnosisSectionTemplateId(
					(PreoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisSectionCode() {
		OperationsTestCase<PreoperativeDiagnosisSection> validatePreoperativeDiagnosisSectionCodeTestCase = new OperationsTestCase<PreoperativeDiagnosisSection>(
			"validatePreoperativeDiagnosisSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisSectionOperations.validatePreoperativeDiagnosisSectionCode(
					(PreoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisSectionCodeP() {
		OperationsTestCase<PreoperativeDiagnosisSection> validatePreoperativeDiagnosisSectionCodePTestCase = new OperationsTestCase<PreoperativeDiagnosisSection>(
			"validatePreoperativeDiagnosisSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisSectionOperations.validatePreoperativeDiagnosisSectionCodeP(
					(PreoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisSectionText() {
		OperationsTestCase<PreoperativeDiagnosisSection> validatePreoperativeDiagnosisSectionTextTestCase = new OperationsTestCase<PreoperativeDiagnosisSection>(
			"validatePreoperativeDiagnosisSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosisSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisSectionOperations.validatePreoperativeDiagnosisSectionText(
					(PreoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisSectionTitle() {
		OperationsTestCase<PreoperativeDiagnosisSection> validatePreoperativeDiagnosisSectionTitleTestCase = new OperationsTestCase<PreoperativeDiagnosisSection>(
			"validatePreoperativeDiagnosisSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosisSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisSectionOperations.validatePreoperativeDiagnosisSectionTitle(
					(PreoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePreoperativeDiagnosisSectionPreoperativeDiagnosis() {
		OperationsTestCase<PreoperativeDiagnosisSection> validatePreoperativeDiagnosisSectionPreoperativeDiagnosisTestCase = new OperationsTestCase<PreoperativeDiagnosisSection>(
			"validatePreoperativeDiagnosisSectionPreoperativeDiagnosis",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosisSection target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createPreoperativeDiagnosis().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisSectionOperations.validatePreoperativeDiagnosisSectionPreoperativeDiagnosis(
					(PreoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisSectionPreoperativeDiagnosisTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPreoperativeDiagnosis() {

		PreoperativeDiagnosisSection target = objectFactory.create();
		target.getPreoperativeDiagnosis();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PreoperativeDiagnosisSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PreoperativeDiagnosisSection> {
		public PreoperativeDiagnosisSection create() {
			return ConsolFactory.eINSTANCE.createPreoperativeDiagnosisSection();
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
	private static class ConstructorTestClass extends PreoperativeDiagnosisSectionOperations {
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

} // PreoperativeDiagnosisSectionOperations
