/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AuditEventEvent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventEvent#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventEvent#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventEvent#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventEvent#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventEvent#getOutcomeDesc <em>Outcome Desc</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventEvent#getPurposeOfEvent <em>Purpose Of Event</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAuditEventEvent()
 * @model extendedMetaData="name='AuditEvent.Event' kind='elementOnly'"
 * @generated
 */
public interface AuditEventEvent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for a family of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEvent_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventEvent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the category of event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtype</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEvent_Subtype()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSubtype();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicator for type of action performed during the event that generated the audit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(AuditEventAction)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEvent_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventAction getAction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventEvent#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AuditEventAction value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when the event occurred on the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(Instant)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEvent_DateTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventEvent#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Instant value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the event succeeded or failed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(AuditEventOutcome)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEvent_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventOutcome getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventEvent#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(AuditEventOutcome value);

	/**
	 * Returns the value of the '<em><b>Outcome Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text description of the outcome of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome Desc</em>' containment reference.
	 * @see #setOutcomeDesc(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEvent_OutcomeDesc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcomeDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getOutcomeDesc();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventEvent#getOutcomeDesc <em>Outcome Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome Desc</em>' containment reference.
	 * @see #getOutcomeDesc()
	 * @generated
	 */
	void setOutcomeDesc(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Purpose Of Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purposeOfUse (reason) that was used during the event being recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose Of Event</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEvent_PurposeOfEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purposeOfEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getPurposeOfEvent();

} // AuditEventEvent
