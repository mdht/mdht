/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practitioner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Practitioner#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getPractitionerRole <em>Practitioner Role</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getQualification <em>Qualification</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getCommunication <em>Communication</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPractitioner()
 * @model extendedMetaData="name='Practitioner' kind='elementOnly'"
 * @generated
 */
public interface Practitioner extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that applies to this person in this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name associated with the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Practitioner#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A contact detail for the practitioner, e.g. a telephone number or an email address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getTelecom();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The postal address where the practitioner can be found or visited or to which mail can be delivered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Address> getAddress();

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gender</em>' containment reference.
	 * @see #setGender(Code)
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Gender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gender' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getGender();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Practitioner#getGender <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' containment reference.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Code value);

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of birth for the practitioner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Birth Date</em>' containment reference.
	 * @see #setBirthDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_BirthDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='birthDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Practitioner#getBirthDate <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' containment reference.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Image of the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Photo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='photo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getPhoto();

	/**
	 * Returns the value of the '<em><b>Practitioner Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PractitionerPractitionerRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of Roles/Organizations that the Practitioner is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Practitioner Role</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_PractitionerRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='practitionerRole' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PractitionerPractitionerRole> getPractitionerRole();

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PractitionerQualification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qualifications obtained by training and certification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Qualification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PractitionerQualification> getQualification();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A language the practitioner is able to use in patient communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Communication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='communication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCommunication();

} // Practitioner
