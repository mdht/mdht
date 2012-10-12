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
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncountersSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional#validateEncountersSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional#validateEncountersSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional#validateEncountersSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional#validateEncountersSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional#validateEncountersSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional#validateEncountersSectionEntriesOptionalEncounterActivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Encounter Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional#getEncounterActivitiess() <em>Get Encounter Activitiess</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncountersSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalTemplateId() {
		OperationsTestCase<EncountersSectionEntriesOptional> validateEncountersSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<EncountersSectionEntriesOptional>(
			"validateEncountersSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(EncountersSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalTemplateId(
					(EncountersSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalCode() {
		OperationsTestCase<EncountersSectionEntriesOptional> validateEncountersSectionEntriesOptionalCodeTestCase = new OperationsTestCase<EncountersSectionEntriesOptional>(
			"validateEncountersSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(EncountersSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalCode(
					(EncountersSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalCodeP() {
		OperationsTestCase<EncountersSectionEntriesOptional> validateEncountersSectionEntriesOptionalCodePTestCase = new OperationsTestCase<EncountersSectionEntriesOptional>(
			"validateEncountersSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(EncountersSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalCodeP(
					(EncountersSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalTitle() {
		OperationsTestCase<EncountersSectionEntriesOptional> validateEncountersSectionEntriesOptionalTitleTestCase = new OperationsTestCase<EncountersSectionEntriesOptional>(
			"validateEncountersSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(EncountersSectionEntriesOptional target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalTitle(
					(EncountersSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalText() {
		OperationsTestCase<EncountersSectionEntriesOptional> validateEncountersSectionEntriesOptionalTextTestCase = new OperationsTestCase<EncountersSectionEntriesOptional>(
			"validateEncountersSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(EncountersSectionEntriesOptional target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalText(
					(EncountersSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalEncounterActivities() {
		OperationsTestCase<EncountersSectionEntriesOptional> validateEncountersSectionEntriesOptionalEncounterActivitiesTestCase = new OperationsTestCase<EncountersSectionEntriesOptional>(
			"validateEncountersSectionEntriesOptionalEncounterActivities",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(EncountersSectionEntriesOptional target) {
				target.init();
				target.addEncounter(ConsolFactory.eINSTANCE.createEncounterActivities().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalEncounterActivities(
					(EncountersSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalEncounterActivitiesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncounterActivitiess() {

		EncountersSectionEntriesOptional target = objectFactory.create();
		target.getEncounterActivitiess();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncountersSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncountersSectionEntriesOptional> {
		public EncountersSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createEncountersSectionEntriesOptional();
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
	private static class ConstructorTestClass extends EncountersSectionEntriesOptionalOperations {
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

} // EncountersSectionEntriesOptionalOperations
