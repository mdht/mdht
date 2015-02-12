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
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReasonForVisitSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Visit Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection#validateReasonForVisitSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection#validateReasonForVisitSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection#validateReasonForVisitSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection#validateReasonForVisitSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection#validateReasonForVisitSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReasonForVisitSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForVisitSectionTemplateId() {
		OperationsTestCase<ReasonForVisitSection> validateReasonForVisitSectionTemplateIdTestCase = new OperationsTestCase<ReasonForVisitSection>(
			"validateReasonForVisitSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForVisitSection target) {

			}

			@Override
			protected void updateToPass(ReasonForVisitSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForVisitSectionOperations.validateReasonForVisitSectionTemplateId(
					(ReasonForVisitSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForVisitSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForVisitSectionCode() {
		OperationsTestCase<ReasonForVisitSection> validateReasonForVisitSectionCodeTestCase = new OperationsTestCase<ReasonForVisitSection>(
			"validateReasonForVisitSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForVisitSection target) {

			}

			@Override
			protected void updateToPass(ReasonForVisitSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForVisitSectionOperations.validateReasonForVisitSectionCode(
					(ReasonForVisitSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForVisitSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForVisitSectionCodeP() {
		OperationsTestCase<ReasonForVisitSection> validateReasonForVisitSectionCodePTestCase = new OperationsTestCase<ReasonForVisitSection>(
			"validateReasonForVisitSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForVisitSection target) {

			}

			@Override
			protected void updateToPass(ReasonForVisitSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForVisitSectionOperations.validateReasonForVisitSectionCodeP(
					(ReasonForVisitSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForVisitSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForVisitSectionText() {
		OperationsTestCase<ReasonForVisitSection> validateReasonForVisitSectionTextTestCase = new OperationsTestCase<ReasonForVisitSection>(
			"validateReasonForVisitSectionText",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForVisitSection target) {

			}

			@Override
			protected void updateToPass(ReasonForVisitSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForVisitSectionOperations.validateReasonForVisitSectionText(
					(ReasonForVisitSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForVisitSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForVisitSectionTitle() {
		OperationsTestCase<ReasonForVisitSection> validateReasonForVisitSectionTitleTestCase = new OperationsTestCase<ReasonForVisitSection>(
			"validateReasonForVisitSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForVisitSection target) {

			}

			@Override
			protected void updateToPass(ReasonForVisitSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForVisitSectionOperations.validateReasonForVisitSectionTitle(
					(ReasonForVisitSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForVisitSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReasonForVisitSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReasonForVisitSection> {
		public ReasonForVisitSection create() {
			return ConsolFactory.eINSTANCE.createReasonForVisitSection();
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
	private static class ConstructorTestClass extends ReasonForVisitSectionOperations {
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

} // ReasonForVisitSectionOperations
