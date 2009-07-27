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
import org.openhealthtools.mdht.uml.cda.Component3;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Section;

import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component3Impl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component3Impl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component3Impl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component3Impl#getSection <em>Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component3Impl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component3Impl#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component3Impl#getContextConductionInd <em>Context Conduction Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Component3Impl extends EObjectImpl implements Component3 {
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
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected Section section;

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
	protected static final ActRelationshipHasComponent TYPE_CODE_EDEFAULT = ActRelationshipHasComponent.COMP;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected ActRelationshipHasComponent typeCode = TYPE_CODE_EDEFAULT;

	/**
	 * This is true if the Type Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCodeESet;

	/**
	 * The default value of the '{@link #getContextConductionInd() <em>Context Conduction Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextConductionInd()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTEXT_CONDUCTION_IND_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getContextConductionInd() <em>Context Conduction Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextConductionInd()
	 * @generated
	 * @ordered
	 */
	protected Boolean contextConductionInd = CONTEXT_CONDUCTION_IND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Component3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getComponent3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.COMPONENT3__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT3__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT3__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT3__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT3__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.COMPONENT3__TEMPLATE_ID);
		}
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getSection() {
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSection(Section newSection, NotificationChain msgs) {
		Section oldSection = section;
		section = newSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT3__SECTION, oldSection, newSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(Section newSection) {
		if (newSection != section) {
			NotificationChain msgs = null;
			if (section != null)
				msgs = ((InternalEObject)section).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT3__SECTION, null, msgs);
			if (newSection != null)
				msgs = ((InternalEObject)newSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT3__SECTION, null, msgs);
			msgs = basicSetSection(newSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT3__SECTION, newSection, newSection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT3__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.COMPONENT3__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
	public ActRelationshipHasComponent getTypeCode() {
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCode(ActRelationshipHasComponent newTypeCode) {
		ActRelationshipHasComponent oldTypeCode = typeCode;
		typeCode = newTypeCode == null ? TYPE_CODE_EDEFAULT : newTypeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT3__TYPE_CODE, oldTypeCode, typeCode, !oldTypeCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCode() {
		ActRelationshipHasComponent oldTypeCode = typeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCode = TYPE_CODE_EDEFAULT;
		typeCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.COMPONENT3__TYPE_CODE, oldTypeCode, TYPE_CODE_EDEFAULT, oldTypeCodeESet));
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
	public Boolean getContextConductionInd() {
		return contextConductionInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextConductionInd(Boolean newContextConductionInd) {
		Boolean oldContextConductionInd = contextConductionInd;
		contextConductionInd = newContextConductionInd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT3__CONTEXT_CONDUCTION_IND, oldContextConductionInd, contextConductionInd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.COMPONENT3__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.COMPONENT3__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.COMPONENT3__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.COMPONENT3__SECTION:
				return basicSetSection(null, msgs);
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
			case CDAPackage.COMPONENT3__REALM_CODE:
				return getRealmCode();
			case CDAPackage.COMPONENT3__TYPE_ID:
				return getTypeId();
			case CDAPackage.COMPONENT3__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.COMPONENT3__SECTION:
				return getSection();
			case CDAPackage.COMPONENT3__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.COMPONENT3__TYPE_CODE:
				return getTypeCode();
			case CDAPackage.COMPONENT3__CONTEXT_CONDUCTION_IND:
				return getContextConductionInd();
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
			case CDAPackage.COMPONENT3__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.COMPONENT3__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.COMPONENT3__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.COMPONENT3__SECTION:
				setSection((Section)newValue);
				return;
			case CDAPackage.COMPONENT3__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.COMPONENT3__TYPE_CODE:
				setTypeCode((ActRelationshipHasComponent)newValue);
				return;
			case CDAPackage.COMPONENT3__CONTEXT_CONDUCTION_IND:
				setContextConductionInd((Boolean)newValue);
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
			case CDAPackage.COMPONENT3__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.COMPONENT3__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.COMPONENT3__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.COMPONENT3__SECTION:
				setSection((Section)null);
				return;
			case CDAPackage.COMPONENT3__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.COMPONENT3__TYPE_CODE:
				unsetTypeCode();
				return;
			case CDAPackage.COMPONENT3__CONTEXT_CONDUCTION_IND:
				setContextConductionInd(CONTEXT_CONDUCTION_IND_EDEFAULT);
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
			case CDAPackage.COMPONENT3__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.COMPONENT3__TYPE_ID:
				return typeId != null;
			case CDAPackage.COMPONENT3__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.COMPONENT3__SECTION:
				return section != null;
			case CDAPackage.COMPONENT3__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.COMPONENT3__TYPE_CODE:
				return isSetTypeCode();
			case CDAPackage.COMPONENT3__CONTEXT_CONDUCTION_IND:
				return CONTEXT_CONDUCTION_IND_EDEFAULT == null ? contextConductionInd != null : !CONTEXT_CONDUCTION_IND_EDEFAULT.equals(contextConductionInd);
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
		result.append(", typeCode: ");
		if (typeCodeESet) result.append(typeCode); else result.append("<unset>");
		result.append(", contextConductionInd: ");
		result.append(contextConductionInd);
		result.append(')');
		return result.toString();
	}

} //Component3Impl
