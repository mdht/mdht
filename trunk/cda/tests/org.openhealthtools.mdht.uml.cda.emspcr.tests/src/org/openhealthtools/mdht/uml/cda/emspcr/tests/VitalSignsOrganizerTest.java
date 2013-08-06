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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.VitalSignsOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Systolic Blood Pressure Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Diastolic Blood Pressure Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerHeartRateComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Heart Rate Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Respiratory Rate Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Body Temperature Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Oxygen Saturation Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#getPriorAidVitals() <em>Get Prior Aid Vitals</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignsOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent() {
		OperationsTestCase<VitalSignsOrganizer> validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponentTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_SYSTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent() {
		OperationsTestCase<VitalSignsOrganizer> validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponentTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_DIASTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsOrganizerHeartRateComponent() {
		OperationsTestCase<VitalSignsOrganizer> validateEMSPCRVitalSignsOrganizerHeartRateComponentTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateEMSPCRVitalSignsOrganizerHeartRateComponent",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_HEART_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerHeartRateComponent(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsOrganizerHeartRateComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsOrganizerRespiratoryRateComponent() {
		OperationsTestCase<VitalSignsOrganizer> validateEMSPCRVitalSignsOrganizerRespiratoryRateComponentTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_RESPIRATORY_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsOrganizerRespiratoryRateComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsOrganizerBodyTemperatureComponent() {
		OperationsTestCase<VitalSignsOrganizer> validateEMSPCRVitalSignsOrganizerBodyTemperatureComponentTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_BODY_TEMPERATURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsOrganizerBodyTemperatureComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsOrganizerOxygenSaturationComponent() {
		OperationsTestCase<VitalSignsOrganizer> validateEMSPCRVitalSignsOrganizerOxygenSaturationComponentTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_OXYGEN_SATURATION_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsOrganizerOxygenSaturationComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRVitalSignsOrganizerEffectiveTime() {
		OperationsTestCase<VitalSignsOrganizer> validateEMSPCRVitalSignsOrganizerEffectiveTimeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateEMSPCRVitalSignsOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerEffectiveTime(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRVitalSignsOrganizerEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPriorAidVitals() {

		VitalSignsOrganizer target = objectFactory.create();
		target.getPriorAidVitals();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerTemplateId() {
		OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerTemplateIdTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerTemplateId(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignsOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignsOrganizer> {
		public VitalSignsOrganizer create() {
			return EmspcrFactory.eINSTANCE.createVitalSignsOrganizer();
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
	private static class ConstructorTestClass extends VitalSignsOrganizerOperations {
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

} // VitalSignsOrganizerOperations
