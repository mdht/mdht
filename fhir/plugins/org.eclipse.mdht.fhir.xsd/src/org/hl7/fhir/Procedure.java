/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action that is or was performed on a patient. This can be a physical 'thing' like an operation, or less invasive like counseling or hypnotherapy.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Procedure#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformedDateTime <em>Performed Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformedPeriod <em>Performed Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getReport <em>Report</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getComplication <em>Complication</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getFollowUp <em>Follow Up</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getUsed <em>Used</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProcedure()
 * @model extendedMetaData="name='Procedure' kind='elementOnly'"
 * @generated
 */
public interface Procedure extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this procedure that are defined by business processed and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Identifier()
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
	 * The person on whom the procedure was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the state of the procedure record. Generally this will be in-progress or completed state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ProcedureStatus)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcedureStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProcedureStatus value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that classifies the procedure for searching, sorting and display purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific procedure that is performed. Use text if the exact nature of the procedure can't be coded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProcedureBodySite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcedureBodySite> getBodySite();

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Indication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIndication();

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProcedurePerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Limited to 'real' people rather than equipment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcedurePerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Performed Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performed Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Date Time</em>' containment reference.
	 * @see #setPerformedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_PerformedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPerformedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getPerformedDateTime <em>Performed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Date Time</em>' containment reference.
	 * @see #getPerformedDateTime()
	 * @generated
	 */
	void setPerformedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Performed Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performed Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Period</em>' containment reference.
	 * @see #setPerformedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_PerformedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPerformedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getPerformedPeriod <em>Performed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Period</em>' containment reference.
	 * @see #getPerformedPeriod()
	 * @generated
	 */
	void setPerformedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter during which the procedure was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where the procedure actually happened.  e.g. a newborn at home, a tracheostomy at a restaurant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What was the outcome of the procedure - did it resolve reasons why the procedure was performed?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This could be a histology result. There could potentially be multiple reports - e.g. if this was a procedure that made multiple biopsies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Report()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='report' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReport();

	/**
	 * Returns the value of the '<em><b>Complication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any complications that occurred during the procedure, or in the immediate post-operative period. These are generally tracked separately from the notes, which typically will describe the procedure itself rather than any 'post procedure' issues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Complication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getComplication();

	/**
	 * Returns the value of the '<em><b>Follow Up</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or potentially could be more complex in which case the CarePlan resource can be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Follow Up</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_FollowUp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='followUp' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getFollowUp();

	/**
	 * Returns the value of the '<em><b>Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProcedureRelatedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedures may be related to other items such as procedures or medications. For example treating wound dehiscence following a previous procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_RelatedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcedureRelatedItem> getRelatedItem();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any other notes about the procedure - e.g. the operative notes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNotes();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProcedureDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A device change during the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcedureDevice> getDevice();

	/**
	 * Returns the value of the '<em><b>Used</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies medications, devices and other substance used as part of the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Used()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='used' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getUsed();

} // Procedure
