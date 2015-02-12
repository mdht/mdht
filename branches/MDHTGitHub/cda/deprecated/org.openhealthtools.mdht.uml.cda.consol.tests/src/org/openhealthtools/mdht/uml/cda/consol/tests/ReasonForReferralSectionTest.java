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
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReasonForReferralSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Referral Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReasonForReferralSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionTemplateId() {
		OperationsTestCase<ReasonForReferralSection> validateReasonForReferralSectionTemplateIdTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateReasonForReferralSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateReasonForReferralSectionTemplateId(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionCode() {
		OperationsTestCase<ReasonForReferralSection> validateReasonForReferralSectionCodeTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateReasonForReferralSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateReasonForReferralSectionCode(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionCodeP() {
		OperationsTestCase<ReasonForReferralSection> validateReasonForReferralSectionCodePTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateReasonForReferralSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateReasonForReferralSectionCodeP(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionTitle() {
		OperationsTestCase<ReasonForReferralSection> validateReasonForReferralSectionTitleTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateReasonForReferralSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateReasonForReferralSectionTitle(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionText() {
		OperationsTestCase<ReasonForReferralSection> validateReasonForReferralSectionTextTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateReasonForReferralSectionText",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateReasonForReferralSectionText(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReasonForReferralSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReasonForReferralSection> {
		public ReasonForReferralSection create() {
			return ConsolFactory.eINSTANCE.createReasonForReferralSection();
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
	private static class ConstructorTestClass extends ReasonForReferralSectionOperations {
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

} // ReasonForReferralSectionOperations
