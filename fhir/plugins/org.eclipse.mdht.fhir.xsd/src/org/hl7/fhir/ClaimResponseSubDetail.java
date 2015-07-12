/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Sub Detail</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ClaimResponseSubDetail#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseSubDetail#getAdjudication <em>Adjudication</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponseSubDetail()
 * @model extendedMetaData="name='ClaimResponse.SubDetail' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponseSubDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service line number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Link Id</em>' containment reference.
	 * @see #setSequenceLinkId(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseSubDetail_SequenceLinkId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequenceLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequenceLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseSubDetail#getSequenceLinkId <em>Sequence Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Link Id</em>' containment reference.
	 * @see #getSequenceLinkId()
	 * @generated
	 */
	void setSequenceLinkId(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseAdjudication2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adjudications results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseSubDetail_Adjudication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseAdjudication2> getAdjudication();

} // ClaimResponseSubDetail
