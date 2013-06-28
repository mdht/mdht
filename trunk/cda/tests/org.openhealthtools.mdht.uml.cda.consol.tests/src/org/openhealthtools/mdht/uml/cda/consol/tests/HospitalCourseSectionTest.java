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
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalCourseSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Course Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection#validateHospitalCourseSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection#validateHospitalCourseSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection#validateHospitalCourseSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection#validateHospitalCourseSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection#validateHospitalCourseSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalCourseSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalCourseSectionTemplateId() {
		OperationsTestCase<HospitalCourseSection> validateHospitalCourseSectionTemplateIdTestCase = new OperationsTestCase<HospitalCourseSection>(
			"validateHospitalCourseSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalCourseSection target) {

			}

			@Override
			protected void updateToPass(HospitalCourseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalCourseSectionOperations.validateHospitalCourseSectionTemplateId(
					(HospitalCourseSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalCourseSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalCourseSectionCode() {
		OperationsTestCase<HospitalCourseSection> validateHospitalCourseSectionCodeTestCase = new OperationsTestCase<HospitalCourseSection>(
			"validateHospitalCourseSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_COURSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalCourseSection target) {

			}

			@Override
			protected void updateToPass(HospitalCourseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalCourseSectionOperations.validateHospitalCourseSectionCode(
					(HospitalCourseSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalCourseSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalCourseSectionCodeP() {
		OperationsTestCase<HospitalCourseSection> validateHospitalCourseSectionCodePTestCase = new OperationsTestCase<HospitalCourseSection>(
			"validateHospitalCourseSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_COURSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalCourseSection target) {

			}

			@Override
			protected void updateToPass(HospitalCourseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalCourseSectionOperations.validateHospitalCourseSectionCodeP(
					(HospitalCourseSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalCourseSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalCourseSectionTitle() {
		OperationsTestCase<HospitalCourseSection> validateHospitalCourseSectionTitleTestCase = new OperationsTestCase<HospitalCourseSection>(
			"validateHospitalCourseSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_COURSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalCourseSection target) {

			}

			@Override
			protected void updateToPass(HospitalCourseSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalCourseSectionOperations.validateHospitalCourseSectionTitle(
					(HospitalCourseSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalCourseSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalCourseSectionText() {
		OperationsTestCase<HospitalCourseSection> validateHospitalCourseSectionTextTestCase = new OperationsTestCase<HospitalCourseSection>(
			"validateHospitalCourseSectionText",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_COURSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalCourseSection target) {

			}

			@Override
			protected void updateToPass(HospitalCourseSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalCourseSectionOperations.validateHospitalCourseSectionText(
					(HospitalCourseSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalCourseSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalCourseSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalCourseSection> {
		public HospitalCourseSection create() {
			return ConsolFactory.eINSTANCE.createHospitalCourseSection();
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
	private static class ConstructorTestClass extends HospitalCourseSectionOperations {
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

} // HospitalCourseSectionOperations
