/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PregnancyObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PregnancyObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationTemplateId() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationTemplateIdTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationTemplateId(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationId() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationIdTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationId(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationStatusCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationStatusCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationStatusCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationRepeatNumber() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationRepeatNumberTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationRepeatNumber(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationValue() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationValueTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationValue(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationInterpretationCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationInterpretationCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationInterpretationCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationMethodCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationMethodCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationMethodCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyObservationTargetSiteCode() {
		OperationsTestCase<PregnancyObservation> validatePregnancyObservationTargetSiteCodeTestCase = new OperationsTestCase<PregnancyObservation>(
			"validatePregnancyObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyObservationOperations.validatePregnancyObservationTargetSiteCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PregnancyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PregnancyObservation> {

		public PregnancyObservation create() {
			return ConsolFactory.eINSTANCE.createPregnancyObservation();
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
	private static class ConstructorTestClass extends PregnancyObservationOperations {
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

} // PregnancyObservationOperations
