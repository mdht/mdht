/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultObservationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation#validateVitalSignObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation#validateVitalSignObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation#validateVitalSignObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation#validateVitalSignObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation#validateVitalSignObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationTemplateId() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationTemplateIdTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationTemplateId(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignObservationInterpretationCode() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationInterpretationCodeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				target.getInterpretationCodes().add(ce);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationInterpretationCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignObservationMethodCode() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationMethodCodeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				target.getMethodCodes().add(ce);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationMethodCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignObservationTargetSiteCode() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationTargetSiteCodeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.getTargetSiteCodes().add(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationTargetSiteCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignObservationValue() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationValueTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(cd);
			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.getValues().clear();
				PQ pq = DatatypesFactory.eINSTANCE.createPQ();
				target.getValues().add(pq);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationValue(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationCode() {
		OperationsTestCase<VitalSignObservation> validateResultObservationCodeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCodeSystem("2.16.840.1.113883.6.1");

				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignObservation> {

		public VitalSignObservation create() {
			return IHEFactory.eINSTANCE.createVitalSignObservation();
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
	private static class ConstructorTestClass extends VitalSignObservationOperations {
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

} // VitalSignObservationOperations
