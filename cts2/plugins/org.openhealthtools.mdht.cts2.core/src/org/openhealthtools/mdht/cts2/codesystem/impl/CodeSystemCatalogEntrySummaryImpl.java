/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionDirectoryEntryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntrySummaryImpl#getVersions <em>Versions</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntrySummaryImpl#getCurrentVersion <em>Current Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntrySummaryImpl#getCodeSystemName <em>Code System Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CodeSystemCatalogEntrySummaryImpl extends AbstractResourceDescriptionDirectoryEntryImpl implements
		CodeSystemCatalogEntrySummary {
	/**
	 * The default value of the '{@link #getVersions() <em>Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected String versions = VERSIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrentVersion() <em>Current Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCurrentVersion()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionReference currentVersion;

	/**
	 * The default value of the '{@link #getCodeSystemName() <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystemName() <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemName()
	 * @generated
	 * @ordered
	 */
	protected String codeSystemName = CODE_SYSTEM_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemCatalogEntrySummaryImpl() {
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
		return CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getVersions() {
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVersions(String newVersions) {
		String oldVersions = versions;
		versions = newVersions;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__VERSIONS, oldVersions,
				versions));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionReference getCurrentVersion() {
		return currentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCurrentVersion(CodeSystemVersionReference newCurrentVersion, NotificationChain msgs) {
		CodeSystemVersionReference oldCurrentVersion = currentVersion;
		currentVersion = newCurrentVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION,
				oldCurrentVersion, newCurrentVersion);
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
	public void setCurrentVersion(CodeSystemVersionReference newCurrentVersion) {
		if (newCurrentVersion != currentVersion) {
			NotificationChain msgs = null;
			if (currentVersion != null) {
				msgs = ((InternalEObject) currentVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION, null, msgs);
			}
			if (newCurrentVersion != null) {
				msgs = ((InternalEObject) newCurrentVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION, null, msgs);
			}
			msgs = basicSetCurrentVersion(newCurrentVersion, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION,
				newCurrentVersion, newCurrentVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCodeSystemName() {
		return codeSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemName(String newCodeSystemName) {
		String oldCodeSystemName = codeSystemName;
		codeSystemName = newCodeSystemName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_NAME,
				oldCodeSystemName, codeSystemName));
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION:
				return basicSetCurrentVersion(null, msgs);
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__VERSIONS:
				return getVersions();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION:
				return getCurrentVersion();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_NAME:
				return getCodeSystemName();
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__VERSIONS:
				setVersions((String) newValue);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION:
				setCurrentVersion((CodeSystemVersionReference) newValue);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_NAME:
				setCodeSystemName((String) newValue);
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__VERSIONS:
				setVersions(VERSIONS_EDEFAULT);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION:
				setCurrentVersion((CodeSystemVersionReference) null);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_NAME:
				setCodeSystemName(CODE_SYSTEM_NAME_EDEFAULT);
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__VERSIONS:
				return VERSIONS_EDEFAULT == null
						? versions != null
						: !VERSIONS_EDEFAULT.equals(versions);
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION:
				return currentVersion != null;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_NAME:
				return CODE_SYSTEM_NAME_EDEFAULT == null
						? codeSystemName != null
						: !CODE_SYSTEM_NAME_EDEFAULT.equals(codeSystemName);
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
		result.append(" (versions: ");
		result.append(versions);
		result.append(", codeSystemName: ");
		result.append(codeSystemName);
		result.append(')');
		return result.toString();
	}

} // CodeSystemCatalogEntrySummaryImpl
