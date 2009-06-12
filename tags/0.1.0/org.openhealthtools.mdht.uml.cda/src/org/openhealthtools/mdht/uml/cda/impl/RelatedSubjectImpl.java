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
import org.openhealthtools.mdht.uml.cda.RelatedSubject;
import org.openhealthtools.mdht.uml.cda.SubjectPerson;

import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RelatedSubjectImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RelatedSubjectImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RelatedSubjectImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RelatedSubjectImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RelatedSubjectImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RelatedSubjectImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RelatedSubjectImpl#getSubjectPerson <em>Subject Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RelatedSubjectImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RelatedSubjectImpl#getClassCode <em>Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedSubjectImpl extends EObjectImpl implements RelatedSubject {
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
	 * The cached value of the '{@link #getSubjectPerson() <em>Subject Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectPerson()
	 * @generated
	 * @ordered
	 */
	protected SubjectPerson subjectPerson;

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
	protected static final x_DocumentSubject CLASS_CODE_EDEFAULT = x_DocumentSubject.PRS;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected x_DocumentSubject classCode = CLASS_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getRelatedSubject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.RELATED_SUBJECT__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.RELATED_SUBJECT__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.RELATED_SUBJECT__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.RELATED_SUBJECT__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.RELATED_SUBJECT__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.RELATED_SUBJECT__TEMPLATE_ID);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.RELATED_SUBJECT__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.RELATED_SUBJECT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.RELATED_SUBJECT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.RELATED_SUBJECT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AD> getAddr() {
		if (addr == null) {
			addr = new EObjectContainmentEList<AD>(AD.class, this, CDAPackage.RELATED_SUBJECT__ADDR);
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
			telecom = new EObjectContainmentEList<TEL>(TEL.class, this, CDAPackage.RELATED_SUBJECT__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectPerson getSubjectPerson() {
		return subjectPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectPerson(SubjectPerson newSubjectPerson, NotificationChain msgs) {
		SubjectPerson oldSubjectPerson = subjectPerson;
		subjectPerson = newSubjectPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.RELATED_SUBJECT__SUBJECT_PERSON, oldSubjectPerson, newSubjectPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectPerson(SubjectPerson newSubjectPerson) {
		if (newSubjectPerson != subjectPerson) {
			NotificationChain msgs = null;
			if (subjectPerson != null)
				msgs = ((InternalEObject)subjectPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.RELATED_SUBJECT__SUBJECT_PERSON, null, msgs);
			if (newSubjectPerson != null)
				msgs = ((InternalEObject)newSubjectPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.RELATED_SUBJECT__SUBJECT_PERSON, null, msgs);
			msgs = basicSetSubjectPerson(newSubjectPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.RELATED_SUBJECT__SUBJECT_PERSON, newSubjectPerson, newSubjectPerson));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.RELATED_SUBJECT__NULL_FLAVOR, oldNullFlavor, nullFlavor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_DocumentSubject getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(x_DocumentSubject newClassCode) {
		x_DocumentSubject oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.RELATED_SUBJECT__CLASS_CODE, oldClassCode, classCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.RELATED_SUBJECT__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.RELATED_SUBJECT__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.RELATED_SUBJECT__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.RELATED_SUBJECT__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.RELATED_SUBJECT__ADDR:
				return ((InternalEList<?>)getAddr()).basicRemove(otherEnd, msgs);
			case CDAPackage.RELATED_SUBJECT__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case CDAPackage.RELATED_SUBJECT__SUBJECT_PERSON:
				return basicSetSubjectPerson(null, msgs);
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
			case CDAPackage.RELATED_SUBJECT__REALM_CODE:
				return getRealmCode();
			case CDAPackage.RELATED_SUBJECT__TYPE_ID:
				return getTypeId();
			case CDAPackage.RELATED_SUBJECT__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.RELATED_SUBJECT__CODE:
				return getCode();
			case CDAPackage.RELATED_SUBJECT__ADDR:
				return getAddr();
			case CDAPackage.RELATED_SUBJECT__TELECOM:
				return getTelecom();
			case CDAPackage.RELATED_SUBJECT__SUBJECT_PERSON:
				return getSubjectPerson();
			case CDAPackage.RELATED_SUBJECT__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.RELATED_SUBJECT__CLASS_CODE:
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
			case CDAPackage.RELATED_SUBJECT__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.RELATED_SUBJECT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.RELATED_SUBJECT__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.RELATED_SUBJECT__CODE:
				setCode((CE)newValue);
				return;
			case CDAPackage.RELATED_SUBJECT__ADDR:
				getAddr().clear();
				getAddr().addAll((Collection<? extends AD>)newValue);
				return;
			case CDAPackage.RELATED_SUBJECT__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends TEL>)newValue);
				return;
			case CDAPackage.RELATED_SUBJECT__SUBJECT_PERSON:
				setSubjectPerson((SubjectPerson)newValue);
				return;
			case CDAPackage.RELATED_SUBJECT__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.RELATED_SUBJECT__CLASS_CODE:
				setClassCode((x_DocumentSubject)newValue);
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
			case CDAPackage.RELATED_SUBJECT__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.RELATED_SUBJECT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.RELATED_SUBJECT__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.RELATED_SUBJECT__CODE:
				setCode((CE)null);
				return;
			case CDAPackage.RELATED_SUBJECT__ADDR:
				getAddr().clear();
				return;
			case CDAPackage.RELATED_SUBJECT__TELECOM:
				getTelecom().clear();
				return;
			case CDAPackage.RELATED_SUBJECT__SUBJECT_PERSON:
				setSubjectPerson((SubjectPerson)null);
				return;
			case CDAPackage.RELATED_SUBJECT__NULL_FLAVOR:
				setNullFlavor(NULL_FLAVOR_EDEFAULT);
				return;
			case CDAPackage.RELATED_SUBJECT__CLASS_CODE:
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
			case CDAPackage.RELATED_SUBJECT__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.RELATED_SUBJECT__TYPE_ID:
				return typeId != null;
			case CDAPackage.RELATED_SUBJECT__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.RELATED_SUBJECT__CODE:
				return code != null;
			case CDAPackage.RELATED_SUBJECT__ADDR:
				return addr != null && !addr.isEmpty();
			case CDAPackage.RELATED_SUBJECT__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case CDAPackage.RELATED_SUBJECT__SUBJECT_PERSON:
				return subjectPerson != null;
			case CDAPackage.RELATED_SUBJECT__NULL_FLAVOR:
				return nullFlavor != NULL_FLAVOR_EDEFAULT;
			case CDAPackage.RELATED_SUBJECT__CLASS_CODE:
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

} //RelatedSubjectImpl
