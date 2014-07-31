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
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsAdministeredSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Administered Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection#validateMedicationsAdministeredSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection#validateMedicationsAdministeredSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection#validateMedicationsAdministeredSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection#validateMedicationsAdministeredSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection#validateMedicationsAdministeredSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection#validateMedicationsAdministeredSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsAdministeredSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionTemplateId() {
		OperationsTestCase<MedicationsAdministeredSection> validateMedicationsAdministeredSectionTemplateIdTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateMedicationsAdministeredSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionTemplateId(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionCode() {
		OperationsTestCase<MedicationsAdministeredSection> validateMedicationsAdministeredSectionCodeTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateMedicationsAdministeredSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionCode(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionCodeP() {
		OperationsTestCase<MedicationsAdministeredSection> validateMedicationsAdministeredSectionCodePTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateMedicationsAdministeredSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionCodeP(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionText() {
		OperationsTestCase<MedicationsAdministeredSection> validateMedicationsAdministeredSectionTextTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateMedicationsAdministeredSectionText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionText(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionTitle() {
		OperationsTestCase<MedicationsAdministeredSection> validateMedicationsAdministeredSectionTitleTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateMedicationsAdministeredSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionTitle(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionMedicationActivity() {
		OperationsTestCase<MedicationsAdministeredSection> validateMedicationsAdministeredSectionMedicationActivityTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateMedicationsAdministeredSectionMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();
				target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionMedicationActivity(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		MedicationsAdministeredSection target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationsAdministeredSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsAdministeredSection> {
		public MedicationsAdministeredSection create() {
			return ConsolFactory.eINSTANCE.createMedicationsAdministeredSection();
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
	private static class ConstructorTestClass extends MedicationsAdministeredSectionOperations {
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

} // MedicationsAdministeredSectionOperations
