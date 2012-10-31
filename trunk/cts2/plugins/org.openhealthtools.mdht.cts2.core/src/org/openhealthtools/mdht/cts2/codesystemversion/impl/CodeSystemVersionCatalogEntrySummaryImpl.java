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
package org.openhealthtools.mdht.cts2.codesystemversion.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.VersionTagReference;
import org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionDirectoryEntryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntrySummaryImpl#getVersionOf <em>Version Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntrySummaryImpl#getCodeSystemVersionTag <em>Code System
 * Version Tag</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntrySummaryImpl#getCodeSystemVersionName <em>Code System
 * Version Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CodeSystemVersionCatalogEntrySummaryImpl extends ResourceVersionDescriptionDirectoryEntryImpl implements
		CodeSystemVersionCatalogEntrySummary {
	/**
	 * The cached value of the '{@link #getVersionOf() <em>Version Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVersionOf()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemReference versionOf;

	/**
	 * The cached value of the '{@link #getCodeSystemVersionTag() <em>Code System Version Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemVersionTag()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionTagReference> codeSystemVersionTag;

	/**
	 * The default value of the '{@link #getCodeSystemVersionName() <em>Code System Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemVersionName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_VERSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystemVersionName() <em>Code System Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemVersionName()
	 * @generated
	 * @ordered
	 */
	protected String codeSystemVersionName = CODE_SYSTEM_VERSION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemVersionCatalogEntrySummaryImpl() {
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
		return CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemReference getVersionOf() {
		return versionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetVersionOf(CodeSystemReference newVersionOf, NotificationChain msgs) {
		CodeSystemReference oldVersionOf = versionOf;
		versionOf = newVersionOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF,
				oldVersionOf, newVersionOf);
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
	public void setVersionOf(CodeSystemReference newVersionOf) {
		if (newVersionOf != versionOf) {
			NotificationChain msgs = null;
			if (versionOf != null) {
				msgs = ((InternalEObject) versionOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF, null, msgs);
			}
			if (newVersionOf != null) {
				msgs = ((InternalEObject) newVersionOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF, null, msgs);
			}
			msgs = basicSetVersionOf(newVersionOf, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF,
				newVersionOf, newVersionOf));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<VersionTagReference> getCodeSystemVersionTag() {
		if (codeSystemVersionTag == null) {
			codeSystemVersionTag = new EObjectContainmentEList<VersionTagReference>(
				VersionTagReference.class, this,
				CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG);
		}
		return codeSystemVersionTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCodeSystemVersionName() {
		return codeSystemVersionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemVersionName(String newCodeSystemVersionName) {
		String oldCodeSystemVersionName = codeSystemVersionName;
		codeSystemVersionName = newCodeSystemVersionName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET,
				CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_NAME,
				oldCodeSystemVersionName, codeSystemVersionName));
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF:
				return basicSetVersionOf(null, msgs);
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG:
				return ((InternalEList<?>) getCodeSystemVersionTag()).basicRemove(otherEnd, msgs);
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF:
				return getVersionOf();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG:
				return getCodeSystemVersionTag();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_NAME:
				return getCodeSystemVersionName();
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF:
				setVersionOf((CodeSystemReference) newValue);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG:
				getCodeSystemVersionTag().clear();
				getCodeSystemVersionTag().addAll((Collection<? extends VersionTagReference>) newValue);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_NAME:
				setCodeSystemVersionName((String) newValue);
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF:
				setVersionOf((CodeSystemReference) null);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG:
				getCodeSystemVersionTag().clear();
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_NAME:
				setCodeSystemVersionName(CODE_SYSTEM_VERSION_NAME_EDEFAULT);
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF:
				return versionOf != null;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG:
				return codeSystemVersionTag != null && !codeSystemVersionTag.isEmpty();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_NAME:
				return CODE_SYSTEM_VERSION_NAME_EDEFAULT == null
						? codeSystemVersionName != null
						: !CODE_SYSTEM_VERSION_NAME_EDEFAULT.equals(codeSystemVersionName);
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
		result.append(" (codeSystemVersionName: ");
		result.append(codeSystemVersionName);
		result.append(')');
		return result.toString();
	}

} // CodeSystemVersionCatalogEntrySummaryImpl
