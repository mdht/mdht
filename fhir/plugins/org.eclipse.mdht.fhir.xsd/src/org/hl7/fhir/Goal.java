/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the intended objective(s) of patient care, for example, weight loss, restoring an activity of daily living, etc.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Goal#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getTargetDate <em>Target Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getConcern <em>Concern</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getOutcome <em>Outcome</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGoal()
 * @model extendedMetaData="name='Goal' kind='elementOnly'"
 * @generated
 */
public interface Goal extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this care plan that are defined by business processed and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Identifier()
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
	 * Identifies the patient/subject whose intended care is described by the plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Target Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when the goal is intended to be reached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Date</em>' containment reference.
	 * @see #setTargetDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getGoal_TargetDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getTargetDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getTargetDate <em>Target Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Date</em>' containment reference.
	 * @see #getTargetDate()
	 * @generated
	 */
	void setTargetDate(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable description of a specific desired objective of care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the goal has been reached and is still considered relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(GoalStatus)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	GoalStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(GoalStatus value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference.
	 * @see #setStatusDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getGoal_StatusDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getStatusDate <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' containment reference.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whose goal this is - patient goal, practitioner goal, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the level of importance associated with reaching/sustaining the goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Concern</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identified conditions and other health record elements that are intended to be addressed by the goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concern</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Concern()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concern' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getConcern();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any comments related to the goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNotes();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GoalOutcome}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the change (or lack of change) at the point where the goal was deepmed to be cancelled or achieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GoalOutcome> getOutcome();

} // Goal
