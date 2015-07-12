/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ContractActor#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractActor#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContractActor()
 * @model extendedMetaData="name='Contract.Actor' kind='elementOnly'"
 * @generated
 */
public interface ContractActor extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who or what actors are assigned roles in this Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContractActor_Entity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEntity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractActor#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Reference value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role type of actors assigned roles in this Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractActor_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRole();

} // ContractActor
