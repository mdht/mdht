/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.PregnancyHistorySection;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummarySurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryPregnancyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Pregnancy History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryDiagnosticResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#createProblemListSection() <em>Create Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#createMedicationsSection() <em>Create Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPAdvanceDirectivesSection() <em>Get HITSP Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getProblemListSection() <em>Get Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPEncountersSection() <em>Get HITSP Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPImmunizationsSection() <em>Get HITSP Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPPayersSection() <em>Get HITSP Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPMedicationsSection() <em>Get HITSP Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getSurgeriesSection() <em>Get Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPPlanOfCareSection() <em>Get HITSP Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getPregnancyHistorySection() <em>Get Pregnancy History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPVitalSignsSection() <em>Get HITSP Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getDiagnosticResultsSection() <em>Get Diagnostic Results Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientSummaryOperations extends ContinuityOfCareDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.32.1')";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.32.1')
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryTemplateId(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryTemplateId"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Advance Directives Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryAdvanceDirectivesSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryAdvanceDirectivesSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Allergies Reactions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryAllergiesReactionsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryAllergiesReactionsSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Problem List Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryProblemListSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PROBLEM_LIST_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryProblemListSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::EncountersSection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Encounters Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::EncountersSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryEncountersSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ENCOUNTERS_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryEncountersSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryImmunizationsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_IMMUNIZATIONS_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryImmunizationsSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PayersSection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Payers Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PayersSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryPayersSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PAYERS_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryPayersSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicationsSection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicationsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryMedicationsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_MEDICATIONS_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryMedicationsSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SurgeriesSection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Surgeries Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SurgeriesSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummarySurgeriesSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SURGERIES_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummarySurgeriesSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryPlanOfCareSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PLAN_OF_CARE_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryPlanOfCareSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Pregnancy History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::PregnancyHistorySection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Pregnancy History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::PregnancyHistorySection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryPregnancyHistorySection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryPregnancyHistorySection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::VitalSignsSection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::VitalSignsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryVitalSignsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_VITAL_SIGNS_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryVitalSignsSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Diagnostic Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DiagnosticResultsSection))";
	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Diagnostic Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DiagnosticResultsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientSummaryDiagnosticResultsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION,
						 HITSPPlugin.INSTANCE.getString("PatientSummaryDiagnosticResultsSection"),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  ProblemListSection createProblemListSection(PatientSummary patientSummary) {
		ProblemListSection section = HITSPFactory.eINSTANCE.createProblemListSection().init();
		patientSummary.addSection(section);

		section.setTitle(DatatypesFactory.eINSTANCE.createST("Conditions or Problems"));
		
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  MedicationsSection createMedicationsSection(PatientSummary patientSummary) {
		MedicationsSection section = HITSPFactory.eINSTANCE.createMedicationsSection().init();
		patientSummary.addSection(section);
		
		return section;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPAdvanceDirectivesSection(PatientSummary) <em>Get HITSP Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPAdvanceDirectivesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))->asSequence()->first().oclAsType(hitsp::AdvanceDirectivesSection)";
	/**
	 * The cached OCL query for the '{@link #getHITSPAdvanceDirectivesSection(PatientSummary) <em>Get HITSP Advance Directives Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPAdvanceDirectivesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))->asSequence()->first().oclAsType(hitsp::AdvanceDirectivesSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AdvanceDirectivesSection getHITSPAdvanceDirectivesSection(PatientSummary patientSummary) {
		if (GET_HITSP_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(117));
			try {
				GET_HITSP_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY = helper.createQuery(GET_HITSP_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY);
		return (AdvanceDirectivesSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesReactionsSection(PatientSummary) <em>Get Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))->asSequence()->first().oclAsType(hitsp::AllergiesReactionsSection)";
	/**
	 * The cached OCL query for the '{@link #getAllergiesReactionsSection(PatientSummary) <em>Get Allergies Reactions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))->asSequence()->first().oclAsType(hitsp::AllergiesReactionsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AllergiesReactionsSection getAllergiesReactionsSection(PatientSummary patientSummary) {
		if (GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(118));
			try {
				GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY);
		return (AllergiesReactionsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemListSection(PatientSummary) <em>Get Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_LIST_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))->asSequence()->first().oclAsType(hitsp::ProblemListSection)";
	/**
	 * The cached OCL query for the '{@link #getProblemListSection(PatientSummary) <em>Get Problem List Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_LIST_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))->asSequence()->first().oclAsType(hitsp::ProblemListSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ProblemListSection getProblemListSection(PatientSummary patientSummary) {
		if (GET_PROBLEM_LIST_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(119));
			try {
				GET_PROBLEM_LIST_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_QRY);
		return (ProblemListSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPEncountersSection(PatientSummary) <em>Get HITSP Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPEncountersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_ENCOUNTERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::EncountersSection))->asSequence()->first().oclAsType(hitsp::EncountersSection)";
	/**
	 * The cached OCL query for the '{@link #getHITSPEncountersSection(PatientSummary) <em>Get HITSP Encounters Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPEncountersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_ENCOUNTERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::EncountersSection))->asSequence()->first().oclAsType(hitsp::EncountersSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EncountersSection getHITSPEncountersSection(PatientSummary patientSummary) {
		if (GET_HITSP_ENCOUNTERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(120));
			try {
				GET_HITSP_ENCOUNTERS_SECTION__EOCL_QRY = helper.createQuery(GET_HITSP_ENCOUNTERS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_ENCOUNTERS_SECTION__EOCL_QRY);
		return (EncountersSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPImmunizationsSection(PatientSummary) <em>Get HITSP Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPImmunizationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))->asSequence()->first().oclAsType(hitsp::ImmunizationsSection)";
	/**
	 * The cached OCL query for the '{@link #getHITSPImmunizationsSection(PatientSummary) <em>Get HITSP Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPImmunizationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))->asSequence()->first().oclAsType(hitsp::ImmunizationsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ImmunizationsSection getHITSPImmunizationsSection(PatientSummary patientSummary) {
		if (GET_HITSP_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(121));
			try {
				GET_HITSP_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_HITSP_IMMUNIZATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPPayersSection(PatientSummary) <em>Get HITSP Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPPayersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_PAYERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PayersSection))->asSequence()->first().oclAsType(hitsp::PayersSection)";
	/**
	 * The cached OCL query for the '{@link #getHITSPPayersSection(PatientSummary) <em>Get HITSP Payers Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPPayersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_PAYERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PayersSection))->asSequence()->first().oclAsType(hitsp::PayersSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  PayersSection getHITSPPayersSection(PatientSummary patientSummary) {
		if (GET_HITSP_PAYERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(122));
			try {
				GET_HITSP_PAYERS_SECTION__EOCL_QRY = helper.createQuery(GET_HITSP_PAYERS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_PAYERS_SECTION__EOCL_QRY);
		return (PayersSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPMedicationsSection(PatientSummary) <em>Get HITSP Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPMedicationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicationsSection))->asSequence()->first().oclAsType(hitsp::MedicationsSection)";
	/**
	 * The cached OCL query for the '{@link #getHITSPMedicationsSection(PatientSummary) <em>Get HITSP Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPMedicationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicationsSection))->asSequence()->first().oclAsType(hitsp::MedicationsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  MedicationsSection getHITSPMedicationsSection(PatientSummary patientSummary) {
		if (GET_HITSP_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(123));
			try {
				GET_HITSP_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_HITSP_MEDICATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSurgeriesSection(PatientSummary) <em>Get Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeriesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SURGERIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SurgeriesSection))->asSequence()->first().oclAsType(hitsp::SurgeriesSection)";
	/**
	 * The cached OCL query for the '{@link #getSurgeriesSection(PatientSummary) <em>Get Surgeries Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeriesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SURGERIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::SurgeriesSection))->asSequence()->first().oclAsType(hitsp::SurgeriesSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  SurgeriesSection getSurgeriesSection(PatientSummary patientSummary) {
		if (GET_SURGERIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(124));
			try {
				GET_SURGERIES_SECTION__EOCL_QRY = helper.createQuery(GET_SURGERIES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SURGERIES_SECTION__EOCL_QRY);
		return (SurgeriesSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPPlanOfCareSection(PatientSummary) <em>Get HITSP Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPPlanOfCareSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))->asSequence()->first().oclAsType(hitsp::PlanOfCareSection)";
	/**
	 * The cached OCL query for the '{@link #getHITSPPlanOfCareSection(PatientSummary) <em>Get HITSP Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPPlanOfCareSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))->asSequence()->first().oclAsType(hitsp::PlanOfCareSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  PlanOfCareSection getHITSPPlanOfCareSection(PatientSummary patientSummary) {
		if (GET_HITSP_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(125));
			try {
				GET_HITSP_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_HITSP_PLAN_OF_CARE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPregnancyHistorySection(PatientSummary) <em>Get Pregnancy History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREGNANCY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::PregnancyHistorySection))->asSequence()->first().oclAsType(ihe::PregnancyHistorySection)";
	/**
	 * The cached OCL query for the '{@link #getPregnancyHistorySection(PatientSummary) <em>Get Pregnancy History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::PregnancyHistorySection))->asSequence()->first().oclAsType(ihe::PregnancyHistorySection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  PregnancyHistorySection getPregnancyHistorySection(PatientSummary patientSummary) {
		if (GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(126));
			try {
				GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_PREGNANCY_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY);
		return (PregnancyHistorySection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPVitalSignsSection(PatientSummary) <em>Get HITSP Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPVitalSignsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::VitalSignsSection))->asSequence()->first().oclAsType(hitsp::VitalSignsSection)";
	/**
	 * The cached OCL query for the '{@link #getHITSPVitalSignsSection(PatientSummary) <em>Get HITSP Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPVitalSignsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::VitalSignsSection))->asSequence()->first().oclAsType(hitsp::VitalSignsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  VitalSignsSection getHITSPVitalSignsSection(PatientSummary patientSummary) {
		if (GET_HITSP_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(127));
			try {
				GET_HITSP_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_HITSP_VITAL_SIGNS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiagnosticResultsSection(PatientSummary) <em>Get Diagnostic Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticResultsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DiagnosticResultsSection))->asSequence()->first().oclAsType(hitsp::DiagnosticResultsSection)";
	/**
	 * The cached OCL query for the '{@link #getDiagnosticResultsSection(PatientSummary) <em>Get Diagnostic Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticResultsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DiagnosticResultsSection))->asSequence()->first().oclAsType(hitsp::DiagnosticResultsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  DiagnosticResultsSection getDiagnosticResultsSection(PatientSummary patientSummary) {
		if (GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.PATIENT_SUMMARY, HITSPPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(128));
			try {
				GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY);
		return (DiagnosticResultsSection) query.evaluate(patientSummary);
	}

} // PatientSummaryOperations