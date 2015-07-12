/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AuditEventObject#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventObject#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventObject#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventObject#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventObject#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventObject#getSensitivity <em>Sensitivity</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventObject#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventObject#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventObject#getQuery <em>Query</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventObject#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAuditEventObject()
 * @model extendedMetaData="name='AuditEvent.Object' kind='elementOnly'"
 * @generated
 */
public interface AuditEventObject extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a specific instance of the participant object. The reference should always be version specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventObject_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventObject#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a specific instance of the participant object. The reference should always be version specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventObject_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventObject#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the object that was involved in this audit event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AuditEventObjectType)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventObject_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventObjectType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventObject#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AuditEventObjectType value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code representing the functional application role of Participant Object being audited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(AuditEventObjectRole)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventObject_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventObjectRole getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventObject#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(AuditEventObjectRole value);

	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the data life-cycle stage for the participant object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifecycle</em>' containment reference.
	 * @see #setLifecycle(AuditEventObjectLifecycle)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventObject_Lifecycle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lifecycle' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventObjectLifecycle getLifecycle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventObject#getLifecycle <em>Lifecycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' containment reference.
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(AuditEventObjectLifecycle value);

	/**
	 * Returns the value of the '<em><b>Sensitivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes policy-defined sensitivity for the Participant Object ID such as VIP, HIV status, mental health status or similar topics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensitivity</em>' containment reference.
	 * @see #setSensitivity(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventObject_Sensitivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sensitivity' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSensitivity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventObject#getSensitivity <em>Sensitivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitivity</em>' containment reference.
	 * @see #getSensitivity()
	 * @generated
	 */
	void setSensitivity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An instance-specific descriptor of the Participant Object ID audited, such as a person's name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventObject_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventObject#getName <em>Name</em>}' containment reference.
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
	 * Text that describes the object in more detail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventObject_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventObject#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual query for a query-type participant object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventObject_Query()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getQuery();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventObject#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AuditEventDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Information about the Object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEventObject_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuditEventDetail> getDetail();

} // AuditEventObject
