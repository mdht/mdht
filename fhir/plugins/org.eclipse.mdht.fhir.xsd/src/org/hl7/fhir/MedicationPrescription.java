/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Prescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An order for both supply of the medication and the instructions for administration of the medicine to a patient.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getPrescriber <em>Prescriber</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getDosageInstruction <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getDispense <em>Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescription#getSubstitution <em>Substitution</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription()
 * @model extendedMetaData="name='MedicationPrescription' kind='elementOnly'"
 * @generated
 */
public interface MedicationPrescription extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an erntire workflow process where records have to be tracked through an entire system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Date Written</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date (and perhaps time) when the prescription was written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Written</em>' containment reference.
	 * @see #setDateWritten(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_DateWritten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateWritten' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateWritten();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescription#getDateWritten <em>Date Written</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Written</em>' containment reference.
	 * @see #getDateWritten()
	 * @generated
	 */
	void setDateWritten(DateTime value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the state of the order.  Generally this will be active or completed state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MedicationPrescriptionStatus)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationPrescriptionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescription#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MedicationPrescriptionStatus value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource representing the person to whom the medication will be given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescription#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Prescriber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare professional responsible for authorizing the prescription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prescriber</em>' containment reference.
	 * @see #setPrescriber(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_Prescriber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prescriber' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrescriber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescription#getPrescriber <em>Prescriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriber</em>' containment reference.
	 * @see #getPrescriber()
	 * @generated
	 */
	void setPrescriber(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource that identifies the particular occurrence of contact between patient and health care provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescription#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Codeable Concept</em>' containment reference.
	 * @see #setReasonCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_ReasonCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReasonCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescription#getReasonCodeableConcept <em>Reason Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Codeable Concept</em>' containment reference.
	 * @see #getReasonCodeableConcept()
	 * @generated
	 */
	void setReasonCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference.
	 * @see #setReasonReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReasonReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescription#getReasonReference <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Reference</em>' containment reference.
	 * @see #getReasonReference()
	 * @generated
	 */
	void setReasonReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra information about the prescription that could not be conveyed by the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNote();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescription#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference.
	 * @see #setMedication(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_Medication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medication' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMedication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescription#getMedication <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication</em>' containment reference.
	 * @see #getMedication()
	 * @generated
	 */
	void setMedication(Reference value);

	/**
	 * Returns the value of the '<em><b>Dosage Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationPrescriptionDosageInstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the medication is to be used by the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dosage Instruction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_DosageInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dosageInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationPrescriptionDosageInstruction> getDosageInstruction();

	/**
	 * Returns the value of the '<em><b>Dispense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deals with details of the dispense part of the order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dispense</em>' containment reference.
	 * @see #setDispense(MedicationPrescriptionDispense)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_Dispense()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dispense' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationPrescriptionDispense getDispense();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescription#getDispense <em>Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispense</em>' containment reference.
	 * @see #getDispense()
	 * @generated
	 */
	void setDispense(MedicationPrescriptionDispense value);

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen, and in others it does not matter. This block explains the prescriber's intent. If nothing is specified substitution may be done.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference.
	 * @see #setSubstitution(MedicationPrescriptionSubstitution)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescription_Substitution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substitution' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationPrescriptionSubstitution getSubstitution();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescription#getSubstitution <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution</em>' containment reference.
	 * @see #getSubstitution()
	 * @generated
	 */
	void setSubstitution(MedicationPrescriptionSubstitution value);

} // MedicationPrescription
