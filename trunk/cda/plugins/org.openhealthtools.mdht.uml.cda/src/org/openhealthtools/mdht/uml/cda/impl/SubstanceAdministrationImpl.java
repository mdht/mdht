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

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.Subject;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.internal.operations.SubstanceAdministrationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;

import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getPriorityCode <em>Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getRepeatNumber <em>Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getRouteCode <em>Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getApproachSiteCode <em>Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getRateQuantity <em>Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getMaxDoseQuantity <em>Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getAdministrativeUnitCode <em>Administrative Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getConsumable <em>Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getInformant <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getEntryRelationship <em>Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getMoodCode <em>Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getNegationInd <em>Negation Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceAdministrationImpl extends EObjectImpl implements SubstanceAdministration {
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
	 * The cached value of the '{@link #getPriorityCode() <em>Priority Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityCode()
	 * @generated
	 * @ordered
	 */
	protected CE priorityCode;

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
	 * The cached value of the '{@link #getRouteCode() <em>Route Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteCode()
	 * @generated
	 * @ordered
	 */
	protected CE routeCode;

	/**
	 * The cached value of the '{@link #getApproachSiteCode() <em>Approach Site Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproachSiteCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CD> approachSiteCode;

	/**
	 * The cached value of the '{@link #getDoseQuantity() <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected IVL_PQ doseQuantity;

	/**
	 * The cached value of the '{@link #getRateQuantity() <em>Rate Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateQuantity()
	 * @generated
	 * @ordered
	 */
	protected IVL_PQ rateQuantity;

	/**
	 * The cached value of the '{@link #getMaxDoseQuantity() <em>Max Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected RTO_PQ_PQ maxDoseQuantity;

	/**
	 * The cached value of the '{@link #getAdministrativeUnitCode() <em>Administrative Unit Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeUnitCode()
	 * @generated
	 * @ordered
	 */
	protected CE administrativeUnitCode;

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
	 * The cached value of the '{@link #getConsumable() <em>Consumable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumable()
	 * @generated
	 * @ordered
	 */
	protected Consumable consumable;

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
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

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
	protected static final ActClass CLASS_CODE_EDEFAULT = ActClass.SBADM;

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
	 * The default value of the '{@link #getNegationInd() <em>Negation Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegationInd()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEGATION_IND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegationInd() <em>Negation Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegationInd()
	 * @generated
	 * @ordered
	 */
	protected Boolean negationInd = NEGATION_IND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getSubstanceAdministration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID);
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
			id = new EObjectContainmentEList<II>(II.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__ID);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT, newText, newText));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE, oldStatusCode, newStatusCode);
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
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SXCM_TS> getEffectiveTime() {
		if (effectiveTime == null) {
			effectiveTime = new EObjectContainmentEList<SXCM_TS>(SXCM_TS.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME);
		}
		return effectiveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getPriorityCode() {
		return priorityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorityCode(CE newPriorityCode, NotificationChain msgs) {
		CE oldPriorityCode = priorityCode;
		priorityCode = newPriorityCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE, oldPriorityCode, newPriorityCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorityCode(CE newPriorityCode) {
		if (newPriorityCode != priorityCode) {
			NotificationChain msgs = null;
			if (priorityCode != null)
				msgs = ((InternalEObject)priorityCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE, null, msgs);
			if (newPriorityCode != null)
				msgs = ((InternalEObject)newPriorityCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE, null, msgs);
			msgs = basicSetPriorityCode(newPriorityCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE, newPriorityCode, newPriorityCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER, oldRepeatNumber, newRepeatNumber);
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
				msgs = ((InternalEObject)repeatNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER, null, msgs);
			if (newRepeatNumber != null)
				msgs = ((InternalEObject)newRepeatNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER, null, msgs);
			msgs = basicSetRepeatNumber(newRepeatNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER, newRepeatNumber, newRepeatNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getRouteCode() {
		return routeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteCode(CE newRouteCode, NotificationChain msgs) {
		CE oldRouteCode = routeCode;
		routeCode = newRouteCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE, oldRouteCode, newRouteCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteCode(CE newRouteCode) {
		if (newRouteCode != routeCode) {
			NotificationChain msgs = null;
			if (routeCode != null)
				msgs = ((InternalEObject)routeCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE, null, msgs);
			if (newRouteCode != null)
				msgs = ((InternalEObject)newRouteCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE, null, msgs);
			msgs = basicSetRouteCode(newRouteCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE, newRouteCode, newRouteCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CD> getApproachSiteCode() {
		if (approachSiteCode == null) {
			approachSiteCode = new EObjectContainmentEList<CD>(CD.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE);
		}
		return approachSiteCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_PQ getDoseQuantity() {
		return doseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseQuantity(IVL_PQ newDoseQuantity, NotificationChain msgs) {
		IVL_PQ oldDoseQuantity = doseQuantity;
		doseQuantity = newDoseQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY, oldDoseQuantity, newDoseQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseQuantity(IVL_PQ newDoseQuantity) {
		if (newDoseQuantity != doseQuantity) {
			NotificationChain msgs = null;
			if (doseQuantity != null)
				msgs = ((InternalEObject)doseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY, null, msgs);
			if (newDoseQuantity != null)
				msgs = ((InternalEObject)newDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY, null, msgs);
			msgs = basicSetDoseQuantity(newDoseQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY, newDoseQuantity, newDoseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_PQ getRateQuantity() {
		return rateQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateQuantity(IVL_PQ newRateQuantity, NotificationChain msgs) {
		IVL_PQ oldRateQuantity = rateQuantity;
		rateQuantity = newRateQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY, oldRateQuantity, newRateQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateQuantity(IVL_PQ newRateQuantity) {
		if (newRateQuantity != rateQuantity) {
			NotificationChain msgs = null;
			if (rateQuantity != null)
				msgs = ((InternalEObject)rateQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY, null, msgs);
			if (newRateQuantity != null)
				msgs = ((InternalEObject)newRateQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY, null, msgs);
			msgs = basicSetRateQuantity(newRateQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY, newRateQuantity, newRateQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO_PQ_PQ getMaxDoseQuantity() {
		return maxDoseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDoseQuantity(RTO_PQ_PQ newMaxDoseQuantity, NotificationChain msgs) {
		RTO_PQ_PQ oldMaxDoseQuantity = maxDoseQuantity;
		maxDoseQuantity = newMaxDoseQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY, oldMaxDoseQuantity, newMaxDoseQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDoseQuantity(RTO_PQ_PQ newMaxDoseQuantity) {
		if (newMaxDoseQuantity != maxDoseQuantity) {
			NotificationChain msgs = null;
			if (maxDoseQuantity != null)
				msgs = ((InternalEObject)maxDoseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY, null, msgs);
			if (newMaxDoseQuantity != null)
				msgs = ((InternalEObject)newMaxDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY, null, msgs);
			msgs = basicSetMaxDoseQuantity(newMaxDoseQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY, newMaxDoseQuantity, newMaxDoseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getAdministrativeUnitCode() {
		return administrativeUnitCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrativeUnitCode(CE newAdministrativeUnitCode, NotificationChain msgs) {
		CE oldAdministrativeUnitCode = administrativeUnitCode;
		administrativeUnitCode = newAdministrativeUnitCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATIVE_UNIT_CODE, oldAdministrativeUnitCode, newAdministrativeUnitCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrativeUnitCode(CE newAdministrativeUnitCode) {
		if (newAdministrativeUnitCode != administrativeUnitCode) {
			NotificationChain msgs = null;
			if (administrativeUnitCode != null)
				msgs = ((InternalEObject)administrativeUnitCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATIVE_UNIT_CODE, null, msgs);
			if (newAdministrativeUnitCode != null)
				msgs = ((InternalEObject)newAdministrativeUnitCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATIVE_UNIT_CODE, null, msgs);
			msgs = basicSetAdministrativeUnitCode(newAdministrativeUnitCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATIVE_UNIT_CODE, newAdministrativeUnitCode, newAdministrativeUnitCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specimen> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Specimen>(Specimen.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN);
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumable getConsumable() {
		return consumable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsumable(Consumable newConsumable, NotificationChain msgs) {
		Consumable oldConsumable = consumable;
		consumable = newConsumable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE, oldConsumable, newConsumable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumable(Consumable newConsumable) {
		if (newConsumable != consumable) {
			NotificationChain msgs = null;
			if (consumable != null)
				msgs = ((InternalEObject)consumable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE, null, msgs);
			if (newConsumable != null)
				msgs = ((InternalEObject)newConsumable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE, null, msgs);
			msgs = basicSetConsumable(newConsumable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE, newConsumable, newConsumable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Performer2> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Performer2>(Performer2.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER);
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
			author = new EObjectContainmentEList<Author>(Author.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR);
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
			informant = new EObjectContainmentEList<Informant12>(Informant12.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT);
		}
		return informant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<Reference>(Reference.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant2> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<Participant2>(Participant2.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT);
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
			entryRelationship = new EObjectContainmentEList<EntryRelationship>(EntryRelationship.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP);
		}
		return entryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precondition> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList<Precondition>(Precondition.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR, oldNullFlavor, nullFlavor));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE, oldClassCode, classCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE, oldMoodCode, moodCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNegationInd() {
		return negationInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegationInd(Boolean newNegationInd) {
		Boolean oldNegationInd = negationInd;
		negationInd = newNegationInd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND, oldNegationInd, negationInd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAct(Act act) {
		SubstanceAdministrationOperations.addAct(this, act);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEncounter(Encounter encounter) {
		SubstanceAdministrationOperations.addEncounter(this, encounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addObservation(Observation observation) {
		SubstanceAdministrationOperations.addObservation(this, observation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addObservationMedia(ObservationMedia observationMedia) {
		SubstanceAdministrationOperations.addObservationMedia(this, observationMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addOrganizer(Organizer organizer) {
		SubstanceAdministrationOperations.addOrganizer(this, organizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addProcedure(Procedure procedure) {
		SubstanceAdministrationOperations.addProcedure(this, procedure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRegionOfInterest(RegionOfInterest regionOfInterest) {
		SubstanceAdministrationOperations.addRegionOfInterest(this, regionOfInterest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSubstanceAdministration(SubstanceAdministration newSubstanceAdministration) {
		SubstanceAdministrationOperations.addSubstanceAdministration(this, newSubstanceAdministration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSupply(Supply supply) {
		SubstanceAdministrationOperations.addSupply(this, supply);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Act> getAct() {
		return SubstanceAdministrationOperations.getAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encounter> getEncounter() {
		return SubstanceAdministrationOperations.getEncounter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observation> getObservation() {
		return SubstanceAdministrationOperations.getObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationMedia> getObservationMedia() {
		return SubstanceAdministrationOperations.getObservationMedia(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organizer> getOrganizer() {
		return SubstanceAdministrationOperations.getOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedure() {
		return SubstanceAdministrationOperations.getProcedure(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegionOfInterest> getRegionOfInterest() {
		return SubstanceAdministrationOperations.getRegionOfInterest(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceAdministration> getSubstanceAdministration() {
		return SubstanceAdministrationOperations.getSubstanceAdministration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Supply> getSupply() {
		return SubstanceAdministrationOperations.getSupply(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasActTemplate(String templateId) {
		return SubstanceAdministrationOperations.hasActTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasCode(String code, String codeSystem, String codeSystemName) {
		return SubstanceAdministrationOperations.hasCode(this, code, codeSystem, codeSystemName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEncounterTemplate(String templateId) {
		return SubstanceAdministrationOperations.hasEncounterTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasObservationMediaTemplate(String templateId) {
		return SubstanceAdministrationOperations.hasObservationMediaTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasObservationTemplate(String templateId) {
		return SubstanceAdministrationOperations.hasObservationTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasOrganizerTemplate(String templateId) {
		return SubstanceAdministrationOperations.hasOrganizerTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasProcedureTemplate(String templateId) {
		return SubstanceAdministrationOperations.hasProcedureTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasRegionOfInterestTemplate(String templateId) {
		return SubstanceAdministrationOperations.hasRegionOfInterestTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSubstanceAdministrationTemplate(String templateId) {
		return SubstanceAdministrationOperations.hasSubstanceAdministrationTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSupplyTemplate(String templateId) {
		return SubstanceAdministrationOperations.hasSupplyTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasTemplateId(String templateId) {
		return SubstanceAdministrationOperations.hasTemplateId(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT:
				return basicSetText(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME:
				return ((InternalEList<?>)getEffectiveTime()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE:
				return basicSetPriorityCode(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER:
				return basicSetRepeatNumber(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE:
				return basicSetRouteCode(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE:
				return ((InternalEList<?>)getApproachSiteCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY:
				return basicSetDoseQuantity(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY:
				return basicSetRateQuantity(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY:
				return basicSetMaxDoseQuantity(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATIVE_UNIT_CODE:
				return basicSetAdministrativeUnitCode(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE:
				return basicSetConsumable(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT:
				return ((InternalEList<?>)getInformant()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP:
				return ((InternalEList<?>)getEntryRelationship()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION:
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
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE:
				return getRealmCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID:
				return getTypeId();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ID:
				return getId();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CODE:
				return getCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT:
				return getText();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE:
				return getStatusCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME:
				return getEffectiveTime();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE:
				return getPriorityCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER:
				return getRepeatNumber();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE:
				return getRouteCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE:
				return getApproachSiteCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY:
				return getDoseQuantity();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY:
				return getRateQuantity();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY:
				return getMaxDoseQuantity();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATIVE_UNIT_CODE:
				return getAdministrativeUnitCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT:
				return getSubject();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN:
				return getSpecimen();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE:
				return getConsumable();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER:
				return getPerformer();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR:
				return getAuthor();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT:
				return getInformant();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE:
				return getReference();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT:
				return getParticipant();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP:
				return getEntryRelationship();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION:
				return getPrecondition();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE:
				return getClassCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE:
				return getMoodCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND:
				return getNegationInd();
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
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ID:
				getId().clear();
				getId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CODE:
				setCode((CD)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT:
				setText((ED)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE:
				setStatusCode((CS)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME:
				getEffectiveTime().clear();
				getEffectiveTime().addAll((Collection<? extends SXCM_TS>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE:
				setPriorityCode((CE)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER:
				setRepeatNumber((IVL_INT)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE:
				setRouteCode((CE)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE:
				getApproachSiteCode().clear();
				getApproachSiteCode().addAll((Collection<? extends CD>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY:
				setDoseQuantity((IVL_PQ)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY:
				setRateQuantity((IVL_PQ)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY:
				setMaxDoseQuantity((RTO_PQ_PQ)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATIVE_UNIT_CODE:
				setAdministrativeUnitCode((CE)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT:
				setSubject((Subject)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Specimen>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE:
				setConsumable((Consumable)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Performer2>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Author>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT:
				getInformant().clear();
				getInformant().addAll((Collection<? extends Informant12>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Participant2>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP:
				getEntryRelationship().clear();
				getEntryRelationship().addAll((Collection<? extends EntryRelationship>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Precondition>)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE:
				setClassCode((ActClass)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE:
				setMoodCode((x_DocumentSubstanceMood)newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND:
				setNegationInd((Boolean)newValue);
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
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ID:
				getId().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CODE:
				setCode((CD)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT:
				setText((ED)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE:
				setStatusCode((CS)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME:
				getEffectiveTime().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE:
				setPriorityCode((CE)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER:
				setRepeatNumber((IVL_INT)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE:
				setRouteCode((CE)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE:
				getApproachSiteCode().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY:
				setDoseQuantity((IVL_PQ)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY:
				setRateQuantity((IVL_PQ)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY:
				setMaxDoseQuantity((RTO_PQ_PQ)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATIVE_UNIT_CODE:
				setAdministrativeUnitCode((CE)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT:
				setSubject((Subject)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN:
				getSpecimen().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE:
				setConsumable((Consumable)null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER:
				getPerformer().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR:
				getAuthor().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT:
				getInformant().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE:
				getReference().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT:
				getParticipant().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP:
				getEntryRelationship().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION:
				getPrecondition().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR:
				setNullFlavor(NULL_FLAVOR_EDEFAULT);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE:
				setClassCode(CLASS_CODE_EDEFAULT);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE:
				setMoodCode(MOOD_CODE_EDEFAULT);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND:
				setNegationInd(NEGATION_IND_EDEFAULT);
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
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID:
				return typeId != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ID:
				return id != null && !id.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CODE:
				return code != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT:
				return text != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE:
				return statusCode != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME:
				return effectiveTime != null && !effectiveTime.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE:
				return priorityCode != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER:
				return repeatNumber != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE:
				return routeCode != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE:
				return approachSiteCode != null && !approachSiteCode.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY:
				return doseQuantity != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY:
				return rateQuantity != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY:
				return maxDoseQuantity != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATIVE_UNIT_CODE:
				return administrativeUnitCode != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT:
				return subject != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE:
				return consumable != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER:
				return performer != null && !performer.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR:
				return author != null && !author.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT:
				return informant != null && !informant.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE:
				return reference != null && !reference.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP:
				return entryRelationship != null && !entryRelationship.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR:
				return nullFlavor != NULL_FLAVOR_EDEFAULT;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE:
				return classCode != CLASS_CODE_EDEFAULT;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE:
				return moodCode != MOOD_CODE_EDEFAULT;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND:
				return NEGATION_IND_EDEFAULT == null ? negationInd != null : !NEGATION_IND_EDEFAULT.equals(negationInd);
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
		result.append(", negationInd: ");
		result.append(negationInd);
		result.append(')');
		return result.toString();
	}

} //SubstanceAdministrationImpl
