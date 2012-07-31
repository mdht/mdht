/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.operations.ImagingObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Imaging Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation#validateImagingObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imaging Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation#validateImagingObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imaging Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation#validateImagingObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imaging Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation#validateImagingObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imaging Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation#validateImagingObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imaging Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation#validateImagingObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imaging Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation#validateImagingObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imaging Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation#validateImagingObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imaging Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImagingObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImagingObservationClassCode() {
		OperationsTestCase<ImagingObservation> validateImagingObservationClassCodeTestCase = new OperationsTestCase<ImagingObservation>(
			"validateImagingObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_IMAGING_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImagingObservation target) {

			}

			@Override
			protected void updateToPass(ImagingObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImagingObservationOperations.validateImagingObservationClassCode(
					(ImagingObservation) objectToTest, diagnostician, map);
			}

		};

		validateImagingObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImagingObservationMoodCode() {
		OperationsTestCase<ImagingObservation> validateImagingObservationMoodCodeTestCase = new OperationsTestCase<ImagingObservation>(
			"validateImagingObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_IMAGING_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImagingObservation target) {

			}

			@Override
			protected void updateToPass(ImagingObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImagingObservationOperations.validateImagingObservationMoodCode(
					(ImagingObservation) objectToTest, diagnostician, map);
			}

		};

		validateImagingObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImagingObservationId() {
		OperationsTestCase<ImagingObservation> validateImagingObservationIdTestCase = new OperationsTestCase<ImagingObservation>(
			"validateImagingObservationId",
			operationsForOCL.getOCLValue("VALIDATE_IMAGING_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImagingObservation target) {

			}

			@Override
			protected void updateToPass(ImagingObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImagingObservationOperations.validateImagingObservationId(
					(ImagingObservation) objectToTest, diagnostician, map);
			}

		};

		validateImagingObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImagingObservationCode() {
		OperationsTestCase<ImagingObservation> validateImagingObservationCodeTestCase = new OperationsTestCase<ImagingObservation>(
			"validateImagingObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_IMAGING_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImagingObservation target) {

			}

			@Override
			protected void updateToPass(ImagingObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImagingObservationOperations.validateImagingObservationCode(
					(ImagingObservation) objectToTest, diagnostician, map);
			}

		};

		validateImagingObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImagingObservationStatusCode() {
		OperationsTestCase<ImagingObservation> validateImagingObservationStatusCodeTestCase = new OperationsTestCase<ImagingObservation>(
			"validateImagingObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_IMAGING_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImagingObservation target) {

			}

			@Override
			protected void updateToPass(ImagingObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImagingObservationOperations.validateImagingObservationStatusCode(
					(ImagingObservation) objectToTest, diagnostician, map);
			}

		};

		validateImagingObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImagingObservationEffectiveTime() {
		OperationsTestCase<ImagingObservation> validateImagingObservationEffectiveTimeTestCase = new OperationsTestCase<ImagingObservation>(
			"validateImagingObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_IMAGING_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImagingObservation target) {

			}

			@Override
			protected void updateToPass(ImagingObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImagingObservationOperations.validateImagingObservationEffectiveTime(
					(ImagingObservation) objectToTest, diagnostician, map);
			}

		};

		validateImagingObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImagingObservationValue() {
		OperationsTestCase<ImagingObservation> validateImagingObservationValueTestCase = new OperationsTestCase<ImagingObservation>(
			"validateImagingObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_IMAGING_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImagingObservation target) {

			}

			@Override
			protected void updateToPass(ImagingObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImagingObservationOperations.validateImagingObservationValue(
					(ImagingObservation) objectToTest, diagnostician, map);
			}

		};

		validateImagingObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImagingObservationMethodCode() {
		OperationsTestCase<ImagingObservation> validateImagingObservationMethodCodeTestCase = new OperationsTestCase<ImagingObservation>(
			"validateImagingObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_IMAGING_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImagingObservation target) {

			}

			@Override
			protected void updateToPass(ImagingObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImagingObservationOperations.validateImagingObservationMethodCode(
					(ImagingObservation) objectToTest, diagnostician, map);
			}

		};

		validateImagingObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationTemplateId() {
		OperationsTestCase<ImagingObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<ImagingObservation>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImagingObservation target) {

			}

			@Override
			protected void updateToPass(ImagingObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImagingObservationOperations.validateProblemObservationTemplateId(
					(ImagingObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationStatusCode() {
		OperationsTestCase<ImagingObservation> validateProblemObservationStatusCodeTestCase = new OperationsTestCase<ImagingObservation>(
			"validateProblemObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImagingObservation target) {

			}

			@Override
			protected void updateToPass(ImagingObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImagingObservationOperations.validateProblemObservationStatusCode(
					(ImagingObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImagingObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ImagingObservation> {
		public ImagingObservation create() {
			return PhcrFactory.eINSTANCE.createImagingObservation();
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
	private static class ConstructorTestClass extends ImagingObservationOperations {
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

} // ImagingObservationOperations
