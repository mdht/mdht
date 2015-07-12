/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Plan Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient for a period of time, possibly limited to care for a specific condition or set of conditions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CarePlanParticipant#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanParticipant#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCarePlanParticipant()
 * @model extendedMetaData="name='CarePlan.Participant' kind='elementOnly'"
 * @generated
 */
public interface CarePlanParticipant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates specific responsibility of an individual within the care plan.  E.g. "Primary physician", "Team coordinator", "Caregiver", etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanParticipant_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanParticipant#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific person or organization who is participating/expected to participate in the care plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' containment reference.
	 * @see #setMember(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanParticipant_Member()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMember();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanParticipant#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(Reference value);

} // CarePlanParticipant
