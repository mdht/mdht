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
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interventions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection#validateInterventionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection#validateInterventionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection#validateInterventionsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection#validateInterventionsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection#validateInterventionsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InterventionsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionsSectionTemplateId() {
		OperationsTestCase<InterventionsSection> validateInterventionsSectionTemplateIdTestCase = new OperationsTestCase<InterventionsSection>(
			"validateInterventionsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection target) {

			}

			@Override
			protected void updateToPass(InterventionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSectionOperations.validateInterventionsSectionTemplateId(
					(InterventionsSection) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionsSectionCode() {
		OperationsTestCase<InterventionsSection> validateInterventionsSectionCodeTestCase = new OperationsTestCase<InterventionsSection>(
			"validateInterventionsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection target) {

			}

			@Override
			protected void updateToPass(InterventionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSectionOperations.validateInterventionsSectionCode(
					(InterventionsSection) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionsSectionCodeP() {
		OperationsTestCase<InterventionsSection> validateInterventionsSectionCodePTestCase = new OperationsTestCase<InterventionsSection>(
			"validateInterventionsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection target) {

			}

			@Override
			protected void updateToPass(InterventionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSectionOperations.validateInterventionsSectionCodeP(
					(InterventionsSection) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionsSectionText() {
		OperationsTestCase<InterventionsSection> validateInterventionsSectionTextTestCase = new OperationsTestCase<InterventionsSection>(
			"validateInterventionsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection target) {

			}

			@Override
			protected void updateToPass(InterventionsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSectionOperations.validateInterventionsSectionText(
					(InterventionsSection) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionsSectionTitle() {
		OperationsTestCase<InterventionsSection> validateInterventionsSectionTitleTestCase = new OperationsTestCase<InterventionsSection>(
			"validateInterventionsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection target) {

			}

			@Override
			protected void updateToPass(InterventionsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSectionOperations.validateInterventionsSectionTitle(
					(InterventionsSection) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InterventionsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InterventionsSection> {
		public InterventionsSection create() {
			return ConsolFactory.eINSTANCE.createInterventionsSection();
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
	private static class ConstructorTestClass extends InterventionsSectionOperations {
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

} // InterventionsSectionOperations
