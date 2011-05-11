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
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.operations.GuardianOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.rim.impl.RoleImpl;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guardian</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl#getAddrs <em>Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl#getGuardianPerson <em>Guardian Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl#getGuardianOrganization <em>Guardian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl#getClassCode <em>Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardianImpl extends RoleImpl implements Guardian {
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
	 * The cached value of the '{@link #getIds() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> ids;

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
	 * The cached value of the '{@link #getAddrs() <em>Addr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrs()
	 * @generated
	 * @ordered
	 */
	protected EList<AD> addrs;

	/**
	 * The cached value of the '{@link #getTelecoms() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms()
	 * @generated
	 * @ordered
	 */
	protected EList<TEL> telecoms;

	/**
	 * The cached value of the '{@link #getGuardianPerson() <em>Guardian Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardianPerson()
	 * @generated
	 * @ordered
	 */
	protected Person guardianPerson;

	/**
	 * The cached value of the '{@link #getGuardianOrganization() <em>Guardian Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardianOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization guardianOrganization;

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
	protected static final RoleClass CLASS_CODE_EDEFAULT = RoleClass.GUARD;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected RoleClass classCode = CLASS_CODE_EDEFAULT;

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
	protected GuardianImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.GUARDIAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.GUARDIAN__REALM_CODE);
		}
		return realmCodes;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.GUARDIAN__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.GUARDIAN__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.GUARDIAN__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.GUARDIAN__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.GUARDIAN__TEMPLATE_ID);
		}
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getIds() {
		if (ids == null) {
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.GUARDIAN__ID);
		}
		return ids;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.GUARDIAN__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.GUARDIAN__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.GUARDIAN__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.GUARDIAN__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AD> getAddrs() {
		if (addrs == null) {
			addrs = new EObjectContainmentEList<AD>(AD.class, this, CDAPackage.GUARDIAN__ADDR);
		}
		return addrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TEL> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectContainmentEList<TEL>(TEL.class, this, CDAPackage.GUARDIAN__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getGuardianPerson() {
		return guardianPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuardianPerson(Person newGuardianPerson, NotificationChain msgs) {
		Person oldGuardianPerson = guardianPerson;
		guardianPerson = newGuardianPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.GUARDIAN__GUARDIAN_PERSON, oldGuardianPerson, newGuardianPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardianPerson(Person newGuardianPerson) {
		if (newGuardianPerson != guardianPerson) {
			NotificationChain msgs = null;
			if (guardianPerson != null)
				msgs = ((InternalEObject)guardianPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.GUARDIAN__GUARDIAN_PERSON, null, msgs);
			if (newGuardianPerson != null)
				msgs = ((InternalEObject)newGuardianPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.GUARDIAN__GUARDIAN_PERSON, null, msgs);
			msgs = basicSetGuardianPerson(newGuardianPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.GUARDIAN__GUARDIAN_PERSON, newGuardianPerson, newGuardianPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getGuardianOrganization() {
		return guardianOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuardianOrganization(Organization newGuardianOrganization, NotificationChain msgs) {
		Organization oldGuardianOrganization = guardianOrganization;
		guardianOrganization = newGuardianOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.GUARDIAN__GUARDIAN_ORGANIZATION, oldGuardianOrganization, newGuardianOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardianOrganization(Organization newGuardianOrganization) {
		if (newGuardianOrganization != guardianOrganization) {
			NotificationChain msgs = null;
			if (guardianOrganization != null)
				msgs = ((InternalEObject)guardianOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.GUARDIAN__GUARDIAN_ORGANIZATION, null, msgs);
			if (newGuardianOrganization != null)
				msgs = ((InternalEObject)newGuardianOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.GUARDIAN__GUARDIAN_ORGANIZATION, null, msgs);
			msgs = basicSetGuardianOrganization(newGuardianOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.GUARDIAN__GUARDIAN_ORGANIZATION, newGuardianOrganization, newGuardianOrganization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.GUARDIAN__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.GUARDIAN__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
	public RoleClass getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(RoleClass newClassCode) {
		RoleClass oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.GUARDIAN__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		RoleClass oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.GUARDIAN__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
	public boolean validateGuardianChoice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GuardianOperations.validateGuardianChoice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GuardianOperations.validateClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.GUARDIAN__REALM_CODE:
				return ((InternalEList<?>)getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.GUARDIAN__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.GUARDIAN__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.GUARDIAN__ID:
				return ((InternalEList<?>)getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.GUARDIAN__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.GUARDIAN__ADDR:
				return ((InternalEList<?>)getAddrs()).basicRemove(otherEnd, msgs);
			case CDAPackage.GUARDIAN__TELECOM:
				return ((InternalEList<?>)getTelecoms()).basicRemove(otherEnd, msgs);
			case CDAPackage.GUARDIAN__GUARDIAN_PERSON:
				return basicSetGuardianPerson(null, msgs);
			case CDAPackage.GUARDIAN__GUARDIAN_ORGANIZATION:
				return basicSetGuardianOrganization(null, msgs);
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
			case CDAPackage.GUARDIAN__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.GUARDIAN__TYPE_ID:
				return getTypeId();
			case CDAPackage.GUARDIAN__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.GUARDIAN__ID:
				return getIds();
			case CDAPackage.GUARDIAN__CODE:
				return getCode();
			case CDAPackage.GUARDIAN__ADDR:
				return getAddrs();
			case CDAPackage.GUARDIAN__TELECOM:
				return getTelecoms();
			case CDAPackage.GUARDIAN__GUARDIAN_PERSON:
				return getGuardianPerson();
			case CDAPackage.GUARDIAN__GUARDIAN_ORGANIZATION:
				return getGuardianOrganization();
			case CDAPackage.GUARDIAN__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.GUARDIAN__CLASS_CODE:
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
			case CDAPackage.GUARDIAN__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.GUARDIAN__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.GUARDIAN__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.GUARDIAN__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.GUARDIAN__CODE:
				setCode((CE)newValue);
				return;
			case CDAPackage.GUARDIAN__ADDR:
				getAddrs().clear();
				getAddrs().addAll((Collection<? extends AD>)newValue);
				return;
			case CDAPackage.GUARDIAN__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends TEL>)newValue);
				return;
			case CDAPackage.GUARDIAN__GUARDIAN_PERSON:
				setGuardianPerson((Person)newValue);
				return;
			case CDAPackage.GUARDIAN__GUARDIAN_ORGANIZATION:
				setGuardianOrganization((Organization)newValue);
				return;
			case CDAPackage.GUARDIAN__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.GUARDIAN__CLASS_CODE:
				setClassCode((RoleClass)newValue);
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
			case CDAPackage.GUARDIAN__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.GUARDIAN__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.GUARDIAN__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.GUARDIAN__ID:
				getIds().clear();
				return;
			case CDAPackage.GUARDIAN__CODE:
				setCode((CE)null);
				return;
			case CDAPackage.GUARDIAN__ADDR:
				getAddrs().clear();
				return;
			case CDAPackage.GUARDIAN__TELECOM:
				getTelecoms().clear();
				return;
			case CDAPackage.GUARDIAN__GUARDIAN_PERSON:
				setGuardianPerson((Person)null);
				return;
			case CDAPackage.GUARDIAN__GUARDIAN_ORGANIZATION:
				setGuardianOrganization((Organization)null);
				return;
			case CDAPackage.GUARDIAN__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.GUARDIAN__CLASS_CODE:
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
			case CDAPackage.GUARDIAN__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.GUARDIAN__TYPE_ID:
				return typeId != null;
			case CDAPackage.GUARDIAN__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.GUARDIAN__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.GUARDIAN__CODE:
				return code != null;
			case CDAPackage.GUARDIAN__ADDR:
				return addrs != null && !addrs.isEmpty();
			case CDAPackage.GUARDIAN__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case CDAPackage.GUARDIAN__GUARDIAN_PERSON:
				return guardianPerson != null;
			case CDAPackage.GUARDIAN__GUARDIAN_ORGANIZATION:
				return guardianOrganization != null;
			case CDAPackage.GUARDIAN__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.GUARDIAN__CLASS_CODE:
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

} //GuardianImpl
