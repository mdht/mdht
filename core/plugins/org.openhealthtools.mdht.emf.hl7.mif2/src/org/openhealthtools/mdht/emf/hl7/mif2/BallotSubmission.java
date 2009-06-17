/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ballot Submission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the content necessary when submitting a ballot
 * UML: Type used in a complex tag value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getVoterComments <em>Voter Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getSubmissionId <em>Submission Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getSubmitterName <em>Submitter Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getSubmitterOrganization <em>Submitter Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getVote <em>Vote</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotSubmission()
 * @model extendedMetaData="name='BallotSubmission' kind='elementOnly'"
 * @generated
 */
public interface BallotSubmission extends EObject {
	/**
	 * Returns the value of the '<em><b>Voter Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General comments explaining the reason for the ballot response.
	 * UML: voterComments tag on BallotResponse stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voter Comments</em>' containment reference.
	 * @see #setVoterComments(Inline)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotSubmission_VoterComments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='voterComments' namespace='##targetNamespace'"
	 * @generated
	 */
	Inline getVoterComments();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getVoterComments <em>Voter Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voter Comments</em>' containment reference.
	 * @see #getVoterComments()
	 * @generated
	 */
	void setVoterComments(Inline value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.NegativeVoteResolutionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the vote was dealt with
	 * UML: vote tag on Mapping stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.NegativeVoteResolutionKind
	 * @see #isSetResolution()
	 * @see #unsetResolution()
	 * @see #setResolution(NegativeVoteResolutionKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotSubmission_Resolution()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='resolution'"
	 * @generated
	 */
	NegativeVoteResolutionKind getResolution();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.NegativeVoteResolutionKind
	 * @see #isSetResolution()
	 * @see #unsetResolution()
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(NegativeVoteResolutionKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResolution()
	 * @see #getResolution()
	 * @see #setResolution(NegativeVoteResolutionKind)
	 * @generated
	 */
	void unsetResolution();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getResolution <em>Resolution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resolution</em>' attribute is set.
	 * @see #unsetResolution()
	 * @see #getResolution()
	 * @see #setResolution(NegativeVoteResolutionKind)
	 * @generated
	 */
	boolean isSetResolution();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalStatusKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the ballot has been resolved (if resolution is necessary).
	 * UML: status tag on Mapping stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ApprovalStatusKind
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(ApprovalStatusKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotSubmission_Status()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	ApprovalStatusKind getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ApprovalStatusKind
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ApprovalStatusKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(ApprovalStatusKind)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(ApprovalStatusKind)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when the most recent ballot status was arrived at.
	 * UML: statusDate tag on Mapping stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date</em>' attribute.
	 * @see #setStatusDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotSubmission_StatusDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='statusDate'"
	 * @generated
	 */
	XMLGregorianCalendar getStatusDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getStatusDate <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' attribute.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Submission Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for a specific ballot response.  All ballot comments must refer to a submissionId.
	 * UML: submissionId tag on BallotResponse stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submission Id</em>' attribute.
	 * @see #setSubmissionId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotSubmission_SubmissionId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId" required="true"
	 *        extendedMetaData="kind='attribute' name='submissionId'"
	 * @generated
	 */
	String getSubmissionId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getSubmissionId <em>Submission Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submission Id</em>' attribute.
	 * @see #getSubmissionId()
	 * @generated
	 */
	void setSubmissionId(String value);

	/**
	 * Returns the value of the '<em><b>Submitter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the person responsible for the ballot response, and who will be responsible for defending the ballot response and/or withdrawing it.
	 * UML: submitterName tag on Mapping stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submitter Name</em>' attribute.
	 * @see #setSubmitterName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotSubmission_SubmitterName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName" required="true"
	 *        extendedMetaData="kind='attribute' name='submitterName'"
	 * @generated
	 */
	String getSubmitterName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getSubmitterName <em>Submitter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter Name</em>' attribute.
	 * @see #getSubmitterName()
	 * @generated
	 */
	void setSubmitterName(String value);

	/**
	 * Returns the value of the '<em><b>Submitter Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization responsible for the ballot response.
	 * UML: submitterOrganization tag on BallotResponse stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submitter Organization</em>' attribute.
	 * @see #setSubmitterOrganization(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotSubmission_SubmitterOrganization()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='submitterOrganization'"
	 * @generated
	 */
	String getSubmitterOrganization();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getSubmitterOrganization <em>Submitter Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter Organization</em>' attribute.
	 * @see #getSubmitterOrganization()
	 * @generated
	 */
	void setSubmitterOrganization(String value);

	/**
	 * Returns the value of the '<em><b>Vote</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.VoteKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the voter wants the content to pass the ballot.
	 * UML: vote tag on Mapping stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vote</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VoteKind
	 * @see #isSetVote()
	 * @see #unsetVote()
	 * @see #setVote(VoteKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotSubmission_Vote()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='vote'"
	 * @generated
	 */
	VoteKind getVote();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getVote <em>Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vote</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VoteKind
	 * @see #isSetVote()
	 * @see #unsetVote()
	 * @see #getVote()
	 * @generated
	 */
	void setVote(VoteKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getVote <em>Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVote()
	 * @see #getVote()
	 * @see #setVote(VoteKind)
	 * @generated
	 */
	void unsetVote();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission#getVote <em>Vote</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vote</em>' attribute is set.
	 * @see #unsetVote()
	 * @see #getVote()
	 * @see #setVote(VoteKind)
	 * @generated
	 */
	boolean isSetVote();

} // BallotSubmission
