/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Naming System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NamingSystem#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link org.hl7.fhir.NamingSystem#getReplacedBy <em>Replaced By</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNamingSystem()
 * @model extendedMetaData="name='NamingSystem' kind='elementOnly'"
 * @generated
 */
public interface NamingSystem extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name of this particular identifier type or code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NamingSystem#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the namingsystem is "ready for use" or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NamingSystem#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the purpose for the namingsystem - what kinds of things does it make unique?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(NamingSystemType)
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_Kind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kind' namespace='##targetNamespace'"
	 * @generated
	 */
	NamingSystemType getKind();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NamingSystem#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(NamingSystemType value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the individual or organization that published the naming system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NamingSystem#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.NamingSystemContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contacts to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NamingSystemContact> getContact();

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the organization that is responsible for issuing identifiers or codes for this namespace and ensuring their non-collision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_Responsible()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getResponsible();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NamingSystem#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date  (and optionally time) when the system was registered or published. The date must change when the business version changes, if it does, and it must change if the status code changes. in addition, it should change when the substantiative content of the registration changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NamingSystem#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categorizes a namingsystem for easier search by grouping related namingsystems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NamingSystem#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about what the namespace identifies including scope, granularity, version labeling, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NamingSystem#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of naming systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getUseContext();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides guidance on the use of the namespace, including the handling of formatting characters, use of upper vs. lower case, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' containment reference.
	 * @see #setUsage(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_Usage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getUsage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NamingSystem#getUsage <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' containment reference.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Unique Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.NamingSystemUniqueId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the system may be identified when referenced in electronic exchange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_UniqueId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uniqueId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NamingSystemUniqueId> getUniqueId();

	/**
	 * Returns the value of the '<em><b>Replaced By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For namingsystems that are retired, indicates the namingsystem that should be used in their place (if any).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaced By</em>' containment reference.
	 * @see #setReplacedBy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getNamingSystem_ReplacedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='replacedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReplacedBy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NamingSystem#getReplacedBy <em>Replaced By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaced By</em>' containment reference.
	 * @see #getReplacedBy()
	 * @generated
	 */
	void setReplacedBy(Reference value);

} // NamingSystem
