/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Nutrient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NutritionOrderNutrient#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderNutrient#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionOrderNutrient()
 * @model extendedMetaData="name='NutritionOrder.Nutrient' kind='elementOnly'"
 * @generated
 */
public interface NutritionOrderNutrient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nutrient that is being modified such as carbohydrate or sodium.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference.
	 * @see #setModifier(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderNutrient_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getModifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderNutrient#getModifier <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' containment reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of the specified nutrient to include in diet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderNutrient_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderNutrient#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Quantity value);

} // NutritionOrderNutrient
