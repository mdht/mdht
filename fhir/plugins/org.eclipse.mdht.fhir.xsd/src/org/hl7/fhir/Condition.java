/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Use to record detailed information about conditions, problems or diagnoses recognized by a clinician. There are many uses including: recording a Diagnosis during an Encounter; populating a problem List or a Summary Statement, such as a Discharge Summary.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Condition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getClinicalStatus <em>Clinical Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getOnsetDateTime <em>Onset Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getOnsetAge <em>Onset Age</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getOnsetPeriod <em>Onset Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getOnsetRange <em>Onset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getOnsetString <em>Onset String</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getAbatementDate <em>Abatement Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getAbatementAge <em>Abatement Age</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getAbatementBoolean <em>Abatement Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getAbatementPeriod <em>Abatement Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getAbatementRange <em>Abatement Range</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getAbatementString <em>Abatement String</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getStage <em>Stage</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getDueTo <em>Due To</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getOccurredFollowing <em>Occurred Following</em>}</li>
 *   <li>{@link org.hl7.fhir.Condition#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCondition()
 * @model extendedMetaData="name='Condition' kind='elementOnly'"
 * @generated
 */
public interface Condition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this condition that are defined by business processed and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCondition_Identifier()
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
	 * Indicates the patient who the condition record is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCondition_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter during which the condition was first asserted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCondition_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Asserter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person who takes responsibility for asserting the existence of the condition as part of the electronic record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asserter</em>' containment reference.
	 * @see #setAsserter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCondition_Asserter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asserter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAsserter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getAsserter <em>Asserter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserter</em>' containment reference.
	 * @see #getAsserter()
	 * @generated
	 */
	void setAsserter(Reference value);

	/**
	 * Returns the value of the '<em><b>Date Asserted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date the condition/problem/diagnosis was first detected/suspected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Asserted</em>' containment reference.
	 * @see #setDateAsserted(Date)
	 * @see org.hl7.fhir.FhirPackage#getCondition_DateAsserted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateAsserted' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDateAsserted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getDateAsserted <em>Date Asserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Asserted</em>' containment reference.
	 * @see #getDateAsserted()
	 * @generated
	 */
	void setDateAsserted(Date value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the condition, problem or diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCondition_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A category assigned to the condition. E.g. complaint | symptom | finding | diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCondition_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Clinical Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical status of the condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Status</em>' containment reference.
	 * @see #setClinicalStatus(ConditionClinicalStatus)
	 * @see org.hl7.fhir.FhirPackage#getCondition_ClinicalStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='clinicalStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionClinicalStatus getClinicalStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getClinicalStatus <em>Clinical Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Status</em>' containment reference.
	 * @see #getClinicalStatus()
	 * @generated
	 */
	void setClinicalStatus(ConditionClinicalStatus value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subjective assessment of the severity of the condition as evaluated by the clinician.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCondition_Severity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Onset Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Date Time</em>' containment reference.
	 * @see #setOnsetDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCondition_OnsetDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOnsetDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getOnsetDateTime <em>Onset Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Date Time</em>' containment reference.
	 * @see #getOnsetDateTime()
	 * @generated
	 */
	void setOnsetDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Onset Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset Age</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Age</em>' containment reference.
	 * @see #setOnsetAge(Age)
	 * @see org.hl7.fhir.FhirPackage#getCondition_OnsetAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getOnsetAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getOnsetAge <em>Onset Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Age</em>' containment reference.
	 * @see #getOnsetAge()
	 * @generated
	 */
	void setOnsetAge(Age value);

	/**
	 * Returns the value of the '<em><b>Onset Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Period</em>' containment reference.
	 * @see #setOnsetPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getCondition_OnsetPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOnsetPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getOnsetPeriod <em>Onset Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Period</em>' containment reference.
	 * @see #getOnsetPeriod()
	 * @generated
	 */
	void setOnsetPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Onset Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Range</em>' containment reference.
	 * @see #setOnsetRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getCondition_OnsetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOnsetRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getOnsetRange <em>Onset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Range</em>' containment reference.
	 * @see #getOnsetRange()
	 * @generated
	 */
	void setOnsetRange(Range value);

	/**
	 * Returns the value of the '<em><b>Onset String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset String</em>' containment reference.
	 * @see #setOnsetString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCondition_OnsetString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getOnsetString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getOnsetString <em>Onset String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset String</em>' containment reference.
	 * @see #getOnsetString()
	 * @generated
	 */
	void setOnsetString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Abatement Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abatement Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatement Date</em>' containment reference.
	 * @see #setAbatementDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getCondition_AbatementDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abatementDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getAbatementDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getAbatementDate <em>Abatement Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatement Date</em>' containment reference.
	 * @see #getAbatementDate()
	 * @generated
	 */
	void setAbatementDate(Date value);

	/**
	 * Returns the value of the '<em><b>Abatement Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abatement Age</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatement Age</em>' containment reference.
	 * @see #setAbatementAge(Age)
	 * @see org.hl7.fhir.FhirPackage#getCondition_AbatementAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abatementAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getAbatementAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getAbatementAge <em>Abatement Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatement Age</em>' containment reference.
	 * @see #getAbatementAge()
	 * @generated
	 */
	void setAbatementAge(Age value);

	/**
	 * Returns the value of the '<em><b>Abatement Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abatement Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatement Boolean</em>' containment reference.
	 * @see #setAbatementBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCondition_AbatementBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abatementBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAbatementBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getAbatementBoolean <em>Abatement Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatement Boolean</em>' containment reference.
	 * @see #getAbatementBoolean()
	 * @generated
	 */
	void setAbatementBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Abatement Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abatement Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatement Period</em>' containment reference.
	 * @see #setAbatementPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getCondition_AbatementPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abatementPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getAbatementPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getAbatementPeriod <em>Abatement Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatement Period</em>' containment reference.
	 * @see #getAbatementPeriod()
	 * @generated
	 */
	void setAbatementPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Abatement Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abatement Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatement Range</em>' containment reference.
	 * @see #setAbatementRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getCondition_AbatementRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abatementRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAbatementRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getAbatementRange <em>Abatement Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatement Range</em>' containment reference.
	 * @see #getAbatementRange()
	 * @generated
	 */
	void setAbatementRange(Range value);

	/**
	 * Returns the value of the '<em><b>Abatement String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abatement String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatement String</em>' containment reference.
	 * @see #setAbatementString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCondition_AbatementString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abatementString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAbatementString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getAbatementString <em>Abatement String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatement String</em>' containment reference.
	 * @see #getAbatementString()
	 * @generated
	 */
	void setAbatementString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical stage or grade of a condition. May include formal severity assessments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference.
	 * @see #setStage(ConditionStage)
	 * @see org.hl7.fhir.FhirPackage#getCondition_Stage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stage' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionStage getStage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getStage <em>Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' containment reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(ConditionStage value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConditionEvidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCondition_Evidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionEvidence> getEvidence();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConditionLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The anatomical location where this condition manifests itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCondition_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionLocation> getLocation();

	/**
	 * Returns the value of the '<em><b>Due To</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConditionDueTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Further conditions, problems, diagnoses, procedures or events or the substance that caused/triggered this Condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Due To</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCondition_DueTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dueTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionDueTo> getDueTo();

	/**
	 * Returns the value of the '<em><b>Occurred Following</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConditionOccurredFollowing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Further conditions, problems, diagnoses, procedures or events or the substance that preceded this Condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurred Following</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCondition_OccurredFollowing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurredFollowing' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionOccurredFollowing> getOccurredFollowing();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCondition_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNotes();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Condition#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(org.hl7.fhir.String value);

} // Condition
