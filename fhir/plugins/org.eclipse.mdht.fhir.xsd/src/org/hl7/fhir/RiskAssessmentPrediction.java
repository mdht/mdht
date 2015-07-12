/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Assessment Prediction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RiskAssessmentPrediction#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessmentPrediction#getProbabilityDecimal <em>Probability Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessmentPrediction#getProbabilityRange <em>Probability Range</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessmentPrediction#getProbabilityCodeableConcept <em>Probability Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessmentPrediction#getRelativeRisk <em>Relative Risk</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessmentPrediction#getWhenPeriod <em>When Period</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessmentPrediction#getWhenRange <em>When Range</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessmentPrediction#getRationale <em>Rationale</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRiskAssessmentPrediction()
 * @model extendedMetaData="name='RiskAssessment.Prediction' kind='elementOnly'"
 * @generated
 */
public interface RiskAssessmentPrediction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One of the potential outcomes for the patient (e.g. remission, death,  a particular condition).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessmentPrediction_Outcome()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessmentPrediction#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Probability Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability Decimal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability Decimal</em>' containment reference.
	 * @see #setProbabilityDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessmentPrediction_ProbabilityDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='probabilityDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getProbabilityDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessmentPrediction#getProbabilityDecimal <em>Probability Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability Decimal</em>' containment reference.
	 * @see #getProbabilityDecimal()
	 * @generated
	 */
	void setProbabilityDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Probability Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability Range</em>' containment reference.
	 * @see #setProbabilityRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessmentPrediction_ProbabilityRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='probabilityRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getProbabilityRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessmentPrediction#getProbabilityRange <em>Probability Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability Range</em>' containment reference.
	 * @see #getProbabilityRange()
	 * @generated
	 */
	void setProbabilityRange(Range value);

	/**
	 * Returns the value of the '<em><b>Probability Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability Codeable Concept</em>' containment reference.
	 * @see #setProbabilityCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessmentPrediction_ProbabilityCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='probabilityCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProbabilityCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessmentPrediction#getProbabilityCodeableConcept <em>Probability Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability Codeable Concept</em>' containment reference.
	 * @see #getProbabilityCodeableConcept()
	 * @generated
	 */
	void setProbabilityCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Relative Risk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Risk</em>' containment reference.
	 * @see #setRelativeRisk(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessmentPrediction_RelativeRisk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relativeRisk' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getRelativeRisk();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessmentPrediction#getRelativeRisk <em>Relative Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Risk</em>' containment reference.
	 * @see #getRelativeRisk()
	 * @generated
	 */
	void setRelativeRisk(Decimal value);

	/**
	 * Returns the value of the '<em><b>When Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Period</em>' containment reference.
	 * @see #setWhenPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessmentPrediction_WhenPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getWhenPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessmentPrediction#getWhenPeriod <em>When Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Period</em>' containment reference.
	 * @see #getWhenPeriod()
	 * @generated
	 */
	void setWhenPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>When Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Range</em>' containment reference.
	 * @see #setWhenRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessmentPrediction_WhenRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getWhenRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessmentPrediction#getWhenRange <em>When Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Range</em>' containment reference.
	 * @see #getWhenRange()
	 * @generated
	 */
	void setWhenRange(Range value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information explaining the basis for the prediction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' containment reference.
	 * @see #setRationale(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessmentPrediction_Rationale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRationale();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessmentPrediction#getRationale <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' containment reference.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(org.hl7.fhir.String value);

} // RiskAssessmentPrediction
