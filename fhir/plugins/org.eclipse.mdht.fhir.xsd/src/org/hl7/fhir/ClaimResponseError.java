/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Error</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ClaimResponseError#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseError#getDetailSequenceLinkId <em>Detail Sequence Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseError#getSubdetailSequenceLinkId <em>Subdetail Sequence Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseError#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponseError()
 * @model extendedMetaData="name='ClaimResponse.Error' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponseError extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence number of the line item submitted which contains the error. This value is ommitted when the error is elsewhere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Link Id</em>' containment reference.
	 * @see #setSequenceLinkId(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseError_SequenceLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequenceLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseError#getSequenceLinkId <em>Sequence Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Link Id</em>' containment reference.
	 * @see #getSequenceLinkId()
	 * @generated
	 */
	void setSequenceLinkId(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Detail Sequence Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence number of the addition within the line item submitted which contains the error. This value is ommitted when the error is not related to an Addition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail Sequence Link Id</em>' containment reference.
	 * @see #setDetailSequenceLinkId(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseError_DetailSequenceLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailSequenceLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDetailSequenceLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseError#getDetailSequenceLinkId <em>Detail Sequence Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Sequence Link Id</em>' containment reference.
	 * @see #getDetailSequenceLinkId()
	 * @generated
	 */
	void setDetailSequenceLinkId(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Subdetail Sequence Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence number of the addition within the line item submitted which contains the error. This value is ommitted when the error is not related to an Addition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subdetail Sequence Link Id</em>' containment reference.
	 * @see #setSubdetailSequenceLinkId(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseError_SubdetailSequenceLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subdetailSequenceLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSubdetailSequenceLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseError#getSubdetailSequenceLinkId <em>Subdetail Sequence Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdetail Sequence Link Id</em>' containment reference.
	 * @see #getSubdetailSequenceLinkId()
	 * @generated
	 */
	void setSubdetailSequenceLinkId(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An error code,froma specified code system, which details why the claim could not be adjudicated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseError_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseError#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Coding value);

} // ClaimResponseError
