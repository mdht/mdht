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
import org.openhealthtools.mdht.uml.cda.emspcr.SituationSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.SituationSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Situation Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Complaint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionPossibleInjury(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Possible Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionProviderPrimaryImpression(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Provider Primary Impression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionPrimarySymptom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Primary Symptom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionOtherSymptoms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Other Symptoms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionProviderSecondaryImpressions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Provider Secondary Impressions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionInitialPatientAcuity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Initial Patient Acuity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getComplaints() <em>Get Complaints</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getPossibleInjury() <em>Get Possible Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getProviderPrimaryImpression() <em>Get Provider Primary Impression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getPrimarySymptom() <em>Get Primary Symptom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getOtherSymptoms() <em>Get Other Symptoms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getProviderSecondaryImpressions() <em>Get Provider Secondary Impressions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getInitialPatientAcuity() <em>Get Initial Patient Acuity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SituationSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionTemplateId() {
		OperationsTestCase<SituationSection> validateSituationSectionTemplateIdTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionTemplateId(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionCode() {
		OperationsTestCase<SituationSection> validateSituationSectionCodeTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionCode(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionCodeP() {
		OperationsTestCase<SituationSection> validateSituationSectionCodePTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionCodeP(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionTitle() {
		OperationsTestCase<SituationSection> validateSituationSectionTitleTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionTitle(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionText() {
		OperationsTestCase<SituationSection> validateSituationSectionTextTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionText",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionText(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionComplaint() {
		OperationsTestCase<SituationSection> validateSituationSectionComplaintTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionComplaint",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionComplaint(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionComplaintTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionPossibleInjury() {
		OperationsTestCase<SituationSection> validateSituationSectionPossibleInjuryTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionPossibleInjury",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionPossibleInjury(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionPossibleInjuryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionProviderPrimaryImpression() {
		OperationsTestCase<SituationSection> validateSituationSectionProviderPrimaryImpressionTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionProviderPrimaryImpression",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionProviderPrimaryImpression(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionProviderPrimaryImpressionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionPrimarySymptom() {
		OperationsTestCase<SituationSection> validateSituationSectionPrimarySymptomTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionPrimarySymptom",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionPrimarySymptom(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionPrimarySymptomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionOtherSymptoms() {
		OperationsTestCase<SituationSection> validateSituationSectionOtherSymptomsTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionOtherSymptoms",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionOtherSymptoms(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionOtherSymptomsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionProviderSecondaryImpressions() {
		OperationsTestCase<SituationSection> validateSituationSectionProviderSecondaryImpressionsTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionProviderSecondaryImpressions",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionProviderSecondaryImpressions(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionProviderSecondaryImpressionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSituationSectionInitialPatientAcuity() {
		OperationsTestCase<SituationSection> validateSituationSectionInitialPatientAcuityTestCase = new OperationsTestCase<SituationSection>(
			"validateSituationSectionInitialPatientAcuity",
			operationsForOCL.getOCLValue("VALIDATE_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SituationSection target) {

			}

			@Override
			protected void updateToPass(SituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SituationSectionOperations.validateSituationSectionInitialPatientAcuity(
					(SituationSection) objectToTest, diagnostician, map);
			}

		};

		validateSituationSectionInitialPatientAcuityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetComplaints() {

		SituationSection target = objectFactory.create();
		target.getComplaints();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPossibleInjury() {

		SituationSection target = objectFactory.create();
		target.getPossibleInjury();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProviderPrimaryImpression() {

		SituationSection target = objectFactory.create();
		target.getProviderPrimaryImpression();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPrimarySymptom() {

		SituationSection target = objectFactory.create();
		target.getPrimarySymptom();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetOtherSymptoms() {

		SituationSection target = objectFactory.create();
		target.getOtherSymptoms();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProviderSecondaryImpressions() {

		SituationSection target = objectFactory.create();
		target.getProviderSecondaryImpressions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInitialPatientAcuity() {

		SituationSection target = objectFactory.create();
		target.getInitialPatientAcuity();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SituationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SituationSection> {
		public SituationSection create() {
			return EmspcrFactory.eINSTANCE.createSituationSection();
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
	private static class ConstructorTestClass extends SituationSectionOperations {
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

} // SituationSectionOperations
