/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Endpoint</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ConformanceEndpoint#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceEndpoint#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformanceEndpoint()
 * @model extendedMetaData="name='Conformance.Endpoint' kind='elementOnly'"
 * @generated
 */
public interface ConformanceEndpoint extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the messaging transport protocol(s) identifiers, supported by this endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(Coding)
	 * @see org.hl7.fhir.FhirPackage#getConformanceEndpoint_Protocol()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getProtocol();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceEndpoint#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Coding value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Uri)
	 * @see org.hl7.fhir.FhirPackage#getConformanceEndpoint_Address()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceEndpoint#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Uri value);

} // ConformanceEndpoint
