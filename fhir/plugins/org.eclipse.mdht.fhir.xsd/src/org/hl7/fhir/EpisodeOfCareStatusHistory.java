/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Episode Of Care Status History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EpisodeOfCareStatusHistory#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCareStatusHistory#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCareStatusHistory()
 * @model extendedMetaData="name='EpisodeOfCare.StatusHistory' kind='elementOnly'"
 * @generated
 */
public interface EpisodeOfCareStatusHistory extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * planned | waitlist | active | onhold | finished | cancelled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EpisodeOfCareStatus)
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCareStatusHistory_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EpisodeOfCareStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCareStatusHistory#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EpisodeOfCareStatus value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period during this EpisodeOfCare that the specific status applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCareStatusHistory_Period()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCareStatusHistory#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // EpisodeOfCareStatusHistory
