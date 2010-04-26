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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validateMedicalDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#createProblemListSection() <em>Create Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#createMedicationsSection() <em>Create Medications Section</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateMedicalDocumentTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Document Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalDocumentTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.32.1')";
	/**
	 * The cached OCL invariant for the '{@link #validateMedicalDocumentTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Document Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalDocumentTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean validateMedicalDocumentTemplateId(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PATIENT_SUMMARY__MEDICAL_DOCUMENT_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("MedicalDocumentTemplateId"),
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
	protected static final String VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))";
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
	 * self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))
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
	protected static final String VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))";
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
	 * self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))
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
	protected static final String VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))";
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
	 * self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))
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
	protected static final String VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::EncountersSection))";
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
	 * self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::EncountersSection))
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
	protected static final String VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))";
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
	 * self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))
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
	protected static final String VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PayersSection))";
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
	 * self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PayersSection))
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
	protected static final String VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicationsSection))";
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
	 * self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicationsSection))
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

} // PatientSummaryOperations