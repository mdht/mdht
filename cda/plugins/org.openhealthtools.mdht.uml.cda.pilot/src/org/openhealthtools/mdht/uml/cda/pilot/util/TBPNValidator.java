/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.pilot.PilotPlugin;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultObservation;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultOrganizer;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection;
import org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage
 * @generated
 */
public class TBPNValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TBPNValidator INSTANCE = new TBPNValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.pilot";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Follow Up Progress Note Patient Names' of 'Tuberculosis Follow Up Progress Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE__TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_PATIENT_NAMES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Follow Up Progress Note Template Id' of 'Tuberculosis Follow Up Progress Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE__TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TEMPLATE_ID = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Follow Up Progress Note TB Results Section' of 'Tuberculosis Follow Up Progress Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE__TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TB_RESULTS_SECTION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate TB Result Organizer TB Result Observation' of 'TB Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULT_ORGANIZER__TB_RESULT_ORGANIZER_TB_RESULT_OBSERVATION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'TB Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'TB Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULT_ORGANIZER__RESULT_ORGANIZER_CODE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate TB Results Section Text' of 'TB Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULTS_SECTION__TB_RESULTS_SECTION_TEXT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate TB Results Section Title' of 'TB Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULTS_SECTION__TB_RESULTS_SECTION_TITLE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate TB Results Section TB Result Organizer' of 'TB Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULTS_SECTION__TB_RESULTS_SECTION_TB_RESULT_ORGANIZER = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate TB Results Section TB Result Observation' of 'TB Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULTS_SECTION__TB_RESULTS_SECTION_TB_RESULT_OBSERVATION = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'TB Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Code' of 'TB Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULTS_SECTION__RESULTS_SECTION_CODE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate TB Result Observation Class Code' of 'TB Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULT_OBSERVATION__TB_RESULT_OBSERVATION_CLASS_CODE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'TB Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'TB Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULT_OBSERVATION__RESULT_OBSERVATION_CODE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Status Code' of 'TB Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TB_RESULT_OBSERVATION__RESULT_OBSERVATION_STATUS_CODE = 16;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 16;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCDValidator ccdValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBPNValidator() {
		super();
		ccdValidator = CCDValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TBPNPackage.eINSTANCE;
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
			case TBPNPackage.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE:
				return validateTuberculosisFollowUpProgressNote((TuberculosisFollowUpProgressNote)value, diagnostics, context);
			case TBPNPackage.TB_RESULTS_SECTION:
				return validateTBResultsSection((TBResultsSection)value, diagnostics, context);
			case TBPNPackage.TB_RESULT_ORGANIZER:
				return validateTBResultOrganizer((TBResultOrganizer)value, diagnostics, context);
			case TBPNPackage.TB_RESULT_OBSERVATION:
				return validateTBResultObservation((TBResultObservation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisFollowUpProgressNote(TuberculosisFollowUpProgressNote tuberculosisFollowUpProgressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tuberculosisFollowUpProgressNote, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisFollowUpProgressNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisFollowUpProgressNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisFollowUpProgressNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tuberculosisFollowUpProgressNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisFollowUpProgressNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisFollowUpProgressNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisFollowUpProgressNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisFollowUpProgressNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisFollowUpProgressNote_validateTuberculosisFollowUpProgressNotePatientNames(tuberculosisFollowUpProgressNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisFollowUpProgressNote_validateTuberculosisFollowUpProgressNoteTemplateId(tuberculosisFollowUpProgressNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisFollowUpProgressNote_validateTuberculosisFollowUpProgressNoteTBResultsSection(tuberculosisFollowUpProgressNote, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTuberculosisFollowUpProgressNotePatientNames constraint of '<em>Tuberculosis Follow Up Progress Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisFollowUpProgressNote_validateTuberculosisFollowUpProgressNotePatientNames(TuberculosisFollowUpProgressNote tuberculosisFollowUpProgressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tuberculosisFollowUpProgressNote.validateTuberculosisFollowUpProgressNotePatientNames(diagnostics, context);
	}

	/**
	 * Validates the validateTuberculosisFollowUpProgressNoteTemplateId constraint of '<em>Tuberculosis Follow Up Progress Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisFollowUpProgressNote_validateTuberculosisFollowUpProgressNoteTemplateId(TuberculosisFollowUpProgressNote tuberculosisFollowUpProgressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tuberculosisFollowUpProgressNote.validateTuberculosisFollowUpProgressNoteTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateTuberculosisFollowUpProgressNoteTBResultsSection constraint of '<em>Tuberculosis Follow Up Progress Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisFollowUpProgressNote_validateTuberculosisFollowUpProgressNoteTBResultsSection(TuberculosisFollowUpProgressNote tuberculosisFollowUpProgressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tuberculosisFollowUpProgressNote.validateTuberculosisFollowUpProgressNoteTBResultsSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultOrganizer(TBResultOrganizer tbResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tbResultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultOrganizer_validateResultOrganizerTemplateId(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultOrganizer_validateResultOrganizerCode(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerStatusCode(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(tbResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultOrganizer_validateTBResultOrganizerTBResultObservation(tbResultOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTBResultOrganizerTBResultObservation constraint of '<em>TB Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultOrganizer_validateTBResultOrganizerTBResultObservation(TBResultOrganizer tbResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tbResultOrganizer.validateTBResultOrganizerTBResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>TB Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultOrganizer_validateResultOrganizerTemplateId(TBResultOrganizer tbResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultOrganizerTemplateId", getObjectLabel(tbResultOrganizer, context) },
						 new Object[] { tbResultOrganizer },
						 context));
			}
			return false;
		}
		return ccdValidator.validateResultOrganizer_validateResultOrganizerTemplateId(tbResultOrganizer, diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerCode constraint of '<em>TB Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultOrganizer_validateResultOrganizerCode(TBResultOrganizer tbResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultOrganizerCode", getObjectLabel(tbResultOrganizer, context) },
						 new Object[] { tbResultOrganizer },
						 context));
			}
			return false;
		}
		return ccdValidator.validateResultOrganizer_validateResultOrganizerCode(tbResultOrganizer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultsSection(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tbResultsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultsSection_validateResultsSectionTemplateId(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultsSection_validateResultsSectionCode(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultsSection_validateTBResultsSectionText(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultsSection_validateTBResultsSectionTitle(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultsSection_validateTBResultsSectionTBResultOrganizer(tbResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultsSection_validateTBResultsSectionTBResultObservation(tbResultsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTBResultsSectionText constraint of '<em>TB Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultsSection_validateTBResultsSectionText(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tbResultsSection.validateTBResultsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateTBResultsSectionTitle constraint of '<em>TB Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultsSection_validateTBResultsSectionTitle(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tbResultsSection.validateTBResultsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateTBResultsSectionTBResultOrganizer constraint of '<em>TB Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultsSection_validateTBResultsSectionTBResultOrganizer(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tbResultsSection.validateTBResultsSectionTBResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateTBResultsSectionTBResultObservation constraint of '<em>TB Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultsSection_validateTBResultsSectionTBResultObservation(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tbResultsSection.validateTBResultsSectionTBResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>TB Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultsSection_validateResultsSectionTemplateId(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultsSectionTemplateId", getObjectLabel(tbResultsSection, context) },
						 new Object[] { tbResultsSection },
						 context));
			}
			return false;
		}
		return ccdValidator.validateResultsSection_validateResultsSectionTemplateId(tbResultsSection, diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionCode constraint of '<em>TB Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultsSection_validateResultsSectionCode(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultsSectionCode", getObjectLabel(tbResultsSection, context) },
						 new Object[] { tbResultsSection },
						 context));
			}
			return false;
		}
		return ccdValidator.validateResultsSection_validateResultsSectionCode(tbResultsSection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultObservation(TBResultObservation tbResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tbResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultObservation_validateResultObservationTemplateId(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultObservation_validateResultObservationStatusCode(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultObservation_validateResultObservationCode(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(tbResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBResultObservation_validateTBResultObservationClassCode(tbResultObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTBResultObservationClassCode constraint of '<em>TB Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultObservation_validateTBResultObservationClassCode(TBResultObservation tbResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tbResultObservation.validateTBResultObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>TB Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultObservation_validateResultObservationTemplateId(TBResultObservation tbResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultObservationTemplateId", getObjectLabel(tbResultObservation, context) },
						 new Object[] { tbResultObservation },
						 context));
			}
			return false;
		}
		return ccdValidator.validateResultObservation_validateResultObservationTemplateId(tbResultObservation, diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationCode constraint of '<em>TB Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultObservation_validateResultObservationCode(TBResultObservation tbResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultObservationCode", getObjectLabel(tbResultObservation, context) },
						 new Object[] { tbResultObservation },
						 context));
			}
			return false;
		}
		return ccdValidator.validateResultObservation_validateResultObservationCode(tbResultObservation, diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationStatusCode constraint of '<em>TB Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultObservation_validateResultObservationStatusCode(TBResultObservation tbResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultObservationStatusCode", getObjectLabel(tbResultObservation, context) },
						 new Object[] { tbResultObservation },
						 context));
			}
			return false;
		}
		return ccdValidator.validateResultObservation_validateResultObservationStatusCode(tbResultObservation, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PilotPlugin.INSTANCE;
	}

} //TBPNValidator
