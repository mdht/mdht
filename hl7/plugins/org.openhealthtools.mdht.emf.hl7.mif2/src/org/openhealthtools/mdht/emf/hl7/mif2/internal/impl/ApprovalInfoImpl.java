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

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.ApprovalStatusKind;
import org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Approval Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApprovalInfoImpl#getBallotSubmission <em>Ballot Submission</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApprovalInfoImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApprovalInfoImpl#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApprovalInfoImpl#getApprovingOrganization <em>Approving Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApprovalInfoImpl#getBallotOccurrence <em>Ballot Occurrence</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApprovalInfoImpl#getWithdrawalDate <em>Withdrawal Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApprovalInfoImpl extends EObjectImpl implements ApprovalInfo {
	/**
	 * The cached value of the '{@link #getBallotSubmission() <em>Ballot Submission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBallotSubmission()
	 * @generated
	 * @ordered
	 */
	protected EList<BallotSubmission> ballotSubmission;

	/**
	 * The default value of the '{@link #getApprovalDate() <em>Approval Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar APPROVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalDate() <em>Approval Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar approvalDate = APPROVAL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovalStatus() <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ApprovalStatusKind APPROVAL_STATUS_EDEFAULT = ApprovalStatusKind.DRAFT;

	/**
	 * The cached value of the '{@link #getApprovalStatus() <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatus()
	 * @generated
	 * @ordered
	 */
	protected ApprovalStatusKind approvalStatus = APPROVAL_STATUS_EDEFAULT;

	/**
	 * This is true if the Approval Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean approvalStatusESet;

	/**
	 * The default value of the '{@link #getApprovingOrganization() <em>Approving Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovingOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVING_ORGANIZATION_EDEFAULT = "HL7";

	/**
	 * The cached value of the '{@link #getApprovingOrganization() <em>Approving Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovingOrganization()
	 * @generated
	 * @ordered
	 */
	protected String approvingOrganization = APPROVING_ORGANIZATION_EDEFAULT;

	/**
	 * This is true if the Approving Organization attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean approvingOrganizationESet;

	/**
	 * The default value of the '{@link #getBallotOccurrence() <em>Ballot Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBallotOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BALLOT_OCCURRENCE_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getBallotOccurrence() <em>Ballot Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBallotOccurrence()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ballotOccurrence = BALLOT_OCCURRENCE_EDEFAULT;

	/**
	 * This is true if the Ballot Occurrence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ballotOccurrenceESet;

	/**
	 * The default value of the '{@link #getWithdrawalDate() <em>Withdrawal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithdrawalDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar WITHDRAWAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWithdrawalDate() <em>Withdrawal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithdrawalDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar withdrawalDate = WITHDRAWAL_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApprovalInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.APPROVAL_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BallotSubmission> getBallotSubmission() {
		if (ballotSubmission == null) {
			ballotSubmission = new EObjectContainmentEList<BallotSubmission>(
				BallotSubmission.class, this, Mif2Package.APPROVAL_INFO__BALLOT_SUBMISSION);
		}
		return ballotSubmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getApprovalDate() {
		return approvalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalDate(XMLGregorianCalendar newApprovalDate) {
		XMLGregorianCalendar oldApprovalDate = approvalDate;
		approvalDate = newApprovalDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.APPROVAL_INFO__APPROVAL_DATE, oldApprovalDate, approvalDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalStatusKind getApprovalStatus() {
		return approvalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalStatus(ApprovalStatusKind newApprovalStatus) {
		ApprovalStatusKind oldApprovalStatus = approvalStatus;
		approvalStatus = newApprovalStatus == null
				? APPROVAL_STATUS_EDEFAULT
				: newApprovalStatus;
		boolean oldApprovalStatusESet = approvalStatusESet;
		approvalStatusESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.APPROVAL_INFO__APPROVAL_STATUS, oldApprovalStatus, approvalStatus,
				!oldApprovalStatusESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovalStatus() {
		ApprovalStatusKind oldApprovalStatus = approvalStatus;
		boolean oldApprovalStatusESet = approvalStatusESet;
		approvalStatus = APPROVAL_STATUS_EDEFAULT;
		approvalStatusESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.APPROVAL_INFO__APPROVAL_STATUS, oldApprovalStatus,
				APPROVAL_STATUS_EDEFAULT, oldApprovalStatusESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovalStatus() {
		return approvalStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovingOrganization() {
		return approvingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovingOrganization(String newApprovingOrganization) {
		String oldApprovingOrganization = approvingOrganization;
		approvingOrganization = newApprovingOrganization;
		boolean oldApprovingOrganizationESet = approvingOrganizationESet;
		approvingOrganizationESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.APPROVAL_INFO__APPROVING_ORGANIZATION, oldApprovingOrganization,
				approvingOrganization, !oldApprovingOrganizationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovingOrganization() {
		String oldApprovingOrganization = approvingOrganization;
		boolean oldApprovingOrganizationESet = approvingOrganizationESet;
		approvingOrganization = APPROVING_ORGANIZATION_EDEFAULT;
		approvingOrganizationESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.APPROVAL_INFO__APPROVING_ORGANIZATION, oldApprovingOrganization,
				APPROVING_ORGANIZATION_EDEFAULT, oldApprovingOrganizationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovingOrganization() {
		return approvingOrganizationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBallotOccurrence() {
		return ballotOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBallotOccurrence(BigInteger newBallotOccurrence) {
		BigInteger oldBallotOccurrence = ballotOccurrence;
		ballotOccurrence = newBallotOccurrence;
		boolean oldBallotOccurrenceESet = ballotOccurrenceESet;
		ballotOccurrenceESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.APPROVAL_INFO__BALLOT_OCCURRENCE, oldBallotOccurrence,
				ballotOccurrence, !oldBallotOccurrenceESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBallotOccurrence() {
		BigInteger oldBallotOccurrence = ballotOccurrence;
		boolean oldBallotOccurrenceESet = ballotOccurrenceESet;
		ballotOccurrence = BALLOT_OCCURRENCE_EDEFAULT;
		ballotOccurrenceESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.APPROVAL_INFO__BALLOT_OCCURRENCE, oldBallotOccurrence,
				BALLOT_OCCURRENCE_EDEFAULT, oldBallotOccurrenceESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBallotOccurrence() {
		return ballotOccurrenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getWithdrawalDate() {
		return withdrawalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithdrawalDate(XMLGregorianCalendar newWithdrawalDate) {
		XMLGregorianCalendar oldWithdrawalDate = withdrawalDate;
		withdrawalDate = newWithdrawalDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.APPROVAL_INFO__WITHDRAWAL_DATE, oldWithdrawalDate, withdrawalDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.APPROVAL_INFO__BALLOT_SUBMISSION:
				return ((InternalEList<?>) getBallotSubmission()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.APPROVAL_INFO__BALLOT_SUBMISSION:
				return getBallotSubmission();
			case Mif2Package.APPROVAL_INFO__APPROVAL_DATE:
				return getApprovalDate();
			case Mif2Package.APPROVAL_INFO__APPROVAL_STATUS:
				return getApprovalStatus();
			case Mif2Package.APPROVAL_INFO__APPROVING_ORGANIZATION:
				return getApprovingOrganization();
			case Mif2Package.APPROVAL_INFO__BALLOT_OCCURRENCE:
				return getBallotOccurrence();
			case Mif2Package.APPROVAL_INFO__WITHDRAWAL_DATE:
				return getWithdrawalDate();
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
			case Mif2Package.APPROVAL_INFO__BALLOT_SUBMISSION:
				getBallotSubmission().clear();
				getBallotSubmission().addAll((Collection<? extends BallotSubmission>) newValue);
				return;
			case Mif2Package.APPROVAL_INFO__APPROVAL_DATE:
				setApprovalDate((XMLGregorianCalendar) newValue);
				return;
			case Mif2Package.APPROVAL_INFO__APPROVAL_STATUS:
				setApprovalStatus((ApprovalStatusKind) newValue);
				return;
			case Mif2Package.APPROVAL_INFO__APPROVING_ORGANIZATION:
				setApprovingOrganization((String) newValue);
				return;
			case Mif2Package.APPROVAL_INFO__BALLOT_OCCURRENCE:
				setBallotOccurrence((BigInteger) newValue);
				return;
			case Mif2Package.APPROVAL_INFO__WITHDRAWAL_DATE:
				setWithdrawalDate((XMLGregorianCalendar) newValue);
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
			case Mif2Package.APPROVAL_INFO__BALLOT_SUBMISSION:
				getBallotSubmission().clear();
				return;
			case Mif2Package.APPROVAL_INFO__APPROVAL_DATE:
				setApprovalDate(APPROVAL_DATE_EDEFAULT);
				return;
			case Mif2Package.APPROVAL_INFO__APPROVAL_STATUS:
				unsetApprovalStatus();
				return;
			case Mif2Package.APPROVAL_INFO__APPROVING_ORGANIZATION:
				unsetApprovingOrganization();
				return;
			case Mif2Package.APPROVAL_INFO__BALLOT_OCCURRENCE:
				unsetBallotOccurrence();
				return;
			case Mif2Package.APPROVAL_INFO__WITHDRAWAL_DATE:
				setWithdrawalDate(WITHDRAWAL_DATE_EDEFAULT);
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
			case Mif2Package.APPROVAL_INFO__BALLOT_SUBMISSION:
				return ballotSubmission != null && !ballotSubmission.isEmpty();
			case Mif2Package.APPROVAL_INFO__APPROVAL_DATE:
				return APPROVAL_DATE_EDEFAULT == null
						? approvalDate != null
						: !APPROVAL_DATE_EDEFAULT.equals(approvalDate);
			case Mif2Package.APPROVAL_INFO__APPROVAL_STATUS:
				return isSetApprovalStatus();
			case Mif2Package.APPROVAL_INFO__APPROVING_ORGANIZATION:
				return isSetApprovingOrganization();
			case Mif2Package.APPROVAL_INFO__BALLOT_OCCURRENCE:
				return isSetBallotOccurrence();
			case Mif2Package.APPROVAL_INFO__WITHDRAWAL_DATE:
				return WITHDRAWAL_DATE_EDEFAULT == null
						? withdrawalDate != null
						: !WITHDRAWAL_DATE_EDEFAULT.equals(withdrawalDate);
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
		result.append(" (approvalDate: ");
		result.append(approvalDate);
		result.append(", approvalStatus: ");
		if (approvalStatusESet) {
			result.append(approvalStatus);
		} else {
			result.append("<unset>");
		}
		result.append(", approvingOrganization: ");
		if (approvingOrganizationESet) {
			result.append(approvingOrganization);
		} else {
			result.append("<unset>");
		}
		result.append(", ballotOccurrence: ");
		if (ballotOccurrenceESet) {
			result.append(ballotOccurrence);
		} else {
			result.append("<unset>");
		}
		result.append(", withdrawalDate: ");
		result.append(withdrawalDate);
		result.append(')');
		return result.toString();
	}

} // ApprovalInfoImpl
