/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.VitalSignsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Vital Signs Section</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#validateVitalSignsSectionTitleValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Vital Signs Section Title Value</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#validateVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Vital Signs Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#validateVitalSignsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Vital Signs Section Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#validateVitalSignsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Vital Signs Section Title</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#validateVitalSignsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Vital Signs Section Text</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#validateVitalSignsSectionVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Vital Signs Section Vital Signs Organizer</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#getVitalSignsOrganizers()
 * <em>Get Vital Signs Organizers</em>}</li>
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
	public void testValidateVitalSignsSectionTitleValue() {
		OperationsTestCase<VitalSignsSection> validateVitalSignsSectionTitleValueTestCase = new OperationsTestCase<VitalSignsSection>(
				"validateVitalSignsSectionTitleValue",
				operationsForOCL
						.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_TITLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("vital signs");

				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations
						.validateVitalSignsSectionTitleValue(
								(VitalSignsSection) objectToTest,
								diagnostician, map);
			}

		};

		validateVitalSignsSectionTitleValueTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVitalSignsSectionTemplateId() {
		OperationsTestCase<VitalSignsSection> validateVitalSignsSectionTemplateIdTestCase = new OperationsTestCase<VitalSignsSection>(
				"validateVitalSignsSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations
						.validateVitalSignsSectionTemplateId(
								(VitalSignsSection) objectToTest,
								diagnostician, map);
			}

		};

		validateVitalSignsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVitalSignsSectionCode() {
		OperationsTestCase<VitalSignsSection> validateVitalSignsSectionCodeTestCase = new OperationsTestCase<VitalSignsSection>(
				"validateVitalSignsSectionCode",
				operationsForOCL
						.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations
						.validateVitalSignsSectionCode(
								(VitalSignsSection) objectToTest,
								diagnostician, map);
			}

		};

		validateVitalSignsSectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVitalSignsSectionTitle() {
		OperationsTestCase<VitalSignsSection> validateVitalSignsSectionTitleTestCase = new OperationsTestCase<VitalSignsSection>(
				"validateVitalSignsSectionTitle",
				operationsForOCL
						.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations
						.validateVitalSignsSectionTitle(
								(VitalSignsSection) objectToTest,
								diagnostician, map);
			}

		};

		validateVitalSignsSectionTitleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVitalSignsSectionText() {
		OperationsTestCase<VitalSignsSection> validateVitalSignsSectionTextTestCase = new OperationsTestCase<VitalSignsSection>(
				"validateVitalSignsSectionText",
				operationsForOCL
						.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations
						.validateVitalSignsSectionText(
								(VitalSignsSection) objectToTest,
								diagnostician, map);
			}

		};

		validateVitalSignsSectionTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVitalSignsSectionVitalSignsOrganizer() {
		OperationsTestCase<VitalSignsSection> validateVitalSignsSectionVitalSignsOrganizerTestCase = new OperationsTestCase<VitalSignsSection>(
				"validateVitalSignsSectionVitalSignsOrganizer",
				operationsForOCL
						.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations
						.validateVitalSignsSectionVitalSignsOrganizer(
								(VitalSignsSection) objectToTest,
								diagnostician, map);
			}

		};

		validateVitalSignsSectionVitalSignsOrganizerTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends VitalSignsSectionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<VitalSignsSection> {
		public VitalSignsSection create() {
			return CCDFactory.eINSTANCE.createVitalSignsSection();
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
	 * 
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // VitalSignsSectionOperations