/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receiver Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ReceiverResponsibilityImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ReceiverResponsibilityImpl#getInvokeInteraction <em>Invoke Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ReceiverResponsibilityImpl#getInvokeTriggerEvent <em>Invoke Trigger Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiverResponsibilityImpl extends EObjectImpl implements ReceiverResponsibility {
	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected ComplexMarkupWithLanguage reason;

	/**
	 * The cached value of the '{@link #getInvokeInteraction() <em>Invoke Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokeInteraction()
	 * @generated
	 * @ordered
	 */
	protected PackageRef invokeInteraction;

	/**
	 * The cached value of the '{@link #getInvokeTriggerEvent() <em>Invoke Trigger Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokeTriggerEvent()
	 * @generated
	 * @ordered
	 */
	protected PackageRef invokeTriggerEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiverResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.RECEIVER_RESPONSIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(ComplexMarkupWithLanguage newReason, NotificationChain msgs) {
		ComplexMarkupWithLanguage oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.RECEIVER_RESPONSIBILITY__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(ComplexMarkupWithLanguage newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.RECEIVER_RESPONSIBILITY__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.RECEIVER_RESPONSIBILITY__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.RECEIVER_RESPONSIBILITY__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getInvokeInteraction() {
		return invokeInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvokeInteraction(PackageRef newInvokeInteraction, NotificationChain msgs) {
		PackageRef oldInvokeInteraction = invokeInteraction;
		invokeInteraction = newInvokeInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_INTERACTION, oldInvokeInteraction, newInvokeInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokeInteraction(PackageRef newInvokeInteraction) {
		if (newInvokeInteraction != invokeInteraction) {
			NotificationChain msgs = null;
			if (invokeInteraction != null)
				msgs = ((InternalEObject)invokeInteraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_INTERACTION, null, msgs);
			if (newInvokeInteraction != null)
				msgs = ((InternalEObject)newInvokeInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_INTERACTION, null, msgs);
			msgs = basicSetInvokeInteraction(newInvokeInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_INTERACTION, newInvokeInteraction, newInvokeInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getInvokeTriggerEvent() {
		return invokeTriggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvokeTriggerEvent(PackageRef newInvokeTriggerEvent, NotificationChain msgs) {
		PackageRef oldInvokeTriggerEvent = invokeTriggerEvent;
		invokeTriggerEvent = newInvokeTriggerEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_TRIGGER_EVENT, oldInvokeTriggerEvent, newInvokeTriggerEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokeTriggerEvent(PackageRef newInvokeTriggerEvent) {
		if (newInvokeTriggerEvent != invokeTriggerEvent) {
			NotificationChain msgs = null;
			if (invokeTriggerEvent != null)
				msgs = ((InternalEObject)invokeTriggerEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_TRIGGER_EVENT, null, msgs);
			if (newInvokeTriggerEvent != null)
				msgs = ((InternalEObject)newInvokeTriggerEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_TRIGGER_EVENT, null, msgs);
			msgs = basicSetInvokeTriggerEvent(newInvokeTriggerEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_TRIGGER_EVENT, newInvokeTriggerEvent, newInvokeTriggerEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.RECEIVER_RESPONSIBILITY__REASON:
				return basicSetReason(null, msgs);
			case Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_INTERACTION:
				return basicSetInvokeInteraction(null, msgs);
			case Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_TRIGGER_EVENT:
				return basicSetInvokeTriggerEvent(null, msgs);
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
			case Mif2Package.RECEIVER_RESPONSIBILITY__REASON:
				return getReason();
			case Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_INTERACTION:
				return getInvokeInteraction();
			case Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_TRIGGER_EVENT:
				return getInvokeTriggerEvent();
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
			case Mif2Package.RECEIVER_RESPONSIBILITY__REASON:
				setReason((ComplexMarkupWithLanguage)newValue);
				return;
			case Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_INTERACTION:
				setInvokeInteraction((PackageRef)newValue);
				return;
			case Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_TRIGGER_EVENT:
				setInvokeTriggerEvent((PackageRef)newValue);
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
			case Mif2Package.RECEIVER_RESPONSIBILITY__REASON:
				setReason((ComplexMarkupWithLanguage)null);
				return;
			case Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_INTERACTION:
				setInvokeInteraction((PackageRef)null);
				return;
			case Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_TRIGGER_EVENT:
				setInvokeTriggerEvent((PackageRef)null);
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
			case Mif2Package.RECEIVER_RESPONSIBILITY__REASON:
				return reason != null;
			case Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_INTERACTION:
				return invokeInteraction != null;
			case Mif2Package.RECEIVER_RESPONSIBILITY__INVOKE_TRIGGER_EVENT:
				return invokeTriggerEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //ReceiverResponsibilityImpl
