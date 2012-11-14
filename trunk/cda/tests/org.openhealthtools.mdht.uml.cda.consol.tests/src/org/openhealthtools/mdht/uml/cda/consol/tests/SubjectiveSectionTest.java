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
import org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.SubjectiveSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Subjective Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection#validateSubjectiveSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subjective Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection#validateSubjectiveSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subjective Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection#validateSubjectiveSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subjective Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection#validateSubjectiveSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subjective Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection#validateSubjectiveSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subjective Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SubjectiveSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubjectiveSectionTemplateId() {
		OperationsTestCase<SubjectiveSection> validateSubjectiveSectionTemplateIdTestCase = new OperationsTestCase<SubjectiveSection>(
			"validateSubjectiveSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SUBJECTIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubjectiveSection target) {

			}

			@Override
			protected void updateToPass(SubjectiveSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubjectiveSectionOperations.validateSubjectiveSectionTemplateId(
					(SubjectiveSection) objectToTest, diagnostician, map);
			}

		};

		validateSubjectiveSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubjectiveSectionCode() {
		OperationsTestCase<SubjectiveSection> validateSubjectiveSectionCodeTestCase = new OperationsTestCase<SubjectiveSection>(
			"validateSubjectiveSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_SUBJECTIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubjectiveSection target) {

			}

			@Override
			protected void updateToPass(SubjectiveSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubjectiveSectionOperations.validateSubjectiveSectionCode(
					(SubjectiveSection) objectToTest, diagnostician, map);
			}

		};

		validateSubjectiveSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubjectiveSectionCodeP() {
		OperationsTestCase<SubjectiveSection> validateSubjectiveSectionCodePTestCase = new OperationsTestCase<SubjectiveSection>(
			"validateSubjectiveSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SUBJECTIVE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubjectiveSection target) {

			}

			@Override
			protected void updateToPass(SubjectiveSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubjectiveSectionOperations.validateSubjectiveSectionCodeP(
					(SubjectiveSection) objectToTest, diagnostician, map);
			}

		};

		validateSubjectiveSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubjectiveSectionText() {
		OperationsTestCase<SubjectiveSection> validateSubjectiveSectionTextTestCase = new OperationsTestCase<SubjectiveSection>(
			"validateSubjectiveSectionText",
			operationsForOCL.getOCLValue("VALIDATE_SUBJECTIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubjectiveSection target) {

			}

			@Override
			protected void updateToPass(SubjectiveSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubjectiveSectionOperations.validateSubjectiveSectionText(
					(SubjectiveSection) objectToTest, diagnostician, map);
			}

		};

		validateSubjectiveSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubjectiveSectionTitle() {
		OperationsTestCase<SubjectiveSection> validateSubjectiveSectionTitleTestCase = new OperationsTestCase<SubjectiveSection>(
			"validateSubjectiveSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_SUBJECTIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubjectiveSection target) {

			}

			@Override
			protected void updateToPass(SubjectiveSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubjectiveSectionOperations.validateSubjectiveSectionTitle(
					(SubjectiveSection) objectToTest, diagnostician, map);
			}

		};

		validateSubjectiveSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SubjectiveSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SubjectiveSection> {
		public SubjectiveSection create() {
			return ConsolFactory.eINSTANCE.createSubjectiveSection();
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
	private static class ConstructorTestClass extends SubjectiveSectionOperations {
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

} // SubjectiveSectionOperations
