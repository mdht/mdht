/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource identifies an instance of a manufactured thing that is used in the provision of healthcare without being substantially changed through that activity. The device may be a machine, an insert, a computer, an application, etc. This includes durable (reusable) medical equipment as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Device#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getModel <em>Model</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDevice()
 * @model extendedMetaData="name='Device' kind='elementOnly'"
 * @generated
 */
public interface Device extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique instance identifiers assigned to a device by organizations like manufacturers or owners .   If the identifier identifies the type of device, Device.type should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code or identifier to identify a kind of device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the Device availability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DeviceStatus)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DeviceStatus value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of the manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getManufacturer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "model" - an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Model()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='model' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getModel();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Manufacture Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Date and time when the device was manufactured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacture Date</em>' containment reference.
	 * @see #setManufactureDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDevice_ManufactureDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufactureDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getManufactureDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getManufactureDate <em>Manufacture Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacture Date</em>' containment reference.
	 * @see #getManufactureDate()
	 * @generated
	 */
	void setManufactureDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Expiry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time beyond which this device is no longer valid or should not be used (if applicable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiry</em>' containment reference.
	 * @see #setExpiry(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Expiry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expiry' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getExpiry();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getExpiry <em>Expiry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry</em>' containment reference.
	 * @see #getExpiry()
	 * @generated
	 */
	void setExpiry(DateTime value);

	/**
	 * Returns the value of the '<em><b>Udi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * United States Food and Drug Administration mandated Unique Device Identifier (UDI). Use the human readable information (the content that the user sees, which is sometimes different to the exact syntax represented in the barcode)  - see http://www.fda.gov/MedicalDevices/DeviceRegulationandGuidance/UniqueDeviceIdentification/default.htm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi</em>' containment reference.
	 * @see #setUdi(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Udi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udi' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getUdi();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getUdi <em>Udi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udi</em>' containment reference.
	 * @see #getUdi()
	 * @generated
	 */
	void setUdi(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lot number assigned by the manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_LotNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lotNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLotNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization that is responsible for the provision and ongoing maintenance of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Owner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='owner' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Reference value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource may be found in a literal location (i.e. GPS coordinates), a logical place (i.e. "in/with the patient"), or a coded location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient information, if the resource is affixed to a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details for an organization or a particular human that is responsible for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getContact();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A network address on which the device may be contacted directly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

} // Device
