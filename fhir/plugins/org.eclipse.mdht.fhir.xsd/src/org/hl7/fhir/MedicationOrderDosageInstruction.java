/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Order Dosage Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An order for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationOrder" rather than "MedicationPrescription" to generalize the use across inpatient and outpatient settings as well as for care plans, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getAdditionalInstructions <em>Additional Instructions</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getAsNeededBoolean <em>As Needed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getDoseRange <em>Dose Range</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getRateRatio <em>Rate Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getRateRange <em>Rate Range</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDosageInstruction#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction()
 * @model extendedMetaData="name='MedicationOrder.DosageInstruction' kind='elementOnly'"
 * @generated
 */
public interface MedicationOrderDosageInstruction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Additional Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional instructions such as "Swallow with plenty of water" which may or may not be coded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Instructions</em>' containment reference.
	 * @see #setAdditionalInstructions(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_AdditionalInstructions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalInstructions' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdditionalInstructions();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getAdditionalInstructions <em>Additional Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Instructions</em>' containment reference.
	 * @see #getAdditionalInstructions()
	 * @generated
	 */
	void setAdditionalInstructions(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions, for example.  "Every  8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:";  "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing</em>' containment reference.
	 * @see #setTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_Timing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timing' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getTiming <em>Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing</em>' containment reference.
	 * @see #getTiming()
	 * @generated
	 */
	void setTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>As Needed Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Needed Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Needed Boolean</em>' containment reference.
	 * @see #setAsNeededBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_AsNeededBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAsNeededBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getAsNeededBoolean <em>As Needed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed Boolean</em>' containment reference.
	 * @see #getAsNeededBoolean()
	 * @generated
	 */
	void setAsNeededBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>As Needed Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Needed Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Needed Codeable Concept</em>' containment reference.
	 * @see #setAsNeededCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_AsNeededCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAsNeededCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed Codeable Concept</em>' containment reference.
	 * @see #getAsNeededCodeableConcept()
	 * @generated
	 */
	void setAsNeededCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded specification of the anatomic site where the medication first enters the body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see #setSite(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getSite <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' containment reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the route or physiological path of administration of a therapeutic agent into or onto a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded value indicating the method by which the medication is introduced into or onto the body. Most commonly used for injections.  Examples:  Slow Push; Deep IV.  Terminologies used often pre-coordinate this term with the route and or form of administration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Range</em>' containment reference.
	 * @see #setDoseRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_DoseRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDoseRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getDoseRange <em>Dose Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Range</em>' containment reference.
	 * @see #getDoseRange()
	 * @generated
	 */
	void setDoseRange(Range value);

	/**
	 * Returns the value of the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #setDoseQuantity(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_DoseQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getDoseQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getDoseQuantity <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #getDoseQuantity()
	 * @generated
	 */
	void setDoseQuantity(SimpleQuantity value);

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
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_RateRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getRateRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getRateRatio <em>Rate Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Ratio</em>' containment reference.
	 * @see #getRateRatio()
	 * @generated
	 */
	void setRateRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Rate Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Range</em>' containment reference.
	 * @see #setRateRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_RateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getRateRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getRateRange <em>Rate Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Range</em>' containment reference.
	 * @see #getRateRange()
	 * @generated
	 */
	void setRateRange(Range value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time. E.g. 1000mg in 24 hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Dose Per Period</em>' containment reference.
	 * @see #setMaxDosePerPeriod(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDosageInstruction_MaxDosePerPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDosePerPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getMaxDosePerPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDosageInstruction#getMaxDosePerPeriod <em>Max Dose Per Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Period</em>' containment reference.
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 */
	void setMaxDosePerPeriod(Ratio value);

} // MedicationOrderDosageInstruction
