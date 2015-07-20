/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for a collection of resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.BundleResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleResponse#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleResponse#getEtag <em>Etag</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleResponse#getLastModified <em>Last Modified</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBundleResponse()
 * @model extendedMetaData="name='Bundle.Response' kind='elementOnly'"
 * @generated
 */
public interface BundleResponse extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status code returned by processing this entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getBundleResponse_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleResponse#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location header created by processing this operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Uri)
	 * @see org.hl7.fhir.FhirPackage#getBundleResponse_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleResponse#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Uri value);

	/**
	 * Returns the value of the '<em><b>Etag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The etag for the resource, it the operation for the entry produced a versioned resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Etag</em>' containment reference.
	 * @see #setEtag(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getBundleResponse_Etag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='etag' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getEtag();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleResponse#getEtag <em>Etag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etag</em>' containment reference.
	 * @see #getEtag()
	 * @generated
	 */
	void setEtag(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date/time that the resource was modified on the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modified</em>' containment reference.
	 * @see #setLastModified(Instant)
	 * @see org.hl7.fhir.FhirPackage#getBundleResponse_LastModified()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastModified' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getLastModified();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleResponse#getLastModified <em>Last Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' containment reference.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Instant value);

} // BundleResponse
