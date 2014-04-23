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
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedureSuccessfulObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Successful Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservation#validateProcedureSuccessfulObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Successful Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservation#validateProcedureSuccessfulObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Successful Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservation#validateProcedureSuccessfulObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Successful Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservation#validateProcedureSuccessfulObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Successful Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservation#validateProcedureSuccessfulObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Successful Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureSuccessfulObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureSuccessfulObservationTemplateId() {
		OperationsTestCase<ProcedureSuccessfulObservation> validateProcedureSuccessfulObservationTemplateIdTestCase = new OperationsTestCase<ProcedureSuccessfulObservation>(
			"validateProcedureSuccessfulObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SUCCESSFUL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureSuccessfulObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureSuccessfulObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureSuccessfulObservationOperations.validateProcedureSuccessfulObservationTemplateId(
					(ProcedureSuccessfulObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSuccessfulObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureSuccessfulObservationMoodCode() {
		OperationsTestCase<ProcedureSuccessfulObservation> validateProcedureSuccessfulObservationMoodCodeTestCase = new OperationsTestCase<ProcedureSuccessfulObservation>(
			"validateProcedureSuccessfulObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SUCCESSFUL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureSuccessfulObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureSuccessfulObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureSuccessfulObservationOperations.validateProcedureSuccessfulObservationMoodCode(
					(ProcedureSuccessfulObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSuccessfulObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureSuccessfulObservationCodeP() {
		OperationsTestCase<ProcedureSuccessfulObservation> validateProcedureSuccessfulObservationCodePTestCase = new OperationsTestCase<ProcedureSuccessfulObservation>(
			"validateProcedureSuccessfulObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SUCCESSFUL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureSuccessfulObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureSuccessfulObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureSuccessfulObservationOperations.validateProcedureSuccessfulObservationCodeP(
					(ProcedureSuccessfulObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSuccessfulObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureSuccessfulObservationCode() {
		OperationsTestCase<ProcedureSuccessfulObservation> validateProcedureSuccessfulObservationCodeTestCase = new OperationsTestCase<ProcedureSuccessfulObservation>(
			"validateProcedureSuccessfulObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SUCCESSFUL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureSuccessfulObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureSuccessfulObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(ProcedureSuccessfulObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureSuccessfulObservationOperations.validateProcedureSuccessfulObservationCode(
					(ProcedureSuccessfulObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSuccessfulObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureSuccessfulObservationValue() {
		OperationsTestCase<ProcedureSuccessfulObservation> validateProcedureSuccessfulObservationValueTestCase = new OperationsTestCase<ProcedureSuccessfulObservation>(
			"validateProcedureSuccessfulObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SUCCESSFUL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureSuccessfulObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureSuccessfulObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureSuccessfulObservationOperations.validateProcedureSuccessfulObservationValue(
					(ProcedureSuccessfulObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSuccessfulObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureSuccessfulObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureSuccessfulObservation> {
		public ProcedureSuccessfulObservation create() {
			return EmspcrFactory.eINSTANCE.createProcedureSuccessfulObservation();
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
	private static class ConstructorTestClass extends ProcedureSuccessfulObservationOperations {
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

} // ProcedureSuccessfulObservationOperations
