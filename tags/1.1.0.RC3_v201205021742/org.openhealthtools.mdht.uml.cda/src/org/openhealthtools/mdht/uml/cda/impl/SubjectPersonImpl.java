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
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.SubjectPerson;
import org.openhealthtools.mdht.uml.cda.operations.SubjectPersonOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.rim.impl.EntityImpl;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getSDTCIds <em>SDTC Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getNames <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getAdministrativeGenderCode <em>Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getBirthTime <em>Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getSDTCDeceasedInd <em>SDTC Deceased Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getSDTCDeceasedTime <em>SDTC Deceased Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl#getDeterminerCode <em>Determiner Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectPersonImpl extends EntityImpl implements SubjectPerson {
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
	 * The cached value of the '{@link #getSDTCIds() <em>SDTC Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDTCIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> sDTCIds;

	/**
	 * The cached value of the '{@link #getNames() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<PN> names;

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
	 * The cached value of the '{@link #getSDTCDeceasedInd() <em>SDTC Deceased Ind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDTCDeceasedInd()
	 * @generated
	 * @ordered
	 */
	protected BL sDTCDeceasedInd;

	/**
	 * The cached value of the '{@link #getSDTCDeceasedTime() <em>SDTC Deceased Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDTCDeceasedTime()
	 * @generated
	 * @ordered
	 */
	protected TS sDTCDeceasedTime;

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
		return CDAPackage.Literals.SUBJECT_PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.SUBJECT_PERSON__REALM_CODE);
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
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__TYPE_ID, oldTypeId, newTypeId);
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
						CDAPackage.SUBJECT_PERSON__TYPE_ID, null, msgs);
			}
			if (newTypeId != null) {
				msgs = ((InternalEObject) newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT_PERSON__TYPE_ID, null, msgs);
			}
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__TYPE_ID, newTypeId, newTypeId));
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
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.SUBJECT_PERSON__TEMPLATE_ID);
		}
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getSDTCIds() {
		if (sDTCIds == null) {
			sDTCIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.SUBJECT_PERSON__SDTC_ID);
		}
		return sDTCIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PN> getNames() {
		if (names == null) {
			names = new EObjectContainmentEList<PN>(PN.class, this, CDAPackage.SUBJECT_PERSON__NAME);
		}
		return names;
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE,
				oldAdministrativeGenderCode, newAdministrativeGenderCode);
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
	public void setAdministrativeGenderCode(CE newAdministrativeGenderCode) {
		if (newAdministrativeGenderCode != administrativeGenderCode) {
			NotificationChain msgs = null;
			if (administrativeGenderCode != null) {
				msgs = ((InternalEObject) administrativeGenderCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE, null, msgs);
			}
			if (newAdministrativeGenderCode != null) {
				msgs = ((InternalEObject) newAdministrativeGenderCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE, null, msgs);
			}
			msgs = basicSetAdministrativeGenderCode(newAdministrativeGenderCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE,
				newAdministrativeGenderCode, newAdministrativeGenderCode));
		}
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__BIRTH_TIME, oldBirthTime, newBirthTime);
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
	public void setBirthTime(TS newBirthTime) {
		if (newBirthTime != birthTime) {
			NotificationChain msgs = null;
			if (birthTime != null) {
				msgs = ((InternalEObject) birthTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT_PERSON__BIRTH_TIME, null, msgs);
			}
			if (newBirthTime != null) {
				msgs = ((InternalEObject) newBirthTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT_PERSON__BIRTH_TIME, null, msgs);
			}
			msgs = basicSetBirthTime(newBirthTime, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__BIRTH_TIME, newBirthTime, newBirthTime));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BL getSDTCDeceasedInd() {
		return sDTCDeceasedInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSDTCDeceasedInd(BL newSDTCDeceasedInd, NotificationChain msgs) {
		BL oldSDTCDeceasedInd = sDTCDeceasedInd;
		sDTCDeceasedInd = newSDTCDeceasedInd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_IND, oldSDTCDeceasedInd,
				newSDTCDeceasedInd);
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
	public void setSDTCDeceasedInd(BL newSDTCDeceasedInd) {
		if (newSDTCDeceasedInd != sDTCDeceasedInd) {
			NotificationChain msgs = null;
			if (sDTCDeceasedInd != null) {
				msgs = ((InternalEObject) sDTCDeceasedInd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_IND, null, msgs);
			}
			if (newSDTCDeceasedInd != null) {
				msgs = ((InternalEObject) newSDTCDeceasedInd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_IND, null, msgs);
			}
			msgs = basicSetSDTCDeceasedInd(newSDTCDeceasedInd, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_IND, newSDTCDeceasedInd,
				newSDTCDeceasedInd));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS getSDTCDeceasedTime() {
		return sDTCDeceasedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSDTCDeceasedTime(TS newSDTCDeceasedTime, NotificationChain msgs) {
		TS oldSDTCDeceasedTime = sDTCDeceasedTime;
		sDTCDeceasedTime = newSDTCDeceasedTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_TIME, oldSDTCDeceasedTime,
				newSDTCDeceasedTime);
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
	public void setSDTCDeceasedTime(TS newSDTCDeceasedTime) {
		if (newSDTCDeceasedTime != sDTCDeceasedTime) {
			NotificationChain msgs = null;
			if (sDTCDeceasedTime != null) {
				msgs = ((InternalEObject) sDTCDeceasedTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_TIME, null, msgs);
			}
			if (newSDTCDeceasedTime != null) {
				msgs = ((InternalEObject) newSDTCDeceasedTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_TIME, null, msgs);
			}
			msgs = basicSetSDTCDeceasedTime(newSDTCDeceasedTime, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_TIME, newSDTCDeceasedTime,
				newSDTCDeceasedTime));
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
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__NULL_FLAVOR, oldNullFlavor, nullFlavor,
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
				this, Notification.UNSET, CDAPackage.SUBJECT_PERSON__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT,
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
		classCode = newClassCode == null
				? CLASS_CODE_EDEFAULT
				: newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__CLASS_CODE, oldClassCode, classCode,
				!oldClassCodeESet));
		}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.SUBJECT_PERSON__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT,
				oldClassCodeESet));
		}
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
		determinerCode = newDeterminerCode == null
				? DETERMINER_CODE_EDEFAULT
				: newDeterminerCode;
		boolean oldDeterminerCodeESet = determinerCodeESet;
		determinerCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBJECT_PERSON__DETERMINER_CODE, oldDeterminerCode, determinerCode,
				!oldDeterminerCodeESet));
		}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.SUBJECT_PERSON__DETERMINER_CODE, oldDeterminerCode,
				DETERMINER_CODE_EDEFAULT, oldDeterminerCodeESet));
		}
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
	public boolean validateClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPersonOperations.validateClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPersonOperations.validateDeterminerCode(this, diagnostics, context);
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
				return ((InternalEList<?>) getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBJECT_PERSON__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.SUBJECT_PERSON__TEMPLATE_ID:
				return ((InternalEList<?>) getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBJECT_PERSON__SDTC_ID:
				return ((InternalEList<?>) getSDTCIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBJECT_PERSON__NAME:
				return ((InternalEList<?>) getNames()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE:
				return basicSetAdministrativeGenderCode(null, msgs);
			case CDAPackage.SUBJECT_PERSON__BIRTH_TIME:
				return basicSetBirthTime(null, msgs);
			case CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_IND:
				return basicSetSDTCDeceasedInd(null, msgs);
			case CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_TIME:
				return basicSetSDTCDeceasedTime(null, msgs);
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
				return getRealmCodes();
			case CDAPackage.SUBJECT_PERSON__TYPE_ID:
				return getTypeId();
			case CDAPackage.SUBJECT_PERSON__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.SUBJECT_PERSON__SDTC_ID:
				return getSDTCIds();
			case CDAPackage.SUBJECT_PERSON__NAME:
				return getNames();
			case CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE:
				return getAdministrativeGenderCode();
			case CDAPackage.SUBJECT_PERSON__BIRTH_TIME:
				return getBirthTime();
			case CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_IND:
				return getSDTCDeceasedInd();
			case CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_TIME:
				return getSDTCDeceasedTime();
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
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>) newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__SDTC_ID:
				getSDTCIds().clear();
				getSDTCIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends PN>) newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE:
				setAdministrativeGenderCode((CE) newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__BIRTH_TIME:
				setBirthTime((TS) newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_IND:
				setSDTCDeceasedInd((BL) newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_TIME:
				setSDTCDeceasedTime((TS) newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__NULL_FLAVOR:
				setNullFlavor((NullFlavor) newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__CLASS_CODE:
				setClassCode((EntityClass) newValue);
				return;
			case CDAPackage.SUBJECT_PERSON__DETERMINER_CODE:
				setDeterminerCode((EntityDeterminer) newValue);
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
				getRealmCodes().clear();
				return;
			case CDAPackage.SUBJECT_PERSON__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) null);
				return;
			case CDAPackage.SUBJECT_PERSON__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.SUBJECT_PERSON__SDTC_ID:
				getSDTCIds().clear();
				return;
			case CDAPackage.SUBJECT_PERSON__NAME:
				getNames().clear();
				return;
			case CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE:
				setAdministrativeGenderCode((CE) null);
				return;
			case CDAPackage.SUBJECT_PERSON__BIRTH_TIME:
				setBirthTime((TS) null);
				return;
			case CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_IND:
				setSDTCDeceasedInd((BL) null);
				return;
			case CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_TIME:
				setSDTCDeceasedTime((TS) null);
				return;
			case CDAPackage.SUBJECT_PERSON__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.SUBJECT_PERSON__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.SUBJECT_PERSON__DETERMINER_CODE:
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
			case CDAPackage.SUBJECT_PERSON__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.SUBJECT_PERSON__TYPE_ID:
				return typeId != null;
			case CDAPackage.SUBJECT_PERSON__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.SUBJECT_PERSON__SDTC_ID:
				return sDTCIds != null && !sDTCIds.isEmpty();
			case CDAPackage.SUBJECT_PERSON__NAME:
				return names != null && !names.isEmpty();
			case CDAPackage.SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE:
				return administrativeGenderCode != null;
			case CDAPackage.SUBJECT_PERSON__BIRTH_TIME:
				return birthTime != null;
			case CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_IND:
				return sDTCDeceasedInd != null;
			case CDAPackage.SUBJECT_PERSON__SDTC_DECEASED_TIME:
				return sDTCDeceasedTime != null;
			case CDAPackage.SUBJECT_PERSON__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.SUBJECT_PERSON__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.SUBJECT_PERSON__DETERMINER_CODE:
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
		result.append(", classCode: ");
		if (classCodeESet) {
			result.append(classCode);
		} else {
			result.append("<unset>");
		}
		result.append(", determinerCode: ");
		if (determinerCodeESet) {
			result.append(determinerCode);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // SubjectPersonImpl
