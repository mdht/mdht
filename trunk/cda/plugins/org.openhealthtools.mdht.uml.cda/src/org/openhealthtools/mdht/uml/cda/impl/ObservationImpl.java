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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
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
import org.openhealthtools.mdht.uml.cda.Section;
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
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getDerivationExpr <em>Derivation Expr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getPriorityCode <em>Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getRepeatNumber <em>Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getValues <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getInterpretationCodes <em>Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getMethodCodes <em>Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getTargetSiteCodes <em>Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getInformants <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getEntryRelationships <em>Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getReferences <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl#getReferenceRanges <em>Reference Range</em>}</li>
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
	 * The cached value of the '{@link #getValues() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ANY> values;

	/**
	 * The cached value of the '{@link #getInterpretationCodes() <em>Interpretation Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CE> interpretationCodes;

	/**
	 * The cached value of the '{@link #getMethodCodes() <em>Method Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CE> methodCodes;

	/**
	 * The cached value of the '{@link #getTargetSiteCodes() <em>Target Site Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSiteCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CD> targetSiteCodes;

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
	 * The cached value of the '{@link #getReferenceRanges() <em>Reference Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceRange> referenceRanges;

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
		return CDAPackage.Literals.OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.OBSERVATION__REALM_CODE);
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
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.OBSERVATION__TEMPLATE_ID);
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
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.OBSERVATION__ID);
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
	public EList<ANY> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<ANY>(ANY.class, this, CDAPackage.OBSERVATION__VALUE);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CE> getInterpretationCodes() {
		if (interpretationCodes == null) {
			interpretationCodes = new EObjectContainmentEList<CE>(CE.class, this, CDAPackage.OBSERVATION__INTERPRETATION_CODE);
		}
		return interpretationCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CE> getMethodCodes() {
		if (methodCodes == null) {
			methodCodes = new EObjectContainmentEList<CE>(CE.class, this, CDAPackage.OBSERVATION__METHOD_CODE);
		}
		return methodCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CD> getTargetSiteCodes() {
		if (targetSiteCodes == null) {
			targetSiteCodes = new EObjectContainmentEList<CD>(CD.class, this, CDAPackage.OBSERVATION__TARGET_SITE_CODE);
		}
		return targetSiteCodes;
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
	public EList<Specimen> getSpecimens() {
		if (specimens == null) {
			specimens = new EObjectContainmentEList<Specimen>(Specimen.class, this, CDAPackage.OBSERVATION__SPECIMEN);
		}
		return specimens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Performer2> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<Performer2>(Performer2.class, this, CDAPackage.OBSERVATION__PERFORMER);
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
			authors = new EObjectContainmentEList<Author>(Author.class, this, CDAPackage.OBSERVATION__AUTHOR);
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
			informants = new EObjectContainmentEList<Informant12>(Informant12.class, this, CDAPackage.OBSERVATION__INFORMANT);
		}
		return informants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant2> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Participant2>(Participant2.class, this, CDAPackage.OBSERVATION__PARTICIPANT);
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
			entryRelationships = new EObjectContainmentEList<EntryRelationship>(EntryRelationship.class, this, CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP);
		}
		return entryRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(Reference.class, this, CDAPackage.OBSERVATION__REFERENCE);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precondition> getPreconditions() {
		if (preconditions == null) {
			preconditions = new EObjectContainmentEList<Precondition>(Precondition.class, this, CDAPackage.OBSERVATION__PRECONDITION);
		}
		return preconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceRange> getReferenceRanges() {
		if (referenceRanges == null) {
			referenceRanges = new EObjectContainmentEList<ReferenceRange>(ReferenceRange.class, this, CDAPackage.OBSERVATION__REFERENCE_RANGE);
		}
		return referenceRanges;
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
		boolean oldNegationIndESet = negationIndESet;
		negationIndESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION__NEGATION_IND, oldNegationInd, negationInd, !oldNegationIndESet));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.OBSERVATION__NEGATION_IND, oldNegationInd, NEGATION_IND_EDEFAULT, oldNegationIndESet));
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
	public EList<Act> getActs() {
		return ObservationOperations.getActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalDocument getClinicalDocument() {
		return ObservationOperations.getClinicalDocument(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encounter> getEncounters() {
		return ObservationOperations.getEncounters(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observation> getObservations() {
		return ObservationOperations.getObservations(this);
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
	public EList<Organizer> getOrganizers() {
		return ObservationOperations.getOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedures() {
		return ObservationOperations.getProcedures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegionOfInterest> getRegionsOfInterest() {
		return ObservationOperations.getRegionsOfInterest(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getSection() {
		return ObservationOperations.getSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceAdministration> getSubstanceAdministrations() {
		return ObservationOperations.getSubstanceAdministrations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Supply> getSupplies() {
		return ObservationOperations.getSupplies(this);
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
	public EList<EObject> getEntryRelationshipTargets(x_ActRelationshipEntryRelationship typeCode, Object targetClass) {
		return ObservationOperations.getEntryRelationshipTargets(this, typeCode, targetClass);
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
				return ((InternalEList<?>)getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.OBSERVATION__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__ID:
				return ((InternalEList<?>)getIds()).basicRemove(otherEnd, msgs);
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
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__INTERPRETATION_CODE:
				return ((InternalEList<?>)getInterpretationCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__METHOD_CODE:
				return ((InternalEList<?>)getMethodCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__TARGET_SITE_CODE:
				return ((InternalEList<?>)getTargetSiteCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case CDAPackage.OBSERVATION__SPECIMEN:
				return ((InternalEList<?>)getSpecimens()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__AUTHOR:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__INFORMANT:
				return ((InternalEList<?>)getInformants()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__PARTICIPANT:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP:
				return ((InternalEList<?>)getEntryRelationships()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__REFERENCE:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__PRECONDITION:
				return ((InternalEList<?>)getPreconditions()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION__REFERENCE_RANGE:
				return ((InternalEList<?>)getReferenceRanges()).basicRemove(otherEnd, msgs);
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
				return getRealmCodes();
			case CDAPackage.OBSERVATION__TYPE_ID:
				return getTypeId();
			case CDAPackage.OBSERVATION__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.OBSERVATION__ID:
				return getIds();
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
				return getValues();
			case CDAPackage.OBSERVATION__INTERPRETATION_CODE:
				return getInterpretationCodes();
			case CDAPackage.OBSERVATION__METHOD_CODE:
				return getMethodCodes();
			case CDAPackage.OBSERVATION__TARGET_SITE_CODE:
				return getTargetSiteCodes();
			case CDAPackage.OBSERVATION__SUBJECT:
				return getSubject();
			case CDAPackage.OBSERVATION__SPECIMEN:
				return getSpecimens();
			case CDAPackage.OBSERVATION__PERFORMER:
				return getPerformers();
			case CDAPackage.OBSERVATION__AUTHOR:
				return getAuthors();
			case CDAPackage.OBSERVATION__INFORMANT:
				return getInformants();
			case CDAPackage.OBSERVATION__PARTICIPANT:
				return getParticipants();
			case CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP:
				return getEntryRelationships();
			case CDAPackage.OBSERVATION__REFERENCE:
				return getReferences();
			case CDAPackage.OBSERVATION__PRECONDITION:
				return getPreconditions();
			case CDAPackage.OBSERVATION__REFERENCE_RANGE:
				return getReferenceRanges();
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
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.OBSERVATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.OBSERVATION__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.OBSERVATION__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>)newValue);
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
				getValues().clear();
				getValues().addAll((Collection<? extends ANY>)newValue);
				return;
			case CDAPackage.OBSERVATION__INTERPRETATION_CODE:
				getInterpretationCodes().clear();
				getInterpretationCodes().addAll((Collection<? extends CE>)newValue);
				return;
			case CDAPackage.OBSERVATION__METHOD_CODE:
				getMethodCodes().clear();
				getMethodCodes().addAll((Collection<? extends CE>)newValue);
				return;
			case CDAPackage.OBSERVATION__TARGET_SITE_CODE:
				getTargetSiteCodes().clear();
				getTargetSiteCodes().addAll((Collection<? extends CD>)newValue);
				return;
			case CDAPackage.OBSERVATION__SUBJECT:
				setSubject((Subject)newValue);
				return;
			case CDAPackage.OBSERVATION__SPECIMEN:
				getSpecimens().clear();
				getSpecimens().addAll((Collection<? extends Specimen>)newValue);
				return;
			case CDAPackage.OBSERVATION__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Performer2>)newValue);
				return;
			case CDAPackage.OBSERVATION__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Author>)newValue);
				return;
			case CDAPackage.OBSERVATION__INFORMANT:
				getInformants().clear();
				getInformants().addAll((Collection<? extends Informant12>)newValue);
				return;
			case CDAPackage.OBSERVATION__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant2>)newValue);
				return;
			case CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP:
				getEntryRelationships().clear();
				getEntryRelationships().addAll((Collection<? extends EntryRelationship>)newValue);
				return;
			case CDAPackage.OBSERVATION__REFERENCE:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case CDAPackage.OBSERVATION__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection<? extends Precondition>)newValue);
				return;
			case CDAPackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRanges().clear();
				getReferenceRanges().addAll((Collection<? extends ReferenceRange>)newValue);
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
				getRealmCodes().clear();
				return;
			case CDAPackage.OBSERVATION__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.OBSERVATION__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.OBSERVATION__ID:
				getIds().clear();
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
				getValues().clear();
				return;
			case CDAPackage.OBSERVATION__INTERPRETATION_CODE:
				getInterpretationCodes().clear();
				return;
			case CDAPackage.OBSERVATION__METHOD_CODE:
				getMethodCodes().clear();
				return;
			case CDAPackage.OBSERVATION__TARGET_SITE_CODE:
				getTargetSiteCodes().clear();
				return;
			case CDAPackage.OBSERVATION__SUBJECT:
				setSubject((Subject)null);
				return;
			case CDAPackage.OBSERVATION__SPECIMEN:
				getSpecimens().clear();
				return;
			case CDAPackage.OBSERVATION__PERFORMER:
				getPerformers().clear();
				return;
			case CDAPackage.OBSERVATION__AUTHOR:
				getAuthors().clear();
				return;
			case CDAPackage.OBSERVATION__INFORMANT:
				getInformants().clear();
				return;
			case CDAPackage.OBSERVATION__PARTICIPANT:
				getParticipants().clear();
				return;
			case CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP:
				getEntryRelationships().clear();
				return;
			case CDAPackage.OBSERVATION__REFERENCE:
				getReferences().clear();
				return;
			case CDAPackage.OBSERVATION__PRECONDITION:
				getPreconditions().clear();
				return;
			case CDAPackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRanges().clear();
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
			case CDAPackage.OBSERVATION__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.OBSERVATION__TYPE_ID:
				return typeId != null;
			case CDAPackage.OBSERVATION__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.OBSERVATION__ID:
				return ids != null && !ids.isEmpty();
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
				return values != null && !values.isEmpty();
			case CDAPackage.OBSERVATION__INTERPRETATION_CODE:
				return interpretationCodes != null && !interpretationCodes.isEmpty();
			case CDAPackage.OBSERVATION__METHOD_CODE:
				return methodCodes != null && !methodCodes.isEmpty();
			case CDAPackage.OBSERVATION__TARGET_SITE_CODE:
				return targetSiteCodes != null && !targetSiteCodes.isEmpty();
			case CDAPackage.OBSERVATION__SUBJECT:
				return subject != null;
			case CDAPackage.OBSERVATION__SPECIMEN:
				return specimens != null && !specimens.isEmpty();
			case CDAPackage.OBSERVATION__PERFORMER:
				return performers != null && !performers.isEmpty();
			case CDAPackage.OBSERVATION__AUTHOR:
				return authors != null && !authors.isEmpty();
			case CDAPackage.OBSERVATION__INFORMANT:
				return informants != null && !informants.isEmpty();
			case CDAPackage.OBSERVATION__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP:
				return entryRelationships != null && !entryRelationships.isEmpty();
			case CDAPackage.OBSERVATION__REFERENCE:
				return references != null && !references.isEmpty();
			case CDAPackage.OBSERVATION__PRECONDITION:
				return preconditions != null && !preconditions.isEmpty();
			case CDAPackage.OBSERVATION__REFERENCE_RANGE:
				return referenceRanges != null && !referenceRanges.isEmpty();
			case CDAPackage.OBSERVATION__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.OBSERVATION__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.OBSERVATION__MOOD_CODE:
				return isSetMoodCode();
			case CDAPackage.OBSERVATION__NEGATION_IND:
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nullFlavor: ");
		if (nullFlavorESet) result.append(nullFlavor); else result.append("<unset>");
		result.append(", classCode: ");
		if (classCodeESet) result.append(classCode); else result.append("<unset>");
		result.append(", moodCode: ");
		if (moodCodeESet) result.append(moodCode); else result.append("<unset>");
		result.append(", negationInd: ");
		if (negationIndESet) result.append(negationInd); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ObservationImpl
