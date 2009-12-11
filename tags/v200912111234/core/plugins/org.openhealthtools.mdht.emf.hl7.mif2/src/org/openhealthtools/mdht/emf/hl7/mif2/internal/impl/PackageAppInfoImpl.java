/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.BallotComment;
import org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageAppInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package App Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageAppInfoImpl#getBallotComment <em>Ballot Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageAppInfoImpl#getChangeRequest <em>Change Request</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageAppInfoImpl extends EObjectImpl implements PackageAppInfo {
	/**
	 * The cached value of the '{@link #getBallotComment() <em>Ballot Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBallotComment()
	 * @generated
	 * @ordered
	 */
	protected EList<BallotComment> ballotComment;

	/**
	 * The cached value of the '{@link #getChangeRequest() <em>Change Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeRequest> changeRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageAppInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PACKAGE_APP_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BallotComment> getBallotComment() {
		if (ballotComment == null) {
			ballotComment = new EObjectContainmentEList<BallotComment>(BallotComment.class, this, Mif2Package.PACKAGE_APP_INFO__BALLOT_COMMENT);
		}
		return ballotComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeRequest> getChangeRequest() {
		if (changeRequest == null) {
			changeRequest = new EObjectContainmentEList<ChangeRequest>(ChangeRequest.class, this, Mif2Package.PACKAGE_APP_INFO__CHANGE_REQUEST);
		}
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.PACKAGE_APP_INFO__BALLOT_COMMENT:
				return ((InternalEList<?>)getBallotComment()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_APP_INFO__CHANGE_REQUEST:
				return ((InternalEList<?>)getChangeRequest()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.PACKAGE_APP_INFO__BALLOT_COMMENT:
				return getBallotComment();
			case Mif2Package.PACKAGE_APP_INFO__CHANGE_REQUEST:
				return getChangeRequest();
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
			case Mif2Package.PACKAGE_APP_INFO__BALLOT_COMMENT:
				getBallotComment().clear();
				getBallotComment().addAll((Collection<? extends BallotComment>)newValue);
				return;
			case Mif2Package.PACKAGE_APP_INFO__CHANGE_REQUEST:
				getChangeRequest().clear();
				getChangeRequest().addAll((Collection<? extends ChangeRequest>)newValue);
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
			case Mif2Package.PACKAGE_APP_INFO__BALLOT_COMMENT:
				getBallotComment().clear();
				return;
			case Mif2Package.PACKAGE_APP_INFO__CHANGE_REQUEST:
				getChangeRequest().clear();
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
			case Mif2Package.PACKAGE_APP_INFO__BALLOT_COMMENT:
				return ballotComment != null && !ballotComment.isEmpty();
			case Mif2Package.PACKAGE_APP_INFO__CHANGE_REQUEST:
				return changeRequest != null && !changeRequest.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageAppInfoImpl
