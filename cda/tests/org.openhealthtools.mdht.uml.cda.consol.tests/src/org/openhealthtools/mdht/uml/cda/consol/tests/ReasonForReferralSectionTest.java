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
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReasonForReferralSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Referral Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#getConditions() <em>Get Conditions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#getResults() <em>Get Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#getProblemEntries() <em>Get Problem Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReasonForReferralSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionTemplateId() {
		OperationsTestCase<ReasonForReferralSection> validateReasonForReferralSectionTemplateIdTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateReasonForReferralSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateReasonForReferralSectionTemplateId(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionCode() {
		OperationsTestCase<ReasonForReferralSection> validateReasonForReferralSectionCodeTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateReasonForReferralSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateReasonForReferralSectionCode(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionCondition() {
		OperationsTestCase<ReasonForReferralSection> validateReasonForReferralSectionConditionTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateReasonForReferralSectionCondition",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateReasonForReferralSectionCondition(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionResult() {
		OperationsTestCase<ReasonForReferralSection> validateReasonForReferralSectionResultTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateReasonForReferralSectionResult",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateReasonForReferralSectionResult(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionResultTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionProblemEntry() {
		OperationsTestCase<ReasonForReferralSection> validateReasonForReferralSectionProblemEntryTestCase = new OperationsTestCase<ReasonForReferralSection>(
			"validateReasonForReferralSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection target) {
				target.init();

				// ProblemEntry entry = IHEFactory.eINSTANCE.createProblemEntry().init();
				// target.addObservation(entry);
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSectionOperations.validateReasonForReferralSectionProblemEntry(
					(ReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConditions() {

		ReasonForReferralSection target = objectFactory.create();
		target.getConditions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResults() {

		ReasonForReferralSection target = objectFactory.create();
		target.getResults();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntries() {

		ReasonForReferralSection target = objectFactory.create();
		target.getProblemEntries();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReasonForReferralSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReasonForReferralSection> {

		public ReasonForReferralSection create() {
			return ConsolFactory.eINSTANCE.createReasonForReferralSection();
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
	private static class ConstructorTestClass extends ReasonForReferralSectionOperations {
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

} // ReasonForReferralSectionOperations
