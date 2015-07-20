/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Entry</b></em>'.
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
 *   <li>{@link org.hl7.fhir.BundleEntry#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleEntry#getFullUrl <em>Full Url</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleEntry#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleEntry#getSearch <em>Search</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleEntry#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleEntry#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBundleEntry()
 * @model extendedMetaData="name='Bundle.Entry' kind='elementOnly'"
 * @generated
 */
public interface BundleEntry extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.BundleLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A series of links that provide context to this entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBundleEntry_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BundleLink> getLink();

	/**
	 * Returns the value of the '<em><b>Full Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Url</em>' containment reference.
	 * @see #setFullUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getBundleEntry_FullUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fullUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getFullUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleEntry#getFullUrl <em>Full Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Url</em>' containment reference.
	 * @see #getFullUrl()
	 * @generated
	 */
	void setFullUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Resources for the entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(ResourceContainer)
	 * @see org.hl7.fhir.FhirPackage#getBundleEntry_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceContainer getResource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleEntry#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceContainer value);

	/**
	 * Returns the value of the '<em><b>Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the search process that lead to the creation of this entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search</em>' containment reference.
	 * @see #setSearch(BundleSearch)
	 * @see org.hl7.fhir.FhirPackage#getBundleEntry_Search()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='search' namespace='##targetNamespace'"
	 * @generated
	 */
	BundleSearch getSearch();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleEntry#getSearch <em>Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search</em>' containment reference.
	 * @see #getSearch()
	 * @generated
	 */
	void setSearch(BundleSearch value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about how this entry should be processed as part of a transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(BundleRequest)
	 * @see org.hl7.fhir.FhirPackage#getBundleEntry_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	BundleRequest getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleEntry#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(BundleRequest value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about how this entry should be processed as part of a transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(BundleResponse)
	 * @see org.hl7.fhir.FhirPackage#getBundleEntry_Response()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	BundleResponse getResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleEntry#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(BundleResponse value);

} // BundleEntry
