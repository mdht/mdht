/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Episode Of Care</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getStatusHistory <em>Status History</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getReferralRequest <em>Referral Request</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getCareManager <em>Care Manager</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getCareTeam <em>Care Team</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare()
 * @model extendedMetaData="name='EpisodeOfCare' kind='elementOnly'"
 * @generated
 */
public interface EpisodeOfCare extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier(s) by which this EpisodeOfCare is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * planned | waitlist | active | onhold | finished | cancelled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EpisodeOfCareStatus)
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EpisodeOfCareStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCare#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EpisodeOfCareStatus value);

	/**
	 * Returns the value of the '<em><b>Status History</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EpisodeOfCareStatusHistory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status history for the EpisodeOfCare.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status History</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare_StatusHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EpisodeOfCareStatusHistory> getStatusHistory();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type can be very important in processing as this could be used in determining if the EpisodeOfCare is relevant to specific government reporting, or other types of classifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient that this EpisodeOfCare applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCare#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Managing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that has assumed the specific responsibilities for the specified duration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managing Organization</em>' containment reference.
	 * @see #setManagingOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare_ManagingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='managingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManagingOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCare#getManagingOrganization <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Organization</em>' containment reference.
	 * @see #getManagingOrganization()
	 * @generated
	 */
	void setManagingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interval during which the managing organization assumes the defined responsibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCare#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getCondition();

	/**
	 * Returns the value of the '<em><b>Referral Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Request</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare_ReferralRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referralRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReferralRequest();

	/**
	 * Returns the value of the '<em><b>Care Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner that is the care manager/care co-ordinator for this patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Manager</em>' containment reference.
	 * @see #setCareManager(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare_CareManager()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='careManager' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCareManager();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCare#getCareManager <em>Care Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Care Manager</em>' containment reference.
	 * @see #getCareManager()
	 * @generated
	 */
	void setCareManager(Reference value);

	/**
	 * Returns the value of the '<em><b>Care Team</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EpisodeOfCareCareTeam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of practitioners that may be facilitating this episode of care for specific purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Team</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCare_CareTeam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='careTeam' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EpisodeOfCareCareTeam> getCareTeam();

} // EpisodeOfCare
