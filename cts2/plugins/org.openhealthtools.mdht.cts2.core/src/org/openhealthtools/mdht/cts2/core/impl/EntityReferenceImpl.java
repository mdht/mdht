/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

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
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem;
import org.openhealthtools.mdht.cts2.core.EntityReference;
import org.openhealthtools.mdht.cts2.core.ScopedEntityName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.EntityReferenceImpl#getName <em>Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.EntityReferenceImpl#getKnownEntityDescription <em>Known Entity Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.EntityReferenceImpl#getAbout <em>About</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EntityReferenceImpl extends EObjectImpl implements EntityReference {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected ScopedEntityName name;

	/**
	 * The cached value of the '{@link #getKnownEntityDescription() <em>Known Entity Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getKnownEntityDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionInCodeSystem> knownEntityDescription;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EntityReferenceImpl() {
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
		return CorePackage.Literals.ENTITY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScopedEntityName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetName(ScopedEntityName newName, NotificationChain msgs) {
		ScopedEntityName oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.ENTITY_REFERENCE__NAME, oldName, newName);
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
	public void setName(ScopedEntityName newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null) {
				msgs = ((InternalEObject) name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ENTITY_REFERENCE__NAME, null, msgs);
			}
			if (newName != null) {
				msgs = ((InternalEObject) newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ENTITY_REFERENCE__NAME, null, msgs);
			}
			msgs = basicSetName(newName, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_REFERENCE__NAME, newName, newName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DescriptionInCodeSystem> getKnownEntityDescription() {
		if (knownEntityDescription == null) {
			knownEntityDescription = new EObjectContainmentEList<DescriptionInCodeSystem>(
				DescriptionInCodeSystem.class, this, CorePackage.ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION);
		}
		return knownEntityDescription;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_REFERENCE__ABOUT, oldAbout, about));
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
			case CorePackage.ENTITY_REFERENCE__NAME:
				return basicSetName(null, msgs);
			case CorePackage.ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION:
				return ((InternalEList<?>) getKnownEntityDescription()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ENTITY_REFERENCE__NAME:
				return getName();
			case CorePackage.ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION:
				return getKnownEntityDescription();
			case CorePackage.ENTITY_REFERENCE__ABOUT:
				return getAbout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.ENTITY_REFERENCE__NAME:
				setName((ScopedEntityName) newValue);
				return;
			case CorePackage.ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION:
				getKnownEntityDescription().clear();
				getKnownEntityDescription().addAll((Collection<? extends DescriptionInCodeSystem>) newValue);
				return;
			case CorePackage.ENTITY_REFERENCE__ABOUT:
				setAbout((String) newValue);
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
			case CorePackage.ENTITY_REFERENCE__NAME:
				setName((ScopedEntityName) null);
				return;
			case CorePackage.ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION:
				getKnownEntityDescription().clear();
				return;
			case CorePackage.ENTITY_REFERENCE__ABOUT:
				setAbout(ABOUT_EDEFAULT);
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
			case CorePackage.ENTITY_REFERENCE__NAME:
				return name != null;
			case CorePackage.ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION:
				return knownEntityDescription != null && !knownEntityDescription.isEmpty();
			case CorePackage.ENTITY_REFERENCE__ABOUT:
				return ABOUT_EDEFAULT == null
						? about != null
						: !ABOUT_EDEFAULT.equals(about);
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
		result.append(')');
		return result.toString();
	}

} // EntityReferenceImpl
