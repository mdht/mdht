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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.ContinuityOfCareDocumentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event3 Performer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event3 Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event3 Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event3 Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event3 Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event3 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event3 Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent3Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event3 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthorAssignedAuthor3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
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
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentLanguageCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentLanguageCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS());
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
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOf() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOf(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentAuthor() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAuthorTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAuthor",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {

				Author author = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAuthor(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAuthorTestCase.doValidationTest();
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
	public void testValidateContinuityOfCareDocumentVitalSignsSectionEntriesOptional() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentVitalSignsSectionEntriesOptionalTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentVitalSignsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* VitalSignsSectionEntriesOptional */
				VitalSignsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentVitalSignsSectionEntriesOptional(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentVitalSignsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityHasNationalProviderIdentifier() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityHasNationalProviderIdentifierTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII("Not2.16.840.1.113883.4.6", "12345"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6", "12345"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityHasNationalProviderIdentifier(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getDocumentationOfs().clear();
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("1111", "2222"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityId() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityIdTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();

				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getDocumentationOfs().clear();

				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6", "12345"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityId(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerTypeCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerTypeCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipFailsTest();

			}

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				perf.setTypeCode(x_ServiceEventPerformer.PRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerTypeCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntity() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();

				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntity(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeLow() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeLowTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("low", "high"));
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeLow(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeHigh() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeHighTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeHigh",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("low", "high"));
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeHigh(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent3ClassCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEvent3ClassCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent3ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setClassCode(ActClassRoot.PCPR);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3ClassCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEvent3ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTime() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				dof.setServiceEvent(se);

				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTime(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEvent3EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent3Performer() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent3Performer",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.getPerformers().add(CDAFactory.eINSTANCE.createPerformer1());
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent3Performer(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEvent3PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentAuthorAssignedAuthor3() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAuthorAssignedAuthor3TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAuthorAssignedAuthor3",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(author);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				target.getAuthors().add(author);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAuthorAssignedAuthor3(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAuthorAssignedAuthor3TestCase.doValidationTest();
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
	public void testValidateContinuityOfCareDocumentImmunizationsSectionEntriesOptional() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentImmunizationsSectionEntriesOptionalTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentImmunizationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* ImmunizationsSectionEntriesOptional */
				ImmunizationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createImmunizationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentImmunizationsSectionEntriesOptional(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentImmunizationsSectionEntriesOptionalTestCase.doValidationTest();
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
	public void testGetVitalSignsSectionEntriesOptional() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getVitalSignsSectionEntriesOptional();

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
	public void testGetImmunizationsSectionEntriesOptional() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getImmunizationsSectionEntriesOptional();

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
