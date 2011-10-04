/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedReasonForReferralSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Reason For Referral Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection#validateCodedReasonForReferralSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection#validateCodedReasonForReferralSectionSimpleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Simple Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection#validateCodedReasonForReferralSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection#getSimpleObservations() <em>Get Simple Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection#getProblemEntries() <em>Get Problem Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CodedReasonForReferralSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedReasonForReferralSectionTemplateId() {
		OperationsTestCase<CodedReasonForReferralSection> validateCodedReasonForReferralSectionTemplateIdTestCase = new OperationsTestCase<CodedReasonForReferralSection>(
			"validateCodedReasonForReferralSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(CodedReasonForReferralSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedReasonForReferralSectionOperations.validateCodedReasonForReferralSectionTemplateId(
					(CodedReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedReasonForReferralSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedReasonForReferralSectionSimpleObservation() {
		OperationsTestCase<CodedReasonForReferralSection> validateCodedReasonForReferralSectionSimpleObservationTestCase = new OperationsTestCase<CodedReasonForReferralSection>(
			"validateCodedReasonForReferralSectionSimpleObservation",
			operationsForOCL.getOCLValue("VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(CodedReasonForReferralSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedReasonForReferralSectionOperations.validateCodedReasonForReferralSectionSimpleObservation(
					(CodedReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedReasonForReferralSectionSimpleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedReasonForReferralSectionProblemEntry() {
		OperationsTestCase<CodedReasonForReferralSection> validateCodedReasonForReferralSectionProblemEntryTestCase = new OperationsTestCase<CodedReasonForReferralSection>(
			"validateCodedReasonForReferralSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedReasonForReferralSection target) {

			}

			@Override
			protected void updateToPass(CodedReasonForReferralSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedReasonForReferralSectionOperations.validateCodedReasonForReferralSectionProblemEntry(
					(CodedReasonForReferralSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedReasonForReferralSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSimpleObservations() {

		CodedReasonForReferralSection target = objectFactory.create();
		target.getSimpleObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntries() {

		CodedReasonForReferralSection target = objectFactory.create();
		target.getProblemEntries();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CodedReasonForReferralSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CodedReasonForReferralSection> {
		public CodedReasonForReferralSection create() {
			return IHEFactory.eINSTANCE.createCodedReasonForReferralSection();
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
	private static class ConstructorTestClass extends CodedReasonForReferralSectionOperations {
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

} // CodedReasonForReferralSectionOperations
