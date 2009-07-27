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
import org.openhealthtools.mdht.uml.cda.ReferenceRange;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.Subject;

import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getDerivationExpr <em>Derivation Expr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getPriorityCode <em>Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getRepeatNumber <em>Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getInterpretationCode <em>Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getMethodCode <em>Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getTargetSiteCode <em>Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getInformant <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getEntryRelationship <em>Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getReferenceRange <em>Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getMoodCode <em>Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getNegationInd <em>Negation Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationImpl extends EObjectImpl implements Observation {
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
	 * The cached value of the '{@link #getDerivationExpr() <em>Derivation Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationExpr()
	 * @generated
	 * @ordered
	 */
	protected ST derivationExpr;

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
	 * The cached value of the '{@link #getEffectiveTime() <em>Effective Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected IVL_TS effectiveTime;

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
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected CS languageCode;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ANY> value;

	/**
	 * The cached value of the '{@link #getInterpretationCode() <em>Interpretation Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CE> interpretationCode;

	/**
	 * The cached value of the '{@link #getMethodCode() <em>Method Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CE> methodCode;

	/**
	 * The cached value of the '{@link #getTargetSiteCode() <em>Target Site Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSiteCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CD> targetSiteCode;

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
	 * The cached value of the '{@link #getReferenceRange() <em>Reference Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceRange()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceRange> referenceRange;

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
	protected static final ActClassObservation CLASS_CODE_EDEFAULT = ActClassObservation.ALRT;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected ActClassObservation classCode = CLASS_CODE_EDEFAULT;

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
	protected static final x_ActMoodDocumentObservation MOOD_CODE_EDEFAULT = x_ActMoodDocumentObservation.DEF;

	/**
	 * The cached value of the '{@link #getMoodCode() <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoodCode()
	 * @generated
	 * @ordered
	 */
	protected x_ActMoodDocumentObservation moodCode = MOOD_CODE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getObservation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.OBSERVATION__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.OBSERVATION__TEMPLATE_ID);
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
			id = new EObjectContainmentEList<II>(II.class, this, CDAPackage.OBSERVATION__ID);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getDerivationExpr() {
		return derivationExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationExpr(ST newDerivationExpr, NotificationChain msgs) {
		ST oldDerivationExpr = derivationExpr;
		derivationExpr = newDerivationExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__DERIVATION_EXPR, oldDerivationExpr, newDerivationExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationExpr(ST newDerivationExpr) {
		if (newDerivationExpr != derivationExpr) {
			NotificationChain msgs = null;
			if (derivationExpr != null)
				msgs = ((InternalEObject)derivationExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__DERIVATION_EXPR, null, msgs);
			if (newDerivationExpr != null)
				msgs = ((InternalEObject)newDerivationExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__DERIVATION_EXPR, null, msgs);
			msgs = basicSetDerivationExpr(newDerivationExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__DERIVATION_EXPR, newDerivationExpr, newDerivationExpr));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__TEXT, newText, newText));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__STATUS_CODE, oldStatusCode, newStatusCode);
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
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__STATUS_CODE, newStatusCode, newStatusCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__EFFECTIVE_TIME, oldEffectiveTime, newEffectiveTime);
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
				msgs = ((InternalEObject)effectiveTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__EFFECTIVE_TIME, null, msgs);
			if (newEffectiveTime != null)
				msgs = ((InternalEObject)newEffectiveTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__EFFECTIVE_TIME, null, msgs);
			msgs = basicSetEffectiveTime(newEffectiveTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__EFFECTIVE_TIME, newEffectiveTime, newEffectiveTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__PRIORITY_CODE, oldPriorityCode, newPriorityCode);
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
				msgs = ((InternalEObject)priorityCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__PRIORITY_CODE, null, msgs);
			if (newPriorityCode != null)
				msgs = ((InternalEObject)newPriorityCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__PRIORITY_CODE, null, msgs);
			msgs = basicSetPriorityCode(newPriorityCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__PRIORITY_CODE, newPriorityCode, newPriorityCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__REPEAT_NUMBER, oldRepeatNumber, newRepeatNumber);
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
				msgs = ((InternalEObject)repeatNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__REPEAT_NUMBER, null, msgs);
			if (newRepeatNumber != null)
				msgs = ((InternalEObject)newRepeatNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__REPEAT_NUMBER, null, msgs);
			msgs = basicSetRepeatNumber(newRepeatNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__REPEAT_NUMBER, newRepeatNumber, newRepeatNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS getLanguageCode() {
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguageCode(CS newLanguageCode, NotificationChain msgs) {
		CS oldLanguageCode = languageCode;
		languageCode = newLanguageCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__LANGUAGE_CODE, oldLanguageCode, newLanguageCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageCode(CS newLanguageCode) {
		if (newLanguageCode != languageCode) {
			NotificationChain msgs = null;
			if (languageCode != null)
				msgs = ((InternalEObject)languageCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__LANGUAGE_CODE, null, msgs);
			if (newLanguageCode != null)
				msgs = ((InternalEObject)newLanguageCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__LANGUAGE_CODE, null, msgs);
			msgs = basicSetLanguageCode(newLanguageCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__LANGUAGE_CODE, newLanguageCode, newLanguageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ANY> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<ANY>(ANY.class, this, CDAPackage.OBSERVATION__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CE> getInterpretationCode() {
		if (interpretationCode == null) {
			interpretationCode = new EObjectContainmentEList<CE>(CE.class, this, CDAPackage.OBSERVATION__INTERPRETATION_CODE);
		}
		return interpretationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CE> getMethodCode() {
		if (methodCode == null) {
			methodCode = new EObjectContainmentEList<CE>(CE.class, this, CDAPackage.OBSERVATION__METHOD_CODE);
		}
		return methodCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CD> getTargetSiteCode() {
		if (targetSiteCode == null) {
			targetSiteCode = new EObjectContainmentEList<CD>(CD.class, this, CDAPackage.OBSERVATION__TARGET_SITE_CODE);
		}
		return targetSiteCode;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specimen> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Specimen>(Specimen.class, this, CDAPackage.OBSERVATION__SPECIMEN);
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Performer2> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Performer2>(Performer2.class, this, CDAPackage.OBSERVATION__PERFORMER);
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
			author = new EObjectContainmentEList<Author>(Author.class, this, CDAPackage.OBSERVATION__AUTHOR);
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
			informant = new EObjectContainmentEList<Informant12>(Informant12.class, this, CDAPackage.OBSERVATION__INFORMANT);
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
			participant = new EObjectContainmentEList<Participant2>(Participant2.class, this, CDAPackage.OBSERVATION__PARTICIPANT);
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
			entryRelationship = new EObjectContainmentEList<EntryRelationship>(EntryRelationship.class, this, CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP);
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
			reference = new EObjectContainmentEList<Reference>(Reference.class, this, CDAPackage.OBSERVATION__REFERENCE);
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
			precondition = new EObjectContainmentEList<Precondition>(Precondition.class, this, CDAPackage.OBSERVATION__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceRange> getReferenceRange() {
		if (referenceRange == null) {
			referenceRange = new EObjectContainmentEList<ReferenceRange>(ReferenceRange.class, this, CDAPackage.OBSERVATION__REFERENCE_RANGE);
		}
		return referenceRange;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.OBSERVATION__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
	public ActClassObservation getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(ActClassObservation newClassCode) {
		ActClassObservation oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		ActClassObservation oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.OBSERVATION__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
	public x_ActMoodDocumentObservation getMoodCode() {
		return moodCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoodCode(x_ActMoodDocumentObservation newMoodCode) {
		x_ActMoodDocumentObservation oldMoodCode = moodCode;
		moodCode = newMoodCode == null ? MOOD_CODE_EDEFAULT : newMoodCode;
		boolean oldMoodCodeESet = moodCodeESet;
		moodCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__MOOD_CODE, oldMoodCode, moodCode, !oldMoodCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoodCode() {
		x_ActMoodDocumentObservation oldMoodCode = moodCode;
		boolean oldMoodCodeESet = moodCodeESet;
		moodCode = MOOD_CODE_EDEFAULT;
		moodCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.OBSERVATION__MOOD_CODE, oldMoodCode, MOOD_CODE_EDEFAULT, oldMoodCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__NEGATION_IND, oldNegationInd, negationInd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAct(Act act) {
		ObservationOperations.addAct(this, act);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEncounter(Encounter encounter) {
		ObservationOperations.addEncounter(this, encounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addObservation(Observation newObservation) {
		ObservationOperations.addObservation(this, newObservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addObservationMedia(ObservationMedia observationMedia) {
		ObservationOperations.addObservationMedia(this, observationMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addOrganizer(Organizer organizer) {
		ObservationOperations.addOrganizer(this, organizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addProcedure(Procedure procedure) {
		ObservationOperations.addProcedure(this, procedure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRegionOfInterest(RegionOfInterest regionOfInterest) {
		ObservationOperations.addRegionOfInterest(this, regionOfInterest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSubstanceAdministration(SubstanceAdministration substanceAdministration) {
		ObservationOperations.addSubstanceAdministration(this, substanceAdministration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSupply(Supply supply) {
		ObservationOperations.addSupply(this, supply);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Act> getAct() {
		return ObservationOperations.getAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encounter> getEncounter() {
		return ObservationOperations.getEncounter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observation> getObservation() {
		return ObservationOperations.getObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationMedia> getObservationMedia() {
		return ObservationOperations.getObservationMedia(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organizer> getOrganizer() {
		return ObservationOperations.getOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedure() {
		return ObservationOperations.getProcedure(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegionOfInterest> getRegionOfInterest() {
		return ObservationOperations.getRegionOfInterest(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceAdministration> getSubstanceAdministration() {
		return ObservationOperations.getSubstanceAdministration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Supply> getSupply() {
		return ObservationOperations.getSupply(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasActTemplate(String templateId) {
		return ObservationOperations.hasActTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasCode(String code, String codeSystem, String codeSystemName) {
		return ObservationOperations.hasCode(this, code, codeSystem, codeSystemName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEncounterTemplate(String templateId) {
		return ObservationOperations.hasEncounterTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasObservationMediaTemplate(String templateId) {
		return ObservationOperations.hasObservationMediaTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasObservationTemplate(String templateId) {
		return ObservationOperations.hasObservationTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasOrganizerTemplate(String templateId) {
		return ObservationOperations.hasOrganizerTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasProcedureTemplate(String templateId) {
		return ObservationOperations.hasProcedureTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasRegionOfInterestTemplate(String templateId) {
		return ObservationOperations.hasRegionOfInterestTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSubstanceAdministrationTemplate(String templateId) {
		return ObservationOperations.hasSubstanceAdministrationTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSupplyTemplate(String templateId) {
		return ObservationOperations.hasSupplyTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasTemplateId(String templateId) {
		return ObservationOperations.hasTemplateId(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.OBSERVATION__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.OBSERVATION__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.OBSERVATION__DERIVATION_EXPR:
				return basicSetDerivationExpr(null, msgs);
			case CDAPackage.OBSERVATION__TEXT:
				return basicSetText(null, msgs);
			case CDAPackage.OBSERVATION__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case CDAPackage.OBSERVATION__EFFECTIVE_TIME:
				return basicSetEffectiveTime(null, msgs);
			case CDAPackage.OBSERVATION__PRIORITY_CODE:
				return basicSetPriorityCode(null, msgs);
			case CDAPackage.OBSERVATION__REPEAT_NUMBER:
				return basicSetRepeatNumber(null, msgs);
			case CDAPackage.OBSERVATION__LANGUAGE_CODE:
				return basicSetLanguageCode(null, msgs);
			case CDAPackage.OBSERVATION__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__INTERPRETATION_CODE:
				return ((InternalEList<?>)getInterpretationCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__METHOD_CODE:
				return ((InternalEList<?>)getMethodCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__TARGET_SITE_CODE:
				return ((InternalEList<?>)getTargetSiteCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case CDAPackage.OBSERVATION__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__INFORMANT:
				return ((InternalEList<?>)getInformant()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP:
				return ((InternalEList<?>)getEntryRelationship()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__PRECONDITION:
				return ((InternalEList<?>)getPrecondition()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__REFERENCE_RANGE:
				return ((InternalEList<?>)getReferenceRange()).basicRemove(otherEnd, msgs);
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
			case CDAPackage.OBSERVATION__REALM_CODE:
				return getRealmCode();
			case CDAPackage.OBSERVATION__TYPE_ID:
				return getTypeId();
			case CDAPackage.OBSERVATION__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.OBSERVATION__ID:
				return getId();
			case CDAPackage.OBSERVATION__CODE:
				return getCode();
			case CDAPackage.OBSERVATION__DERIVATION_EXPR:
				return getDerivationExpr();
			case CDAPackage.OBSERVATION__TEXT:
				return getText();
			case CDAPackage.OBSERVATION__STATUS_CODE:
				return getStatusCode();
			case CDAPackage.OBSERVATION__EFFECTIVE_TIME:
				return getEffectiveTime();
			case CDAPackage.OBSERVATION__PRIORITY_CODE:
				return getPriorityCode();
			case CDAPackage.OBSERVATION__REPEAT_NUMBER:
				return getRepeatNumber();
			case CDAPackage.OBSERVATION__LANGUAGE_CODE:
				return getLanguageCode();
			case CDAPackage.OBSERVATION__VALUE:
				return getValue();
			case CDAPackage.OBSERVATION__INTERPRETATION_CODE:
				return getInterpretationCode();
			case CDAPackage.OBSERVATION__METHOD_CODE:
				return getMethodCode();
			case CDAPackage.OBSERVATION__TARGET_SITE_CODE:
				return getTargetSiteCode();
			case CDAPackage.OBSERVATION__SUBJECT:
				return getSubject();
			case CDAPackage.OBSERVATION__SPECIMEN:
				return getSpecimen();
			case CDAPackage.OBSERVATION__PERFORMER:
				return getPerformer();
			case CDAPackage.OBSERVATION__AUTHOR:
				return getAuthor();
			case CDAPackage.OBSERVATION__INFORMANT:
				return getInformant();
			case CDAPackage.OBSERVATION__PARTICIPANT:
				return getParticipant();
			case CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP:
				return getEntryRelationship();
			case CDAPackage.OBSERVATION__REFERENCE:
				return getReference();
			case CDAPackage.OBSERVATION__PRECONDITION:
				return getPrecondition();
			case CDAPackage.OBSERVATION__REFERENCE_RANGE:
				return getReferenceRange();
			case CDAPackage.OBSERVATION__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.OBSERVATION__CLASS_CODE:
				return getClassCode();
			case CDAPackage.OBSERVATION__MOOD_CODE:
				return getMoodCode();
			case CDAPackage.OBSERVATION__NEGATION_IND:
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
			case CDAPackage.OBSERVATION__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.OBSERVATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.OBSERVATION__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.OBSERVATION__ID:
				getId().clear();
				getId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.OBSERVATION__CODE:
				setCode((CD)newValue);
				return;
			case CDAPackage.OBSERVATION__DERIVATION_EXPR:
				setDerivationExpr((ST)newValue);
				return;
			case CDAPackage.OBSERVATION__TEXT:
				setText((ED)newValue);
				return;
			case CDAPackage.OBSERVATION__STATUS_CODE:
				setStatusCode((CS)newValue);
				return;
			case CDAPackage.OBSERVATION__EFFECTIVE_TIME:
				setEffectiveTime((IVL_TS)newValue);
				return;
			case CDAPackage.OBSERVATION__PRIORITY_CODE:
				setPriorityCode((CE)newValue);
				return;
			case CDAPackage.OBSERVATION__REPEAT_NUMBER:
				setRepeatNumber((IVL_INT)newValue);
				return;
			case CDAPackage.OBSERVATION__LANGUAGE_CODE:
				setLanguageCode((CS)newValue);
				return;
			case CDAPackage.OBSERVATION__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends ANY>)newValue);
				return;
			case CDAPackage.OBSERVATION__INTERPRETATION_CODE:
				getInterpretationCode().clear();
				getInterpretationCode().addAll((Collection<? extends CE>)newValue);
				return;
			case CDAPackage.OBSERVATION__METHOD_CODE:
				getMethodCode().clear();
				getMethodCode().addAll((Collection<? extends CE>)newValue);
				return;
			case CDAPackage.OBSERVATION__TARGET_SITE_CODE:
				getTargetSiteCode().clear();
				getTargetSiteCode().addAll((Collection<? extends CD>)newValue);
				return;
			case CDAPackage.OBSERVATION__SUBJECT:
				setSubject((Subject)newValue);
				return;
			case CDAPackage.OBSERVATION__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Specimen>)newValue);
				return;
			case CDAPackage.OBSERVATION__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Performer2>)newValue);
				return;
			case CDAPackage.OBSERVATION__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Author>)newValue);
				return;
			case CDAPackage.OBSERVATION__INFORMANT:
				getInformant().clear();
				getInformant().addAll((Collection<? extends Informant12>)newValue);
				return;
			case CDAPackage.OBSERVATION__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Participant2>)newValue);
				return;
			case CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP:
				getEntryRelationship().clear();
				getEntryRelationship().addAll((Collection<? extends EntryRelationship>)newValue);
				return;
			case CDAPackage.OBSERVATION__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case CDAPackage.OBSERVATION__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Precondition>)newValue);
				return;
			case CDAPackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRange().clear();
				getReferenceRange().addAll((Collection<? extends ReferenceRange>)newValue);
				return;
			case CDAPackage.OBSERVATION__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.OBSERVATION__CLASS_CODE:
				setClassCode((ActClassObservation)newValue);
				return;
			case CDAPackage.OBSERVATION__MOOD_CODE:
				setMoodCode((x_ActMoodDocumentObservation)newValue);
				return;
			case CDAPackage.OBSERVATION__NEGATION_IND:
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
			case CDAPackage.OBSERVATION__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.OBSERVATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.OBSERVATION__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.OBSERVATION__ID:
				getId().clear();
				return;
			case CDAPackage.OBSERVATION__CODE:
				setCode((CD)null);
				return;
			case CDAPackage.OBSERVATION__DERIVATION_EXPR:
				setDerivationExpr((ST)null);
				return;
			case CDAPackage.OBSERVATION__TEXT:
				setText((ED)null);
				return;
			case CDAPackage.OBSERVATION__STATUS_CODE:
				setStatusCode((CS)null);
				return;
			case CDAPackage.OBSERVATION__EFFECTIVE_TIME:
				setEffectiveTime((IVL_TS)null);
				return;
			case CDAPackage.OBSERVATION__PRIORITY_CODE:
				setPriorityCode((CE)null);
				return;
			case CDAPackage.OBSERVATION__REPEAT_NUMBER:
				setRepeatNumber((IVL_INT)null);
				return;
			case CDAPackage.OBSERVATION__LANGUAGE_CODE:
				setLanguageCode((CS)null);
				return;
			case CDAPackage.OBSERVATION__VALUE:
				getValue().clear();
				return;
			case CDAPackage.OBSERVATION__INTERPRETATION_CODE:
				getInterpretationCode().clear();
				return;
			case CDAPackage.OBSERVATION__METHOD_CODE:
				getMethodCode().clear();
				return;
			case CDAPackage.OBSERVATION__TARGET_SITE_CODE:
				getTargetSiteCode().clear();
				return;
			case CDAPackage.OBSERVATION__SUBJECT:
				setSubject((Subject)null);
				return;
			case CDAPackage.OBSERVATION__SPECIMEN:
				getSpecimen().clear();
				return;
			case CDAPackage.OBSERVATION__PERFORMER:
				getPerformer().clear();
				return;
			case CDAPackage.OBSERVATION__AUTHOR:
				getAuthor().clear();
				return;
			case CDAPackage.OBSERVATION__INFORMANT:
				getInformant().clear();
				return;
			case CDAPackage.OBSERVATION__PARTICIPANT:
				getParticipant().clear();
				return;
			case CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP:
				getEntryRelationship().clear();
				return;
			case CDAPackage.OBSERVATION__REFERENCE:
				getReference().clear();
				return;
			case CDAPackage.OBSERVATION__PRECONDITION:
				getPrecondition().clear();
				return;
			case CDAPackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRange().clear();
				return;
			case CDAPackage.OBSERVATION__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.OBSERVATION__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.OBSERVATION__MOOD_CODE:
				unsetMoodCode();
				return;
			case CDAPackage.OBSERVATION__NEGATION_IND:
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
			case CDAPackage.OBSERVATION__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.OBSERVATION__TYPE_ID:
				return typeId != null;
			case CDAPackage.OBSERVATION__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.OBSERVATION__ID:
				return id != null && !id.isEmpty();
			case CDAPackage.OBSERVATION__CODE:
				return code != null;
			case CDAPackage.OBSERVATION__DERIVATION_EXPR:
				return derivationExpr != null;
			case CDAPackage.OBSERVATION__TEXT:
				return text != null;
			case CDAPackage.OBSERVATION__STATUS_CODE:
				return statusCode != null;
			case CDAPackage.OBSERVATION__EFFECTIVE_TIME:
				return effectiveTime != null;
			case CDAPackage.OBSERVATION__PRIORITY_CODE:
				return priorityCode != null;
			case CDAPackage.OBSERVATION__REPEAT_NUMBER:
				return repeatNumber != null;
			case CDAPackage.OBSERVATION__LANGUAGE_CODE:
				return languageCode != null;
			case CDAPackage.OBSERVATION__VALUE:
				return value != null && !value.isEmpty();
			case CDAPackage.OBSERVATION__INTERPRETATION_CODE:
				return interpretationCode != null && !interpretationCode.isEmpty();
			case CDAPackage.OBSERVATION__METHOD_CODE:
				return methodCode != null && !methodCode.isEmpty();
			case CDAPackage.OBSERVATION__TARGET_SITE_CODE:
				return targetSiteCode != null && !targetSiteCode.isEmpty();
			case CDAPackage.OBSERVATION__SUBJECT:
				return subject != null;
			case CDAPackage.OBSERVATION__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case CDAPackage.OBSERVATION__PERFORMER:
				return performer != null && !performer.isEmpty();
			case CDAPackage.OBSERVATION__AUTHOR:
				return author != null && !author.isEmpty();
			case CDAPackage.OBSERVATION__INFORMANT:
				return informant != null && !informant.isEmpty();
			case CDAPackage.OBSERVATION__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP:
				return entryRelationship != null && !entryRelationship.isEmpty();
			case CDAPackage.OBSERVATION__REFERENCE:
				return reference != null && !reference.isEmpty();
			case CDAPackage.OBSERVATION__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case CDAPackage.OBSERVATION__REFERENCE_RANGE:
				return referenceRange != null && !referenceRange.isEmpty();
			case CDAPackage.OBSERVATION__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.OBSERVATION__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.OBSERVATION__MOOD_CODE:
				return isSetMoodCode();
			case CDAPackage.OBSERVATION__NEGATION_IND:
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
		if (nullFlavorESet) result.append(nullFlavor); else result.append("<unset>");
		result.append(", classCode: ");
		if (classCodeESet) result.append(classCode); else result.append("<unset>");
		result.append(", moodCode: ");
		if (moodCodeESet) result.append(moodCode); else result.append("<unset>");
		result.append(", negationInd: ");
		result.append(negationInd);
		result.append(')');
		return result.toString();
	}

} //ObservationImpl
