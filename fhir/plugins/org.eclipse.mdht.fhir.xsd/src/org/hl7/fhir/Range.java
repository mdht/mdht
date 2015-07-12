/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of ordered Quantities defined by a low and high limit.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Range#getLow <em>Low</em>}</li>
 *   <li>{@link org.hl7.fhir.Range#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRange()
 * @model extendedMetaData="name='Range' kind='elementOnly'"
 * @generated
 */
public interface Range extends Element {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The low limit. The boundary is inclusive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low</em>' containment reference.
	 * @see #setLow(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getRange_Low()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='low' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getLow();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Range#getLow <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' containment reference.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(Quantity value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The high limit. The boundary is inclusive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>High</em>' containment reference.
	 * @see #setHigh(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getRange_High()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='high' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getHigh();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Range#getHigh <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' containment reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(Quantity value);

} // Range
