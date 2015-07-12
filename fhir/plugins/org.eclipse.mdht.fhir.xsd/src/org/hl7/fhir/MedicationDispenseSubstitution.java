/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Dispense Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dispensing a medication to a named patient.  This includes a description of the supply provided and the instructions for administering the medication.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationDispenseSubstitution#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispenseSubstitution#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispenseSubstitution#getResponsibleParty <em>Responsible Party</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationDispenseSubstitution()
 * @model extendedMetaData="name='MedicationDispense.Substitution' kind='elementOnly'"
 * @generated
 */
public interface MedicationDispenseSubstitution extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code signifying whether a different drug was dispensed from what was prescribed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispenseSubstitution_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispenseSubstitution#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispenseSubstitution_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReason();

	/**
	 * Returns the value of the '<em><b>Responsible Party</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person or organization that has primary responsibility for the substitution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible Party</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationDispenseSubstitution_ResponsibleParty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsibleParty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getResponsibleParty();

} // MedicationDispenseSubstitution
