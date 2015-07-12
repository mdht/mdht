/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Prescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An authorization for the supply of glasses and/or contact lenses to a patient.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getPrescriber <em>Prescriber</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getDispense <em>Dispense</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getVisionPrescription()
 * @model extendedMetaData="name='VisionPrescription' kind='elementOnly'"
 * @generated
 */
public interface VisionPrescription extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier which may be used by other parties to reference or identify the prescription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Date Written</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date (and perhaps time) when the prescription was written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Written</em>' containment reference.
	 * @see #setDateWritten(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_DateWritten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateWritten' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateWritten();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getDateWritten <em>Date Written</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Written</em>' containment reference.
	 * @see #getDateWritten()
	 * @generated
	 */
	void setDateWritten(DateTime value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource representing the person to whom the Vision products will be supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Prescriber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare professional responsible for authorizing the prescription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prescriber</em>' containment reference.
	 * @see #setPrescriber(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_Prescriber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prescriber' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrescriber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getPrescriber <em>Prescriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriber</em>' containment reference.
	 * @see #getPrescriber()
	 * @generated
	 */
	void setPrescriber(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource that identifies the particular occurrence of contact between patient and health care provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Codeable Concept</em>' containment reference.
	 * @see #setReasonCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_ReasonCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReasonCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getReasonCodeableConcept <em>Reason Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Codeable Concept</em>' containment reference.
	 * @see #getReasonCodeableConcept()
	 * @generated
	 */
	void setReasonCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference.
	 * @see #setReasonReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReasonReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getReasonReference <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Reference</em>' containment reference.
	 * @see #getReasonReference()
	 * @generated
	 */
	void setReasonReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Dispense</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.VisionPrescriptionDispense}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deals with details of the dispense part of the supply specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dispense</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_Dispense()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dispense' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VisionPrescriptionDispense> getDispense();

} // VisionPrescription
