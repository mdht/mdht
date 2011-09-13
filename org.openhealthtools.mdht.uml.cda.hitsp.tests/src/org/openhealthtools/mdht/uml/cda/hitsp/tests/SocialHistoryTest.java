/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.SocialHistoryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory#validateSocialHistoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory#validateSocialHistoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory#validateSocialHistoryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory#validateSocialHistoryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistoryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryTemplateId() {
		OperationsTestCase<SocialHistory> validateSocialHistoryTemplateIdTestCase = new OperationsTestCase<SocialHistory>(
			"validateSocialHistoryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistory target) {

			}

			@Override
			protected void updateToPass(SocialHistory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryOperations.validateSocialHistoryTemplateId(
					(SocialHistory) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryCode() {
		OperationsTestCase<SocialHistory> validateSocialHistoryCodeTestCase = new OperationsTestCase<SocialHistory>(
			"validateSocialHistoryCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SocialHistory target) {

			}

			@Override
			protected void updateToPass(SocialHistory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryOperations.validateSocialHistoryCode(
					(SocialHistory) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryEffectiveTime() {
		OperationsTestCase<SocialHistory> validateSocialHistoryEffectiveTimeTestCase = new OperationsTestCase<SocialHistory>(
			"validateSocialHistoryEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistory target) {

			}

			@Override
			protected void updateToPass(SocialHistory target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryOperations.validateSocialHistoryEffectiveTime(
					(SocialHistory) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryText() {
		OperationsTestCase<SocialHistory> validateSocialHistoryTextTestCase = new OperationsTestCase<SocialHistory>(
			"validateSocialHistoryText",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SocialHistory target) {

			}

			@Override
			protected void updateToPass(SocialHistory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryOperations.validateSocialHistoryText(
					(SocialHistory) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SocialHistoryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistory> {
		public SocialHistory create() {
			return HITSPFactory.eINSTANCE.createSocialHistory();
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
	private static class ConstructorTestClass extends SocialHistoryOperations {
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

} // SocialHistoryOperations
