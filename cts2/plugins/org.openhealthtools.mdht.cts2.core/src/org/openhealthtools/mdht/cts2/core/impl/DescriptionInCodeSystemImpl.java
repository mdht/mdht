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
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description In Code System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.DescriptionInCodeSystemImpl#getDescribingCodeSystemVersion <em>Describing Code System Version
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.DescriptionInCodeSystemImpl#getDesignation <em>Designation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.DescriptionInCodeSystemImpl#getHref <em>Href</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DescriptionInCodeSystemImpl extends EObjectImpl implements DescriptionInCodeSystem {
	/**
	 * The cached value of the '{@link #getDescribingCodeSystemVersion() <em>Describing Code System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescribingCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionReference describingCodeSystemVersion;

	/**
	 * The default value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGNATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected String designation = DESIGNATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DescriptionInCodeSystemImpl() {
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
		return CorePackage.Literals.DESCRIPTION_IN_CODE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionReference getDescribingCodeSystemVersion() {
		return describingCodeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDescribingCodeSystemVersion(
			CodeSystemVersionReference newDescribingCodeSystemVersion, NotificationChain msgs) {
		CodeSystemVersionReference oldDescribingCodeSystemVersion = describingCodeSystemVersion;
		describingCodeSystemVersion = newDescribingCodeSystemVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION,
				oldDescribingCodeSystemVersion, newDescribingCodeSystemVersion);
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
	public void setDescribingCodeSystemVersion(CodeSystemVersionReference newDescribingCodeSystemVersion) {
		if (newDescribingCodeSystemVersion != describingCodeSystemVersion) {
			NotificationChain msgs = null;
			if (describingCodeSystemVersion != null) {
				msgs = ((InternalEObject) describingCodeSystemVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION, null, msgs);
			}
			if (newDescribingCodeSystemVersion != null) {
				msgs = ((InternalEObject) newDescribingCodeSystemVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION, null, msgs);
			}
			msgs = basicSetDescribingCodeSystemVersion(newDescribingCodeSystemVersion, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION,
				newDescribingCodeSystemVersion, newDescribingCodeSystemVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDesignation(String newDesignation) {
		String oldDesignation = designation;
		designation = newDesignation;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESIGNATION, oldDesignation,
				designation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.DESCRIPTION_IN_CODE_SYSTEM__HREF, oldHref, href));
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
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION:
				return basicSetDescribingCodeSystemVersion(null, msgs);
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
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION:
				return getDescribingCodeSystemVersion();
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESIGNATION:
				return getDesignation();
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__HREF:
				return getHref();
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
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION:
				setDescribingCodeSystemVersion((CodeSystemVersionReference) newValue);
				return;
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESIGNATION:
				setDesignation((String) newValue);
				return;
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__HREF:
				setHref((String) newValue);
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
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION:
				setDescribingCodeSystemVersion((CodeSystemVersionReference) null);
				return;
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESIGNATION:
				setDesignation(DESIGNATION_EDEFAULT);
				return;
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__HREF:
				setHref(HREF_EDEFAULT);
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
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION:
				return describingCodeSystemVersion != null;
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__DESIGNATION:
				return DESIGNATION_EDEFAULT == null
						? designation != null
						: !DESIGNATION_EDEFAULT.equals(designation);
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM__HREF:
				return HREF_EDEFAULT == null
						? href != null
						: !HREF_EDEFAULT.equals(href);
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
		result.append(" (designation: ");
		result.append(designation);
		result.append(", href: ");
		result.append(href);
		result.append(')');
		return result.toString();
	}

} // DescriptionInCodeSystemImpl
