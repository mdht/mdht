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
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionChannel;
import org.hl7.fhir.SubscriptionStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionImpl extends DomainResourceImpl implements Subscription {
	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String criteria;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contact;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String reason;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionStatus status;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String error;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionChannel channel;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> tag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubscription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriteria(org.hl7.fhir.String newCriteria, NotificationChain msgs) {
		org.hl7.fhir.String oldCriteria = criteria;
		criteria = newCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__CRITERIA, oldCriteria, newCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(org.hl7.fhir.String newCriteria) {
		if (newCriteria != criteria) {
			NotificationChain msgs = null;
			if (criteria != null)
				msgs = ((InternalEObject)criteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__CRITERIA, null, msgs);
			if (newCriteria != null)
				msgs = ((InternalEObject)newCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__CRITERIA, null, msgs);
			msgs = basicSetCriteria(newCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__CRITERIA, newCriteria, newCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.SUBSCRIPTION__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(org.hl7.fhir.String newReason, NotificationChain msgs) {
		org.hl7.fhir.String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(org.hl7.fhir.String newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(SubscriptionStatus newStatus, NotificationChain msgs) {
		SubscriptionStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(SubscriptionStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetError(org.hl7.fhir.String newError, NotificationChain msgs) {
		org.hl7.fhir.String oldError = error;
		error = newError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__ERROR, oldError, newError);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(org.hl7.fhir.String newError) {
		if (newError != error) {
			NotificationChain msgs = null;
			if (error != null)
				msgs = ((InternalEObject)error).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__ERROR, null, msgs);
			if (newError != null)
				msgs = ((InternalEObject)newError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__ERROR, null, msgs);
			msgs = basicSetError(newError, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__ERROR, newError, newError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannel getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannel(SubscriptionChannel newChannel, NotificationChain msgs) {
		SubscriptionChannel oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__CHANNEL, oldChannel, newChannel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(SubscriptionChannel newChannel) {
		if (newChannel != channel) {
			NotificationChain msgs = null;
			if (channel != null)
				msgs = ((InternalEObject)channel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__CHANNEL, null, msgs);
			if (newChannel != null)
				msgs = ((InternalEObject)newChannel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__CHANNEL, null, msgs);
			msgs = basicSetChannel(newChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__CHANNEL, newChannel, newChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Instant newEnd, NotificationChain msgs) {
		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Instant newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getTag() {
		if (tag == null) {
			tag = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.SUBSCRIPTION__TAG);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION__CRITERIA:
				return basicSetCriteria(null, msgs);
			case FhirPackage.SUBSCRIPTION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSCRIPTION__REASON:
				return basicSetReason(null, msgs);
			case FhirPackage.SUBSCRIPTION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SUBSCRIPTION__ERROR:
				return basicSetError(null, msgs);
			case FhirPackage.SUBSCRIPTION__CHANNEL:
				return basicSetChannel(null, msgs);
			case FhirPackage.SUBSCRIPTION__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.SUBSCRIPTION__TAG:
				return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSCRIPTION__CRITERIA:
				return getCriteria();
			case FhirPackage.SUBSCRIPTION__CONTACT:
				return getContact();
			case FhirPackage.SUBSCRIPTION__REASON:
				return getReason();
			case FhirPackage.SUBSCRIPTION__STATUS:
				return getStatus();
			case FhirPackage.SUBSCRIPTION__ERROR:
				return getError();
			case FhirPackage.SUBSCRIPTION__CHANNEL:
				return getChannel();
			case FhirPackage.SUBSCRIPTION__END:
				return getEnd();
			case FhirPackage.SUBSCRIPTION__TAG:
				return getTag();
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
			case FhirPackage.SUBSCRIPTION__CRITERIA:
				setCriteria((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__REASON:
				setReason((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__STATUS:
				setStatus((SubscriptionStatus)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__ERROR:
				setError((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__CHANNEL:
				setChannel((SubscriptionChannel)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__END:
				setEnd((Instant)newValue);
				return;
			case FhirPackage.SUBSCRIPTION__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends Coding>)newValue);
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
			case FhirPackage.SUBSCRIPTION__CRITERIA:
				setCriteria((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.SUBSCRIPTION__REASON:
				setReason((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION__STATUS:
				setStatus((SubscriptionStatus)null);
				return;
			case FhirPackage.SUBSCRIPTION__ERROR:
				setError((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION__CHANNEL:
				setChannel((SubscriptionChannel)null);
				return;
			case FhirPackage.SUBSCRIPTION__END:
				setEnd((Instant)null);
				return;
			case FhirPackage.SUBSCRIPTION__TAG:
				getTag().clear();
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
			case FhirPackage.SUBSCRIPTION__CRITERIA:
				return criteria != null;
			case FhirPackage.SUBSCRIPTION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.SUBSCRIPTION__REASON:
				return reason != null;
			case FhirPackage.SUBSCRIPTION__STATUS:
				return status != null;
			case FhirPackage.SUBSCRIPTION__ERROR:
				return error != null;
			case FhirPackage.SUBSCRIPTION__CHANNEL:
				return channel != null;
			case FhirPackage.SUBSCRIPTION__END:
				return end != null;
			case FhirPackage.SUBSCRIPTION__TAG:
				return tag != null && !tag.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionImpl
