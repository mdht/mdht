/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Reconciliation Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getResponce <em>Responce</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getSubmitter <em>Submitter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentReconciliationDetailImpl extends BackboneElementImpl implements PaymentReconciliationDetail {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

	/**
	 * The cached value of the '{@link #getResponce() <em>Responce</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponce()
	 * @generated
	 * @ordered
	 */
	protected Reference responce;

	/**
	 * The cached value of the '{@link #getSubmitter() <em>Submitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitter()
	 * @generated
	 * @ordered
	 */
	protected Reference submitter;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected Reference payee;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Money amount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentReconciliationDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPaymentReconciliationDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Reference newRequest, NotificationChain msgs) {
		Reference oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResponce() {
		return responce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponce(Reference newResponce, NotificationChain msgs) {
		Reference oldResponce = responce;
		responce = newResponce;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONCE, oldResponce, newResponce);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponce(Reference newResponce) {
		if (newResponce != responce) {
			NotificationChain msgs = null;
			if (responce != null)
				msgs = ((InternalEObject)responce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONCE, null, msgs);
			if (newResponce != null)
				msgs = ((InternalEObject)newResponce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONCE, null, msgs);
			msgs = basicSetResponce(newResponce, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONCE, newResponce, newResponce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubmitter() {
		return submitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmitter(Reference newSubmitter, NotificationChain msgs) {
		Reference oldSubmitter = submitter;
		submitter = newSubmitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER, oldSubmitter, newSubmitter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmitter(Reference newSubmitter) {
		if (newSubmitter != submitter) {
			NotificationChain msgs = null;
			if (submitter != null)
				msgs = ((InternalEObject)submitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER, null, msgs);
			if (newSubmitter != null)
				msgs = ((InternalEObject)newSubmitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER, null, msgs);
			msgs = basicSetSubmitter(newSubmitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER, newSubmitter, newSubmitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(Reference newPayee, NotificationChain msgs) {
		Reference oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE, oldPayee, newPayee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayee(Reference newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(Money newAmount, NotificationChain msgs) {
		Money oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT, oldAmount, newAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(Money newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONCE:
				return basicSetResponce(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER:
				return basicSetSubmitter(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE:
				return basicSetPayee(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT:
				return basicSetAmount(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE:
				return getType();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST:
				return getRequest();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONCE:
				return getResponce();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER:
				return getSubmitter();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE:
				return getPayee();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE:
				return getDate();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT:
				return getAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONCE:
				setResponce((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER:
				setSubmitter((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE:
				setPayee((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE:
				setDate((Date)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT:
				setAmount((Money)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONCE:
				setResponce((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER:
				setSubmitter((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE:
				setPayee((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE:
				setDate((Date)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT:
				setAmount((Money)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE:
				return type != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST:
				return request != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONCE:
				return responce != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER:
				return submitter != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE:
				return payee != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE:
				return date != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //PaymentReconciliationDetailImpl
