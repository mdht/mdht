/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Patient#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getDeceasedBoolean <em>Deceased Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getDeceasedDateTime <em>Deceased Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getMaritalStatus <em>Marital Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getMultipleBirthBoolean <em>Multiple Birth Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getMultipleBirthInteger <em>Multiple Birth Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getAnimal <em>Animal</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getCareProvider <em>Care Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.Patient#getActive <em>Active</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPatient()
 * @model extendedMetaData="name='Patient' kind='elementOnly'"
 * @generated
 */
public interface Patient extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for this patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPatient_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.HumanName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name associated with the individual.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPatient_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HumanName> getName();

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPatient_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getTelecom();

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gender</em>' containment reference.
	 * @see #setGender(AdministrativeGender)
	 * @see org.hl7.fhir.FhirPackage#getPatient_Gender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gender' namespace='##targetNamespace'"
	 * @generated
	 */
	AdministrativeGender getGender();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Patient#getGender <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' containment reference.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(AdministrativeGender value);

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of birth for the individual.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Birth Date</em>' containment reference.
	 * @see #setBirthDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPatient_BirthDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='birthDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Patient#getBirthDate <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' containment reference.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Deceased Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deceased Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceased Boolean</em>' containment reference.
	 * @see #setDeceasedBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getPatient_DeceasedBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deceasedBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getDeceasedBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Patient#getDeceasedBoolean <em>Deceased Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased Boolean</em>' containment reference.
	 * @see #getDeceasedBoolean()
	 * @generated
	 */
	void setDeceasedBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Deceased Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deceased Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceased Date Time</em>' containment reference.
	 * @see #setDeceasedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getPatient_DeceasedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deceasedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDeceasedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Patient#getDeceasedDateTime <em>Deceased Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased Date Time</em>' containment reference.
	 * @see #getDeceasedDateTime()
	 * @generated
	 */
	void setDeceasedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Addresses for the individual.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPatient_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Address> getAddress();

	/**
	 * Returns the value of the '<em><b>Marital Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field contains a patient's most recent marital (civil) status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marital Status</em>' containment reference.
	 * @see #setMaritalStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPatient_MaritalStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maritalStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMaritalStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Patient#getMaritalStatus <em>Marital Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marital Status</em>' containment reference.
	 * @see #getMaritalStatus()
	 * @generated
	 */
	void setMaritalStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Multiple Birth Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Birth Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Birth Boolean</em>' containment reference.
	 * @see #setMultipleBirthBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getPatient_MultipleBirthBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='multipleBirthBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getMultipleBirthBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Patient#getMultipleBirthBoolean <em>Multiple Birth Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Birth Boolean</em>' containment reference.
	 * @see #getMultipleBirthBoolean()
	 * @generated
	 */
	void setMultipleBirthBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Multiple Birth Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Birth Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Birth Integer</em>' containment reference.
	 * @see #setMultipleBirthInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getPatient_MultipleBirthInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='multipleBirthInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMultipleBirthInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Patient#getMultipleBirthInteger <em>Multiple Birth Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Birth Integer</em>' containment reference.
	 * @see #getMultipleBirthInteger()
	 * @generated
	 */
	void setMultipleBirthInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Image of the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPatient_Photo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='photo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getPhoto();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PatientContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A contact party (e.g. guardian, partner, friend) for the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPatient_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PatientContact> getContact();

	/**
	 * Returns the value of the '<em><b>Animal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element has a value if the patient is an animal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Animal</em>' containment reference.
	 * @see #setAnimal(PatientAnimal)
	 * @see org.hl7.fhir.FhirPackage#getPatient_Animal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='animal' namespace='##targetNamespace'"
	 * @generated
	 */
	PatientAnimal getAnimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Patient#getAnimal <em>Animal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animal</em>' containment reference.
	 * @see #getAnimal()
	 * @generated
	 */
	void setAnimal(PatientAnimal value);

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PatientCommunication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Languages which may be used to communicate with the patient about his or her health.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPatient_Communication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='communication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PatientCommunication> getCommunication();

	/**
	 * Returns the value of the '<em><b>Care Provider</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient's nominated care provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Provider</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPatient_CareProvider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='careProvider' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getCareProvider();

	/**
	 * Returns the value of the '<em><b>Managing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization that is the custodian of the patient record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managing Organization</em>' containment reference.
	 * @see #setManagingOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPatient_ManagingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='managingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManagingOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Patient#getManagingOrganization <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Organization</em>' containment reference.
	 * @see #getManagingOrganization()
	 * @generated
	 */
	void setManagingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PatientLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to another patient resource that concerns the same actual patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPatient_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PatientLink> getLink();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this patient record is in active use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getPatient_Active()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='active' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getActive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Patient#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(org.hl7.fhir.Boolean value);

} // Patient
