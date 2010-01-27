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
import org.openhealthtools.mdht.uml.cda.ExternalAct;
import org.openhealthtools.mdht.uml.cda.ExternalDocument;
import org.openhealthtools.mdht.uml.cda.ExternalObservation;
import org.openhealthtools.mdht.uml.cda.ExternalProcedure;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.operations.ReferenceOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl#getSeperatableInd <em>Seperatable Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl#getExternalAct <em>External Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl#getExternalObservation <em>External Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl#getExternalProcedure <em>External Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl#getExternalDocument <em>External Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends EObjectImpl implements Reference {
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
	 * The cached value of the '{@link #getSeperatableInd() <em>Seperatable Ind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeperatableInd()
	 * @generated
	 * @ordered
	 */
	protected BL seperatableInd;

	/**
	 * The cached value of the '{@link #getExternalAct() <em>External Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalAct()
	 * @generated
	 * @ordered
	 */
	protected ExternalAct externalAct;

	/**
	 * The cached value of the '{@link #getExternalObservation() <em>External Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalObservation()
	 * @generated
	 * @ordered
	 */
	protected ExternalObservation externalObservation;

	/**
	 * The cached value of the '{@link #getExternalProcedure() <em>External Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalProcedure()
	 * @generated
	 * @ordered
	 */
	protected ExternalProcedure externalProcedure;

	/**
	 * The cached value of the '{@link #getExternalDocument() <em>External Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocument()
	 * @generated
	 * @ordered
	 */
	protected ExternalDocument externalDocument;

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
	 * The default value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final x_ActRelationshipExternalReference TYPE_CODE_EDEFAULT = x_ActRelationshipExternalReference.ELNK;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected x_ActRelationshipExternalReference typeCode = TYPE_CODE_EDEFAULT;

	/**
	 * This is true if the Type Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.REFERENCE__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.REFERENCE__TEMPLATE_ID);
		}
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BL getSeperatableInd() {
		return seperatableInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeperatableInd(BL newSeperatableInd, NotificationChain msgs) {
		BL oldSeperatableInd = seperatableInd;
		seperatableInd = newSeperatableInd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__SEPERATABLE_IND, oldSeperatableInd, newSeperatableInd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeperatableInd(BL newSeperatableInd) {
		if (newSeperatableInd != seperatableInd) {
			NotificationChain msgs = null;
			if (seperatableInd != null)
				msgs = ((InternalEObject)seperatableInd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__SEPERATABLE_IND, null, msgs);
			if (newSeperatableInd != null)
				msgs = ((InternalEObject)newSeperatableInd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__SEPERATABLE_IND, null, msgs);
			msgs = basicSetSeperatableInd(newSeperatableInd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__SEPERATABLE_IND, newSeperatableInd, newSeperatableInd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAct getExternalAct() {
		return externalAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalAct(ExternalAct newExternalAct, NotificationChain msgs) {
		ExternalAct oldExternalAct = externalAct;
		externalAct = newExternalAct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__EXTERNAL_ACT, oldExternalAct, newExternalAct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalAct(ExternalAct newExternalAct) {
		if (newExternalAct != externalAct) {
			NotificationChain msgs = null;
			if (externalAct != null)
				msgs = ((InternalEObject)externalAct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__EXTERNAL_ACT, null, msgs);
			if (newExternalAct != null)
				msgs = ((InternalEObject)newExternalAct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__EXTERNAL_ACT, null, msgs);
			msgs = basicSetExternalAct(newExternalAct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__EXTERNAL_ACT, newExternalAct, newExternalAct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalObservation getExternalObservation() {
		return externalObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalObservation(ExternalObservation newExternalObservation, NotificationChain msgs) {
		ExternalObservation oldExternalObservation = externalObservation;
		externalObservation = newExternalObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__EXTERNAL_OBSERVATION, oldExternalObservation, newExternalObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalObservation(ExternalObservation newExternalObservation) {
		if (newExternalObservation != externalObservation) {
			NotificationChain msgs = null;
			if (externalObservation != null)
				msgs = ((InternalEObject)externalObservation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__EXTERNAL_OBSERVATION, null, msgs);
			if (newExternalObservation != null)
				msgs = ((InternalEObject)newExternalObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__EXTERNAL_OBSERVATION, null, msgs);
			msgs = basicSetExternalObservation(newExternalObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__EXTERNAL_OBSERVATION, newExternalObservation, newExternalObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalProcedure getExternalProcedure() {
		return externalProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalProcedure(ExternalProcedure newExternalProcedure, NotificationChain msgs) {
		ExternalProcedure oldExternalProcedure = externalProcedure;
		externalProcedure = newExternalProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__EXTERNAL_PROCEDURE, oldExternalProcedure, newExternalProcedure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalProcedure(ExternalProcedure newExternalProcedure) {
		if (newExternalProcedure != externalProcedure) {
			NotificationChain msgs = null;
			if (externalProcedure != null)
				msgs = ((InternalEObject)externalProcedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__EXTERNAL_PROCEDURE, null, msgs);
			if (newExternalProcedure != null)
				msgs = ((InternalEObject)newExternalProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__EXTERNAL_PROCEDURE, null, msgs);
			msgs = basicSetExternalProcedure(newExternalProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__EXTERNAL_PROCEDURE, newExternalProcedure, newExternalProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocument getExternalDocument() {
		return externalDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalDocument(ExternalDocument newExternalDocument, NotificationChain msgs) {
		ExternalDocument oldExternalDocument = externalDocument;
		externalDocument = newExternalDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__EXTERNAL_DOCUMENT, oldExternalDocument, newExternalDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDocument(ExternalDocument newExternalDocument) {
		if (newExternalDocument != externalDocument) {
			NotificationChain msgs = null;
			if (externalDocument != null)
				msgs = ((InternalEObject)externalDocument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__EXTERNAL_DOCUMENT, null, msgs);
			if (newExternalDocument != null)
				msgs = ((InternalEObject)newExternalDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE__EXTERNAL_DOCUMENT, null, msgs);
			msgs = basicSetExternalDocument(newExternalDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__EXTERNAL_DOCUMENT, newExternalDocument, newExternalDocument));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.REFERENCE__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
	public x_ActRelationshipExternalReference getTypeCode() {
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCode(x_ActRelationshipExternalReference newTypeCode) {
		x_ActRelationshipExternalReference oldTypeCode = typeCode;
		typeCode = newTypeCode == null ? TYPE_CODE_EDEFAULT : newTypeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE__TYPE_CODE, oldTypeCode, typeCode, !oldTypeCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCode() {
		x_ActRelationshipExternalReference oldTypeCode = typeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCode = TYPE_CODE_EDEFAULT;
		typeCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.REFERENCE__TYPE_CODE, oldTypeCode, TYPE_CODE_EDEFAULT, oldTypeCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCode() {
		return typeCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalActChoice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferenceOperations.validateExternalActChoice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.REFERENCE__REALM_CODE:
				return ((InternalEList<?>)getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.REFERENCE__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.REFERENCE__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.REFERENCE__SEPERATABLE_IND:
				return basicSetSeperatableInd(null, msgs);
			case CDAPackage.REFERENCE__EXTERNAL_ACT:
				return basicSetExternalAct(null, msgs);
			case CDAPackage.REFERENCE__EXTERNAL_OBSERVATION:
				return basicSetExternalObservation(null, msgs);
			case CDAPackage.REFERENCE__EXTERNAL_PROCEDURE:
				return basicSetExternalProcedure(null, msgs);
			case CDAPackage.REFERENCE__EXTERNAL_DOCUMENT:
				return basicSetExternalDocument(null, msgs);
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
			case CDAPackage.REFERENCE__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.REFERENCE__TYPE_ID:
				return getTypeId();
			case CDAPackage.REFERENCE__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.REFERENCE__SEPERATABLE_IND:
				return getSeperatableInd();
			case CDAPackage.REFERENCE__EXTERNAL_ACT:
				return getExternalAct();
			case CDAPackage.REFERENCE__EXTERNAL_OBSERVATION:
				return getExternalObservation();
			case CDAPackage.REFERENCE__EXTERNAL_PROCEDURE:
				return getExternalProcedure();
			case CDAPackage.REFERENCE__EXTERNAL_DOCUMENT:
				return getExternalDocument();
			case CDAPackage.REFERENCE__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.REFERENCE__TYPE_CODE:
				return getTypeCode();
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
			case CDAPackage.REFERENCE__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.REFERENCE__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.REFERENCE__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.REFERENCE__SEPERATABLE_IND:
				setSeperatableInd((BL)newValue);
				return;
			case CDAPackage.REFERENCE__EXTERNAL_ACT:
				setExternalAct((ExternalAct)newValue);
				return;
			case CDAPackage.REFERENCE__EXTERNAL_OBSERVATION:
				setExternalObservation((ExternalObservation)newValue);
				return;
			case CDAPackage.REFERENCE__EXTERNAL_PROCEDURE:
				setExternalProcedure((ExternalProcedure)newValue);
				return;
			case CDAPackage.REFERENCE__EXTERNAL_DOCUMENT:
				setExternalDocument((ExternalDocument)newValue);
				return;
			case CDAPackage.REFERENCE__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.REFERENCE__TYPE_CODE:
				setTypeCode((x_ActRelationshipExternalReference)newValue);
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
			case CDAPackage.REFERENCE__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.REFERENCE__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.REFERENCE__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.REFERENCE__SEPERATABLE_IND:
				setSeperatableInd((BL)null);
				return;
			case CDAPackage.REFERENCE__EXTERNAL_ACT:
				setExternalAct((ExternalAct)null);
				return;
			case CDAPackage.REFERENCE__EXTERNAL_OBSERVATION:
				setExternalObservation((ExternalObservation)null);
				return;
			case CDAPackage.REFERENCE__EXTERNAL_PROCEDURE:
				setExternalProcedure((ExternalProcedure)null);
				return;
			case CDAPackage.REFERENCE__EXTERNAL_DOCUMENT:
				setExternalDocument((ExternalDocument)null);
				return;
			case CDAPackage.REFERENCE__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.REFERENCE__TYPE_CODE:
				unsetTypeCode();
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
			case CDAPackage.REFERENCE__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.REFERENCE__TYPE_ID:
				return typeId != null;
			case CDAPackage.REFERENCE__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.REFERENCE__SEPERATABLE_IND:
				return seperatableInd != null;
			case CDAPackage.REFERENCE__EXTERNAL_ACT:
				return externalAct != null;
			case CDAPackage.REFERENCE__EXTERNAL_OBSERVATION:
				return externalObservation != null;
			case CDAPackage.REFERENCE__EXTERNAL_PROCEDURE:
				return externalProcedure != null;
			case CDAPackage.REFERENCE__EXTERNAL_DOCUMENT:
				return externalDocument != null;
			case CDAPackage.REFERENCE__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.REFERENCE__TYPE_CODE:
				return isSetTypeCode();
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
		result.append(", typeCode: ");
		if (typeCodeESet) result.append(typeCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReferenceImpl
