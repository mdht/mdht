/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Add Item</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ClaimResponseAddItem#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseAddItem#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseAddItem#getFee <em>Fee</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseAddItem#getNoteNumberLinkId <em>Note Number Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseAddItem#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseAddItem#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponseAddItem()
 * @model extendedMetaData="name='ClaimResponse.AddItem' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponseAddItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of input service items which this service line is intended to replace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseAddItem_SequenceLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getSequenceLinkId();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code to indicate the Professional Service or Product supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseAddItem_Service()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseAddItem#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Coding value);

	/**
	 * Returns the value of the '<em><b>Fee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fee charged for the professional service or product..
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fee</em>' containment reference.
	 * @see #setFee(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseAddItem_Fee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fee' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getFee();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseAddItem#getFee <em>Fee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fee</em>' containment reference.
	 * @see #getFee()
	 * @generated
	 */
	void setFee(Money value);

	/**
	 * Returns the value of the '<em><b>Note Number Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of note references to the notes provided below.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note Number Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseAddItem_NoteNumberLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noteNumberLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumberLinkId();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseAdjudication3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adjudications results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseAddItem_Adjudication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseAdjudication3> getAdjudication();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseDetail1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The second tier service adjudications for payor added services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseAddItem_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseDetail1> getDetail();

} // ClaimResponseAddItem
