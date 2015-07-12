/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Naming System Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NamingSystemContact#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystemContact#getTelecom <em>Telecom</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNamingSystemContact()
 * @model extendedMetaData="name='NamingSystem.Contact' kind='elementOnly'"
 * @generated
 */
public interface NamingSystemContact extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of an individual to contact regarding the naming system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNamingSystemContact_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NamingSystemContact#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details for individual (if a name was provided) or the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNamingSystemContact_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getTelecom();

} // NamingSystemContact
