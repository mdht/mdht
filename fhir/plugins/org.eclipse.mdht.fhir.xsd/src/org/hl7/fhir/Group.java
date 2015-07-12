/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized.  I.e. A collection of entities that isn't an Organization.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Group#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getActual <em>Actual</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGroup()
 * @model extendedMetaData="name='Group' kind='elementOnly'"
 * @generated
 */
public interface Group extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique business identifier for this group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getGroup_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the broad classification of the kind of resources the group includes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(GroupType)
	 * @see org.hl7.fhir.FhirPackage#getGroup_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(GroupType value);

	/**
	 * Returns the value of the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual</em>' containment reference.
	 * @see #setActual(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getGroup_Actual()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actual' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getActual();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getActual <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' containment reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a specific type of resource the group includes.  E.g. "cow", "syringe", etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getGroup_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A label assigned to the group for human identification and communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGroup_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A count of the number of resource instances that are part of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getGroup_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GroupCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the traits shared by members of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGroup_Characteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GroupCharacteristic> getCharacteristic();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the resource instances that are members of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGroup_Member()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getMember();

} // Group
