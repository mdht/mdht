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
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional#validateMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional#validateMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional#validateMedicationsSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional#validateMedicationsSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional#validateMedicationsSectionEntriesOptionalMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<MedicationsSectionEntriesOptional> validateMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<MedicationsSectionEntriesOptional>(
			"validateMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(MedicationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionEntriesOptionalOperations.validateMedicationsSectionEntriesOptionalTemplateId(
					(MedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated 
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalCode() {
		OperationsTestCase<MedicationsSectionEntriesOptional> validateMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<MedicationsSectionEntriesOptional>(
			"validateMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(MedicationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionEntriesOptionalOperations.validateMedicationsSectionEntriesOptionalCode(
					(MedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalTitle() {
		OperationsTestCase<MedicationsSectionEntriesOptional> validateMedicationsSectionEntriesOptionalTitleTestCase = new OperationsTestCase<MedicationsSectionEntriesOptional>(
			"validateMedicationsSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(MedicationsSectionEntriesOptional target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("Medications");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionEntriesOptionalOperations.validateMedicationsSectionEntriesOptionalTitle(
					(MedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalText() {
		OperationsTestCase<MedicationsSectionEntriesOptional> validateMedicationsSectionEntriesOptionalTextTestCase = new OperationsTestCase<MedicationsSectionEntriesOptional>(
			"validateMedicationsSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(MedicationsSectionEntriesOptional target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionEntriesOptionalOperations.validateMedicationsSectionEntriesOptionalText(
					(MedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalMedicationActivity() {
		OperationsTestCase<MedicationsSectionEntriesOptional> validateMedicationsSectionEntriesOptionalMedicationActivityTestCase = new OperationsTestCase<MedicationsSectionEntriesOptional>(
			"validateMedicationsSectionEntriesOptionalMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(MedicationsSectionEntriesOptional target) {
				target.init();

				target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionEntriesOptionalOperations.validateMedicationsSectionEntriesOptionalMedicationActivity(
					(MedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		MedicationsSectionEntriesOptional target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationsSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsSectionEntriesOptional> {
		public MedicationsSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createMedicationsSectionEntriesOptional();
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
	private static class ConstructorTestClass extends MedicationsSectionEntriesOptionalOperations {
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

} // MedicationsSectionEntriesOptionalOperations
