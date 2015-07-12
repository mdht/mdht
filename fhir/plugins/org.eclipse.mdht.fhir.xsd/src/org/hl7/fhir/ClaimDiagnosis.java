/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimDiagnosis#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimDiagnosis#getDiagnosis <em>Diagnosis</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimDiagnosis()
 * @model extendedMetaData="name='Claim.Diagnosis' kind='elementOnly'"
 * @generated
 */
public interface ClaimDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence of diagnosis which serves to order and provide a link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimDiagnosis_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimDiagnosis#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference.
	 * @see #setDiagnosis(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimDiagnosis_Diagnosis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='diagnosis' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getDiagnosis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimDiagnosis#getDiagnosis <em>Diagnosis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosis</em>' containment reference.
	 * @see #getDiagnosis()
	 * @generated
	 */
	void setDiagnosis(Coding value);

} // ClaimDiagnosis
