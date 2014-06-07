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
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.ResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validatePHCRResultObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validatePHCRResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validatePHCRResultObservationSpecimenCollectionProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Specimen Collection Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validatePHCRResultObservationSusceptibilityResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Susceptibility Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#getSpecimenCollectionProcedures() <em>Get Specimen Collection Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#getSusceptibilityResults() <em>Get Susceptibility Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validateResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultObservationClassCode() {
		OperationsTestCase<ResultObservation> validatePHCRResultObservationClassCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validatePHCRResultObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validatePHCRResultObservationClassCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultObservationStatusCode() {
		OperationsTestCase<ResultObservation> validatePHCRResultObservationStatusCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validatePHCRResultObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validatePHCRResultObservationStatusCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultObservationSpecimenCollectionProcedure() {
		OperationsTestCase<ResultObservation> validatePHCRResultObservationSpecimenCollectionProcedureTestCase = new OperationsTestCase<ResultObservation>(
			"validatePHCRResultObservationSpecimenCollectionProcedure",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_OBSERVATION_SPECIMEN_COLLECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validatePHCRResultObservationSpecimenCollectionProcedure(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultObservationSpecimenCollectionProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultObservationSusceptibilityResult() {
		OperationsTestCase<ResultObservation> validatePHCRResultObservationSusceptibilityResultTestCase = new OperationsTestCase<ResultObservation>(
			"validatePHCRResultObservationSusceptibilityResult",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_OBSERVATION_SUSCEPTIBILITY_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validatePHCRResultObservationSusceptibilityResult(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultObservationSusceptibilityResultTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSpecimenCollectionProcedures() {

		ResultObservation target = objectFactory.create();
		target.getSpecimenCollectionProcedures();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSusceptibilityResults() {

		ResultObservation target = objectFactory.create();
		target.getSusceptibilityResults();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTemplateId() {
		OperationsTestCase<ResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationTemplateId(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationStatusCode() {
		OperationsTestCase<ResultObservation> validateResultObservationStatusCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationStatusCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultObservation> {
		public ResultObservation create() {
			return PhcrFactory.eINSTANCE.createResultObservation();
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
	private static class ConstructorTestClass extends ResultObservationOperations {
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

} // ResultObservationOperations
