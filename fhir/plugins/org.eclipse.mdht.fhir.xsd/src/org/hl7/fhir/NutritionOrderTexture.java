/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Texture</b></em>'.
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
 *   <li>{@link org.hl7.fhir.NutritionOrderTexture#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderTexture#getFoodType <em>Food Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionOrderTexture()
 * @model extendedMetaData="name='NutritionOrder.Texture' kind='elementOnly'"
 * @generated
 */
public interface NutritionOrderTexture extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference.
	 * @see #setModifier(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderTexture_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getModifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderTexture#getModifier <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' containment reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Food Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The food type(s) (e.g., meats, all foods)  that the texture modification applies to.  This could be all foods types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Food Type</em>' containment reference.
	 * @see #setFoodType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderTexture_FoodType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='foodType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFoodType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderTexture#getFoodType <em>Food Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Food Type</em>' containment reference.
	 * @see #getFoodType()
	 * @generated
	 */
	void setFoodType(CodeableConcept value);

} // NutritionOrderTexture
