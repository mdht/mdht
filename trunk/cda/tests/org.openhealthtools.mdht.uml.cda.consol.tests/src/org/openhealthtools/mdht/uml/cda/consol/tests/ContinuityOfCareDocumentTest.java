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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ContinuityOfCareDocumentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentServiceEventRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentLanguageCodeFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentNoTemplateIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document No Template Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasEffectiveTimeSeconds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Effective Time Seconds</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasEffectiveTimeZone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Effective Time Zone</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentOneOrTwoRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document One Or Two Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Assigned Author Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentHealthcareProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Healthcare Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ContinuityOfCareDocumentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentServiceEventRequired() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentServiceEventRequiredTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentServiceEventRequired",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventRequired(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentServiceEventRequiredTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentServiceEventClassCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentServiceEventClassCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentServiceEventClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventClassCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentServiceEventEffectiveTime() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentServiceEventEffectiveTimeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentServiceEventEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventEffectiveTime(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentLanguageCodeFormat() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentLanguageCodeFormatTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentLanguageCodeFormat",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentLanguageCodeFormat(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentLanguageCodeFormatTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentNoTemplateIdExtension() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentNoTemplateIdExtensionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentNoTemplateIdExtension",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentNoTemplateIdExtension(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentNoTemplateIdExtensionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentHasEffectiveTimeSeconds() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentHasEffectiveTimeSecondsTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentHasEffectiveTimeSeconds",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasEffectiveTimeSeconds(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentHasEffectiveTimeSecondsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentHasEffectiveTimeZone() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentHasEffectiveTimeZoneTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentHasEffectiveTimeZone",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasEffectiveTimeZone(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentHasEffectiveTimeZoneTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentOneOrTwoRecordTarget() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentOneOrTwoRecordTargetTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentOneOrTwoRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentOneOrTwoRecordTarget(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentOneOrTwoRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentHasAssignedAuthor() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentHasAssignedAuthorTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentHasAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasAssignedAuthor(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentHasAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentHasAssignedAuthorNullFlavor() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentHasAssignedAuthorNullFlavorTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentHasAssignedAuthorNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentHasInformationRecipient() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentHasInformationRecipientTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentHasInformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasInformationRecipient(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentHasInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentHealthcareProvider() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentHealthcareProviderTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentHealthcareProvider",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHealthcareProvider(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentHealthcareProviderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentLanguageCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentLanguageCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentLanguageCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentLanguageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentAdvanceDirectivesSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAdvanceDirectivesSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAdvanceDirectivesSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* AdvanceDirectivesSection */
				AdvanceDirectivesSection section =

				ConsolFactory.eINSTANCE.createAdvanceDirectivesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAdvanceDirectivesSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAdvanceDirectivesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentAllergiesSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAllergiesSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAllergiesSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* AllergiesSection */
				AllergiesSection section =

				ConsolFactory.eINSTANCE.createAllergiesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAllergiesSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAllergiesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentEncountersSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentEncountersSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentEncountersSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* EncountersSection */
				EncountersSection section =

				ConsolFactory.eINSTANCE.createEncountersSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentEncountersSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentEncountersSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentImmunizationsSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentImmunizationsSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				ConsolFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentImmunizationsSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentImmunizationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentPayersSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentPayersSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentPayersSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* PayersSection */
				PayersSection section =

				ConsolFactory.eINSTANCE.createPayersSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPayersSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentPayersSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentMedicationsSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentMedicationsSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				ConsolFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicationsSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentMedicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentPlanOfCareSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentPlanOfCareSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				ConsolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPlanOfCareSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentPlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentProceduresSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentProceduresSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentProceduresSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				ConsolFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProceduresSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentProceduresSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentVitalSignsSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentVitalSignsSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				ConsolFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentVitalSignsSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentFamilyHistorySection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentFamilyHistorySectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				ConsolFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFamilyHistorySection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentSocialHistorySection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentSocialHistorySectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				ConsolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentSocialHistorySection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentSocialHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentResultsSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentResultsSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* ResultsSection */
				ResultsSection section =

				ConsolFactory.eINSTANCE.createResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentResultsSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentResultsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentMedicalEquipmentSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentMedicalEquipmentSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentMedicalEquipmentSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* MedicalEquipmentSection */
				MedicalEquipmentSection section =

				ConsolFactory.eINSTANCE.createMedicalEquipmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicalEquipmentSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentMedicalEquipmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentFunctionalStatusSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentFunctionalStatusSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentFunctionalStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* FunctionalStatusSection */
				FunctionalStatusSection section =

				ConsolFactory.eINSTANCE.createFunctionalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFunctionalStatusSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentFunctionalStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentProblemSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentProblemSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentProblemSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				ConsolFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProblemSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentProblemSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectivesSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getAdvanceDirectivesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getAllergiesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncountersSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getEncountersSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPayersSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getPayersSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getResultsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalEquipmentSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getMedicalEquipmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getFunctionalStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ContinuityOfCareDocument> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateGeneralHeaderConstraintsTemplateId(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateGeneralHeaderConstraintsCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ContinuityOfCareDocumentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ContinuityOfCareDocument> {
		public ContinuityOfCareDocument create() {
			return ConsolFactory.eINSTANCE.createContinuityOfCareDocument();
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
	private static class ConstructorTestClass extends ContinuityOfCareDocumentOperations {
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

} // ContinuityOfCareDocumentOperations
