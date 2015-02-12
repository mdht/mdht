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
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.ChiefComplaintAndReasonForVisitSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chief Complaint And Reason For Visit Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection#validateChiefComplaintAndReasonForVisitSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection#validateChiefComplaintAndReasonForVisitSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection#validateChiefComplaintAndReasonForVisitSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection#validateChiefComplaintAndReasonForVisitSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection#validateChiefComplaintAndReasonForVisitSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ChiefComplaintAndReasonForVisitSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChiefComplaintAndReasonForVisitSectionTemplateId() {
		OperationsTestCase<ChiefComplaintAndReasonForVisitSection> validateChiefComplaintAndReasonForVisitSectionTemplateIdTestCase = new OperationsTestCase<ChiefComplaintAndReasonForVisitSection>(
			"validateChiefComplaintAndReasonForVisitSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintAndReasonForVisitSection target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintAndReasonForVisitSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionTemplateId(
					(ChiefComplaintAndReasonForVisitSection) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintAndReasonForVisitSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChiefComplaintAndReasonForVisitSectionCode() {
		OperationsTestCase<ChiefComplaintAndReasonForVisitSection> validateChiefComplaintAndReasonForVisitSectionCodeTestCase = new OperationsTestCase<ChiefComplaintAndReasonForVisitSection>(
			"validateChiefComplaintAndReasonForVisitSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintAndReasonForVisitSection target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintAndReasonForVisitSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionCode(
					(ChiefComplaintAndReasonForVisitSection) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintAndReasonForVisitSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChiefComplaintAndReasonForVisitSectionCodeP() {
		OperationsTestCase<ChiefComplaintAndReasonForVisitSection> validateChiefComplaintAndReasonForVisitSectionCodePTestCase = new OperationsTestCase<ChiefComplaintAndReasonForVisitSection>(
			"validateChiefComplaintAndReasonForVisitSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintAndReasonForVisitSection target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintAndReasonForVisitSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionCodeP(
					(ChiefComplaintAndReasonForVisitSection) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintAndReasonForVisitSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChiefComplaintAndReasonForVisitSectionText() {
		OperationsTestCase<ChiefComplaintAndReasonForVisitSection> validateChiefComplaintAndReasonForVisitSectionTextTestCase = new OperationsTestCase<ChiefComplaintAndReasonForVisitSection>(
			"validateChiefComplaintAndReasonForVisitSectionText",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintAndReasonForVisitSection target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintAndReasonForVisitSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionText(
					(ChiefComplaintAndReasonForVisitSection) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintAndReasonForVisitSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChiefComplaintAndReasonForVisitSectionTitle() {
		OperationsTestCase<ChiefComplaintAndReasonForVisitSection> validateChiefComplaintAndReasonForVisitSectionTitleTestCase = new OperationsTestCase<ChiefComplaintAndReasonForVisitSection>(
			"validateChiefComplaintAndReasonForVisitSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintAndReasonForVisitSection target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintAndReasonForVisitSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionTitle(
					(ChiefComplaintAndReasonForVisitSection) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintAndReasonForVisitSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ChiefComplaintAndReasonForVisitSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChiefComplaintAndReasonForVisitSection> {
		public ChiefComplaintAndReasonForVisitSection create() {
			return ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection();
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
	private static class ConstructorTestClass extends ChiefComplaintAndReasonForVisitSectionOperations {
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

} // ChiefComplaintAndReasonForVisitSectionOperations
