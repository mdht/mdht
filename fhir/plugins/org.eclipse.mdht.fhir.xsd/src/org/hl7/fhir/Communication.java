/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An occurrence of information being transmitted. E.g., an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Communication#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getSender <em>Sender</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getSent <em>Sent</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getReceived <em>Received</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCommunication()
 * @model extendedMetaData="name='Communication' kind='elementOnly'"
 * @generated
 */
public interface Communication extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of message conveyed such as alert, notification, reminder, instruction, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity (e.g., person, organization, clinical information system, or device) which was the source of the communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Sender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sender' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSender();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Reference value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity (e.g., person, organization, clinical information system, or device) which was the target of the communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Recipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recipient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRecipient();

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CommunicationPayload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text, attachment(s), or resource(s) that was communicated to the recipient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Payload()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payload' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommunicationPayload> getPayload();

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The communication medium, e.g., email, fax.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medium</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Medium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medium' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getMedium();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the transmission.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CommunicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CommunicationStatus value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter within which the communication was sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Sent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when this communication was sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sent</em>' containment reference.
	 * @see #setSent(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Sent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sent' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getSent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getSent <em>Sent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent</em>' containment reference.
	 * @see #getSent()
	 * @generated
	 */
	void setSent(DateTime value);

	/**
	 * Returns the value of the '<em><b>Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when this communication arrived at the destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received</em>' containment reference.
	 * @see #setReceived(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Received()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='received' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getReceived();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getReceived <em>Received</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received</em>' containment reference.
	 * @see #getReceived()
	 * @generated
	 */
	void setReceived(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason or justification for the communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReason();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who was the focus of this communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

} // Communication
