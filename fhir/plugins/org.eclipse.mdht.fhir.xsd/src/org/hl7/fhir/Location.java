/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Location#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Location#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Location#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Location#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.Location#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Location#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.Location#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.Location#getPhysicalType <em>Physical Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Location#getPosition <em>Position</em>}</li>
 *   <li>{@link org.hl7.fhir.Location#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.Location#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.Location#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getLocation()
 * @model extendedMetaData="name='Location' kind='elementOnly'"
 * @generated
 */
public interface Location extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique code or number identifying the location to its users.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getLocation_Identifier()
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
	 * Name of the location as used by humans. Does not need to be unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getLocation_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Location#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the Location, which helps in finding or referencing the place.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getLocation_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Location#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether a resource instance represents a specific location or a class of locations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(LocationMode)
	 * @see org.hl7.fhir.FhirPackage#getLocation_Mode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationMode getMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Location#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(LocationMode value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of function performed at the location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getLocation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Location#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getLocation_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getTelecom();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getLocation_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Location#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Physical Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical form of the location, e.g. building, room, vehicle, road.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Type</em>' containment reference.
	 * @see #setPhysicalType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getLocation_PhysicalType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='physicalType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPhysicalType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Location#getPhysicalType <em>Physical Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Type</em>' containment reference.
	 * @see #getPhysicalType()
	 * @generated
	 */
	void setPhysicalType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The absolute geographic location of the Location, expressed in with the WGS84 datum (This is the same co-ordinate system used in KML).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(LocationPosition)
	 * @see org.hl7.fhir.FhirPackage#getLocation_Position()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationPosition getPosition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Location#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(LocationPosition value);

	/**
	 * Returns the value of the '<em><b>Managing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that is responsible for the provisioning and upkeep of the location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managing Organization</em>' containment reference.
	 * @see #setManagingOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getLocation_ManagingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='managingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManagingOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Location#getManagingOrganization <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Organization</em>' containment reference.
	 * @see #getManagingOrganization()
	 * @generated
	 */
	void setManagingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another Location which this Location is physically part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference.
	 * @see #setPartOf(Reference)
	 * @see org.hl7.fhir.FhirPackage#getLocation_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPartOf();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Location#getPartOf <em>Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' containment reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * active | suspended | inactive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(LocationStatus)
	 * @see org.hl7.fhir.FhirPackage#getLocation_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Location#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(LocationStatus value);

} // Location
