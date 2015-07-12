/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to convey information. E.g., the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getSender <em>Sender</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getScheduledTime <em>Scheduled Time</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getOrderedOn <em>Ordered On</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequest#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest()
 * @model extendedMetaData="name='CommunicationRequest' kind='elementOnly'"
 * @generated
 */
public interface CommunicationRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique ID of this request for reference purposes. It must be provided if user wants it returned as part of any output, otherwise it will be auto-generated, if needed, by CDS system. Does not need to be the actual ID of the source system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Identifier()
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
	 * The type of message to be sent such as alert, notification, reminder, instruction, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequest#getCategory <em>Category</em>}' containment reference.
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
	 * The entity (e.g., person, organization, clinical information system, or device) which is to be the source of the communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Sender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sender' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSender();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequest#getSender <em>Sender</em>}' containment reference.
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
	 * The entity (e.g., person, organization, clinical information system, or device) which is the intended target of the communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Recipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recipient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRecipient();

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CommunicationRequestPayload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text, attachment(s), or resource(s) to be communicated to the recipient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Payload()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payload' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommunicationRequestPayload> getPayload();

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The communication medium to be used, e.g., email, fax.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medium</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Medium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medium' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getMedium();

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The responsible person who authorizes this order, e.g., physician. This may be different than the author of the order statement, e.g., clerk, who may have entered the statement into the order entry application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requester</em>' containment reference.
	 * @see #setRequester(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Requester()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requester' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequester();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequest#getRequester <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' containment reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the proposal or order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CommunicationRequestStatus)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationRequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CommunicationRequestStatus value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter within which the communication request was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequest#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Scheduled Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when this communication is to occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduled Time</em>' containment reference.
	 * @see #setScheduledTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_ScheduledTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scheduledTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getScheduledTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequest#getScheduledTime <em>Scheduled Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Time</em>' containment reference.
	 * @see #getScheduledTime()
	 * @generated
	 */
	void setScheduledTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason or justification for the communication request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReason();

	/**
	 * Returns the value of the '<em><b>Ordered On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when the request was made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered On</em>' containment reference.
	 * @see #setOrderedOn(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_OrderedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOrderedOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequest#getOrderedOn <em>Ordered On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered On</em>' containment reference.
	 * @see #getOrderedOn()
	 * @generated
	 */
	void setOrderedOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who is the focus of this communication request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequest#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characterizes how quickly the proposed act must be initiated. Includes concepts such as stat, urgent, routine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCommunicationRequest_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequest#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

} // CommunicationRequest
