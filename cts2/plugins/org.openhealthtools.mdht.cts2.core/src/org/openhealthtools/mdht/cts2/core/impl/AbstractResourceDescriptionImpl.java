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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.AbstractResourceDescription;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.OpaqueData;
import org.openhealthtools.mdht.cts2.core.SourceAndNotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Resource Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionImpl#getReleaseDocumentation <em>Release Documentation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionImpl#getReleaseFormat <em>Release Format</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class AbstractResourceDescriptionImpl extends ResourceDescriptionImpl implements
		AbstractResourceDescription {
	/**
	 * The cached value of the '{@link #getReleaseDocumentation() <em>Release Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReleaseDocumentation()
	 * @generated
	 * @ordered
	 */
	protected OpaqueData releaseDocumentation;

	/**
	 * The cached value of the '{@link #getReleaseFormat() <em>Release Format</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReleaseFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceAndNotation> releaseFormat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AbstractResourceDescriptionImpl() {
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
		return CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OpaqueData getReleaseDocumentation() {
		return releaseDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetReleaseDocumentation(OpaqueData newReleaseDocumentation, NotificationChain msgs) {
		OpaqueData oldReleaseDocumentation = releaseDocumentation;
		releaseDocumentation = newReleaseDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION,
				oldReleaseDocumentation, newReleaseDocumentation);
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
	public void setReleaseDocumentation(OpaqueData newReleaseDocumentation) {
		if (newReleaseDocumentation != releaseDocumentation) {
			NotificationChain msgs = null;
			if (releaseDocumentation != null) {
				msgs = ((InternalEObject) releaseDocumentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION, null, msgs);
			}
			if (newReleaseDocumentation != null) {
				msgs = ((InternalEObject) newReleaseDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION, null, msgs);
			}
			msgs = basicSetReleaseDocumentation(newReleaseDocumentation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION,
				newReleaseDocumentation, newReleaseDocumentation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SourceAndNotation> getReleaseFormat() {
		if (releaseFormat == null) {
			releaseFormat = new EObjectContainmentEList<SourceAndNotation>(
				SourceAndNotation.class, this, CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT);
		}
		return releaseFormat;
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
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION:
				return basicSetReleaseDocumentation(null, msgs);
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT:
				return ((InternalEList<?>) getReleaseFormat()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION:
				return getReleaseDocumentation();
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT:
				return getReleaseFormat();
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
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION:
				setReleaseDocumentation((OpaqueData) newValue);
				return;
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT:
				getReleaseFormat().clear();
				getReleaseFormat().addAll((Collection<? extends SourceAndNotation>) newValue);
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
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION:
				setReleaseDocumentation((OpaqueData) null);
				return;
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT:
				getReleaseFormat().clear();
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
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION:
				return releaseDocumentation != null;
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT:
				return releaseFormat != null && !releaseFormat.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // AbstractResourceDescriptionImpl
