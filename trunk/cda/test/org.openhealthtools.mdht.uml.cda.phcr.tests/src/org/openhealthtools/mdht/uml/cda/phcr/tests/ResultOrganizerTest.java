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
import org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultOrganizerOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#validatePHCRResultOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#validatePHCRResultOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#validatePHCRResultOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#validatePHCRResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#validatePHCRResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#validatePHCRResultOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#validatePHCRResultOrganizerResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Organizer Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#validatePHCRResultOrganizerSpecimenCollectionProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Organizer Specimen Collection Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#getPHCRResultObservations() <em>Get PHCR Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#getSpecimenCollectionProcedure() <em>Get Specimen Collection Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer#validateResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultOrganizerClassCode() {
		OperationsTestCase<ResultOrganizer> validatePHCRResultOrganizerClassCodeTestCase = new OperationsTestCase<ResultOrganizer>(
			"validatePHCRResultOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validatePHCRResultOrganizerClassCode(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultOrganizerMoodCode() {
		OperationsTestCase<ResultOrganizer> validatePHCRResultOrganizerMoodCodeTestCase = new OperationsTestCase<ResultOrganizer>(
			"validatePHCRResultOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validatePHCRResultOrganizerMoodCode(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultOrganizerId() {
		OperationsTestCase<ResultOrganizer> validatePHCRResultOrganizerIdTestCase = new OperationsTestCase<ResultOrganizer>(
			"validatePHCRResultOrganizerId",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validatePHCRResultOrganizerId(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultOrganizerIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultOrganizerCode() {
		OperationsTestCase<ResultOrganizer> validatePHCRResultOrganizerCodeTestCase = new OperationsTestCase<ResultOrganizer>(
			"validatePHCRResultOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validatePHCRResultOrganizerCode(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultOrganizerStatusCode() {
		OperationsTestCase<ResultOrganizer> validatePHCRResultOrganizerStatusCodeTestCase = new OperationsTestCase<ResultOrganizer>(
			"validatePHCRResultOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validatePHCRResultOrganizerStatusCode(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultOrganizerEffectiveTime() {
		OperationsTestCase<ResultOrganizer> validatePHCRResultOrganizerEffectiveTimeTestCase = new OperationsTestCase<ResultOrganizer>(
			"validatePHCRResultOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validatePHCRResultOrganizerEffectiveTime(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultOrganizerEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultOrganizerResultObservation() {
		OperationsTestCase<ResultOrganizer> validatePHCRResultOrganizerResultObservationTestCase = new OperationsTestCase<ResultOrganizer>(
			"validatePHCRResultOrganizerResultObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_ORGANIZER_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validatePHCRResultOrganizerResultObservation(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultOrganizerResultObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHCRResultOrganizerSpecimenCollectionProcedure() {
		OperationsTestCase<ResultOrganizer> validatePHCRResultOrganizerSpecimenCollectionProcedureTestCase = new OperationsTestCase<ResultOrganizer>(
			"validatePHCRResultOrganizerSpecimenCollectionProcedure",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RESULT_ORGANIZER_SPECIMEN_COLLECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validatePHCRResultOrganizerSpecimenCollectionProcedure(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePHCRResultOrganizerSpecimenCollectionProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPHCRResultObservations() {

		ResultOrganizer target = objectFactory.create();
		target.getPHCRResultObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSpecimenCollectionProcedure() {

		ResultOrganizer target = objectFactory.create();
		target.getSpecimenCollectionProcedure();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerTemplateId() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<ResultOrganizer>(
			"validateResultOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validateResultOrganizerTemplateId(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerStatusCode() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerStatusCodeTestCase = new OperationsTestCase<ResultOrganizer>(
			"validateResultOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validateResultOrganizerStatusCode(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultOrganizer> {
		public ResultOrganizer create() {
			return PhcrFactory.eINSTANCE.createResultOrganizer();
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
	private static class ConstructorTestClass extends ResultOrganizerOperations {
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

} // ResultOrganizerOperations
