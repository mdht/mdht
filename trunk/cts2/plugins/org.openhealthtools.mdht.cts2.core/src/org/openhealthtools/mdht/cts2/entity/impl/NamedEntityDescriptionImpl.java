/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.entity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.ChangeDescription;
import org.openhealthtools.mdht.cts2.core.EntryState;
import org.openhealthtools.mdht.cts2.core.StatusReference;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.NamedEntityDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Entity Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.NamedEntityDescriptionImpl#getStatus <em>Status</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.NamedEntityDescriptionImpl#getChangeDescription <em>Change Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.NamedEntityDescriptionImpl#getEntryState <em>Entry State</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class NamedEntityDescriptionImpl extends EntityDescriptionBaseImpl implements NamedEntityDescription {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusReference status;

	/**
	 * The cached value of the '{@link #getChangeDescription() <em>Change Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChangeDescription()
	 * @generated
	 * @ordered
	 */
	protected ChangeDescription changeDescription;

	/**
	 * The default value of the '{@link #getEntryState() <em>Entry State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntryState()
	 * @generated
	 * @ordered
	 */
	protected static final EntryState ENTRY_STATE_EDEFAULT = EntryState.ACTIVE;

	/**
	 * The cached value of the '{@link #getEntryState() <em>Entry State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntryState()
	 * @generated
	 * @ordered
	 */
	protected EntryState entryState = ENTRY_STATE_EDEFAULT;

	/**
	 * This is true if the Entry State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean entryStateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NamedEntityDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.NAMED_ENTITY_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatusReference getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStatus(StatusReference newStatus, NotificationChain msgs) {
		StatusReference oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.NAMED_ENTITY_DESCRIPTION__STATUS, oldStatus, newStatus);
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
	 * 
	 * @generated
	 */
	public void setStatus(StatusReference newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null) {
				msgs = ((InternalEObject) status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.NAMED_ENTITY_DESCRIPTION__STATUS, null, msgs);
			}
			if (newStatus != null) {
				msgs = ((InternalEObject) newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.NAMED_ENTITY_DESCRIPTION__STATUS, null, msgs);
			}
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.NAMED_ENTITY_DESCRIPTION__STATUS, newStatus, newStatus));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeDescription getChangeDescription() {
		return changeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetChangeDescription(ChangeDescription newChangeDescription, NotificationChain msgs) {
		ChangeDescription oldChangeDescription = changeDescription;
		changeDescription = newChangeDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION,
				oldChangeDescription, newChangeDescription);
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
	 * 
	 * @generated
	 */
	public void setChangeDescription(ChangeDescription newChangeDescription) {
		if (newChangeDescription != changeDescription) {
			NotificationChain msgs = null;
			if (changeDescription != null) {
				msgs = ((InternalEObject) changeDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION, null, msgs);
			}
			if (newChangeDescription != null) {
				msgs = ((InternalEObject) newChangeDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION, null, msgs);
			}
			msgs = basicSetChangeDescription(newChangeDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION,
				newChangeDescription, newChangeDescription));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntryState getEntryState() {
		return entryState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntryState(EntryState newEntryState) {
		EntryState oldEntryState = entryState;
		entryState = newEntryState == null
				? ENTRY_STATE_EDEFAULT
				: newEntryState;
		boolean oldEntryStateESet = entryStateESet;
		entryStateESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.NAMED_ENTITY_DESCRIPTION__ENTRY_STATE, oldEntryState, entryState,
				!oldEntryStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetEntryState() {
		EntryState oldEntryState = entryState;
		boolean oldEntryStateESet = entryStateESet;
		entryState = ENTRY_STATE_EDEFAULT;
		entryStateESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, EntityPackage.NAMED_ENTITY_DESCRIPTION__ENTRY_STATE, oldEntryState,
				ENTRY_STATE_EDEFAULT, oldEntryStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetEntryState() {
		return entryStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__STATUS:
				return basicSetStatus(null, msgs);
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION:
				return basicSetChangeDescription(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__STATUS:
				return getStatus();
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION:
				return getChangeDescription();
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__ENTRY_STATE:
				return getEntryState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__STATUS:
				setStatus((StatusReference) newValue);
				return;
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION:
				setChangeDescription((ChangeDescription) newValue);
				return;
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__ENTRY_STATE:
				setEntryState((EntryState) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__STATUS:
				setStatus((StatusReference) null);
				return;
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION:
				setChangeDescription((ChangeDescription) null);
				return;
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__ENTRY_STATE:
				unsetEntryState();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__STATUS:
				return status != null;
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION:
				return changeDescription != null;
			case EntityPackage.NAMED_ENTITY_DESCRIPTION__ENTRY_STATE:
				return isSetEntryState();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (entryState: ");
		if (entryStateESet) {
			result.append(entryState);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // NamedEntityDescriptionImpl
