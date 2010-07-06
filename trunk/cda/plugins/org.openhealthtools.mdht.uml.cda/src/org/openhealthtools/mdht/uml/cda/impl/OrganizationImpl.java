/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.OrganizationPartOf;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.rim.impl.EntityImpl;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassOrganization;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getNames <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getAddrs <em>Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getStandardIndustryClassCode <em>Standard Industry Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getAsOrganizationPartOf <em>As Organization Part Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl#getDeterminerCode <em>Determiner Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationImpl extends EntityImpl implements Organization {
	/**
	 * The cached value of the '{@link #getRealmCodes() <em>Realm Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealmCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CS> realmCodes;

	/**
	 * The cached value of the '{@link #getTypeId() <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureRootTypeId typeId;

	/**
	 * The cached value of the '{@link #getTemplateIds() <em>Template Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> templateIds;

	/**
	 * The cached value of the '{@link #getIds() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> ids;

	/**
	 * The cached value of the '{@link #getNames() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<ON> names;

	/**
	 * The cached value of the '{@link #getTelecoms() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms()
	 * @generated
	 * @ordered
	 */
	protected EList<TEL> telecoms;

	/**
	 * The cached value of the '{@link #getAddrs() <em>Addr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrs()
	 * @generated
	 * @ordered
	 */
	protected EList<AD> addrs;

	/**
	 * The cached value of the '{@link #getStandardIndustryClassCode() <em>Standard Industry Class Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardIndustryClassCode()
	 * @generated
	 * @ordered
	 */
	protected CE standardIndustryClassCode;

	/**
	 * The cached value of the '{@link #getAsOrganizationPartOf() <em>As Organization Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsOrganizationPartOf()
	 * @generated
	 * @ordered
	 */
	protected OrganizationPartOf asOrganizationPartOf;

	/**
	 * The default value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected static final NullFlavor NULL_FLAVOR_EDEFAULT = NullFlavor.ASKU;

	/**
	 * The cached value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected NullFlavor nullFlavor = NULL_FLAVOR_EDEFAULT;

	/**
	 * This is true if the Null Flavor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullFlavorESet;

	/**
	 * The default value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected static final EntityClassOrganization CLASS_CODE_EDEFAULT = EntityClassOrganization.ORG;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected EntityClassOrganization classCode = CLASS_CODE_EDEFAULT;

	/**
	 * This is true if the Class Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classCodeESet;

	/**
	 * The default value of the '{@link #getDeterminerCode() <em>Determiner Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeterminerCode()
	 * @generated
	 * @ordered
	 */
	protected static final EntityDeterminer DETERMINER_CODE_EDEFAULT = EntityDeterminer.INSTANCE;

	/**
	 * The cached value of the '{@link #getDeterminerCode() <em>Determiner Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeterminerCode()
	 * @generated
	 * @ordered
	 */
	protected EntityDeterminer determinerCode = DETERMINER_CODE_EDEFAULT;

	/**
	 * This is true if the Determiner Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean determinerCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.ORGANIZATION__REALM_CODE);
		}
		return realmCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRootTypeId getTypeId() {
		return typeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeId(InfrastructureRootTypeId newTypeId, NotificationChain msgs) {
		InfrastructureRootTypeId oldTypeId = typeId;
		typeId = newTypeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZATION__TYPE_ID, oldTypeId, newTypeId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeId(InfrastructureRootTypeId newTypeId) {
		if (newTypeId != typeId) {
			NotificationChain msgs = null;
			if (typeId != null)
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ORGANIZATION__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ORGANIZATION__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZATION__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.ORGANIZATION__TEMPLATE_ID);
		}
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getIds() {
		if (ids == null) {
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.ORGANIZATION__ID);
		}
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ON> getNames() {
		if (names == null) {
			names = new EObjectContainmentEList<ON>(ON.class, this, CDAPackage.ORGANIZATION__NAME);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TEL> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectContainmentEList<TEL>(TEL.class, this, CDAPackage.ORGANIZATION__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AD> getAddrs() {
		if (addrs == null) {
			addrs = new EObjectContainmentEList<AD>(AD.class, this, CDAPackage.ORGANIZATION__ADDR);
		}
		return addrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getStandardIndustryClassCode() {
		return standardIndustryClassCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardIndustryClassCode(CE newStandardIndustryClassCode, NotificationChain msgs) {
		CE oldStandardIndustryClassCode = standardIndustryClassCode;
		standardIndustryClassCode = newStandardIndustryClassCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZATION__STANDARD_INDUSTRY_CLASS_CODE, oldStandardIndustryClassCode, newStandardIndustryClassCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardIndustryClassCode(CE newStandardIndustryClassCode) {
		if (newStandardIndustryClassCode != standardIndustryClassCode) {
			NotificationChain msgs = null;
			if (standardIndustryClassCode != null)
				msgs = ((InternalEObject)standardIndustryClassCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ORGANIZATION__STANDARD_INDUSTRY_CLASS_CODE, null, msgs);
			if (newStandardIndustryClassCode != null)
				msgs = ((InternalEObject)newStandardIndustryClassCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ORGANIZATION__STANDARD_INDUSTRY_CLASS_CODE, null, msgs);
			msgs = basicSetStandardIndustryClassCode(newStandardIndustryClassCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZATION__STANDARD_INDUSTRY_CLASS_CODE, newStandardIndustryClassCode, newStandardIndustryClassCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationPartOf getAsOrganizationPartOf() {
		return asOrganizationPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsOrganizationPartOf(OrganizationPartOf newAsOrganizationPartOf, NotificationChain msgs) {
		OrganizationPartOf oldAsOrganizationPartOf = asOrganizationPartOf;
		asOrganizationPartOf = newAsOrganizationPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZATION__AS_ORGANIZATION_PART_OF, oldAsOrganizationPartOf, newAsOrganizationPartOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsOrganizationPartOf(OrganizationPartOf newAsOrganizationPartOf) {
		if (newAsOrganizationPartOf != asOrganizationPartOf) {
			NotificationChain msgs = null;
			if (asOrganizationPartOf != null)
				msgs = ((InternalEObject)asOrganizationPartOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ORGANIZATION__AS_ORGANIZATION_PART_OF, null, msgs);
			if (newAsOrganizationPartOf != null)
				msgs = ((InternalEObject)newAsOrganizationPartOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ORGANIZATION__AS_ORGANIZATION_PART_OF, null, msgs);
			msgs = basicSetAsOrganizationPartOf(newAsOrganizationPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZATION__AS_ORGANIZATION_PART_OF, newAsOrganizationPartOf, newAsOrganizationPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullFlavor getNullFlavor() {
		return nullFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullFlavor(NullFlavor newNullFlavor) {
		NullFlavor oldNullFlavor = nullFlavor;
		nullFlavor = newNullFlavor == null ? NULL_FLAVOR_EDEFAULT : newNullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZATION__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullFlavor() {
		NullFlavor oldNullFlavor = nullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavor = NULL_FLAVOR_EDEFAULT;
		nullFlavorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.ORGANIZATION__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullFlavor() {
		return nullFlavorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClassOrganization getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(EntityClassOrganization newClassCode) {
		EntityClassOrganization oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZATION__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		EntityClassOrganization oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.ORGANIZATION__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassCode() {
		return classCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDeterminer getDeterminerCode() {
		return determinerCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeterminerCode(EntityDeterminer newDeterminerCode) {
		EntityDeterminer oldDeterminerCode = determinerCode;
		determinerCode = newDeterminerCode == null ? DETERMINER_CODE_EDEFAULT : newDeterminerCode;
		boolean oldDeterminerCodeESet = determinerCodeESet;
		determinerCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZATION__DETERMINER_CODE, oldDeterminerCode, determinerCode, !oldDeterminerCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeterminerCode() {
		EntityDeterminer oldDeterminerCode = determinerCode;
		boolean oldDeterminerCodeESet = determinerCodeESet;
		determinerCode = DETERMINER_CODE_EDEFAULT;
		determinerCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.ORGANIZATION__DETERMINER_CODE, oldDeterminerCode, DETERMINER_CODE_EDEFAULT, oldDeterminerCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeterminerCode() {
		return determinerCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.ORGANIZATION__REALM_CODE:
				return ((InternalEList<?>)getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZATION__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.ORGANIZATION__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZATION__ID:
				return ((InternalEList<?>)getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZATION__NAME:
				return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZATION__TELECOM:
				return ((InternalEList<?>)getTelecoms()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZATION__ADDR:
				return ((InternalEList<?>)getAddrs()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZATION__STANDARD_INDUSTRY_CLASS_CODE:
				return basicSetStandardIndustryClassCode(null, msgs);
			case CDAPackage.ORGANIZATION__AS_ORGANIZATION_PART_OF:
				return basicSetAsOrganizationPartOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.ORGANIZATION__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.ORGANIZATION__TYPE_ID:
				return getTypeId();
			case CDAPackage.ORGANIZATION__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.ORGANIZATION__ID:
				return getIds();
			case CDAPackage.ORGANIZATION__NAME:
				return getNames();
			case CDAPackage.ORGANIZATION__TELECOM:
				return getTelecoms();
			case CDAPackage.ORGANIZATION__ADDR:
				return getAddrs();
			case CDAPackage.ORGANIZATION__STANDARD_INDUSTRY_CLASS_CODE:
				return getStandardIndustryClassCode();
			case CDAPackage.ORGANIZATION__AS_ORGANIZATION_PART_OF:
				return getAsOrganizationPartOf();
			case CDAPackage.ORGANIZATION__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.ORGANIZATION__CLASS_CODE:
				return getClassCode();
			case CDAPackage.ORGANIZATION__DETERMINER_CODE:
				return getDeterminerCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDAPackage.ORGANIZATION__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.ORGANIZATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.ORGANIZATION__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.ORGANIZATION__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.ORGANIZATION__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends ON>)newValue);
				return;
			case CDAPackage.ORGANIZATION__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends TEL>)newValue);
				return;
			case CDAPackage.ORGANIZATION__ADDR:
				getAddrs().clear();
				getAddrs().addAll((Collection<? extends AD>)newValue);
				return;
			case CDAPackage.ORGANIZATION__STANDARD_INDUSTRY_CLASS_CODE:
				setStandardIndustryClassCode((CE)newValue);
				return;
			case CDAPackage.ORGANIZATION__AS_ORGANIZATION_PART_OF:
				setAsOrganizationPartOf((OrganizationPartOf)newValue);
				return;
			case CDAPackage.ORGANIZATION__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.ORGANIZATION__CLASS_CODE:
				setClassCode((EntityClassOrganization)newValue);
				return;
			case CDAPackage.ORGANIZATION__DETERMINER_CODE:
				setDeterminerCode((EntityDeterminer)newValue);
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
			case CDAPackage.ORGANIZATION__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.ORGANIZATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.ORGANIZATION__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.ORGANIZATION__ID:
				getIds().clear();
				return;
			case CDAPackage.ORGANIZATION__NAME:
				getNames().clear();
				return;
			case CDAPackage.ORGANIZATION__TELECOM:
				getTelecoms().clear();
				return;
			case CDAPackage.ORGANIZATION__ADDR:
				getAddrs().clear();
				return;
			case CDAPackage.ORGANIZATION__STANDARD_INDUSTRY_CLASS_CODE:
				setStandardIndustryClassCode((CE)null);
				return;
			case CDAPackage.ORGANIZATION__AS_ORGANIZATION_PART_OF:
				setAsOrganizationPartOf((OrganizationPartOf)null);
				return;
			case CDAPackage.ORGANIZATION__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.ORGANIZATION__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.ORGANIZATION__DETERMINER_CODE:
				unsetDeterminerCode();
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
			case CDAPackage.ORGANIZATION__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.ORGANIZATION__TYPE_ID:
				return typeId != null;
			case CDAPackage.ORGANIZATION__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.ORGANIZATION__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.ORGANIZATION__NAME:
				return names != null && !names.isEmpty();
			case CDAPackage.ORGANIZATION__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case CDAPackage.ORGANIZATION__ADDR:
				return addrs != null && !addrs.isEmpty();
			case CDAPackage.ORGANIZATION__STANDARD_INDUSTRY_CLASS_CODE:
				return standardIndustryClassCode != null;
			case CDAPackage.ORGANIZATION__AS_ORGANIZATION_PART_OF:
				return asOrganizationPartOf != null;
			case CDAPackage.ORGANIZATION__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.ORGANIZATION__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.ORGANIZATION__DETERMINER_CODE:
				return isSetDeterminerCode();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nullFlavor: ");
		if (nullFlavorESet) result.append(nullFlavor); else result.append("<unset>");
		result.append(", classCode: ");
		if (classCodeESet) result.append(classCode); else result.append("<unset>");
		result.append(", determinerCode: ");
		if (determinerCodeESet) result.append(determinerCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OrganizationImpl
