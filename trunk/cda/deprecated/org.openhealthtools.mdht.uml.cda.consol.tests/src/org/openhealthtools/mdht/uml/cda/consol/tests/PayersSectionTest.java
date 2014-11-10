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
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PayersSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payers Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection#validatePayersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection#validatePayersSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection#validatePayersSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection#validatePayersSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection#validatePayersSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection#validatePayersSectionCoverageActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Coverage Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection#getCoverageActivities() <em>Get Coverage Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PayersSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayersSectionTemplateId() {
		OperationsTestCase<PayersSection> validatePayersSectionTemplateIdTestCase = new OperationsTestCase<PayersSection>(
			"validatePayersSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PayersSection target) {

			}

			@Override
			protected void updateToPass(PayersSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSectionOperations.validatePayersSectionTemplateId(
					(PayersSection) objectToTest, diagnostician, map);
			}

		};

		validatePayersSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayersSectionCode() {
		OperationsTestCase<PayersSection> validatePayersSectionCodeTestCase = new OperationsTestCase<PayersSection>(
			"validatePayersSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PayersSection target) {

			}

			@Override
			protected void updateToPass(PayersSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSectionOperations.validatePayersSectionCode(
					(PayersSection) objectToTest, diagnostician, map);
			}

		};

		validatePayersSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayersSectionCodeP() {
		OperationsTestCase<PayersSection> validatePayersSectionCodePTestCase = new OperationsTestCase<PayersSection>(
			"validatePayersSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PAYERS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PayersSection target) {

			}

			@Override
			protected void updateToPass(PayersSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSectionOperations.validatePayersSectionCodeP(
					(PayersSection) objectToTest, diagnostician, map);
			}

		};

		validatePayersSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayersSectionTitle() {
		OperationsTestCase<PayersSection> validatePayersSectionTitleTestCase = new OperationsTestCase<PayersSection>(
			"validatePayersSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PAYERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PayersSection target) {

			}

			@Override
			protected void updateToPass(PayersSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSectionOperations.validatePayersSectionTitle(
					(PayersSection) objectToTest, diagnostician, map);
			}

		};

		validatePayersSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayersSectionText() {
		OperationsTestCase<PayersSection> validatePayersSectionTextTestCase = new OperationsTestCase<PayersSection>(
			"validatePayersSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PAYERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PayersSection target) {

			}

			@Override
			protected void updateToPass(PayersSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSectionOperations.validatePayersSectionText(
					(PayersSection) objectToTest, diagnostician, map);
			}

		};

		validatePayersSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePayersSectionCoverageActivity() {
		OperationsTestCase<PayersSection> validatePayersSectionCoverageActivityTestCase = new OperationsTestCase<PayersSection>(
			"validatePayersSectionCoverageActivity",
			operationsForOCL.getOCLValue("VALIDATE_PAYERS_SECTION_COVERAGE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PayersSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(PayersSection target) {
				target.addAct(ConsolFactory.eINSTANCE.createCoverageActivity().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSectionOperations.validatePayersSectionCoverageActivity(
					(PayersSection) objectToTest, diagnostician, map);
			}

		};

		validatePayersSectionCoverageActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCoverageActivities() {

		PayersSection target = objectFactory.create();
		target.getCoverageActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PayersSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PayersSection> {
		public PayersSection create() {
			return ConsolFactory.eINSTANCE.createPayersSection();
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
	private static class ConstructorTestClass extends PayersSectionOperations {
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

} // PayersSectionOperations
