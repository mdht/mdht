/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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

import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.NonTraversableAssociationEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Traversable Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.NonTraversableAssociationEndImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.NonTraversableAssociationEndImpl#getParticipantClassName <em>Participant Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonTraversableAssociationEndImpl extends RelationshipImpl implements NonTraversableAssociationEnd {
	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationEndDerivation> derivedFrom;

	/**
	 * The default value of the '{@link #getParticipantClassName() <em>Participant Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTICIPANT_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParticipantClassName() <em>Participant Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantClassName()
	 * @generated
	 * @ordered
	 */
	protected String participantClassName = PARTICIPANT_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonTraversableAssociationEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.NON_TRAVERSABLE_ASSOCIATION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationEndDerivation> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<AssociationEndDerivation>(AssociationEndDerivation.class, this, Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParticipantClassName() {
		return participantClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantClassName(String newParticipantClassName) {
		String oldParticipantClassName = participantClassName;
		participantClassName = newParticipantClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END__PARTICIPANT_CLASS_NAME, oldParticipantClassName, participantClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END__DERIVED_FROM:
				return getDerivedFrom();
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END__PARTICIPANT_CLASS_NAME:
				return getParticipantClassName();
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
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends AssociationEndDerivation>)newValue);
				return;
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END__PARTICIPANT_CLASS_NAME:
				setParticipantClassName((String)newValue);
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
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END__PARTICIPANT_CLASS_NAME:
				setParticipantClassName(PARTICIPANT_CLASS_NAME_EDEFAULT);
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
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END__PARTICIPANT_CLASS_NAME:
				return PARTICIPANT_CLASS_NAME_EDEFAULT == null ? participantClassName != null : !PARTICIPANT_CLASS_NAME_EDEFAULT.equals(participantClassName);
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
		result.append(" (participantClassName: ");
		result.append(participantClassName);
		result.append(')');
		return result.toString();
	}

} //NonTraversableAssociationEndImpl
