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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional#validateVitalSignsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional#validateVitalSignsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional#validateVitalSignsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional#validateVitalSignsSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional#validateVitalSignsSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional#validateVitalSignsSectionEntriesOptionalVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Vital Signs Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional#getVitalSignsOrganizers() <em>Get Vital Signs Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignsSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<VitalSignsSectionEntriesOptional> validateVitalSignsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<VitalSignsSectionEntriesOptional>(
			"validateVitalSignsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(VitalSignsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionEntriesOptionalOperations.validateVitalSignsSectionEntriesOptionalTemplateId(
					(VitalSignsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated 
	*/
	@Test
	public void testValidateVitalSignsSectionEntriesOptionalCode() {
		OperationsTestCase<VitalSignsSectionEntriesOptional> validateVitalSignsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<VitalSignsSectionEntriesOptional>(
			"validateVitalSignsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(VitalSignsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionEntriesOptionalOperations.validateVitalSignsSectionEntriesOptionalCode(
					(VitalSignsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsSectionEntriesOptionalCodeP() {
		OperationsTestCase<VitalSignsSectionEntriesOptional> validateVitalSignsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<VitalSignsSectionEntriesOptional>(
			"validateVitalSignsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(VitalSignsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionEntriesOptionalOperations.validateVitalSignsSectionEntriesOptionalCodeP(
					(VitalSignsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignsSectionEntriesOptionalTitle() {
		OperationsTestCase<VitalSignsSectionEntriesOptional> validateVitalSignsSectionEntriesOptionalTitleTestCase = new OperationsTestCase<VitalSignsSectionEntriesOptional>(
			"validateVitalSignsSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(VitalSignsSectionEntriesOptional target) {
				target.init();

				target.setTitle(DatatypesFactory.eINSTANCE.createST());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionEntriesOptionalOperations.validateVitalSignsSectionEntriesOptionalTitle(
					(VitalSignsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignsSectionEntriesOptionalVitalSignsOrganizer() {
		OperationsTestCase<VitalSignsSectionEntriesOptional> validateVitalSignsSectionEntriesOptionalVitalSignsOrganizerTestCase = new OperationsTestCase<VitalSignsSectionEntriesOptional>(
			"validateVitalSignsSectionEntriesOptionalVitalSignsOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSectionEntriesOptional target) {
				target.init();
			}

			@Override
			protected void updateToPass(VitalSignsSectionEntriesOptional target) {

				VitalSignsOrganizer organizer = ConsolFactory.eINSTANCE.createVitalSignsOrganizer().init();
				target.addOrganizer(organizer);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionEntriesOptionalOperations.validateVitalSignsSectionEntriesOptionalVitalSignsOrganizer(
					(VitalSignsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptionalVitalSignsOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsOrganizers() {

		VitalSignsSectionEntriesOptional target = objectFactory.create();
		target.getVitalSignsOrganizers();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignsSectionEntriesOptionalText() {
		OperationsTestCase<VitalSignsSectionEntriesOptional> validateVitalSignsSectionEntriesOptionalTextTestCase = new OperationsTestCase<VitalSignsSectionEntriesOptional>(
			"validateVitalSignsSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(VitalSignsSectionEntriesOptional target) {
				target.init();

				target.setText(CDAFactory.eINSTANCE.createStrucDocText());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionEntriesOptionalOperations.validateVitalSignsSectionEntriesOptionalText(
					(VitalSignsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignsSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignsSectionEntriesOptional> {
		public VitalSignsSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional();
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
	private static class ConstructorTestClass extends VitalSignsSectionEntriesOptionalOperations {
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

} // VitalSignsSectionEntriesOptionalOperations
