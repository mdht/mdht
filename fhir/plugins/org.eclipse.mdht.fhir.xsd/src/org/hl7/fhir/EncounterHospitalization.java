/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Hospitalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EncounterHospitalization#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHospitalization#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHospitalization#getAdmitSource <em>Admit Source</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHospitalization#getDietPreference <em>Diet Preference</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHospitalization#getSpecialCourtesy <em>Special Courtesy</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHospitalization#getSpecialArrangement <em>Special Arrangement</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHospitalization#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHospitalization#getDischargeDisposition <em>Discharge Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHospitalization#getDischargeDiagnosis <em>Discharge Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterHospitalization#getReAdmission <em>Re Admission</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEncounterHospitalization()
 * @model extendedMetaData="name='Encounter.Hospitalization' kind='elementOnly'"
 * @generated
 */
public interface EncounterHospitalization extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Pre Admission Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pre-admission identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Admission Identifier</em>' containment reference.
	 * @see #setPreAdmissionIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHospitalization_PreAdmissionIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preAdmissionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPreAdmissionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHospitalization#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Admission Identifier</em>' containment reference.
	 * @see #getPreAdmissionIdentifier()
	 * @generated
	 */
	void setPreAdmissionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location from which the patient came before admission.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHospitalization_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrigin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHospitalization#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Reference value);

	/**
	 * Returns the value of the '<em><b>Admit Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From where patient was admitted (physician referral, transfer).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admit Source</em>' containment reference.
	 * @see #setAdmitSource(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHospitalization_AdmitSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='admitSource' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdmitSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHospitalization#getAdmitSource <em>Admit Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admit Source</em>' containment reference.
	 * @see #getAdmitSource()
	 * @generated
	 */
	void setAdmitSource(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Diet Preference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diet preferences reported by the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diet Preference</em>' containment reference.
	 * @see #setDietPreference(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHospitalization_DietPreference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dietPreference' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDietPreference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHospitalization#getDietPreference <em>Diet Preference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diet Preference</em>' containment reference.
	 * @see #getDietPreference()
	 * @generated
	 */
	void setDietPreference(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Special Courtesy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Special courtesies (VIP, board member).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Courtesy</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounterHospitalization_SpecialCourtesy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialCourtesy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialCourtesy();

	/**
	 * Returns the value of the '<em><b>Special Arrangement</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wheelchair, translator, stretcher, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Arrangement</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounterHospitalization_SpecialArrangement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialArrangement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialArrangement();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location to which the patient is discharged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHospitalization_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDestination();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHospitalization#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Reference value);

	/**
	 * Returns the value of the '<em><b>Discharge Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category or kind of location after discharge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discharge Disposition</em>' containment reference.
	 * @see #setDischargeDisposition(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHospitalization_DischargeDisposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dischargeDisposition' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDischargeDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHospitalization#getDischargeDisposition <em>Discharge Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discharge Disposition</em>' containment reference.
	 * @see #getDischargeDisposition()
	 * @generated
	 */
	void setDischargeDisposition(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Discharge Diagnosis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The final diagnosis given a patient before release from the hospital after all testing, surgery, and workup are complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discharge Diagnosis</em>' containment reference.
	 * @see #setDischargeDiagnosis(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHospitalization_DischargeDiagnosis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dischargeDiagnosis' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDischargeDiagnosis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHospitalization#getDischargeDiagnosis <em>Discharge Diagnosis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discharge Diagnosis</em>' containment reference.
	 * @see #getDischargeDiagnosis()
	 * @generated
	 */
	void setDischargeDiagnosis(Reference value);

	/**
	 * Returns the value of the '<em><b>Re Admission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this hospitalization is a readmission.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Re Admission</em>' containment reference.
	 * @see #setReAdmission(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getEncounterHospitalization_ReAdmission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reAdmission' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getReAdmission();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterHospitalization#getReAdmission <em>Re Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Re Admission</em>' containment reference.
	 * @see #getReAdmission()
	 * @generated
	 */
	void setReAdmission(org.hl7.fhir.Boolean value);

} // EncounterHospitalization
