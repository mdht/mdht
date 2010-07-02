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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Location;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActImpl;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encompassing Encounter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getDischargeDispositionCode <em>Discharge Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getEncounterParticipants <em>Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl#getMoodCode <em>Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncompassingEncounterImpl extends RIMActImpl implements EncompassingEncounter {
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
	 * The cached value of the '{@link #getEffectiveTime() <em>Effective Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected IVL_TS effectiveTime;

	/**
	 * The cached value of the '{@link #getDischargeDispositionCode() <em>Discharge Disposition Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDispositionCode()
	 * @generated
	 * @ordered
	 */
	protected CE dischargeDispositionCode;

	/**
	 * The cached value of the '{@link #getResponsibleParty() <em>Responsible Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParty()
	 * @generated
	 * @ordered
	 */
	protected ResponsibleParty responsibleParty;

	/**
	 * The cached value of the '{@link #getEncounterParticipants() <em>Encounter Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterParticipant> encounterParticipants;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

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
	protected static final ActClass CLASS_CODE_EDEFAULT = ActClass.ENC;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected ActClass classCode = CLASS_CODE_EDEFAULT;

	/**
	 * This is true if the Class Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classCodeESet;

	/**
	 * The default value of the '{@link #getMoodCode() <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoodCode()
	 * @generated
	 * @ordered
	 */
	protected static final ActMood MOOD_CODE_EDEFAULT = ActMood.EVN;

	/**
	 * The cached value of the '{@link #getMoodCode() <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoodCode()
	 * @generated
	 * @ordered
	 */
	protected ActMood moodCode = MOOD_CODE_EDEFAULT;

	/**
	 * This is true if the Mood Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moodCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncompassingEncounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.ENCOMPASSING_ENCOUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.ENCOMPASSING_ENCOUNTER__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.ENCOMPASSING_ENCOUNTER__TEMPLATE_ID);
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
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.ENCOMPASSING_ENCOUNTER__ID);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS getEffectiveTime() {
		return effectiveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveTime(IVL_TS newEffectiveTime, NotificationChain msgs) {
		IVL_TS oldEffectiveTime = effectiveTime;
		effectiveTime = newEffectiveTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__EFFECTIVE_TIME, oldEffectiveTime, newEffectiveTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveTime(IVL_TS newEffectiveTime) {
		if (newEffectiveTime != effectiveTime) {
			NotificationChain msgs = null;
			if (effectiveTime != null)
				msgs = ((InternalEObject)effectiveTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__EFFECTIVE_TIME, null, msgs);
			if (newEffectiveTime != null)
				msgs = ((InternalEObject)newEffectiveTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__EFFECTIVE_TIME, null, msgs);
			msgs = basicSetEffectiveTime(newEffectiveTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__EFFECTIVE_TIME, newEffectiveTime, newEffectiveTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getDischargeDispositionCode() {
		return dischargeDispositionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDischargeDispositionCode(CE newDischargeDispositionCode, NotificationChain msgs) {
		CE oldDischargeDispositionCode = dischargeDispositionCode;
		dischargeDispositionCode = newDischargeDispositionCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__DISCHARGE_DISPOSITION_CODE, oldDischargeDispositionCode, newDischargeDispositionCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDischargeDispositionCode(CE newDischargeDispositionCode) {
		if (newDischargeDispositionCode != dischargeDispositionCode) {
			NotificationChain msgs = null;
			if (dischargeDispositionCode != null)
				msgs = ((InternalEObject)dischargeDispositionCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__DISCHARGE_DISPOSITION_CODE, null, msgs);
			if (newDischargeDispositionCode != null)
				msgs = ((InternalEObject)newDischargeDispositionCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__DISCHARGE_DISPOSITION_CODE, null, msgs);
			msgs = basicSetDischargeDispositionCode(newDischargeDispositionCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__DISCHARGE_DISPOSITION_CODE, newDischargeDispositionCode, newDischargeDispositionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsibleParty getResponsibleParty() {
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleParty(ResponsibleParty newResponsibleParty, NotificationChain msgs) {
		ResponsibleParty oldResponsibleParty = responsibleParty;
		responsibleParty = newResponsibleParty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__RESPONSIBLE_PARTY, oldResponsibleParty, newResponsibleParty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleParty(ResponsibleParty newResponsibleParty) {
		if (newResponsibleParty != responsibleParty) {
			NotificationChain msgs = null;
			if (responsibleParty != null)
				msgs = ((InternalEObject)responsibleParty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__RESPONSIBLE_PARTY, null, msgs);
			if (newResponsibleParty != null)
				msgs = ((InternalEObject)newResponsibleParty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__RESPONSIBLE_PARTY, null, msgs);
			msgs = basicSetResponsibleParty(newResponsibleParty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__RESPONSIBLE_PARTY, newResponsibleParty, newResponsibleParty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterParticipant> getEncounterParticipants() {
		if (encounterParticipants == null) {
			encounterParticipants = new EObjectContainmentEList<EncounterParticipant>(EncounterParticipant.class, this, CDAPackage.ENCOMPASSING_ENCOUNTER__ENCOUNTER_PARTICIPANT);
		}
		return encounterParticipants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.ENCOMPASSING_ENCOUNTER__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__LOCATION, newLocation, newLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.ENCOMPASSING_ENCOUNTER__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
	public ActClass getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(ActClass newClassCode) {
		ActClass oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		ActClass oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.ENCOMPASSING_ENCOUNTER__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
	public ActMood getMoodCode() {
		return moodCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoodCode(ActMood newMoodCode) {
		ActMood oldMoodCode = moodCode;
		moodCode = newMoodCode == null ? MOOD_CODE_EDEFAULT : newMoodCode;
		boolean oldMoodCodeESet = moodCodeESet;
		moodCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ENCOMPASSING_ENCOUNTER__MOOD_CODE, oldMoodCode, moodCode, !oldMoodCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoodCode() {
		ActMood oldMoodCode = moodCode;
		boolean oldMoodCodeESet = moodCodeESet;
		moodCode = MOOD_CODE_EDEFAULT;
		moodCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.ENCOMPASSING_ENCOUNTER__MOOD_CODE, oldMoodCode, MOOD_CODE_EDEFAULT, oldMoodCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoodCode() {
		return moodCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.ENCOMPASSING_ENCOUNTER__REALM_CODE:
				return ((InternalEList<?>)getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.ENCOMPASSING_ENCOUNTER__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.ENCOMPASSING_ENCOUNTER__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.ENCOMPASSING_ENCOUNTER__ID:
				return ((InternalEList<?>)getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.ENCOMPASSING_ENCOUNTER__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.ENCOMPASSING_ENCOUNTER__EFFECTIVE_TIME:
				return basicSetEffectiveTime(null, msgs);
			case CDAPackage.ENCOMPASSING_ENCOUNTER__DISCHARGE_DISPOSITION_CODE:
				return basicSetDischargeDispositionCode(null, msgs);
			case CDAPackage.ENCOMPASSING_ENCOUNTER__RESPONSIBLE_PARTY:
				return basicSetResponsibleParty(null, msgs);
			case CDAPackage.ENCOMPASSING_ENCOUNTER__ENCOUNTER_PARTICIPANT:
				return ((InternalEList<?>)getEncounterParticipants()).basicRemove(otherEnd, msgs);
			case CDAPackage.ENCOMPASSING_ENCOUNTER__LOCATION:
				return basicSetLocation(null, msgs);
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
			case CDAPackage.ENCOMPASSING_ENCOUNTER__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__TYPE_ID:
				return getTypeId();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__ID:
				return getIds();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__CODE:
				return getCode();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__EFFECTIVE_TIME:
				return getEffectiveTime();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__DISCHARGE_DISPOSITION_CODE:
				return getDischargeDispositionCode();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__RESPONSIBLE_PARTY:
				return getResponsibleParty();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__ENCOUNTER_PARTICIPANT:
				return getEncounterParticipants();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__LOCATION:
				return getLocation();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__CLASS_CODE:
				return getClassCode();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__MOOD_CODE:
				return getMoodCode();
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
			case CDAPackage.ENCOMPASSING_ENCOUNTER__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__CODE:
				setCode((CE)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__EFFECTIVE_TIME:
				setEffectiveTime((IVL_TS)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__DISCHARGE_DISPOSITION_CODE:
				setDischargeDispositionCode((CE)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__RESPONSIBLE_PARTY:
				setResponsibleParty((ResponsibleParty)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__ENCOUNTER_PARTICIPANT:
				getEncounterParticipants().clear();
				getEncounterParticipants().addAll((Collection<? extends EncounterParticipant>)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__LOCATION:
				setLocation((Location)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__CLASS_CODE:
				setClassCode((ActClass)newValue);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__MOOD_CODE:
				setMoodCode((ActMood)newValue);
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
			case CDAPackage.ENCOMPASSING_ENCOUNTER__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__ID:
				getIds().clear();
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__CODE:
				setCode((CE)null);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__EFFECTIVE_TIME:
				setEffectiveTime((IVL_TS)null);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__DISCHARGE_DISPOSITION_CODE:
				setDischargeDispositionCode((CE)null);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__RESPONSIBLE_PARTY:
				setResponsibleParty((ResponsibleParty)null);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__ENCOUNTER_PARTICIPANT:
				getEncounterParticipants().clear();
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__LOCATION:
				setLocation((Location)null);
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__MOOD_CODE:
				unsetMoodCode();
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
			case CDAPackage.ENCOMPASSING_ENCOUNTER__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__TYPE_ID:
				return typeId != null;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__CODE:
				return code != null;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__EFFECTIVE_TIME:
				return effectiveTime != null;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__DISCHARGE_DISPOSITION_CODE:
				return dischargeDispositionCode != null;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__RESPONSIBLE_PARTY:
				return responsibleParty != null;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__ENCOUNTER_PARTICIPANT:
				return encounterParticipants != null && !encounterParticipants.isEmpty();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__LOCATION:
				return location != null;
			case CDAPackage.ENCOMPASSING_ENCOUNTER__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.ENCOMPASSING_ENCOUNTER__MOOD_CODE:
				return isSetMoodCode();
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
		result.append(", moodCode: ");
		if (moodCodeESet) result.append(moodCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EncompassingEncounterImpl
