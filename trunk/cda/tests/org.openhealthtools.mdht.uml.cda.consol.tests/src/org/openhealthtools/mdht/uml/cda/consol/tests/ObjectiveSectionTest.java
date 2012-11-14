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
import org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ObjectiveSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Objective Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection#validateObjectiveSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection#validateObjectiveSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection#validateObjectiveSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection#validateObjectiveSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection#validateObjectiveSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ObjectiveSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObjectiveSectionTemplateId() {
		OperationsTestCase<ObjectiveSection> validateObjectiveSectionTemplateIdTestCase = new OperationsTestCase<ObjectiveSection>(
			"validateObjectiveSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OBJECTIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObjectiveSection target) {

			}

			@Override
			protected void updateToPass(ObjectiveSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObjectiveSectionOperations.validateObjectiveSectionTemplateId(
					(ObjectiveSection) objectToTest, diagnostician, map);
			}

		};

		validateObjectiveSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObjectiveSectionCode() {
		OperationsTestCase<ObjectiveSection> validateObjectiveSectionCodeTestCase = new OperationsTestCase<ObjectiveSection>(
			"validateObjectiveSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_OBJECTIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObjectiveSection target) {

			}

			@Override
			protected void updateToPass(ObjectiveSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObjectiveSectionOperations.validateObjectiveSectionCode(
					(ObjectiveSection) objectToTest, diagnostician, map);
			}

		};

		validateObjectiveSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObjectiveSectionCodeP() {
		OperationsTestCase<ObjectiveSection> validateObjectiveSectionCodePTestCase = new OperationsTestCase<ObjectiveSection>(
			"validateObjectiveSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OBJECTIVE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObjectiveSection target) {

			}

			@Override
			protected void updateToPass(ObjectiveSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObjectiveSectionOperations.validateObjectiveSectionCodeP(
					(ObjectiveSection) objectToTest, diagnostician, map);
			}

		};

		validateObjectiveSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObjectiveSectionText() {
		OperationsTestCase<ObjectiveSection> validateObjectiveSectionTextTestCase = new OperationsTestCase<ObjectiveSection>(
			"validateObjectiveSectionText",
			operationsForOCL.getOCLValue("VALIDATE_OBJECTIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObjectiveSection target) {

			}

			@Override
			protected void updateToPass(ObjectiveSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObjectiveSectionOperations.validateObjectiveSectionText(
					(ObjectiveSection) objectToTest, diagnostician, map);
			}

		};

		validateObjectiveSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObjectiveSectionTitle() {
		OperationsTestCase<ObjectiveSection> validateObjectiveSectionTitleTestCase = new OperationsTestCase<ObjectiveSection>(
			"validateObjectiveSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_OBJECTIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObjectiveSection target) {

			}

			@Override
			protected void updateToPass(ObjectiveSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObjectiveSectionOperations.validateObjectiveSectionTitle(
					(ObjectiveSection) objectToTest, diagnostician, map);
			}

		};

		validateObjectiveSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ObjectiveSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ObjectiveSection> {
		public ObjectiveSection create() {
			return ConsolFactory.eINSTANCE.createObjectiveSection();
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
	private static class ConstructorTestClass extends ObjectiveSectionOperations {
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

} // ObjectiveSectionOperations
