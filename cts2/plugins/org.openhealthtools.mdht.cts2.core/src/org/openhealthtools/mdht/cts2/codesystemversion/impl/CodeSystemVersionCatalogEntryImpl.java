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
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.LanguageReference;
import org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl#getVersionOf <em>Version Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl#getImports <em>Imports</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl#getDefaultLanguage <em>Default Language</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl#getSupportedLanguage <em>Supported Language</em>}
 * </li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl#getEntityDescriptions <em>Entity Descriptions
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl#getAssociations <em>Associations</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl#getClasses <em>Classes</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl#getRoles <em>Roles</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl#getIndividuals <em>Individuals</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl#getCodeSystemVersionName <em>Code System Version
 * Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CodeSystemVersionCatalogEntryImpl extends ResourceVersionDescriptionImpl implements
		CodeSystemVersionCatalogEntry {
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
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemVersionReference> imports;

	/**
	 * The cached value of the '{@link #getDefaultLanguage() <em>Default Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefaultLanguage()
	 * @generated
	 * @ordered
	 */
	protected LanguageReference defaultLanguage;

	/**
	 * The cached value of the '{@link #getSupportedLanguage() <em>Supported Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSupportedLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageReference> supportedLanguage;

	/**
	 * The default value of the '{@link #getEntityDescriptions() <em>Entity Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_DESCRIPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityDescriptions() <em>Entity Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected String entityDescriptions = ENTITY_DESCRIPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociations() <em>Associations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected String associations = ASSOCIATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getClasses() <em>Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected String classes = CLASSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoles() <em>Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected String roles = ROLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndividuals() <em>Individuals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIndividuals()
	 * @generated
	 * @ordered
	 */
	protected static final String INDIVIDUALS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndividuals() <em>Individuals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIndividuals()
	 * @generated
	 * @ordered
	 */
	protected String individuals = INDIVIDUALS_EDEFAULT;

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
	protected CodeSystemVersionCatalogEntryImpl() {
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
		return CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY;
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
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF,
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
						CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF, null, msgs);
			}
			if (newVersionOf != null) {
				msgs = ((InternalEObject) newVersionOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF, null, msgs);
			}
			msgs = basicSetVersionOf(newVersionOf, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF,
				newVersionOf, newVersionOf));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CodeSystemVersionReference> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<CodeSystemVersionReference>(
				CodeSystemVersionReference.class, this,
				CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LanguageReference getDefaultLanguage() {
		return defaultLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDefaultLanguage(LanguageReference newDefaultLanguage, NotificationChain msgs) {
		LanguageReference oldDefaultLanguage = defaultLanguage;
		defaultLanguage = newDefaultLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE,
				oldDefaultLanguage, newDefaultLanguage);
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
	public void setDefaultLanguage(LanguageReference newDefaultLanguage) {
		if (newDefaultLanguage != defaultLanguage) {
			NotificationChain msgs = null;
			if (defaultLanguage != null) {
				msgs = ((InternalEObject) defaultLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE, null, msgs);
			}
			if (newDefaultLanguage != null) {
				msgs = ((InternalEObject) newDefaultLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE, null, msgs);
			}
			msgs = basicSetDefaultLanguage(newDefaultLanguage, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE,
				newDefaultLanguage, newDefaultLanguage));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<LanguageReference> getSupportedLanguage() {
		if (supportedLanguage == null) {
			supportedLanguage = new EObjectContainmentEList<LanguageReference>(
				LanguageReference.class, this,
				CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE);
		}
		return supportedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getEntityDescriptions() {
		return entityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntityDescriptions(String newEntityDescriptions) {
		String oldEntityDescriptions = entityDescriptions;
		entityDescriptions = newEntityDescriptions;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET,
				CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ENTITY_DESCRIPTIONS, oldEntityDescriptions,
				entityDescriptions));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAssociations() {
		return associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssociations(String newAssociations) {
		String oldAssociations = associations;
		associations = newAssociations;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ASSOCIATIONS,
				oldAssociations, associations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getClasses() {
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClasses(String newClasses) {
		String oldClasses = classes;
		classes = newClasses;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CLASSES,
				oldClasses, classes));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRoles(String newRoles) {
		String oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ROLES, oldRoles,
				roles));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getIndividuals() {
		return individuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIndividuals(String newIndividuals) {
		String oldIndividuals = individuals;
		individuals = newIndividuals;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__INDIVIDUALS,
				oldIndividuals, individuals));
		}
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
				CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CODE_SYSTEM_VERSION_NAME,
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF:
				return basicSetVersionOf(null, msgs);
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS:
				return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE:
				return basicSetDefaultLanguage(null, msgs);
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE:
				return ((InternalEList<?>) getSupportedLanguage()).basicRemove(otherEnd, msgs);
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF:
				return getVersionOf();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS:
				return getImports();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE:
				return getDefaultLanguage();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE:
				return getSupportedLanguage();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ENTITY_DESCRIPTIONS:
				return getEntityDescriptions();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ASSOCIATIONS:
				return getAssociations();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CLASSES:
				return getClasses();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ROLES:
				return getRoles();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__INDIVIDUALS:
				return getIndividuals();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CODE_SYSTEM_VERSION_NAME:
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF:
				setVersionOf((CodeSystemReference) newValue);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends CodeSystemVersionReference>) newValue);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE:
				setDefaultLanguage((LanguageReference) newValue);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE:
				getSupportedLanguage().clear();
				getSupportedLanguage().addAll((Collection<? extends LanguageReference>) newValue);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ENTITY_DESCRIPTIONS:
				setEntityDescriptions((String) newValue);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ASSOCIATIONS:
				setAssociations((String) newValue);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CLASSES:
				setClasses((String) newValue);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ROLES:
				setRoles((String) newValue);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__INDIVIDUALS:
				setIndividuals((String) newValue);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CODE_SYSTEM_VERSION_NAME:
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF:
				setVersionOf((CodeSystemReference) null);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS:
				getImports().clear();
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE:
				setDefaultLanguage((LanguageReference) null);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE:
				getSupportedLanguage().clear();
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ENTITY_DESCRIPTIONS:
				setEntityDescriptions(ENTITY_DESCRIPTIONS_EDEFAULT);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ASSOCIATIONS:
				setAssociations(ASSOCIATIONS_EDEFAULT);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CLASSES:
				setClasses(CLASSES_EDEFAULT);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ROLES:
				setRoles(ROLES_EDEFAULT);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__INDIVIDUALS:
				setIndividuals(INDIVIDUALS_EDEFAULT);
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CODE_SYSTEM_VERSION_NAME:
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF:
				return versionOf != null;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS:
				return imports != null && !imports.isEmpty();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE:
				return defaultLanguage != null;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE:
				return supportedLanguage != null && !supportedLanguage.isEmpty();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ENTITY_DESCRIPTIONS:
				return ENTITY_DESCRIPTIONS_EDEFAULT == null
						? entityDescriptions != null
						: !ENTITY_DESCRIPTIONS_EDEFAULT.equals(entityDescriptions);
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ASSOCIATIONS:
				return ASSOCIATIONS_EDEFAULT == null
						? associations != null
						: !ASSOCIATIONS_EDEFAULT.equals(associations);
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CLASSES:
				return CLASSES_EDEFAULT == null
						? classes != null
						: !CLASSES_EDEFAULT.equals(classes);
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ROLES:
				return ROLES_EDEFAULT == null
						? roles != null
						: !ROLES_EDEFAULT.equals(roles);
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__INDIVIDUALS:
				return INDIVIDUALS_EDEFAULT == null
						? individuals != null
						: !INDIVIDUALS_EDEFAULT.equals(individuals);
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CODE_SYSTEM_VERSION_NAME:
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
		result.append(" (entityDescriptions: ");
		result.append(entityDescriptions);
		result.append(", associations: ");
		result.append(associations);
		result.append(", classes: ");
		result.append(classes);
		result.append(", roles: ");
		result.append(roles);
		result.append(", individuals: ");
		result.append(individuals);
		result.append(", codeSystemVersionName: ");
		result.append(codeSystemVersionName);
		result.append(')');
		return result.toString();
	}

} // CodeSystemVersionCatalogEntryImpl
