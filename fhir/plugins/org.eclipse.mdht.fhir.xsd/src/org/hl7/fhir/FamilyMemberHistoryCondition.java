/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Member History Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetAge <em>Onset Age</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetRange <em>Onset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetString <em>Onset String</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryCondition()
 * @model extendedMetaData="name='FamilyMemberHistory.Condition' kind='elementOnly'"
 * @generated
 */
public interface FamilyMemberHistoryCondition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryCondition_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryCondition_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Onset Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset Age</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Age</em>' containment reference.
	 * @see #setOnsetAge(Age)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryCondition_OnsetAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getOnsetAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetAge <em>Onset Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Age</em>' containment reference.
	 * @see #getOnsetAge()
	 * @generated
	 */
	void setOnsetAge(Age value);

	/**
	 * Returns the value of the '<em><b>Onset Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Range</em>' containment reference.
	 * @see #setOnsetRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryCondition_OnsetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOnsetRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetRange <em>Onset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Range</em>' containment reference.
	 * @see #getOnsetRange()
	 * @generated
	 */
	void setOnsetRange(Range value);

	/**
	 * Returns the value of the '<em><b>Onset String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset String</em>' containment reference.
	 * @see #setOnsetString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryCondition_OnsetString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getOnsetString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetString <em>Onset String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset String</em>' containment reference.
	 * @see #getOnsetString()
	 * @generated
	 */
	void setOnsetString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An area where general notes can be placed about this specific condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getFamilyMemberHistoryCondition_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNote();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(org.hl7.fhir.String value);

} // FamilyMemberHistoryCondition
