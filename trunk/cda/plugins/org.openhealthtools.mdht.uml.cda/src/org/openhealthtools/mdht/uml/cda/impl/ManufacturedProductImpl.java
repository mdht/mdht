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
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LabeledDrug;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.operations.ManufacturedProductOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassManufacturedProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manufactured Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl#getManufacturedLabeledDrug <em>Manufactured Labeled Drug</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl#getManufacturedMaterial <em>Manufactured Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl#getManufacturerOrganization <em>Manufacturer Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl#getClassCode <em>Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManufacturedProductImpl extends EObjectImpl implements ManufacturedProduct {
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
	 * The cached value of the '{@link #getManufacturedLabeledDrug() <em>Manufactured Labeled Drug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedLabeledDrug()
	 * @generated
	 * @ordered
	 */
	protected LabeledDrug manufacturedLabeledDrug;

	/**
	 * The cached value of the '{@link #getManufacturedMaterial() <em>Manufactured Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedMaterial()
	 * @generated
	 * @ordered
	 */
	protected Material manufacturedMaterial;

	/**
	 * The cached value of the '{@link #getManufacturerOrganization() <em>Manufacturer Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization manufacturerOrganization;

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
	protected static final RoleClassManufacturedProduct CLASS_CODE_EDEFAULT = RoleClassManufacturedProduct.MANU;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected RoleClassManufacturedProduct classCode = CLASS_CODE_EDEFAULT;

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
	protected ManufacturedProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.MANUFACTURED_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.MANUFACTURED_PRODUCT__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.MANUFACTURED_PRODUCT__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.MANUFACTURED_PRODUCT__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.MANUFACTURED_PRODUCT__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.MANUFACTURED_PRODUCT__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.MANUFACTURED_PRODUCT__TEMPLATE_ID);
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
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.MANUFACTURED_PRODUCT__ID);
		}
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledDrug getManufacturedLabeledDrug() {
		return manufacturedLabeledDrug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturedLabeledDrug(LabeledDrug newManufacturedLabeledDrug, NotificationChain msgs) {
		LabeledDrug oldManufacturedLabeledDrug = manufacturedLabeledDrug;
		manufacturedLabeledDrug = newManufacturedLabeledDrug;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_LABELED_DRUG, oldManufacturedLabeledDrug, newManufacturedLabeledDrug);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturedLabeledDrug(LabeledDrug newManufacturedLabeledDrug) {
		if (newManufacturedLabeledDrug != manufacturedLabeledDrug) {
			NotificationChain msgs = null;
			if (manufacturedLabeledDrug != null)
				msgs = ((InternalEObject)manufacturedLabeledDrug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_LABELED_DRUG, null, msgs);
			if (newManufacturedLabeledDrug != null)
				msgs = ((InternalEObject)newManufacturedLabeledDrug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_LABELED_DRUG, null, msgs);
			msgs = basicSetManufacturedLabeledDrug(newManufacturedLabeledDrug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_LABELED_DRUG, newManufacturedLabeledDrug, newManufacturedLabeledDrug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material getManufacturedMaterial() {
		return manufacturedMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturedMaterial(Material newManufacturedMaterial, NotificationChain msgs) {
		Material oldManufacturedMaterial = manufacturedMaterial;
		manufacturedMaterial = newManufacturedMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_MATERIAL, oldManufacturedMaterial, newManufacturedMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturedMaterial(Material newManufacturedMaterial) {
		if (newManufacturedMaterial != manufacturedMaterial) {
			NotificationChain msgs = null;
			if (manufacturedMaterial != null)
				msgs = ((InternalEObject)manufacturedMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_MATERIAL, null, msgs);
			if (newManufacturedMaterial != null)
				msgs = ((InternalEObject)newManufacturedMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_MATERIAL, null, msgs);
			msgs = basicSetManufacturedMaterial(newManufacturedMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_MATERIAL, newManufacturedMaterial, newManufacturedMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getManufacturerOrganization() {
		return manufacturerOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturerOrganization(Organization newManufacturerOrganization, NotificationChain msgs) {
		Organization oldManufacturerOrganization = manufacturerOrganization;
		manufacturerOrganization = newManufacturerOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURER_ORGANIZATION, oldManufacturerOrganization, newManufacturerOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturerOrganization(Organization newManufacturerOrganization) {
		if (newManufacturerOrganization != manufacturerOrganization) {
			NotificationChain msgs = null;
			if (manufacturerOrganization != null)
				msgs = ((InternalEObject)manufacturerOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURER_ORGANIZATION, null, msgs);
			if (newManufacturerOrganization != null)
				msgs = ((InternalEObject)newManufacturerOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURER_ORGANIZATION, null, msgs);
			msgs = basicSetManufacturerOrganization(newManufacturerOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURER_ORGANIZATION, newManufacturerOrganization, newManufacturerOrganization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.MANUFACTURED_PRODUCT__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.MANUFACTURED_PRODUCT__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
	public RoleClassManufacturedProduct getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(RoleClassManufacturedProduct newClassCode) {
		RoleClassManufacturedProduct oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.MANUFACTURED_PRODUCT__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		RoleClassManufacturedProduct oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.MANUFACTURED_PRODUCT__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
	public boolean validateManufacturedDrugOrOtherMaterial(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ManufacturedProductOperations.validateManufacturedDrugOrOtherMaterial(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.MANUFACTURED_PRODUCT__REALM_CODE:
				return ((InternalEList<?>)getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.MANUFACTURED_PRODUCT__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.MANUFACTURED_PRODUCT__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.MANUFACTURED_PRODUCT__ID:
				return ((InternalEList<?>)getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_LABELED_DRUG:
				return basicSetManufacturedLabeledDrug(null, msgs);
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_MATERIAL:
				return basicSetManufacturedMaterial(null, msgs);
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURER_ORGANIZATION:
				return basicSetManufacturerOrganization(null, msgs);
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
			case CDAPackage.MANUFACTURED_PRODUCT__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.MANUFACTURED_PRODUCT__TYPE_ID:
				return getTypeId();
			case CDAPackage.MANUFACTURED_PRODUCT__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.MANUFACTURED_PRODUCT__ID:
				return getIds();
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_LABELED_DRUG:
				return getManufacturedLabeledDrug();
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_MATERIAL:
				return getManufacturedMaterial();
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURER_ORGANIZATION:
				return getManufacturerOrganization();
			case CDAPackage.MANUFACTURED_PRODUCT__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.MANUFACTURED_PRODUCT__CLASS_CODE:
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
			case CDAPackage.MANUFACTURED_PRODUCT__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_LABELED_DRUG:
				setManufacturedLabeledDrug((LabeledDrug)newValue);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_MATERIAL:
				setManufacturedMaterial((Material)newValue);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURER_ORGANIZATION:
				setManufacturerOrganization((Organization)newValue);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__CLASS_CODE:
				setClassCode((RoleClassManufacturedProduct)newValue);
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
			case CDAPackage.MANUFACTURED_PRODUCT__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__ID:
				getIds().clear();
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_LABELED_DRUG:
				setManufacturedLabeledDrug((LabeledDrug)null);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_MATERIAL:
				setManufacturedMaterial((Material)null);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURER_ORGANIZATION:
				setManufacturerOrganization((Organization)null);
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.MANUFACTURED_PRODUCT__CLASS_CODE:
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
			case CDAPackage.MANUFACTURED_PRODUCT__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.MANUFACTURED_PRODUCT__TYPE_ID:
				return typeId != null;
			case CDAPackage.MANUFACTURED_PRODUCT__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.MANUFACTURED_PRODUCT__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_LABELED_DRUG:
				return manufacturedLabeledDrug != null;
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_MATERIAL:
				return manufacturedMaterial != null;
			case CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURER_ORGANIZATION:
				return manufacturerOrganization != null;
			case CDAPackage.MANUFACTURED_PRODUCT__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.MANUFACTURED_PRODUCT__CLASS_CODE:
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

} //ManufacturedProductImpl
