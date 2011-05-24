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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.GroupVote;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Vote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GroupVoteImpl#getAbstain <em>Abstain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GroupVoteImpl#getInFavour <em>In Favour</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GroupVoteImpl#getMotionBy <em>Motion By</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GroupVoteImpl#getOpposed <em>Opposed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GroupVoteImpl#getSecondedBy <em>Seconded By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupVoteImpl extends EObjectImpl implements GroupVote {
	/**
	 * The default value of the '{@link #getAbstain() <em>Abstain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstain()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ABSTAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstain() <em>Abstain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstain()
	 * @generated
	 * @ordered
	 */
	protected BigInteger abstain = ABSTAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getInFavour() <em>In Favour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInFavour()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IN_FAVOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInFavour() <em>In Favour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInFavour()
	 * @generated
	 * @ordered
	 */
	protected BigInteger inFavour = IN_FAVOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotionBy() <em>Motion By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotionBy()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTION_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotionBy() <em>Motion By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotionBy()
	 * @generated
	 * @ordered
	 */
	protected String motionBy = MOTION_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpposed() <em>Opposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OPPOSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpposed() <em>Opposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger opposed = OPPOSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondedBy() <em>Seconded By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String SECONDED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondedBy() <em>Seconded By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondedBy()
	 * @generated
	 * @ordered
	 */
	protected String secondedBy = SECONDED_BY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupVoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.GROUP_VOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAbstain() {
		return abstain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstain(BigInteger newAbstain) {
		BigInteger oldAbstain = abstain;
		abstain = newAbstain;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.GROUP_VOTE__ABSTAIN, oldAbstain, abstain));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getInFavour() {
		return inFavour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInFavour(BigInteger newInFavour) {
		BigInteger oldInFavour = inFavour;
		inFavour = newInFavour;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.GROUP_VOTE__IN_FAVOUR, oldInFavour, inFavour));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotionBy() {
		return motionBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotionBy(String newMotionBy) {
		String oldMotionBy = motionBy;
		motionBy = newMotionBy;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.GROUP_VOTE__MOTION_BY, oldMotionBy, motionBy));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOpposed() {
		return opposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposed(BigInteger newOpposed) {
		BigInteger oldOpposed = opposed;
		opposed = newOpposed;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.GROUP_VOTE__OPPOSED, oldOpposed, opposed));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondedBy() {
		return secondedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondedBy(String newSecondedBy) {
		String oldSecondedBy = secondedBy;
		secondedBy = newSecondedBy;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.GROUP_VOTE__SECONDED_BY, oldSecondedBy, secondedBy));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.GROUP_VOTE__ABSTAIN:
				return getAbstain();
			case Mif2Package.GROUP_VOTE__IN_FAVOUR:
				return getInFavour();
			case Mif2Package.GROUP_VOTE__MOTION_BY:
				return getMotionBy();
			case Mif2Package.GROUP_VOTE__OPPOSED:
				return getOpposed();
			case Mif2Package.GROUP_VOTE__SECONDED_BY:
				return getSecondedBy();
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
			case Mif2Package.GROUP_VOTE__ABSTAIN:
				setAbstain((BigInteger) newValue);
				return;
			case Mif2Package.GROUP_VOTE__IN_FAVOUR:
				setInFavour((BigInteger) newValue);
				return;
			case Mif2Package.GROUP_VOTE__MOTION_BY:
				setMotionBy((String) newValue);
				return;
			case Mif2Package.GROUP_VOTE__OPPOSED:
				setOpposed((BigInteger) newValue);
				return;
			case Mif2Package.GROUP_VOTE__SECONDED_BY:
				setSecondedBy((String) newValue);
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
			case Mif2Package.GROUP_VOTE__ABSTAIN:
				setAbstain(ABSTAIN_EDEFAULT);
				return;
			case Mif2Package.GROUP_VOTE__IN_FAVOUR:
				setInFavour(IN_FAVOUR_EDEFAULT);
				return;
			case Mif2Package.GROUP_VOTE__MOTION_BY:
				setMotionBy(MOTION_BY_EDEFAULT);
				return;
			case Mif2Package.GROUP_VOTE__OPPOSED:
				setOpposed(OPPOSED_EDEFAULT);
				return;
			case Mif2Package.GROUP_VOTE__SECONDED_BY:
				setSecondedBy(SECONDED_BY_EDEFAULT);
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
			case Mif2Package.GROUP_VOTE__ABSTAIN:
				return ABSTAIN_EDEFAULT == null
						? abstain != null
						: !ABSTAIN_EDEFAULT.equals(abstain);
			case Mif2Package.GROUP_VOTE__IN_FAVOUR:
				return IN_FAVOUR_EDEFAULT == null
						? inFavour != null
						: !IN_FAVOUR_EDEFAULT.equals(inFavour);
			case Mif2Package.GROUP_VOTE__MOTION_BY:
				return MOTION_BY_EDEFAULT == null
						? motionBy != null
						: !MOTION_BY_EDEFAULT.equals(motionBy);
			case Mif2Package.GROUP_VOTE__OPPOSED:
				return OPPOSED_EDEFAULT == null
						? opposed != null
						: !OPPOSED_EDEFAULT.equals(opposed);
			case Mif2Package.GROUP_VOTE__SECONDED_BY:
				return SECONDED_BY_EDEFAULT == null
						? secondedBy != null
						: !SECONDED_BY_EDEFAULT.equals(secondedBy);
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
		result.append(" (abstain: ");
		result.append(abstain);
		result.append(", inFavour: ");
		result.append(inFavour);
		result.append(", motionBy: ");
		result.append(motionBy);
		result.append(", opposed: ");
		result.append(opposed);
		result.append(", secondedBy: ");
		result.append(secondedBy);
		result.append(')');
		return result.toString();
	}

} // GroupVoteImpl
