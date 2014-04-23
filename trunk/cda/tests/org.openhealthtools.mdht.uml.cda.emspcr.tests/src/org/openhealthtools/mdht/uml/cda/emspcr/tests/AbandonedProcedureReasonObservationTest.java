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
import org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.AbandonedProcedureReasonObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Abandoned Procedure Reason Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AbandonedProcedureReasonObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbandonedProcedureReasonObservationTemplateId() {
		OperationsTestCase<AbandonedProcedureReasonObservation> validateAbandonedProcedureReasonObservationTemplateIdTestCase = new OperationsTestCase<AbandonedProcedureReasonObservation>(
			"validateAbandonedProcedureReasonObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbandonedProcedureReasonObservation target) {

			}

			@Override
			protected void updateToPass(AbandonedProcedureReasonObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationTemplateId(
					(AbandonedProcedureReasonObservation) objectToTest, diagnostician, map);
			}

		};

		validateAbandonedProcedureReasonObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbandonedProcedureReasonObservationMoodCode() {
		OperationsTestCase<AbandonedProcedureReasonObservation> validateAbandonedProcedureReasonObservationMoodCodeTestCase = new OperationsTestCase<AbandonedProcedureReasonObservation>(
			"validateAbandonedProcedureReasonObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbandonedProcedureReasonObservation target) {

			}

			@Override
			protected void updateToPass(AbandonedProcedureReasonObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationMoodCode(
					(AbandonedProcedureReasonObservation) objectToTest, diagnostician, map);
			}

		};

		validateAbandonedProcedureReasonObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbandonedProcedureReasonObservationCodeP() {
		OperationsTestCase<AbandonedProcedureReasonObservation> validateAbandonedProcedureReasonObservationCodePTestCase = new OperationsTestCase<AbandonedProcedureReasonObservation>(
			"validateAbandonedProcedureReasonObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbandonedProcedureReasonObservation target) {

			}

			@Override
			protected void updateToPass(AbandonedProcedureReasonObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationCodeP(
					(AbandonedProcedureReasonObservation) objectToTest, diagnostician, map);
			}

		};

		validateAbandonedProcedureReasonObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbandonedProcedureReasonObservationCode() {
		OperationsTestCase<AbandonedProcedureReasonObservation> validateAbandonedProcedureReasonObservationCodeTestCase = new OperationsTestCase<AbandonedProcedureReasonObservation>(
			"validateAbandonedProcedureReasonObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbandonedProcedureReasonObservation target) {

			}

			@Override
			protected void updateToPass(AbandonedProcedureReasonObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(AbandonedProcedureReasonObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationCode(
					(AbandonedProcedureReasonObservation) objectToTest, diagnostician, map);
			}

		};

		validateAbandonedProcedureReasonObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbandonedProcedureReasonObservationValue() {
		OperationsTestCase<AbandonedProcedureReasonObservation> validateAbandonedProcedureReasonObservationValueTestCase = new OperationsTestCase<AbandonedProcedureReasonObservation>(
			"validateAbandonedProcedureReasonObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbandonedProcedureReasonObservation target) {

			}

			@Override
			protected void updateToPass(AbandonedProcedureReasonObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationValue(
					(AbandonedProcedureReasonObservation) objectToTest, diagnostician, map);
			}

		};

		validateAbandonedProcedureReasonObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbandonedProcedureReasonObservationValueP() {
		OperationsTestCase<AbandonedProcedureReasonObservation> validateAbandonedProcedureReasonObservationValuePTestCase = new OperationsTestCase<AbandonedProcedureReasonObservation>(
			"validateAbandonedProcedureReasonObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbandonedProcedureReasonObservation target) {

			}

			@Override
			protected void updateToPass(AbandonedProcedureReasonObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationValueP(
					(AbandonedProcedureReasonObservation) objectToTest, diagnostician, map);
			}

		};

		validateAbandonedProcedureReasonObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AbandonedProcedureReasonObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AbandonedProcedureReasonObservation> {
		public AbandonedProcedureReasonObservation create() {
			return EmspcrFactory.eINSTANCE.createAbandonedProcedureReasonObservation();
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
	private static class ConstructorTestClass extends AbandonedProcedureReasonObservationOperations {
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

} // AbandonedProcedureReasonObservationOperations
