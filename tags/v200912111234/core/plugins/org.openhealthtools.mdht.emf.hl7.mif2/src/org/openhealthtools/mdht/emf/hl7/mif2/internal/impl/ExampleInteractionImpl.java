/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ExampleInteractionImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ExampleInteractionImpl#getReceivingSystem <em>Receiving System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ExampleInteractionImpl#getSendingSystem <em>Sending System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ExampleInteractionImpl#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExampleInteractionImpl extends EObjectImpl implements ExampleInteraction {
	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected PackageRef interaction;

	/**
	 * The default value of the '{@link #getReceivingSystem() <em>Receiving System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivingSystem() <em>Receiving System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingSystem()
	 * @generated
	 * @ordered
	 */
	protected String receivingSystem = RECEIVING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendingSystem() <em>Sending System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SENDING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendingSystem() <em>Sending System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingSystem()
	 * @generated
	 * @ordered
	 */
	protected String sendingSystem = SENDING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sequence = SEQUENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.EXAMPLE_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(PackageRef newInteraction, NotificationChain msgs) {
		PackageRef oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.EXAMPLE_INTERACTION__INTERACTION, oldInteraction, newInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(PackageRef newInteraction) {
		if (newInteraction != interaction) {
			NotificationChain msgs = null;
			if (interaction != null)
				msgs = ((InternalEObject)interaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.EXAMPLE_INTERACTION__INTERACTION, null, msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject)newInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.EXAMPLE_INTERACTION__INTERACTION, null, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.EXAMPLE_INTERACTION__INTERACTION, newInteraction, newInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceivingSystem() {
		return receivingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingSystem(String newReceivingSystem) {
		String oldReceivingSystem = receivingSystem;
		receivingSystem = newReceivingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.EXAMPLE_INTERACTION__RECEIVING_SYSTEM, oldReceivingSystem, receivingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendingSystem() {
		return sendingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendingSystem(String newSendingSystem) {
		String oldSendingSystem = sendingSystem;
		sendingSystem = newSendingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.EXAMPLE_INTERACTION__SENDING_SYSTEM, oldSendingSystem, sendingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(BigInteger newSequence) {
		BigInteger oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.EXAMPLE_INTERACTION__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.EXAMPLE_INTERACTION__INTERACTION:
				return basicSetInteraction(null, msgs);
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
			case Mif2Package.EXAMPLE_INTERACTION__INTERACTION:
				return getInteraction();
			case Mif2Package.EXAMPLE_INTERACTION__RECEIVING_SYSTEM:
				return getReceivingSystem();
			case Mif2Package.EXAMPLE_INTERACTION__SENDING_SYSTEM:
				return getSendingSystem();
			case Mif2Package.EXAMPLE_INTERACTION__SEQUENCE:
				return getSequence();
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
			case Mif2Package.EXAMPLE_INTERACTION__INTERACTION:
				setInteraction((PackageRef)newValue);
				return;
			case Mif2Package.EXAMPLE_INTERACTION__RECEIVING_SYSTEM:
				setReceivingSystem((String)newValue);
				return;
			case Mif2Package.EXAMPLE_INTERACTION__SENDING_SYSTEM:
				setSendingSystem((String)newValue);
				return;
			case Mif2Package.EXAMPLE_INTERACTION__SEQUENCE:
				setSequence((BigInteger)newValue);
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
			case Mif2Package.EXAMPLE_INTERACTION__INTERACTION:
				setInteraction((PackageRef)null);
				return;
			case Mif2Package.EXAMPLE_INTERACTION__RECEIVING_SYSTEM:
				setReceivingSystem(RECEIVING_SYSTEM_EDEFAULT);
				return;
			case Mif2Package.EXAMPLE_INTERACTION__SENDING_SYSTEM:
				setSendingSystem(SENDING_SYSTEM_EDEFAULT);
				return;
			case Mif2Package.EXAMPLE_INTERACTION__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
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
			case Mif2Package.EXAMPLE_INTERACTION__INTERACTION:
				return interaction != null;
			case Mif2Package.EXAMPLE_INTERACTION__RECEIVING_SYSTEM:
				return RECEIVING_SYSTEM_EDEFAULT == null ? receivingSystem != null : !RECEIVING_SYSTEM_EDEFAULT.equals(receivingSystem);
			case Mif2Package.EXAMPLE_INTERACTION__SENDING_SYSTEM:
				return SENDING_SYSTEM_EDEFAULT == null ? sendingSystem != null : !SENDING_SYSTEM_EDEFAULT.equals(sendingSystem);
			case Mif2Package.EXAMPLE_INTERACTION__SEQUENCE:
				return SEQUENCE_EDEFAULT == null ? sequence != null : !SEQUENCE_EDEFAULT.equals(sequence);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (receivingSystem: ");
		result.append(receivingSystem);
		result.append(", sendingSystem: ");
		result.append(sendingSystem);
		result.append(", sequence: ");
		result.append(sequence);
		result.append(')');
		return result.toString();
	}

} //ExampleInteractionImpl
