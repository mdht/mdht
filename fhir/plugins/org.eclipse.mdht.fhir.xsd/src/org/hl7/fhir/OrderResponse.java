/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A response to an order.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.OrderResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.OrderResponse#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.OrderResponse#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.OrderResponse#getWho <em>Who</em>}</li>
 *   <li>{@link org.hl7.fhir.OrderResponse#getOrderStatus <em>Order Status</em>}</li>
 *   <li>{@link org.hl7.fhir.OrderResponse#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.OrderResponse#getFulfillment <em>Fulfillment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getOrderResponse()
 * @model extendedMetaData="name='OrderResponse' kind='elementOnly'"
 * @generated
 */
public interface OrderResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getOrderResponse_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the order that this is in response to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getOrderResponse_Request()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OrderResponse#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time at which this order response was made (created/posted).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getOrderResponse_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OrderResponse#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person, organization, or device credited with making the response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Who</em>' containment reference.
	 * @see #setWho(Reference)
	 * @see org.hl7.fhir.FhirPackage#getOrderResponse_Who()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='who' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWho();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OrderResponse#getWho <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' containment reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Reference value);

	/**
	 * Returns the value of the '<em><b>Order Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What this response says about the status of the original order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Status</em>' containment reference.
	 * @see #setOrderStatus(OrderStatus)
	 * @see org.hl7.fhir.FhirPackage#getOrderResponse_OrderStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='orderStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderStatus getOrderStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OrderResponse#getOrderStatus <em>Order Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Status</em>' containment reference.
	 * @see #getOrderStatus()
	 * @generated
	 */
	void setOrderStatus(OrderStatus value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional description about the response - e.g. a text description provided by a human user when making decisions about the order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getOrderResponse_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OrderResponse#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Fulfillment</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to resources that provide details of the outcome of performing the order. E.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fulfillment</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getOrderResponse_Fulfillment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fulfillment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getFulfillment();

} // OrderResponse
