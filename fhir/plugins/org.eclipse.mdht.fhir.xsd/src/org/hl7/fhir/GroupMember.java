/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized.  I.e. A collection of entities that isn't an Organization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.GroupMember#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.hl7.fhir.GroupMember#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.GroupMember#getInactive <em>Inactive</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGroupMember()
 * @model extendedMetaData="name='Group.Member' kind='elementOnly'"
 * @generated
 */
public interface GroupMember extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the entity that is a member of the group. Must be consistent with Group.type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGroupMember_Entity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEntity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GroupMember#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Reference value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period that the member was in the group, if known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getGroupMember_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GroupMember#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Inactive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag to indicate that the member is no longer in the group, but previously may have been a member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inactive</em>' containment reference.
	 * @see #setInactive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getGroupMember_Inactive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inactive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getInactive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GroupMember#getInactive <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive</em>' containment reference.
	 * @see #getInactive()
	 * @generated
	 */
	void setInactive(org.hl7.fhir.Boolean value);

} // GroupMember
