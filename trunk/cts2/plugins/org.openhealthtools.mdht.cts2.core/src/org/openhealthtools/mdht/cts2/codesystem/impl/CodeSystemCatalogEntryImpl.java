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
package org.openhealthtools.mdht.cts2.codesystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;
import org.openhealthtools.mdht.cts2.core.CodeSystemCategoryReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.OntologyDomainReference;
import org.openhealthtools.mdht.cts2.core.OntologyEngineeringToolReference;
import org.openhealthtools.mdht.cts2.core.OntologyTaskReference;
import org.openhealthtools.mdht.cts2.core.OntologyTypeReference;
import org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl#getCodeSystemCategory <em>Code System Category</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl#getOntologyDomain <em>Ontology Domain</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl#getOntologyType <em>Ontology Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl#getDesignedForOntologyTask <em>Designed For Ontology Task</em>}
 * </li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl#getVersions <em>Versions</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl#getCurrentVersion <em>Current Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl#getUsedOntologyEngineeringTool <em>Used Ontology Engineering
 * Tool</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl#getCodeSystemName <em>Code System Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CodeSystemCatalogEntryImpl extends AbstractResourceDescriptionImpl implements CodeSystemCatalogEntry {
	/**
	 * The cached value of the '{@link #getCodeSystemCategory() <em>Code System Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemCategoryReference codeSystemCategory;

	/**
	 * The cached value of the '{@link #getOntologyDomain() <em>Ontology Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOntologyDomain()
	 * @generated
	 * @ordered
	 */
	protected OntologyDomainReference ontologyDomain;

	/**
	 * The cached value of the '{@link #getOntologyType() <em>Ontology Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOntologyType()
	 * @generated
	 * @ordered
	 */
	protected OntologyTypeReference ontologyType;

	/**
	 * The cached value of the '{@link #getDesignedForOntologyTask() <em>Designed For Ontology Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDesignedForOntologyTask()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologyTaskReference> designedForOntologyTask;

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
	 * The cached value of the '{@link #getUsedOntologyEngineeringTool() <em>Used Ontology Engineering Tool</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUsedOntologyEngineeringTool()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologyEngineeringToolReference> usedOntologyEngineeringTool;

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
	protected CodeSystemCatalogEntryImpl() {
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
		return CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCategoryReference getCodeSystemCategory() {
		return codeSystemCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemCategory(CodeSystemCategoryReference newCodeSystemCategory,
			NotificationChain msgs) {
		CodeSystemCategoryReference oldCodeSystemCategory = codeSystemCategory;
		codeSystemCategory = newCodeSystemCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY,
				oldCodeSystemCategory, newCodeSystemCategory);
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
	public void setCodeSystemCategory(CodeSystemCategoryReference newCodeSystemCategory) {
		if (newCodeSystemCategory != codeSystemCategory) {
			NotificationChain msgs = null;
			if (codeSystemCategory != null) {
				msgs = ((InternalEObject) codeSystemCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY, null, msgs);
			}
			if (newCodeSystemCategory != null) {
				msgs = ((InternalEObject) newCodeSystemCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY, null, msgs);
			}
			msgs = basicSetCodeSystemCategory(newCodeSystemCategory, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY,
				newCodeSystemCategory, newCodeSystemCategory));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyDomainReference getOntologyDomain() {
		return ontologyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOntologyDomain(OntologyDomainReference newOntologyDomain, NotificationChain msgs) {
		OntologyDomainReference oldOntologyDomain = ontologyDomain;
		ontologyDomain = newOntologyDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN,
				oldOntologyDomain, newOntologyDomain);
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
	public void setOntologyDomain(OntologyDomainReference newOntologyDomain) {
		if (newOntologyDomain != ontologyDomain) {
			NotificationChain msgs = null;
			if (ontologyDomain != null) {
				msgs = ((InternalEObject) ontologyDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN, null, msgs);
			}
			if (newOntologyDomain != null) {
				msgs = ((InternalEObject) newOntologyDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN, null, msgs);
			}
			msgs = basicSetOntologyDomain(newOntologyDomain, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN,
				newOntologyDomain, newOntologyDomain));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyTypeReference getOntologyType() {
		return ontologyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOntologyType(OntologyTypeReference newOntologyType, NotificationChain msgs) {
		OntologyTypeReference oldOntologyType = ontologyType;
		ontologyType = newOntologyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE, oldOntologyType,
				newOntologyType);
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
	public void setOntologyType(OntologyTypeReference newOntologyType) {
		if (newOntologyType != ontologyType) {
			NotificationChain msgs = null;
			if (ontologyType != null) {
				msgs = ((InternalEObject) ontologyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE, null, msgs);
			}
			if (newOntologyType != null) {
				msgs = ((InternalEObject) newOntologyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE, null, msgs);
			}
			msgs = basicSetOntologyType(newOntologyType, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE, newOntologyType,
				newOntologyType));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OntologyTaskReference> getDesignedForOntologyTask() {
		if (designedForOntologyTask == null) {
			designedForOntologyTask = new EObjectContainmentEList<OntologyTaskReference>(
				OntologyTaskReference.class, this,
				CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK);
		}
		return designedForOntologyTask;
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
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__VERSIONS, oldVersions, versions));
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
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION,
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
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION, null, msgs);
			}
			if (newCurrentVersion != null) {
				msgs = ((InternalEObject) newCurrentVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION, null, msgs);
			}
			msgs = basicSetCurrentVersion(newCurrentVersion, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION,
				newCurrentVersion, newCurrentVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OntologyEngineeringToolReference> getUsedOntologyEngineeringTool() {
		if (usedOntologyEngineeringTool == null) {
			usedOntologyEngineeringTool = new EObjectContainmentEList<OntologyEngineeringToolReference>(
				OntologyEngineeringToolReference.class, this,
				CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL);
		}
		return usedOntologyEngineeringTool;
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
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_NAME,
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY:
				return basicSetCodeSystemCategory(null, msgs);
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN:
				return basicSetOntologyDomain(null, msgs);
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE:
				return basicSetOntologyType(null, msgs);
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK:
				return ((InternalEList<?>) getDesignedForOntologyTask()).basicRemove(otherEnd, msgs);
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION:
				return basicSetCurrentVersion(null, msgs);
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL:
				return ((InternalEList<?>) getUsedOntologyEngineeringTool()).basicRemove(otherEnd, msgs);
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY:
				return getCodeSystemCategory();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN:
				return getOntologyDomain();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE:
				return getOntologyType();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK:
				return getDesignedForOntologyTask();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__VERSIONS:
				return getVersions();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION:
				return getCurrentVersion();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL:
				return getUsedOntologyEngineeringTool();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_NAME:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY:
				setCodeSystemCategory((CodeSystemCategoryReference) newValue);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN:
				setOntologyDomain((OntologyDomainReference) newValue);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE:
				setOntologyType((OntologyTypeReference) newValue);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK:
				getDesignedForOntologyTask().clear();
				getDesignedForOntologyTask().addAll((Collection<? extends OntologyTaskReference>) newValue);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__VERSIONS:
				setVersions((String) newValue);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION:
				setCurrentVersion((CodeSystemVersionReference) newValue);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL:
				getUsedOntologyEngineeringTool().clear();
				getUsedOntologyEngineeringTool().addAll(
					(Collection<? extends OntologyEngineeringToolReference>) newValue);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_NAME:
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY:
				setCodeSystemCategory((CodeSystemCategoryReference) null);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN:
				setOntologyDomain((OntologyDomainReference) null);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE:
				setOntologyType((OntologyTypeReference) null);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK:
				getDesignedForOntologyTask().clear();
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__VERSIONS:
				setVersions(VERSIONS_EDEFAULT);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION:
				setCurrentVersion((CodeSystemVersionReference) null);
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL:
				getUsedOntologyEngineeringTool().clear();
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_NAME:
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY:
				return codeSystemCategory != null;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN:
				return ontologyDomain != null;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE:
				return ontologyType != null;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK:
				return designedForOntologyTask != null && !designedForOntologyTask.isEmpty();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__VERSIONS:
				return VERSIONS_EDEFAULT == null
						? versions != null
						: !VERSIONS_EDEFAULT.equals(versions);
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION:
				return currentVersion != null;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL:
				return usedOntologyEngineeringTool != null && !usedOntologyEngineeringTool.isEmpty();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_NAME:
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

} // CodeSystemCatalogEntryImpl
