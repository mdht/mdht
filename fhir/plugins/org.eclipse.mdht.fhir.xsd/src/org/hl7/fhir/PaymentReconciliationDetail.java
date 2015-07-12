/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Reconciliation Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides payment details and claim references supporting a bulk payment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getResponce <em>Responce</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitter <em>Submitter</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail()
 * @model extendedMetaData="name='PaymentReconciliation.Detail' kind='elementOnly'"
 * @generated
 */
public interface PaymentReconciliationDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code to indicate the nature of the payment, adjustment, funds advance, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The claim or financial resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Responce</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The claim response resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responce</em>' containment reference.
	 * @see #setResponce(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Responce()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responce' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponce();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getResponce <em>Responce</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responce</em>' containment reference.
	 * @see #getResponce()
	 * @generated
	 */
	void setResponce(Reference value);

	/**
	 * Returns the value of the '<em><b>Submitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Organization which submitted the invoice or financial transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submitter</em>' containment reference.
	 * @see #setSubmitter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Submitter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submitter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubmitter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitter <em>Submitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter</em>' containment reference.
	 * @see #getSubmitter()
	 * @generated
	 */
	void setSubmitter(Reference value);

	/**
	 * Returns the value of the '<em><b>Payee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is receiving the payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee</em>' containment reference.
	 * @see #setPayee(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Payee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payee' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPayee();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of the invoice or financial resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount paid for this detail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

} // PaymentReconciliationDetail
