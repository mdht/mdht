/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Item</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ClaimResponseItem#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseItem#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseItem#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseItem#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponseItem()
 * @model extendedMetaData="name='ClaimResponse.Item' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponseItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service line number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Link Id</em>' containment reference.
	 * @see #setSequenceLinkId(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseItem_SequenceLinkId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequenceLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequenceLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseItem#getSequenceLinkId <em>Sequence Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Link Id</em>' containment reference.
	 * @see #getSequenceLinkId()
	 * @generated
	 */
	void setSequenceLinkId(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of note references to the notes provided below.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseItem_NoteNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noteNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumber();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseAdjudication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adjudications results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseItem_Adjudication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseAdjudication> getAdjudication();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The second tier service adjudications for submitted services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseItem_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseDetail> getDetail();

} // ClaimResponseItem
