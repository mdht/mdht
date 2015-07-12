/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contraindication Mitigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient.  E.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ContraindicationMitigation#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.ContraindicationMitigation#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ContraindicationMitigation#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContraindicationMitigation()
 * @model extendedMetaData="name='Contraindication.Mitigation' kind='elementOnly'"
 * @generated
 */
public interface ContraindicationMitigation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the action that was taken or the observation that was made that reduces/eliminates the risk associated with the identified contraindication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContraindicationMitigation_Action()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContraindicationMitigation#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when the mitigating action was documented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getContraindicationMitigation_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContraindicationMitigation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContraindicationMitigation_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContraindicationMitigation#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

} // ContraindicationMitigation
