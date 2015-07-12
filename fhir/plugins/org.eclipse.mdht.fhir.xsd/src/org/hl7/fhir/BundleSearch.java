/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Search</b></em>'.
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
 *   <li>{@link org.hl7.fhir.BundleSearch#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.BundleSearch#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBundleSearch()
 * @model extendedMetaData="name='Bundle.Search' kind='elementOnly'"
 * @generated
 */
public interface BundleSearch extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why this entry is in the result set - whether it's included as a match or because of an _include requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(SearchEntryMode)
	 * @see org.hl7.fhir.FhirPackage#getBundleSearch_Mode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	SearchEntryMode getMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleSearch#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(SearchEntryMode value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When searching, the server's search ranking score for the entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getBundleSearch_Score()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='score' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getScore();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BundleSearch#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Decimal value);

} // BundleSearch
