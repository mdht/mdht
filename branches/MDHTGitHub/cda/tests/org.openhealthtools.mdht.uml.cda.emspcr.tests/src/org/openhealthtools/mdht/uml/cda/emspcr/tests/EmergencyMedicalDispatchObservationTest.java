/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EmergencyMedicalDispatchObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Emergency Medical Dispatch Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EmergencyMedicalDispatchObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEmergencyMedicalDispatchObservationTemplateId() {
		OperationsTestCase<EmergencyMedicalDispatchObservation> validateEmergencyMedicalDispatchObservationTemplateIdTestCase = new OperationsTestCase<EmergencyMedicalDispatchObservation>(
			"validateEmergencyMedicalDispatchObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EmergencyMedicalDispatchObservation target) {

			}

			@Override
			protected void updateToPass(EmergencyMedicalDispatchObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationTemplateId(
					(EmergencyMedicalDispatchObservation) objectToTest, diagnostician, map);
			}

		};

		validateEmergencyMedicalDispatchObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEmergencyMedicalDispatchObservationMoodCode() {
		OperationsTestCase<EmergencyMedicalDispatchObservation> validateEmergencyMedicalDispatchObservationMoodCodeTestCase = new OperationsTestCase<EmergencyMedicalDispatchObservation>(
			"validateEmergencyMedicalDispatchObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EmergencyMedicalDispatchObservation target) {

			}

			@Override
			protected void updateToPass(EmergencyMedicalDispatchObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationMoodCode(
					(EmergencyMedicalDispatchObservation) objectToTest, diagnostician, map);
			}

		};

		validateEmergencyMedicalDispatchObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEmergencyMedicalDispatchObservationCodeP() {
		OperationsTestCase<EmergencyMedicalDispatchObservation> validateEmergencyMedicalDispatchObservationCodePTestCase = new OperationsTestCase<EmergencyMedicalDispatchObservation>(
			"validateEmergencyMedicalDispatchObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EmergencyMedicalDispatchObservation target) {

			}

			@Override
			protected void updateToPass(EmergencyMedicalDispatchObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationCodeP(
					(EmergencyMedicalDispatchObservation) objectToTest, diagnostician, map);
			}

		};

		validateEmergencyMedicalDispatchObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEmergencyMedicalDispatchObservationCode() {
		OperationsTestCase<EmergencyMedicalDispatchObservation> validateEmergencyMedicalDispatchObservationCodeTestCase = new OperationsTestCase<EmergencyMedicalDispatchObservation>(
			"validateEmergencyMedicalDispatchObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EmergencyMedicalDispatchObservation target) {

			}

			@Override
			protected void updateToPass(EmergencyMedicalDispatchObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(EmergencyMedicalDispatchObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationCode(
					(EmergencyMedicalDispatchObservation) objectToTest, diagnostician, map);
			}

		};

		validateEmergencyMedicalDispatchObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEmergencyMedicalDispatchObservationValue() {
		OperationsTestCase<EmergencyMedicalDispatchObservation> validateEmergencyMedicalDispatchObservationValueTestCase = new OperationsTestCase<EmergencyMedicalDispatchObservation>(
			"validateEmergencyMedicalDispatchObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EmergencyMedicalDispatchObservation target) {

			}

			@Override
			protected void updateToPass(EmergencyMedicalDispatchObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationValue(
					(EmergencyMedicalDispatchObservation) objectToTest, diagnostician, map);
			}

		};

		validateEmergencyMedicalDispatchObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEmergencyMedicalDispatchObservationValueP() {
		OperationsTestCase<EmergencyMedicalDispatchObservation> validateEmergencyMedicalDispatchObservationValuePTestCase = new OperationsTestCase<EmergencyMedicalDispatchObservation>(
			"validateEmergencyMedicalDispatchObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EmergencyMedicalDispatchObservation target) {

			}

			@Override
			protected void updateToPass(EmergencyMedicalDispatchObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationValueP(
					(EmergencyMedicalDispatchObservation) objectToTest, diagnostician, map);
			}

		};

		validateEmergencyMedicalDispatchObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EmergencyMedicalDispatchObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EmergencyMedicalDispatchObservation> {
		public EmergencyMedicalDispatchObservation create() {
			return EmspcrFactory.eINSTANCE.createEmergencyMedicalDispatchObservation();
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
	private static class ConstructorTestClass extends EmergencyMedicalDispatchObservationOperations {
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

} // EmergencyMedicalDispatchObservationOperations
