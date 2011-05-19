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
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.Subject;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.operations.SubstanceAdministrationOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getEffectiveTimes <em>Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getPriorityCode <em>Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getRepeatNumber <em>Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getRouteCode <em>Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getApproachSiteCodes <em>Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getRateQuantity <em>Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getMaxDoseQuantity <em>Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getAdministrationUnitCode <em>Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getConsumable <em>Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getInformants <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getEntryRelationships <em>Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getReferences <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getMoodCode <em>Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl#getNegationInd <em>Negation Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceAdministrationImpl extends ClinicalStatementImpl implements SubstanceAdministration {
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
	 * The cached value of the '{@link #getEffectiveTimes() <em>Effective Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<SXCM_TS> effectiveTimes;

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
	 * The cached value of the '{@link #getApproachSiteCodes() <em>Approach Site Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproachSiteCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CD> approachSiteCodes;

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
	 * The cached value of the '{@link #getAdministrationUnitCode() <em>Administration Unit Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrationUnitCode()
	 * @generated
	 * @ordered
	 */
	protected CE administrationUnitCode;

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
	 * The cached value of the '{@link #getSpecimens() <em>Specimen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimens()
	 * @generated
	 * @ordered
	 */
	protected EList<Specimen> specimens;

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
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<Performer2> performers;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<Author> authors;

	/**
	 * The cached value of the '{@link #getInformants() <em>Informant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformants()
	 * @generated
	 * @ordered
	 */
	protected EList<Informant12> informants;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant2> participants;

	/**
	 * The cached value of the '{@link #getEntryRelationships() <em>Entry Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryRelationship> entryRelationships;

	/**
	 * The cached value of the '{@link #getReferences() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Precondition> preconditions;

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
	 * This is true if the Mood Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moodCodeESet;

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
	 * This is true if the Negation Ind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean negationIndESet;

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
		return CDAPackage.Literals.SUBSTANCE_ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(
				CS.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE);
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
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID, oldTypeId, newTypeId);
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
						CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID, null, msgs);
			}
			if (newTypeId != null) {
				msgs = ((InternalEObject) newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID, null, msgs);
			}
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID, newTypeId, newTypeId));
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
			templateIds = new EObjectContainmentEList<II>(
				II.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID);
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
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__ID);
		}
		return ids;
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__CODE, oldCode, newCode);
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
	public void setCode(CD newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null) {
				msgs = ((InternalEObject) code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__CODE, null, msgs);
			}
			if (newCode != null) {
				msgs = ((InternalEObject) newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__CODE, null, msgs);
			}
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__CODE, newCode, newCode));
		}
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT, oldText, newText);
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
	public void setText(ED newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null) {
				msgs = ((InternalEObject) text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT, null, msgs);
			}
			if (newText != null) {
				msgs = ((InternalEObject) newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT, null, msgs);
			}
			msgs = basicSetText(newText, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT, newText, newText));
		}
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE, oldStatusCode, newStatusCode);
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
	public void setStatusCode(CS newStatusCode) {
		if (newStatusCode != statusCode) {
			NotificationChain msgs = null;
			if (statusCode != null) {
				msgs = ((InternalEObject) statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE, null, msgs);
			}
			if (newStatusCode != null) {
				msgs = ((InternalEObject) newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE, null, msgs);
			}
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE, newStatusCode, newStatusCode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SXCM_TS> getEffectiveTimes() {
		if (effectiveTimes == null) {
			effectiveTimes = new EObjectContainmentEList<SXCM_TS>(
				SXCM_TS.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME);
		}
		return effectiveTimes;
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE, oldPriorityCode,
				newPriorityCode);
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
	public void setPriorityCode(CE newPriorityCode) {
		if (newPriorityCode != priorityCode) {
			NotificationChain msgs = null;
			if (priorityCode != null) {
				msgs = ((InternalEObject) priorityCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE, null, msgs);
			}
			if (newPriorityCode != null) {
				msgs = ((InternalEObject) newPriorityCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE, null, msgs);
			}
			msgs = basicSetPriorityCode(newPriorityCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE, newPriorityCode,
				newPriorityCode));
		}
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER, oldRepeatNumber,
				newRepeatNumber);
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
	public void setRepeatNumber(IVL_INT newRepeatNumber) {
		if (newRepeatNumber != repeatNumber) {
			NotificationChain msgs = null;
			if (repeatNumber != null) {
				msgs = ((InternalEObject) repeatNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER, null, msgs);
			}
			if (newRepeatNumber != null) {
				msgs = ((InternalEObject) newRepeatNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER, null, msgs);
			}
			msgs = basicSetRepeatNumber(newRepeatNumber, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER, newRepeatNumber,
				newRepeatNumber));
		}
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE, oldRouteCode, newRouteCode);
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
	public void setRouteCode(CE newRouteCode) {
		if (newRouteCode != routeCode) {
			NotificationChain msgs = null;
			if (routeCode != null) {
				msgs = ((InternalEObject) routeCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE, null, msgs);
			}
			if (newRouteCode != null) {
				msgs = ((InternalEObject) newRouteCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE, null, msgs);
			}
			msgs = basicSetRouteCode(newRouteCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE, newRouteCode, newRouteCode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CD> getApproachSiteCodes() {
		if (approachSiteCodes == null) {
			approachSiteCodes = new EObjectContainmentEList<CD>(
				CD.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE);
		}
		return approachSiteCodes;
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY, oldDoseQuantity,
				newDoseQuantity);
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
	public void setDoseQuantity(IVL_PQ newDoseQuantity) {
		if (newDoseQuantity != doseQuantity) {
			NotificationChain msgs = null;
			if (doseQuantity != null) {
				msgs = ((InternalEObject) doseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY, null, msgs);
			}
			if (newDoseQuantity != null) {
				msgs = ((InternalEObject) newDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY, null, msgs);
			}
			msgs = basicSetDoseQuantity(newDoseQuantity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY, newDoseQuantity,
				newDoseQuantity));
		}
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY, oldRateQuantity,
				newRateQuantity);
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
	public void setRateQuantity(IVL_PQ newRateQuantity) {
		if (newRateQuantity != rateQuantity) {
			NotificationChain msgs = null;
			if (rateQuantity != null) {
				msgs = ((InternalEObject) rateQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY, null, msgs);
			}
			if (newRateQuantity != null) {
				msgs = ((InternalEObject) newRateQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY, null, msgs);
			}
			msgs = basicSetRateQuantity(newRateQuantity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY, newRateQuantity,
				newRateQuantity));
		}
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY, oldMaxDoseQuantity,
				newMaxDoseQuantity);
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
	public void setMaxDoseQuantity(RTO_PQ_PQ newMaxDoseQuantity) {
		if (newMaxDoseQuantity != maxDoseQuantity) {
			NotificationChain msgs = null;
			if (maxDoseQuantity != null) {
				msgs = ((InternalEObject) maxDoseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY, null, msgs);
			}
			if (newMaxDoseQuantity != null) {
				msgs = ((InternalEObject) newMaxDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY, null, msgs);
			}
			msgs = basicSetMaxDoseQuantity(newMaxDoseQuantity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY, newMaxDoseQuantity,
				newMaxDoseQuantity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getAdministrationUnitCode() {
		return administrationUnitCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrationUnitCode(CE newAdministrationUnitCode, NotificationChain msgs) {
		CE oldAdministrationUnitCode = administrationUnitCode;
		administrationUnitCode = newAdministrationUnitCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE,
				oldAdministrationUnitCode, newAdministrationUnitCode);
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
	public void setAdministrationUnitCode(CE newAdministrationUnitCode) {
		if (newAdministrationUnitCode != administrationUnitCode) {
			NotificationChain msgs = null;
			if (administrationUnitCode != null) {
				msgs = ((InternalEObject) administrationUnitCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE, null, msgs);
			}
			if (newAdministrationUnitCode != null) {
				msgs = ((InternalEObject) newAdministrationUnitCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE, null, msgs);
			}
			msgs = basicSetAdministrationUnitCode(newAdministrationUnitCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE,
				newAdministrationUnitCode, newAdministrationUnitCode));
		}
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(Subject newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null) {
				msgs = ((InternalEObject) subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT, null, msgs);
			}
			if (newSubject != null) {
				msgs = ((InternalEObject) newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT, null, msgs);
			}
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT, newSubject, newSubject));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specimen> getSpecimens() {
		if (specimens == null) {
			specimens = new EObjectContainmentEList<Specimen>(
				Specimen.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN);
		}
		return specimens;
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE, oldConsumable, newConsumable);
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
	public void setConsumable(Consumable newConsumable) {
		if (newConsumable != consumable) {
			NotificationChain msgs = null;
			if (consumable != null) {
				msgs = ((InternalEObject) consumable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE, null, msgs);
			}
			if (newConsumable != null) {
				msgs = ((InternalEObject) newConsumable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE, null, msgs);
			}
			msgs = basicSetConsumable(newConsumable, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE, newConsumable, newConsumable));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Performer2> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<Performer2>(
				Performer2.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Author> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<Author>(
				Author.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Informant12> getInformants() {
		if (informants == null) {
			informants = new EObjectContainmentEList<Informant12>(
				Informant12.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT);
		}
		return informants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(
				Reference.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant2> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Participant2>(
				Participant2.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryRelationship> getEntryRelationships() {
		if (entryRelationships == null) {
			entryRelationships = new EObjectContainmentEList<EntryRelationship>(
				EntryRelationship.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP);
		}
		return entryRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precondition> getPreconditions() {
		if (preconditions == null) {
			preconditions = new EObjectContainmentEList<Precondition>(
				Precondition.class, this, CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION);
		}
		return preconditions;
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
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR, oldNullFlavor, nullFlavor,
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
				this, Notification.UNSET, CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR, oldNullFlavor,
				NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
		classCode = newClassCode == null
				? CLASS_CODE_EDEFAULT
				: newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE, oldClassCode, classCode,
				!oldClassCodeESet));
		}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE, oldClassCode,
				CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
		moodCode = newMoodCode == null
				? MOOD_CODE_EDEFAULT
				: newMoodCode;
		boolean oldMoodCodeESet = moodCodeESet;
		moodCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE, oldMoodCode, moodCode,
				!oldMoodCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoodCode() {
		x_DocumentSubstanceMood oldMoodCode = moodCode;
		boolean oldMoodCodeESet = moodCodeESet;
		moodCode = MOOD_CODE_EDEFAULT;
		moodCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE, oldMoodCode,
				MOOD_CODE_EDEFAULT, oldMoodCodeESet));
		}
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
		boolean oldNegationIndESet = negationIndESet;
		negationIndESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND, oldNegationInd, negationInd,
				!oldNegationIndESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNegationInd() {
		Boolean oldNegationInd = negationInd;
		boolean oldNegationIndESet = negationIndESet;
		negationInd = NEGATION_IND_EDEFAULT;
		negationIndESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND, oldNegationInd,
				NEGATION_IND_EDEFAULT, oldNegationIndESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNegationInd() {
		return negationIndESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceAdministrationOperations.validateClassCode(this, diagnostics, context);
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
				return ((InternalEList<?>) getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID:
				return ((InternalEList<?>) getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ID:
				return ((InternalEList<?>) getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT:
				return basicSetText(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME:
				return ((InternalEList<?>) getEffectiveTimes()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE:
				return basicSetPriorityCode(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER:
				return basicSetRepeatNumber(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE:
				return basicSetRouteCode(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE:
				return ((InternalEList<?>) getApproachSiteCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY:
				return basicSetDoseQuantity(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY:
				return basicSetRateQuantity(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY:
				return basicSetMaxDoseQuantity(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE:
				return basicSetAdministrationUnitCode(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN:
				return ((InternalEList<?>) getSpecimens()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE:
				return basicSetConsumable(null, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER:
				return ((InternalEList<?>) getPerformers()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR:
				return ((InternalEList<?>) getAuthors()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT:
				return ((InternalEList<?>) getInformants()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT:
				return ((InternalEList<?>) getParticipants()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP:
				return ((InternalEList<?>) getEntryRelationships()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE:
				return ((InternalEList<?>) getReferences()).basicRemove(otherEnd, msgs);
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION:
				return ((InternalEList<?>) getPreconditions()).basicRemove(otherEnd, msgs);
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
				return getRealmCodes();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID:
				return getTypeId();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ID:
				return getIds();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CODE:
				return getCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT:
				return getText();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE:
				return getStatusCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME:
				return getEffectiveTimes();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE:
				return getPriorityCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER:
				return getRepeatNumber();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE:
				return getRouteCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE:
				return getApproachSiteCodes();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY:
				return getDoseQuantity();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY:
				return getRateQuantity();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY:
				return getMaxDoseQuantity();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE:
				return getAdministrationUnitCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT:
				return getSubject();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN:
				return getSpecimens();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE:
				return getConsumable();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER:
				return getPerformers();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR:
				return getAuthors();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT:
				return getInformants();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT:
				return getParticipants();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP:
				return getEntryRelationships();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE:
				return getReferences();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION:
				return getPreconditions();
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
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CODE:
				setCode((CD) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT:
				setText((ED) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE:
				setStatusCode((CS) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME:
				getEffectiveTimes().clear();
				getEffectiveTimes().addAll((Collection<? extends SXCM_TS>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE:
				setPriorityCode((CE) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER:
				setRepeatNumber((IVL_INT) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE:
				setRouteCode((CE) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE:
				getApproachSiteCodes().clear();
				getApproachSiteCodes().addAll((Collection<? extends CD>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY:
				setDoseQuantity((IVL_PQ) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY:
				setRateQuantity((IVL_PQ) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY:
				setMaxDoseQuantity((RTO_PQ_PQ) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE:
				setAdministrationUnitCode((CE) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT:
				setSubject((Subject) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN:
				getSpecimens().clear();
				getSpecimens().addAll((Collection<? extends Specimen>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE:
				setConsumable((Consumable) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Performer2>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Author>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT:
				getInformants().clear();
				getInformants().addAll((Collection<? extends Informant12>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant2>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP:
				getEntryRelationships().clear();
				getEntryRelationships().addAll((Collection<? extends EntryRelationship>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection<? extends Precondition>) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR:
				setNullFlavor((NullFlavor) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE:
				setClassCode((ActClass) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE:
				setMoodCode((x_DocumentSubstanceMood) newValue);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND:
				setNegationInd((Boolean) newValue);
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
				getRealmCodes().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ID:
				getIds().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CODE:
				setCode((CD) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT:
				setText((ED) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE:
				setStatusCode((CS) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME:
				getEffectiveTimes().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE:
				setPriorityCode((CE) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER:
				setRepeatNumber((IVL_INT) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE:
				setRouteCode((CE) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE:
				getApproachSiteCodes().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY:
				setDoseQuantity((IVL_PQ) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY:
				setRateQuantity((IVL_PQ) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY:
				setMaxDoseQuantity((RTO_PQ_PQ) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE:
				setAdministrationUnitCode((CE) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT:
				setSubject((Subject) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN:
				getSpecimens().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE:
				setConsumable((Consumable) null);
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER:
				getPerformers().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR:
				getAuthors().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT:
				getInformants().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT:
				getParticipants().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP:
				getEntryRelationships().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE:
				getReferences().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION:
				getPreconditions().clear();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE:
				unsetMoodCode();
				return;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND:
				unsetNegationInd();
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
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID:
				return typeId != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CODE:
				return code != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT:
				return text != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE:
				return statusCode != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME:
				return effectiveTimes != null && !effectiveTimes.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE:
				return priorityCode != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER:
				return repeatNumber != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE:
				return routeCode != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE:
				return approachSiteCodes != null && !approachSiteCodes.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY:
				return doseQuantity != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY:
				return rateQuantity != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY:
				return maxDoseQuantity != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE:
				return administrationUnitCode != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT:
				return subject != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN:
				return specimens != null && !specimens.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE:
				return consumable != null;
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER:
				return performers != null && !performers.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR:
				return authors != null && !authors.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT:
				return informants != null && !informants.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP:
				return entryRelationships != null && !entryRelationships.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE:
				return references != null && !references.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION:
				return preconditions != null && !preconditions.isEmpty();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE:
				return isSetMoodCode();
			case CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND:
				return isSetNegationInd();
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
		result.append(", moodCode: ");
		if (moodCodeESet) {
			result.append(moodCode);
		} else {
			result.append("<unset>");
		}
		result.append(", negationInd: ");
		if (negationIndESet) {
			result.append(negationInd);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // SubstanceAdministrationImpl
