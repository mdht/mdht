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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDispositionSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Disposition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionNumberOfPatientsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Number Of Patients Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionIncidentDispositionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Incident Disposition Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTransportModeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Mode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTransportMethodObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Method Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionReasonForChoosingDestinationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Reason For Choosing Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionPrearrivalActivationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Prearrival Activation Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Patient Condition Change At Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getNumberOfPatientsObservation() <em>Get Number Of Patients Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getIncidentDispositionObservation() <em>Get Incident Disposition Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getTransportModeObservation() <em>Get Transport Mode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getTransportMethodObservation() <em>Get Transport Method Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getReasonForChoosingDestinationObservation() <em>Get Reason For Choosing Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getPrearrivalActivationObservation() <em>Get Prearrival Activation Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getPatientConditionChangeAtDestinationObservation() <em>Get Patient Condition Change At Destination Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSDispositionSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionTemplateId() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionTemplateIdTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionTemplateId(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionCode() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionCodeTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionCode(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionCodeP() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionCodePTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionCodeP(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionTitle() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionTitleTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionTitle(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionText() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionTextTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionText(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionNumberOfPatientsObservation() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionNumberOfPatientsObservationTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionNumberOfPatientsObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionNumberOfPatientsObservation(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionNumberOfPatientsObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionIncidentDispositionObservation() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionIncidentDispositionObservationTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionIncidentDispositionObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionIncidentDispositionObservation(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionIncidentDispositionObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionTransportModeObservation() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionTransportModeObservationTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionTransportModeObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionTransportModeObservation(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionTransportModeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionTransportMethodObservation() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionTransportMethodObservationTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionTransportMethodObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionTransportMethodObservation(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionTransportMethodObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionReasonForChoosingDestinationObservation() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionReasonForChoosingDestinationObservationTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionReasonForChoosingDestinationObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionReasonForChoosingDestinationObservation(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionReasonForChoosingDestinationObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionPrearrivalActivationObservation() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionPrearrivalActivationObservationTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionPrearrivalActivationObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionPrearrivalActivationObservation(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionPrearrivalActivationObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionPatientConditionChangeAtDestinationObservation() {
		OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionPatientConditionChangeAtDestinationObservationTestCase = new OperationsTestCase<EMSDispositionSection>(
			"validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDispositionSection target) {

			}

			@Override
			protected void updateToPass(EMSDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDispositionSectionOperations.validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(
					(EMSDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispositionSectionPatientConditionChangeAtDestinationObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNumberOfPatientsObservation() {

		EMSDispositionSection target = objectFactory.create();
		target.getNumberOfPatientsObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIncidentDispositionObservation() {

		EMSDispositionSection target = objectFactory.create();
		target.getIncidentDispositionObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTransportModeObservation() {

		EMSDispositionSection target = objectFactory.create();
		target.getTransportModeObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTransportMethodObservation() {

		EMSDispositionSection target = objectFactory.create();
		target.getTransportMethodObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForChoosingDestinationObservation() {

		EMSDispositionSection target = objectFactory.create();
		target.getReasonForChoosingDestinationObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPrearrivalActivationObservation() {

		EMSDispositionSection target = objectFactory.create();
		target.getPrearrivalActivationObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientConditionChangeAtDestinationObservation() {

		EMSDispositionSection target = objectFactory.create();
		target.getPatientConditionChangeAtDestinationObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSDispositionSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSDispositionSection> {
		public EMSDispositionSection create() {
			return EmspcrFactory.eINSTANCE.createEMSDispositionSection();
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
	private static class ConstructorTestClass extends EMSDispositionSectionOperations {
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

} // EMSDispositionSectionOperations
