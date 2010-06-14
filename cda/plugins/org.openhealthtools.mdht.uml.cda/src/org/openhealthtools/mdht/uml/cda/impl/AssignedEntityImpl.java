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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.SDTCPatient;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getAddrs <em>Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getSDTCPatient <em>SDTC Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getAssignedPerson <em>Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getRepresentedOrganizations <em>Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getClassCode <em>Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignedEntityImpl extends EObjectImpl implements AssignedEntity {
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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CE code;

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
	 * The cached value of the '{@link #getTelecoms() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms()
	 * @generated
	 * @ordered
	 */
	protected EList<TEL> telecoms;

	/**
	 * The cached value of the '{@link #getSDTCPatient() <em>SDTC Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDTCPatient()
	 * @generated
	 * @ordered
	 */
	protected SDTCPatient sDTCPatient;

	/**
	 * The cached value of the '{@link #getAssignedPerson() <em>Assigned Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedPerson()
	 * @generated
	 * @ordered
	 */
	protected Person assignedPerson;

	/**
	 * The cached value of the '{@link #getRepresentedOrganizations() <em>Represented Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedOrganizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> representedOrganizations;

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
	protected static final RoleClassAssignedEntity CLASS_CODE_EDEFAULT = RoleClassAssignedEntity.ASSIGNED;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected RoleClassAssignedEntity classCode = CLASS_CODE_EDEFAULT;

	/**
	 * This is true if the Class Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.ASSIGNED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.ASSIGNED_ENTITY__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ASSIGNED_ENTITY__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ASSIGNED_ENTITY__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ASSIGNED_ENTITY__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ASSIGNED_ENTITY__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID);
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
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.ASSIGNED_ENTITY__ID);
		}
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CE newCode, NotificationChain msgs) {
		CE oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ASSIGNED_ENTITY__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CE newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ASSIGNED_ENTITY__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ASSIGNED_ENTITY__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ASSIGNED_ENTITY__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AD> getAddrs() {
		if (addrs == null) {
			addrs = new EObjectContainmentEList<AD>(AD.class, this, CDAPackage.ASSIGNED_ENTITY__ADDR);
		}
		return addrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TEL> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectContainmentEList<TEL>(TEL.class, this, CDAPackage.ASSIGNED_ENTITY__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDTCPatient getSDTCPatient() {
		return sDTCPatient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSDTCPatient(SDTCPatient newSDTCPatient, NotificationChain msgs) {
		SDTCPatient oldSDTCPatient = sDTCPatient;
		sDTCPatient = newSDTCPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ASSIGNED_ENTITY__SDTC_PATIENT, oldSDTCPatient, newSDTCPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDTCPatient(SDTCPatient newSDTCPatient) {
		if (newSDTCPatient != sDTCPatient) {
			NotificationChain msgs = null;
			if (sDTCPatient != null)
				msgs = ((InternalEObject)sDTCPatient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ASSIGNED_ENTITY__SDTC_PATIENT, null, msgs);
			if (newSDTCPatient != null)
				msgs = ((InternalEObject)newSDTCPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ASSIGNED_ENTITY__SDTC_PATIENT, null, msgs);
			msgs = basicSetSDTCPatient(newSDTCPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ASSIGNED_ENTITY__SDTC_PATIENT, newSDTCPatient, newSDTCPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getAssignedPerson() {
		return assignedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedPerson(Person newAssignedPerson, NotificationChain msgs) {
		Person oldAssignedPerson = assignedPerson;
		assignedPerson = newAssignedPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON, oldAssignedPerson, newAssignedPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedPerson(Person newAssignedPerson) {
		if (newAssignedPerson != assignedPerson) {
			NotificationChain msgs = null;
			if (assignedPerson != null)
				msgs = ((InternalEObject)assignedPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON, null, msgs);
			if (newAssignedPerson != null)
				msgs = ((InternalEObject)newAssignedPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON, null, msgs);
			msgs = basicSetAssignedPerson(newAssignedPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON, newAssignedPerson, newAssignedPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getRepresentedOrganizations() {
		if (representedOrganizations == null) {
			representedOrganizations = new EObjectContainmentEList<Organization>(Organization.class, this, CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION);
		}
		return representedOrganizations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ASSIGNED_ENTITY__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.ASSIGNED_ENTITY__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
	public RoleClassAssignedEntity getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(RoleClassAssignedEntity newClassCode) {
		RoleClassAssignedEntity oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ASSIGNED_ENTITY__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		RoleClassAssignedEntity oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.ASSIGNED_ENTITY__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.ASSIGNED_ENTITY__REALM_CODE:
				return ((InternalEList<?>)getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.ASSIGNED_ENTITY__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.ASSIGNED_ENTITY__ID:
				return ((InternalEList<?>)getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.ASSIGNED_ENTITY__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.ASSIGNED_ENTITY__ADDR:
				return ((InternalEList<?>)getAddrs()).basicRemove(otherEnd, msgs);
			case CDAPackage.ASSIGNED_ENTITY__TELECOM:
				return ((InternalEList<?>)getTelecoms()).basicRemove(otherEnd, msgs);
			case CDAPackage.ASSIGNED_ENTITY__SDTC_PATIENT:
				return basicSetSDTCPatient(null, msgs);
			case CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON:
				return basicSetAssignedPerson(null, msgs);
			case CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION:
				return ((InternalEList<?>)getRepresentedOrganizations()).basicRemove(otherEnd, msgs);
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
			case CDAPackage.ASSIGNED_ENTITY__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.ASSIGNED_ENTITY__TYPE_ID:
				return getTypeId();
			case CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.ASSIGNED_ENTITY__ID:
				return getIds();
			case CDAPackage.ASSIGNED_ENTITY__CODE:
				return getCode();
			case CDAPackage.ASSIGNED_ENTITY__ADDR:
				return getAddrs();
			case CDAPackage.ASSIGNED_ENTITY__TELECOM:
				return getTelecoms();
			case CDAPackage.ASSIGNED_ENTITY__SDTC_PATIENT:
				return getSDTCPatient();
			case CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON:
				return getAssignedPerson();
			case CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION:
				return getRepresentedOrganizations();
			case CDAPackage.ASSIGNED_ENTITY__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.ASSIGNED_ENTITY__CLASS_CODE:
				return getClassCode();
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
			case CDAPackage.ASSIGNED_ENTITY__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__CODE:
				setCode((CE)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__ADDR:
				getAddrs().clear();
				getAddrs().addAll((Collection<? extends AD>)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends TEL>)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__SDTC_PATIENT:
				setSDTCPatient((SDTCPatient)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON:
				setAssignedPerson((Person)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION:
				getRepresentedOrganizations().clear();
				getRepresentedOrganizations().addAll((Collection<? extends Organization>)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__CLASS_CODE:
				setClassCode((RoleClassAssignedEntity)newValue);
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
			case CDAPackage.ASSIGNED_ENTITY__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.ASSIGNED_ENTITY__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.ASSIGNED_ENTITY__ID:
				getIds().clear();
				return;
			case CDAPackage.ASSIGNED_ENTITY__CODE:
				setCode((CE)null);
				return;
			case CDAPackage.ASSIGNED_ENTITY__ADDR:
				getAddrs().clear();
				return;
			case CDAPackage.ASSIGNED_ENTITY__TELECOM:
				getTelecoms().clear();
				return;
			case CDAPackage.ASSIGNED_ENTITY__SDTC_PATIENT:
				setSDTCPatient((SDTCPatient)null);
				return;
			case CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON:
				setAssignedPerson((Person)null);
				return;
			case CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION:
				getRepresentedOrganizations().clear();
				return;
			case CDAPackage.ASSIGNED_ENTITY__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.ASSIGNED_ENTITY__CLASS_CODE:
				unsetClassCode();
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
			case CDAPackage.ASSIGNED_ENTITY__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.ASSIGNED_ENTITY__TYPE_ID:
				return typeId != null;
			case CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.ASSIGNED_ENTITY__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.ASSIGNED_ENTITY__CODE:
				return code != null;
			case CDAPackage.ASSIGNED_ENTITY__ADDR:
				return addrs != null && !addrs.isEmpty();
			case CDAPackage.ASSIGNED_ENTITY__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case CDAPackage.ASSIGNED_ENTITY__SDTC_PATIENT:
				return sDTCPatient != null;
			case CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON:
				return assignedPerson != null;
			case CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION:
				return representedOrganizations != null && !representedOrganizations.isEmpty();
			case CDAPackage.ASSIGNED_ENTITY__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.ASSIGNED_ENTITY__CLASS_CODE:
				return isSetClassCode();
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
		result.append(')');
		return result.toString();
	}

} //AssignedEntityImpl
