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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.BallotComment;
import org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RealmElement;
import org.openhealthtools.mdht.emf.hl7.mif2.VoteKind;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ballot Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentImpl#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentImpl#getExistingContent <em>Existing Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentImpl#getSuggestedReplacement <em>Suggested Replacement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentImpl#getCommentType <em>Comment Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentImpl#getImplementedDate <em>Implemented Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentImpl#getImplementingPersonName <em>Implementing Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BallotCommentImpl#getSubmissionId <em>Submission Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BallotCommentImpl extends BasicAnnotationImpl implements BallotComment {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap context;

	/**
	 * The cached value of the '{@link #getExistingContent() <em>Existing Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingContent()
	 * @generated
	 * @ordered
	 */
	protected Flow existingContent;

	/**
	 * The cached value of the '{@link #getSuggestedReplacement() <em>Suggested Replacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuggestedReplacement()
	 * @generated
	 * @ordered
	 */
	protected Flow suggestedReplacement;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected EList<BallotCommentResolution> resolution;

	/**
	 * The default value of the '{@link #getCommentType() <em>Comment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentType()
	 * @generated
	 * @ordered
	 */
	protected static final VoteKind COMMENT_TYPE_EDEFAULT = VoteKind.AFFIRMATIVE;

	/**
	 * The cached value of the '{@link #getCommentType() <em>Comment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentType()
	 * @generated
	 * @ordered
	 */
	protected VoteKind commentType = COMMENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Comment Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean commentTypeESet;

	/**
	 * The default value of the '{@link #getImplementedDate() <em>Implemented Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar IMPLEMENTED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementedDate() <em>Implemented Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar implementedDate = IMPLEMENTED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementingPersonName() <em>Implementing Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingPersonName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTING_PERSON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementingPersonName() <em>Implementing Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingPersonName()
	 * @generated
	 * @ordered
	 */
	protected String implementingPersonName = IMPLEMENTING_PERSON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected BigInteger name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BallotCommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.BALLOT_COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContext() {
		if (context == null) {
			context = new BasicFeatureMap(this, Mif2Package.BALLOT_COMMENT__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealmElement> getRealmNamespace() {
		return getContext().list(Mif2Package.Literals.BALLOT_COMMENT__REALM_NAMESPACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getExistingContent() {
		return existingContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExistingContent(Flow newExistingContent, NotificationChain msgs) {
		Flow oldExistingContent = existingContent;
		existingContent = newExistingContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT__EXISTING_CONTENT, oldExistingContent,
				newExistingContent);
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
	public void setExistingContent(Flow newExistingContent) {
		if (newExistingContent != existingContent) {
			NotificationChain msgs = null;
			if (existingContent != null) {
				msgs = ((InternalEObject) existingContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.BALLOT_COMMENT__EXISTING_CONTENT, null, msgs);
			}
			if (newExistingContent != null) {
				msgs = ((InternalEObject) newExistingContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.BALLOT_COMMENT__EXISTING_CONTENT, null, msgs);
			}
			msgs = basicSetExistingContent(newExistingContent, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT__EXISTING_CONTENT, newExistingContent,
				newExistingContent));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getSuggestedReplacement() {
		return suggestedReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuggestedReplacement(Flow newSuggestedReplacement, NotificationChain msgs) {
		Flow oldSuggestedReplacement = suggestedReplacement;
		suggestedReplacement = newSuggestedReplacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT__SUGGESTED_REPLACEMENT, oldSuggestedReplacement,
				newSuggestedReplacement);
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
	public void setSuggestedReplacement(Flow newSuggestedReplacement) {
		if (newSuggestedReplacement != suggestedReplacement) {
			NotificationChain msgs = null;
			if (suggestedReplacement != null) {
				msgs = ((InternalEObject) suggestedReplacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.BALLOT_COMMENT__SUGGESTED_REPLACEMENT, null, msgs);
			}
			if (newSuggestedReplacement != null) {
				msgs = ((InternalEObject) newSuggestedReplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.BALLOT_COMMENT__SUGGESTED_REPLACEMENT, null, msgs);
			}
			msgs = basicSetSuggestedReplacement(newSuggestedReplacement, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT__SUGGESTED_REPLACEMENT, newSuggestedReplacement,
				newSuggestedReplacement));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BallotCommentResolution> getResolution() {
		if (resolution == null) {
			resolution = new EObjectContainmentEList<BallotCommentResolution>(
				BallotCommentResolution.class, this, Mif2Package.BALLOT_COMMENT__RESOLUTION);
		}
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoteKind getCommentType() {
		return commentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentType(VoteKind newCommentType) {
		VoteKind oldCommentType = commentType;
		commentType = newCommentType == null
				? COMMENT_TYPE_EDEFAULT
				: newCommentType;
		boolean oldCommentTypeESet = commentTypeESet;
		commentTypeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT__COMMENT_TYPE, oldCommentType, commentType,
				!oldCommentTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCommentType() {
		VoteKind oldCommentType = commentType;
		boolean oldCommentTypeESet = commentTypeESet;
		commentType = COMMENT_TYPE_EDEFAULT;
		commentTypeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.BALLOT_COMMENT__COMMENT_TYPE, oldCommentType,
				COMMENT_TYPE_EDEFAULT, oldCommentTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCommentType() {
		return commentTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getImplementedDate() {
		return implementedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementedDate(XMLGregorianCalendar newImplementedDate) {
		XMLGregorianCalendar oldImplementedDate = implementedDate;
		implementedDate = newImplementedDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT__IMPLEMENTED_DATE, oldImplementedDate,
				implementedDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementingPersonName() {
		return implementingPersonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementingPersonName(String newImplementingPersonName) {
		String oldImplementingPersonName = implementingPersonName;
		implementingPersonName = newImplementingPersonName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT__IMPLEMENTING_PERSON_NAME,
				oldImplementingPersonName, implementingPersonName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT__LOCATION, oldLocation, location));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(BigInteger newName) {
		BigInteger oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BALLOT_COMMENT__NAME, oldName, name));
		}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BALLOT_COMMENT__SUBMISSION_ID, oldSubmissionId, submissionId));
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
			case Mif2Package.BALLOT_COMMENT__CONTEXT:
				return ((InternalEList<?>) getContext()).basicRemove(otherEnd, msgs);
			case Mif2Package.BALLOT_COMMENT__REALM_NAMESPACE:
				return ((InternalEList<?>) getRealmNamespace()).basicRemove(otherEnd, msgs);
			case Mif2Package.BALLOT_COMMENT__EXISTING_CONTENT:
				return basicSetExistingContent(null, msgs);
			case Mif2Package.BALLOT_COMMENT__SUGGESTED_REPLACEMENT:
				return basicSetSuggestedReplacement(null, msgs);
			case Mif2Package.BALLOT_COMMENT__RESOLUTION:
				return ((InternalEList<?>) getResolution()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.BALLOT_COMMENT__CONTEXT:
				if (coreType) {
					return getContext();
				}
				return ((FeatureMap.Internal) getContext()).getWrapper();
			case Mif2Package.BALLOT_COMMENT__REALM_NAMESPACE:
				return getRealmNamespace();
			case Mif2Package.BALLOT_COMMENT__EXISTING_CONTENT:
				return getExistingContent();
			case Mif2Package.BALLOT_COMMENT__SUGGESTED_REPLACEMENT:
				return getSuggestedReplacement();
			case Mif2Package.BALLOT_COMMENT__RESOLUTION:
				return getResolution();
			case Mif2Package.BALLOT_COMMENT__COMMENT_TYPE:
				return getCommentType();
			case Mif2Package.BALLOT_COMMENT__IMPLEMENTED_DATE:
				return getImplementedDate();
			case Mif2Package.BALLOT_COMMENT__IMPLEMENTING_PERSON_NAME:
				return getImplementingPersonName();
			case Mif2Package.BALLOT_COMMENT__LOCATION:
				return getLocation();
			case Mif2Package.BALLOT_COMMENT__NAME:
				return getName();
			case Mif2Package.BALLOT_COMMENT__SUBMISSION_ID:
				return getSubmissionId();
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
			case Mif2Package.BALLOT_COMMENT__CONTEXT:
				((FeatureMap.Internal) getContext()).set(newValue);
				return;
			case Mif2Package.BALLOT_COMMENT__REALM_NAMESPACE:
				getRealmNamespace().clear();
				getRealmNamespace().addAll((Collection<? extends RealmElement>) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT__EXISTING_CONTENT:
				setExistingContent((Flow) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT__SUGGESTED_REPLACEMENT:
				setSuggestedReplacement((Flow) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT__RESOLUTION:
				getResolution().clear();
				getResolution().addAll((Collection<? extends BallotCommentResolution>) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT__COMMENT_TYPE:
				setCommentType((VoteKind) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT__IMPLEMENTED_DATE:
				setImplementedDate((XMLGregorianCalendar) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT__IMPLEMENTING_PERSON_NAME:
				setImplementingPersonName((String) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT__LOCATION:
				setLocation((String) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT__NAME:
				setName((BigInteger) newValue);
				return;
			case Mif2Package.BALLOT_COMMENT__SUBMISSION_ID:
				setSubmissionId((String) newValue);
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
			case Mif2Package.BALLOT_COMMENT__CONTEXT:
				getContext().clear();
				return;
			case Mif2Package.BALLOT_COMMENT__REALM_NAMESPACE:
				getRealmNamespace().clear();
				return;
			case Mif2Package.BALLOT_COMMENT__EXISTING_CONTENT:
				setExistingContent((Flow) null);
				return;
			case Mif2Package.BALLOT_COMMENT__SUGGESTED_REPLACEMENT:
				setSuggestedReplacement((Flow) null);
				return;
			case Mif2Package.BALLOT_COMMENT__RESOLUTION:
				getResolution().clear();
				return;
			case Mif2Package.BALLOT_COMMENT__COMMENT_TYPE:
				unsetCommentType();
				return;
			case Mif2Package.BALLOT_COMMENT__IMPLEMENTED_DATE:
				setImplementedDate(IMPLEMENTED_DATE_EDEFAULT);
				return;
			case Mif2Package.BALLOT_COMMENT__IMPLEMENTING_PERSON_NAME:
				setImplementingPersonName(IMPLEMENTING_PERSON_NAME_EDEFAULT);
				return;
			case Mif2Package.BALLOT_COMMENT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case Mif2Package.BALLOT_COMMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.BALLOT_COMMENT__SUBMISSION_ID:
				setSubmissionId(SUBMISSION_ID_EDEFAULT);
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
			case Mif2Package.BALLOT_COMMENT__CONTEXT:
				return context != null && !context.isEmpty();
			case Mif2Package.BALLOT_COMMENT__REALM_NAMESPACE:
				return !getRealmNamespace().isEmpty();
			case Mif2Package.BALLOT_COMMENT__EXISTING_CONTENT:
				return existingContent != null;
			case Mif2Package.BALLOT_COMMENT__SUGGESTED_REPLACEMENT:
				return suggestedReplacement != null;
			case Mif2Package.BALLOT_COMMENT__RESOLUTION:
				return resolution != null && !resolution.isEmpty();
			case Mif2Package.BALLOT_COMMENT__COMMENT_TYPE:
				return isSetCommentType();
			case Mif2Package.BALLOT_COMMENT__IMPLEMENTED_DATE:
				return IMPLEMENTED_DATE_EDEFAULT == null
						? implementedDate != null
						: !IMPLEMENTED_DATE_EDEFAULT.equals(implementedDate);
			case Mif2Package.BALLOT_COMMENT__IMPLEMENTING_PERSON_NAME:
				return IMPLEMENTING_PERSON_NAME_EDEFAULT == null
						? implementingPersonName != null
						: !IMPLEMENTING_PERSON_NAME_EDEFAULT.equals(implementingPersonName);
			case Mif2Package.BALLOT_COMMENT__LOCATION:
				return LOCATION_EDEFAULT == null
						? location != null
						: !LOCATION_EDEFAULT.equals(location);
			case Mif2Package.BALLOT_COMMENT__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case Mif2Package.BALLOT_COMMENT__SUBMISSION_ID:
				return SUBMISSION_ID_EDEFAULT == null
						? submissionId != null
						: !SUBMISSION_ID_EDEFAULT.equals(submissionId);
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
		result.append(" (context: ");
		result.append(context);
		result.append(", commentType: ");
		if (commentTypeESet) {
			result.append(commentType);
		} else {
			result.append("<unset>");
		}
		result.append(", implementedDate: ");
		result.append(implementedDate);
		result.append(", implementingPersonName: ");
		result.append(implementingPersonName);
		result.append(", location: ");
		result.append(location);
		result.append(", name: ");
		result.append(name);
		result.append(", submissionId: ");
		result.append(submissionId);
		result.append(')');
		return result.toString();
	}

} // BallotCommentImpl
