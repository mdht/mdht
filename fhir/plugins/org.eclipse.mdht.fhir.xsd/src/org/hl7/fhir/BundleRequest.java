/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Request</b></em>'.
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
 *   <li>{@link org.hl7.fhir.BundleRequest#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleRequest#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleRequest#getIfNoneMatch <em>If None Match</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleRequest#getIfMatch <em>If Match</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleRequest#getIfModifiedSince <em>If Modified Since</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleRequest#getIfNoneExist <em>If None Exist</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBundleRequest()
 * @model extendedMetaData="name='Bundle.Request' kind='elementOnly'"
 * @generated
 */
public interface BundleRequest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HTTP verb for this entry in either a update history, or a transaction/ transaction response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(HTTPVerb)
	 * @see org.hl7.fhir.FhirPackage#getBundleRequest_Method()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	HTTPVerb getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleRequest#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HTTPVerb value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL for this entry, relative to the root (the address to which the request is posted).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getBundleRequest_Url()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleRequest#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>If None Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the ETag values match, return a 304 Not modified status. See the read/vread interaction documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If None Match</em>' containment reference.
	 * @see #setIfNoneMatch(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getBundleRequest_IfNoneMatch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ifNoneMatch' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getIfNoneMatch();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleRequest#getIfNoneMatch <em>If None Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If None Match</em>' containment reference.
	 * @see #getIfNoneMatch()
	 * @generated
	 */
	void setIfNoneMatch(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>If Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only perform the operation if the Etag value matches. For more information, see the API section "Managing Resource Contention".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If Match</em>' containment reference.
	 * @see #setIfMatch(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getBundleRequest_IfMatch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ifMatch' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getIfMatch();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleRequest#getIfMatch <em>If Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Match</em>' containment reference.
	 * @see #getIfMatch()
	 * @generated
	 */
	void setIfMatch(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>If Modified Since</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only perform the operation if the last updated date matches. For more information, see the API section "Managing Resource Contention".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If Modified Since</em>' containment reference.
	 * @see #setIfModifiedSince(Instant)
	 * @see org.hl7.fhir.FhirPackage#getBundleRequest_IfModifiedSince()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ifModifiedSince' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getIfModifiedSince();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleRequest#getIfModifiedSince <em>If Modified Since</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Modified Since</em>' containment reference.
	 * @see #getIfModifiedSince()
	 * @generated
	 */
	void setIfModifiedSince(Instant value);

	/**
	 * Returns the value of the '<em><b>If None Exist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instruct the server not to perform the create if a specified resource already exists. For further information, see "Conditional Create". This is just the query portion of the URL - what follows the "?" (not including the "?").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If None Exist</em>' containment reference.
	 * @see #setIfNoneExist(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getBundleRequest_IfNoneExist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ifNoneExist' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getIfNoneExist();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleRequest#getIfNoneExist <em>If None Exist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If None Exist</em>' containment reference.
	 * @see #getIfNoneExist()
	 * @generated
	 */
	void setIfNoneExist(org.hl7.fhir.String value);

} // BundleRequest
