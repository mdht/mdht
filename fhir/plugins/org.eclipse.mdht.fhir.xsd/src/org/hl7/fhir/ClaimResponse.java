/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the adjudication details from the processing of a Claim resource.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPayeeType <em>Payee Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getError <em>Error</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPaymentAdjustment <em>Payment Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPaymentAdjustmentReason <em>Payment Adjustment Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPaymentRef <em>Payment Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponse()
 * @model extendedMetaData="name='ClaimResponse' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Response Business Identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original request resource referrence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRuleset <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' containment reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Original Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style (standard) and version of the original material which was converted into this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #getOriginalRuleset()
	 * @generated
	 */
	void setOriginalRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the enclosed suite of services were performed or completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Insurer who produced this adjudicated response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Request Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Provider</em>' containment reference.
	 * @see #setRequestProvider(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_RequestProvider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestProvider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestProvider();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRequestProvider <em>Request Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Provider</em>' containment reference.
	 * @see #getRequestProvider()
	 * @generated
	 */
	void setRequestProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Request Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the services rendered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Organization</em>' containment reference.
	 * @see #setRequestOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_RequestOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRequestOrganization <em>Request Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Organization</em>' containment reference.
	 * @see #getRequestOrganization()
	 * @generated
	 */
	void setRequestOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transaction status: error, complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(Code)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Code value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the status of the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Disposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disposition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Payee Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Party to be reimbursed: Subscriber, provider, other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee Type</em>' containment reference.
	 * @see #setPayeeType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_PayeeType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payeeType' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPayeeType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPayeeType <em>Payee Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Type</em>' containment reference.
	 * @see #getPayeeType()
	 * @generated
	 */
	void setPayeeType(Coding value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first tier service adjudications for submitted services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseItem> getItem();

	/**
	 * Returns the value of the '<em><b>Add Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseAddItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first tier service adjudications for payor added services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_AddItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseAddItem> getAddItem();

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseError}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mutually exclusive with Services Provided (Item).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Error()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseError> getError();

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total cost of the services reported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Cost</em>' containment reference.
	 * @see #setTotalCost(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_TotalCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalCost' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotalCost();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getTotalCost <em>Total Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cost</em>' containment reference.
	 * @see #getTotalCost()
	 * @generated
	 */
	void setTotalCost(Money value);

	/**
	 * Returns the value of the '<em><b>Unalloc Deductable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of deductable applied which was not allocated to any particular service line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unalloc Deductable</em>' containment reference.
	 * @see #setUnallocDeductable(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_UnallocDeductable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unallocDeductable' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnallocDeductable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getUnallocDeductable <em>Unalloc Deductable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unalloc Deductable</em>' containment reference.
	 * @see #getUnallocDeductable()
	 * @generated
	 */
	void setUnallocDeductable(Money value);

	/**
	 * Returns the value of the '<em><b>Total Benefit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Benefit</em>' containment reference.
	 * @see #setTotalBenefit(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_TotalBenefit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalBenefit' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotalBenefit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getTotalBenefit <em>Total Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Benefit</em>' containment reference.
	 * @see #getTotalBenefit()
	 * @generated
	 */
	void setTotalBenefit(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Adjustment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adjustment to the payment of this transaction which is not related to adjudication of this transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Adjustment</em>' containment reference.
	 * @see #setPaymentAdjustment(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_PaymentAdjustment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentAdjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getPaymentAdjustment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPaymentAdjustment <em>Payment Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Adjustment</em>' containment reference.
	 * @see #getPaymentAdjustment()
	 * @generated
	 */
	void setPaymentAdjustment(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Adjustment Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason for the payment adjustment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Adjustment Reason</em>' containment reference.
	 * @see #setPaymentAdjustmentReason(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_PaymentAdjustmentReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentAdjustmentReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPaymentAdjustmentReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPaymentAdjustmentReason <em>Payment Adjustment Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Adjustment Reason</em>' containment reference.
	 * @see #getPaymentAdjustmentReason()
	 * @generated
	 */
	void setPaymentAdjustmentReason(Coding value);

	/**
	 * Returns the value of the '<em><b>Payment Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated payment data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Date</em>' containment reference.
	 * @see #setPaymentDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_PaymentDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getPaymentDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPaymentDate <em>Payment Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' containment reference.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payable less any payment adjustment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Amount</em>' containment reference.
	 * @see #setPaymentAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_PaymentAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getPaymentAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPaymentAmount <em>Payment Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Amount</em>' containment reference.
	 * @see #getPaymentAmount()
	 * @generated
	 */
	void setPaymentAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payment identifer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Ref</em>' containment reference.
	 * @see #setPaymentRef(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_PaymentRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentRef' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPaymentRef();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPaymentRef <em>Payment Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Ref</em>' containment reference.
	 * @see #getPaymentRef()
	 * @generated
	 */
	void setPaymentRef(Identifier value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of funds reservation (For provider, for Patient, None).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' containment reference.
	 * @see #setReserved(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Reserved()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reserved' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getReserved();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getReserved <em>Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' containment reference.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(Coding value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The form to be used for printing the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Coding value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseNote> getNote();

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseCoverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instrument by which payment information for health care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseCoverage> getCoverage();

} // ClaimResponse
