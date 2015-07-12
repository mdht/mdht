/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Header Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The header for a message exchange that is either requesting or responding to an action.  The Reference(s) that are the subject of the action as well as other Information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MessageHeaderResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeaderResponse#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeaderResponse#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMessageHeaderResponse()
 * @model extendedMetaData="name='MessageHeader.Response' kind='elementOnly'"
 * @generated
 */
public interface MessageHeaderResponse extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the message that this message is a response to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Id)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeaderResponse_Identifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderResponse#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Id value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(ResponseType)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeaderResponse_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseType getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderResponse#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(ResponseType value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full details of any issues found in the message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Details</em>' containment reference.
	 * @see #setDetails(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeaderResponse_Details()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='details' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDetails();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderResponse#getDetails <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' containment reference.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(Reference value);

} // MessageHeaderResponse
