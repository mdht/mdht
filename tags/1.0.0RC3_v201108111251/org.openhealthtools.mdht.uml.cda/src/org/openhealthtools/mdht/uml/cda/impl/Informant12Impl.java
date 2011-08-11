/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.RelatedEntity;
import org.openhealthtools.mdht.uml.cda.operations.Informant12Operations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.rim.impl.ParticipationImpl;
import org.openhealthtools.mdht.uml.hl7.vocab.ContextControl;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Informant12</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Informant12Impl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Informant12Impl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Informant12Impl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Informant12Impl#getAssignedEntity <em>Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Informant12Impl#getRelatedEntity <em>Related Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Informant12Impl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Informant12Impl#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Informant12Impl#getContextControlCode <em>Context Control Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Informant12Impl extends ParticipationImpl implements Informant12 {
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
	 * The cached value of the '{@link #getAssignedEntity() <em>Assigned Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedEntity()
	 * @generated
	 * @ordered
	 */
	protected AssignedEntity assignedEntity;

	/**
	 * The cached value of the '{@link #getRelatedEntity() <em>Related Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedEntity()
	 * @generated
	 * @ordered
	 */
	protected RelatedEntity relatedEntity;

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
	 * The default value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final ParticipationType TYPE_CODE_EDEFAULT = ParticipationType.INF;

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
	 * This is true if the Type Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCodeESet;

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
	 * This is true if the Context Control Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contextControlCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Informant12Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.INFORMANT12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.INFORMANT12__REALM_CODE);
		}
		return realmCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.INFORMANT12__TYPE_ID, oldTypeId, newTypeId);
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
	 * @generated
	 */
	public void setTypeId(InfrastructureRootTypeId newTypeId) {
		if (newTypeId != typeId) {
			NotificationChain msgs = null;
			if (typeId != null) {
				msgs = ((InternalEObject) typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INFORMANT12__TYPE_ID, null, msgs);
			}
			if (newTypeId != null) {
				msgs = ((InternalEObject) newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INFORMANT12__TYPE_ID, null, msgs);
			}
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.INFORMANT12__TYPE_ID, newTypeId, newTypeId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.INFORMANT12__TEMPLATE_ID);
		}
		return templateIds;
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.INFORMANT12__ASSIGNED_ENTITY, oldAssignedEntity, newAssignedEntity);
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
	 * @generated
	 */
	public void setAssignedEntity(AssignedEntity newAssignedEntity) {
		if (newAssignedEntity != assignedEntity) {
			NotificationChain msgs = null;
			if (assignedEntity != null) {
				msgs = ((InternalEObject) assignedEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INFORMANT12__ASSIGNED_ENTITY, null, msgs);
			}
			if (newAssignedEntity != null) {
				msgs = ((InternalEObject) newAssignedEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INFORMANT12__ASSIGNED_ENTITY, null, msgs);
			}
			msgs = basicSetAssignedEntity(newAssignedEntity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.INFORMANT12__ASSIGNED_ENTITY, newAssignedEntity, newAssignedEntity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedEntity getRelatedEntity() {
		return relatedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedEntity(RelatedEntity newRelatedEntity, NotificationChain msgs) {
		RelatedEntity oldRelatedEntity = relatedEntity;
		relatedEntity = newRelatedEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.INFORMANT12__RELATED_ENTITY, oldRelatedEntity, newRelatedEntity);
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
	 * @generated
	 */
	public void setRelatedEntity(RelatedEntity newRelatedEntity) {
		if (newRelatedEntity != relatedEntity) {
			NotificationChain msgs = null;
			if (relatedEntity != null) {
				msgs = ((InternalEObject) relatedEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INFORMANT12__RELATED_ENTITY, null, msgs);
			}
			if (newRelatedEntity != null) {
				msgs = ((InternalEObject) newRelatedEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INFORMANT12__RELATED_ENTITY, null, msgs);
			}
			msgs = basicSetRelatedEntity(newRelatedEntity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.INFORMANT12__RELATED_ENTITY, newRelatedEntity, newRelatedEntity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		nullFlavor = newNullFlavor == null
				? NULL_FLAVOR_EDEFAULT
				: newNullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavorESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.INFORMANT12__NULL_FLAVOR, oldNullFlavor, nullFlavor,
				!oldNullFlavorESet));
		}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.INFORMANT12__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT,
				oldNullFlavorESet));
		}
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
	@Override
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
		typeCode = newTypeCode == null
				? TYPE_CODE_EDEFAULT
				: newTypeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.INFORMANT12__TYPE_CODE, oldTypeCode, typeCode, !oldTypeCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCode() {
		ParticipationType oldTypeCode = typeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCode = TYPE_CODE_EDEFAULT;
		typeCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.INFORMANT12__TYPE_CODE, oldTypeCode, TYPE_CODE_EDEFAULT,
				oldTypeCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCode() {
		return typeCodeESet;
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
		contextControlCode = newContextControlCode == null
				? CONTEXT_CONTROL_CODE_EDEFAULT
				: newContextControlCode;
		boolean oldContextControlCodeESet = contextControlCodeESet;
		contextControlCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.INFORMANT12__CONTEXT_CONTROL_CODE, oldContextControlCode,
				contextControlCode, !oldContextControlCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextControlCode() {
		ContextControl oldContextControlCode = contextControlCode;
		boolean oldContextControlCodeESet = contextControlCodeESet;
		contextControlCode = CONTEXT_CONTROL_CODE_EDEFAULT;
		contextControlCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.INFORMANT12__CONTEXT_CONTROL_CODE, oldContextControlCode,
				CONTEXT_CONTROL_CODE_EDEFAULT, oldContextControlCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContextControlCode() {
		return contextControlCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformantChoice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Informant12Operations.validateInformantChoice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Informant12Operations.validateTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextControlCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Informant12Operations.validateContextControlCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.INFORMANT12__REALM_CODE:
				return ((InternalEList<?>) getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.INFORMANT12__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.INFORMANT12__TEMPLATE_ID:
				return ((InternalEList<?>) getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.INFORMANT12__ASSIGNED_ENTITY:
				return basicSetAssignedEntity(null, msgs);
			case CDAPackage.INFORMANT12__RELATED_ENTITY:
				return basicSetRelatedEntity(null, msgs);
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
			case CDAPackage.INFORMANT12__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.INFORMANT12__TYPE_ID:
				return getTypeId();
			case CDAPackage.INFORMANT12__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.INFORMANT12__ASSIGNED_ENTITY:
				return getAssignedEntity();
			case CDAPackage.INFORMANT12__RELATED_ENTITY:
				return getRelatedEntity();
			case CDAPackage.INFORMANT12__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.INFORMANT12__TYPE_CODE:
				return getTypeCode();
			case CDAPackage.INFORMANT12__CONTEXT_CONTROL_CODE:
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
			case CDAPackage.INFORMANT12__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>) newValue);
				return;
			case CDAPackage.INFORMANT12__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) newValue);
				return;
			case CDAPackage.INFORMANT12__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.INFORMANT12__ASSIGNED_ENTITY:
				setAssignedEntity((AssignedEntity) newValue);
				return;
			case CDAPackage.INFORMANT12__RELATED_ENTITY:
				setRelatedEntity((RelatedEntity) newValue);
				return;
			case CDAPackage.INFORMANT12__NULL_FLAVOR:
				setNullFlavor((NullFlavor) newValue);
				return;
			case CDAPackage.INFORMANT12__TYPE_CODE:
				setTypeCode((ParticipationType) newValue);
				return;
			case CDAPackage.INFORMANT12__CONTEXT_CONTROL_CODE:
				setContextControlCode((ContextControl) newValue);
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
			case CDAPackage.INFORMANT12__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.INFORMANT12__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) null);
				return;
			case CDAPackage.INFORMANT12__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.INFORMANT12__ASSIGNED_ENTITY:
				setAssignedEntity((AssignedEntity) null);
				return;
			case CDAPackage.INFORMANT12__RELATED_ENTITY:
				setRelatedEntity((RelatedEntity) null);
				return;
			case CDAPackage.INFORMANT12__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.INFORMANT12__TYPE_CODE:
				unsetTypeCode();
				return;
			case CDAPackage.INFORMANT12__CONTEXT_CONTROL_CODE:
				unsetContextControlCode();
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
			case CDAPackage.INFORMANT12__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.INFORMANT12__TYPE_ID:
				return typeId != null;
			case CDAPackage.INFORMANT12__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.INFORMANT12__ASSIGNED_ENTITY:
				return assignedEntity != null;
			case CDAPackage.INFORMANT12__RELATED_ENTITY:
				return relatedEntity != null;
			case CDAPackage.INFORMANT12__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.INFORMANT12__TYPE_CODE:
				return isSetTypeCode();
			case CDAPackage.INFORMANT12__CONTEXT_CONTROL_CODE:
				return isSetContextControlCode();
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
		result.append(" (nullFlavor: ");
		if (nullFlavorESet) {
			result.append(nullFlavor);
		} else {
			result.append("<unset>");
		}
		result.append(", typeCode: ");
		if (typeCodeESet) {
			result.append(typeCode);
		} else {
			result.append("<unset>");
		}
		result.append(", contextControlCode: ");
		if (contextControlCodeESet) {
			result.append(contextControlCode);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // Informant12Impl
