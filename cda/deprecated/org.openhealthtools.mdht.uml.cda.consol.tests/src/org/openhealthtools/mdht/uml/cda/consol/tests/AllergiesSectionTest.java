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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergiesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#getConsolAllergyProblemActs() <em>Get Consol Allergy Problem Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergiesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionCodeP() {
		OperationsTestCase<AllergiesSection> validateAllergiesSectionCodePTestCase = new OperationsTestCase<AllergiesSection>(
			"validateAllergiesSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection target) {

			}

			@Override
			protected void updateToPass(AllergiesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionOperations.validateAllergiesSectionCodeP(
					(AllergiesSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionCode() {
		OperationsTestCase<AllergiesSection> validateAllergiesSectionCodeTestCase = new OperationsTestCase<AllergiesSection>(
			"validateAllergiesSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection target) {

			}

			@Override
			protected void updateToPass(AllergiesSection target) {
				target.init();

			}

			@Override
			protected void setDependency(AllergiesSection target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionOperations.validateAllergiesSectionCode(
					(AllergiesSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionTitle() {
		OperationsTestCase<AllergiesSection> validateAllergiesSectionTitleTestCase = new OperationsTestCase<AllergiesSection>(
			"validateAllergiesSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection target) {

			}

			@Override
			protected void updateToPass(AllergiesSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionOperations.validateAllergiesSectionTitle(
					(AllergiesSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionText() {
		OperationsTestCase<AllergiesSection> validateAllergiesSectionTextTestCase = new OperationsTestCase<AllergiesSection>(
			"validateAllergiesSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection target) {

			}

			@Override
			protected void updateToPass(AllergiesSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionOperations.validateAllergiesSectionText(
					(AllergiesSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergiesSectionAllergyProblemAct() {
		OperationsTestCase<AllergiesSection> validateAllergiesSectionAllergyProblemActTestCase = new OperationsTestCase<AllergiesSection>(
			"validateAllergiesSectionAllergyProblemAct",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergiesSection target) {

				target.addAct(ConsolFactory.eINSTANCE.createAllergyProblemAct().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionOperations.validateAllergiesSectionAllergyProblemAct(
					(AllergiesSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionAllergyProblemActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAllergyProblemActs() {

		AllergiesSection target = objectFactory.create();
		target.getConsolAllergyProblemActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AllergiesSection> validateAllergiesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AllergiesSection>(
			"validateAllergiesSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection target) {

			}

			@Override
			protected void updateToPass(AllergiesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionOperations.validateAllergiesSectionEntriesOptionalTemplateId(
					(AllergiesSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergiesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergiesSection> {
		public AllergiesSection create() {
			return ConsolFactory.eINSTANCE.createAllergiesSection();
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
	private static class ConstructorTestClass extends AllergiesSectionOperations {
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

} // AllergiesSectionOperations
