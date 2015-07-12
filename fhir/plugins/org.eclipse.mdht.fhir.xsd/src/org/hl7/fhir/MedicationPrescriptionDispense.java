/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Prescription Dispense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An order for both supply of the medication and the instructions for administration of the medicine to a patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationPrescriptionDispense#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescriptionDispense#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescriptionDispense#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescriptionDispense#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPrescriptionDispense#getExpectedSupplyDuration <em>Expected Supply Duration</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationPrescriptionDispense()
 * @model extendedMetaData="name='MedicationPrescription.Dispense' kind='elementOnly'"
 * @generated
 */
public interface MedicationPrescriptionDispense extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference.
	 * @see #setMedication(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescriptionDispense_Medication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medication' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMedication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescriptionDispense#getMedication <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication</em>' containment reference.
	 * @see #getMedication()
	 * @generated
	 */
	void setMedication(Reference value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Design Comments: This indicates the validity period of a prescription (stale dating the Prescription) 
	 * It reflects the prescriber perspective for the validity of the prescription. Dispenses must not be made against the prescription outside of this period. The lower-bound of the Dispensing Window signifies the earliest date that the prescription can be filled for the first time. If an upper-bound is not specified then the Prescription is open-ended or will default to a stale-date based on regulations. 
	 * Rationale: Indicates when the Prescription becomes valid, and when it ceases to be a dispensable Prescription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference.
	 * @see #setValidityPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescriptionDispense_ValidityPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validityPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValidityPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescriptionDispense#getValidityPeriod <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' containment reference.
	 * @see #getValidityPeriod()
	 * @generated
	 */
	void setValidityPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Number Of Repeats Allowed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer indicating the number of repeats of the Dispense. 
	 * UsageNotes: For example, the number of times the prescribed quantity is to be supplied including the initial standard fill.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Repeats Allowed</em>' containment reference.
	 * @see #setNumberOfRepeatsAllowed(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescriptionDispense_NumberOfRepeatsAllowed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfRepeatsAllowed' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getNumberOfRepeatsAllowed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescriptionDispense#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Repeats Allowed</em>' containment reference.
	 * @see #getNumberOfRepeatsAllowed()
	 * @generated
	 */
	void setNumberOfRepeatsAllowed(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount that is to be dispensed for one fill.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescriptionDispense_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescriptionDispense#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Expected Supply Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last. 
	 * In some situations, this attribute may be used instead of quantity to identify the amount supplied by how long it is expected to last, rather than the physical quantity issued, e.g. 90 days supply of medication (based on an ordered dosage) When possible, it is always better to specify quantity, as this tends to be more precise. expectedSupplyDuration will always be an estimate that can be influenced by external factors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Supply Duration</em>' containment reference.
	 * @see #setExpectedSupplyDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescriptionDispense_ExpectedSupplyDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expectedSupplyDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getExpectedSupplyDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescriptionDispense#getExpectedSupplyDuration <em>Expected Supply Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Supply Duration</em>' containment reference.
	 * @see #getExpectedSupplyDuration()
	 * @generated
	 */
	void setExpectedSupplyDuration(Duration value);

} // MedicationPrescriptionDispense
