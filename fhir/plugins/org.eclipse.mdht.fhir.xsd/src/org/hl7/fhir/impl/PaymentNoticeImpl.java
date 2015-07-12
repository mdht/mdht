/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Notice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getPaymentStatus <em>Payment Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentNoticeImpl extends DomainResourceImpl implements PaymentNotice {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding ruleset;

	/**
	 * The cached value of the '{@link #getOriginalRuleset() <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding originalRuleset;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Reference target;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference organization;

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
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Reference response;

	/**
	 * The cached value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected Coding paymentStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentNoticeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPaymentNotice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PAYMENT_NOTICE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleset(Coding newRuleset, NotificationChain msgs) {
		Coding oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__RULESET, oldRuleset, newRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Coding newRuleset) {
		if (newRuleset != ruleset) {
			NotificationChain msgs = null;
			if (ruleset != null)
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__RULESET, newRuleset, newRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getOriginalRuleset() {
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalRuleset(Coding newOriginalRuleset, NotificationChain msgs) {
		Coding oldOriginalRuleset = originalRuleset;
		originalRuleset = newOriginalRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET, oldOriginalRuleset, newOriginalRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalRuleset(Coding newOriginalRuleset) {
		if (newOriginalRuleset != originalRuleset) {
			NotificationChain msgs = null;
			if (originalRuleset != null)
				msgs = ((InternalEObject)originalRuleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET, null, msgs);
			if (newOriginalRuleset != null)
				msgs = ((InternalEObject)newOriginalRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET, null, msgs);
			msgs = basicSetOriginalRuleset(newOriginalRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET, newOriginalRuleset, newOriginalRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Reference newTarget, NotificationChain msgs) {
		Reference oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Reference newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__PROVIDER, oldProvider, newProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Reference newOrganization, NotificationChain msgs) {
		Reference oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Reference newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__ORGANIZATION, newOrganization, newOrganization));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__REQUEST, oldRequest, newRequest);
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
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(Reference newResponse, NotificationChain msgs) {
		Reference oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__RESPONSE, oldResponse, newResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Reference newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentStatus(Coding newPaymentStatus, NotificationChain msgs) {
		Coding oldPaymentStatus = paymentStatus;
		paymentStatus = newPaymentStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS, oldPaymentStatus, newPaymentStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentStatus(Coding newPaymentStatus) {
		if (newPaymentStatus != paymentStatus) {
			NotificationChain msgs = null;
			if (paymentStatus != null)
				msgs = ((InternalEObject)paymentStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS, null, msgs);
			if (newPaymentStatus != null)
				msgs = ((InternalEObject)newPaymentStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS, null, msgs);
			msgs = basicSetPaymentStatus(newPaymentStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS, newPaymentStatus, newPaymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PAYMENT_NOTICE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PAYMENT_NOTICE__RULESET:
				return basicSetRuleset(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				return basicSetOriginalRuleset(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__TARGET:
				return basicSetTarget(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__PROVIDER:
				return basicSetProvider(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__RESPONSE:
				return basicSetResponse(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				return basicSetPaymentStatus(null, msgs);
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
			case FhirPackage.PAYMENT_NOTICE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PAYMENT_NOTICE__RULESET:
				return getRuleset();
			case FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				return getOriginalRuleset();
			case FhirPackage.PAYMENT_NOTICE__CREATED:
				return getCreated();
			case FhirPackage.PAYMENT_NOTICE__TARGET:
				return getTarget();
			case FhirPackage.PAYMENT_NOTICE__PROVIDER:
				return getProvider();
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION:
				return getOrganization();
			case FhirPackage.PAYMENT_NOTICE__REQUEST:
				return getRequest();
			case FhirPackage.PAYMENT_NOTICE__RESPONSE:
				return getResponse();
			case FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				return getPaymentStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.PAYMENT_NOTICE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__TARGET:
				setTarget((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__RESPONSE:
				setResponse((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				setPaymentStatus((Coding)newValue);
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
			case FhirPackage.PAYMENT_NOTICE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PAYMENT_NOTICE__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__TARGET:
				setTarget((Reference)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__PROVIDER:
				setProvider((Reference)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__RESPONSE:
				setResponse((Reference)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				setPaymentStatus((Coding)null);
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
			case FhirPackage.PAYMENT_NOTICE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PAYMENT_NOTICE__RULESET:
				return ruleset != null;
			case FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirPackage.PAYMENT_NOTICE__CREATED:
				return created != null;
			case FhirPackage.PAYMENT_NOTICE__TARGET:
				return target != null;
			case FhirPackage.PAYMENT_NOTICE__PROVIDER:
				return provider != null;
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION:
				return organization != null;
			case FhirPackage.PAYMENT_NOTICE__REQUEST:
				return request != null;
			case FhirPackage.PAYMENT_NOTICE__RESPONSE:
				return response != null;
			case FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				return paymentStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //PaymentNoticeImpl
