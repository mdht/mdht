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

import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.Product;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.Subject;
import org.openhealthtools.mdht.uml.cda.Supply;

import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;

import org.openhealthtools.mdht.uml.hl7.vocab.ActClassSupply;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getPriorityCode <em>Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getRepeatNumber <em>Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getIndependentInd <em>Independent Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getExpectedUseTime <em>Expected Use Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getInformant <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getEntryRelationship <em>Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl#getMoodCode <em>Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplyImpl extends EObjectImpl implements Supply {
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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CD code;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected ED text;

	/**
	 * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected CS statusCode;

	/**
	 * The cached value of the '{@link #getEffectiveTime() <em>Effective Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected EList<SXCM_TS> effectiveTime;

	/**
	 * The cached value of the '{@link #getPriorityCode() <em>Priority Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CE> priorityCode;

	/**
	 * The cached value of the '{@link #getRepeatNumber() <em>Repeat Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatNumber()
	 * @generated
	 * @ordered
	 */
	protected IVL_INT repeatNumber;

	/**
	 * The cached value of the '{@link #getIndependentInd() <em>Independent Ind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndependentInd()
	 * @generated
	 * @ordered
	 */
	protected BL independentInd;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected PQ quantity;

	/**
	 * The cached value of the '{@link #getExpectedUseTime() <em>Expected Use Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedUseTime()
	 * @generated
	 * @ordered
	 */
	protected IVL_TS expectedUseTime;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Subject subject;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected EList<Specimen> specimen;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Performer2> performer;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Author> author;

	/**
	 * The cached value of the '{@link #getInformant() <em>Informant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformant()
	 * @generated
	 * @ordered
	 */
	protected EList<Informant12> informant;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant2> participant;

	/**
	 * The cached value of the '{@link #getEntryRelationship() <em>Entry Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryRelationship> entryRelationship;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Precondition> precondition;

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
	protected static final ActClassSupply CLASS_CODE_EDEFAULT = ActClassSupply.SPLY;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected ActClassSupply classCode = CLASS_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoodCode() <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoodCode()
	 * @generated
	 * @ordered
	 */
	protected static final x_DocumentSubstanceMood MOOD_CODE_EDEFAULT = x_DocumentSubstanceMood.EVN;

	/**
	 * The cached value of the '{@link #getMoodCode() <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoodCode()
	 * @generated
	 * @ordered
	 */
	protected x_DocumentSubstanceMood moodCode = MOOD_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getSupply();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.SUPPLY__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.SUPPLY__TEMPLATE_ID);
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
			id = new EObjectContainmentEList<II>(II.class, this, CDAPackage.SUPPLY__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CD newCode, NotificationChain msgs) {
		CD oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CD newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(ED newText, NotificationChain msgs) {
		ED oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(ED newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS getStatusCode() {
		return statusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusCode(CS newStatusCode, NotificationChain msgs) {
		CS oldStatusCode = statusCode;
		statusCode = newStatusCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__STATUS_CODE, oldStatusCode, newStatusCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusCode(CS newStatusCode) {
		if (newStatusCode != statusCode) {
			NotificationChain msgs = null;
			if (statusCode != null)
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SXCM_TS> getEffectiveTime() {
		if (effectiveTime == null) {
			effectiveTime = new EObjectContainmentEList<SXCM_TS>(SXCM_TS.class, this, CDAPackage.SUPPLY__EFFECTIVE_TIME);
		}
		return effectiveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CE> getPriorityCode() {
		if (priorityCode == null) {
			priorityCode = new EObjectContainmentEList<CE>(CE.class, this, CDAPackage.SUPPLY__PRIORITY_CODE);
		}
		return priorityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_INT getRepeatNumber() {
		return repeatNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatNumber(IVL_INT newRepeatNumber, NotificationChain msgs) {
		IVL_INT oldRepeatNumber = repeatNumber;
		repeatNumber = newRepeatNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__REPEAT_NUMBER, oldRepeatNumber, newRepeatNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatNumber(IVL_INT newRepeatNumber) {
		if (newRepeatNumber != repeatNumber) {
			NotificationChain msgs = null;
			if (repeatNumber != null)
				msgs = ((InternalEObject)repeatNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__REPEAT_NUMBER, null, msgs);
			if (newRepeatNumber != null)
				msgs = ((InternalEObject)newRepeatNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__REPEAT_NUMBER, null, msgs);
			msgs = basicSetRepeatNumber(newRepeatNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__REPEAT_NUMBER, newRepeatNumber, newRepeatNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BL getIndependentInd() {
		return independentInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndependentInd(BL newIndependentInd, NotificationChain msgs) {
		BL oldIndependentInd = independentInd;
		independentInd = newIndependentInd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__INDEPENDENT_IND, oldIndependentInd, newIndependentInd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndependentInd(BL newIndependentInd) {
		if (newIndependentInd != independentInd) {
			NotificationChain msgs = null;
			if (independentInd != null)
				msgs = ((InternalEObject)independentInd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__INDEPENDENT_IND, null, msgs);
			if (newIndependentInd != null)
				msgs = ((InternalEObject)newIndependentInd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__INDEPENDENT_IND, null, msgs);
			msgs = basicSetIndependentInd(newIndependentInd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__INDEPENDENT_IND, newIndependentInd, newIndependentInd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PQ getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(PQ newQuantity, NotificationChain msgs) {
		PQ oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(PQ newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS getExpectedUseTime() {
		return expectedUseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedUseTime(IVL_TS newExpectedUseTime, NotificationChain msgs) {
		IVL_TS oldExpectedUseTime = expectedUseTime;
		expectedUseTime = newExpectedUseTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__EXPECTED_USE_TIME, oldExpectedUseTime, newExpectedUseTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedUseTime(IVL_TS newExpectedUseTime) {
		if (newExpectedUseTime != expectedUseTime) {
			NotificationChain msgs = null;
			if (expectedUseTime != null)
				msgs = ((InternalEObject)expectedUseTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__EXPECTED_USE_TIME, null, msgs);
			if (newExpectedUseTime != null)
				msgs = ((InternalEObject)newExpectedUseTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__EXPECTED_USE_TIME, null, msgs);
			msgs = basicSetExpectedUseTime(newExpectedUseTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__EXPECTED_USE_TIME, newExpectedUseTime, newExpectedUseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Subject newSubject, NotificationChain msgs) {
		Subject oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Subject newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specimen> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Specimen>(Specimen.class, this, CDAPackage.SUPPLY__SPECIMEN);
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(Product newProduct, NotificationChain msgs) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__PRODUCT, oldProduct, newProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Product newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject)product).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__PRODUCT, null, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUPPLY__PRODUCT, null, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Performer2> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Performer2>(Performer2.class, this, CDAPackage.SUPPLY__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Author> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<Author>(Author.class, this, CDAPackage.SUPPLY__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Informant12> getInformant() {
		if (informant == null) {
			informant = new EObjectContainmentEList<Informant12>(Informant12.class, this, CDAPackage.SUPPLY__INFORMANT);
		}
		return informant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant2> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<Participant2>(Participant2.class, this, CDAPackage.SUPPLY__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryRelationship> getEntryRelationship() {
		if (entryRelationship == null) {
			entryRelationship = new EObjectContainmentEList<EntryRelationship>(EntryRelationship.class, this, CDAPackage.SUPPLY__ENTRY_RELATIONSHIP);
		}
		return entryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<Reference>(Reference.class, this, CDAPackage.SUPPLY__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precondition> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList<Precondition>(Precondition.class, this, CDAPackage.SUPPLY__PRECONDITION);
		}
		return precondition;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__NULL_FLAVOR, oldNullFlavor, nullFlavor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActClassSupply getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(ActClassSupply newClassCode) {
		ActClassSupply oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__CLASS_CODE, oldClassCode, classCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_DocumentSubstanceMood getMoodCode() {
		return moodCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoodCode(x_DocumentSubstanceMood newMoodCode) {
		x_DocumentSubstanceMood oldMoodCode = moodCode;
		moodCode = newMoodCode == null ? MOOD_CODE_EDEFAULT : newMoodCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUPPLY__MOOD_CODE, oldMoodCode, moodCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.SUPPLY__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.SUPPLY__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.SUPPLY__TEXT:
				return basicSetText(null, msgs);
			case CDAPackage.SUPPLY__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case CDAPackage.SUPPLY__EFFECTIVE_TIME:
				return ((InternalEList<?>)getEffectiveTime()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__PRIORITY_CODE:
				return ((InternalEList<?>)getPriorityCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__REPEAT_NUMBER:
				return basicSetRepeatNumber(null, msgs);
			case CDAPackage.SUPPLY__INDEPENDENT_IND:
				return basicSetIndependentInd(null, msgs);
			case CDAPackage.SUPPLY__QUANTITY:
				return basicSetQuantity(null, msgs);
			case CDAPackage.SUPPLY__EXPECTED_USE_TIME:
				return basicSetExpectedUseTime(null, msgs);
			case CDAPackage.SUPPLY__SUBJECT:
				return basicSetSubject(null, msgs);
			case CDAPackage.SUPPLY__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__PRODUCT:
				return basicSetProduct(null, msgs);
			case CDAPackage.SUPPLY__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__INFORMANT:
				return ((InternalEList<?>)getInformant()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__ENTRY_RELATIONSHIP:
				return ((InternalEList<?>)getEntryRelationship()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUPPLY__PRECONDITION:
				return ((InternalEList<?>)getPrecondition()).basicRemove(otherEnd, msgs);
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
			case CDAPackage.SUPPLY__REALM_CODE:
				return getRealmCode();
			case CDAPackage.SUPPLY__TYPE_ID:
				return getTypeId();
			case CDAPackage.SUPPLY__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.SUPPLY__ID:
				return getId();
			case CDAPackage.SUPPLY__CODE:
				return getCode();
			case CDAPackage.SUPPLY__TEXT:
				return getText();
			case CDAPackage.SUPPLY__STATUS_CODE:
				return getStatusCode();
			case CDAPackage.SUPPLY__EFFECTIVE_TIME:
				return getEffectiveTime();
			case CDAPackage.SUPPLY__PRIORITY_CODE:
				return getPriorityCode();
			case CDAPackage.SUPPLY__REPEAT_NUMBER:
				return getRepeatNumber();
			case CDAPackage.SUPPLY__INDEPENDENT_IND:
				return getIndependentInd();
			case CDAPackage.SUPPLY__QUANTITY:
				return getQuantity();
			case CDAPackage.SUPPLY__EXPECTED_USE_TIME:
				return getExpectedUseTime();
			case CDAPackage.SUPPLY__SUBJECT:
				return getSubject();
			case CDAPackage.SUPPLY__SPECIMEN:
				return getSpecimen();
			case CDAPackage.SUPPLY__PRODUCT:
				return getProduct();
			case CDAPackage.SUPPLY__PERFORMER:
				return getPerformer();
			case CDAPackage.SUPPLY__AUTHOR:
				return getAuthor();
			case CDAPackage.SUPPLY__INFORMANT:
				return getInformant();
			case CDAPackage.SUPPLY__PARTICIPANT:
				return getParticipant();
			case CDAPackage.SUPPLY__ENTRY_RELATIONSHIP:
				return getEntryRelationship();
			case CDAPackage.SUPPLY__REFERENCE:
				return getReference();
			case CDAPackage.SUPPLY__PRECONDITION:
				return getPrecondition();
			case CDAPackage.SUPPLY__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.SUPPLY__CLASS_CODE:
				return getClassCode();
			case CDAPackage.SUPPLY__MOOD_CODE:
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
			case CDAPackage.SUPPLY__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.SUPPLY__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.SUPPLY__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.SUPPLY__ID:
				getId().clear();
				getId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.SUPPLY__CODE:
				setCode((CD)newValue);
				return;
			case CDAPackage.SUPPLY__TEXT:
				setText((ED)newValue);
				return;
			case CDAPackage.SUPPLY__STATUS_CODE:
				setStatusCode((CS)newValue);
				return;
			case CDAPackage.SUPPLY__EFFECTIVE_TIME:
				getEffectiveTime().clear();
				getEffectiveTime().addAll((Collection<? extends SXCM_TS>)newValue);
				return;
			case CDAPackage.SUPPLY__PRIORITY_CODE:
				getPriorityCode().clear();
				getPriorityCode().addAll((Collection<? extends CE>)newValue);
				return;
			case CDAPackage.SUPPLY__REPEAT_NUMBER:
				setRepeatNumber((IVL_INT)newValue);
				return;
			case CDAPackage.SUPPLY__INDEPENDENT_IND:
				setIndependentInd((BL)newValue);
				return;
			case CDAPackage.SUPPLY__QUANTITY:
				setQuantity((PQ)newValue);
				return;
			case CDAPackage.SUPPLY__EXPECTED_USE_TIME:
				setExpectedUseTime((IVL_TS)newValue);
				return;
			case CDAPackage.SUPPLY__SUBJECT:
				setSubject((Subject)newValue);
				return;
			case CDAPackage.SUPPLY__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Specimen>)newValue);
				return;
			case CDAPackage.SUPPLY__PRODUCT:
				setProduct((Product)newValue);
				return;
			case CDAPackage.SUPPLY__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Performer2>)newValue);
				return;
			case CDAPackage.SUPPLY__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Author>)newValue);
				return;
			case CDAPackage.SUPPLY__INFORMANT:
				getInformant().clear();
				getInformant().addAll((Collection<? extends Informant12>)newValue);
				return;
			case CDAPackage.SUPPLY__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Participant2>)newValue);
				return;
			case CDAPackage.SUPPLY__ENTRY_RELATIONSHIP:
				getEntryRelationship().clear();
				getEntryRelationship().addAll((Collection<? extends EntryRelationship>)newValue);
				return;
			case CDAPackage.SUPPLY__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case CDAPackage.SUPPLY__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Precondition>)newValue);
				return;
			case CDAPackage.SUPPLY__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.SUPPLY__CLASS_CODE:
				setClassCode((ActClassSupply)newValue);
				return;
			case CDAPackage.SUPPLY__MOOD_CODE:
				setMoodCode((x_DocumentSubstanceMood)newValue);
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
			case CDAPackage.SUPPLY__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.SUPPLY__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.SUPPLY__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.SUPPLY__ID:
				getId().clear();
				return;
			case CDAPackage.SUPPLY__CODE:
				setCode((CD)null);
				return;
			case CDAPackage.SUPPLY__TEXT:
				setText((ED)null);
				return;
			case CDAPackage.SUPPLY__STATUS_CODE:
				setStatusCode((CS)null);
				return;
			case CDAPackage.SUPPLY__EFFECTIVE_TIME:
				getEffectiveTime().clear();
				return;
			case CDAPackage.SUPPLY__PRIORITY_CODE:
				getPriorityCode().clear();
				return;
			case CDAPackage.SUPPLY__REPEAT_NUMBER:
				setRepeatNumber((IVL_INT)null);
				return;
			case CDAPackage.SUPPLY__INDEPENDENT_IND:
				setIndependentInd((BL)null);
				return;
			case CDAPackage.SUPPLY__QUANTITY:
				setQuantity((PQ)null);
				return;
			case CDAPackage.SUPPLY__EXPECTED_USE_TIME:
				setExpectedUseTime((IVL_TS)null);
				return;
			case CDAPackage.SUPPLY__SUBJECT:
				setSubject((Subject)null);
				return;
			case CDAPackage.SUPPLY__SPECIMEN:
				getSpecimen().clear();
				return;
			case CDAPackage.SUPPLY__PRODUCT:
				setProduct((Product)null);
				return;
			case CDAPackage.SUPPLY__PERFORMER:
				getPerformer().clear();
				return;
			case CDAPackage.SUPPLY__AUTHOR:
				getAuthor().clear();
				return;
			case CDAPackage.SUPPLY__INFORMANT:
				getInformant().clear();
				return;
			case CDAPackage.SUPPLY__PARTICIPANT:
				getParticipant().clear();
				return;
			case CDAPackage.SUPPLY__ENTRY_RELATIONSHIP:
				getEntryRelationship().clear();
				return;
			case CDAPackage.SUPPLY__REFERENCE:
				getReference().clear();
				return;
			case CDAPackage.SUPPLY__PRECONDITION:
				getPrecondition().clear();
				return;
			case CDAPackage.SUPPLY__NULL_FLAVOR:
				setNullFlavor(NULL_FLAVOR_EDEFAULT);
				return;
			case CDAPackage.SUPPLY__CLASS_CODE:
				setClassCode(CLASS_CODE_EDEFAULT);
				return;
			case CDAPackage.SUPPLY__MOOD_CODE:
				setMoodCode(MOOD_CODE_EDEFAULT);
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
			case CDAPackage.SUPPLY__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.SUPPLY__TYPE_ID:
				return typeId != null;
			case CDAPackage.SUPPLY__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.SUPPLY__ID:
				return id != null && !id.isEmpty();
			case CDAPackage.SUPPLY__CODE:
				return code != null;
			case CDAPackage.SUPPLY__TEXT:
				return text != null;
			case CDAPackage.SUPPLY__STATUS_CODE:
				return statusCode != null;
			case CDAPackage.SUPPLY__EFFECTIVE_TIME:
				return effectiveTime != null && !effectiveTime.isEmpty();
			case CDAPackage.SUPPLY__PRIORITY_CODE:
				return priorityCode != null && !priorityCode.isEmpty();
			case CDAPackage.SUPPLY__REPEAT_NUMBER:
				return repeatNumber != null;
			case CDAPackage.SUPPLY__INDEPENDENT_IND:
				return independentInd != null;
			case CDAPackage.SUPPLY__QUANTITY:
				return quantity != null;
			case CDAPackage.SUPPLY__EXPECTED_USE_TIME:
				return expectedUseTime != null;
			case CDAPackage.SUPPLY__SUBJECT:
				return subject != null;
			case CDAPackage.SUPPLY__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case CDAPackage.SUPPLY__PRODUCT:
				return product != null;
			case CDAPackage.SUPPLY__PERFORMER:
				return performer != null && !performer.isEmpty();
			case CDAPackage.SUPPLY__AUTHOR:
				return author != null && !author.isEmpty();
			case CDAPackage.SUPPLY__INFORMANT:
				return informant != null && !informant.isEmpty();
			case CDAPackage.SUPPLY__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case CDAPackage.SUPPLY__ENTRY_RELATIONSHIP:
				return entryRelationship != null && !entryRelationship.isEmpty();
			case CDAPackage.SUPPLY__REFERENCE:
				return reference != null && !reference.isEmpty();
			case CDAPackage.SUPPLY__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case CDAPackage.SUPPLY__NULL_FLAVOR:
				return nullFlavor != NULL_FLAVOR_EDEFAULT;
			case CDAPackage.SUPPLY__CLASS_CODE:
				return classCode != CLASS_CODE_EDEFAULT;
			case CDAPackage.SUPPLY__MOOD_CODE:
				return moodCode != MOOD_CODE_EDEFAULT;
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
		result.append(", moodCode: ");
		result.append(moodCode);
		result.append(')');
		return result.toString();
	}

} //SupplyImpl
