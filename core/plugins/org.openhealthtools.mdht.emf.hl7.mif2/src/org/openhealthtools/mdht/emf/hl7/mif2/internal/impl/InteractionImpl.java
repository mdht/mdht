/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.Interaction;
import org.openhealthtools.mdht.emf.hl7.mif2.InteractionAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.InteractionKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionImpl#getInvokingTriggerEvent <em>Invoking Trigger Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionImpl#getArgumentMessage <em>Argument Message</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionImpl#getReceiverResponsibilities <em>Receiver Responsibilities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionImpl#getSendingApplication <em>Sending Application</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionImpl#getReceivingApplication <em>Receiving Application</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionImpl#getInteractionType <em>Interaction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends PackageArtifactImpl implements Interaction {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected InteractionAnnotations annotations;

	/**
	 * The cached value of the '{@link #getInvokingTriggerEvent() <em>Invoking Trigger Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokingTriggerEvent()
	 * @generated
	 * @ordered
	 */
	protected PackageRef invokingTriggerEvent;

	/**
	 * The cached value of the '{@link #getArgumentMessage() <em>Argument Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentMessage()
	 * @generated
	 * @ordered
	 */
	protected BoundStaticModel argumentMessage;

	/**
	 * The cached value of the '{@link #getReceiverResponsibilities() <em>Receiver Responsibilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverResponsibilities()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceiverResponsibility> receiverResponsibilities;

	/**
	 * The cached value of the '{@link #getSendingApplication() <em>Sending Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> sendingApplication;

	/**
	 * The cached value of the '{@link #getReceivingApplication() <em>Receiving Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> receivingApplication;

	/**
	 * The default value of the '{@link #getInteractionType() <em>Interaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionType()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionKind INTERACTION_TYPE_EDEFAULT = InteractionKind.QUERY;

	/**
	 * The cached value of the '{@link #getInteractionType() <em>Interaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionType()
	 * @generated
	 * @ordered
	 */
	protected InteractionKind interactionType = INTERACTION_TYPE_EDEFAULT;

	/**
	 * This is true if the Interaction Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interactionTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(InteractionAnnotations newAnnotations, NotificationChain msgs) {
		InteractionAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.INTERACTION__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(InteractionAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.INTERACTION__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.INTERACTION__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.INTERACTION__ANNOTATIONS, newAnnotations, newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getInvokingTriggerEvent() {
		return invokingTriggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvokingTriggerEvent(PackageRef newInvokingTriggerEvent, NotificationChain msgs) {
		PackageRef oldInvokingTriggerEvent = invokingTriggerEvent;
		invokingTriggerEvent = newInvokingTriggerEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.INTERACTION__INVOKING_TRIGGER_EVENT, oldInvokingTriggerEvent,
				newInvokingTriggerEvent);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokingTriggerEvent(PackageRef newInvokingTriggerEvent) {
		if (newInvokingTriggerEvent != invokingTriggerEvent) {
			NotificationChain msgs = null;
			if (invokingTriggerEvent != null) {
				msgs = ((InternalEObject) invokingTriggerEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.INTERACTION__INVOKING_TRIGGER_EVENT, null, msgs);
			}
			if (newInvokingTriggerEvent != null) {
				msgs = ((InternalEObject) newInvokingTriggerEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.INTERACTION__INVOKING_TRIGGER_EVENT, null, msgs);
			}
			msgs = basicSetInvokingTriggerEvent(newInvokingTriggerEvent, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.INTERACTION__INVOKING_TRIGGER_EVENT, newInvokingTriggerEvent,
				newInvokingTriggerEvent));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundStaticModel getArgumentMessage() {
		return argumentMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentMessage(BoundStaticModel newArgumentMessage, NotificationChain msgs) {
		BoundStaticModel oldArgumentMessage = argumentMessage;
		argumentMessage = newArgumentMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.INTERACTION__ARGUMENT_MESSAGE, oldArgumentMessage,
				newArgumentMessage);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentMessage(BoundStaticModel newArgumentMessage) {
		if (newArgumentMessage != argumentMessage) {
			NotificationChain msgs = null;
			if (argumentMessage != null) {
				msgs = ((InternalEObject) argumentMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.INTERACTION__ARGUMENT_MESSAGE, null, msgs);
			}
			if (newArgumentMessage != null) {
				msgs = ((InternalEObject) newArgumentMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.INTERACTION__ARGUMENT_MESSAGE, null, msgs);
			}
			msgs = basicSetArgumentMessage(newArgumentMessage, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.INTERACTION__ARGUMENT_MESSAGE, newArgumentMessage,
				newArgumentMessage));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReceiverResponsibility> getReceiverResponsibilities() {
		if (receiverResponsibilities == null) {
			receiverResponsibilities = new EObjectContainmentEList<ReceiverResponsibility>(
				ReceiverResponsibility.class, this, Mif2Package.INTERACTION__RECEIVER_RESPONSIBILITIES);
		}
		return receiverResponsibilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getSendingApplication() {
		if (sendingApplication == null) {
			sendingApplication = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.INTERACTION__SENDING_APPLICATION);
		}
		return sendingApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getReceivingApplication() {
		if (receivingApplication == null) {
			receivingApplication = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.INTERACTION__RECEIVING_APPLICATION);
		}
		return receivingApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionKind getInteractionType() {
		return interactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionType(InteractionKind newInteractionType) {
		InteractionKind oldInteractionType = interactionType;
		interactionType = newInteractionType == null
				? INTERACTION_TYPE_EDEFAULT
				: newInteractionType;
		boolean oldInteractionTypeESet = interactionTypeESet;
		interactionTypeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.INTERACTION__INTERACTION_TYPE, oldInteractionType, interactionType,
				!oldInteractionTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInteractionType() {
		InteractionKind oldInteractionType = interactionType;
		boolean oldInteractionTypeESet = interactionTypeESet;
		interactionType = INTERACTION_TYPE_EDEFAULT;
		interactionTypeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.INTERACTION__INTERACTION_TYPE, oldInteractionType,
				INTERACTION_TYPE_EDEFAULT, oldInteractionTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInteractionType() {
		return interactionTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.INTERACTION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.INTERACTION__INVOKING_TRIGGER_EVENT:
				return basicSetInvokingTriggerEvent(null, msgs);
			case Mif2Package.INTERACTION__ARGUMENT_MESSAGE:
				return basicSetArgumentMessage(null, msgs);
			case Mif2Package.INTERACTION__RECEIVER_RESPONSIBILITIES:
				return ((InternalEList<?>) getReceiverResponsibilities()).basicRemove(otherEnd, msgs);
			case Mif2Package.INTERACTION__SENDING_APPLICATION:
				return ((InternalEList<?>) getSendingApplication()).basicRemove(otherEnd, msgs);
			case Mif2Package.INTERACTION__RECEIVING_APPLICATION:
				return ((InternalEList<?>) getReceivingApplication()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.INTERACTION__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.INTERACTION__INVOKING_TRIGGER_EVENT:
				return getInvokingTriggerEvent();
			case Mif2Package.INTERACTION__ARGUMENT_MESSAGE:
				return getArgumentMessage();
			case Mif2Package.INTERACTION__RECEIVER_RESPONSIBILITIES:
				return getReceiverResponsibilities();
			case Mif2Package.INTERACTION__SENDING_APPLICATION:
				return getSendingApplication();
			case Mif2Package.INTERACTION__RECEIVING_APPLICATION:
				return getReceivingApplication();
			case Mif2Package.INTERACTION__INTERACTION_TYPE:
				return getInteractionType();
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
			case Mif2Package.INTERACTION__ANNOTATIONS:
				setAnnotations((InteractionAnnotations) newValue);
				return;
			case Mif2Package.INTERACTION__INVOKING_TRIGGER_EVENT:
				setInvokingTriggerEvent((PackageRef) newValue);
				return;
			case Mif2Package.INTERACTION__ARGUMENT_MESSAGE:
				setArgumentMessage((BoundStaticModel) newValue);
				return;
			case Mif2Package.INTERACTION__RECEIVER_RESPONSIBILITIES:
				getReceiverResponsibilities().clear();
				getReceiverResponsibilities().addAll((Collection<? extends ReceiverResponsibility>) newValue);
				return;
			case Mif2Package.INTERACTION__SENDING_APPLICATION:
				getSendingApplication().clear();
				getSendingApplication().addAll((Collection<? extends PackageRef>) newValue);
				return;
			case Mif2Package.INTERACTION__RECEIVING_APPLICATION:
				getReceivingApplication().clear();
				getReceivingApplication().addAll((Collection<? extends PackageRef>) newValue);
				return;
			case Mif2Package.INTERACTION__INTERACTION_TYPE:
				setInteractionType((InteractionKind) newValue);
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
			case Mif2Package.INTERACTION__ANNOTATIONS:
				setAnnotations((InteractionAnnotations) null);
				return;
			case Mif2Package.INTERACTION__INVOKING_TRIGGER_EVENT:
				setInvokingTriggerEvent((PackageRef) null);
				return;
			case Mif2Package.INTERACTION__ARGUMENT_MESSAGE:
				setArgumentMessage((BoundStaticModel) null);
				return;
			case Mif2Package.INTERACTION__RECEIVER_RESPONSIBILITIES:
				getReceiverResponsibilities().clear();
				return;
			case Mif2Package.INTERACTION__SENDING_APPLICATION:
				getSendingApplication().clear();
				return;
			case Mif2Package.INTERACTION__RECEIVING_APPLICATION:
				getReceivingApplication().clear();
				return;
			case Mif2Package.INTERACTION__INTERACTION_TYPE:
				unsetInteractionType();
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
			case Mif2Package.INTERACTION__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.INTERACTION__INVOKING_TRIGGER_EVENT:
				return invokingTriggerEvent != null;
			case Mif2Package.INTERACTION__ARGUMENT_MESSAGE:
				return argumentMessage != null;
			case Mif2Package.INTERACTION__RECEIVER_RESPONSIBILITIES:
				return receiverResponsibilities != null && !receiverResponsibilities.isEmpty();
			case Mif2Package.INTERACTION__SENDING_APPLICATION:
				return sendingApplication != null && !sendingApplication.isEmpty();
			case Mif2Package.INTERACTION__RECEIVING_APPLICATION:
				return receivingApplication != null && !receivingApplication.isEmpty();
			case Mif2Package.INTERACTION__INTERACTION_TYPE:
				return isSetInteractionType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (interactionType: ");
		if (interactionTypeESet) {
			result.append(interactionType);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // InteractionImpl
