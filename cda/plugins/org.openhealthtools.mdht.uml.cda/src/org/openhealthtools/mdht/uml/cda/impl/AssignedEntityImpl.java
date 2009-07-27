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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getAssignedPerson <em>Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getRepresentedOrganization <em>Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl#getClassCode <em>Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignedEntityImpl extends EObjectImpl implements AssignedEntity {
	/**
	 * The cached value of the '{@link #getRealmCode() <em>Realm Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealmCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CS> realmCode;

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
	 * The cached value of the '{@link #getTemplateId() <em>Template Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected EList<II> templateId;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected EList<II> id;

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
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected EList<AD> addr;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<TEL> telecom;

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
	 * The cached value of the '{@link #getRepresentedOrganization() <em>Represented Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> representedOrganization;

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
		return CDAPackage.eINSTANCE.getAssignedEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.ASSIGNED_ENTITY__REALM_CODE);
		}
		return realmCode;
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
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID);
		}
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<II>(II.class, this, CDAPackage.ASSIGNED_ENTITY__ID);
		}
		return id;
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
	public EList<AD> getAddr() {
		if (addr == null) {
			addr = new EObjectContainmentEList<AD>(AD.class, this, CDAPackage.ASSIGNED_ENTITY__ADDR);
		}
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TEL> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<TEL>(TEL.class, this, CDAPackage.ASSIGNED_ENTITY__TELECOM);
		}
		return telecom;
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
	public EList<Organization> getRepresentedOrganization() {
		if (representedOrganization == null) {
			representedOrganization = new EObjectContainmentEList<Organization>(Organization.class, this, CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION);
		}
		return representedOrganization;
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
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.ASSIGNED_ENTITY__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.ASSIGNED_ENTITY__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case CDAPackage.ASSIGNED_ENTITY__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.ASSIGNED_ENTITY__ADDR:
				return ((InternalEList<?>)getAddr()).basicRemove(otherEnd, msgs);
			case CDAPackage.ASSIGNED_ENTITY__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON:
				return basicSetAssignedPerson(null, msgs);
			case CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION:
				return ((InternalEList<?>)getRepresentedOrganization()).basicRemove(otherEnd, msgs);
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
				return getRealmCode();
			case CDAPackage.ASSIGNED_ENTITY__TYPE_ID:
				return getTypeId();
			case CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.ASSIGNED_ENTITY__ID:
				return getId();
			case CDAPackage.ASSIGNED_ENTITY__CODE:
				return getCode();
			case CDAPackage.ASSIGNED_ENTITY__ADDR:
				return getAddr();
			case CDAPackage.ASSIGNED_ENTITY__TELECOM:
				return getTelecom();
			case CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON:
				return getAssignedPerson();
			case CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION:
				return getRepresentedOrganization();
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
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__ID:
				getId().clear();
				getId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__CODE:
				setCode((CE)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__ADDR:
				getAddr().clear();
				getAddr().addAll((Collection<? extends AD>)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends TEL>)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON:
				setAssignedPerson((Person)newValue);
				return;
			case CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION:
				getRepresentedOrganization().clear();
				getRepresentedOrganization().addAll((Collection<? extends Organization>)newValue);
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
				getRealmCode().clear();
				return;
			case CDAPackage.ASSIGNED_ENTITY__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.ASSIGNED_ENTITY__ID:
				getId().clear();
				return;
			case CDAPackage.ASSIGNED_ENTITY__CODE:
				setCode((CE)null);
				return;
			case CDAPackage.ASSIGNED_ENTITY__ADDR:
				getAddr().clear();
				return;
			case CDAPackage.ASSIGNED_ENTITY__TELECOM:
				getTelecom().clear();
				return;
			case CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON:
				setAssignedPerson((Person)null);
				return;
			case CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION:
				getRepresentedOrganization().clear();
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
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.ASSIGNED_ENTITY__TYPE_ID:
				return typeId != null;
			case CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.ASSIGNED_ENTITY__ID:
				return id != null && !id.isEmpty();
			case CDAPackage.ASSIGNED_ENTITY__CODE:
				return code != null;
			case CDAPackage.ASSIGNED_ENTITY__ADDR:
				return addr != null && !addr.isEmpty();
			case CDAPackage.ASSIGNED_ENTITY__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON:
				return assignedPerson != null;
			case CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION:
				return representedOrganization != null && !representedOrganization.isEmpty();
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
