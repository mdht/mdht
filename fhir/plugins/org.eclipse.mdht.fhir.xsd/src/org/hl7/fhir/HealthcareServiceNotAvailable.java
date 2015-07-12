/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Healthcare Service Not Available</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The details of a Healthcare Service available at a location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.HealthcareServiceNotAvailable#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareServiceNotAvailable#getDuring <em>During</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getHealthcareServiceNotAvailable()
 * @model extendedMetaData="name='HealthcareService.NotAvailable' kind='elementOnly'"
 * @generated
 */
public interface HealthcareServiceNotAvailable extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason that can be presented to the user as to why this time is not available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareServiceNotAvailable_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareServiceNotAvailable#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>During</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service is not available (seasonally or for a public holiday) from this date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>During</em>' containment reference.
	 * @see #setDuring(Period)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareServiceNotAvailable_During()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='during' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDuring();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareServiceNotAvailable#getDuring <em>During</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>During</em>' containment reference.
	 * @see #getDuring()
	 * @generated
	 */
	void setDuring(Period value);

} // HealthcareServiceNotAvailable
