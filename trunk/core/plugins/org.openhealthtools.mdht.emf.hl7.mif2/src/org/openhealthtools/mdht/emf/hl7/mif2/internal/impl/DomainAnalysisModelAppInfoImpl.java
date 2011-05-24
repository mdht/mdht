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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.BallotComment;
import org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest;
import org.openhealthtools.mdht.emf.hl7.mif2.DeprecationInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModelAppInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint;
import org.openhealthtools.mdht.emf.hl7.mif2.Mapping;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticExample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Analysis Model App Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainAnalysisModelAppInfoImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainAnalysisModelAppInfoImpl#getFormalConstraint <em>Formal Constraint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainAnalysisModelAppInfoImpl#getStaticExample <em>Static Example</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainAnalysisModelAppInfoImpl#getBallotComment <em>Ballot Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainAnalysisModelAppInfoImpl#getChangeRequest <em>Change Request</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainAnalysisModelAppInfoImpl#getDeprecationInfo <em>Deprecation Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainAnalysisModelAppInfoImpl extends EObjectImpl implements DomainAnalysisModelAppInfo {
	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mapping;

	/**
	 * The cached value of the '{@link #getFormalConstraint() <em>Formal Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalConstraint> formalConstraint;

	/**
	 * The cached value of the '{@link #getStaticExample() <em>Static Example</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticExample()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticExample> staticExample;

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
	 * The cached value of the '{@link #getDeprecationInfo() <em>Deprecation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecationInfo()
	 * @generated
	 * @ordered
	 */
	protected DeprecationInfo deprecationInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainAnalysisModelAppInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DOMAIN_ANALYSIS_MODEL_APP_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMapping() {
		if (mapping == null) {
			mapping = new EObjectContainmentEList<Mapping>(
				Mapping.class, this, Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__MAPPING);
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalConstraint> getFormalConstraint() {
		if (formalConstraint == null) {
			formalConstraint = new EObjectContainmentEList<FormalConstraint>(
				FormalConstraint.class, this, Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__FORMAL_CONSTRAINT);
		}
		return formalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticExample> getStaticExample() {
		if (staticExample == null) {
			staticExample = new EObjectContainmentEList<StaticExample>(
				StaticExample.class, this, Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__STATIC_EXAMPLE);
		}
		return staticExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BallotComment> getBallotComment() {
		if (ballotComment == null) {
			ballotComment = new EObjectContainmentEList<BallotComment>(
				BallotComment.class, this, Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__BALLOT_COMMENT);
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
			changeRequest = new EObjectContainmentEList<ChangeRequest>(
				ChangeRequest.class, this, Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__CHANGE_REQUEST);
		}
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecationInfo getDeprecationInfo() {
		return deprecationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeprecationInfo(DeprecationInfo newDeprecationInfo, NotificationChain msgs) {
		DeprecationInfo oldDeprecationInfo = deprecationInfo;
		deprecationInfo = newDeprecationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__DEPRECATION_INFO,
				oldDeprecationInfo, newDeprecationInfo);
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
	public void setDeprecationInfo(DeprecationInfo newDeprecationInfo) {
		if (newDeprecationInfo != deprecationInfo) {
			NotificationChain msgs = null;
			if (deprecationInfo != null) {
				msgs = ((InternalEObject) deprecationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__DEPRECATION_INFO, null, msgs);
			}
			if (newDeprecationInfo != null) {
				msgs = ((InternalEObject) newDeprecationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__DEPRECATION_INFO, null, msgs);
			}
			msgs = basicSetDeprecationInfo(newDeprecationInfo, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__DEPRECATION_INFO,
				newDeprecationInfo, newDeprecationInfo));
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
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__MAPPING:
				return ((InternalEList<?>) getMapping()).basicRemove(otherEnd, msgs);
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__FORMAL_CONSTRAINT:
				return ((InternalEList<?>) getFormalConstraint()).basicRemove(otherEnd, msgs);
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__STATIC_EXAMPLE:
				return ((InternalEList<?>) getStaticExample()).basicRemove(otherEnd, msgs);
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__BALLOT_COMMENT:
				return ((InternalEList<?>) getBallotComment()).basicRemove(otherEnd, msgs);
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__CHANGE_REQUEST:
				return ((InternalEList<?>) getChangeRequest()).basicRemove(otherEnd, msgs);
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__DEPRECATION_INFO:
				return basicSetDeprecationInfo(null, msgs);
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
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__MAPPING:
				return getMapping();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__FORMAL_CONSTRAINT:
				return getFormalConstraint();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__STATIC_EXAMPLE:
				return getStaticExample();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__BALLOT_COMMENT:
				return getBallotComment();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__CHANGE_REQUEST:
				return getChangeRequest();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__DEPRECATION_INFO:
				return getDeprecationInfo();
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
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__MAPPING:
				getMapping().clear();
				getMapping().addAll((Collection<? extends Mapping>) newValue);
				return;
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__FORMAL_CONSTRAINT:
				getFormalConstraint().clear();
				getFormalConstraint().addAll((Collection<? extends FormalConstraint>) newValue);
				return;
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__STATIC_EXAMPLE:
				getStaticExample().clear();
				getStaticExample().addAll((Collection<? extends StaticExample>) newValue);
				return;
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__BALLOT_COMMENT:
				getBallotComment().clear();
				getBallotComment().addAll((Collection<? extends BallotComment>) newValue);
				return;
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__CHANGE_REQUEST:
				getChangeRequest().clear();
				getChangeRequest().addAll((Collection<? extends ChangeRequest>) newValue);
				return;
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__DEPRECATION_INFO:
				setDeprecationInfo((DeprecationInfo) newValue);
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
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__MAPPING:
				getMapping().clear();
				return;
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__FORMAL_CONSTRAINT:
				getFormalConstraint().clear();
				return;
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__STATIC_EXAMPLE:
				getStaticExample().clear();
				return;
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__BALLOT_COMMENT:
				getBallotComment().clear();
				return;
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__CHANGE_REQUEST:
				getChangeRequest().clear();
				return;
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__DEPRECATION_INFO:
				setDeprecationInfo((DeprecationInfo) null);
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
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__MAPPING:
				return mapping != null && !mapping.isEmpty();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__FORMAL_CONSTRAINT:
				return formalConstraint != null && !formalConstraint.isEmpty();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__STATIC_EXAMPLE:
				return staticExample != null && !staticExample.isEmpty();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__BALLOT_COMMENT:
				return ballotComment != null && !ballotComment.isEmpty();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__CHANGE_REQUEST:
				return changeRequest != null && !changeRequest.isEmpty();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO__DEPRECATION_INFO:
				return deprecationInfo != null;
		}
		return super.eIsSet(featureID);
	}

} // DomainAnalysisModelAppInfoImpl
