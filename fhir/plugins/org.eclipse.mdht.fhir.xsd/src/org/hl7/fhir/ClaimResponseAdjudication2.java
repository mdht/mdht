/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Adjudication2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the adjudication details from the processing of a Claim resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimResponseAdjudication2#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseAdjudication2#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseAdjudication2#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponseAdjudication2()
 * @model extendedMetaData="name='ClaimResponse.Adjudication2' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponseAdjudication2 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code indicating: Co-Pay, deductable, elegible, benefit, tax, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseAdjudication2_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseAdjudication2#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Coding value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monitory amount associated with the code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseAdjudication2_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseAdjudication2#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A non-monitary value for example a percentage. Mutually exclusive to the amount element above.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseAdjudication2_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseAdjudication2#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Decimal value);

} // ClaimResponseAdjudication2
