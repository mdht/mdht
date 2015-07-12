/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Oral Diet</b></em>'.
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
 *   <li>{@link org.hl7.fhir.NutritionOrderOralDiet#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderOralDiet#getScheduled <em>Scheduled</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderOralDiet#getNutrient <em>Nutrient</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderOralDiet#getTexture <em>Texture</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderOralDiet#getFluidConsistencyType <em>Fluid Consistency Type</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderOralDiet#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionOrderOralDiet()
 * @model extendedMetaData="name='NutritionOrder.OralDiet' kind='elementOnly'"
 * @generated
 */
public interface NutritionOrderOralDiet extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderOralDiet_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time period and frequency at which the diet should be given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduled</em>' containment reference.
	 * @see #setScheduled(Timing)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderOralDiet_Scheduled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scheduled' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getScheduled();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderOralDiet#getScheduled <em>Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled</em>' containment reference.
	 * @see #getScheduled()
	 * @generated
	 */
	void setScheduled(Timing value);

	/**
	 * Returns the value of the '<em><b>Nutrient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.NutritionOrderNutrient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class that defines the quantity and type of nutrient modifications required for the oral diet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nutrient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderOralDiet_Nutrient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nutrient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionOrderNutrient> getNutrient();

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.NutritionOrderTexture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Texture</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderOralDiet_Texture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='texture' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionOrderTexture> getTexture();

	/**
	 * Returns the value of the '<em><b>Fluid Consistency Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required consistency (e.g., honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fluid Consistency Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderOralDiet_FluidConsistencyType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fluidConsistencyType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getFluidConsistencyType();

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free text or additional instructions or information pertaining to the oral diet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference.
	 * @see #setInstruction(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderOralDiet_Instruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instruction' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderOralDiet#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(org.hl7.fhir.String value);

} // NutritionOrderOralDiet
