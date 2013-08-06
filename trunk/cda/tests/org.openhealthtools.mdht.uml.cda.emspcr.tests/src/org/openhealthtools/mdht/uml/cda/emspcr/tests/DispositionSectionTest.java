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

import org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispositionSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Disposition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionNumberOfPatientsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Number Of Patients Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionIncidentDispositionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Incident Disposition Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionTransportModeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Transport Mode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionTransportMethodObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Transport Method Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionReasonForChoosingDestinationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Reason For Choosing Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionPrearrivalActivationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Prearrival Activation Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionPatientConditionChangeAtDestinationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Patient Condition Change At Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getNumberOfPatientsObservation() <em>Get Number Of Patients Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getIncidentDispositionObservation() <em>Get Incident Disposition Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getTransportModeObservation() <em>Get Transport Mode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getTransportMethodObservation() <em>Get Transport Method Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getReasonForChoosingDestinationObservation() <em>Get Reason For Choosing Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getPrearrivalActivationObservation() <em>Get Prearrival Activation Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getPatientConditionChangeAtDestinationObservation() <em>Get Patient Condition Change At Destination Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DispositionSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionTemplateId() {
		OperationsTestCase<DispositionSection> validateDispositionSectionTemplateIdTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionTemplateId(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionCode() {
		OperationsTestCase<DispositionSection> validateDispositionSectionCodeTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionCode(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionCodeP() {
		OperationsTestCase<DispositionSection> validateDispositionSectionCodePTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionCodeP(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionTitle() {
		OperationsTestCase<DispositionSection> validateDispositionSectionTitleTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionTitle(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionText() {
		OperationsTestCase<DispositionSection> validateDispositionSectionTextTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionText",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionText(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionNumberOfPatientsObservation() {
		OperationsTestCase<DispositionSection> validateDispositionSectionNumberOfPatientsObservationTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionNumberOfPatientsObservation",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionNumberOfPatientsObservation(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionNumberOfPatientsObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionIncidentDispositionObservation() {
		OperationsTestCase<DispositionSection> validateDispositionSectionIncidentDispositionObservationTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionIncidentDispositionObservation",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionIncidentDispositionObservation(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionIncidentDispositionObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionTransportModeObservation() {
		OperationsTestCase<DispositionSection> validateDispositionSectionTransportModeObservationTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionTransportModeObservation",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionTransportModeObservation(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionTransportModeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionTransportMethodObservation() {
		OperationsTestCase<DispositionSection> validateDispositionSectionTransportMethodObservationTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionTransportMethodObservation",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionTransportMethodObservation(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionTransportMethodObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionReasonForChoosingDestinationObservation() {
		OperationsTestCase<DispositionSection> validateDispositionSectionReasonForChoosingDestinationObservationTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionReasonForChoosingDestinationObservation",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionReasonForChoosingDestinationObservation(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionReasonForChoosingDestinationObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionPrearrivalActivationObservation() {
		OperationsTestCase<DispositionSection> validateDispositionSectionPrearrivalActivationObservationTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionPrearrivalActivationObservation",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionPrearrivalActivationObservation(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionPrearrivalActivationObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispositionSectionPatientConditionChangeAtDestinationObservation() {
		OperationsTestCase<DispositionSection> validateDispositionSectionPatientConditionChangeAtDestinationObservationTestCase = new OperationsTestCase<DispositionSection>(
			"validateDispositionSectionPatientConditionChangeAtDestinationObservation",
			operationsForOCL.getOCLValue("VALIDATE_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispositionSection target) {

			}

			@Override
			protected void updateToPass(DispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispositionSectionOperations.validateDispositionSectionPatientConditionChangeAtDestinationObservation(
					(DispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateDispositionSectionPatientConditionChangeAtDestinationObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNumberOfPatientsObservation() {

		DispositionSection target = objectFactory.create();
		target.getNumberOfPatientsObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIncidentDispositionObservation() {

		DispositionSection target = objectFactory.create();
		target.getIncidentDispositionObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTransportModeObservation() {

		DispositionSection target = objectFactory.create();
		target.getTransportModeObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTransportMethodObservation() {

		DispositionSection target = objectFactory.create();
		target.getTransportMethodObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForChoosingDestinationObservation() {

		DispositionSection target = objectFactory.create();
		target.getReasonForChoosingDestinationObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPrearrivalActivationObservation() {

		DispositionSection target = objectFactory.create();
		target.getPrearrivalActivationObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientConditionChangeAtDestinationObservation() {

		DispositionSection target = objectFactory.create();
		target.getPatientConditionChangeAtDestinationObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DispositionSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DispositionSection> {
		public DispositionSection create() {
			return EmspcrFactory.eINSTANCE.createDispositionSection();
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
	private static class ConstructorTestClass extends DispositionSectionOperations {
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

} // DispositionSectionOperations
