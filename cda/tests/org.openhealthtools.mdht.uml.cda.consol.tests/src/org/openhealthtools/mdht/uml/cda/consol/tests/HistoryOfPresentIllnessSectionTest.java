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
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryOfPresentIllnessSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Present Illness Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection#validateHistoryOfPresentIllnessSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection#validateHistoryOfPresentIllnessSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection#validateHistoryOfPresentIllnessSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection#validateHistoryOfPresentIllnessSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection#validateHistoryOfPresentIllnessSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryOfPresentIllnessSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPresentIllnessSectionTemplateId() {
		OperationsTestCase<HistoryOfPresentIllnessSection> validateHistoryOfPresentIllnessSectionTemplateIdTestCase = new OperationsTestCase<HistoryOfPresentIllnessSection>(
			"validateHistoryOfPresentIllnessSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPresentIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPresentIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPresentIllnessSectionOperations.validateHistoryOfPresentIllnessSectionTemplateId(
					(HistoryOfPresentIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPresentIllnessSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPresentIllnessSectionCode() {
		OperationsTestCase<HistoryOfPresentIllnessSection> validateHistoryOfPresentIllnessSectionCodeTestCase = new OperationsTestCase<HistoryOfPresentIllnessSection>(
			"validateHistoryOfPresentIllnessSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPresentIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPresentIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPresentIllnessSectionOperations.validateHistoryOfPresentIllnessSectionCode(
					(HistoryOfPresentIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPresentIllnessSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPresentIllnessSectionCodeP() {
		OperationsTestCase<HistoryOfPresentIllnessSection> validateHistoryOfPresentIllnessSectionCodePTestCase = new OperationsTestCase<HistoryOfPresentIllnessSection>(
			"validateHistoryOfPresentIllnessSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPresentIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPresentIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPresentIllnessSectionOperations.validateHistoryOfPresentIllnessSectionCodeP(
					(HistoryOfPresentIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPresentIllnessSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPresentIllnessSectionTitle() {
		OperationsTestCase<HistoryOfPresentIllnessSection> validateHistoryOfPresentIllnessSectionTitleTestCase = new OperationsTestCase<HistoryOfPresentIllnessSection>(
			"validateHistoryOfPresentIllnessSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPresentIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPresentIllnessSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPresentIllnessSectionOperations.validateHistoryOfPresentIllnessSectionTitle(
					(HistoryOfPresentIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPresentIllnessSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPresentIllnessSectionText() {
		OperationsTestCase<HistoryOfPresentIllnessSection> validateHistoryOfPresentIllnessSectionTextTestCase = new OperationsTestCase<HistoryOfPresentIllnessSection>(
			"validateHistoryOfPresentIllnessSectionText",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPresentIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPresentIllnessSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPresentIllnessSectionOperations.validateHistoryOfPresentIllnessSectionText(
					(HistoryOfPresentIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPresentIllnessSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryOfPresentIllnessSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryOfPresentIllnessSection> {
		public HistoryOfPresentIllnessSection create() {
			return ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection();
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
	private static class ConstructorTestClass extends HistoryOfPresentIllnessSectionOperations {
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

} // HistoryOfPresentIllnessSectionOperations
