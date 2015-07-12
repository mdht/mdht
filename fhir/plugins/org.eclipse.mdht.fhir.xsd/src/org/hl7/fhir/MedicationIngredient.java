/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Primarily used for identification and definition of Medication, but also covers ingredients and packaging.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationIngredient#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationIngredient#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient()
 * @model extendedMetaData="name='Medication.Ingredient' kind='elementOnly'"
 * @generated
 */
public interface MedicationIngredient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual ingredient - either a substance (simple ingredient) or another medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationIngredient#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Reference value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies how many (or how much) of the items there are in this Medication.  E.g. 250 mg per tablet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationIngredient#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Ratio value);

} // MedicationIngredient
