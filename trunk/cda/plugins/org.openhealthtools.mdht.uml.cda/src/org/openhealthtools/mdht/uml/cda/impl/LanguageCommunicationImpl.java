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
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;

import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl#getModeCode <em>Mode Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl#getProficiencyLevelCode <em>Proficiency Level Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl#getPreferenceInd <em>Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl#getNullFlavor <em>Null Flavor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageCommunicationImpl extends EObjectImpl implements LanguageCommunication {
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
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected CS languageCode;

	/**
	 * The cached value of the '{@link #getModeCode() <em>Mode Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeCode()
	 * @generated
	 * @ordered
	 */
	protected CE modeCode;

	/**
	 * The cached value of the '{@link #getProficiencyLevelCode() <em>Proficiency Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProficiencyLevelCode()
	 * @generated
	 * @ordered
	 */
	protected CE proficiencyLevelCode;

	/**
	 * The cached value of the '{@link #getPreferenceInd() <em>Preference Ind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferenceInd()
	 * @generated
	 * @ordered
	 */
	protected BL preferenceInd;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getLanguageCommunication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.LANGUAGE_COMMUNICATION__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.LANGUAGE_COMMUNICATION__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LANGUAGE_COMMUNICATION__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LANGUAGE_COMMUNICATION__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LANGUAGE_COMMUNICATION__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.LANGUAGE_COMMUNICATION__TEMPLATE_ID);
		}
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS getLanguageCode() {
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguageCode(CS newLanguageCode, NotificationChain msgs) {
		CS oldLanguageCode = languageCode;
		languageCode = newLanguageCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.LANGUAGE_COMMUNICATION__LANGUAGE_CODE, oldLanguageCode, newLanguageCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageCode(CS newLanguageCode) {
		if (newLanguageCode != languageCode) {
			NotificationChain msgs = null;
			if (languageCode != null)
				msgs = ((InternalEObject)languageCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LANGUAGE_COMMUNICATION__LANGUAGE_CODE, null, msgs);
			if (newLanguageCode != null)
				msgs = ((InternalEObject)newLanguageCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LANGUAGE_COMMUNICATION__LANGUAGE_CODE, null, msgs);
			msgs = basicSetLanguageCode(newLanguageCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LANGUAGE_COMMUNICATION__LANGUAGE_CODE, newLanguageCode, newLanguageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getModeCode() {
		return modeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeCode(CE newModeCode, NotificationChain msgs) {
		CE oldModeCode = modeCode;
		modeCode = newModeCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.LANGUAGE_COMMUNICATION__MODE_CODE, oldModeCode, newModeCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeCode(CE newModeCode) {
		if (newModeCode != modeCode) {
			NotificationChain msgs = null;
			if (modeCode != null)
				msgs = ((InternalEObject)modeCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LANGUAGE_COMMUNICATION__MODE_CODE, null, msgs);
			if (newModeCode != null)
				msgs = ((InternalEObject)newModeCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LANGUAGE_COMMUNICATION__MODE_CODE, null, msgs);
			msgs = basicSetModeCode(newModeCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LANGUAGE_COMMUNICATION__MODE_CODE, newModeCode, newModeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getProficiencyLevelCode() {
		return proficiencyLevelCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProficiencyLevelCode(CE newProficiencyLevelCode, NotificationChain msgs) {
		CE oldProficiencyLevelCode = proficiencyLevelCode;
		proficiencyLevelCode = newProficiencyLevelCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE, oldProficiencyLevelCode, newProficiencyLevelCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProficiencyLevelCode(CE newProficiencyLevelCode) {
		if (newProficiencyLevelCode != proficiencyLevelCode) {
			NotificationChain msgs = null;
			if (proficiencyLevelCode != null)
				msgs = ((InternalEObject)proficiencyLevelCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE, null, msgs);
			if (newProficiencyLevelCode != null)
				msgs = ((InternalEObject)newProficiencyLevelCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE, null, msgs);
			msgs = basicSetProficiencyLevelCode(newProficiencyLevelCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE, newProficiencyLevelCode, newProficiencyLevelCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BL getPreferenceInd() {
		return preferenceInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferenceInd(BL newPreferenceInd, NotificationChain msgs) {
		BL oldPreferenceInd = preferenceInd;
		preferenceInd = newPreferenceInd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.LANGUAGE_COMMUNICATION__PREFERENCE_IND, oldPreferenceInd, newPreferenceInd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferenceInd(BL newPreferenceInd) {
		if (newPreferenceInd != preferenceInd) {
			NotificationChain msgs = null;
			if (preferenceInd != null)
				msgs = ((InternalEObject)preferenceInd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LANGUAGE_COMMUNICATION__PREFERENCE_IND, null, msgs);
			if (newPreferenceInd != null)
				msgs = ((InternalEObject)newPreferenceInd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.LANGUAGE_COMMUNICATION__PREFERENCE_IND, null, msgs);
			msgs = basicSetPreferenceInd(newPreferenceInd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LANGUAGE_COMMUNICATION__PREFERENCE_IND, newPreferenceInd, newPreferenceInd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.LANGUAGE_COMMUNICATION__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.LANGUAGE_COMMUNICATION__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.LANGUAGE_COMMUNICATION__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.LANGUAGE_COMMUNICATION__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.LANGUAGE_COMMUNICATION__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.LANGUAGE_COMMUNICATION__LANGUAGE_CODE:
				return basicSetLanguageCode(null, msgs);
			case CDAPackage.LANGUAGE_COMMUNICATION__MODE_CODE:
				return basicSetModeCode(null, msgs);
			case CDAPackage.LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE:
				return basicSetProficiencyLevelCode(null, msgs);
			case CDAPackage.LANGUAGE_COMMUNICATION__PREFERENCE_IND:
				return basicSetPreferenceInd(null, msgs);
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
			case CDAPackage.LANGUAGE_COMMUNICATION__REALM_CODE:
				return getRealmCode();
			case CDAPackage.LANGUAGE_COMMUNICATION__TYPE_ID:
				return getTypeId();
			case CDAPackage.LANGUAGE_COMMUNICATION__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.LANGUAGE_COMMUNICATION__LANGUAGE_CODE:
				return getLanguageCode();
			case CDAPackage.LANGUAGE_COMMUNICATION__MODE_CODE:
				return getModeCode();
			case CDAPackage.LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE:
				return getProficiencyLevelCode();
			case CDAPackage.LANGUAGE_COMMUNICATION__PREFERENCE_IND:
				return getPreferenceInd();
			case CDAPackage.LANGUAGE_COMMUNICATION__NULL_FLAVOR:
				return getNullFlavor();
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
			case CDAPackage.LANGUAGE_COMMUNICATION__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__LANGUAGE_CODE:
				setLanguageCode((CS)newValue);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__MODE_CODE:
				setModeCode((CE)newValue);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE:
				setProficiencyLevelCode((CE)newValue);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__PREFERENCE_IND:
				setPreferenceInd((BL)newValue);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
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
			case CDAPackage.LANGUAGE_COMMUNICATION__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__LANGUAGE_CODE:
				setLanguageCode((CS)null);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__MODE_CODE:
				setModeCode((CE)null);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE:
				setProficiencyLevelCode((CE)null);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__PREFERENCE_IND:
				setPreferenceInd((BL)null);
				return;
			case CDAPackage.LANGUAGE_COMMUNICATION__NULL_FLAVOR:
				unsetNullFlavor();
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
			case CDAPackage.LANGUAGE_COMMUNICATION__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.LANGUAGE_COMMUNICATION__TYPE_ID:
				return typeId != null;
			case CDAPackage.LANGUAGE_COMMUNICATION__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.LANGUAGE_COMMUNICATION__LANGUAGE_CODE:
				return languageCode != null;
			case CDAPackage.LANGUAGE_COMMUNICATION__MODE_CODE:
				return modeCode != null;
			case CDAPackage.LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE:
				return proficiencyLevelCode != null;
			case CDAPackage.LANGUAGE_COMMUNICATION__PREFERENCE_IND:
				return preferenceInd != null;
			case CDAPackage.LANGUAGE_COMMUNICATION__NULL_FLAVOR:
				return isSetNullFlavor();
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
		result.append(')');
		return result.toString();
	}

} //LanguageCommunicationImpl
