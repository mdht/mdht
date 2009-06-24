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
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Device;
import org.openhealthtools.mdht.uml.cda.Entity;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.operations.ParticipantRoleOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getPlayingDevice <em>Playing Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getPlayingEntity <em>Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getScopingEntity <em>Scoping Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl#getClassCode <em>Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantRoleImpl extends EObjectImpl implements ParticipantRole {
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
	 * The cached value of the '{@link #getPlayingDevice() <em>Playing Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayingDevice()
	 * @generated
	 * @ordered
	 */
	protected Device playingDevice;

	/**
	 * The cached value of the '{@link #getPlayingEntity() <em>Playing Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayingEntity()
	 * @generated
	 * @ordered
	 */
	protected PlayingEntity playingEntity;

	/**
	 * The cached value of the '{@link #getScopingEntity() <em>Scoping Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopingEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity scopingEntity;

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
	 * The default value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected static final RoleClassRoot CLASS_CODE_EDEFAULT = RoleClassRoot.ROL;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected RoleClassRoot classCode = CLASS_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getParticipantRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.PARTICIPANT_ROLE__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PARTICIPANT_ROLE__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PARTICIPANT_ROLE__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.PARTICIPANT_ROLE__TEMPLATE_ID);
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
			id = new EObjectContainmentEList<II>(II.class, this, CDAPackage.PARTICIPANT_ROLE__ID);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PARTICIPANT_ROLE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PARTICIPANT_ROLE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AD> getAddr() {
		if (addr == null) {
			addr = new EObjectContainmentEList<AD>(AD.class, this, CDAPackage.PARTICIPANT_ROLE__ADDR);
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
			telecom = new EObjectContainmentEList<TEL>(TEL.class, this, CDAPackage.PARTICIPANT_ROLE__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getPlayingDevice() {
		return playingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayingDevice(Device newPlayingDevice, NotificationChain msgs) {
		Device oldPlayingDevice = playingDevice;
		playingDevice = newPlayingDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE, oldPlayingDevice, newPlayingDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayingDevice(Device newPlayingDevice) {
		if (newPlayingDevice != playingDevice) {
			NotificationChain msgs = null;
			if (playingDevice != null)
				msgs = ((InternalEObject)playingDevice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE, null, msgs);
			if (newPlayingDevice != null)
				msgs = ((InternalEObject)newPlayingDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE, null, msgs);
			msgs = basicSetPlayingDevice(newPlayingDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE, newPlayingDevice, newPlayingDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayingEntity getPlayingEntity() {
		return playingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayingEntity(PlayingEntity newPlayingEntity, NotificationChain msgs) {
		PlayingEntity oldPlayingEntity = playingEntity;
		playingEntity = newPlayingEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY, oldPlayingEntity, newPlayingEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayingEntity(PlayingEntity newPlayingEntity) {
		if (newPlayingEntity != playingEntity) {
			NotificationChain msgs = null;
			if (playingEntity != null)
				msgs = ((InternalEObject)playingEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY, null, msgs);
			if (newPlayingEntity != null)
				msgs = ((InternalEObject)newPlayingEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY, null, msgs);
			msgs = basicSetPlayingEntity(newPlayingEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY, newPlayingEntity, newPlayingEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getScopingEntity() {
		return scopingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScopingEntity(Entity newScopingEntity, NotificationChain msgs) {
		Entity oldScopingEntity = scopingEntity;
		scopingEntity = newScopingEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY, oldScopingEntity, newScopingEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopingEntity(Entity newScopingEntity) {
		if (newScopingEntity != scopingEntity) {
			NotificationChain msgs = null;
			if (scopingEntity != null)
				msgs = ((InternalEObject)scopingEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY, null, msgs);
			if (newScopingEntity != null)
				msgs = ((InternalEObject)newScopingEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY, null, msgs);
			msgs = basicSetScopingEntity(newScopingEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY, newScopingEntity, newScopingEntity));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__NULL_FLAVOR, oldNullFlavor, nullFlavor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassRoot getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(RoleClassRoot newClassCode) {
		RoleClassRoot oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPANT_ROLE__CLASS_CODE, oldClassCode, classCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean playingEntityChoice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ParticipantRoleOperations.playingEntityChoice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.PARTICIPANT_ROLE__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.PARTICIPANT_ROLE__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.PARTICIPANT_ROLE__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.PARTICIPANT_ROLE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case CDAPackage.PARTICIPANT_ROLE__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.PARTICIPANT_ROLE__ADDR:
				return ((InternalEList<?>)getAddr()).basicRemove(otherEnd, msgs);
			case CDAPackage.PARTICIPANT_ROLE__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE:
				return basicSetPlayingDevice(null, msgs);
			case CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY:
				return basicSetPlayingEntity(null, msgs);
			case CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY:
				return basicSetScopingEntity(null, msgs);
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
			case CDAPackage.PARTICIPANT_ROLE__REALM_CODE:
				return getRealmCode();
			case CDAPackage.PARTICIPANT_ROLE__TYPE_ID:
				return getTypeId();
			case CDAPackage.PARTICIPANT_ROLE__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.PARTICIPANT_ROLE__ID:
				return getId();
			case CDAPackage.PARTICIPANT_ROLE__CODE:
				return getCode();
			case CDAPackage.PARTICIPANT_ROLE__ADDR:
				return getAddr();
			case CDAPackage.PARTICIPANT_ROLE__TELECOM:
				return getTelecom();
			case CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE:
				return getPlayingDevice();
			case CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY:
				return getPlayingEntity();
			case CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY:
				return getScopingEntity();
			case CDAPackage.PARTICIPANT_ROLE__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.PARTICIPANT_ROLE__CLASS_CODE:
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
			case CDAPackage.PARTICIPANT_ROLE__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.PARTICIPANT_ROLE__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.PARTICIPANT_ROLE__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.PARTICIPANT_ROLE__ID:
				getId().clear();
				getId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.PARTICIPANT_ROLE__CODE:
				setCode((CE)newValue);
				return;
			case CDAPackage.PARTICIPANT_ROLE__ADDR:
				getAddr().clear();
				getAddr().addAll((Collection<? extends AD>)newValue);
				return;
			case CDAPackage.PARTICIPANT_ROLE__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends TEL>)newValue);
				return;
			case CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE:
				setPlayingDevice((Device)newValue);
				return;
			case CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY:
				setPlayingEntity((PlayingEntity)newValue);
				return;
			case CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY:
				setScopingEntity((Entity)newValue);
				return;
			case CDAPackage.PARTICIPANT_ROLE__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.PARTICIPANT_ROLE__CLASS_CODE:
				setClassCode((RoleClassRoot)newValue);
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
			case CDAPackage.PARTICIPANT_ROLE__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.PARTICIPANT_ROLE__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.PARTICIPANT_ROLE__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.PARTICIPANT_ROLE__ID:
				getId().clear();
				return;
			case CDAPackage.PARTICIPANT_ROLE__CODE:
				setCode((CE)null);
				return;
			case CDAPackage.PARTICIPANT_ROLE__ADDR:
				getAddr().clear();
				return;
			case CDAPackage.PARTICIPANT_ROLE__TELECOM:
				getTelecom().clear();
				return;
			case CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE:
				setPlayingDevice((Device)null);
				return;
			case CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY:
				setPlayingEntity((PlayingEntity)null);
				return;
			case CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY:
				setScopingEntity((Entity)null);
				return;
			case CDAPackage.PARTICIPANT_ROLE__NULL_FLAVOR:
				setNullFlavor(NULL_FLAVOR_EDEFAULT);
				return;
			case CDAPackage.PARTICIPANT_ROLE__CLASS_CODE:
				setClassCode(CLASS_CODE_EDEFAULT);
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
			case CDAPackage.PARTICIPANT_ROLE__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.PARTICIPANT_ROLE__TYPE_ID:
				return typeId != null;
			case CDAPackage.PARTICIPANT_ROLE__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.PARTICIPANT_ROLE__ID:
				return id != null && !id.isEmpty();
			case CDAPackage.PARTICIPANT_ROLE__CODE:
				return code != null;
			case CDAPackage.PARTICIPANT_ROLE__ADDR:
				return addr != null && !addr.isEmpty();
			case CDAPackage.PARTICIPANT_ROLE__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE:
				return playingDevice != null;
			case CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY:
				return playingEntity != null;
			case CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY:
				return scopingEntity != null;
			case CDAPackage.PARTICIPANT_ROLE__NULL_FLAVOR:
				return nullFlavor != NULL_FLAVOR_EDEFAULT;
			case CDAPackage.PARTICIPANT_ROLE__CLASS_CODE:
				return classCode != CLASS_CODE_EDEFAULT;
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
		result.append(nullFlavor);
		result.append(", classCode: ");
		result.append(classCode);
		result.append(')');
		return result.toString();
	}

} //ParticipantRoleImpl
