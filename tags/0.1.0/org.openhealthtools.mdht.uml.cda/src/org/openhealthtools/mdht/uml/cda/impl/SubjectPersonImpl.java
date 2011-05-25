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
import org.openhealthtools.mdht.uml.cda.SubjectPerson;

import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

import org.openhealthtools.mdht.uml.hl7.vocab.EntityClass;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getAdministrativeGenderCode <em>Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getBirthTime <em>Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getDeterminerCode <em>Determiner Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectPersonImpl extends EObjectImpl implements SubjectPerson {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<PN> name;

	/**
	 * The cached value of the '{@link #getAdministrativeGenderCode() <em>Administrative Gender Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeGenderCode()
	 * @generated
	 * @ordered
	 */
	protected CE administrativeGenderCode;

	/**
	 * The cached value of the '{@link #getBirthTime() <em>Birth Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthTime()
	 * @generated
	 * @ordered
	 */
	protected TS birthTime;

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
	protected static final EntityClass CLASS_CODE_EDEFAULT = EntityClass.PSN;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected EntityClass classCode = CLASS_CODE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectPersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getSubjectPerson();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.SUBJECT_PERSON__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBJECT_PERSON__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBJECT_PERSON__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBJECT_PERSON__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBJECT_PERSON__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.SUBJECT_PERSON__TEMPLATE_ID);
		}
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PN> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<PN>(PN.class, this, CDAPackage.SUBJECT_PERSON__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getAdministrativeGenderCode() {
		return administrativeGenderCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrativeGenderCode(CE newAdministrativeGenderCode, NotificationChain msgs) {
		CE oldAdministrativeGenderCode = administrativeGenderCode;
		administrativeGenderCode = newAdministrativeGenderCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE, oldAdministrativeGenderCode, newAdministrativeGenderCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrativeGenderCode(CE newAdministrativeGenderCode) {
		if (newAdministrativeGenderCode != administrativeGenderCode) {
			NotificationChain msgs = null;
			if (administrativeGenderCode != null)
				msgs = ((InternalEObject)administrativeGenderCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE, null, msgs);
			if (newAdministrativeGenderCode != null)
				msgs = ((InternalEObject)newAdministrativeGenderCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE, null, msgs);
			msgs = basicSetAdministrativeGenderCode(newAdministrativeGenderCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE, newAdministrativeGenderCode, newAdministrativeGenderCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS getBirthTime() {
		return birthTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthTime(TS newBirthTime, NotificationChain msgs) {
		TS oldBirthTime = birthTime;
		birthTime = newBirthTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBJECT_PERSON__BIRTH_TIME, oldBirthTime, newBirthTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthTime(TS newBirthTime) {
		if (newBirthTime != birthTime) {
			NotificationChain msgs = null;
			if (birthTime != null)
				msgs = ((InternalEObject)birthTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBJECT_PERSON__BIRTH_TIME, null, msgs);
			if (newBirthTime != null)
				msgs = ((InternalEObject)newBirthTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBJECT_PERSON__BIRTH_TIME, null, msgs);
			msgs = basicSetBirthTime(newBirthTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBJECT_PERSON__BIRTH_TIME, newBirthTime, newBirthTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBJECT_PERSON__NULL_FLAVOR, oldNullFlavor, nullFlavor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClass getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(EntityClass newClassCode) {
		EntityClass oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBJECT_PERSON__CLASS_CODE, oldClassCode, classCode));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBJECT_PERSON__DETERMINER_CODE, oldDeterminerCode, determinerCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.SUBJECT_PERSON__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBJECT_PERSON__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.SUBJECT_PERSON__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBJECT_PERSON__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE:
				return basicSetAdministrativeGenderCode(null, msgs);
			case CDAPackage.SUBJECT_PERSON__BIRTH_TIME:
				return basicSetBirthTime(null, msgs);
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
			case CDAPackage.SUBJECT_PERSON__REALM_CODE:
				return getRealmCode();
			case CDAPackage.SUBJECT_PERSON__TYPE_ID:
				return getTypeId();
			case CDAPackage.SUBJECT_PERSON__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.SUBJECT_PERSON__NAME:
				return getName();
			case CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE:
				return getAdministrativeGenderCode();
			case CDAPackage.SUBJECT_PERSON__BIRTH_TIME:
				return getBirthTime();
			case CDAPackage.SUBJECT_PERSON__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.SUBJECT_PERSON__CLASS_CODE:
				return getClassCode();
			case CDAPackage.SUBJECT_PERSON__DETERMINER_CODE:
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
			case CDAPackage.SUBJECT_PERSON__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__NAME:
				getName().clear();
				getName().addAll((Collection<? extends PN>)newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE:
				setAdministrativeGenderCode((CE)newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__BIRTH_TIME:
				setBirthTime((TS)newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__CLASS_CODE:
				setClassCode((EntityClass)newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__DETERMINER_CODE:
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
			case CDAPackage.SUBJECT_PERSON__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.SUBJECT_PERSON__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.SUBJECT_PERSON__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.SUBJECT_PERSON__NAME:
				getName().clear();
				return;
			case CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE:
				setAdministrativeGenderCode((CE)null);
				return;
			case CDAPackage.SUBJECT_PERSON__BIRTH_TIME:
				setBirthTime((TS)null);
				return;
			case CDAPackage.SUBJECT_PERSON__NULL_FLAVOR:
				setNullFlavor(NULL_FLAVOR_EDEFAULT);
				return;
			case CDAPackage.SUBJECT_PERSON__CLASS_CODE:
				setClassCode(CLASS_CODE_EDEFAULT);
				return;
			case CDAPackage.SUBJECT_PERSON__DETERMINER_CODE:
				setDeterminerCode(DETERMINER_CODE_EDEFAULT);
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
			case CDAPackage.SUBJECT_PERSON__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.SUBJECT_PERSON__TYPE_ID:
				return typeId != null;
			case CDAPackage.SUBJECT_PERSON__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.SUBJECT_PERSON__NAME:
				return name != null && !name.isEmpty();
			case CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE:
				return administrativeGenderCode != null;
			case CDAPackage.SUBJECT_PERSON__BIRTH_TIME:
				return birthTime != null;
			case CDAPackage.SUBJECT_PERSON__NULL_FLAVOR:
				return nullFlavor != NULL_FLAVOR_EDEFAULT;
			case CDAPackage.SUBJECT_PERSON__CLASS_CODE:
				return classCode != CLASS_CODE_EDEFAULT;
			case CDAPackage.SUBJECT_PERSON__DETERMINER_CODE:
				return determinerCode != DETERMINER_CODE_EDEFAULT;
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
		result.append(", determinerCode: ");
		result.append(determinerCode);
		result.append(')');
		return result.toString();
	}

} //SubjectPersonImpl