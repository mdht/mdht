/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.example.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.example.*;
import org.openhealthtools.mdht.uml.cda.example.ExamplePackage;
import org.openhealthtools.mdht.uml.cda.example.ExamplePlugin;
import org.openhealthtools.mdht.uml.cda.example.MyActivity;
import org.openhealthtools.mdht.uml.cda.example.MyDocument;
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Document Template Id' of 'My Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_DOCUMENT__MY_DOCUMENT_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Document My Section' of 'My Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_DOCUMENT__MY_DOCUMENT_MY_SECTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Activity Template Id' of 'My Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_ACTIVITY__MY_ACTIVITY_TEMPLATE_ID = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Activity Class Code' of 'My Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_ACTIVITY__MY_ACTIVITY_CLASS_CODE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Activity Mood Code' of 'My Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_ACTIVITY__MY_ACTIVITY_MOOD_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Activity Code' of 'My Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_ACTIVITY__MY_ACTIVITY_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Activity Status Code' of 'My Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_ACTIVITY__MY_ACTIVITY_STATUS_CODE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Template Id' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Code' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_CODE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Title' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_TITLE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section My Activity' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_MY_ACTIVITY = 11;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 11;

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
	public ExampleValidator() {
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
			case ExamplePackage.MY_ACTIVITY:
				return validateMyActivity((MyActivity)value, diagnostics, context);
			case ExamplePackage.MY_SECTION:
				return validateMySection((MySection)value, diagnostics, context);
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
		boolean result = validate_EveryMultiplicityConforms(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentTemplateId(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentCode(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentProblemSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentFamilyHistorySection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentSocialHistorySection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentAlertsSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicationSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentResultsSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentProceduresSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentEncountersSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentPlanOfCareSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentImmunizationsSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentVitalSignsSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicalEquipmentSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentFunctionalStatusSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentAdvanceDirectivesSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentPayersSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentPurposeSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyDocument_validateMyDocumentTemplateId(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyDocument_validateMyDocumentMySection(myDocument, diagnostics, context);
		return result;
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
	public boolean validateMyActivity(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateEntryRelationshipRequired(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateSubjectOfTarget(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateContainsObservation(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateContainsPatientAwareness(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActTemplateId(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActClassCode(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActMoodCode(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActId(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActCodeNullFlavor(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEffectiveTime(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEpisodeObservation(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyActivity_validateMyActivityTemplateId(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyActivity_validateMyActivityClassCode(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyActivity_validateMyActivityMoodCode(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyActivity_validateMyActivityCode(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyActivity_validateMyActivityStatusCode(myActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMyActivityTemplateId constraint of '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyActivity_validateMyActivityTemplateId(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myActivity.validateMyActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMyActivityClassCode constraint of '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyActivity_validateMyActivityClassCode(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myActivity.validateMyActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMyActivityMoodCode constraint of '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyActivity_validateMyActivityMoodCode(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myActivity.validateMyActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMyActivityCode constraint of '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyActivity_validateMyActivityCode(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myActivity.validateMyActivityCode(diagnostics, context);
	}

	/**
	 * Validates the validateMyActivityStatusCode constraint of '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyActivity_validateMyActivityStatusCode(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myActivity.validateMyActivityStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_validateMySectionTemplateId(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_validateMySectionCode(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_validateMySectionTitle(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_validateMySectionMyActivity(mySection, diagnostics, context);
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
	 * Validates the validateMySectionTitle constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionTitle(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.validateMySectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateMySectionMyActivity constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionMyActivity(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.validateMySectionMyActivity(diagnostics, context);
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
