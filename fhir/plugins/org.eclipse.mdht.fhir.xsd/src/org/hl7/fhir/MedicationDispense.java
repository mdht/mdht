/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Dispense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dispensing a medication to a named patient.  This includes a description of the supply provided and the instructions for administering the medication.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getDispenser <em>Dispenser</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getAuthorizingPrescription <em>Authorizing Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getDaysSupply <em>Days Supply</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getWhenPrepared <em>When Prepared</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getWhenHandedOver <em>When Handed Over</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getDosageInstruction <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispense#getSubstitution <em>Substitution</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationDispense()
 * @model extendedMetaData="name='MedicationDispense' kind='elementOnly'"
 * @generated
 */
public interface MedicationDispense extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the state of the set of dispense events.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MedicationDispenseStatus)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationDispenseStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MedicationDispenseStatus value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource representing the person to whom the medication will be given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Dispenser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual responsible for dispensing the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dispenser</em>' containment reference.
	 * @see #setDispenser(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_Dispenser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dispenser' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDispenser();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getDispenser <em>Dispenser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispenser</em>' containment reference.
	 * @see #getDispenser()
	 * @generated
	 */
	void setDispenser(Reference value);

	/**
	 * Returns the value of the '<em><b>Authorizing Prescription</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the medication order that is being dispensed against.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorizing Prescription</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_AuthorizingPrescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorizingPrescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAuthorizingPrescription();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of medication that has been dispensed. Includes unit of measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Days Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of medication expressed as a timing amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Days Supply</em>' containment reference.
	 * @see #setDaysSupply(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_DaysSupply()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='daysSupply' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getDaysSupply();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getDaysSupply <em>Days Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Days Supply</em>' containment reference.
	 * @see #getDaysSupply()
	 * @generated
	 */
	void setDaysSupply(SimpleQuantity value);

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
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_MedicationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMedicationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_MedicationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMedicationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getMedicationReference <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Reference</em>' containment reference.
	 * @see #getMedicationReference()
	 * @generated
	 */
	void setMedicationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>When Prepared</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when the dispensed product was packaged and reviewed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Prepared</em>' containment reference.
	 * @see #setWhenPrepared(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_WhenPrepared()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenPrepared' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getWhenPrepared();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getWhenPrepared <em>When Prepared</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Prepared</em>' containment reference.
	 * @see #getWhenPrepared()
	 * @generated
	 */
	void setWhenPrepared(DateTime value);

	/**
	 * Returns the value of the '<em><b>When Handed Over</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time the dispensed product was provided to the patient or their representative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Handed Over</em>' containment reference.
	 * @see #setWhenHandedOver(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_WhenHandedOver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenHandedOver' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getWhenHandedOver();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getWhenHandedOver <em>When Handed Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Handed Over</em>' containment reference.
	 * @see #getWhenHandedOver()
	 * @generated
	 */
	void setWhenHandedOver(DateTime value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the facility/location where the medication was shipped to, as part of the dispense event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDestination();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Reference value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the person who picked up the medication.  This will usually be a patient or their carer, but some cases exist where it can be a healthcare professional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_Receiver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiver' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReceiver();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra information about the dispense that could not be conveyed in the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNote();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Dosage Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationDispenseDosageInstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the medication is to be used by the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dosage Instruction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_DosageInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dosageInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationDispenseDosageInstruction> getDosageInstruction();

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but doesn't happen, in other cases substitution is not expected but does happen.  This block explains what substitition did or did not happen and why.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference.
	 * @see #setSubstitution(MedicationDispenseSubstitution)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispense_Substitution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substitution' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationDispenseSubstitution getSubstitution();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispense#getSubstitution <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution</em>' containment reference.
	 * @see #getSubstitution()
	 * @generated
	 */
	void setSubstitution(MedicationDispenseSubstitution value);

} // MedicationDispense
