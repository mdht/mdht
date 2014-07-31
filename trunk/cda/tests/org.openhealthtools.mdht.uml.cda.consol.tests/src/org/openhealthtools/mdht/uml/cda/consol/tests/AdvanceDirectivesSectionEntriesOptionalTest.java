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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectivesSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directives Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional#validateAdvanceDirectivesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional#validateAdvanceDirectivesSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional#validateAdvanceDirectivesSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional#validateAdvanceDirectivesSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional#validateAdvanceDirectivesSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional#validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Advance Directive Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional#getAdvanceDirectiveObservations() <em>Get Advance Directive Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectivesSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional> validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional>(
			"validateAdvanceDirectivesSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptionalOperations.validateAdvanceDirectivesSectionEntriesOptionalTemplateId(
					(AdvanceDirectivesSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalCode() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional> validateAdvanceDirectivesSectionEntriesOptionalCodeTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional>(
			"validateAdvanceDirectivesSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptionalOperations.validateAdvanceDirectivesSectionEntriesOptionalCode(
					(AdvanceDirectivesSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalCodeP() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional> validateAdvanceDirectivesSectionEntriesOptionalCodePTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional>(
			"validateAdvanceDirectivesSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptionalOperations.validateAdvanceDirectivesSectionEntriesOptionalCodeP(
					(AdvanceDirectivesSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalTitle() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional> validateAdvanceDirectivesSectionEntriesOptionalTitleTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional>(
			"validateAdvanceDirectivesSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptionalOperations.validateAdvanceDirectivesSectionEntriesOptionalTitle(
					(AdvanceDirectivesSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalText() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional> validateAdvanceDirectivesSectionEntriesOptionalTextTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional>(
			"validateAdvanceDirectivesSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptionalOperations.validateAdvanceDirectivesSectionEntriesOptionalText(
					(AdvanceDirectivesSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional> validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservationTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional>(
			"validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional target) {

				target.addObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptionalOperations.validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation(
					(AdvanceDirectivesSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectiveObservations() {

		AdvanceDirectivesSectionEntriesOptional target = objectFactory.create();
		target.getAdvanceDirectiveObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectivesSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectivesSectionEntriesOptional> {
		public AdvanceDirectivesSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectivesSectionEntriesOptional();
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
	private static class ConstructorTestClass extends AdvanceDirectivesSectionEntriesOptionalOperations {
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

} // AdvanceDirectivesSectionEntriesOptionalOperations
