/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage
 * @generated
 */
public class CCDValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CCDValidator INSTANCE = new CCDValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.ccd";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document template Id' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document code' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_CODE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document title' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_TITLE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act template Id' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_TEMPLATE_ID = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act code' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Observation template Id' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Section template Id' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_TEMPLATE_ID = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Status template Id' of 'Problem Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS__PROBLEM_STATUS_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Health Status template Id' of 'Problem Health Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_HEALTH_STATUS__PROBLEM_HEALTH_STATUS_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Episode Observation template Id' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_TEMPLATE_ID = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Patient Awareness template Id' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_TEMPLATE_ID = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Section template Id' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TEMPLATE_ID = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Section code' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_CODE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Section title' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TITLE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Section text' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TEXT = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Observation template Id' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Organizer template Id' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Organizer template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Observation template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Social History Section template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Social History Observation template Id' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Section template Id' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Immunizations Section template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID = 23;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 23;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CCDPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CCDPackage.CONTINUITY_OF_CARE_DOCUMENT:
				return validateContinuityOfCareDocument((ContinuityOfCareDocument)value, diagnostics, context);
			case CCDPackage.PROBLEM_ACT:
				return validateProblemAct((ProblemAct)value, diagnostics, context);
			case CCDPackage.PROBLEM_OBSERVATION:
				return validateProblemObservation((ProblemObservation)value, diagnostics, context);
			case CCDPackage.PROBLEM_SECTION:
				return validateProblemSection((ProblemSection)value, diagnostics, context);
			case CCDPackage.PROBLEM_STATUS:
				return validateProblemStatus((ProblemStatus)value, diagnostics, context);
			case CCDPackage.PROBLEM_HEALTH_STATUS:
				return validateProblemHealthStatus((ProblemHealthStatus)value, diagnostics, context);
			case CCDPackage.EPISODE_OBSERVATION:
				return validateEpisodeObservation((EpisodeObservation)value, diagnostics, context);
			case CCDPackage.PATIENT_AWARENESS:
				return validatePatientAwareness((PatientAwareness)value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_SECTION:
				return validateFamilyHistorySection((FamilyHistorySection)value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_OBSERVATION:
				return validateFamilyHistoryObservation((FamilyHistoryObservation)value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_ORGANIZER:
				return validateFamilyHistoryOrganizer((FamilyHistoryOrganizer)value, diagnostics, context);
			case CCDPackage.RESULT_ORGANIZER:
				return validateResultOrganizer((ResultOrganizer)value, diagnostics, context);
			case CCDPackage.RESULT_OBSERVATION:
				return validateResultObservation((ResultObservation)value, diagnostics, context);
			case CCDPackage.SOCIAL_HISTORY_SECTION:
				return validateSocialHistorySection((SocialHistorySection)value, diagnostics, context);
			case CCDPackage.SOCIAL_HISTORY_OBSERVATION:
				return validateSocialHistoryObservation((SocialHistoryObservation)value, diagnostics, context);
			case CCDPackage.ENCOUNTERS_SECTION:
				return validateEncountersSection((EncountersSection)value, diagnostics, context);
			case CCDPackage.IMMUNIZATIONS_SECTION:
				return validateImmunizationsSection((ImmunizationsSection)value, diagnostics, context);
			case CCDPackage.ENCOUNTERS_ACTIVITY:
				return validateEncountersActivity((EncountersActivity)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_templateId(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_code(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_title(continuityOfCareDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ContinuityOfCareDocument_templateId constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_templateId(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_templateId(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_code constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_code(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_code(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_title constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_title(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_title(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_templateId(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_code(problemAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemAct_templateId constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_ProblemAct_templateId(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.ProblemAct_templateId(diagnostics, context);
	}

	/**
	 * Validates the ProblemAct_code constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_ProblemAct_code(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.ProblemAct_code(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_ProblemObservation_templateId(problemObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemObservation_templateId constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_ProblemObservation_templateId(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.ProblemObservation_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemSection_ProblemSection_templateId(problemSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemSection_templateId constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_ProblemSection_templateId(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.ProblemSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatus(ProblemStatus problemStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemStatus_ProblemStatus_templateId(problemStatus, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemStatus_templateId constraint of '<em>Problem Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatus_ProblemStatus_templateId(ProblemStatus problemStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatus.ProblemStatus_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemHealthStatus(ProblemHealthStatus problemHealthStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemHealthStatus_ProblemHealthStatus_templateId(problemHealthStatus, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemHealthStatus_templateId constraint of '<em>Problem Health Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemHealthStatus_ProblemHealthStatus_templateId(ProblemHealthStatus problemHealthStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemHealthStatus.ProblemHealthStatus_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_EpisodeObservation_templateId(episodeObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EpisodeObservation_templateId constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_EpisodeObservation_templateId(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.EpisodeObservation_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientAwareness_PatientAwareness_templateId(patientAwareness, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PatientAwareness_templateId constraint of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness_PatientAwareness_templateId(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientAwareness.PatientAwareness_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistorySection_FamilyHistorySection_templateId(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistorySection_FamilyHistorySection_code(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistorySection_FamilyHistorySection_title(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistorySection_FamilyHistorySection_text(familyHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FamilyHistorySection_templateId constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_FamilyHistorySection_templateId(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.FamilyHistorySection_templateId(diagnostics, context);
	}

	/**
	 * Validates the FamilyHistorySection_code constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_FamilyHistorySection_code(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.FamilyHistorySection_code(diagnostics, context);
	}

	/**
	 * Validates the FamilyHistorySection_title constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_FamilyHistorySection_title(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.FamilyHistorySection_title(diagnostics, context);
	}

	/**
	 * Validates the FamilyHistorySection_text constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_FamilyHistorySection_text(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.FamilyHistorySection_text(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_FamilyHistoryObservation_templateId(familyHistoryObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FamilyHistoryObservation_templateId constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_FamilyHistoryObservation_templateId(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.FamilyHistoryObservation_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer(FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryOrganizer_FamilyHistoryOrganizer_templateId(familyHistoryOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FamilyHistoryOrganizer_templateId constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_FamilyHistoryOrganizer_templateId(FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.FamilyHistoryOrganizer_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_ResultOrganizer_templateId(resultOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResultOrganizer_templateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_ResultOrganizer_templateId(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.ResultOrganizer_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_ResultObservation_templateId(resultObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResultObservation_templateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_ResultObservation_templateId(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.ResultObservation_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistorySection_SocialHistorySection_templateId(socialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SocialHistorySection_templateId constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_SocialHistorySection_templateId(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.SocialHistorySection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation(SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistoryObservation_SocialHistoryObservation_templateId(socialHistoryObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SocialHistoryObservation_templateId constraint of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation_SocialHistoryObservation_templateId(SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistoryObservation.SocialHistoryObservation_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_EncountersSection_templateId(encountersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EncountersSection_templateId constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_EncountersSection_templateId(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.EncountersSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_ImmunizationsSection_templateId(immunizationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ImmunizationsSection_templateId constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_ImmunizationsSection_templateId(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.ImmunizationsSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encountersActivity, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CCDPlugin.INSTANCE;
	}

} //CCDValidator
