/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ApprovalStatusKind;
import org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.NegativeVoteResolutionKind;
import org.openhealthtools.mdht.emf.hl7.mif2.VoteKind;
import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ballot Submission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotSubmissionImpl#getVoterComments <em>Voter Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotSubmissionImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotSubmissionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotSubmissionImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotSubmissionImpl#getSubmissionId <em>Submission Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotSubmissionImpl#getSubmitterName <em>Submitter Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotSubmissionImpl#getSubmitterOrganization <em>Submitter Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotSubmissionImpl#getVote <em>Vote</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BallotSubmissionImpl extends EObjectImpl implements BallotSubmission {
	/**
	 * The cached value of the '{@link #getVoterComments() <em>Voter Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoterComments()
	 * @generated
	 * @ordered
	 */
	protected Inline voterComments;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final NegativeVoteResolutionKind RESOLUTION_EDEFAULT = NegativeVoteResolutionKind.UNRESOLVED;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected NegativeVoteResolutionKind resolution = RESOLUTION_EDEFAULT;

	/**
	 * This is true if the Resolution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resolutionESet;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ApprovalStatusKind STATUS_EDEFAULT = ApprovalStatusKind.DRAFT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ApprovalStatusKind status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

	/**
	 * The default value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar STATUS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar statusDate = STATUS_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmissionId() <em>Submission Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmissionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMISSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmissionId() <em>Submission Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmissionId()
	 * @generated
	 * @ordered
	 */
	protected String submissionId = SUBMISSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmitterName() <em>Submitter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitterName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMITTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmitterName() <em>Submitter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitterName()
	 * @generated
	 * @ordered
	 */
	protected String submitterName = SUBMITTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmitterOrganization() <em>Submitter Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitterOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMITTER_ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmitterOrganization() <em>Submitter Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitterOrganization()
	 * @generated
	 * @ordered
	 */
	protected String submitterOrganization = SUBMITTER_ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVote() <em>Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVote()
	 * @generated
	 * @ordered
	 */
	protected static final VoteKind VOTE_EDEFAULT = VoteKind.AFFIRMATIVE;

	/**
	 * The cached value of the '{@link #getVote() <em>Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVote()
	 * @generated
	 * @ordered
	 */
	protected VoteKind vote = VOTE_EDEFAULT;

	/**
	 * This is true if the Vote attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BallotSubmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.BALLOT_SUBMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inline getVoterComments() {
		return voterComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoterComments(Inline newVoterComments, NotificationChain msgs) {
		Inline oldVoterComments = voterComments;
		voterComments = newVoterComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.BALLOT_SUBMISSION__VOTER_COMMENTS, oldVoterComments, newVoterComments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoterComments(Inline newVoterComments) {
		if (newVoterComments != voterComments) {
			NotificationChain msgs = null;
			if (voterComments != null)
				msgs = ((InternalEObject)voterComments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.BALLOT_SUBMISSION__VOTER_COMMENTS, null, msgs);
			if (newVoterComments != null)
				msgs = ((InternalEObject)newVoterComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.BALLOT_SUBMISSION__VOTER_COMMENTS, null, msgs);
			msgs = basicSetVoterComments(newVoterComments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BALLOT_SUBMISSION__VOTER_COMMENTS, newVoterComments, newVoterComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeVoteResolutionKind getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(NegativeVoteResolutionKind newResolution) {
		NegativeVoteResolutionKind oldResolution = resolution;
		resolution = newResolution == null ? RESOLUTION_EDEFAULT : newResolution;
		boolean oldResolutionESet = resolutionESet;
		resolutionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BALLOT_SUBMISSION__RESOLUTION, oldResolution, resolution, !oldResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResolution() {
		NegativeVoteResolutionKind oldResolution = resolution;
		boolean oldResolutionESet = resolutionESet;
		resolution = RESOLUTION_EDEFAULT;
		resolutionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.BALLOT_SUBMISSION__RESOLUTION, oldResolution, RESOLUTION_EDEFAULT, oldResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResolution() {
		return resolutionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalStatusKind getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ApprovalStatusKind newStatus) {
		ApprovalStatusKind oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BALLOT_SUBMISSION__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		ApprovalStatusKind oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.BALLOT_SUBMISSION__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(XMLGregorianCalendar newStatusDate) {
		XMLGregorianCalendar oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BALLOT_SUBMISSION__STATUS_DATE, oldStatusDate, statusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubmissionId() {
		return submissionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmissionId(String newSubmissionId) {
		String oldSubmissionId = submissionId;
		submissionId = newSubmissionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BALLOT_SUBMISSION__SUBMISSION_ID, oldSubmissionId, submissionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubmitterName() {
		return submitterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmitterName(String newSubmitterName) {
		String oldSubmitterName = submitterName;
		submitterName = newSubmitterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BALLOT_SUBMISSION__SUBMITTER_NAME, oldSubmitterName, submitterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubmitterOrganization() {
		return submitterOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmitterOrganization(String newSubmitterOrganization) {
		String oldSubmitterOrganization = submitterOrganization;
		submitterOrganization = newSubmitterOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BALLOT_SUBMISSION__SUBMITTER_ORGANIZATION, oldSubmitterOrganization, submitterOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoteKind getVote() {
		return vote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVote(VoteKind newVote) {
		VoteKind oldVote = vote;
		vote = newVote == null ? VOTE_EDEFAULT : newVote;
		boolean oldVoteESet = voteESet;
		voteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BALLOT_SUBMISSION__VOTE, oldVote, vote, !oldVoteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVote() {
		VoteKind oldVote = vote;
		boolean oldVoteESet = voteESet;
		vote = VOTE_EDEFAULT;
		voteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.BALLOT_SUBMISSION__VOTE, oldVote, VOTE_EDEFAULT, oldVoteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVote() {
		return voteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.BALLOT_SUBMISSION__VOTER_COMMENTS:
				return basicSetVoterComments(null, msgs);
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
			case Mif2Package.BALLOT_SUBMISSION__VOTER_COMMENTS:
				return getVoterComments();
			case Mif2Package.BALLOT_SUBMISSION__RESOLUTION:
				return getResolution();
			case Mif2Package.BALLOT_SUBMISSION__STATUS:
				return getStatus();
			case Mif2Package.BALLOT_SUBMISSION__STATUS_DATE:
				return getStatusDate();
			case Mif2Package.BALLOT_SUBMISSION__SUBMISSION_ID:
				return getSubmissionId();
			case Mif2Package.BALLOT_SUBMISSION__SUBMITTER_NAME:
				return getSubmitterName();
			case Mif2Package.BALLOT_SUBMISSION__SUBMITTER_ORGANIZATION:
				return getSubmitterOrganization();
			case Mif2Package.BALLOT_SUBMISSION__VOTE:
				return getVote();
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
			case Mif2Package.BALLOT_SUBMISSION__VOTER_COMMENTS:
				setVoterComments((Inline)newValue);
				return;
			case Mif2Package.BALLOT_SUBMISSION__RESOLUTION:
				setResolution((NegativeVoteResolutionKind)newValue);
				return;
			case Mif2Package.BALLOT_SUBMISSION__STATUS:
				setStatus((ApprovalStatusKind)newValue);
				return;
			case Mif2Package.BALLOT_SUBMISSION__STATUS_DATE:
				setStatusDate((XMLGregorianCalendar)newValue);
				return;
			case Mif2Package.BALLOT_SUBMISSION__SUBMISSION_ID:
				setSubmissionId((String)newValue);
				return;
			case Mif2Package.BALLOT_SUBMISSION__SUBMITTER_NAME:
				setSubmitterName((String)newValue);
				return;
			case Mif2Package.BALLOT_SUBMISSION__SUBMITTER_ORGANIZATION:
				setSubmitterOrganization((String)newValue);
				return;
			case Mif2Package.BALLOT_SUBMISSION__VOTE:
				setVote((VoteKind)newValue);
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
			case Mif2Package.BALLOT_SUBMISSION__VOTER_COMMENTS:
				setVoterComments((Inline)null);
				return;
			case Mif2Package.BALLOT_SUBMISSION__RESOLUTION:
				unsetResolution();
				return;
			case Mif2Package.BALLOT_SUBMISSION__STATUS:
				unsetStatus();
				return;
			case Mif2Package.BALLOT_SUBMISSION__STATUS_DATE:
				setStatusDate(STATUS_DATE_EDEFAULT);
				return;
			case Mif2Package.BALLOT_SUBMISSION__SUBMISSION_ID:
				setSubmissionId(SUBMISSION_ID_EDEFAULT);
				return;
			case Mif2Package.BALLOT_SUBMISSION__SUBMITTER_NAME:
				setSubmitterName(SUBMITTER_NAME_EDEFAULT);
				return;
			case Mif2Package.BALLOT_SUBMISSION__SUBMITTER_ORGANIZATION:
				setSubmitterOrganization(SUBMITTER_ORGANIZATION_EDEFAULT);
				return;
			case Mif2Package.BALLOT_SUBMISSION__VOTE:
				unsetVote();
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
			case Mif2Package.BALLOT_SUBMISSION__VOTER_COMMENTS:
				return voterComments != null;
			case Mif2Package.BALLOT_SUBMISSION__RESOLUTION:
				return isSetResolution();
			case Mif2Package.BALLOT_SUBMISSION__STATUS:
				return isSetStatus();
			case Mif2Package.BALLOT_SUBMISSION__STATUS_DATE:
				return STATUS_DATE_EDEFAULT == null ? statusDate != null : !STATUS_DATE_EDEFAULT.equals(statusDate);
			case Mif2Package.BALLOT_SUBMISSION__SUBMISSION_ID:
				return SUBMISSION_ID_EDEFAULT == null ? submissionId != null : !SUBMISSION_ID_EDEFAULT.equals(submissionId);
			case Mif2Package.BALLOT_SUBMISSION__SUBMITTER_NAME:
				return SUBMITTER_NAME_EDEFAULT == null ? submitterName != null : !SUBMITTER_NAME_EDEFAULT.equals(submitterName);
			case Mif2Package.BALLOT_SUBMISSION__SUBMITTER_ORGANIZATION:
				return SUBMITTER_ORGANIZATION_EDEFAULT == null ? submitterOrganization != null : !SUBMITTER_ORGANIZATION_EDEFAULT.equals(submitterOrganization);
			case Mif2Package.BALLOT_SUBMISSION__VOTE:
				return isSetVote();
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
		result.append(" (resolution: ");
		if (resolutionESet) result.append(resolution); else result.append("<unset>");
		result.append(", status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(", statusDate: ");
		result.append(statusDate);
		result.append(", submissionId: ");
		result.append(submissionId);
		result.append(", submitterName: ");
		result.append(submitterName);
		result.append(", submitterOrganization: ");
		result.append(submitterOrganization);
		result.append(", vote: ");
		if (voteESet) result.append(vote); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BallotSubmissionImpl
