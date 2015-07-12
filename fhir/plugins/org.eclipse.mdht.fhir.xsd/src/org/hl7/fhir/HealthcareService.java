/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Healthcare Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The details of a Healthcare Service available at a location.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.HealthcareService#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getExtraDetails <em>Extra Details</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getCoverageArea <em>Coverage Area</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getServiceProvisionCode <em>Service Provision Code</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getEligibility <em>Eligibility</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getEligibilityNote <em>Eligibility Note</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getProgramName <em>Program Name</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getReferralMethod <em>Referral Method</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getAppointmentRequired <em>Appointment Required</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getNotAvailable <em>Not Available</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getHealthcareService()
 * @model extendedMetaData="name='HealthcareService' kind='elementOnly'"
 * @generated
 */
public interface HealthcareService extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External Identifiers for this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Provided By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that provides this Healthcare Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided By</em>' containment reference.
	 * @see #setProvidedBy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ProvidedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProvidedBy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getProvidedBy <em>Provided By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided By</em>' containment reference.
	 * @see #getProvidedBy()
	 * @generated
	 */
	void setProvidedBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where this healthcare service may be provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Location()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the broad category of service being performed or delivered. Selecting a Service Category then determines the list of relevant service types that can be selected in the Primary Service Type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Category</em>' containment reference.
	 * @see #setServiceCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ServiceCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getServiceCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getServiceCategory <em>Service Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Category</em>' containment reference.
	 * @see #getServiceCategory()
	 * @generated
	 */
	void setServiceCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.HealthcareServiceServiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific type of service that may be delivered or performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ServiceType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HealthcareServiceServiceType> getServiceType();

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Further description of the service as it would be presented to a consumer while searching.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' containment reference.
	 * @see #setServiceName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ServiceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getServiceName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getServiceName <em>Service Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' containment reference.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Extra Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra details about the service that can't be placed in the other fields.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extra Details</em>' containment reference.
	 * @see #setExtraDetails(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ExtraDetails()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extraDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getExtraDetails();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getExtraDetails <em>Extra Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Details</em>' containment reference.
	 * @see #getExtraDetails()
	 * @generated
	 */
	void setExtraDetails(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference.
	 * @see #setPhoto(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Photo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='photo' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getPhoto();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getPhoto <em>Photo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo</em>' containment reference.
	 * @see #getPhoto()
	 * @generated
	 */
	void setPhoto(Attachment value);

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of contacts related to this specific healthcare service. If this is empty, then refer to the location's contacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getTelecom();

	/**
	 * Returns the value of the '<em><b>Coverage Area</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location(s) that this service is available to (not where the service is provided).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Area</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_CoverageArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageArea' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getCoverageArea();

	/**
	 * Returns the value of the '<em><b>Service Provision Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code(s) that detail the conditions under which the healthcare service is available/offered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Provision Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ServiceProvisionCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceProvisionCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getServiceProvisionCode();

	/**
	 * Returns the value of the '<em><b>Eligibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does this service have specific eligibility requirements that need to be met in order to use the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eligibility</em>' containment reference.
	 * @see #setEligibility(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Eligibility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eligibility' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getEligibility();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getEligibility <em>Eligibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eligibility</em>' containment reference.
	 * @see #getEligibility()
	 * @generated
	 */
	void setEligibility(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Eligibility Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of service eligibility should, in general, not exceed one or two paragraphs. It should be sufficient for a prospective consumer to determine if they are likely to be eligible or not. Where eligibility requirements and conditions are complex, it may simply be noted that an eligibility assessment is required. Where eligibility is determined by an outside source, such as an Act of Parliament, this should be noted, preferably with a reference to a commonly available copy of the source document such as a web page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eligibility Note</em>' containment reference.
	 * @see #setEligibilityNote(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_EligibilityNote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eligibilityNote' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getEligibilityNote();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getEligibilityNote <em>Eligibility Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eligibility Note</em>' containment reference.
	 * @see #getEligibilityNote()
	 * @generated
	 */
	void setEligibilityNote(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Program Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Program Names that can be used to categorize the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ProgramName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='programName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getProgramName();

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collection of Characteristics (attributes).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Characteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCharacteristic();

	/**
	 * Returns the value of the '<em><b>Referral Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Method</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ReferralMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referralMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReferralMethod();

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Key</em>' containment reference.
	 * @see #setPublicKey(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_PublicKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publicKey' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublicKey();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getPublicKey <em>Public Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key</em>' containment reference.
	 * @see #getPublicKey()
	 * @generated
	 */
	void setPublicKey(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Appointment Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not a prospective consumer will require an appointment for a particular service at a Site to be provided by the Organization. Indicates if an appointment is required for access to this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment Required</em>' containment reference.
	 * @see #setAppointmentRequired(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_AppointmentRequired()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appointmentRequired' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAppointmentRequired();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getAppointmentRequired <em>Appointment Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Required</em>' containment reference.
	 * @see #getAppointmentRequired()
	 * @generated
	 */
	void setAppointmentRequired(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Available Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.HealthcareServiceAvailableTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Collection of times that the Service Site is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Time</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_AvailableTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availableTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HealthcareServiceAvailableTime> getAvailableTime();

	/**
	 * Returns the value of the '<em><b>Not Available</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.HealthcareServiceNotAvailable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HealthcareService is not available during this period of time due to the provided reason.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Available</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_NotAvailable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notAvailable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HealthcareServiceNotAvailable> getNotAvailable();

	/**
	 * Returns the value of the '<em><b>Availability Exceptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of Site availability exceptions, e.g., public holiday availability. Succinctly describing all possible exceptions to normal Site availability as details in the Available Times and Not Available Times.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Exceptions</em>' containment reference.
	 * @see #setAvailabilityExceptions(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_AvailabilityExceptions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availabilityExceptions' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAvailabilityExceptions();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getAvailabilityExceptions <em>Availability Exceptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Exceptions</em>' containment reference.
	 * @see #getAvailabilityExceptions()
	 * @generated
	 */
	void setAvailabilityExceptions(org.hl7.fhir.String value);

} // HealthcareService
