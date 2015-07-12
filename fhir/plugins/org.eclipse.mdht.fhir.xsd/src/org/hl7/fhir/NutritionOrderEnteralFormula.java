/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Enteral Formula</b></em>'.
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
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getAdministrationInstructions <em>Administration Instructions</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getBaseFormulaType <em>Base Formula Type</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getBaseFormulaProductName <em>Base Formula Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getScheduled <em>Scheduled</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getAdditiveType <em>Additive Type</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getAdditiveProductName <em>Additive Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getCaloricDensity <em>Caloric Density</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getRouteofAdministration <em>Routeof Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getRate <em>Rate</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getRateAdjustment <em>Rate Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderEnteralFormula#getMaxVolumeToDeliver <em>Max Volume To Deliver</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula()
 * @model extendedMetaData="name='NutritionOrder.EnteralFormula' kind='elementOnly'"
 * @generated
 */
public interface NutritionOrderEnteralFormula extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Administration Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free text formula administration, feeding instructions or additional instructions or information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administration Instructions</em>' containment reference.
	 * @see #setAdministrationInstructions(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_AdministrationInstructions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='administrationInstructions' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAdministrationInstructions();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getAdministrationInstructions <em>Administration Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administration Instructions</em>' containment reference.
	 * @see #getAdministrationInstructions()
	 * @generated
	 */
	void setAdministrationInstructions(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Base Formula Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Formula Type</em>' containment reference.
	 * @see #setBaseFormulaType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_BaseFormulaType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseFormulaType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBaseFormulaType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getBaseFormulaType <em>Base Formula Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Formula Type</em>' containment reference.
	 * @see #getBaseFormulaType()
	 * @generated
	 */
	void setBaseFormulaType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Base Formula Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product or brand name of the enteral or infant formula product such as "ACME Adult Standard Formula".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Formula Product Name</em>' containment reference.
	 * @see #setBaseFormulaProductName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_BaseFormulaProductName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseFormulaProductName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getBaseFormulaProductName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getBaseFormulaProductName <em>Base Formula Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Formula Product Name</em>' containment reference.
	 * @see #getBaseFormulaProductName()
	 * @generated
	 */
	void setBaseFormulaProductName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time period and frequency at which the enteral formula should be delivered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduled</em>' containment reference.
	 * @see #setScheduled(Timing)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_Scheduled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scheduled' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getScheduled();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getScheduled <em>Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled</em>' containment reference.
	 * @see #getScheduled()
	 * @generated
	 */
	void setScheduled(Timing value);

	/**
	 * Returns the value of the '<em><b>Additive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additive Type</em>' containment reference.
	 * @see #setAdditiveType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_AdditiveType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additiveType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdditiveType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getAdditiveType <em>Additive Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Type</em>' containment reference.
	 * @see #getAdditiveType()
	 * @generated
	 */
	void setAdditiveType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additive Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product or brand name of the type of modular component to be added to the formula.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additive Product Name</em>' containment reference.
	 * @see #setAdditiveProductName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_AdditiveProductName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additiveProductName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAdditiveProductName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getAdditiveProductName <em>Additive Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Product Name</em>' containment reference.
	 * @see #getAdditiveProductName()
	 * @generated
	 */
	void setAdditiveProductName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Caloric Density</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of energy (Calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula the provides 24 Calories per fluid ounce or an adult may require an enteral formula that provides 1.5 Calorie/mL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caloric Density</em>' containment reference.
	 * @see #setCaloricDensity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_CaloricDensity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caloricDensity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getCaloricDensity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getCaloricDensity <em>Caloric Density</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caloric Density</em>' containment reference.
	 * @see #getCaloricDensity()
	 * @generated
	 */
	void setCaloricDensity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Routeof Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The route or physiological path of administration into the patient 's gastrointestinal  tract for purposes of providing the formula feeding, e.g., nasogastric tube.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Routeof Administration</em>' containment reference.
	 * @see #setRouteofAdministration(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_RouteofAdministration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeofAdministration' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRouteofAdministration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getRouteofAdministration <em>Routeof Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routeof Administration</em>' containment reference.
	 * @see #getRouteofAdministration()
	 * @generated
	 */
	void setRouteofAdministration(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The volume of formula to provide to the patient per the specified administration schedule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rate of administration of formula via a feeding pump, e.g., 60 mL per hour, according to the specified schedule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate</em>' containment reference.
	 * @see #setRate(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_Rate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rate' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getRate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getRate <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' containment reference.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(Ratio value);

	/**
	 * Returns the value of the '<em><b>Rate Adjustment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The change in the rate of administration over a given time, e.g. increase by 10 mL/hour every 4 hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Adjustment</em>' containment reference.
	 * @see #setRateAdjustment(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_RateAdjustment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateAdjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getRateAdjustment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getRateAdjustment <em>Rate Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Adjustment</em>' containment reference.
	 * @see #getRateAdjustment()
	 * @generated
	 */
	void setRateAdjustment(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Volume To Deliver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum total quantity of formula that may be administered to a subject over the period of time, e.g., 1440 mL over 24 hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Volume To Deliver</em>' containment reference.
	 * @see #setMaxVolumeToDeliver(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderEnteralFormula_MaxVolumeToDeliver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxVolumeToDeliver' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMaxVolumeToDeliver();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderEnteralFormula#getMaxVolumeToDeliver <em>Max Volume To Deliver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Volume To Deliver</em>' containment reference.
	 * @see #getMaxVolumeToDeliver()
	 * @generated
	 */
	void setMaxVolumeToDeliver(Quantity value);

} // NutritionOrderEnteralFormula
