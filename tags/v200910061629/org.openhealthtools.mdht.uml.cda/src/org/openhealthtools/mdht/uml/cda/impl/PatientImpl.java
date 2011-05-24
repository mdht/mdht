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

import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.Patient;

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
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getAdministrativeGenderCode <em>Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getBirthTime <em>Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getMaritalStatusCode <em>Marital Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getReligiousAffiliationCode <em>Religious Affiliation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getRaceCode <em>Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getEthnicGroupCode <em>Ethnic Group Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getGuardian <em>Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getBirthplace <em>Birthplace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getLanguageCommunication <em>Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl#getDeterminerCode <em>Determiner Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientImpl extends EObjectImpl implements Patient {
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
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected II id;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected PN name;

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
	 * The cached value of the '{@link #getMaritalStatusCode() <em>Marital Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaritalStatusCode()
	 * @generated
	 * @ordered
	 */
	protected CE maritalStatusCode;

	/**
	 * The cached value of the '{@link #getReligiousAffiliationCode() <em>Religious Affiliation Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReligiousAffiliationCode()
	 * @generated
	 * @ordered
	 */
	protected CE religiousAffiliationCode;

	/**
	 * The cached value of the '{@link #getRaceCode() <em>Race Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaceCode()
	 * @generated
	 * @ordered
	 */
	protected CE raceCode;

	/**
	 * The cached value of the '{@link #getEthnicGroupCode() <em>Ethnic Group Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthnicGroupCode()
	 * @generated
	 * @ordered
	 */
	protected CE ethnicGroupCode;

	/**
	 * The cached value of the '{@link #getGuardian() <em>Guardian</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardian()
	 * @generated
	 * @ordered
	 */
	protected EList<Guardian> guardian;

	/**
	 * The cached value of the '{@link #getBirthplace() <em>Birthplace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthplace()
	 * @generated
	 * @ordered
	 */
	protected Birthplace birthplace;

	/**
	 * The cached value of the '{@link #getLanguageCommunication() <em>Language Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageCommunication> languageCommunication;

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
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getPatient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.PATIENT__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.PATIENT__TEMPLATE_ID);
		}
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(II newId, NotificationChain msgs) {
		II oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__ID, oldId, newId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(II newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PN getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(PN newName, NotificationChain msgs) {
		PN oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(PN newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__ADMINISTRATIVE_GENDER_CODE, oldAdministrativeGenderCode, newAdministrativeGenderCode);
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
				msgs = ((InternalEObject)administrativeGenderCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__ADMINISTRATIVE_GENDER_CODE, null, msgs);
			if (newAdministrativeGenderCode != null)
				msgs = ((InternalEObject)newAdministrativeGenderCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__ADMINISTRATIVE_GENDER_CODE, null, msgs);
			msgs = basicSetAdministrativeGenderCode(newAdministrativeGenderCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__ADMINISTRATIVE_GENDER_CODE, newAdministrativeGenderCode, newAdministrativeGenderCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__BIRTH_TIME, oldBirthTime, newBirthTime);
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
				msgs = ((InternalEObject)birthTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__BIRTH_TIME, null, msgs);
			if (newBirthTime != null)
				msgs = ((InternalEObject)newBirthTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__BIRTH_TIME, null, msgs);
			msgs = basicSetBirthTime(newBirthTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__BIRTH_TIME, newBirthTime, newBirthTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getMaritalStatusCode() {
		return maritalStatusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaritalStatusCode(CE newMaritalStatusCode, NotificationChain msgs) {
		CE oldMaritalStatusCode = maritalStatusCode;
		maritalStatusCode = newMaritalStatusCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__MARITAL_STATUS_CODE, oldMaritalStatusCode, newMaritalStatusCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaritalStatusCode(CE newMaritalStatusCode) {
		if (newMaritalStatusCode != maritalStatusCode) {
			NotificationChain msgs = null;
			if (maritalStatusCode != null)
				msgs = ((InternalEObject)maritalStatusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__MARITAL_STATUS_CODE, null, msgs);
			if (newMaritalStatusCode != null)
				msgs = ((InternalEObject)newMaritalStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__MARITAL_STATUS_CODE, null, msgs);
			msgs = basicSetMaritalStatusCode(newMaritalStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__MARITAL_STATUS_CODE, newMaritalStatusCode, newMaritalStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getReligiousAffiliationCode() {
		return religiousAffiliationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReligiousAffiliationCode(CE newReligiousAffiliationCode, NotificationChain msgs) {
		CE oldReligiousAffiliationCode = religiousAffiliationCode;
		religiousAffiliationCode = newReligiousAffiliationCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__RELIGIOUS_AFFILIATION_CODE, oldReligiousAffiliationCode, newReligiousAffiliationCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReligiousAffiliationCode(CE newReligiousAffiliationCode) {
		if (newReligiousAffiliationCode != religiousAffiliationCode) {
			NotificationChain msgs = null;
			if (religiousAffiliationCode != null)
				msgs = ((InternalEObject)religiousAffiliationCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__RELIGIOUS_AFFILIATION_CODE, null, msgs);
			if (newReligiousAffiliationCode != null)
				msgs = ((InternalEObject)newReligiousAffiliationCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__RELIGIOUS_AFFILIATION_CODE, null, msgs);
			msgs = basicSetReligiousAffiliationCode(newReligiousAffiliationCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__RELIGIOUS_AFFILIATION_CODE, newReligiousAffiliationCode, newReligiousAffiliationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getRaceCode() {
		return raceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaceCode(CE newRaceCode, NotificationChain msgs) {
		CE oldRaceCode = raceCode;
		raceCode = newRaceCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__RACE_CODE, oldRaceCode, newRaceCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaceCode(CE newRaceCode) {
		if (newRaceCode != raceCode) {
			NotificationChain msgs = null;
			if (raceCode != null)
				msgs = ((InternalEObject)raceCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__RACE_CODE, null, msgs);
			if (newRaceCode != null)
				msgs = ((InternalEObject)newRaceCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__RACE_CODE, null, msgs);
			msgs = basicSetRaceCode(newRaceCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__RACE_CODE, newRaceCode, newRaceCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getEthnicGroupCode() {
		return ethnicGroupCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEthnicGroupCode(CE newEthnicGroupCode, NotificationChain msgs) {
		CE oldEthnicGroupCode = ethnicGroupCode;
		ethnicGroupCode = newEthnicGroupCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__ETHNIC_GROUP_CODE, oldEthnicGroupCode, newEthnicGroupCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEthnicGroupCode(CE newEthnicGroupCode) {
		if (newEthnicGroupCode != ethnicGroupCode) {
			NotificationChain msgs = null;
			if (ethnicGroupCode != null)
				msgs = ((InternalEObject)ethnicGroupCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__ETHNIC_GROUP_CODE, null, msgs);
			if (newEthnicGroupCode != null)
				msgs = ((InternalEObject)newEthnicGroupCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__ETHNIC_GROUP_CODE, null, msgs);
			msgs = basicSetEthnicGroupCode(newEthnicGroupCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__ETHNIC_GROUP_CODE, newEthnicGroupCode, newEthnicGroupCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guardian> getGuardian() {
		if (guardian == null) {
			guardian = new EObjectContainmentEList<Guardian>(Guardian.class, this, CDAPackage.PATIENT__GUARDIAN);
		}
		return guardian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Birthplace getBirthplace() {
		return birthplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthplace(Birthplace newBirthplace, NotificationChain msgs) {
		Birthplace oldBirthplace = birthplace;
		birthplace = newBirthplace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__BIRTHPLACE, oldBirthplace, newBirthplace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthplace(Birthplace newBirthplace) {
		if (newBirthplace != birthplace) {
			NotificationChain msgs = null;
			if (birthplace != null)
				msgs = ((InternalEObject)birthplace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__BIRTHPLACE, null, msgs);
			if (newBirthplace != null)
				msgs = ((InternalEObject)newBirthplace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.PATIENT__BIRTHPLACE, null, msgs);
			msgs = basicSetBirthplace(newBirthplace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__BIRTHPLACE, newBirthplace, newBirthplace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageCommunication> getLanguageCommunication() {
		if (languageCommunication == null) {
			languageCommunication = new EObjectContainmentEList<LanguageCommunication>(LanguageCommunication.class, this, CDAPackage.PATIENT__LANGUAGE_COMMUNICATION);
		}
		return languageCommunication;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.PATIENT__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		EntityClass oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.PATIENT__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PATIENT__DETERMINER_CODE, oldDeterminerCode, determinerCode, !oldDeterminerCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.PATIENT__DETERMINER_CODE, oldDeterminerCode, DETERMINER_CODE_EDEFAULT, oldDeterminerCodeESet));
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
			case CDAPackage.PATIENT__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.PATIENT__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.PATIENT__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.PATIENT__ID:
				return basicSetId(null, msgs);
			case CDAPackage.PATIENT__NAME:
				return basicSetName(null, msgs);
			case CDAPackage.PATIENT__ADMINISTRATIVE_GENDER_CODE:
				return basicSetAdministrativeGenderCode(null, msgs);
			case CDAPackage.PATIENT__BIRTH_TIME:
				return basicSetBirthTime(null, msgs);
			case CDAPackage.PATIENT__MARITAL_STATUS_CODE:
				return basicSetMaritalStatusCode(null, msgs);
			case CDAPackage.PATIENT__RELIGIOUS_AFFILIATION_CODE:
				return basicSetReligiousAffiliationCode(null, msgs);
			case CDAPackage.PATIENT__RACE_CODE:
				return basicSetRaceCode(null, msgs);
			case CDAPackage.PATIENT__ETHNIC_GROUP_CODE:
				return basicSetEthnicGroupCode(null, msgs);
			case CDAPackage.PATIENT__GUARDIAN:
				return ((InternalEList<?>)getGuardian()).basicRemove(otherEnd, msgs);
			case CDAPackage.PATIENT__BIRTHPLACE:
				return basicSetBirthplace(null, msgs);
			case CDAPackage.PATIENT__LANGUAGE_COMMUNICATION:
				return ((InternalEList<?>)getLanguageCommunication()).basicRemove(otherEnd, msgs);
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
			case CDAPackage.PATIENT__REALM_CODE:
				return getRealmCode();
			case CDAPackage.PATIENT__TYPE_ID:
				return getTypeId();
			case CDAPackage.PATIENT__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.PATIENT__ID:
				return getId();
			case CDAPackage.PATIENT__NAME:
				return getName();
			case CDAPackage.PATIENT__ADMINISTRATIVE_GENDER_CODE:
				return getAdministrativeGenderCode();
			case CDAPackage.PATIENT__BIRTH_TIME:
				return getBirthTime();
			case CDAPackage.PATIENT__MARITAL_STATUS_CODE:
				return getMaritalStatusCode();
			case CDAPackage.PATIENT__RELIGIOUS_AFFILIATION_CODE:
				return getReligiousAffiliationCode();
			case CDAPackage.PATIENT__RACE_CODE:
				return getRaceCode();
			case CDAPackage.PATIENT__ETHNIC_GROUP_CODE:
				return getEthnicGroupCode();
			case CDAPackage.PATIENT__GUARDIAN:
				return getGuardian();
			case CDAPackage.PATIENT__BIRTHPLACE:
				return getBirthplace();
			case CDAPackage.PATIENT__LANGUAGE_COMMUNICATION:
				return getLanguageCommunication();
			case CDAPackage.PATIENT__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.PATIENT__CLASS_CODE:
				return getClassCode();
			case CDAPackage.PATIENT__DETERMINER_CODE:
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
			case CDAPackage.PATIENT__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.PATIENT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.PATIENT__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.PATIENT__ID:
				setId((II)newValue);
				return;
			case CDAPackage.PATIENT__NAME:
				setName((PN)newValue);
				return;
			case CDAPackage.PATIENT__ADMINISTRATIVE_GENDER_CODE:
				setAdministrativeGenderCode((CE)newValue);
				return;
			case CDAPackage.PATIENT__BIRTH_TIME:
				setBirthTime((TS)newValue);
				return;
			case CDAPackage.PATIENT__MARITAL_STATUS_CODE:
				setMaritalStatusCode((CE)newValue);
				return;
			case CDAPackage.PATIENT__RELIGIOUS_AFFILIATION_CODE:
				setReligiousAffiliationCode((CE)newValue);
				return;
			case CDAPackage.PATIENT__RACE_CODE:
				setRaceCode((CE)newValue);
				return;
			case CDAPackage.PATIENT__ETHNIC_GROUP_CODE:
				setEthnicGroupCode((CE)newValue);
				return;
			case CDAPackage.PATIENT__GUARDIAN:
				getGuardian().clear();
				getGuardian().addAll((Collection<? extends Guardian>)newValue);
				return;
			case CDAPackage.PATIENT__BIRTHPLACE:
				setBirthplace((Birthplace)newValue);
				return;
			case CDAPackage.PATIENT__LANGUAGE_COMMUNICATION:
				getLanguageCommunication().clear();
				getLanguageCommunication().addAll((Collection<? extends LanguageCommunication>)newValue);
				return;
			case CDAPackage.PATIENT__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.PATIENT__CLASS_CODE:
				setClassCode((EntityClass)newValue);
				return;
			case CDAPackage.PATIENT__DETERMINER_CODE:
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
			case CDAPackage.PATIENT__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.PATIENT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.PATIENT__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.PATIENT__ID:
				setId((II)null);
				return;
			case CDAPackage.PATIENT__NAME:
				setName((PN)null);
				return;
			case CDAPackage.PATIENT__ADMINISTRATIVE_GENDER_CODE:
				setAdministrativeGenderCode((CE)null);
				return;
			case CDAPackage.PATIENT__BIRTH_TIME:
				setBirthTime((TS)null);
				return;
			case CDAPackage.PATIENT__MARITAL_STATUS_CODE:
				setMaritalStatusCode((CE)null);
				return;
			case CDAPackage.PATIENT__RELIGIOUS_AFFILIATION_CODE:
				setReligiousAffiliationCode((CE)null);
				return;
			case CDAPackage.PATIENT__RACE_CODE:
				setRaceCode((CE)null);
				return;
			case CDAPackage.PATIENT__ETHNIC_GROUP_CODE:
				setEthnicGroupCode((CE)null);
				return;
			case CDAPackage.PATIENT__GUARDIAN:
				getGuardian().clear();
				return;
			case CDAPackage.PATIENT__BIRTHPLACE:
				setBirthplace((Birthplace)null);
				return;
			case CDAPackage.PATIENT__LANGUAGE_COMMUNICATION:
				getLanguageCommunication().clear();
				return;
			case CDAPackage.PATIENT__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.PATIENT__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.PATIENT__DETERMINER_CODE:
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
			case CDAPackage.PATIENT__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.PATIENT__TYPE_ID:
				return typeId != null;
			case CDAPackage.PATIENT__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.PATIENT__ID:
				return id != null;
			case CDAPackage.PATIENT__NAME:
				return name != null;
			case CDAPackage.PATIENT__ADMINISTRATIVE_GENDER_CODE:
				return administrativeGenderCode != null;
			case CDAPackage.PATIENT__BIRTH_TIME:
				return birthTime != null;
			case CDAPackage.PATIENT__MARITAL_STATUS_CODE:
				return maritalStatusCode != null;
			case CDAPackage.PATIENT__RELIGIOUS_AFFILIATION_CODE:
				return religiousAffiliationCode != null;
			case CDAPackage.PATIENT__RACE_CODE:
				return raceCode != null;
			case CDAPackage.PATIENT__ETHNIC_GROUP_CODE:
				return ethnicGroupCode != null;
			case CDAPackage.PATIENT__GUARDIAN:
				return guardian != null && !guardian.isEmpty();
			case CDAPackage.PATIENT__BIRTHPLACE:
				return birthplace != null;
			case CDAPackage.PATIENT__LANGUAGE_COMMUNICATION:
				return languageCommunication != null && !languageCommunication.isEmpty();
			case CDAPackage.PATIENT__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.PATIENT__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.PATIENT__DETERMINER_CODE:
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

} //PatientImpl