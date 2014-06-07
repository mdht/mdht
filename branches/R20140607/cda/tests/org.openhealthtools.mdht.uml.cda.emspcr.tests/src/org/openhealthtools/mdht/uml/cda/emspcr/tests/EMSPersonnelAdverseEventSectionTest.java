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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPersonnelAdverseEventSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Personnel Adverse Event Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionAdverseEventIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Adverse Event Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionAdverseEventTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Adverse Event Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#getAdverseEventIndicator() <em>Get Adverse Event Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#getAdverseEventTypeObservations() <em>Get Adverse Event Type Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSPersonnelAdverseEventSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPersonnelAdverseEventSectionTemplateId() {
		OperationsTestCase<EMSPersonnelAdverseEventSection> validateEMSPersonnelAdverseEventSectionTemplateIdTestCase = new OperationsTestCase<EMSPersonnelAdverseEventSection>(
			"validateEMSPersonnelAdverseEventSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(EMSPersonnelAdverseEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionTemplateId(
					(EMSPersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPersonnelAdverseEventSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPersonnelAdverseEventSectionCode() {
		OperationsTestCase<EMSPersonnelAdverseEventSection> validateEMSPersonnelAdverseEventSectionCodeTestCase = new OperationsTestCase<EMSPersonnelAdverseEventSection>(
			"validateEMSPersonnelAdverseEventSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(EMSPersonnelAdverseEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionCode(
					(EMSPersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPersonnelAdverseEventSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPersonnelAdverseEventSectionCodeP() {
		OperationsTestCase<EMSPersonnelAdverseEventSection> validateEMSPersonnelAdverseEventSectionCodePTestCase = new OperationsTestCase<EMSPersonnelAdverseEventSection>(
			"validateEMSPersonnelAdverseEventSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(EMSPersonnelAdverseEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionCodeP(
					(EMSPersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPersonnelAdverseEventSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPersonnelAdverseEventSectionTitle() {
		OperationsTestCase<EMSPersonnelAdverseEventSection> validateEMSPersonnelAdverseEventSectionTitleTestCase = new OperationsTestCase<EMSPersonnelAdverseEventSection>(
			"validateEMSPersonnelAdverseEventSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(EMSPersonnelAdverseEventSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionTitle(
					(EMSPersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPersonnelAdverseEventSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPersonnelAdverseEventSectionText() {
		OperationsTestCase<EMSPersonnelAdverseEventSection> validateEMSPersonnelAdverseEventSectionTextTestCase = new OperationsTestCase<EMSPersonnelAdverseEventSection>(
			"validateEMSPersonnelAdverseEventSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(EMSPersonnelAdverseEventSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionText(
					(EMSPersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPersonnelAdverseEventSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPersonnelAdverseEventSectionAdverseEventIndicator() {
		OperationsTestCase<EMSPersonnelAdverseEventSection> validateEMSPersonnelAdverseEventSectionAdverseEventIndicatorTestCase = new OperationsTestCase<EMSPersonnelAdverseEventSection>(
			"validateEMSPersonnelAdverseEventSectionAdverseEventIndicator",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(EMSPersonnelAdverseEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionAdverseEventIndicator(
					(EMSPersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPersonnelAdverseEventSectionAdverseEventIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPersonnelAdverseEventSectionAdverseEventTypeObservation() {
		OperationsTestCase<EMSPersonnelAdverseEventSection> validateEMSPersonnelAdverseEventSectionAdverseEventTypeObservationTestCase = new OperationsTestCase<EMSPersonnelAdverseEventSection>(
			"validateEMSPersonnelAdverseEventSectionAdverseEventTypeObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(EMSPersonnelAdverseEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionAdverseEventTypeObservation(
					(EMSPersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPersonnelAdverseEventSectionAdverseEventTypeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdverseEventIndicator() {

		EMSPersonnelAdverseEventSection target = objectFactory.create();
		target.getAdverseEventIndicator();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdverseEventTypeObservations() {

		EMSPersonnelAdverseEventSection target = objectFactory.create();
		target.getAdverseEventTypeObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSPersonnelAdverseEventSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSPersonnelAdverseEventSection> {
		public EMSPersonnelAdverseEventSection create() {
			return EmspcrFactory.eINSTANCE.createEMSPersonnelAdverseEventSection();
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
	private static class ConstructorTestClass extends EMSPersonnelAdverseEventSectionOperations {
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

} // EMSPersonnelAdverseEventSectionOperations
