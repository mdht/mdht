/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PastMedicalHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Past Medical History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection#validatePastMedicalHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection#validatePastMedicalHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection#validatePastMedicalHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection#validatePastMedicalHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection#validatePastMedicalHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection#validatePastMedicalHistorySectionExistenceOfHistoryOfCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Existence Of History Of Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection#validatePastMedicalHistorySectionHistoryOfCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section History Of Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection#getExistenceOfHistoryOfCondition() <em>Get Existence Of History Of Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection#getHistoryOfConditions() <em>Get History Of Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PastMedicalHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePastMedicalHistorySectionTemplateId() {
		OperationsTestCase<PastMedicalHistorySection> validatePastMedicalHistorySectionTemplateIdTestCase = new OperationsTestCase<PastMedicalHistorySection>(
			"validatePastMedicalHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionTemplateId(
					(PastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePastMedicalHistorySectionCode() {
		OperationsTestCase<PastMedicalHistorySection> validatePastMedicalHistorySectionCodeTestCase = new OperationsTestCase<PastMedicalHistorySection>(
			"validatePastMedicalHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionCode(
					(PastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePastMedicalHistorySectionCodeP() {
		OperationsTestCase<PastMedicalHistorySection> validatePastMedicalHistorySectionCodePTestCase = new OperationsTestCase<PastMedicalHistorySection>(
			"validatePastMedicalHistorySectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionCodeP(
					(PastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePastMedicalHistorySectionTitle() {
		OperationsTestCase<PastMedicalHistorySection> validatePastMedicalHistorySectionTitleTestCase = new OperationsTestCase<PastMedicalHistorySection>(
			"validatePastMedicalHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionTitle(
					(PastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePastMedicalHistorySectionText() {
		OperationsTestCase<PastMedicalHistorySection> validatePastMedicalHistorySectionTextTestCase = new OperationsTestCase<PastMedicalHistorySection>(
			"validatePastMedicalHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionText(
					(PastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePastMedicalHistorySectionExistenceOfHistoryOfCondition() {
		OperationsTestCase<PastMedicalHistorySection> validatePastMedicalHistorySectionExistenceOfHistoryOfConditionTestCase = new OperationsTestCase<PastMedicalHistorySection>(
			"validatePastMedicalHistorySectionExistenceOfHistoryOfCondition",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_EXISTENCE_OF_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionExistenceOfHistoryOfCondition(
					(PastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionExistenceOfHistoryOfConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePastMedicalHistorySectionHistoryOfCondition() {
		OperationsTestCase<PastMedicalHistorySection> validatePastMedicalHistorySectionHistoryOfConditionTestCase = new OperationsTestCase<PastMedicalHistorySection>(
			"validatePastMedicalHistorySectionHistoryOfCondition",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionHistoryOfCondition(
					(PastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionHistoryOfConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExistenceOfHistoryOfCondition() {

		PastMedicalHistorySection target = objectFactory.create();
		target.getExistenceOfHistoryOfCondition();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfConditions() {

		PastMedicalHistorySection target = objectFactory.create();
		target.getHistoryOfConditions();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PastMedicalHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PastMedicalHistorySection> {
		public PastMedicalHistorySection create() {
			return EmspcrFactory.eINSTANCE.createPastMedicalHistorySection();
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
	private static class ConstructorTestClass extends PastMedicalHistorySectionOperations {
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

} // PastMedicalHistorySectionOperations
