/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EncounterParticipant#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterParticipant#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterParticipant#getIndividual <em>Individual</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEncounterParticipant()
 * @model extendedMetaData="name='Encounter.Participant' kind='elementOnly'"
 * @generated
 */
public interface EncounterParticipant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role of participant in encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounterParticipant_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period of time that the specified participant was present during the encounter. These can overlap or be sub-sets of the overall encounters period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getEncounterParticipant_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterParticipant#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Persons involved in the encounter other than the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individual</em>' containment reference.
	 * @see #setIndividual(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounterParticipant_Individual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='individual' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getIndividual();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterParticipant#getIndividual <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' containment reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(Reference value);

} // EncounterParticipant
