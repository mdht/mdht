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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRole;
import org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.RelatedAppRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApplicationRoleImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApplicationRoleImpl#getRelatedApplicationRoles <em>Related Application Roles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApplicationRoleImpl#getSendsInteractions <em>Sends Interactions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApplicationRoleImpl#getReceivesInteractions <em>Receives Interactions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApplicationRoleImpl#getCreatesDocuments <em>Creates Documents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ApplicationRoleImpl#getConsumesDocuments <em>Consumes Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationRoleImpl extends PackageArtifactImpl implements ApplicationRole {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected ApplicationRoleAnnotations annotations;

	/**
	 * The cached value of the '{@link #getRelatedApplicationRoles() <em>Related Application Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedApplicationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedAppRole> relatedApplicationRoles;

	/**
	 * The cached value of the '{@link #getSendsInteractions() <em>Sends Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> sendsInteractions;

	/**
	 * The cached value of the '{@link #getReceivesInteractions() <em>Receives Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivesInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> receivesInteractions;

	/**
	 * The cached value of the '{@link #getCreatesDocuments() <em>Creates Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatesDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> createsDocuments;

	/**
	 * The cached value of the '{@link #getConsumesDocuments() <em>Consumes Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumesDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> consumesDocuments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.APPLICATION_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRoleAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(ApplicationRoleAnnotations newAnnotations, NotificationChain msgs) {
		ApplicationRoleAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.APPLICATION_ROLE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
	public void setAnnotations(ApplicationRoleAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.APPLICATION_ROLE__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.APPLICATION_ROLE__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.APPLICATION_ROLE__ANNOTATIONS, newAnnotations, newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedAppRole> getRelatedApplicationRoles() {
		if (relatedApplicationRoles == null) {
			relatedApplicationRoles = new EObjectContainmentEList<RelatedAppRole>(
				RelatedAppRole.class, this, Mif2Package.APPLICATION_ROLE__RELATED_APPLICATION_ROLES);
		}
		return relatedApplicationRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getSendsInteractions() {
		if (sendsInteractions == null) {
			sendsInteractions = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.APPLICATION_ROLE__SENDS_INTERACTIONS);
		}
		return sendsInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getReceivesInteractions() {
		if (receivesInteractions == null) {
			receivesInteractions = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.APPLICATION_ROLE__RECEIVES_INTERACTIONS);
		}
		return receivesInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getCreatesDocuments() {
		if (createsDocuments == null) {
			createsDocuments = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.APPLICATION_ROLE__CREATES_DOCUMENTS);
		}
		return createsDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getConsumesDocuments() {
		if (consumesDocuments == null) {
			consumesDocuments = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.APPLICATION_ROLE__CONSUMES_DOCUMENTS);
		}
		return consumesDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.APPLICATION_ROLE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.APPLICATION_ROLE__RELATED_APPLICATION_ROLES:
				return ((InternalEList<?>) getRelatedApplicationRoles()).basicRemove(otherEnd, msgs);
			case Mif2Package.APPLICATION_ROLE__SENDS_INTERACTIONS:
				return ((InternalEList<?>) getSendsInteractions()).basicRemove(otherEnd, msgs);
			case Mif2Package.APPLICATION_ROLE__RECEIVES_INTERACTIONS:
				return ((InternalEList<?>) getReceivesInteractions()).basicRemove(otherEnd, msgs);
			case Mif2Package.APPLICATION_ROLE__CREATES_DOCUMENTS:
				return ((InternalEList<?>) getCreatesDocuments()).basicRemove(otherEnd, msgs);
			case Mif2Package.APPLICATION_ROLE__CONSUMES_DOCUMENTS:
				return ((InternalEList<?>) getConsumesDocuments()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.APPLICATION_ROLE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.APPLICATION_ROLE__RELATED_APPLICATION_ROLES:
				return getRelatedApplicationRoles();
			case Mif2Package.APPLICATION_ROLE__SENDS_INTERACTIONS:
				return getSendsInteractions();
			case Mif2Package.APPLICATION_ROLE__RECEIVES_INTERACTIONS:
				return getReceivesInteractions();
			case Mif2Package.APPLICATION_ROLE__CREATES_DOCUMENTS:
				return getCreatesDocuments();
			case Mif2Package.APPLICATION_ROLE__CONSUMES_DOCUMENTS:
				return getConsumesDocuments();
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
			case Mif2Package.APPLICATION_ROLE__ANNOTATIONS:
				setAnnotations((ApplicationRoleAnnotations) newValue);
				return;
			case Mif2Package.APPLICATION_ROLE__RELATED_APPLICATION_ROLES:
				getRelatedApplicationRoles().clear();
				getRelatedApplicationRoles().addAll((Collection<? extends RelatedAppRole>) newValue);
				return;
			case Mif2Package.APPLICATION_ROLE__SENDS_INTERACTIONS:
				getSendsInteractions().clear();
				getSendsInteractions().addAll((Collection<? extends PackageRef>) newValue);
				return;
			case Mif2Package.APPLICATION_ROLE__RECEIVES_INTERACTIONS:
				getReceivesInteractions().clear();
				getReceivesInteractions().addAll((Collection<? extends PackageRef>) newValue);
				return;
			case Mif2Package.APPLICATION_ROLE__CREATES_DOCUMENTS:
				getCreatesDocuments().clear();
				getCreatesDocuments().addAll((Collection<? extends PackageRef>) newValue);
				return;
			case Mif2Package.APPLICATION_ROLE__CONSUMES_DOCUMENTS:
				getConsumesDocuments().clear();
				getConsumesDocuments().addAll((Collection<? extends PackageRef>) newValue);
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
			case Mif2Package.APPLICATION_ROLE__ANNOTATIONS:
				setAnnotations((ApplicationRoleAnnotations) null);
				return;
			case Mif2Package.APPLICATION_ROLE__RELATED_APPLICATION_ROLES:
				getRelatedApplicationRoles().clear();
				return;
			case Mif2Package.APPLICATION_ROLE__SENDS_INTERACTIONS:
				getSendsInteractions().clear();
				return;
			case Mif2Package.APPLICATION_ROLE__RECEIVES_INTERACTIONS:
				getReceivesInteractions().clear();
				return;
			case Mif2Package.APPLICATION_ROLE__CREATES_DOCUMENTS:
				getCreatesDocuments().clear();
				return;
			case Mif2Package.APPLICATION_ROLE__CONSUMES_DOCUMENTS:
				getConsumesDocuments().clear();
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
			case Mif2Package.APPLICATION_ROLE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.APPLICATION_ROLE__RELATED_APPLICATION_ROLES:
				return relatedApplicationRoles != null && !relatedApplicationRoles.isEmpty();
			case Mif2Package.APPLICATION_ROLE__SENDS_INTERACTIONS:
				return sendsInteractions != null && !sendsInteractions.isEmpty();
			case Mif2Package.APPLICATION_ROLE__RECEIVES_INTERACTIONS:
				return receivesInteractions != null && !receivesInteractions.isEmpty();
			case Mif2Package.APPLICATION_ROLE__CREATES_DOCUMENTS:
				return createsDocuments != null && !createsDocuments.isEmpty();
			case Mif2Package.APPLICATION_ROLE__CONSUMES_DOCUMENTS:
				return consumesDocuments != null && !consumesDocuments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ApplicationRoleImpl
