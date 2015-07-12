/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Prescription Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A code specifying the state of the prescribing event. Describes the lifecycle of the prescription.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationPrescriptionStatus#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationPrescriptionStatus()
 * @model extendedMetaData="name='MedicationPrescriptionStatus' kind='elementOnly'"
 * @generated
 */
public interface MedicationPrescriptionStatus extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.MedicationPrescriptionStatusList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.MedicationPrescriptionStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(MedicationPrescriptionStatusList)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPrescriptionStatus_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	MedicationPrescriptionStatusList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPrescriptionStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.MedicationPrescriptionStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(MedicationPrescriptionStatusList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.MedicationPrescriptionStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(MedicationPrescriptionStatusList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.MedicationPrescriptionStatus#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(MedicationPrescriptionStatusList)
	 * @generated
	 */
	boolean isSetValue();

} // MedicationPrescriptionStatus
