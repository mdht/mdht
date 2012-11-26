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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargePhysicalSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Physical Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection#validateHospitalDischargePhysicalSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection#validateHospitalDischargePhysicalSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection#validateHospitalDischargePhysicalSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection#validateHospitalDischargePhysicalSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection#validateHospitalDischargePhysicalSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargePhysicalSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargePhysicalSectionTemplateId() {
		OperationsTestCase<HospitalDischargePhysicalSection> validateHospitalDischargePhysicalSectionTemplateIdTestCase = new OperationsTestCase<HospitalDischargePhysicalSection>(
			"validateHospitalDischargePhysicalSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargePhysicalSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargePhysicalSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargePhysicalSectionOperations.validateHospitalDischargePhysicalSectionTemplateId(
					(HospitalDischargePhysicalSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargePhysicalSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargePhysicalSectionCode() {
		OperationsTestCase<HospitalDischargePhysicalSection> validateHospitalDischargePhysicalSectionCodeTestCase = new OperationsTestCase<HospitalDischargePhysicalSection>(
			"validateHospitalDischargePhysicalSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargePhysicalSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargePhysicalSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargePhysicalSectionOperations.validateHospitalDischargePhysicalSectionCode(
					(HospitalDischargePhysicalSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargePhysicalSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargePhysicalSectionCodeP() {
		OperationsTestCase<HospitalDischargePhysicalSection> validateHospitalDischargePhysicalSectionCodePTestCase = new OperationsTestCase<HospitalDischargePhysicalSection>(
			"validateHospitalDischargePhysicalSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargePhysicalSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargePhysicalSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargePhysicalSectionOperations.validateHospitalDischargePhysicalSectionCodeP(
					(HospitalDischargePhysicalSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargePhysicalSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargePhysicalSectionTitle() {
		OperationsTestCase<HospitalDischargePhysicalSection> validateHospitalDischargePhysicalSectionTitleTestCase = new OperationsTestCase<HospitalDischargePhysicalSection>(
			"validateHospitalDischargePhysicalSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargePhysicalSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargePhysicalSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargePhysicalSectionOperations.validateHospitalDischargePhysicalSectionTitle(
					(HospitalDischargePhysicalSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargePhysicalSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargePhysicalSectionText() {
		OperationsTestCase<HospitalDischargePhysicalSection> validateHospitalDischargePhysicalSectionTextTestCase = new OperationsTestCase<HospitalDischargePhysicalSection>(
			"validateHospitalDischargePhysicalSectionText",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargePhysicalSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargePhysicalSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargePhysicalSectionOperations.validateHospitalDischargePhysicalSectionText(
					(HospitalDischargePhysicalSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargePhysicalSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargePhysicalSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargePhysicalSection> {
		public HospitalDischargePhysicalSection create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargePhysicalSection();
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
	private static class ConstructorTestClass extends HospitalDischargePhysicalSectionOperations {
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

} // HospitalDischargePhysicalSectionOperations
