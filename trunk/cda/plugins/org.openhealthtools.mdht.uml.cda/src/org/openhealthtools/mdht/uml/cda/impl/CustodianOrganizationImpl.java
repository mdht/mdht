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
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
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
 * An implementation of the model object '<em><b>Custodian Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl#getDeterminerCode <em>Determiner Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustodianOrganizationImpl extends EntityImpl implements CustodianOrganization {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected ON name;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected TEL telecom;

	/**
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected AD addr;

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
	protected CustodianOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.CUSTODIAN_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.CUSTODIAN_ORGANIZATION__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CUSTODIAN_ORGANIZATION__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CUSTODIAN_ORGANIZATION__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CUSTODIAN_ORGANIZATION__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CUSTODIAN_ORGANIZATION__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.CUSTODIAN_ORGANIZATION__TEMPLATE_ID);
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
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.CUSTODIAN_ORGANIZATION__ID);
		}
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ON getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(ON newName, NotificationChain msgs) {
		ON oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CUSTODIAN_ORGANIZATION__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(ON newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CUSTODIAN_ORGANIZATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CUSTODIAN_ORGANIZATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CUSTODIAN_ORGANIZATION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEL getTelecom() {
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelecom(TEL newTelecom, NotificationChain msgs) {
		TEL oldTelecom = telecom;
		telecom = newTelecom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CUSTODIAN_ORGANIZATION__TELECOM, oldTelecom, newTelecom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelecom(TEL newTelecom) {
		if (newTelecom != telecom) {
			NotificationChain msgs = null;
			if (telecom != null)
				msgs = ((InternalEObject)telecom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CUSTODIAN_ORGANIZATION__TELECOM, null, msgs);
			if (newTelecom != null)
				msgs = ((InternalEObject)newTelecom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CUSTODIAN_ORGANIZATION__TELECOM, null, msgs);
			msgs = basicSetTelecom(newTelecom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CUSTODIAN_ORGANIZATION__TELECOM, newTelecom, newTelecom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD getAddr() {
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddr(AD newAddr, NotificationChain msgs) {
		AD oldAddr = addr;
		addr = newAddr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CUSTODIAN_ORGANIZATION__ADDR, oldAddr, newAddr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(AD newAddr) {
		if (newAddr != addr) {
			NotificationChain msgs = null;
			if (addr != null)
				msgs = ((InternalEObject)addr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CUSTODIAN_ORGANIZATION__ADDR, null, msgs);
			if (newAddr != null)
				msgs = ((InternalEObject)newAddr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CUSTODIAN_ORGANIZATION__ADDR, null, msgs);
			msgs = basicSetAddr(newAddr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CUSTODIAN_ORGANIZATION__ADDR, newAddr, newAddr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CUSTODIAN_ORGANIZATION__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.CUSTODIAN_ORGANIZATION__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CUSTODIAN_ORGANIZATION__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.CUSTODIAN_ORGANIZATION__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CUSTODIAN_ORGANIZATION__DETERMINER_CODE, oldDeterminerCode, determinerCode, !oldDeterminerCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.CUSTODIAN_ORGANIZATION__DETERMINER_CODE, oldDeterminerCode, DETERMINER_CODE_EDEFAULT, oldDeterminerCodeESet));
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
			case CDAPackage.CUSTODIAN_ORGANIZATION__REALM_CODE:
				return ((InternalEList<?>)getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.CUSTODIAN_ORGANIZATION__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.CUSTODIAN_ORGANIZATION__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.CUSTODIAN_ORGANIZATION__ID:
				return ((InternalEList<?>)getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.CUSTODIAN_ORGANIZATION__NAME:
				return basicSetName(null, msgs);
			case CDAPackage.CUSTODIAN_ORGANIZATION__TELECOM:
				return basicSetTelecom(null, msgs);
			case CDAPackage.CUSTODIAN_ORGANIZATION__ADDR:
				return basicSetAddr(null, msgs);
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
			case CDAPackage.CUSTODIAN_ORGANIZATION__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.CUSTODIAN_ORGANIZATION__TYPE_ID:
				return getTypeId();
			case CDAPackage.CUSTODIAN_ORGANIZATION__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.CUSTODIAN_ORGANIZATION__ID:
				return getIds();
			case CDAPackage.CUSTODIAN_ORGANIZATION__NAME:
				return getName();
			case CDAPackage.CUSTODIAN_ORGANIZATION__TELECOM:
				return getTelecom();
			case CDAPackage.CUSTODIAN_ORGANIZATION__ADDR:
				return getAddr();
			case CDAPackage.CUSTODIAN_ORGANIZATION__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.CUSTODIAN_ORGANIZATION__CLASS_CODE:
				return getClassCode();
			case CDAPackage.CUSTODIAN_ORGANIZATION__DETERMINER_CODE:
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
			case CDAPackage.CUSTODIAN_ORGANIZATION__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__NAME:
				setName((ON)newValue);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__TELECOM:
				setTelecom((TEL)newValue);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__ADDR:
				setAddr((AD)newValue);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__CLASS_CODE:
				setClassCode((EntityClassOrganization)newValue);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__DETERMINER_CODE:
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
			case CDAPackage.CUSTODIAN_ORGANIZATION__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__ID:
				getIds().clear();
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__NAME:
				setName((ON)null);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__TELECOM:
				setTelecom((TEL)null);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__ADDR:
				setAddr((AD)null);
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.CUSTODIAN_ORGANIZATION__DETERMINER_CODE:
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
			case CDAPackage.CUSTODIAN_ORGANIZATION__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.CUSTODIAN_ORGANIZATION__TYPE_ID:
				return typeId != null;
			case CDAPackage.CUSTODIAN_ORGANIZATION__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.CUSTODIAN_ORGANIZATION__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.CUSTODIAN_ORGANIZATION__NAME:
				return name != null;
			case CDAPackage.CUSTODIAN_ORGANIZATION__TELECOM:
				return telecom != null;
			case CDAPackage.CUSTODIAN_ORGANIZATION__ADDR:
				return addr != null;
			case CDAPackage.CUSTODIAN_ORGANIZATION__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.CUSTODIAN_ORGANIZATION__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.CUSTODIAN_ORGANIZATION__DETERMINER_CODE:
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

} //CustodianOrganizationImpl
