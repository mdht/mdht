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

import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile;
import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents;
import org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile;
import org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints;
import org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Storyboard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileImpl#getStoryboards <em>Storyboards</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileImpl#getImplementationConstraints <em>Implementation Constraints</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileImpl#getSupportedApplicationRoles <em>Supported Application Roles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileImpl#getSupportedTriggerEvents <em>Supported Trigger Events</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileImpl#getSupportedAppRoleInteractions <em>Supported App Role Interactions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileImpl#getUnsupportedAppRoleInteractions <em>Unsupported App Role Interactions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileImpl#getExtraInteractions <em>Extra Interactions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileImpl#getSupportedAppRoleDocuments <em>Supported App Role Documents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileImpl#getUnsupportedAppRoleDocuments <em>Unsupported App Role Documents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileImpl#getExtraDocuments <em>Extra Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConformanceProfileImpl extends PackageImpl implements ConformanceProfile {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected ConformanceProfileAnnotations annotations;

	/**
	 * The cached value of the '{@link #getStoryboards() <em>Storyboards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoryboards()
	 * @generated
	 * @ordered
	 */
	protected EList<Storyboard> storyboards;

	/**
	 * The cached value of the '{@link #getImplementationConstraints() <em>Implementation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationConstraints()
	 * @generated
	 * @ordered
	 */
	protected ImplementationMessageConstraints implementationConstraints;

	/**
	 * The cached value of the '{@link #getSupportedApplicationRoles() <em>Supported Application Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedApplicationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> supportedApplicationRoles;

	/**
	 * The cached value of the '{@link #getSupportedTriggerEvents() <em>Supported Trigger Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedTriggerEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceTriggerEvents> supportedTriggerEvents;

	/**
	 * The cached value of the '{@link #getSupportedAppRoleInteractions() <em>Supported App Role Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAppRoleInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionProfile> supportedAppRoleInteractions;

	/**
	 * The cached value of the '{@link #getUnsupportedAppRoleInteractions() <em>Unsupported App Role Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsupportedAppRoleInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> unsupportedAppRoleInteractions;

	/**
	 * The cached value of the '{@link #getExtraInteractions() <em>Extra Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionProfile> extraInteractions;

	/**
	 * The cached value of the '{@link #getSupportedAppRoleDocuments() <em>Supported App Role Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAppRoleDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentProfile> supportedAppRoleDocuments;

	/**
	 * The cached value of the '{@link #getUnsupportedAppRoleDocuments() <em>Unsupported App Role Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsupportedAppRoleDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> unsupportedAppRoleDocuments;

	/**
	 * The cached value of the '{@link #getExtraDocuments() <em>Extra Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentProfile> extraDocuments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONFORMANCE_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceProfileAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(ConformanceProfileAnnotations newAnnotations, NotificationChain msgs) {
		ConformanceProfileAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONFORMANCE_PROFILE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
	public void setAnnotations(ConformanceProfileAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CONFORMANCE_PROFILE__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CONFORMANCE_PROFILE__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONFORMANCE_PROFILE__ANNOTATIONS, newAnnotations, newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Storyboard> getStoryboards() {
		if (storyboards == null) {
			storyboards = new EObjectContainmentEList<Storyboard>(
				Storyboard.class, this, Mif2Package.CONFORMANCE_PROFILE__STORYBOARDS);
		}
		return storyboards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationMessageConstraints getImplementationConstraints() {
		return implementationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationConstraints(
			ImplementationMessageConstraints newImplementationConstraints, NotificationChain msgs) {
		ImplementationMessageConstraints oldImplementationConstraints = implementationConstraints;
		implementationConstraints = newImplementationConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONFORMANCE_PROFILE__IMPLEMENTATION_CONSTRAINTS,
				oldImplementationConstraints, newImplementationConstraints);
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
	public void setImplementationConstraints(ImplementationMessageConstraints newImplementationConstraints) {
		if (newImplementationConstraints != implementationConstraints) {
			NotificationChain msgs = null;
			if (implementationConstraints != null) {
				msgs = ((InternalEObject) implementationConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CONFORMANCE_PROFILE__IMPLEMENTATION_CONSTRAINTS, null, msgs);
			}
			if (newImplementationConstraints != null) {
				msgs = ((InternalEObject) newImplementationConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CONFORMANCE_PROFILE__IMPLEMENTATION_CONSTRAINTS, null, msgs);
			}
			msgs = basicSetImplementationConstraints(newImplementationConstraints, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONFORMANCE_PROFILE__IMPLEMENTATION_CONSTRAINTS,
				newImplementationConstraints, newImplementationConstraints));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getSupportedApplicationRoles() {
		if (supportedApplicationRoles == null) {
			supportedApplicationRoles = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APPLICATION_ROLES);
		}
		return supportedApplicationRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceTriggerEvents> getSupportedTriggerEvents() {
		if (supportedTriggerEvents == null) {
			supportedTriggerEvents = new EObjectContainmentEList<ConformanceTriggerEvents>(
				ConformanceTriggerEvents.class, this, Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_TRIGGER_EVENTS);
		}
		return supportedTriggerEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionProfile> getSupportedAppRoleInteractions() {
		if (supportedAppRoleInteractions == null) {
			supportedAppRoleInteractions = new EObjectContainmentEList<InteractionProfile>(
				InteractionProfile.class, this, Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_INTERACTIONS);
		}
		return supportedAppRoleInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getUnsupportedAppRoleInteractions() {
		if (unsupportedAppRoleInteractions == null) {
			unsupportedAppRoleInteractions = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_INTERACTIONS);
		}
		return unsupportedAppRoleInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionProfile> getExtraInteractions() {
		if (extraInteractions == null) {
			extraInteractions = new EObjectContainmentEList<InteractionProfile>(
				InteractionProfile.class, this, Mif2Package.CONFORMANCE_PROFILE__EXTRA_INTERACTIONS);
		}
		return extraInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentProfile> getSupportedAppRoleDocuments() {
		if (supportedAppRoleDocuments == null) {
			supportedAppRoleDocuments = new EObjectContainmentEList<DocumentProfile>(
				DocumentProfile.class, this, Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_DOCUMENTS);
		}
		return supportedAppRoleDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getUnsupportedAppRoleDocuments() {
		if (unsupportedAppRoleDocuments == null) {
			unsupportedAppRoleDocuments = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_DOCUMENTS);
		}
		return unsupportedAppRoleDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentProfile> getExtraDocuments() {
		if (extraDocuments == null) {
			extraDocuments = new EObjectContainmentEList<DocumentProfile>(
				DocumentProfile.class, this, Mif2Package.CONFORMANCE_PROFILE__EXTRA_DOCUMENTS);
		}
		return extraDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CONFORMANCE_PROFILE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.CONFORMANCE_PROFILE__STORYBOARDS:
				return ((InternalEList<?>) getStoryboards()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONFORMANCE_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				return basicSetImplementationConstraints(null, msgs);
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APPLICATION_ROLES:
				return ((InternalEList<?>) getSupportedApplicationRoles()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_TRIGGER_EVENTS:
				return ((InternalEList<?>) getSupportedTriggerEvents()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_INTERACTIONS:
				return ((InternalEList<?>) getSupportedAppRoleInteractions()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_INTERACTIONS:
				return ((InternalEList<?>) getUnsupportedAppRoleInteractions()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONFORMANCE_PROFILE__EXTRA_INTERACTIONS:
				return ((InternalEList<?>) getExtraInteractions()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_DOCUMENTS:
				return ((InternalEList<?>) getSupportedAppRoleDocuments()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_DOCUMENTS:
				return ((InternalEList<?>) getUnsupportedAppRoleDocuments()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONFORMANCE_PROFILE__EXTRA_DOCUMENTS:
				return ((InternalEList<?>) getExtraDocuments()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CONFORMANCE_PROFILE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.CONFORMANCE_PROFILE__STORYBOARDS:
				return getStoryboards();
			case Mif2Package.CONFORMANCE_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				return getImplementationConstraints();
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APPLICATION_ROLES:
				return getSupportedApplicationRoles();
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_TRIGGER_EVENTS:
				return getSupportedTriggerEvents();
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_INTERACTIONS:
				return getSupportedAppRoleInteractions();
			case Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_INTERACTIONS:
				return getUnsupportedAppRoleInteractions();
			case Mif2Package.CONFORMANCE_PROFILE__EXTRA_INTERACTIONS:
				return getExtraInteractions();
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_DOCUMENTS:
				return getSupportedAppRoleDocuments();
			case Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_DOCUMENTS:
				return getUnsupportedAppRoleDocuments();
			case Mif2Package.CONFORMANCE_PROFILE__EXTRA_DOCUMENTS:
				return getExtraDocuments();
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
			case Mif2Package.CONFORMANCE_PROFILE__ANNOTATIONS:
				setAnnotations((ConformanceProfileAnnotations) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__STORYBOARDS:
				getStoryboards().clear();
				getStoryboards().addAll((Collection<? extends Storyboard>) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				setImplementationConstraints((ImplementationMessageConstraints) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APPLICATION_ROLES:
				getSupportedApplicationRoles().clear();
				getSupportedApplicationRoles().addAll((Collection<? extends PackageRef>) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_TRIGGER_EVENTS:
				getSupportedTriggerEvents().clear();
				getSupportedTriggerEvents().addAll((Collection<? extends ConformanceTriggerEvents>) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_INTERACTIONS:
				getSupportedAppRoleInteractions().clear();
				getSupportedAppRoleInteractions().addAll((Collection<? extends InteractionProfile>) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_INTERACTIONS:
				getUnsupportedAppRoleInteractions().clear();
				getUnsupportedAppRoleInteractions().addAll((Collection<? extends PackageRef>) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__EXTRA_INTERACTIONS:
				getExtraInteractions().clear();
				getExtraInteractions().addAll((Collection<? extends InteractionProfile>) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_DOCUMENTS:
				getSupportedAppRoleDocuments().clear();
				getSupportedAppRoleDocuments().addAll((Collection<? extends DocumentProfile>) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_DOCUMENTS:
				getUnsupportedAppRoleDocuments().clear();
				getUnsupportedAppRoleDocuments().addAll((Collection<? extends PackageRef>) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__EXTRA_DOCUMENTS:
				getExtraDocuments().clear();
				getExtraDocuments().addAll((Collection<? extends DocumentProfile>) newValue);
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
			case Mif2Package.CONFORMANCE_PROFILE__ANNOTATIONS:
				setAnnotations((ConformanceProfileAnnotations) null);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__STORYBOARDS:
				getStoryboards().clear();
				return;
			case Mif2Package.CONFORMANCE_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				setImplementationConstraints((ImplementationMessageConstraints) null);
				return;
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APPLICATION_ROLES:
				getSupportedApplicationRoles().clear();
				return;
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_TRIGGER_EVENTS:
				getSupportedTriggerEvents().clear();
				return;
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_INTERACTIONS:
				getSupportedAppRoleInteractions().clear();
				return;
			case Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_INTERACTIONS:
				getUnsupportedAppRoleInteractions().clear();
				return;
			case Mif2Package.CONFORMANCE_PROFILE__EXTRA_INTERACTIONS:
				getExtraInteractions().clear();
				return;
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_DOCUMENTS:
				getSupportedAppRoleDocuments().clear();
				return;
			case Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_DOCUMENTS:
				getUnsupportedAppRoleDocuments().clear();
				return;
			case Mif2Package.CONFORMANCE_PROFILE__EXTRA_DOCUMENTS:
				getExtraDocuments().clear();
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
			case Mif2Package.CONFORMANCE_PROFILE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.CONFORMANCE_PROFILE__STORYBOARDS:
				return storyboards != null && !storyboards.isEmpty();
			case Mif2Package.CONFORMANCE_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				return implementationConstraints != null;
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APPLICATION_ROLES:
				return supportedApplicationRoles != null && !supportedApplicationRoles.isEmpty();
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_TRIGGER_EVENTS:
				return supportedTriggerEvents != null && !supportedTriggerEvents.isEmpty();
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_INTERACTIONS:
				return supportedAppRoleInteractions != null && !supportedAppRoleInteractions.isEmpty();
			case Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_INTERACTIONS:
				return unsupportedAppRoleInteractions != null && !unsupportedAppRoleInteractions.isEmpty();
			case Mif2Package.CONFORMANCE_PROFILE__EXTRA_INTERACTIONS:
				return extraInteractions != null && !extraInteractions.isEmpty();
			case Mif2Package.CONFORMANCE_PROFILE__SUPPORTED_APP_ROLE_DOCUMENTS:
				return supportedAppRoleDocuments != null && !supportedAppRoleDocuments.isEmpty();
			case Mif2Package.CONFORMANCE_PROFILE__UNSUPPORTED_APP_ROLE_DOCUMENTS:
				return unsupportedAppRoleDocuments != null && !unsupportedAppRoleDocuments.isEmpty();
			case Mif2Package.CONFORMANCE_PROFILE__EXTRA_DOCUMENTS:
				return extraDocuments != null && !extraDocuments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ConformanceProfileImpl
