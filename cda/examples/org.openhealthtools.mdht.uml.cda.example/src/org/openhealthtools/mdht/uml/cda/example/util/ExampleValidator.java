/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.example.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.example.ExamplePackage;
import org.openhealthtools.mdht.uml.cda.example.ExamplePlugin;
import org.openhealthtools.mdht.uml.cda.example.MyDocument;
import org.openhealthtools.mdht.uml.cda.example.MyObservation;
import org.openhealthtools.mdht.uml.cda.example.MySection;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.example.ExamplePackage
 * @generated
 */
public class ExampleValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExampleValidator INSTANCE = new ExampleValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.example";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Document Has Patient Name Given And Family' of 'My Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_DOCUMENT__MY_DOCUMENT_HAS_PATIENT_NAME_GIVEN_AND_FAMILY = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Document Template Id' of 'My Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_DOCUMENT__MY_DOCUMENT_TEMPLATE_ID = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Document My Section' of 'My Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_DOCUMENT__MY_DOCUMENT_MY_SECTION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Template Id' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_TEMPLATE_ID = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Code' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Confidentiality Code' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_CONFIDENTIALITY_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Title' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_TITLE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section My Observation' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_MY_OBSERVATION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Observation Class Code' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__MY_OBSERVATION_CLASS_CODE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Code' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__PROBLEM_OBSERVATION_CODE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Observation Effective Time' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__MY_OBSERVATION_EFFECTIVE_TIME = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Observation Value' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__MY_OBSERVATION_VALUE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Observation Target Site Code' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__MY_OBSERVATION_TARGET_SITE_CODE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 14;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 14;

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
	protected CDTValidator cdtValidator;

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
	public ExampleValidator() {
		super();
		cdtValidator = CDTValidator.INSTANCE;
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
	  return ExamplePackage.eINSTANCE;
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
			case ExamplePackage.MY_DOCUMENT:
				return validateMyDocument((MyDocument)value, diagnostics, context);
			case ExamplePackage.MY_SECTION:
				return validateMySection((MySection)value, diagnostics, context);
			case ExamplePackage.MY_OBSERVATION:
				return validateMyObservation((MyObservation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyDocument(MyDocument myDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(myDocument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyDocument_validateMyDocumentHasPatientNameGivenAndFamily(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyDocument_validateMyDocumentTemplateId(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyDocument_validateMyDocumentMySection(myDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMyDocumentHasPatientNameGivenAndFamily constraint of '<em>My Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyDocument_validateMyDocumentHasPatientNameGivenAndFamily(MyDocument myDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myDocument.validateMyDocumentHasPatientNameGivenAndFamily(diagnostics, context);
	}

	/**
	 * Validates the validateMyDocumentTemplateId constraint of '<em>My Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyDocument_validateMyDocumentTemplateId(MyDocument myDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myDocument.validateMyDocumentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMyDocumentMySection constraint of '<em>My Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyDocument_validateMyDocumentMySection(MyDocument myDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myDocument.validateMyDocumentMySection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_validateMySectionTemplateId(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_validateMySectionCode(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_validateMySectionConfidentialityCode(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_validateMySectionTitle(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_validateMySectionMyObservation(mySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMySectionTemplateId constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionTemplateId(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.validateMySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMySectionCode constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionCode(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.validateMySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateMySectionConfidentialityCode constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionConfidentialityCode(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.validateMySectionConfidentialityCode(diagnostics, context);
	}

	/**
	 * Validates the validateMySectionTitle constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionTitle(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.validateMySectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateMySectionMyObservation constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionMyObservation(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.validateMySectionMyObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation(MyObservation myObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(myObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyObservation_validateProblemObservationTemplateId(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatusObservation(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatusObservation(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyObservation_validateMyObservationClassCode(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyObservation_validateProblemObservationCode(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyObservation_validateMyObservationEffectiveTime(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyObservation_validateMyObservationTargetSiteCode(myObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyObservation_validateMyObservationValue(myObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMyObservationClassCode constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateMyObservationClassCode(MyObservation myObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myObservation.validateMyObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationCode constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateProblemObservationCode(MyObservation myObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myObservation.validateProblemObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateMyObservationEffectiveTime constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateMyObservationEffectiveTime(MyObservation myObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myObservation.validateMyObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateMyObservationValue constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateMyObservationValue(MyObservation myObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myObservation.validateMyObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateMyObservationTargetSiteCode constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateMyObservationTargetSiteCode(MyObservation myObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myObservation.validateMyObservationTargetSiteCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateProblemObservationTemplateId(MyObservation myObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateProblemObservationTemplateId", getObjectLabel(myObservation, context) },
						 new Object[] { myObservation },
						 context));
			}
			return false;
		}
		return ccdValidator.validateProblemObservation_validateProblemObservationTemplateId(myObservation, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ExamplePlugin.INSTANCE;
	}

} //ExampleValidator
