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
 *   <li>{@link org.hl7.fhir.BundleEntry#getBase <em>Base</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleEntry#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleEntry#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleEntry#getSearch <em>Search</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleEntry#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleEntry#getTransactionResponse <em>Transaction Response</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBundleEntry()
 * @model extendedMetaData="name='Bundle.Entry' kind='elementOnly'"
 * @generated
 */
public interface BundleEntry extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Base URL for the resource, if different to the base URL specified for the bundle as a whole.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(Uri)
	 * @see org.hl7.fhir.FhirPackage#getBundleEntry_Base()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='base' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getBase();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleEntry#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Uri value);

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
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about how this entry should be processed as part of a transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference.
	 * @see #setTransaction(BundleTransaction)
	 * @see org.hl7.fhir.FhirPackage#getBundleEntry_Transaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transaction' namespace='##targetNamespace'"
	 * @generated
	 */
	BundleTransaction getTransaction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleEntry#getTransaction <em>Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' containment reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(BundleTransaction value);

	/**
	 * Returns the value of the '<em><b>Transaction Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about how this entry should be processed as part of a transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Response</em>' containment reference.
	 * @see #setTransactionResponse(BundleTransactionResponse)
	 * @see org.hl7.fhir.FhirPackage#getBundleEntry_TransactionResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transactionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	BundleTransactionResponse getTransactionResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleEntry#getTransactionResponse <em>Transaction Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Response</em>' containment reference.
	 * @see #getTransactionResponse()
	 * @generated
	 */
	void setTransactionResponse(BundleTransactionResponse value);

} // BundleEntry
