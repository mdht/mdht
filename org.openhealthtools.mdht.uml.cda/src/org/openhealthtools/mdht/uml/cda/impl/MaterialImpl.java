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
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.operations.MaterialOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.rim.impl.EntityImpl;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassManufacturedMaterial;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminerDetermined;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.MaterialImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.MaterialImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.MaterialImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.MaterialImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.MaterialImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.MaterialImpl#getLotNumberText <em>Lot Number Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.MaterialImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.MaterialImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.MaterialImpl#getDeterminerCode <em>Determiner Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaterialImpl extends EntityImpl implements Material {
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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CE code;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EN name;

	/**
	 * The cached value of the '{@link #getLotNumberText() <em>Lot Number Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumberText()
	 * @generated
	 * @ordered
	 */
	protected ST lotNumberText;

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
	protected static final EntityClassManufacturedMaterial CLASS_CODE_EDEFAULT = EntityClassManufacturedMaterial.MMAT;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected EntityClassManufacturedMaterial classCode = CLASS_CODE_EDEFAULT;

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
	protected static final EntityDeterminerDetermined DETERMINER_CODE_EDEFAULT = EntityDeterminerDetermined.KIND;

	/**
	 * The cached value of the '{@link #getDeterminerCode() <em>Determiner Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeterminerCode()
	 * @generated
	 * @ordered
	 */
	protected EntityDeterminerDetermined determinerCode = DETERMINER_CODE_EDEFAULT;

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
	protected MaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.MATERIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.MATERIAL__REALM_CODE);
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
				this, Notification.SET, CDAPackage.MATERIAL__TYPE_ID, oldTypeId, newTypeId);
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
						CDAPackage.MATERIAL__TYPE_ID, null, msgs);
			}
			if (newTypeId != null) {
				msgs = ((InternalEObject) newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.MATERIAL__TYPE_ID, null, msgs);
			}
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.MATERIAL__TYPE_ID, newTypeId, newTypeId));
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
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.MATERIAL__TEMPLATE_ID);
		}
		return templateIds;
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.MATERIAL__CODE, oldCode, newCode);
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
	public void setCode(CE newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null) {
				msgs = ((InternalEObject) code).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.MATERIAL__CODE, null, msgs);
			}
			if (newCode != null) {
				msgs = ((InternalEObject) newCode).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.MATERIAL__CODE, null, msgs);
			}
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.MATERIAL__CODE, newCode, newCode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EN getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(EN newName, NotificationChain msgs) {
		EN oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.MATERIAL__NAME, oldName, newName);
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
	public void setName(EN newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null) {
				msgs = ((InternalEObject) name).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.MATERIAL__NAME, null, msgs);
			}
			if (newName != null) {
				msgs = ((InternalEObject) newName).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.MATERIAL__NAME, null, msgs);
			}
			msgs = basicSetName(newName, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.MATERIAL__NAME, newName, newName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getLotNumberText() {
		return lotNumberText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLotNumberText(ST newLotNumberText, NotificationChain msgs) {
		ST oldLotNumberText = lotNumberText;
		lotNumberText = newLotNumberText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.MATERIAL__LOT_NUMBER_TEXT, oldLotNumberText, newLotNumberText);
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
	public void setLotNumberText(ST newLotNumberText) {
		if (newLotNumberText != lotNumberText) {
			NotificationChain msgs = null;
			if (lotNumberText != null) {
				msgs = ((InternalEObject) lotNumberText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.MATERIAL__LOT_NUMBER_TEXT, null, msgs);
			}
			if (newLotNumberText != null) {
				msgs = ((InternalEObject) newLotNumberText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.MATERIAL__LOT_NUMBER_TEXT, null, msgs);
			}
			msgs = basicSetLotNumberText(newLotNumberText, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.MATERIAL__LOT_NUMBER_TEXT, newLotNumberText, newLotNumberText));
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
				this, Notification.SET, CDAPackage.MATERIAL__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
				this, Notification.UNSET, CDAPackage.MATERIAL__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT,
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
	public EntityClassManufacturedMaterial getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(EntityClassManufacturedMaterial newClassCode) {
		EntityClassManufacturedMaterial oldClassCode = classCode;
		classCode = newClassCode == null
				? CLASS_CODE_EDEFAULT
				: newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.MATERIAL__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		EntityClassManufacturedMaterial oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.MATERIAL__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT,
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
	public EntityDeterminerDetermined getDeterminerCode() {
		return determinerCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeterminerCode(EntityDeterminerDetermined newDeterminerCode) {
		EntityDeterminerDetermined oldDeterminerCode = determinerCode;
		determinerCode = newDeterminerCode == null
				? DETERMINER_CODE_EDEFAULT
				: newDeterminerCode;
		boolean oldDeterminerCodeESet = determinerCodeESet;
		determinerCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.MATERIAL__DETERMINER_CODE, oldDeterminerCode, determinerCode,
				!oldDeterminerCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeterminerCode() {
		EntityDeterminerDetermined oldDeterminerCode = determinerCode;
		boolean oldDeterminerCodeESet = determinerCodeESet;
		determinerCode = DETERMINER_CODE_EDEFAULT;
		determinerCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.MATERIAL__DETERMINER_CODE, oldDeterminerCode,
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
		return MaterialOperations.validateClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MaterialOperations.validateDeterminerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.MATERIAL__REALM_CODE:
				return ((InternalEList<?>) getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.MATERIAL__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.MATERIAL__TEMPLATE_ID:
				return ((InternalEList<?>) getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.MATERIAL__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.MATERIAL__NAME:
				return basicSetName(null, msgs);
			case CDAPackage.MATERIAL__LOT_NUMBER_TEXT:
				return basicSetLotNumberText(null, msgs);
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
			case CDAPackage.MATERIAL__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.MATERIAL__TYPE_ID:
				return getTypeId();
			case CDAPackage.MATERIAL__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.MATERIAL__CODE:
				return getCode();
			case CDAPackage.MATERIAL__NAME:
				return getName();
			case CDAPackage.MATERIAL__LOT_NUMBER_TEXT:
				return getLotNumberText();
			case CDAPackage.MATERIAL__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.MATERIAL__CLASS_CODE:
				return getClassCode();
			case CDAPackage.MATERIAL__DETERMINER_CODE:
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
			case CDAPackage.MATERIAL__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>) newValue);
				return;
			case CDAPackage.MATERIAL__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) newValue);
				return;
			case CDAPackage.MATERIAL__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.MATERIAL__CODE:
				setCode((CE) newValue);
				return;
			case CDAPackage.MATERIAL__NAME:
				setName((EN) newValue);
				return;
			case CDAPackage.MATERIAL__LOT_NUMBER_TEXT:
				setLotNumberText((ST) newValue);
				return;
			case CDAPackage.MATERIAL__NULL_FLAVOR:
				setNullFlavor((NullFlavor) newValue);
				return;
			case CDAPackage.MATERIAL__CLASS_CODE:
				setClassCode((EntityClassManufacturedMaterial) newValue);
				return;
			case CDAPackage.MATERIAL__DETERMINER_CODE:
				setDeterminerCode((EntityDeterminerDetermined) newValue);
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
			case CDAPackage.MATERIAL__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.MATERIAL__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) null);
				return;
			case CDAPackage.MATERIAL__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.MATERIAL__CODE:
				setCode((CE) null);
				return;
			case CDAPackage.MATERIAL__NAME:
				setName((EN) null);
				return;
			case CDAPackage.MATERIAL__LOT_NUMBER_TEXT:
				setLotNumberText((ST) null);
				return;
			case CDAPackage.MATERIAL__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.MATERIAL__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.MATERIAL__DETERMINER_CODE:
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
			case CDAPackage.MATERIAL__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.MATERIAL__TYPE_ID:
				return typeId != null;
			case CDAPackage.MATERIAL__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.MATERIAL__CODE:
				return code != null;
			case CDAPackage.MATERIAL__NAME:
				return name != null;
			case CDAPackage.MATERIAL__LOT_NUMBER_TEXT:
				return lotNumberText != null;
			case CDAPackage.MATERIAL__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.MATERIAL__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.MATERIAL__DETERMINER_CODE:
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

} // MaterialImpl
