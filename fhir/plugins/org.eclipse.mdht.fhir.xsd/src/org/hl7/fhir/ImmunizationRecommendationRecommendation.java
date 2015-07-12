/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Recommendation Recommendation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A patient's point-of-time immunization status and recommendation with optional supporting justification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getVaccineType <em>Vaccine Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDoseNumber <em>Dose Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getForecastStatus <em>Forecast Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDateCriterion <em>Date Criterion</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getSupportingImmunization <em>Supporting Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getSupportingPatientInformation <em>Supporting Patient Information</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation()
 * @model extendedMetaData="name='ImmunizationRecommendation.Recommendation' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationRecommendationRecommendation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date the immunization recommendation was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Vaccine Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vaccine that pertains to the recommendation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vaccine Type</em>' containment reference.
	 * @see #setVaccineType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_VaccineType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vaccineType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getVaccineType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getVaccineType <em>Vaccine Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaccine Type</em>' containment reference.
	 * @see #getVaccineType()
	 * @generated
	 */
	void setVaccineType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Number</em>' containment reference.
	 * @see #setDoseNumber(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_DoseNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDoseNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDoseNumber <em>Dose Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Number</em>' containment reference.
	 * @see #getDoseNumber()
	 * @generated
	 */
	void setDoseNumber(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Forecast Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vaccine administration status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forecast Status</em>' containment reference.
	 * @see #setForecastStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_ForecastStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='forecastStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getForecastStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getForecastStatus <em>Forecast Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast Status</em>' containment reference.
	 * @see #getForecastStatus()
	 * @generated
	 */
	void setForecastStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImmunizationRecommendationDateCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vaccine date recommendations - e.g. earliest date to administer, latest date to administer, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Criterion</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_DateCriterion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImmunizationRecommendationDateCriterion> getDateCriterion();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains information about the protocol under which the vaccine was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(ImmunizationRecommendationProtocol)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_Protocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationRecommendationProtocol getProtocol();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ImmunizationRecommendationProtocol value);

	/**
	 * Returns the value of the '<em><b>Supporting Immunization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immunization event history that supports the status and recommendation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Immunization</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_SupportingImmunization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingImmunization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingImmunization();

	/**
	 * Returns the value of the '<em><b>Supporting Patient Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Patient Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_SupportingPatientInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingPatientInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingPatientInformation();

} // ImmunizationRecommendationRecommendation
