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
import org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicalHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection#validateMedicalHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection#validateMedicalHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection#validateMedicalHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection#validateMedicalHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection#validateMedicalHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicalHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalHistorySectionTemplateId() {
		OperationsTestCase<MedicalHistorySection> validateMedicalHistorySectionTemplateIdTestCase = new OperationsTestCase<MedicalHistorySection>(
			"validateMedicalHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(MedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalHistorySectionOperations.validateMedicalHistorySectionTemplateId(
					(MedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateMedicalHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalHistorySectionCode() {
		OperationsTestCase<MedicalHistorySection> validateMedicalHistorySectionCodeTestCase = new OperationsTestCase<MedicalHistorySection>(
			"validateMedicalHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(MedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalHistorySectionOperations.validateMedicalHistorySectionCode(
					(MedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateMedicalHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalHistorySectionCodeP() {
		OperationsTestCase<MedicalHistorySection> validateMedicalHistorySectionCodePTestCase = new OperationsTestCase<MedicalHistorySection>(
			"validateMedicalHistorySectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(MedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalHistorySectionOperations.validateMedicalHistorySectionCodeP(
					(MedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateMedicalHistorySectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalHistorySectionText() {
		OperationsTestCase<MedicalHistorySection> validateMedicalHistorySectionTextTestCase = new OperationsTestCase<MedicalHistorySection>(
			"validateMedicalHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(MedicalHistorySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalHistorySectionOperations.validateMedicalHistorySectionText(
					(MedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateMedicalHistorySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalHistorySectionTitle() {
		OperationsTestCase<MedicalHistorySection> validateMedicalHistorySectionTitleTestCase = new OperationsTestCase<MedicalHistorySection>(
			"validateMedicalHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(MedicalHistorySection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalHistorySectionOperations.validateMedicalHistorySectionTitle(
					(MedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateMedicalHistorySectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicalHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicalHistorySection> {
		public MedicalHistorySection create() {
			return ConsolFactory.eINSTANCE.createMedicalHistorySection();
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
	private static class ConstructorTestClass extends MedicalHistorySectionOperations {
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

} // MedicalHistorySectionOperations
