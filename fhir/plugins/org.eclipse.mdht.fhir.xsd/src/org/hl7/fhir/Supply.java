/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A supply - a  request for something, and provision of what is supplied.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Supply#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.Supply#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Supply#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Supply#getOrderedItem <em>Ordered Item</em>}</li>
 *   <li>{@link org.hl7.fhir.Supply#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Supply#getDispense <em>Dispense</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSupply()
 * @model extendedMetaData="name='Supply' kind='elementOnly'"
 * @generated
 */
public interface Supply extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSupply_Kind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kind' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getKind();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Supply#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this supply request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSupply_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Supply#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the supply request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(SupplyStatus)
	 * @see org.hl7.fhir.FhirPackage#getSupply_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplyStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Supply#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SupplyStatus value);

	/**
	 * Returns the value of the '<em><b>Ordered Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The item that is requested to be supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered Item</em>' containment reference.
	 * @see #setOrderedItem(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSupply_OrderedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrderedItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Supply#getOrderedItem <em>Ordered Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered Item</em>' containment reference.
	 * @see #getOrderedItem()
	 * @generated
	 */
	void setOrderedItem(Reference value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource representing the person whom the ordered item is for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSupply_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Supply#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Dispense</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SupplyDispense}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the details of the dispense event such as the days supply and quantity of a supply dispensed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dispense</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSupply_Dispense()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dispense' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupplyDispense> getDispense();

} // Supply
