/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Term</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ContractTerm#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getActionReason <em>Action Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getValuedItem <em>Valued Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContractTerm()
 * @model extendedMetaData="name='Contract.Term' kind='elementOnly'"
 * @generated
 */
public interface ContractTerm extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this particular Contract Provision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this Contract Provision was issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getIssued();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(DateTime value);

	/**
	 * Returns the value of the '<em><b>Applies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relevant time or time-period when this Contract Provision is applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies</em>' containment reference.
	 * @see #setApplies(Period)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Applies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applies' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getApplies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getApplies <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies</em>' containment reference.
	 * @see #getApplies()
	 * @generated
	 */
	void setApplies(Period value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g., life time maximum benefit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subtype of this Contract Provision, e.g., life time maximum payment for a contract term for specific valued item, e.g., disability payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference.
	 * @see #setSubType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_SubType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getSubType <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' containment reference.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who or what this Contract Provision is about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action stipulated by this Contract Provision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAction();

	/**
	 * Returns the value of the '<em><b>Action Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason or purpose for the action stipulated by this Contract Provision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_ActionReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actionReason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getActionReason();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractActor1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of actors participating in this Contract Provision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Actor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractActor1> getActor();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human readable form of this Contract Provision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Valued Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractValuedItem1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract Provision Valued Item List.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valued Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_ValuedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valuedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractValuedItem1> getValuedItem();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractTerm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested group of Contract Provisions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractTerm> getGroup();

} // ContractTerm
