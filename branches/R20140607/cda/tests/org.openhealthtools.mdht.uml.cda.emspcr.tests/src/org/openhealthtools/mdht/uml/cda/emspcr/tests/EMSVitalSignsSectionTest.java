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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSVitalSignsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection#validateEMSVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Vital Signs Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection#validateEMSVitalSignsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Vital Signs Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection#validateEMSVitalSignsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Vital Signs Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection#validateEMSVitalSignsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Vital Signs Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection#validateEMSVitalSignsSectionVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Vital Signs Section Vital Signs Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection#validateEMSVitalSignsSectionAdditionalVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Vital Signs Section Additional Vital Signs Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection#getVitalSignsOrganizers() <em>Get Vital Signs Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection#getAdditionalVitalSignsOrganizers() <em>Get Additional Vital Signs Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSVitalSignsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSVitalSignsSectionTemplateId() {
		OperationsTestCase<EMSVitalSignsSection> validateEMSVitalSignsSectionTemplateIdTestCase = new OperationsTestCase<EMSVitalSignsSection>(
			"validateEMSVitalSignsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(EMSVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionTemplateId(
					(EMSVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSVitalSignsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSVitalSignsSectionCode() {
		OperationsTestCase<EMSVitalSignsSection> validateEMSVitalSignsSectionCodeTestCase = new OperationsTestCase<EMSVitalSignsSection>(
			"validateEMSVitalSignsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(EMSVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionCode(
					(EMSVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSVitalSignsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSVitalSignsSectionTitle() {
		OperationsTestCase<EMSVitalSignsSection> validateEMSVitalSignsSectionTitleTestCase = new OperationsTestCase<EMSVitalSignsSection>(
			"validateEMSVitalSignsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(EMSVitalSignsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionTitle(
					(EMSVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSVitalSignsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSVitalSignsSectionText() {
		OperationsTestCase<EMSVitalSignsSection> validateEMSVitalSignsSectionTextTestCase = new OperationsTestCase<EMSVitalSignsSection>(
			"validateEMSVitalSignsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(EMSVitalSignsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionText(
					(EMSVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSVitalSignsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSVitalSignsSectionVitalSignsOrganizer() {
		OperationsTestCase<EMSVitalSignsSection> validateEMSVitalSignsSectionVitalSignsOrganizerTestCase = new OperationsTestCase<EMSVitalSignsSection>(
			"validateEMSVitalSignsSectionVitalSignsOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_EMS_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(EMSVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionVitalSignsOrganizer(
					(EMSVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSVitalSignsSectionVitalSignsOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSVitalSignsSectionAdditionalVitalSignsOrganizer() {
		OperationsTestCase<EMSVitalSignsSection> validateEMSVitalSignsSectionAdditionalVitalSignsOrganizerTestCase = new OperationsTestCase<EMSVitalSignsSection>(
			"validateEMSVitalSignsSectionAdditionalVitalSignsOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_EMS_VITAL_SIGNS_SECTION_ADDITIONAL_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(EMSVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionAdditionalVitalSignsOrganizer(
					(EMSVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSVitalSignsSectionAdditionalVitalSignsOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsOrganizers() {

		EMSVitalSignsSection target = objectFactory.create();
		target.getVitalSignsOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdditionalVitalSignsOrganizers() {

		EMSVitalSignsSection target = objectFactory.create();
		target.getAdditionalVitalSignsOrganizers();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSVitalSignsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSVitalSignsSection> {
		public EMSVitalSignsSection create() {
			return EmspcrFactory.eINSTANCE.createEMSVitalSignsSection();
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
	private static class ConstructorTestClass extends EMSVitalSignsSectionOperations {
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

} // EMSVitalSignsSectionOperations
