/*******************************************************************************
 * Copyright (c) 2009, 2010 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.ncr.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.ncr.AcuityDataSection;
import org.openhealthtools.mdht.uml.cda.ncr.BirthWeight;
import org.openhealthtools.mdht.uml.cda.ncr.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPackage;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPlugin;
import org.openhealthtools.mdht.uml.cda.ncr.NeonatalCareReport;
import org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity;
import org.openhealthtools.mdht.uml.cda.ncr.NeonatalICULocation;
import org.openhealthtools.mdht.uml.cda.ncr.PatientDataSection;
import org.openhealthtools.mdht.uml.cda.ncr.PatientDataSectionNCR;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ncr.NCRPackage
 * @generated
 */
public class NCRValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final NCRValidator INSTANCE = new NCRValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.ncr";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neonatal Care Report Template Id' of 'Neonatal Care Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEONATAL_CARE_REPORT__NEONATAL_CARE_REPORT_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neonatal Care Report Patient Data Section NCR' of 'Neonatal Care Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEONATAL_CARE_REPORT__NEONATAL_CARE_REPORT_PATIENT_DATA_SECTION_NCR = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neonatal ICU Encounter Activity Location' of 'Neonatal ICU Encounter Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_LOCATION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neonatal ICU Encounter Activity Class Code' of 'Neonatal ICU Encounter Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_CLASS_CODE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neonatal ICU Encounter Activity Mood Code' of 'Neonatal ICU Encounter Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_MOOD_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Code' of 'Neonatal ICU Encounter Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEONATAL_ICU_ENCOUNTER_ACTIVITY__ENCOUNTERS_ACTIVITY_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neonatal ICU Encounter Activity Effective Time' of 'Neonatal ICU Encounter Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_EFFECTIVE_TIME = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neonatal ICU Encounter Activity Id' of 'Neonatal ICU Encounter Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Template Id' of 'Neonatal ICU Encounter Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEONATAL_ICU_ENCOUNTER_ACTIVITY__ENCOUNTERS_ACTIVITY_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Data Section NCR Encounters Section' of 'Patient Data Section NCR'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_DATA_SECTION_NCR__PATIENT_DATA_SECTION_NCR_ENCOUNTERS_SECTION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Data Section NCR Acuity Data Section' of 'Patient Data Section NCR'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_DATA_SECTION_NCR__PATIENT_DATA_SECTION_NCR_ACUITY_DATA_SECTION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Data Section NCR Birth Weight' of 'Patient Data Section NCR'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_DATA_SECTION_NCR__PATIENT_DATA_SECTION_NCR_BIRTH_WEIGHT = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Data Section Template Id' of 'Patient Data Section NCR'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_DATA_SECTION_NCR__PATIENT_DATA_SECTION_TEMPLATE_ID = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Data Section Template Id' of 'Patient Data Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_DATA_SECTION__PATIENT_DATA_SECTION_TEMPLATE_ID = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Data Section Code' of 'Patient Data Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_DATA_SECTION__PATIENT_DATA_SECTION_CODE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Data Section Text' of 'Patient Data Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_DATA_SECTION__PATIENT_DATA_SECTION_TEXT = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Data Section Title' of 'Patient Data Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_DATA_SECTION__PATIENT_DATA_SECTION_TITLE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate NCR Encounters Section Text' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__NCR_ENCOUNTERS_SECTION_TEXT = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate NCR Encounters Section Title' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__NCR_ENCOUNTERS_SECTION_TITLE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate NCR Encounters Section Neonatal ICU Encounter Activity' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__NCR_ENCOUNTERS_SECTION_NEONATAL_ICU_ENCOUNTER_ACTIVITY = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Template Id' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEMPLATE_ID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acuity Data Section Template Id' of 'Acuity Data Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACUITY_DATA_SECTION__ACUITY_DATA_SECTION_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Weight Class Code' of 'Birth Weight'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_WEIGHT__BIRTH_WEIGHT_CLASS_CODE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Weight Mood Code' of 'Birth Weight'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_WEIGHT__BIRTH_WEIGHT_MOOD_CODE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Birth Weight Value' of 'Birth Weight'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_WEIGHT__BIRTH_WEIGHT_VALUE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Birth Weight'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_WEIGHT__RESULT_OBSERVATION_TEMPLATE_ID = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Birth Weight'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_WEIGHT__RESULT_OBSERVATION_CODE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Status Code' of 'Birth Weight'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTH_WEIGHT__RESULT_OBSERVATION_STATUS_CODE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neonatal ICU Location Type Code' of 'Neonatal ICU Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEONATAL_ICU_LOCATION__NEONATAL_ICU_LOCATION_TYPE_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Template Id' of 'Neonatal ICU Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEONATAL_ICU_LOCATION__ENCOUNTER_LOCATION_TEMPLATE_ID = 30;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 30;

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
	public NCRValidator() {
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
	  return NCRPackage.eINSTANCE;
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
			case NCRPackage.NEONATAL_CARE_REPORT:
				return validateNeonatalCareReport((NeonatalCareReport)value, diagnostics, context);
			case NCRPackage.NEONATAL_ICU_ENCOUNTER_ACTIVITY:
				return validateNeonatalICUEncounterActivity((NeonatalICUEncounterActivity)value, diagnostics, context);
			case NCRPackage.PATIENT_DATA_SECTION_NCR:
				return validatePatientDataSectionNCR((PatientDataSectionNCR)value, diagnostics, context);
			case NCRPackage.PATIENT_DATA_SECTION:
				return validatePatientDataSection((PatientDataSection)value, diagnostics, context);
			case NCRPackage.ENCOUNTERS_SECTION:
				return validateEncountersSection((EncountersSection)value, diagnostics, context);
			case NCRPackage.ACUITY_DATA_SECTION:
				return validateAcuityDataSection((AcuityDataSection)value, diagnostics, context);
			case NCRPackage.BIRTH_WEIGHT:
				return validateBirthWeight((BirthWeight)value, diagnostics, context);
			case NCRPackage.NEONATAL_ICU_LOCATION:
				return validateNeonatalICULocation((NeonatalICULocation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalCareReport(NeonatalCareReport neonatalCareReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(neonatalCareReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(neonatalCareReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(neonatalCareReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(neonatalCareReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(neonatalCareReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(neonatalCareReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(neonatalCareReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeonatalCareReport_validateNeonatalCareReportTemplateId(neonatalCareReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeonatalCareReport_validateNeonatalCareReportPatientDataSectionNCR(neonatalCareReport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNeonatalCareReportTemplateId constraint of '<em>Neonatal Care Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalCareReport_validateNeonatalCareReportTemplateId(NeonatalCareReport neonatalCareReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return neonatalCareReport.validateNeonatalCareReportTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateNeonatalCareReportPatientDataSectionNCR constraint of '<em>Neonatal Care Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalCareReport_validateNeonatalCareReportPatientDataSectionNCR(NeonatalCareReport neonatalCareReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return neonatalCareReport.validateNeonatalCareReportPatientDataSectionNCR(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivity(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeonatalICUEncounterActivity_validateEncountersActivityTemplateId(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersActivity_validateEncountersActivityId(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersActivity_validateEncountersActivityEffectiveTime(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeonatalICUEncounterActivity_validateNeonatalICUEncounterActivityLocation(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeonatalICUEncounterActivity_validateNeonatalICUEncounterActivityClassCode(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeonatalICUEncounterActivity_validateNeonatalICUEncounterActivityMoodCode(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeonatalICUEncounterActivity_validateEncountersActivityCode(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeonatalICUEncounterActivity_validateNeonatalICUEncounterActivityEffectiveTime(neonatalICUEncounterActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeonatalICUEncounterActivity_validateNeonatalICUEncounterActivityId(neonatalICUEncounterActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNeonatalICUEncounterActivityLocation constraint of '<em>Neonatal ICU Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivity_validateNeonatalICUEncounterActivityLocation(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return neonatalICUEncounterActivity.validateNeonatalICUEncounterActivityLocation(diagnostics, context);
	}

	/**
	 * Validates the validateNeonatalICUEncounterActivityClassCode constraint of '<em>Neonatal ICU Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivity_validateNeonatalICUEncounterActivityClassCode(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return neonatalICUEncounterActivity.validateNeonatalICUEncounterActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateNeonatalICUEncounterActivityMoodCode constraint of '<em>Neonatal ICU Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivity_validateNeonatalICUEncounterActivityMoodCode(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return neonatalICUEncounterActivity.validateNeonatalICUEncounterActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityCode constraint of '<em>Neonatal ICU Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivity_validateEncountersActivityCode(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return neonatalICUEncounterActivity.validateEncountersActivityCode(diagnostics, context);
	}

	/**
	 * Validates the validateNeonatalICUEncounterActivityEffectiveTime constraint of '<em>Neonatal ICU Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivity_validateNeonatalICUEncounterActivityEffectiveTime(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return neonatalICUEncounterActivity.validateNeonatalICUEncounterActivityEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateNeonatalICUEncounterActivityId constraint of '<em>Neonatal ICU Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivity_validateNeonatalICUEncounterActivityId(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return neonatalICUEncounterActivity.validateNeonatalICUEncounterActivityId(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityTemplateId constraint of '<em>Neonatal ICU Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivity_validateEncountersActivityTemplateId(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateEncountersActivityTemplateId", getObjectLabel(neonatalICUEncounterActivity, context) },
						 new Object[] { neonatalICUEncounterActivity },
						 context));
			}
			return false;
		}
		return ccdValidator.validateEncountersActivity_validateEncountersActivityTemplateId(neonatalICUEncounterActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSectionNCR(PatientDataSectionNCR patientDataSectionNCR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientDataSectionNCR_validatePatientDataSectionTemplateId(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientDataSection_validatePatientDataSectionCode(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientDataSection_validatePatientDataSectionText(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientDataSection_validatePatientDataSectionTitle(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientDataSectionNCR_validatePatientDataSectionNCREncountersSection(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientDataSectionNCR_validatePatientDataSectionNCRAcuityDataSection(patientDataSectionNCR, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientDataSectionNCR_validatePatientDataSectionNCRBirthWeight(patientDataSectionNCR, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePatientDataSectionNCREncountersSection constraint of '<em>Patient Data Section NCR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSectionNCR_validatePatientDataSectionNCREncountersSection(PatientDataSectionNCR patientDataSectionNCR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientDataSectionNCR.validatePatientDataSectionNCREncountersSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientDataSectionNCRAcuityDataSection constraint of '<em>Patient Data Section NCR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSectionNCR_validatePatientDataSectionNCRAcuityDataSection(PatientDataSectionNCR patientDataSectionNCR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientDataSectionNCR.validatePatientDataSectionNCRAcuityDataSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientDataSectionNCRBirthWeight constraint of '<em>Patient Data Section NCR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSectionNCR_validatePatientDataSectionNCRBirthWeight(PatientDataSectionNCR patientDataSectionNCR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientDataSectionNCR.validatePatientDataSectionNCRBirthWeight(diagnostics, context);
	}

	/**
	 * Validates the validatePatientDataSectionTemplateId constraint of '<em>Patient Data Section NCR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSectionNCR_validatePatientDataSectionTemplateId(PatientDataSectionNCR patientDataSectionNCR, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validatePatientDataSectionTemplateId", getObjectLabel(patientDataSectionNCR, context) },
						 new Object[] { patientDataSectionNCR },
						 context));
			}
			return false;
		}
		return validatePatientDataSection_validatePatientDataSectionTemplateId(patientDataSectionNCR, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSection(PatientDataSection patientDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(patientDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patientDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patientDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(patientDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(patientDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(patientDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patientDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientDataSection_validatePatientDataSectionTemplateId(patientDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientDataSection_validatePatientDataSectionCode(patientDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientDataSection_validatePatientDataSectionText(patientDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientDataSection_validatePatientDataSectionTitle(patientDataSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePatientDataSectionTemplateId constraint of '<em>Patient Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSection_validatePatientDataSectionTemplateId(PatientDataSection patientDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientDataSection.validatePatientDataSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientDataSectionCode constraint of '<em>Patient Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSection_validatePatientDataSectionCode(PatientDataSection patientDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientDataSection.validatePatientDataSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePatientDataSectionText constraint of '<em>Patient Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSection_validatePatientDataSectionText(PatientDataSection patientDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientDataSection.validatePatientDataSectionText(diagnostics, context);
	}

	/**
	 * Validates the validatePatientDataSectionTitle constraint of '<em>Patient Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSection_validatePatientDataSectionTitle(PatientDataSection patientDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientDataSection.validatePatientDataSectionTitle(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEncountersSection_validateEncountersSectionTemplateId(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionCode(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionTitle(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_validateNCREncountersSectionText(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_validateNCREncountersSectionTitle(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_validateNCREncountersSectionNeonatalICUEncounterActivity(encountersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNCREncountersSectionText constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateNCREncountersSectionText(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateNCREncountersSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateNCREncountersSectionTitle constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateNCREncountersSectionTitle(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateNCREncountersSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateNCREncountersSectionNeonatalICUEncounterActivity constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateNCREncountersSectionNeonatalICUEncounterActivity(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateNCREncountersSectionNeonatalICUEncounterActivity(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersSectionTemplateId constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateEncountersSectionTemplateId(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateEncountersSectionTemplateId", getObjectLabel(encountersSection, context) },
						 new Object[] { encountersSection },
						 context));
			}
			return false;
		}
		return ccdValidator.validateEncountersSection_validateEncountersSectionTemplateId(encountersSection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuityDataSection(AcuityDataSection acuityDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(acuityDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuityDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuityDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuityDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuityDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuityDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuityDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuityDataSection_validateAcuityDataSectionTemplateId(acuityDataSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAcuityDataSectionTemplateId constraint of '<em>Acuity Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuityDataSection_validateAcuityDataSectionTemplateId(AcuityDataSection acuityDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return acuityDataSection.validateAcuityDataSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthWeight(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validateBirthWeight_validateResultObservationTemplateId(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validateBirthWeight_validateResultObservationStatusCode(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validateBirthWeight_validateResultObservationCode(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validateBirthWeight_validateBirthWeightClassCode(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validateBirthWeight_validateBirthWeightMoodCode(birthWeight, diagnostics, context);
		if (result || diagnostics != null) result &= validateBirthWeight_validateBirthWeightValue(birthWeight, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateBirthWeightClassCode constraint of '<em>Birth Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthWeight_validateBirthWeightClassCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return birthWeight.validateBirthWeightClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateBirthWeightMoodCode constraint of '<em>Birth Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthWeight_validateBirthWeightMoodCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return birthWeight.validateBirthWeightMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateBirthWeightValue constraint of '<em>Birth Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthWeight_validateBirthWeightValue(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return birthWeight.validateBirthWeightValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Birth Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthWeight_validateResultObservationTemplateId(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateResultObservationTemplateId", getObjectLabel(birthWeight, context) },
						 new Object[] { birthWeight },
						 context));
			}
			return false;
		}
		return ccdValidator.validateResultObservation_validateResultObservationTemplateId(birthWeight, diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationCode constraint of '<em>Birth Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthWeight_validateResultObservationCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateResultObservationCode", getObjectLabel(birthWeight, context) },
						 new Object[] { birthWeight },
						 context));
			}
			return false;
		}
		return ccdValidator.validateResultObservation_validateResultObservationCode(birthWeight, diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationStatusCode constraint of '<em>Birth Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthWeight_validateResultObservationStatusCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateResultObservationStatusCode", getObjectLabel(birthWeight, context) },
						 new Object[] { birthWeight },
						 context));
			}
			return false;
		}
		return ccdValidator.validateResultObservation_validateResultObservationStatusCode(birthWeight, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICULocation(NeonatalICULocation neonatalICULocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(neonatalICULocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(neonatalICULocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(neonatalICULocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(neonatalICULocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(neonatalICULocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(neonatalICULocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(neonatalICULocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeonatalICULocation_validateEncounterLocationTemplateId(neonatalICULocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeonatalICULocation_validateNeonatalICULocationTypeCode(neonatalICULocation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNeonatalICULocationTypeCode constraint of '<em>Neonatal ICU Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICULocation_validateNeonatalICULocationTypeCode(NeonatalICULocation neonatalICULocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return neonatalICULocation.validateNeonatalICULocationTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterLocationTemplateId constraint of '<em>Neonatal ICU Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICULocation_validateEncounterLocationTemplateId(NeonatalICULocation neonatalICULocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateEncounterLocationTemplateId", getObjectLabel(neonatalICULocation, context) },
						 new Object[] { neonatalICULocation },
						 context));
			}
			return false;
		}
		return ccdValidator.validateEncounterLocation_validateEncounterLocationTemplateId(neonatalICULocation, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return NCRPlugin.INSTANCE;
	}

} //NCRValidator
