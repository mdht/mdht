/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An order for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationOrder" rather than "MedicationPrescription" to generalize the use across inpatient and outpatient settings as well as for care plans, etc.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getDateEnded <em>Date Ended</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getReasonEnded <em>Reason Ended</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getPrescriber <em>Prescriber</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getDosageInstruction <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getDispense <em>Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrder#getPriorPrescription <em>Prior Prescription</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationOrder()
 * @model extendedMetaData="name='MedicationOrder' kind='elementOnly'"
 * @generated
 */
public interface MedicationOrder extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an erntire workflow process where records have to be tracked through an entire system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_Identifier()
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
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_DateWritten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateWritten' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateWritten();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getDateWritten <em>Date Written</em>}' containment reference.
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
	 * @see #setStatus(MedicationOrderStatus)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationOrderStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MedicationOrderStatus value);

	/**
	 * Returns the value of the '<em><b>Date Ended</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date (and perhaps time) when the prescription was stopped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Ended</em>' containment reference.
	 * @see #setDateEnded(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_DateEnded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateEnded' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateEnded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getDateEnded <em>Date Ended</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Ended</em>' containment reference.
	 * @see #getDateEnded()
	 * @generated
	 */
	void setDateEnded(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reason Ended</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason why the prescription was stopped, if it was.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Ended</em>' containment reference.
	 * @see #setReasonEnded(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_ReasonEnded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonEnded' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReasonEnded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getReasonEnded <em>Reason Ended</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Ended</em>' containment reference.
	 * @see #getReasonEnded()
	 * @generated
	 */
	void setReasonEnded(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource representing the person to whom the medication will be given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getPatient <em>Patient</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_Prescriber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prescriber' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrescriber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getPrescriber <em>Prescriber</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getEncounter <em>Encounter</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_ReasonCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReasonCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getReasonCodeableConcept <em>Reason Codeable Concept</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReasonReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getReasonReference <em>Reason Reference</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNote();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Medication Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication Codeable Concept</em>' containment reference.
	 * @see #setMedicationCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_MedicationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMedicationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Codeable Concept</em>' containment reference.
	 * @see #getMedicationCodeableConcept()
	 * @generated
	 */
	void setMedicationCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Medication Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication Reference</em>' containment reference.
	 * @see #setMedicationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_MedicationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMedicationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getMedicationReference <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Reference</em>' containment reference.
	 * @see #getMedicationReference()
	 * @generated
	 */
	void setMedicationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Dosage Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationOrderDosageInstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the medication is to be used by the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dosage Instruction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_DosageInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dosageInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationOrderDosageInstruction> getDosageInstruction();

	/**
	 * Returns the value of the '<em><b>Dispense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deals with details of the dispense part of the order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dispense</em>' containment reference.
	 * @see #setDispense(MedicationOrderDispense)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_Dispense()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dispense' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationOrderDispense getDispense();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getDispense <em>Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispense</em>' containment reference.
	 * @see #getDispense()
	 * @generated
	 */
	void setDispense(MedicationOrderDispense value);

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen, and in others it does not matter. This block explains the prescriber's intent. If nothing is specified substitution may be done.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference.
	 * @see #setSubstitution(MedicationOrderSubstitution)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_Substitution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substitution' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationOrderSubstitution getSubstitution();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getSubstitution <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution</em>' containment reference.
	 * @see #getSubstitution()
	 * @generated
	 */
	void setSubstitution(MedicationOrderSubstitution value);

	/**
	 * Returns the value of the '<em><b>Prior Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource representing an earlier order or prescription that this order supersedes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prior Prescription</em>' containment reference.
	 * @see #setPriorPrescription(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrder_PriorPrescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priorPrescription' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPriorPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrder#getPriorPrescription <em>Prior Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Prescription</em>' containment reference.
	 * @see #getPriorPrescription()
	 * @generated
	 */
	void setPriorPrescription(Reference value);

} // MedicationOrder
