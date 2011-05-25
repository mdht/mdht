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
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;

import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

import org.openhealthtools.mdht.uml.hl7.vocab.ContextControl;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Authenticator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl#getSignatureCode <em>Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl#getAssignedEntity <em>Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl#getContextControlCode <em>Context Control Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LegalAuthenticatorImpl extends EObjectImpl implements LegalAuthenticator {
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
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected TS time;

	/**
	 * The cached value of the '{@link #getSignatureCode() <em>Signature Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureCode()
	 * @generated
	 * @ordered
	 */
	protected CS signatureCode;

	/**
	 * The cached value of the '{@link #getAssignedEntity() <em>Assigned Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedEntity()
	 * @generated
	 * @ordered
	 */
	protected AssignedEntity assignedEntity;

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
	 * The default value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final ParticipationType TYPE_CODE_EDEFAULT = ParticipationType.LA;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected ParticipationType typeCode = TYPE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextControlCode() <em>Context Control Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextControlCode()
	 * @generated
	 * @ordered
	 */
	protected static final ContextControl CONTEXT_CONTROL_CODE_EDEFAULT = ContextControl.OP;

	/**
	 * The cached value of the '{@link #getContextControlCode() <em>Context Control Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextControlCode()
	 * @generated
	 * @ordered
	 */
	protected ContextControl contextControlCode = CONTEXT_CONTROL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalAuthenticatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getLegalAuthenticator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.LEGAL_AUTHENTICATOR__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.LEGAL_AUTHENTICATOR__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LEGAL_AUTHENTICATOR__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LEGAL_AUTHENTICATOR__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LEGAL_AUTHENTICATOR__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.LEGAL_AUTHENTICATOR__TEMPLATE_ID);
		}
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(TS newTime, NotificationChain msgs) {
		TS oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.LEGAL_AUTHENTICATOR__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(TS newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LEGAL_AUTHENTICATOR__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LEGAL_AUTHENTICATOR__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LEGAL_AUTHENTICATOR__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS getSignatureCode() {
		return signatureCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureCode(CS newSignatureCode, NotificationChain msgs) {
		CS oldSignatureCode = signatureCode;
		signatureCode = newSignatureCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.LEGAL_AUTHENTICATOR__SIGNATURE_CODE, oldSignatureCode, newSignatureCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureCode(CS newSignatureCode) {
		if (newSignatureCode != signatureCode) {
			NotificationChain msgs = null;
			if (signatureCode != null)
				msgs = ((InternalEObject)signatureCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LEGAL_AUTHENTICATOR__SIGNATURE_CODE, null, msgs);
			if (newSignatureCode != null)
				msgs = ((InternalEObject)newSignatureCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LEGAL_AUTHENTICATOR__SIGNATURE_CODE, null, msgs);
			msgs = basicSetSignatureCode(newSignatureCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LEGAL_AUTHENTICATOR__SIGNATURE_CODE, newSignatureCode, newSignatureCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedEntity getAssignedEntity() {
		return assignedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedEntity(AssignedEntity newAssignedEntity, NotificationChain msgs) {
		AssignedEntity oldAssignedEntity = assignedEntity;
		assignedEntity = newAssignedEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.LEGAL_AUTHENTICATOR__ASSIGNED_ENTITY, oldAssignedEntity, newAssignedEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedEntity(AssignedEntity newAssignedEntity) {
		if (newAssignedEntity != assignedEntity) {
			NotificationChain msgs = null;
			if (assignedEntity != null)
				msgs = ((InternalEObject)assignedEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LEGAL_AUTHENTICATOR__ASSIGNED_ENTITY, null, msgs);
			if (newAssignedEntity != null)
				msgs = ((InternalEObject)newAssignedEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LEGAL_AUTHENTICATOR__ASSIGNED_ENTITY, null, msgs);
			msgs = basicSetAssignedEntity(newAssignedEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LEGAL_AUTHENTICATOR__ASSIGNED_ENTITY, newAssignedEntity, newAssignedEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LEGAL_AUTHENTICATOR__NULL_FLAVOR, oldNullFlavor, nullFlavor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationType getTypeCode() {
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCode(ParticipationType newTypeCode) {
		ParticipationType oldTypeCode = typeCode;
		typeCode = newTypeCode == null ? TYPE_CODE_EDEFAULT : newTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LEGAL_AUTHENTICATOR__TYPE_CODE, oldTypeCode, typeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextControl getContextControlCode() {
		return contextControlCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextControlCode(ContextControl newContextControlCode) {
		ContextControl oldContextControlCode = contextControlCode;
		contextControlCode = newContextControlCode == null ? CONTEXT_CONTROL_CODE_EDEFAULT : newContextControlCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LEGAL_AUTHENTICATOR__CONTEXT_CONTROL_CODE, oldContextControlCode, contextControlCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.LEGAL_AUTHENTICATOR__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.LEGAL_AUTHENTICATOR__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.LEGAL_AUTHENTICATOR__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.LEGAL_AUTHENTICATOR__TIME:
				return basicSetTime(null, msgs);
			case CDAPackage.LEGAL_AUTHENTICATOR__SIGNATURE_CODE:
				return basicSetSignatureCode(null, msgs);
			case CDAPackage.LEGAL_AUTHENTICATOR__ASSIGNED_ENTITY:
				return basicSetAssignedEntity(null, msgs);
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
			case CDAPackage.LEGAL_AUTHENTICATOR__REALM_CODE:
				return getRealmCode();
			case CDAPackage.LEGAL_AUTHENTICATOR__TYPE_ID:
				return getTypeId();
			case CDAPackage.LEGAL_AUTHENTICATOR__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.LEGAL_AUTHENTICATOR__TIME:
				return getTime();
			case CDAPackage.LEGAL_AUTHENTICATOR__SIGNATURE_CODE:
				return getSignatureCode();
			case CDAPackage.LEGAL_AUTHENTICATOR__ASSIGNED_ENTITY:
				return getAssignedEntity();
			case CDAPackage.LEGAL_AUTHENTICATOR__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.LEGAL_AUTHENTICATOR__TYPE_CODE:
				return getTypeCode();
			case CDAPackage.LEGAL_AUTHENTICATOR__CONTEXT_CONTROL_CODE:
				return getContextControlCode();
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
			case CDAPackage.LEGAL_AUTHENTICATOR__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__TIME:
				setTime((TS)newValue);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__SIGNATURE_CODE:
				setSignatureCode((CS)newValue);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__ASSIGNED_ENTITY:
				setAssignedEntity((AssignedEntity)newValue);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__TYPE_CODE:
				setTypeCode((ParticipationType)newValue);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__CONTEXT_CONTROL_CODE:
				setContextControlCode((ContextControl)newValue);
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
			case CDAPackage.LEGAL_AUTHENTICATOR__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__TIME:
				setTime((TS)null);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__SIGNATURE_CODE:
				setSignatureCode((CS)null);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__ASSIGNED_ENTITY:
				setAssignedEntity((AssignedEntity)null);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__NULL_FLAVOR:
				setNullFlavor(NULL_FLAVOR_EDEFAULT);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__TYPE_CODE:
				setTypeCode(TYPE_CODE_EDEFAULT);
				return;
			case CDAPackage.LEGAL_AUTHENTICATOR__CONTEXT_CONTROL_CODE:
				setContextControlCode(CONTEXT_CONTROL_CODE_EDEFAULT);
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
			case CDAPackage.LEGAL_AUTHENTICATOR__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.LEGAL_AUTHENTICATOR__TYPE_ID:
				return typeId != null;
			case CDAPackage.LEGAL_AUTHENTICATOR__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.LEGAL_AUTHENTICATOR__TIME:
				return time != null;
			case CDAPackage.LEGAL_AUTHENTICATOR__SIGNATURE_CODE:
				return signatureCode != null;
			case CDAPackage.LEGAL_AUTHENTICATOR__ASSIGNED_ENTITY:
				return assignedEntity != null;
			case CDAPackage.LEGAL_AUTHENTICATOR__NULL_FLAVOR:
				return nullFlavor != NULL_FLAVOR_EDEFAULT;
			case CDAPackage.LEGAL_AUTHENTICATOR__TYPE_CODE:
				return typeCode != TYPE_CODE_EDEFAULT;
			case CDAPackage.LEGAL_AUTHENTICATOR__CONTEXT_CONTROL_CODE:
				return contextControlCode != CONTEXT_CONTROL_CODE_EDEFAULT;
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
		result.append(", typeCode: ");
		result.append(typeCode);
		result.append(", contextControlCode: ");
		result.append(contextControlCode);
		result.append(')');
		return result.toString();
	}

} //LegalAuthenticatorImpl