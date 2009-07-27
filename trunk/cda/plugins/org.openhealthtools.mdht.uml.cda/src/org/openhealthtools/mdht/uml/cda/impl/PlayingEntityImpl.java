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

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;

import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playing Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl#getDeterminerCode <em>Determiner Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayingEntityImpl extends EObjectImpl implements PlayingEntity {
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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CE code;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<PQ> quantity;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<PN> name;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected ED desc;

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
	protected static final EntityClassRoot CLASS_CODE_EDEFAULT = EntityClassRoot.ENT;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected EntityClassRoot classCode = CLASS_CODE_EDEFAULT;

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
	protected PlayingEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getPlayingEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.PLAYING_ENTITY__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PLAYING_ENTITY__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PLAYING_ENTITY__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PLAYING_ENTITY__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PLAYING_ENTITY__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.PLAYING_ENTITY__TEMPLATE_ID);
		}
		return templateId;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PLAYING_ENTITY__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PLAYING_ENTITY__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PLAYING_ENTITY__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PLAYING_ENTITY__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PQ> getQuantity() {
		if (quantity == null) {
			quantity = new EObjectContainmentEList<PQ>(PQ.class, this, CDAPackage.PLAYING_ENTITY__QUANTITY);
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PN> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<PN>(PN.class, this, CDAPackage.PLAYING_ENTITY__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesc(ED newDesc, NotificationChain msgs) {
		ED oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PLAYING_ENTITY__DESC, oldDesc, newDesc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(ED newDesc) {
		if (newDesc != desc) {
			NotificationChain msgs = null;
			if (desc != null)
				msgs = ((InternalEObject)desc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PLAYING_ENTITY__DESC, null, msgs);
			if (newDesc != null)
				msgs = ((InternalEObject)newDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PLAYING_ENTITY__DESC, null, msgs);
			msgs = basicSetDesc(newDesc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PLAYING_ENTITY__DESC, newDesc, newDesc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PLAYING_ENTITY__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.PLAYING_ENTITY__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
	public EntityClassRoot getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(EntityClassRoot newClassCode) {
		EntityClassRoot oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PLAYING_ENTITY__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		EntityClassRoot oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.PLAYING_ENTITY__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PLAYING_ENTITY__DETERMINER_CODE, oldDeterminerCode, determinerCode, !oldDeterminerCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.PLAYING_ENTITY__DETERMINER_CODE, oldDeterminerCode, DETERMINER_CODE_EDEFAULT, oldDeterminerCodeESet));
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
			case CDAPackage.PLAYING_ENTITY__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.PLAYING_ENTITY__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.PLAYING_ENTITY__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.PLAYING_ENTITY__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.PLAYING_ENTITY__QUANTITY:
				return ((InternalEList<?>)getQuantity()).basicRemove(otherEnd, msgs);
			case CDAPackage.PLAYING_ENTITY__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case CDAPackage.PLAYING_ENTITY__DESC:
				return basicSetDesc(null, msgs);
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
			case CDAPackage.PLAYING_ENTITY__REALM_CODE:
				return getRealmCode();
			case CDAPackage.PLAYING_ENTITY__TYPE_ID:
				return getTypeId();
			case CDAPackage.PLAYING_ENTITY__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.PLAYING_ENTITY__CODE:
				return getCode();
			case CDAPackage.PLAYING_ENTITY__QUANTITY:
				return getQuantity();
			case CDAPackage.PLAYING_ENTITY__NAME:
				return getName();
			case CDAPackage.PLAYING_ENTITY__DESC:
				return getDesc();
			case CDAPackage.PLAYING_ENTITY__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.PLAYING_ENTITY__CLASS_CODE:
				return getClassCode();
			case CDAPackage.PLAYING_ENTITY__DETERMINER_CODE:
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
			case CDAPackage.PLAYING_ENTITY__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.PLAYING_ENTITY__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.PLAYING_ENTITY__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.PLAYING_ENTITY__CODE:
				setCode((CE)newValue);
				return;
			case CDAPackage.PLAYING_ENTITY__QUANTITY:
				getQuantity().clear();
				getQuantity().addAll((Collection<? extends PQ>)newValue);
				return;
			case CDAPackage.PLAYING_ENTITY__NAME:
				getName().clear();
				getName().addAll((Collection<? extends PN>)newValue);
				return;
			case CDAPackage.PLAYING_ENTITY__DESC:
				setDesc((ED)newValue);
				return;
			case CDAPackage.PLAYING_ENTITY__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.PLAYING_ENTITY__CLASS_CODE:
				setClassCode((EntityClassRoot)newValue);
				return;
			case CDAPackage.PLAYING_ENTITY__DETERMINER_CODE:
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
			case CDAPackage.PLAYING_ENTITY__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.PLAYING_ENTITY__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.PLAYING_ENTITY__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.PLAYING_ENTITY__CODE:
				setCode((CE)null);
				return;
			case CDAPackage.PLAYING_ENTITY__QUANTITY:
				getQuantity().clear();
				return;
			case CDAPackage.PLAYING_ENTITY__NAME:
				getName().clear();
				return;
			case CDAPackage.PLAYING_ENTITY__DESC:
				setDesc((ED)null);
				return;
			case CDAPackage.PLAYING_ENTITY__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.PLAYING_ENTITY__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.PLAYING_ENTITY__DETERMINER_CODE:
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
			case CDAPackage.PLAYING_ENTITY__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.PLAYING_ENTITY__TYPE_ID:
				return typeId != null;
			case CDAPackage.PLAYING_ENTITY__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.PLAYING_ENTITY__CODE:
				return code != null;
			case CDAPackage.PLAYING_ENTITY__QUANTITY:
				return quantity != null && !quantity.isEmpty();
			case CDAPackage.PLAYING_ENTITY__NAME:
				return name != null && !name.isEmpty();
			case CDAPackage.PLAYING_ENTITY__DESC:
				return desc != null;
			case CDAPackage.PLAYING_ENTITY__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.PLAYING_ENTITY__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.PLAYING_ENTITY__DETERMINER_CODE:
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

} //PlayingEntityImpl
