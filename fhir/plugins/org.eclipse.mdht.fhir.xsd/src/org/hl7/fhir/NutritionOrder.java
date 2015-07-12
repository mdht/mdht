/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getFoodPreferenceModifier <em>Food Preference Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getExcludeFoodModifier <em>Exclude Food Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getOralDiet <em>Oral Diet</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getEnteralFormula <em>Enteral Formula</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionOrder()
 * @model extendedMetaData="name='NutritionOrder' kind='elementOnly'"
 * @generated
 */
public interface NutritionOrder extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Orderer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orderer</em>' containment reference.
	 * @see #setOrderer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Orderer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrderer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getOrderer <em>Orderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderer</em>' containment reference.
	 * @see #getOrderer()
	 * @generated
	 */
	void setOrderer(Reference value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this order by the order sender or by the order receiver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An encounter that provides additional information about the healthcare context in which this request is made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time that this nutrition order was requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_DateTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The workflow status of the nutrition order/request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(NutritionOrderStatus)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionOrderStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(NutritionOrderStatus value);

	/**
	 * Returns the value of the '<em><b>Allergy Intolerance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a record of allergies or Intolerances  which should be included in the nutrition order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allergy Intolerance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_AllergyIntolerance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allergyIntolerance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAllergyIntolerance();

	/**
	 * Returns the value of the '<em><b>Food Preference Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Food Preference Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_FoodPreferenceModifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='foodPreferenceModifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getFoodPreferenceModifier();

	/**
	 * Returns the value of the '<em><b>Exclude Food Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Food Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_ExcludeFoodModifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludeFoodModifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getExcludeFoodModifier();

	/**
	 * Returns the value of the '<em><b>Oral Diet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diet given orally in contrast to enteral (tube) feeding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oral Diet</em>' containment reference.
	 * @see #setOralDiet(NutritionOrderOralDiet)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_OralDiet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='oralDiet' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionOrderOralDiet getOralDiet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getOralDiet <em>Oral Diet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oral Diet</em>' containment reference.
	 * @see #getOralDiet()
	 * @generated
	 */
	void setOralDiet(NutritionOrderOralDiet value);

	/**
	 * Returns the value of the '<em><b>Supplement</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.NutritionOrderSupplement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Oral nutritional products given in order to add further nutritional value to the patient's diet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplement</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Supplement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionOrderSupplement> getSupplement();

	/**
	 * Returns the value of the '<em><b>Enteral Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enteral Formula</em>' containment reference.
	 * @see #setEnteralFormula(NutritionOrderEnteralFormula)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_EnteralFormula()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enteralFormula' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionOrderEnteralFormula getEnteralFormula();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getEnteralFormula <em>Enteral Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enteral Formula</em>' containment reference.
	 * @see #getEnteralFormula()
	 * @generated
	 */
	void setEnteralFormula(NutritionOrderEnteralFormula value);

} // NutritionOrder
