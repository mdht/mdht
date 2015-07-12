/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getLastOccurence <em>Last Occurence</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance()
 * @model extendedMetaData="name='AllergyIntolerance' kind='elementOnly'"
 * @generated
 */
public interface AllergyIntolerance extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this allergy/intolerance concern that are defined by business processed and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Recorded Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when the sensitivity was recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded Date</em>' containment reference.
	 * @see #setRecordedDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_RecordedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recordedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRecordedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getRecordedDate <em>Recorded Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Date</em>' containment reference.
	 * @see #getRecordedDate()
	 * @generated
	 */
	void setRecordedDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual who recorded the record and takes responsibility for its conten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference.
	 * @see #setRecorder(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Recorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRecorder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Reference value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who has the allergy or intolerance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Reporter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source of the information about the allergy that is recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporter</em>' containment reference.
	 * @see #setReporter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Reporter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reporter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReporter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getReporter <em>Reporter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporter</em>' containment reference.
	 * @see #getReporter()
	 * @generated
	 */
	void setReporter(Reference value);

	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of a substance, or a class of substances, that is considered to be responsible for the Adverse reaction risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Substance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='substance' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(AllergyIntoleranceStatus)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AllergyIntoleranceStatus value);

	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Criticality</em>' containment reference.
	 * @see #setCriticality(AllergyIntoleranceCriticality)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Criticality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='criticality' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceCriticality getCriticality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getCriticality <em>Criticality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' containment reference.
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(AllergyIntoleranceCriticality value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the underlying physiological mechanism for the Reaction Risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AllergyIntoleranceType)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AllergyIntoleranceType value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category of the identified Substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(AllergyIntoleranceCategory)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceCategory getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(AllergyIntoleranceCategory value);

	/**
	 * Returns the value of the '<em><b>Last Occurence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the date and/or time of the last known occurence of a reaction event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Occurence</em>' containment reference.
	 * @see #setLastOccurence(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_LastOccurence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastOccurence' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getLastOccurence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getLastOccurence <em>Last Occurence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Occurence</em>' containment reference.
	 * @see #getLastOccurence()
	 * @generated
	 */
	void setLastOccurence(DateTime value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AllergyIntoleranceEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about each Adverse Reaction Event linked to exposure to the identified Substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Event()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AllergyIntoleranceEvent> getEvent();

} // AllergyIntolerance
