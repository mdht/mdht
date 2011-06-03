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
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PurposeActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Purpose Activity</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityHasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityReasonType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Reason Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#validatePurposeActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Activity Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PurposeActivityTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePurposeActivityHasReason() {
		OperationsTestCase<PurposeActivity> validatePurposeActivityHasReasonTestCase = new OperationsTestCase<PurposeActivity>(
			"validatePurposeActivityHasReason",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeActivity target) {

			}

			@Override
			protected void updateToPass(PurposeActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeActivityOperations.validatePurposeActivityHasReason(
					(PurposeActivity) objectToTest, diagnostician, map);
			}

		};

		validatePurposeActivityHasReasonTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePurposeActivityReasonType() {
		OperationsTestCase<PurposeActivity> validatePurposeActivityReasonTypeTestCase = new OperationsTestCase<PurposeActivity>(
			"validatePurposeActivityReasonType",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeActivity target) {

			}

			@Override
			protected void updateToPass(PurposeActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeActivityOperations.validatePurposeActivityReasonType(
					(PurposeActivity) objectToTest, diagnostician, map);
			}

		};

		validatePurposeActivityReasonTypeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePurposeActivityTemplateId() {
		OperationsTestCase<PurposeActivity> validatePurposeActivityTemplateIdTestCase = new OperationsTestCase<PurposeActivity>(
			"validatePurposeActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeActivity target) {

			}

			@Override
			protected void updateToPass(PurposeActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeActivityOperations.validatePurposeActivityTemplateId(
					(PurposeActivity) objectToTest, diagnostician, map);
			}

		};

		validatePurposeActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePurposeActivityClassCode() {
		OperationsTestCase<PurposeActivity> validatePurposeActivityClassCodeTestCase = new OperationsTestCase<PurposeActivity>(
			"validatePurposeActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeActivity target) {

			}

			@Override
			protected void updateToPass(PurposeActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeActivityOperations.validatePurposeActivityClassCode(
					(PurposeActivity) objectToTest, diagnostician, map);
			}

		};

		validatePurposeActivityClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePurposeActivityMoodCode() {
		OperationsTestCase<PurposeActivity> validatePurposeActivityMoodCodeTestCase = new OperationsTestCase<PurposeActivity>(
			"validatePurposeActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeActivity target) {

			}

			@Override
			protected void updateToPass(PurposeActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeActivityOperations.validatePurposeActivityMoodCode(
					(PurposeActivity) objectToTest, diagnostician, map);
			}

		};

		validatePurposeActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePurposeActivityCode() {
		OperationsTestCase<PurposeActivity> validatePurposeActivityCodeTestCase = new OperationsTestCase<PurposeActivity>(
			"validatePurposeActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeActivity target) {

			}

			@Override
			protected void updateToPass(PurposeActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeActivityOperations.validatePurposeActivityCode(
					(PurposeActivity) objectToTest, diagnostician, map);
			}

		};

		validatePurposeActivityCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePurposeActivityStatusCode() {
		OperationsTestCase<PurposeActivity> validatePurposeActivityStatusCodeTestCase = new OperationsTestCase<PurposeActivity>(
			"validatePurposeActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeActivity target) {

			}

			@Override
			protected void updateToPass(PurposeActivity target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeActivityOperations.validatePurposeActivityStatusCode(
					(PurposeActivity) objectToTest, diagnostician, map);
			}

		};

		validatePurposeActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends PurposeActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PurposeActivity> {
		public PurposeActivity create() {
			return CCDFactory.eINSTANCE.createPurposeActivity();
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
	private static class ConstructorTestClass extends PurposeActivityOperations {
	}

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

} // PurposeActivityOperations
