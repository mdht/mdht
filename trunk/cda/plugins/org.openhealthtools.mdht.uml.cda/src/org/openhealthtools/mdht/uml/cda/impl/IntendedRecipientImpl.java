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
import org.openhealthtools.mdht.uml.cda.IntendedRecipient;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Person;

import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipientRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intended Recipient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getInformationRecipient <em>Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getReceivedOrganization <em>Received Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getClassCode <em>Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntendedRecipientImpl extends EObjectImpl implements IntendedRecipient {
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
	 * The cached value of the '{@link #getInformationRecipient() <em>Information Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationRecipient()
	 * @generated
	 * @ordered
	 */
	protected Person informationRecipient;

	/**
	 * The cached value of the '{@link #getReceivedOrganization() <em>Received Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization receivedOrganization;

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
	protected static final x_InformationRecipientRole CLASS_CODE_EDEFAULT = x_InformationRecipientRole.ASSIGNED;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected x_InformationRecipientRole classCode = CLASS_CODE_EDEFAULT;

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
	protected IntendedRecipientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getIntendedRecipient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.INTENDED_RECIPIENT__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.INTENDED_RECIPIENT__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.INTENDED_RECIPIENT__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID);
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
			id = new EObjectContainmentEList<II>(II.class, this, CDAPackage.INTENDED_RECIPIENT__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AD> getAddr() {
		if (addr == null) {
			addr = new EObjectContainmentEList<AD>(AD.class, this, CDAPackage.INTENDED_RECIPIENT__ADDR);
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
			telecom = new EObjectContainmentEList<TEL>(TEL.class, this, CDAPackage.INTENDED_RECIPIENT__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getInformationRecipient() {
		return informationRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationRecipient(Person newInformationRecipient, NotificationChain msgs) {
		Person oldInformationRecipient = informationRecipient;
		informationRecipient = newInformationRecipient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT, oldInformationRecipient, newInformationRecipient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationRecipient(Person newInformationRecipient) {
		if (newInformationRecipient != informationRecipient) {
			NotificationChain msgs = null;
			if (informationRecipient != null)
				msgs = ((InternalEObject)informationRecipient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT, null, msgs);
			if (newInformationRecipient != null)
				msgs = ((InternalEObject)newInformationRecipient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT, null, msgs);
			msgs = basicSetInformationRecipient(newInformationRecipient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT, newInformationRecipient, newInformationRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getReceivedOrganization() {
		return receivedOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivedOrganization(Organization newReceivedOrganization, NotificationChain msgs) {
		Organization oldReceivedOrganization = receivedOrganization;
		receivedOrganization = newReceivedOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION, oldReceivedOrganization, newReceivedOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedOrganization(Organization newReceivedOrganization) {
		if (newReceivedOrganization != receivedOrganization) {
			NotificationChain msgs = null;
			if (receivedOrganization != null)
				msgs = ((InternalEObject)receivedOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION, null, msgs);
			if (newReceivedOrganization != null)
				msgs = ((InternalEObject)newReceivedOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION, null, msgs);
			msgs = basicSetReceivedOrganization(newReceivedOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION, newReceivedOrganization, newReceivedOrganization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
	public x_InformationRecipientRole getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(x_InformationRecipientRole newClassCode) {
		x_InformationRecipientRole oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		x_InformationRecipientRole oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.INTENDED_RECIPIENT__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
			case CDAPackage.INTENDED_RECIPIENT__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.INTENDED_RECIPIENT__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.INTENDED_RECIPIENT__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case CDAPackage.INTENDED_RECIPIENT__ADDR:
				return ((InternalEList<?>)getAddr()).basicRemove(otherEnd, msgs);
			case CDAPackage.INTENDED_RECIPIENT__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT:
				return basicSetInformationRecipient(null, msgs);
			case CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION:
				return basicSetReceivedOrganization(null, msgs);
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
			case CDAPackage.INTENDED_RECIPIENT__REALM_CODE:
				return getRealmCode();
			case CDAPackage.INTENDED_RECIPIENT__TYPE_ID:
				return getTypeId();
			case CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.INTENDED_RECIPIENT__ID:
				return getId();
			case CDAPackage.INTENDED_RECIPIENT__ADDR:
				return getAddr();
			case CDAPackage.INTENDED_RECIPIENT__TELECOM:
				return getTelecom();
			case CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT:
				return getInformationRecipient();
			case CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION:
				return getReceivedOrganization();
			case CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.INTENDED_RECIPIENT__CLASS_CODE:
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
			case CDAPackage.INTENDED_RECIPIENT__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__ID:
				getId().clear();
				getId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__ADDR:
				getAddr().clear();
				getAddr().addAll((Collection<? extends AD>)newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends TEL>)newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT:
				setInformationRecipient((Person)newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION:
				setReceivedOrganization((Organization)newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__CLASS_CODE:
				setClassCode((x_InformationRecipientRole)newValue);
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
			case CDAPackage.INTENDED_RECIPIENT__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.INTENDED_RECIPIENT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.INTENDED_RECIPIENT__ID:
				getId().clear();
				return;
			case CDAPackage.INTENDED_RECIPIENT__ADDR:
				getAddr().clear();
				return;
			case CDAPackage.INTENDED_RECIPIENT__TELECOM:
				getTelecom().clear();
				return;
			case CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT:
				setInformationRecipient((Person)null);
				return;
			case CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION:
				setReceivedOrganization((Organization)null);
				return;
			case CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.INTENDED_RECIPIENT__CLASS_CODE:
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
			case CDAPackage.INTENDED_RECIPIENT__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.INTENDED_RECIPIENT__TYPE_ID:
				return typeId != null;
			case CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.INTENDED_RECIPIENT__ID:
				return id != null && !id.isEmpty();
			case CDAPackage.INTENDED_RECIPIENT__ADDR:
				return addr != null && !addr.isEmpty();
			case CDAPackage.INTENDED_RECIPIENT__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT:
				return informationRecipient != null;
			case CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION:
				return receivedOrganization != null;
			case CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.INTENDED_RECIPIENT__CLASS_CODE:
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

} //IntendedRecipientImpl
