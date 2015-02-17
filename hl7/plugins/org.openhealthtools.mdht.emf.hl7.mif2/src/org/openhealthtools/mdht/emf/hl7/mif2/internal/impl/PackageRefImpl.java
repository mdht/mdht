/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactKind;
import org.openhealthtools.mdht.emf.hl7.mif2.DomainKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRootKind;
import org.openhealthtools.mdht.emf.hl7.mif2.SubArtifactKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getCombinedId <em>Combined Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getSubArtifact <em>Sub Artifact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getSubSection <em>Sub Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageRefImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageRefImpl extends EObjectImpl implements PackageRef {
	/**
	 * The default value of the '{@link #getArtifact() <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected static final ArtifactKind ARTIFACT_EDEFAULT = ArtifactKind.IFC;

	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected ArtifactKind artifact = ARTIFACT_EDEFAULT;

	/**
	 * This is true if the Artifact attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean artifactESet;

	/**
	 * The default value of the '{@link #getCombinedId() <em>Combined Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMBINED_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCombinedId() <em>Combined Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedId()
	 * @generated
	 * @ordered
	 */
	protected String combinedId = COMBINED_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final DomainKind DOMAIN_EDEFAULT = DomainKind.DD;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected DomainKind domain = DOMAIN_EDEFAULT;

	/**
	 * This is true if the Domain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean domainESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealmNamespace() <em>Realm Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealmNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final Object REALM_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealmNamespace() <em>Realm Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealmNamespace()
	 * @generated
	 * @ordered
	 */
	protected Object realmNamespace = REALM_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected static final PackageRootKind ROOT_EDEFAULT = PackageRootKind.DEFN;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected PackageRootKind root = ROOT_EDEFAULT;

	/**
	 * This is true if the Root attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rootESet;

	/**
	 * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected String section = SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubArtifact() <em>Sub Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubArtifact()
	 * @generated
	 * @ordered
	 */
	protected static final SubArtifactKind SUB_ARTIFACT_EDEFAULT = SubArtifactKind.VD;

	/**
	 * The cached value of the '{@link #getSubArtifact() <em>Sub Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubArtifact()
	 * @generated
	 * @ordered
	 */
	protected SubArtifactKind subArtifact = SUB_ARTIFACT_EDEFAULT;

	/**
	 * This is true if the Sub Artifact attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subArtifactESet;

	/**
	 * The default value of the '{@link #getSubSection() <em>Sub Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSection()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_SECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubSection() <em>Sub Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSection()
	 * @generated
	 * @ordered
	 */
	protected String subSection = SUB_SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PACKAGE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactKind getArtifact() {
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifact(ArtifactKind newArtifact) {
		ArtifactKind oldArtifact = artifact;
		artifact = newArtifact == null
				? ARTIFACT_EDEFAULT
				: newArtifact;
		boolean oldArtifactESet = artifactESet;
		artifactESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PACKAGE_REF__ARTIFACT, oldArtifact, artifact, !oldArtifactESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArtifact() {
		ArtifactKind oldArtifact = artifact;
		boolean oldArtifactESet = artifactESet;
		artifact = ARTIFACT_EDEFAULT;
		artifactESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.PACKAGE_REF__ARTIFACT, oldArtifact, ARTIFACT_EDEFAULT,
				oldArtifactESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArtifact() {
		return artifactESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCombinedId() {
		return combinedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombinedId(String newCombinedId) {
		String oldCombinedId = combinedId;
		combinedId = newCombinedId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PACKAGE_REF__COMBINED_ID, oldCombinedId, combinedId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainKind getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(DomainKind newDomain) {
		DomainKind oldDomain = domain;
		domain = newDomain == null
				? DOMAIN_EDEFAULT
				: newDomain;
		boolean oldDomainESet = domainESet;
		domainESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PACKAGE_REF__DOMAIN, oldDomain, domain, !oldDomainESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDomain() {
		DomainKind oldDomain = domain;
		boolean oldDomainESet = domainESet;
		domain = DOMAIN_EDEFAULT;
		domainESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.PACKAGE_REF__DOMAIN, oldDomain, DOMAIN_EDEFAULT, oldDomainESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDomain() {
		return domainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(BigInteger newId) {
		BigInteger oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE_REF__ID, oldId, id));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE_REF__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRealmNamespace() {
		return realmNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealmNamespace(Object newRealmNamespace) {
		Object oldRealmNamespace = realmNamespace;
		realmNamespace = newRealmNamespace;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PACKAGE_REF__REALM_NAMESPACE, oldRealmNamespace, realmNamespace));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseDate(XMLGregorianCalendar newReleaseDate) {
		XMLGregorianCalendar oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PACKAGE_REF__RELEASE_DATE, oldReleaseDate, releaseDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRootKind getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(PackageRootKind newRoot) {
		PackageRootKind oldRoot = root;
		root = newRoot == null
				? ROOT_EDEFAULT
				: newRoot;
		boolean oldRootESet = rootESet;
		rootESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PACKAGE_REF__ROOT, oldRoot, root, !oldRootESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRoot() {
		PackageRootKind oldRoot = root;
		boolean oldRootESet = rootESet;
		root = ROOT_EDEFAULT;
		rootESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.PACKAGE_REF__ROOT, oldRoot, ROOT_EDEFAULT, oldRootESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoot() {
		return rootESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSection() {
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(String newSection) {
		String oldSection = section;
		section = newSection;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE_REF__SECTION, oldSection, section));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubArtifactKind getSubArtifact() {
		return subArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubArtifact(SubArtifactKind newSubArtifact) {
		SubArtifactKind oldSubArtifact = subArtifact;
		subArtifact = newSubArtifact == null
				? SUB_ARTIFACT_EDEFAULT
				: newSubArtifact;
		boolean oldSubArtifactESet = subArtifactESet;
		subArtifactESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PACKAGE_REF__SUB_ARTIFACT, oldSubArtifact, subArtifact,
				!oldSubArtifactESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubArtifact() {
		SubArtifactKind oldSubArtifact = subArtifact;
		boolean oldSubArtifactESet = subArtifactESet;
		subArtifact = SUB_ARTIFACT_EDEFAULT;
		subArtifactESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.PACKAGE_REF__SUB_ARTIFACT, oldSubArtifact, SUB_ARTIFACT_EDEFAULT,
				oldSubArtifactESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubArtifact() {
		return subArtifactESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubSection() {
		return subSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSection(String newSubSection) {
		String oldSubSection = subSection;
		subSection = newSubSection;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PACKAGE_REF__SUB_SECTION, oldSubSection, subSection));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE_REF__VERSION, oldVersion, version));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.PACKAGE_REF__ARTIFACT:
				return getArtifact();
			case Mif2Package.PACKAGE_REF__COMBINED_ID:
				return getCombinedId();
			case Mif2Package.PACKAGE_REF__DOMAIN:
				return getDomain();
			case Mif2Package.PACKAGE_REF__ID:
				return getId();
			case Mif2Package.PACKAGE_REF__NAME:
				return getName();
			case Mif2Package.PACKAGE_REF__REALM_NAMESPACE:
				return getRealmNamespace();
			case Mif2Package.PACKAGE_REF__RELEASE_DATE:
				return getReleaseDate();
			case Mif2Package.PACKAGE_REF__ROOT:
				return getRoot();
			case Mif2Package.PACKAGE_REF__SECTION:
				return getSection();
			case Mif2Package.PACKAGE_REF__SUB_ARTIFACT:
				return getSubArtifact();
			case Mif2Package.PACKAGE_REF__SUB_SECTION:
				return getSubSection();
			case Mif2Package.PACKAGE_REF__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.PACKAGE_REF__ARTIFACT:
				setArtifact((ArtifactKind) newValue);
				return;
			case Mif2Package.PACKAGE_REF__COMBINED_ID:
				setCombinedId((String) newValue);
				return;
			case Mif2Package.PACKAGE_REF__DOMAIN:
				setDomain((DomainKind) newValue);
				return;
			case Mif2Package.PACKAGE_REF__ID:
				setId((BigInteger) newValue);
				return;
			case Mif2Package.PACKAGE_REF__NAME:
				setName((String) newValue);
				return;
			case Mif2Package.PACKAGE_REF__REALM_NAMESPACE:
				setRealmNamespace(newValue);
				return;
			case Mif2Package.PACKAGE_REF__RELEASE_DATE:
				setReleaseDate((XMLGregorianCalendar) newValue);
				return;
			case Mif2Package.PACKAGE_REF__ROOT:
				setRoot((PackageRootKind) newValue);
				return;
			case Mif2Package.PACKAGE_REF__SECTION:
				setSection((String) newValue);
				return;
			case Mif2Package.PACKAGE_REF__SUB_ARTIFACT:
				setSubArtifact((SubArtifactKind) newValue);
				return;
			case Mif2Package.PACKAGE_REF__SUB_SECTION:
				setSubSection((String) newValue);
				return;
			case Mif2Package.PACKAGE_REF__VERSION:
				setVersion((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Mif2Package.PACKAGE_REF__ARTIFACT:
				unsetArtifact();
				return;
			case Mif2Package.PACKAGE_REF__COMBINED_ID:
				setCombinedId(COMBINED_ID_EDEFAULT);
				return;
			case Mif2Package.PACKAGE_REF__DOMAIN:
				unsetDomain();
				return;
			case Mif2Package.PACKAGE_REF__ID:
				setId(ID_EDEFAULT);
				return;
			case Mif2Package.PACKAGE_REF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.PACKAGE_REF__REALM_NAMESPACE:
				setRealmNamespace(REALM_NAMESPACE_EDEFAULT);
				return;
			case Mif2Package.PACKAGE_REF__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
				return;
			case Mif2Package.PACKAGE_REF__ROOT:
				unsetRoot();
				return;
			case Mif2Package.PACKAGE_REF__SECTION:
				setSection(SECTION_EDEFAULT);
				return;
			case Mif2Package.PACKAGE_REF__SUB_ARTIFACT:
				unsetSubArtifact();
				return;
			case Mif2Package.PACKAGE_REF__SUB_SECTION:
				setSubSection(SUB_SECTION_EDEFAULT);
				return;
			case Mif2Package.PACKAGE_REF__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Mif2Package.PACKAGE_REF__ARTIFACT:
				return isSetArtifact();
			case Mif2Package.PACKAGE_REF__COMBINED_ID:
				return COMBINED_ID_EDEFAULT == null
						? combinedId != null
						: !COMBINED_ID_EDEFAULT.equals(combinedId);
			case Mif2Package.PACKAGE_REF__DOMAIN:
				return isSetDomain();
			case Mif2Package.PACKAGE_REF__ID:
				return ID_EDEFAULT == null
						? id != null
						: !ID_EDEFAULT.equals(id);
			case Mif2Package.PACKAGE_REF__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case Mif2Package.PACKAGE_REF__REALM_NAMESPACE:
				return REALM_NAMESPACE_EDEFAULT == null
						? realmNamespace != null
						: !REALM_NAMESPACE_EDEFAULT.equals(realmNamespace);
			case Mif2Package.PACKAGE_REF__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null
						? releaseDate != null
						: !RELEASE_DATE_EDEFAULT.equals(releaseDate);
			case Mif2Package.PACKAGE_REF__ROOT:
				return isSetRoot();
			case Mif2Package.PACKAGE_REF__SECTION:
				return SECTION_EDEFAULT == null
						? section != null
						: !SECTION_EDEFAULT.equals(section);
			case Mif2Package.PACKAGE_REF__SUB_ARTIFACT:
				return isSetSubArtifact();
			case Mif2Package.PACKAGE_REF__SUB_SECTION:
				return SUB_SECTION_EDEFAULT == null
						? subSection != null
						: !SUB_SECTION_EDEFAULT.equals(subSection);
			case Mif2Package.PACKAGE_REF__VERSION:
				return VERSION_EDEFAULT == null
						? version != null
						: !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (artifact: ");
		if (artifactESet) {
			result.append(artifact);
		} else {
			result.append("<unset>");
		}
		result.append(", combinedId: ");
		result.append(combinedId);
		result.append(", domain: ");
		if (domainESet) {
			result.append(domain);
		} else {
			result.append("<unset>");
		}
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", realmNamespace: ");
		result.append(realmNamespace);
		result.append(", releaseDate: ");
		result.append(releaseDate);
		result.append(", root: ");
		if (rootESet) {
			result.append(root);
		} else {
			result.append("<unset>");
		}
		result.append(", section: ");
		result.append(section);
		result.append(", subArtifact: ");
		if (subArtifactESet) {
			result.append(subArtifact);
		} else {
			result.append("<unset>");
		}
		result.append(", subSection: ");
		result.append(subSection);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} // PackageRefImpl
