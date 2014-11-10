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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionFamilyHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Family History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#getFamilyHistories() <em>Get Family Histories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionTemplateId() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionTemplateIdTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionTemplateId(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionCode() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionCodeTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionCode(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionCodeP() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionCodePTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionCodeP(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionTitle() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionTitleTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionTitle(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionText() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionTextTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionText(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistorySectionFamilyHistory() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionFamilyHistoryTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionFamilyHistory",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();
				target.addOrganizer(ConsolFactory.eINSTANCE.createFamilyHistoryOrganizer().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionFamilyHistory(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionFamilyHistoryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistories() {

		FamilyHistorySection target = objectFactory.create();
		target.getFamilyHistories();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistorySection> {
		public FamilyHistorySection create() {
			return ConsolFactory.eINSTANCE.createFamilyHistorySection();
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
	private static class ConstructorTestClass extends FamilyHistorySectionOperations {
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

} // FamilyHistorySectionOperations
