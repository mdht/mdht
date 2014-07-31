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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeStudiesSummarySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Studies Summary Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeStudiesSummarySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeStudiesSummarySectionTemplateId() {
		OperationsTestCase<HospitalDischargeStudiesSummarySection> validateHospitalDischargeStudiesSummarySectionTemplateIdTestCase = new OperationsTestCase<HospitalDischargeStudiesSummarySection>(
			"validateHospitalDischargeStudiesSummarySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeStudiesSummarySection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeStudiesSummarySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeStudiesSummarySectionOperations.validateHospitalDischargeStudiesSummarySectionTemplateId(
					(HospitalDischargeStudiesSummarySection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeStudiesSummarySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeStudiesSummarySectionCode() {
		OperationsTestCase<HospitalDischargeStudiesSummarySection> validateHospitalDischargeStudiesSummarySectionCodeTestCase = new OperationsTestCase<HospitalDischargeStudiesSummarySection>(
			"validateHospitalDischargeStudiesSummarySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeStudiesSummarySection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeStudiesSummarySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeStudiesSummarySectionOperations.validateHospitalDischargeStudiesSummarySectionCode(
					(HospitalDischargeStudiesSummarySection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeStudiesSummarySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeStudiesSummarySectionCodeP() {
		OperationsTestCase<HospitalDischargeStudiesSummarySection> validateHospitalDischargeStudiesSummarySectionCodePTestCase = new OperationsTestCase<HospitalDischargeStudiesSummarySection>(
			"validateHospitalDischargeStudiesSummarySectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeStudiesSummarySection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeStudiesSummarySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeStudiesSummarySectionOperations.validateHospitalDischargeStudiesSummarySectionCodeP(
					(HospitalDischargeStudiesSummarySection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeStudiesSummarySectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeStudiesSummarySectionTitle() {
		OperationsTestCase<HospitalDischargeStudiesSummarySection> validateHospitalDischargeStudiesSummarySectionTitleTestCase = new OperationsTestCase<HospitalDischargeStudiesSummarySection>(
			"validateHospitalDischargeStudiesSummarySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeStudiesSummarySection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeStudiesSummarySection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeStudiesSummarySectionOperations.validateHospitalDischargeStudiesSummarySectionTitle(
					(HospitalDischargeStudiesSummarySection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeStudiesSummarySectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeStudiesSummarySectionText() {
		OperationsTestCase<HospitalDischargeStudiesSummarySection> validateHospitalDischargeStudiesSummarySectionTextTestCase = new OperationsTestCase<HospitalDischargeStudiesSummarySection>(
			"validateHospitalDischargeStudiesSummarySectionText",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeStudiesSummarySection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeStudiesSummarySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeStudiesSummarySectionOperations.validateHospitalDischargeStudiesSummarySectionText(
					(HospitalDischargeStudiesSummarySection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeStudiesSummarySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeStudiesSummarySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeStudiesSummarySection> {
		public HospitalDischargeStudiesSummarySection create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargeStudiesSummarySection();
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
	private static class ConstructorTestClass extends HospitalDischargeStudiesSummarySectionOperations {
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

} // HospitalDischargeStudiesSummarySectionOperations
