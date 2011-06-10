/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.AllergiesReactionsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies Reactions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection#validateAllergiesReactionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Reactions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection#validateAllergiesReactionsSectionAllergyIntoleranceConcern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Reactions Section Allergy Intolerance Concern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection#getAllergyIntoleranceConcerns() <em>Get Allergy Intolerance Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergiesReactionsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesReactionsSectionTemplateId() {
		OperationsTestCase<AllergiesReactionsSection> validateAllergiesReactionsSectionTemplateIdTestCase = new OperationsTestCase<AllergiesReactionsSection>(
			"validateAllergiesReactionsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesReactionsSection target) {

			}

			@Override
			protected void updateToPass(AllergiesReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesReactionsSectionOperations.validateAllergiesReactionsSectionTemplateId(
					(AllergiesReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesReactionsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergiesReactionsSectionAllergyIntoleranceConcern() {
		OperationsTestCase<AllergiesReactionsSection> validateAllergiesReactionsSectionAllergyIntoleranceConcernTestCase = new OperationsTestCase<AllergiesReactionsSection>(
			"validateAllergiesReactionsSectionAllergyIntoleranceConcern",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_REACTIONS_SECTION_ALLERGY_INTOLERANCE_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesReactionsSection target) {
				target.init();

			}

			@Override
			protected void updateToPass(AllergiesReactionsSection target) {
				AllergyIntoleranceConcern aic = IHEFactory.eINSTANCE.createAllergyIntoleranceConcern().init();
				target.addAct(aic);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesReactionsSectionOperations.validateAllergiesReactionsSectionAllergyIntoleranceConcern(
					(AllergiesReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesReactionsSectionAllergyIntoleranceConcernTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergyIntoleranceConcerns() {

		AllergiesReactionsSection target = objectFactory.create();
		target.getAllergyIntoleranceConcerns();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergiesReactionsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergiesReactionsSection> {

		public AllergiesReactionsSection create() {
			return IHEFactory.eINSTANCE.createAllergiesReactionsSection();
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
	private static class ConstructorTestClass extends AllergiesReactionsSectionOperations {
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

} // AllergiesReactionsSectionOperations
