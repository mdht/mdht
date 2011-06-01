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
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;

import org.openhealthtools.mdht.uml.cda.ccd.operations.CoverageActivityOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivitySequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityPolicyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Policy Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#getPolicyActivities() <em>Get Policy Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CoverageActivityTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoverageActivityInformationSource() {
		OperationsTestCase<CoverageActivity> validateCoverageActivityInformationSourceTestCase = new OperationsTestCase<CoverageActivity>(
				"validateCoverageActivityInformationSource",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity target) {

			}

			@Override
			protected void updateToPass(CoverageActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityOperations
						.validateCoverageActivityInformationSource(
								(CoverageActivity) objectToTest, diagnostician,
								map);
			}

		};

		validateCoverageActivityInformationSourceTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoverageActivitySequenceNumber() {
		OperationsTestCase<CoverageActivity> validateCoverageActivitySequenceNumberTestCase = new OperationsTestCase<CoverageActivity>(
				"validateCoverageActivitySequenceNumber",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity target) {

			}

			@Override
			protected void updateToPass(CoverageActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityOperations
						.validateCoverageActivitySequenceNumber(
								(CoverageActivity) objectToTest, diagnostician,
								map);
			}

		};

		validateCoverageActivitySequenceNumberTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoverageActivityTemplateId() {
		OperationsTestCase<CoverageActivity> validateCoverageActivityTemplateIdTestCase = new OperationsTestCase<CoverageActivity>(
				"validateCoverageActivityTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity target) {

			}

			@Override
			protected void updateToPass(CoverageActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityOperations
						.validateCoverageActivityTemplateId(
								(CoverageActivity) objectToTest, diagnostician,
								map);
			}

		};

		validateCoverageActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoverageActivityClassCode() {
		OperationsTestCase<CoverageActivity> validateCoverageActivityClassCodeTestCase = new OperationsTestCase<CoverageActivity>(
				"validateCoverageActivityClassCode",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity target) {

			}

			@Override
			protected void updateToPass(CoverageActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityOperations
						.validateCoverageActivityClassCode(
								(CoverageActivity) objectToTest, diagnostician,
								map);
			}

		};

		validateCoverageActivityClassCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoverageActivityMoodCode() {
		OperationsTestCase<CoverageActivity> validateCoverageActivityMoodCodeTestCase = new OperationsTestCase<CoverageActivity>(
				"validateCoverageActivityMoodCode",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity target) {

			}

			@Override
			protected void updateToPass(CoverageActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityOperations
						.validateCoverageActivityMoodCode(
								(CoverageActivity) objectToTest, diagnostician,
								map);
			}

		};

		validateCoverageActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoverageActivityId() {
		OperationsTestCase<CoverageActivity> validateCoverageActivityIdTestCase = new OperationsTestCase<CoverageActivity>(
				"validateCoverageActivityId",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity target) {

			}

			@Override
			protected void updateToPass(CoverageActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityOperations.validateCoverageActivityId(
						(CoverageActivity) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivityIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoverageActivityStatusCode() {
		OperationsTestCase<CoverageActivity> validateCoverageActivityStatusCodeTestCase = new OperationsTestCase<CoverageActivity>(
				"validateCoverageActivityStatusCode",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity target) {

			}

			@Override
			protected void updateToPass(CoverageActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityOperations
						.validateCoverageActivityStatusCode(
								(CoverageActivity) objectToTest, diagnostician,
								map);
			}

		};

		validateCoverageActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoverageActivityCode() {
		OperationsTestCase<CoverageActivity> validateCoverageActivityCodeTestCase = new OperationsTestCase<CoverageActivity>(
				"validateCoverageActivityCode",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity target) {

			}

			@Override
			protected void updateToPass(CoverageActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityOperations.validateCoverageActivityCode(
						(CoverageActivity) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivityCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoverageActivityPolicyActivity() {
		OperationsTestCase<CoverageActivity> validateCoverageActivityPolicyActivityTestCase = new OperationsTestCase<CoverageActivity>(
				"validateCoverageActivityPolicyActivity",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity target) {

			}

			@Override
			protected void updateToPass(CoverageActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityOperations
						.validateCoverageActivityPolicyActivity(
								(CoverageActivity) objectToTest, diagnostician,
								map);
			}

		};

		validateCoverageActivityPolicyActivityTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends CoverageActivityOperations {
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
			TestObjectFactory<CoverageActivity> {
		public CoverageActivity create() {
			return CCDFactory.eINSTANCE.createCoverageActivity();
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

} // CoverageActivityOperations