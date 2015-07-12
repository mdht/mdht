/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system is able to take an appropriate action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubscriptionChannel#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionChannel#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionChannel#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionChannel#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubscriptionChannel()
 * @model extendedMetaData="name='Subscription.Channel' kind='elementOnly'"
 * @generated
 */
public interface SubscriptionChannel extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of channel to send notififcations on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(SubscriptionChannelType)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionChannel_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionChannelType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionChannel#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SubscriptionChannelType value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The uri that describes tha actual end point to send messages to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(Uri)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionChannel_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getEndpoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionChannel#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Uri value);

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference.
	 * @see #setPayload(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionChannel_Payload()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='payload' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPayload();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionChannel#getPayload <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' containment reference.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional headers / information to send as part of the notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubscriptionChannel_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getHeader();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionChannel#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(org.hl7.fhir.String value);

} // SubscriptionChannel
