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
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeDietSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Diet Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection#validateDischargeDietSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diet Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection#validateDischargeDietSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diet Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection#validateDischargeDietSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diet Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection#validateDischargeDietSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diet Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection#validateDischargeDietSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diet Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeDietSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeDietSectionTemplateId() {
		OperationsTestCase<DischargeDietSection> validateDischargeDietSectionTemplateIdTestCase = new OperationsTestCase<DischargeDietSection>(
			"validateDischargeDietSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIET_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDietSection target) {

			}

			@Override
			protected void updateToPass(DischargeDietSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDietSectionOperations.validateDischargeDietSectionTemplateId(
					(DischargeDietSection) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDietSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeDietSectionCode() {
		OperationsTestCase<DischargeDietSection> validateDischargeDietSectionCodeTestCase = new OperationsTestCase<DischargeDietSection>(
			"validateDischargeDietSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIET_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDietSection target) {

			}

			@Override
			protected void updateToPass(DischargeDietSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDietSectionOperations.validateDischargeDietSectionCode(
					(DischargeDietSection) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDietSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeDietSectionCodeP() {
		OperationsTestCase<DischargeDietSection> validateDischargeDietSectionCodePTestCase = new OperationsTestCase<DischargeDietSection>(
			"validateDischargeDietSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIET_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDietSection target) {

			}

			@Override
			protected void updateToPass(DischargeDietSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDietSectionOperations.validateDischargeDietSectionCodeP(
					(DischargeDietSection) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDietSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeDietSectionTitle() {
		OperationsTestCase<DischargeDietSection> validateDischargeDietSectionTitleTestCase = new OperationsTestCase<DischargeDietSection>(
			"validateDischargeDietSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIET_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDietSection target) {

			}

			@Override
			protected void updateToPass(DischargeDietSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDietSectionOperations.validateDischargeDietSectionTitle(
					(DischargeDietSection) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDietSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeDietSectionText() {
		OperationsTestCase<DischargeDietSection> validateDischargeDietSectionTextTestCase = new OperationsTestCase<DischargeDietSection>(
			"validateDischargeDietSectionText",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIET_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDietSection target) {

			}

			@Override
			protected void updateToPass(DischargeDietSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDietSectionOperations.validateDischargeDietSectionText(
					(DischargeDietSection) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDietSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeDietSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeDietSection> {
		public DischargeDietSection create() {
			return ConsolFactory.eINSTANCE.createDischargeDietSection();
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
	private static class ConstructorTestClass extends DischargeDietSectionOperations {
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

} // DischargeDietSectionOperations
