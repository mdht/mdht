/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of medication being taken by a patient, or that the medication has been given to a patient where the record is the result of a report from the patient or another clinician.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getWasNotTaken <em>Was Not Taken</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getReasonNotTaken <em>Reason Not Taken</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getReasonForUseCodeableConcept <em>Reason For Use Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getReasonForUseReference <em>Reason For Use Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatement#getDosage <em>Dosage</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationStatement()
 * @model extendedMetaData="name='MedicationStatement' kind='elementOnly'"
 * @generated
 */
public interface MedicationStatement extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External identifier - FHIR will generate its own internal IDs (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person or animal who is /was taking the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person who provided the information about the taking of this medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Source</em>' containment reference.
	 * @see #setInformationSource(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_InformationSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='informationSource' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInformationSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getInformationSource <em>Information Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Source</em>' containment reference.
	 * @see #getInformationSource()
	 * @generated
	 */
	void setInformationSource(Reference value);

	/**
	 * Returns the value of the '<em><b>Date Asserted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the medication statement was asserted by the information source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Asserted</em>' containment reference.
	 * @see #setDateAsserted(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_DateAsserted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateAsserted' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateAsserted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getDateAsserted <em>Date Asserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Asserted</em>' containment reference.
	 * @see #getDateAsserted()
	 * @generated
	 */
	void setDateAsserted(DateTime value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the state of the statement.  Generally this will be in-progress or completed state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MedicationStatementStatus)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationStatementStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MedicationStatementStatus value);

	/**
	 * Returns the value of the '<em><b>Was Not Taken</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set this to true if the record is saying that the medication was NOT taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Was Not Taken</em>' containment reference.
	 * @see #setWasNotTaken(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_WasNotTaken()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wasNotTaken' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getWasNotTaken();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getWasNotTaken <em>Was Not Taken</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Was Not Taken</em>' containment reference.
	 * @see #getWasNotTaken()
	 * @generated
	 */
	void setWasNotTaken(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Reason Not Taken</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code indicating why the medication was not taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Not Taken</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_ReasonNotTaken()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonNotTaken' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReasonNotTaken();

	/**
	 * Returns the value of the '<em><b>Reason For Use Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason For Use Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason For Use Codeable Concept</em>' containment reference.
	 * @see #setReasonForUseCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_ReasonForUseCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonForUseCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReasonForUseCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getReasonForUseCodeableConcept <em>Reason For Use Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason For Use Codeable Concept</em>' containment reference.
	 * @see #getReasonForUseCodeableConcept()
	 * @generated
	 */
	void setReasonForUseCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason For Use Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason For Use Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason For Use Reference</em>' containment reference.
	 * @see #setReasonForUseReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_ReasonForUseReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonForUseReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReasonForUseReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getReasonForUseReference <em>Reason For Use Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason For Use Reference</em>' containment reference.
	 * @see #getReasonForUseReference()
	 * @generated
	 */
	void setReasonForUseReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #setEffectiveDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_EffectiveDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectiveDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEffectiveDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getEffectiveDateTime <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #getEffectiveDateTime()
	 * @generated
	 */
	void setEffectiveDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides extra information about the medication statement that is not conveyed by the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNote();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getNote <em>Note</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_MedicationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMedicationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_MedicationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMedicationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatement#getMedicationReference <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Reference</em>' containment reference.
	 * @see #getMedicationReference()
	 * @generated
	 */
	void setMedicationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Dosage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationStatementDosage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the medication is/was used by the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dosage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatement_Dosage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dosage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationStatementDosage> getDosage();

} // MedicationStatement
