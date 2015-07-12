/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AuditEvent#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAuditEvent()
 * @model extendedMetaData="name='AuditEvent' kind='elementOnly'"
 * @generated
 */
public interface AuditEvent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the name, action type, time, and disposition of the audited event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(AuditEventEvent)
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Event()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventEvent getEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEvent#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(AuditEventEvent value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AuditEventParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person, a hardware device or software process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Participant()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuditEventParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Application systems and processes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(AuditEventSource)
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventSource getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEvent#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AuditEventSource value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AuditEventObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific instances of data or objects that have been accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Object()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuditEventObject> getObject();

} // AuditEvent
