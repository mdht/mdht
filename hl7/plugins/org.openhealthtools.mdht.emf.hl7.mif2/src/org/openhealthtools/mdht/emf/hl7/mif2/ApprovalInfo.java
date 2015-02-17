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
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approval Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates the approval status of the artifact(s).
 * UML: Part of a complex tag value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getBallotSubmission <em>Ballot Submission</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getApprovingOrganization <em>Approving Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getBallotOccurrence <em>Ballot Occurrence</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getWithdrawalDate <em>Withdrawal Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApprovalInfo()
 * @model extendedMetaData="name='ApprovalInfo' kind='elementOnly'"
 * @generated
 */
public interface ApprovalInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Ballot Submission</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A response submitted as part of the ballot
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ballot Submission</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApprovalInfo_BallotSubmission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ballotSubmission' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BallotSubmission> getBallotSubmission();

	/**
	 * Returns the value of the '<em><b>Approval Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the date of the intended ballot (for material with a ballotStatus identifying itself as a ballot), or the date on which the material was successfully balloted (for material with a ballotStatus identifying itself as a Standard) or the date the approval status was changed (for non-balloted artifacts).
	 * UML: Part of a complex tag value
	 * DublinCore: for a passed ballot, maps to 'dateAccepted'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Date</em>' attribute.
	 * @see #setApprovalDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApprovalInfo_ApprovalDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='approvalDate'"
	 * @generated
	 */
	XMLGregorianCalendar getApprovalDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getApprovalDate <em>Approval Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Date</em>' attribute.
	 * @see #getApprovalDate()
	 * @generated
	 */
	void setApprovalDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Approval Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalStatusKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies how far along in the ballot process this artifact has progressed.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Status</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ApprovalStatusKind
	 * @see #isSetApprovalStatus()
	 * @see #unsetApprovalStatus()
	 * @see #setApprovalStatus(ApprovalStatusKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApprovalInfo_ApprovalStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='approvalStatus'"
	 * @generated
	 */
	ApprovalStatusKind getApprovalStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getApprovalStatus <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Status</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ApprovalStatusKind
	 * @see #isSetApprovalStatus()
	 * @see #unsetApprovalStatus()
	 * @see #getApprovalStatus()
	 * @generated
	 */
	void setApprovalStatus(ApprovalStatusKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getApprovalStatus <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApprovalStatus()
	 * @see #getApprovalStatus()
	 * @see #setApprovalStatus(ApprovalStatusKind)
	 * @generated
	 */
	void unsetApprovalStatus();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getApprovalStatus <em>Approval Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Approval Status</em>' attribute is set.
	 * @see #unsetApprovalStatus()
	 * @see #getApprovalStatus()
	 * @see #setApprovalStatus(ApprovalStatusKind)
	 * @generated
	 */
	boolean isSetApprovalStatus();

	/**
	 * Returns the value of the '<em><b>Approving Organization</b></em>' attribute.
	 * The default value is <code>"HL7"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the organization which has taken responsibility for balloting, endorsing or otherwise approving the content and the status for the content.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approving Organization</em>' attribute.
	 * @see #isSetApprovingOrganization()
	 * @see #unsetApprovingOrganization()
	 * @see #setApprovingOrganization(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApprovalInfo_ApprovingOrganization()
	 * @model default="HL7" unsettable="true" dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='approvingOrganization'"
	 * @generated
	 */
	String getApprovingOrganization();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getApprovingOrganization <em>Approving Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approving Organization</em>' attribute.
	 * @see #isSetApprovingOrganization()
	 * @see #unsetApprovingOrganization()
	 * @see #getApprovingOrganization()
	 * @generated
	 */
	void setApprovingOrganization(String value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getApprovingOrganization <em>Approving Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApprovingOrganization()
	 * @see #getApprovingOrganization()
	 * @see #setApprovingOrganization(String)
	 * @generated
	 */
	void unsetApprovingOrganization();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getApprovingOrganization <em>Approving Organization</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Approving Organization</em>' attribute is set.
	 * @see #unsetApprovingOrganization()
	 * @see #getApprovingOrganization()
	 * @see #setApprovingOrganization(String)
	 * @generated
	 */
	boolean isSetApprovingOrganization();

	/**
	 * Returns the value of the '<em><b>Ballot Occurrence</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the repetition number at the identified ballot level.  (E.g. second time at committee level ballot.)
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ballot Occurrence</em>' attribute.
	 * @see #isSetBallotOccurrence()
	 * @see #unsetBallotOccurrence()
	 * @see #setBallotOccurrence(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApprovalInfo_BallotOccurrence()
	 * @model default="1" unsettable="true" dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallPositiveInteger"
	 *        extendedMetaData="kind='attribute' name='ballotOccurrence'"
	 * @generated
	 */
	BigInteger getBallotOccurrence();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getBallotOccurrence <em>Ballot Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ballot Occurrence</em>' attribute.
	 * @see #isSetBallotOccurrence()
	 * @see #unsetBallotOccurrence()
	 * @see #getBallotOccurrence()
	 * @generated
	 */
	void setBallotOccurrence(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getBallotOccurrence <em>Ballot Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBallotOccurrence()
	 * @see #getBallotOccurrence()
	 * @see #setBallotOccurrence(BigInteger)
	 * @generated
	 */
	void unsetBallotOccurrence();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getBallotOccurrence <em>Ballot Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ballot Occurrence</em>' attribute is set.
	 * @see #unsetBallotOccurrence()
	 * @see #getBallotOccurrence()
	 * @see #setBallotOccurrence(BigInteger)
	 * @generated
	 */
	boolean isSetBallotOccurrence();

	/**
	 * Returns the value of the '<em><b>Withdrawal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the the item was or is planned to be officially withdrawn as a standard.  For DSTUs, this is the intended sunset date for the DSTU specification.
	 * UML: Part of a complex tag value
	 * DublinCore: indicates the end date of 'valid'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Withdrawal Date</em>' attribute.
	 * @see #setWithdrawalDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApprovalInfo_WithdrawalDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='withdrawalDate'"
	 * @generated
	 */
	XMLGregorianCalendar getWithdrawalDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo#getWithdrawalDate <em>Withdrawal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Withdrawal Date</em>' attribute.
	 * @see #getWithdrawalDate()
	 * @generated
	 */
	void setWithdrawalDate(XMLGregorianCalendar value);

} // ApprovalInfo
