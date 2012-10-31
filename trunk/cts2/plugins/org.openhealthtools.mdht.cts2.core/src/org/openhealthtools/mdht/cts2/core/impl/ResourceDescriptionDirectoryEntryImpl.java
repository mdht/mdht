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
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.EntryDescription;
import org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Description Directory Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionDirectoryEntryImpl#getResourceSynopsis <em>Resource Synopsis</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionDirectoryEntryImpl#getAbout <em>About</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionDirectoryEntryImpl#getFormalName <em>Formal Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ResourceDescriptionDirectoryEntryImpl extends DirectoryEntryImpl implements
		ResourceDescriptionDirectoryEntry {
	/**
	 * The cached value of the '{@link #getResourceSynopsis() <em>Resource Synopsis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResourceSynopsis()
	 * @generated
	 * @ordered
	 */
	protected EntryDescription resourceSynopsis;

	/**
	 * The default value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected String about = ABOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormalName() <em>Formal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFormalName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormalName() <em>Formal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFormalName()
	 * @generated
	 * @ordered
	 */
	protected String formalName = FORMAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResourceDescriptionDirectoryEntryImpl() {
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
		return CorePackage.Literals.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntryDescription getResourceSynopsis() {
		return resourceSynopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResourceSynopsis(EntryDescription newResourceSynopsis, NotificationChain msgs) {
		EntryDescription oldResourceSynopsis = resourceSynopsis;
		resourceSynopsis = newResourceSynopsis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS,
				oldResourceSynopsis, newResourceSynopsis);
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
	public void setResourceSynopsis(EntryDescription newResourceSynopsis) {
		if (newResourceSynopsis != resourceSynopsis) {
			NotificationChain msgs = null;
			if (resourceSynopsis != null) {
				msgs = ((InternalEObject) resourceSynopsis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS, null, msgs);
			}
			if (newResourceSynopsis != null) {
				msgs = ((InternalEObject) newResourceSynopsis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS, null, msgs);
			}
			msgs = basicSetResourceSynopsis(newResourceSynopsis, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS,
				newResourceSynopsis, newResourceSynopsis));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAbout(String newAbout) {
		String oldAbout = about;
		about = newAbout;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT, oldAbout, about));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFormalName() {
		return formalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFormalName(String newFormalName) {
		String oldFormalName = formalName;
		formalName = newFormalName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME, oldFormalName,
				formalName));
		}
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
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS:
				return basicSetResourceSynopsis(null, msgs);
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
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS:
				return getResourceSynopsis();
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT:
				return getAbout();
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME:
				return getFormalName();
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
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS:
				setResourceSynopsis((EntryDescription) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT:
				setAbout((String) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME:
				setFormalName((String) newValue);
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
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS:
				setResourceSynopsis((EntryDescription) null);
				return;
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME:
				setFormalName(FORMAL_NAME_EDEFAULT);
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
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS:
				return resourceSynopsis != null;
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT:
				return ABOUT_EDEFAULT == null
						? about != null
						: !ABOUT_EDEFAULT.equals(about);
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME:
				return FORMAL_NAME_EDEFAULT == null
						? formalName != null
						: !FORMAL_NAME_EDEFAULT.equals(formalName);
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
		result.append(" (about: ");
		result.append(about);
		result.append(", formalName: ");
		result.append(formalName);
		result.append(')');
		return result.toString();
	}

} // ResourceDescriptionDirectoryEntryImpl
