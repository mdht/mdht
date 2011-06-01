/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;

import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer#validateResultOrganizerComponentElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Component Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer#validateResultOrganizerInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer#validateResultOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer#validateResultOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer#validateResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer#validateResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer#validateResultOrganizerResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer#getResultObservations() <em>Get Result Observations</em>}</li>
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
	public void testValidateResultOrganizerComponentElement() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerComponentElementTestCase = new OperationsTestCase<ResultOrganizer>(
				"validateResultOrganizerComponentElement",
				operationsForOCL
						.getOCLValue("VALIDATE_RESULT_ORGANIZER_COMPONENT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations
						.validateResultOrganizerComponentElement(
								(ResultOrganizer) objectToTest, diagnostician,
								map);
			}

		};

		validateResultOrganizerComponentElementTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateResultOrganizerInformationSource() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerInformationSourceTestCase = new OperationsTestCase<ResultOrganizer>(
				"validateResultOrganizerInformationSource",
				operationsForOCL
						.getOCLValue("VALIDATE_RESULT_ORGANIZER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations
						.validateResultOrganizerInformationSource(
								(ResultOrganizer) objectToTest, diagnostician,
								map);
			}

		};

		validateResultOrganizerInformationSourceTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateResultOrganizerTemplateId() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<ResultOrganizer>(
				"validateResultOrganizerTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations
						.validateResultOrganizerTemplateId(
								(ResultOrganizer) objectToTest, diagnostician,
								map);
			}

		};

		validateResultOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateResultOrganizerMoodCode() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerMoodCodeTestCase = new OperationsTestCase<ResultOrganizer>(
				"validateResultOrganizerMoodCode",
				operationsForOCL
						.getOCLValue("VALIDATE_RESULT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations
						.validateResultOrganizerMoodCode(
								(ResultOrganizer) objectToTest, diagnostician,
								map);
			}

		};

		validateResultOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateResultOrganizerId() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerIdTestCase = new OperationsTestCase<ResultOrganizer>(
				"validateResultOrganizerId",
				operationsForOCL
						.getOCLValue("VALIDATE_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validateResultOrganizerId(
						(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateResultOrganizerCode() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerCodeTestCase = new OperationsTestCase<ResultOrganizer>(
				"validateResultOrganizerCode",
				operationsForOCL
						.getOCLValue("VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validateResultOrganizerCode(
						(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateResultOrganizerStatusCode() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerStatusCodeTestCase = new OperationsTestCase<ResultOrganizer>(
				"validateResultOrganizerStatusCode",
				operationsForOCL
						.getOCLValue("VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations
						.validateResultOrganizerStatusCode(
								(ResultOrganizer) objectToTest, diagnostician,
								map);
			}

		};

		validateResultOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateResultOrganizerResultObservation() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerResultObservationTestCase = new OperationsTestCase<ResultOrganizer>(
				"validateResultOrganizerResultObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_RESULT_ORGANIZER_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations
						.validateResultOrganizerResultObservation(
								(ResultOrganizer) objectToTest, diagnostician,
								map);
			}

		};

		validateResultOrganizerResultObservationTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends ResultOrganizerOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<ResultOrganizer> {
		public ResultOrganizer create() {
			return CCDFactory.eINSTANCE.createResultOrganizer();
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
	 *
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // ResultOrganizerOperations