/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Administration</b></em>'.
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
 *   <li>{@link org.hl7.fhir.NutritionOrderAdministration#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderAdministration#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderAdministration#getRateQuantity <em>Rate Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrderAdministration#getRateRatio <em>Rate Ratio</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionOrderAdministration()
 * @model extendedMetaData="name='NutritionOrder.Administration' kind='elementOnly'"
 * @generated
 */
public interface NutritionOrderAdministration extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time period and frequency at which the enteral formula should be delivered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Timing)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderAdministration_Schedule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getSchedule();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderAdministration#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Timing value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The volume of formula to provide to the patient per the specified administration schedule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderAdministration_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderAdministration#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Quantity</em>' containment reference.
	 * @see #setRateQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderAdministration_RateQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getRateQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderAdministration#getRateQuantity <em>Rate Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Quantity</em>' containment reference.
	 * @see #getRateQuantity()
	 * @generated
	 */
	void setRateQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Rate Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Ratio</em>' containment reference.
	 * @see #setRateRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrderAdministration_RateRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getRateRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrderAdministration#getRateRatio <em>Rate Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Ratio</em>' containment reference.
	 * @see #getRateRatio()
	 * @generated
	 */
	void setRateRatio(Ratio value);

} // NutritionOrderAdministration
