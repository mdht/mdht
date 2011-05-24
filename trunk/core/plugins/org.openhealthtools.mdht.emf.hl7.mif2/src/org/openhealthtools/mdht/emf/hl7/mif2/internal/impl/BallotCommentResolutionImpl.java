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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution;
import org.openhealthtools.mdht.emf.hl7.mif2.GroupVote;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ballot Comment Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentResolutionImpl#getResolutionComments <em>Resolution Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentResolutionImpl#getVote <em>Vote</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentResolutionImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentResolutionImpl#getResolutionDate <em>Resolution Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BallotCommentResolutionImpl extends EObjectImpl implements BallotCommentResolution {
	/**
	 * The cached value of the '{@link #getResolutionComments() <em>Resolution Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionComments()
	 * @generated
	 * @ordered
	 */
	protected Inline resolutionComments;

	/**
	 * The cached value of the '{@link #getVote() <em>Vote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVote()
	 * @generated
	 * @ordered
	 */
	protected GroupVote vote;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Enumerator RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected Enumerator resolution = RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolutionDate() <em>Resolution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RESOLUTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolutionDate() <em>Resolution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar resolutionDate = RESOLUTION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BallotCommentResolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.BALLOT_COMMENT_RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inline getResolutionComments() {
		return resolutionComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolutionComments(Inline newResolutionComments, NotificationChain msgs) {
		Inline oldResolutionComments = resolutionComments;
		resolutionComments = newResolutionComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_COMMENTS,
				oldResolutionComments, newResolutionComments);
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
	public void setResolutionComments(Inline newResolutionComments) {
		if (newResolutionComments != resolutionComments) {
			NotificationChain msgs = null;
			if (resolutionComments != null) {
				msgs = ((InternalEObject) resolutionComments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_COMMENTS, null, msgs);
			}
			if (newResolutionComments != null) {
				msgs = ((InternalEObject) newResolutionComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_COMMENTS, null, msgs);
			}
			msgs = basicSetResolutionComments(newResolutionComments, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_COMMENTS,
				newResolutionComments, newResolutionComments));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVote getVote() {
		return vote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVote(GroupVote newVote, NotificationChain msgs) {
		GroupVote oldVote = vote;
		vote = newVote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT_RESOLUTION__VOTE, oldVote, newVote);
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
	public void setVote(GroupVote newVote) {
		if (newVote != vote) {
			NotificationChain msgs = null;
			if (vote != null) {
				msgs = ((InternalEObject) vote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.BALLOT_COMMENT_RESOLUTION__VOTE, null, msgs);
			}
			if (newVote != null) {
				msgs = ((InternalEObject) newVote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.BALLOT_COMMENT_RESOLUTION__VOTE, null, msgs);
			}
			msgs = basicSetVote(newVote, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT_RESOLUTION__VOTE, newVote, newVote));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(Enumerator newResolution) {
		Enumerator oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION, oldResolution, resolution));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getResolutionDate() {
		return resolutionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionDate(XMLGregorianCalendar newResolutionDate) {
		XMLGregorianCalendar oldResolutionDate = resolutionDate;
		resolutionDate = newResolutionDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_DATE, oldResolutionDate,
				resolutionDate));
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
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_COMMENTS:
				return basicSetResolutionComments(null, msgs);
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__VOTE:
				return basicSetVote(null, msgs);
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
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_COMMENTS:
				return getResolutionComments();
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__VOTE:
				return getVote();
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION:
				return getResolution();
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_DATE:
				return getResolutionDate();
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
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_COMMENTS:
				setResolutionComments((Inline) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__VOTE:
				setVote((GroupVote) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION:
				setResolution((Enumerator) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_DATE:
				setResolutionDate((XMLGregorianCalendar) newValue);
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
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_COMMENTS:
				setResolutionComments((Inline) null);
				return;
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__VOTE:
				setVote((GroupVote) null);
				return;
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_DATE:
				setResolutionDate(RESOLUTION_DATE_EDEFAULT);
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
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_COMMENTS:
				return resolutionComments != null;
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__VOTE:
				return vote != null;
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION:
				return RESOLUTION_EDEFAULT == null
						? resolution != null
						: !RESOLUTION_EDEFAULT.equals(resolution);
			case Mif2Package.BALLOT_COMMENT_RESOLUTION__RESOLUTION_DATE:
				return RESOLUTION_DATE_EDEFAULT == null
						? resolutionDate != null
						: !RESOLUTION_DATE_EDEFAULT.equals(resolutionDate);
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
		result.append(" (resolution: ");
		result.append(resolution);
		result.append(", resolutionDate: ");
		result.append(resolutionDate);
		result.append(')');
		return result.toString();
	}

} // BallotCommentResolutionImpl
