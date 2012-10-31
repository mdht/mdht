/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.ChangeDescription;
import org.openhealthtools.mdht.cts2.core.Changeable;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.EntryState;
import org.openhealthtools.mdht.cts2.core.StatusReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Changeable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeableImpl#getStatus <em>Status</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeableImpl#getChangeDescription <em>Change Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeableImpl#getEntryState <em>Entry State</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ChangeableImpl extends EObjectImpl implements Changeable {
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
	protected ChangeableImpl() {
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
		return CorePackage.Literals.CHANGEABLE;
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
				this, Notification.SET, CorePackage.CHANGEABLE__STATUS, oldStatus, newStatus);
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
						CorePackage.CHANGEABLE__STATUS, null, msgs);
			}
			if (newStatus != null) {
				msgs = ((InternalEObject) newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGEABLE__STATUS, null, msgs);
			}
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CHANGEABLE__STATUS, newStatus, newStatus));
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
				this, Notification.SET, CorePackage.CHANGEABLE__CHANGE_DESCRIPTION, oldChangeDescription,
				newChangeDescription);
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
						CorePackage.CHANGEABLE__CHANGE_DESCRIPTION, null, msgs);
			}
			if (newChangeDescription != null) {
				msgs = ((InternalEObject) newChangeDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGEABLE__CHANGE_DESCRIPTION, null, msgs);
			}
			msgs = basicSetChangeDescription(newChangeDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGEABLE__CHANGE_DESCRIPTION, newChangeDescription,
				newChangeDescription));
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
				this, Notification.SET, CorePackage.CHANGEABLE__ENTRY_STATE, oldEntryState, entryState,
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
				this, Notification.UNSET, CorePackage.CHANGEABLE__ENTRY_STATE, oldEntryState, ENTRY_STATE_EDEFAULT,
				oldEntryStateESet));
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
			case CorePackage.CHANGEABLE__STATUS:
				return basicSetStatus(null, msgs);
			case CorePackage.CHANGEABLE__CHANGE_DESCRIPTION:
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
			case CorePackage.CHANGEABLE__STATUS:
				return getStatus();
			case CorePackage.CHANGEABLE__CHANGE_DESCRIPTION:
				return getChangeDescription();
			case CorePackage.CHANGEABLE__ENTRY_STATE:
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
			case CorePackage.CHANGEABLE__STATUS:
				setStatus((StatusReference) newValue);
				return;
			case CorePackage.CHANGEABLE__CHANGE_DESCRIPTION:
				setChangeDescription((ChangeDescription) newValue);
				return;
			case CorePackage.CHANGEABLE__ENTRY_STATE:
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
			case CorePackage.CHANGEABLE__STATUS:
				setStatus((StatusReference) null);
				return;
			case CorePackage.CHANGEABLE__CHANGE_DESCRIPTION:
				setChangeDescription((ChangeDescription) null);
				return;
			case CorePackage.CHANGEABLE__ENTRY_STATE:
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
			case CorePackage.CHANGEABLE__STATUS:
				return status != null;
			case CorePackage.CHANGEABLE__CHANGE_DESCRIPTION:
				return changeDescription != null;
			case CorePackage.CHANGEABLE__ENTRY_STATE:
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

} // ChangeableImpl
