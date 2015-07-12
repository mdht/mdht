/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system is able to take an appropriate action.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Subscription#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.hl7.fhir.Subscription#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.Subscription#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Subscription#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Subscription#getError <em>Error</em>}</li>
 *   <li>{@link org.hl7.fhir.Subscription#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.hl7.fhir.Subscription#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.Subscription#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubscription()
 * @model extendedMetaData="name='Subscription' kind='elementOnly'"
 * @generated
 */
public interface Subscription extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rules that the server should use to determine when to generate notifications for this subscription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference.
	 * @see #setCriteria(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubscription_Criteria()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='criteria' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCriteria();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Subscription#getCriteria <em>Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' containment reference.
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubscription_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getContact();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of why this subscription is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubscription_Reason()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Subscription#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the subscription, which marks the server state for managing the subscription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(SubscriptionStatus)
	 * @see org.hl7.fhir.FhirPackage#getSubscription_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Subscription#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SubscriptionStatus value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of the last error that occurred when the server processed a notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' containment reference.
	 * @see #setError(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubscription_Error()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getError();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Subscription#getError <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' containment reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details where to send notifications when resources are received that meet the criteria.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference.
	 * @see #setChannel(SubscriptionChannel)
	 * @see org.hl7.fhir.FhirPackage#getSubscription_Channel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='channel' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionChannel getChannel();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Subscription#getChannel <em>Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' containment reference.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(SubscriptionChannel value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time for the server to turn the subscription off.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Instant)
	 * @see org.hl7.fhir.FhirPackage#getSubscription_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Subscription#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A tag to add to any resource that matches the criteria, after the subscription is processed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubscription_Tag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getTag();

} // Subscription
