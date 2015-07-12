/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Batch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Primarily used for identification and definition of Medication, but also covers ingredients and packaging.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationBatch#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationBatch#getExpirationDate <em>Expiration Date</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationBatch()
 * @model extendedMetaData="name='Medication.Batch' kind='elementOnly'"
 * @generated
 */
public interface MedicationBatch extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assigned lot number of a batch of the specified product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicationBatch_LotNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lotNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLotNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationBatch#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this specific batch of product will expire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference.
	 * @see #setExpirationDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationBatch_ExpirationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getExpirationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationBatch#getExpirationDate <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' containment reference.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(DateTime value);

} // MedicationBatch
