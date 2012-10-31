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
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.MapReference;
import org.openhealthtools.mdht.cts2.core.MapVersionReference;
import org.openhealthtools.mdht.cts2.core.NameAndMeaningReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Version Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.MapVersionReferenceImpl#getMapVersion <em>Map Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.MapVersionReferenceImpl#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MapVersionReferenceImpl extends EObjectImpl implements MapVersionReference {
	/**
	 * The cached value of the '{@link #getMapVersion() <em>Map Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMapVersion()
	 * @generated
	 * @ordered
	 */
	protected NameAndMeaningReference mapVersion;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected MapReference map;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MapVersionReferenceImpl() {
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
		return CorePackage.Literals.MAP_VERSION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NameAndMeaningReference getMapVersion() {
		return mapVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetMapVersion(NameAndMeaningReference newMapVersion, NotificationChain msgs) {
		NameAndMeaningReference oldMapVersion = mapVersion;
		mapVersion = newMapVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.MAP_VERSION_REFERENCE__MAP_VERSION, oldMapVersion, newMapVersion);
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
	public void setMapVersion(NameAndMeaningReference newMapVersion) {
		if (newMapVersion != mapVersion) {
			NotificationChain msgs = null;
			if (mapVersion != null) {
				msgs = ((InternalEObject) mapVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.MAP_VERSION_REFERENCE__MAP_VERSION, null, msgs);
			}
			if (newMapVersion != null) {
				msgs = ((InternalEObject) newMapVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.MAP_VERSION_REFERENCE__MAP_VERSION, null, msgs);
			}
			msgs = basicSetMapVersion(newMapVersion, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.MAP_VERSION_REFERENCE__MAP_VERSION, newMapVersion, newMapVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MapReference getMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetMap(MapReference newMap, NotificationChain msgs) {
		MapReference oldMap = map;
		map = newMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.MAP_VERSION_REFERENCE__MAP, oldMap, newMap);
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
	public void setMap(MapReference newMap) {
		if (newMap != map) {
			NotificationChain msgs = null;
			if (map != null) {
				msgs = ((InternalEObject) map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.MAP_VERSION_REFERENCE__MAP, null, msgs);
			}
			if (newMap != null) {
				msgs = ((InternalEObject) newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.MAP_VERSION_REFERENCE__MAP, null, msgs);
			}
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.MAP_VERSION_REFERENCE__MAP, newMap, newMap));
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
			case CorePackage.MAP_VERSION_REFERENCE__MAP_VERSION:
				return basicSetMapVersion(null, msgs);
			case CorePackage.MAP_VERSION_REFERENCE__MAP:
				return basicSetMap(null, msgs);
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
			case CorePackage.MAP_VERSION_REFERENCE__MAP_VERSION:
				return getMapVersion();
			case CorePackage.MAP_VERSION_REFERENCE__MAP:
				return getMap();
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
			case CorePackage.MAP_VERSION_REFERENCE__MAP_VERSION:
				setMapVersion((NameAndMeaningReference) newValue);
				return;
			case CorePackage.MAP_VERSION_REFERENCE__MAP:
				setMap((MapReference) newValue);
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
			case CorePackage.MAP_VERSION_REFERENCE__MAP_VERSION:
				setMapVersion((NameAndMeaningReference) null);
				return;
			case CorePackage.MAP_VERSION_REFERENCE__MAP:
				setMap((MapReference) null);
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
			case CorePackage.MAP_VERSION_REFERENCE__MAP_VERSION:
				return mapVersion != null;
			case CorePackage.MAP_VERSION_REFERENCE__MAP:
				return map != null;
		}
		return super.eIsSet(featureID);
	}

} // MapVersionReferenceImpl
