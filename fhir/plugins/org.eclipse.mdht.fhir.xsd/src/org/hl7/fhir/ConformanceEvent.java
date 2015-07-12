/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConformanceEvent#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceEvent#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceEvent#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceEvent#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceEvent#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceEvent#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceEvent#getResponse <em>Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceEvent#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformanceEvent()
 * @model extendedMetaData="name='Conformance.Event' kind='elementOnly'"
 * @generated
 */
public interface ConformanceEvent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded identifier of a supported messaging event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Coding)
	 * @see org.hl7.fhir.FhirPackage#getConformanceEvent_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceEvent#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Coding value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The impact of the content of the message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(MessageSignificanceCategory)
	 * @see org.hl7.fhir.FhirPackage#getConformanceEvent_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageSignificanceCategory getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceEvent#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(MessageSignificanceCategory value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mode of this event declaration - whether application is sender or receiver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(ConformanceEventMode)
	 * @see org.hl7.fhir.FhirPackage#getConformanceEvent_Mode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceEventMode getMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceEvent#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ConformanceEventMode value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the messaging transport protocol(s) identifiers, supported by this endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceEvent_Protocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getProtocol();

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource associated with the event.  This is the resource that defines the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(Code)
	 * @see org.hl7.fhir.FhirPackage#getConformanceEvent_Focus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getFocus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceEvent#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Code value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the request for this event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConformanceEvent_Request()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceEvent#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the response for this event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConformanceEvent_Response()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceEvent#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Reference value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformanceEvent_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceEvent#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.hl7.fhir.String value);

} // ConformanceEvent
