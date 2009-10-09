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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Document template Id' of 'My Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_DOCUMENT__MY_DOCUMENT_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Document my Section' of 'My Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_DOCUMENT__MY_DOCUMENT_MY_SECTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Activity template Id' of 'My Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_ACTIVITY__MY_ACTIVITY_TEMPLATE_ID = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Activity class Code' of 'My Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_ACTIVITY__MY_ACTIVITY_CLASS_CODE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Activity mood Code' of 'My Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_ACTIVITY__MY_ACTIVITY_MOOD_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Activity code' of 'My Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_ACTIVITY__MY_ACTIVITY_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Activity status Code' of 'My Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_ACTIVITY__MY_ACTIVITY_STATUS_CODE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Section template Id' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Section code' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_CODE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Section title' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_TITLE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Section my Activity' of 'My Section'.
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
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_templateId(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_code(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_problemSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_familyHistorySection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_socialHistorySection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_alertsSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_medicationSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_resultsSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_proceduresSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_encountersSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_planOfCareSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_immunizationsSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_vitalSignsSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_medicalEquipmentSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_functionalStatusSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_advanceDirectivesSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_payersSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_purposeSection(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyDocument_MyDocument_templateId(myDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyDocument_MyDocument_mySection(myDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MyDocument_templateId constraint of '<em>My Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyDocument_MyDocument_templateId(MyDocument myDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myDocument.MyDocument_templateId(diagnostics, context);
	}

	/**
	 * Validates the MyDocument_mySection constraint of '<em>My Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyDocument_MyDocument_mySection(MyDocument myDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myDocument.MyDocument_mySection(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_templateId(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_classCode(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_moodCode(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_id(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_code_nullFlavor(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_problemObservation(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyActivity_MyActivity_templateId(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyActivity_MyActivity_classCode(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyActivity_MyActivity_moodCode(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyActivity_MyActivity_code(myActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMyActivity_MyActivity_statusCode(myActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MyActivity_templateId constraint of '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyActivity_MyActivity_templateId(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myActivity.MyActivity_templateId(diagnostics, context);
	}

	/**
	 * Validates the MyActivity_classCode constraint of '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyActivity_MyActivity_classCode(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myActivity.MyActivity_classCode(diagnostics, context);
	}

	/**
	 * Validates the MyActivity_moodCode constraint of '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyActivity_MyActivity_moodCode(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myActivity.MyActivity_moodCode(diagnostics, context);
	}

	/**
	 * Validates the MyActivity_code constraint of '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyActivity_MyActivity_code(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myActivity.MyActivity_code(diagnostics, context);
	}

	/**
	 * Validates the MyActivity_statusCode constraint of '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyActivity_MyActivity_statusCode(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myActivity.MyActivity_statusCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateMySection_MySection_templateId(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_MySection_code(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_MySection_title(mySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySection_MySection_myActivity(mySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MySection_templateId constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_MySection_templateId(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.MySection_templateId(diagnostics, context);
	}

	/**
	 * Validates the MySection_code constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_MySection_code(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.MySection_code(diagnostics, context);
	}

	/**
	 * Validates the MySection_title constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_MySection_title(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.MySection_title(diagnostics, context);
	}

	/**
	 * Validates the MySection_myActivity constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_MySection_myActivity(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.MySection_myActivity(diagnostics, context);
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
