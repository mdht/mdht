/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.VitalSignsSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateEMSPCRVitalSignsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateEMSPCRVitalSignsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateEMSPCRVitalSignsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateEMSPCRVitalSignsSectionVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Vital Signs Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Additional Vital Signs Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#getemspcrVitalSignsOrganizers() <em>Getemspcr Vital Signs Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#getAdditionalVitalSignsOrganizers() <em>Get Additional Vital Signs Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateVitalSignsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsSectionCode() {
		OperationsTestCase<VitalSignsSection> validateEMSPCRVitalSignsSectionCodeTestCase = new OperationsTestCase<VitalSignsSection>(
			"validateEMSPCRVitalSignsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations.validateEMSPCRVitalSignsSectionCode(
					(VitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsSectionTitle() {
		OperationsTestCase<VitalSignsSection> validateEMSPCRVitalSignsSectionTitleTestCase = new OperationsTestCase<VitalSignsSection>(
			"validateEMSPCRVitalSignsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations.validateEMSPCRVitalSignsSectionTitle(
					(VitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsSectionText() {
		OperationsTestCase<VitalSignsSection> validateEMSPCRVitalSignsSectionTextTestCase = new OperationsTestCase<VitalSignsSection>(
			"validateEMSPCRVitalSignsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations.validateEMSPCRVitalSignsSectionText(
					(VitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsSectionVitalSignsOrganizer() {
		OperationsTestCase<VitalSignsSection> validateEMSPCRVitalSignsSectionVitalSignsOrganizerTestCase = new OperationsTestCase<VitalSignsSection>(
			"validateEMSPCRVitalSignsSectionVitalSignsOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations.validateEMSPCRVitalSignsSectionVitalSignsOrganizer(
					(VitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsSectionVitalSignsOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizer() {
		OperationsTestCase<VitalSignsSection> validateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizerTestCase = new OperationsTestCase<VitalSignsSection>(
			"validateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_ADDITIONAL_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations.validateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizer(
					(VitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetemspcrVitalSignsOrganizers() {

		VitalSignsSection target = objectFactory.create();
		target.getemspcrVitalSignsOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdditionalVitalSignsOrganizers() {

		VitalSignsSection target = objectFactory.create();
		target.getAdditionalVitalSignsOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<VitalSignsSection> validateVitalSignsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<VitalSignsSection>(
			"validateVitalSignsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations.validateVitalSignsSectionEntriesOptionalTemplateId(
					(VitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignsSection> {
		public VitalSignsSection create() {
			return EmspcrFactory.eINSTANCE.createVitalSignsSection();
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
	private static class ConstructorTestClass extends VitalSignsSectionOperations {
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

} // VitalSignsSectionOperations
