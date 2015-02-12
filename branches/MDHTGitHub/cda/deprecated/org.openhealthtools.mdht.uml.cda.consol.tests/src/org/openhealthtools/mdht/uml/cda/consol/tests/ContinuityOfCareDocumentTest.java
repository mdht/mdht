/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Person;
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
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author Has Assigned Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author Has Represent Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author</em>}</li>
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
	public void testValidateContinuityOfCareDocumentCodeP() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentCodePTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentCodeP(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected void setDependency(ContinuityOfCareDocument target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocumentCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentCodeTestCase.doValidationTest();
	}

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
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifierTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier",
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

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("1111", "2.16.840.1.113883.6.101"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityIdTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId",
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

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode",
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

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity",
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

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLowTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
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

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHighTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT3_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
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

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventClassCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode",
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

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime",
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

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformer() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer",
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

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTestCase.doValidationTest();
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
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganizationTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ContinuityOfCareDocument target) {
						// Contains an assignedAuthor which does not contain
						// an assignedPerson element or a representedOrganization element
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument target) {
						// assignedPerson element and representedOrganization element
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						Person person = CDAFactory.eINSTANCE.createPerson();
						Organization org = CDAFactory.eINSTANCE.createOrganization();
						aa.setAssignedPerson(person);
						aa.setRepresentedOrganization(org);
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument target) {
						// assignedPerson element only
						target.getAuthors().clear();
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						Person person = CDAFactory.eINSTANCE.createPerson();
						aa.setAssignedPerson(person);
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument target) {
						// representedOrganization element only
						target.getAuthors().clear();
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						Person person = CDAFactory.eINSTANCE.createPerson();
						aa.setAssignedPerson(person);
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganizationTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				aa.setRepresentedOrganization(org);
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setNullFlavor(NullFlavor.NA);
				aa.getIds().add(id);
				aa.setRepresentedOrganization(org);
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateContinuityOfCareDocumentAuthorAssignedAuthor() {
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

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAuthorAssignedAuthor(
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
		new ConstructorTestClass();
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
