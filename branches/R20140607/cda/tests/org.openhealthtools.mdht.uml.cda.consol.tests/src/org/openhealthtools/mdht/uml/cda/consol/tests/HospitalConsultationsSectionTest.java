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
import org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalConsultationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Consultations Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection#validateHospitalConsultationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Consultations Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection#validateHospitalConsultationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Consultations Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection#validateHospitalConsultationsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Consultations Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection#validateHospitalConsultationsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Consultations Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection#validateHospitalConsultationsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Consultations Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalConsultationsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalConsultationsSectionTemplateId() {
		OperationsTestCase<HospitalConsultationsSection> validateHospitalConsultationsSectionTemplateIdTestCase = new OperationsTestCase<HospitalConsultationsSection>(
			"validateHospitalConsultationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_CONSULTATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalConsultationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalConsultationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalConsultationsSectionOperations.validateHospitalConsultationsSectionTemplateId(
					(HospitalConsultationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalConsultationsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalConsultationsSectionCode() {
		OperationsTestCase<HospitalConsultationsSection> validateHospitalConsultationsSectionCodeTestCase = new OperationsTestCase<HospitalConsultationsSection>(
			"validateHospitalConsultationsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_CONSULTATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalConsultationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalConsultationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalConsultationsSectionOperations.validateHospitalConsultationsSectionCode(
					(HospitalConsultationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalConsultationsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalConsultationsSectionCodeP() {
		OperationsTestCase<HospitalConsultationsSection> validateHospitalConsultationsSectionCodePTestCase = new OperationsTestCase<HospitalConsultationsSection>(
			"validateHospitalConsultationsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_CONSULTATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalConsultationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalConsultationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalConsultationsSectionOperations.validateHospitalConsultationsSectionCodeP(
					(HospitalConsultationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalConsultationsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalConsultationsSectionText() {
		OperationsTestCase<HospitalConsultationsSection> validateHospitalConsultationsSectionTextTestCase = new OperationsTestCase<HospitalConsultationsSection>(
			"validateHospitalConsultationsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_CONSULTATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalConsultationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalConsultationsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalConsultationsSectionOperations.validateHospitalConsultationsSectionText(
					(HospitalConsultationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalConsultationsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalConsultationsSectionTitle() {
		OperationsTestCase<HospitalConsultationsSection> validateHospitalConsultationsSectionTitleTestCase = new OperationsTestCase<HospitalConsultationsSection>(
			"validateHospitalConsultationsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_CONSULTATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalConsultationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalConsultationsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalConsultationsSectionOperations.validateHospitalConsultationsSectionTitle(
					(HospitalConsultationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalConsultationsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalConsultationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalConsultationsSection> {
		public HospitalConsultationsSection create() {
			return ConsolFactory.eINSTANCE.createHospitalConsultationsSection();
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
	private static class ConstructorTestClass extends HospitalConsultationsSectionOperations {
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

} // HospitalConsultationsSectionOperations
