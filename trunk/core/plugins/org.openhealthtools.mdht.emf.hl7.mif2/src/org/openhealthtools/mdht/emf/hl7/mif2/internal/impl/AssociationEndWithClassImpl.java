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

import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClass;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End With Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndWithClassImpl#getParticipantClass <em>Participant Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationEndWithClassImpl extends AssociationEndBaseImpl implements AssociationEndWithClass {
	/**
	 * The cached value of the '{@link #getParticipantClass() <em>Participant Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantClass()
	 * @generated
	 * @ordered
	 */
	protected ClassOrReference participantClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndWithClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ASSOCIATION_END_WITH_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOrReference getParticipantClass() {
		return participantClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantClass(ClassOrReference newParticipantClass, NotificationChain msgs) {
		ClassOrReference oldParticipantClass = participantClass;
		participantClass = newParticipantClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_WITH_CLASS__PARTICIPANT_CLASS, oldParticipantClass, newParticipantClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantClass(ClassOrReference newParticipantClass) {
		if (newParticipantClass != participantClass) {
			NotificationChain msgs = null;
			if (participantClass != null)
				msgs = ((InternalEObject)participantClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ASSOCIATION_END_WITH_CLASS__PARTICIPANT_CLASS, null, msgs);
			if (newParticipantClass != null)
				msgs = ((InternalEObject)newParticipantClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ASSOCIATION_END_WITH_CLASS__PARTICIPANT_CLASS, null, msgs);
			msgs = basicSetParticipantClass(newParticipantClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_WITH_CLASS__PARTICIPANT_CLASS, newParticipantClass, newParticipantClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ASSOCIATION_END_WITH_CLASS__PARTICIPANT_CLASS:
				return basicSetParticipantClass(null, msgs);
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
			case Mif2Package.ASSOCIATION_END_WITH_CLASS__PARTICIPANT_CLASS:
				return getParticipantClass();
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
			case Mif2Package.ASSOCIATION_END_WITH_CLASS__PARTICIPANT_CLASS:
				setParticipantClass((ClassOrReference)newValue);
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
			case Mif2Package.ASSOCIATION_END_WITH_CLASS__PARTICIPANT_CLASS:
				setParticipantClass((ClassOrReference)null);
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
			case Mif2Package.ASSOCIATION_END_WITH_CLASS__PARTICIPANT_CLASS:
				return participantClass != null;
		}
		return super.eIsSet(featureID);
	}

} //AssociationEndWithClassImpl
