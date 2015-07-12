/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A homogeneous material with a definite composition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceIngredient#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceIngredient#getSubstance <em>Substance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceIngredient()
 * @model extendedMetaData="name='Substance.Ingredient' kind='elementOnly'"
 * @generated
 */
public interface SubstanceIngredient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of the ingredient in the substance - a concentration ratio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceIngredient_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceIngredient#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Ratio value);

	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another substance that is a component of this substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceIngredient_Substance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='substance' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceIngredient#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(Reference value);

} // SubstanceIngredient
