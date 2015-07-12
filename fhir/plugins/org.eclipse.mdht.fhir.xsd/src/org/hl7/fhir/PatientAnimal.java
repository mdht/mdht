/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Animal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PatientAnimal#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.hl7.fhir.PatientAnimal#getBreed <em>Breed</em>}</li>
 *   <li>{@link org.hl7.fhir.PatientAnimal#getGenderStatus <em>Gender Status</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPatientAnimal()
 * @model extendedMetaData="name='Patient.Animal' kind='elementOnly'"
 * @generated
 */
public interface PatientAnimal extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Species</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the high level taxonomic categorization of the kind of animal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Species</em>' containment reference.
	 * @see #setSpecies(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPatientAnimal_Species()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='species' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSpecies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PatientAnimal#getSpecies <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' containment reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Breed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the detailed categorization of the kind of animal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Breed</em>' containment reference.
	 * @see #setBreed(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPatientAnimal_Breed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='breed' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBreed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PatientAnimal#getBreed <em>Breed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breed</em>' containment reference.
	 * @see #getBreed()
	 * @generated
	 */
	void setBreed(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Gender Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current state of the animal's reproductive organs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gender Status</em>' containment reference.
	 * @see #setGenderStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPatientAnimal_GenderStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genderStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGenderStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PatientAnimal#getGenderStatus <em>Gender Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender Status</em>' containment reference.
	 * @see #getGenderStatus()
	 * @generated
	 */
	void setGenderStatus(CodeableConcept value);

} // PatientAnimal
