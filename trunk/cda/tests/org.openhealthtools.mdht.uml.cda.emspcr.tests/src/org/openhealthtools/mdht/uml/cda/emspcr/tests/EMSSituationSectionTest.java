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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSSituationSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Situation Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Complaint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionPossibleInjury(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Possible Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionProviderPrimaryImpression(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Provider Primary Impression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionPrimarySymptom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Primary Symptom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionOtherSymptoms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Other Symptoms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionProviderSecondaryImpressions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Provider Secondary Impressions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionInitialPatientAcuity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Initial Patient Acuity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getComplaints() <em>Get Complaints</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getPossibleInjury() <em>Get Possible Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getProviderPrimaryImpression() <em>Get Provider Primary Impression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getPrimarySymptom() <em>Get Primary Symptom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getOtherSymptoms() <em>Get Other Symptoms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getProviderSecondaryImpressions() <em>Get Provider Secondary Impressions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getInitialPatientAcuity() <em>Get Initial Patient Acuity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSSituationSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionTemplateId() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionTemplateIdTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionTemplateId(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionCode() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionCodeTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionCode(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionCodeP() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionCodePTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionCodeP(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionTitle() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionTitleTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionTitle(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionText() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionTextTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionText(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionComplaint() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionComplaintTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionComplaint",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionComplaint(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionComplaintTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionPossibleInjury() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionPossibleInjuryTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionPossibleInjury",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionPossibleInjury(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionPossibleInjuryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionProviderPrimaryImpression() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionProviderPrimaryImpressionTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionProviderPrimaryImpression",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionProviderPrimaryImpression(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionProviderPrimaryImpressionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionPrimarySymptom() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionPrimarySymptomTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionPrimarySymptom",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionPrimarySymptom(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionPrimarySymptomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionOtherSymptoms() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionOtherSymptomsTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionOtherSymptoms",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionOtherSymptoms(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionOtherSymptomsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionProviderSecondaryImpressions() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionProviderSecondaryImpressionsTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionProviderSecondaryImpressions",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionProviderSecondaryImpressions(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionProviderSecondaryImpressionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionInitialPatientAcuity() {
		OperationsTestCase<EMSSituationSection> validateEMSSituationSectionInitialPatientAcuityTestCase = new OperationsTestCase<EMSSituationSection>(
			"validateEMSSituationSectionInitialPatientAcuity",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSituationSection target) {

			}

			@Override
			protected void updateToPass(EMSSituationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSituationSectionOperations.validateEMSSituationSectionInitialPatientAcuity(
					(EMSSituationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSituationSectionInitialPatientAcuityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetComplaints() {

		EMSSituationSection target = objectFactory.create();
		target.getComplaints();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPossibleInjury() {

		EMSSituationSection target = objectFactory.create();
		target.getPossibleInjury();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProviderPrimaryImpression() {

		EMSSituationSection target = objectFactory.create();
		target.getProviderPrimaryImpression();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPrimarySymptom() {

		EMSSituationSection target = objectFactory.create();
		target.getPrimarySymptom();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetOtherSymptoms() {

		EMSSituationSection target = objectFactory.create();
		target.getOtherSymptoms();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProviderSecondaryImpressions() {

		EMSSituationSection target = objectFactory.create();
		target.getProviderSecondaryImpressions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInitialPatientAcuity() {

		EMSSituationSection target = objectFactory.create();
		target.getInitialPatientAcuity();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSSituationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSSituationSection> {
		public EMSSituationSection create() {
			return EmspcrFactory.eINSTANCE.createEMSSituationSection();
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
	private static class ConstructorTestClass extends EMSSituationSectionOperations {
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

} // EMSSituationSectionOperations
