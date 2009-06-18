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
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.RegionOfInterestValue;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.Subject;

import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.internal.operations.RegionOfInterestOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region Of Interest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getInformant <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getEntryRelationship <em>Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getRegionOfInterestId <em>Region Of Interest Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl#getMoodCode <em>Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionOfInterestImpl extends EObjectImpl implements RegionOfInterest {
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
	protected CS code;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<RegionOfInterestValue> value;

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
	 * The default value of the '{@link #getRegionOfInterestId() <em>Region Of Interest Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionOfInterestId()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_OF_INTEREST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegionOfInterestId() <em>Region Of Interest Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionOfInterestId()
	 * @generated
	 * @ordered
	 */
	protected String regionOfInterestId = REGION_OF_INTEREST_ID_EDEFAULT;

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
	protected static final ActClass CLASS_CODE_EDEFAULT = ActClass.ROIOVL;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionOfInterestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getRegionOfInterest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.REGION_OF_INTEREST__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.REGION_OF_INTEREST__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REGION_OF_INTEREST__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REGION_OF_INTEREST__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REGION_OF_INTEREST__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.REGION_OF_INTEREST__TEMPLATE_ID);
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
			id = new EObjectContainmentEList<II>(II.class, this, CDAPackage.REGION_OF_INTEREST__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CS newCode, NotificationChain msgs) {
		CS oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.REGION_OF_INTEREST__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CS newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REGION_OF_INTEREST__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REGION_OF_INTEREST__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REGION_OF_INTEREST__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegionOfInterestValue> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<RegionOfInterestValue>(RegionOfInterestValue.class, this, CDAPackage.REGION_OF_INTEREST__VALUE);
		}
		return value;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.REGION_OF_INTEREST__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REGION_OF_INTEREST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.REGION_OF_INTEREST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REGION_OF_INTEREST__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specimen> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Specimen>(Specimen.class, this, CDAPackage.REGION_OF_INTEREST__SPECIMEN);
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
			performer = new EObjectContainmentEList<Performer2>(Performer2.class, this, CDAPackage.REGION_OF_INTEREST__PERFORMER);
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
			author = new EObjectContainmentEList<Author>(Author.class, this, CDAPackage.REGION_OF_INTEREST__AUTHOR);
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
			informant = new EObjectContainmentEList<Informant12>(Informant12.class, this, CDAPackage.REGION_OF_INTEREST__INFORMANT);
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
			participant = new EObjectContainmentEList<Participant2>(Participant2.class, this, CDAPackage.REGION_OF_INTEREST__PARTICIPANT);
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
			entryRelationship = new EObjectContainmentEList<EntryRelationship>(EntryRelationship.class, this, CDAPackage.REGION_OF_INTEREST__ENTRY_RELATIONSHIP);
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
			reference = new EObjectContainmentEList<Reference>(Reference.class, this, CDAPackage.REGION_OF_INTEREST__REFERENCE);
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
			precondition = new EObjectContainmentEList<Precondition>(Precondition.class, this, CDAPackage.REGION_OF_INTEREST__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionOfInterestId() {
		return regionOfInterestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionOfInterestId(String newRegionOfInterestId) {
		String oldRegionOfInterestId = regionOfInterestId;
		regionOfInterestId = newRegionOfInterestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REGION_OF_INTEREST__REGION_OF_INTEREST_ID, oldRegionOfInterestId, regionOfInterestId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REGION_OF_INTEREST__NULL_FLAVOR, oldNullFlavor, nullFlavor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REGION_OF_INTEREST__CLASS_CODE, oldClassCode, classCode));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REGION_OF_INTEREST__MOOD_CODE, oldMoodCode, moodCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAct(Act act) {
		RegionOfInterestOperations.addAct(this, act);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEncounter(Encounter encounter) {
		RegionOfInterestOperations.addEncounter(this, encounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addObservation(Observation observation) {
		RegionOfInterestOperations.addObservation(this, observation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addObservationMedia(ObservationMedia observationMedia) {
		RegionOfInterestOperations.addObservationMedia(this, observationMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addOrganizer(Organizer organizer) {
		RegionOfInterestOperations.addOrganizer(this, organizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addProcedure(Procedure procedure) {
		RegionOfInterestOperations.addProcedure(this, procedure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRegionOfInterest(RegionOfInterest newRegionOfInterest) {
		RegionOfInterestOperations.addRegionOfInterest(this, newRegionOfInterest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSubstanceAdministration(SubstanceAdministration substanceAdministration) {
		RegionOfInterestOperations.addSubstanceAdministration(this, substanceAdministration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSupply(Supply supply) {
		RegionOfInterestOperations.addSupply(this, supply);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Act> getAct() {
		return RegionOfInterestOperations.getAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encounter> getEncounter() {
		return RegionOfInterestOperations.getEncounter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observation> getObservation() {
		return RegionOfInterestOperations.getObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationMedia> getObservationMedia() {
		return RegionOfInterestOperations.getObservationMedia(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organizer> getOrganizer() {
		return RegionOfInterestOperations.getOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedure() {
		return RegionOfInterestOperations.getProcedure(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegionOfInterest> getRegionOfInterest() {
		return RegionOfInterestOperations.getRegionOfInterest(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceAdministration> getSubstanceAdministration() {
		return RegionOfInterestOperations.getSubstanceAdministration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Supply> getSupply() {
		return RegionOfInterestOperations.getSupply(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasActTemplate(String templateId) {
		return RegionOfInterestOperations.hasActTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasCode(String code, String codeSystem, String codeSystemName) {
		return RegionOfInterestOperations.hasCode(this, code, codeSystem, codeSystemName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEncounterTemplate(String templateId) {
		return RegionOfInterestOperations.hasEncounterTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasObservationMediaTemplate(String templateId) {
		return RegionOfInterestOperations.hasObservationMediaTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasObservationTemplate(String templateId) {
		return RegionOfInterestOperations.hasObservationTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasOrganizerTemplate(String templateId) {
		return RegionOfInterestOperations.hasOrganizerTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasProcedureTemplate(String templateId) {
		return RegionOfInterestOperations.hasProcedureTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasRegionOfInterestTemplate(String templateId) {
		return RegionOfInterestOperations.hasRegionOfInterestTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSubstanceAdministrationTemplate(String templateId) {
		return RegionOfInterestOperations.hasSubstanceAdministrationTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSupplyTemplate(String templateId) {
		return RegionOfInterestOperations.hasSupplyTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasTemplateId(String templateId) {
		return RegionOfInterestOperations.hasTemplateId(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.REGION_OF_INTEREST__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.REGION_OF_INTEREST__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.REGION_OF_INTEREST__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.REGION_OF_INTEREST__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case CDAPackage.REGION_OF_INTEREST__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.REGION_OF_INTEREST__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
			case CDAPackage.REGION_OF_INTEREST__SUBJECT:
				return basicSetSubject(null, msgs);
			case CDAPackage.REGION_OF_INTEREST__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case CDAPackage.REGION_OF_INTEREST__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case CDAPackage.REGION_OF_INTEREST__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case CDAPackage.REGION_OF_INTEREST__INFORMANT:
				return ((InternalEList<?>)getInformant()).basicRemove(otherEnd, msgs);
			case CDAPackage.REGION_OF_INTEREST__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case CDAPackage.REGION_OF_INTEREST__ENTRY_RELATIONSHIP:
				return ((InternalEList<?>)getEntryRelationship()).basicRemove(otherEnd, msgs);
			case CDAPackage.REGION_OF_INTEREST__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case CDAPackage.REGION_OF_INTEREST__PRECONDITION:
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
			case CDAPackage.REGION_OF_INTEREST__REALM_CODE:
				return getRealmCode();
			case CDAPackage.REGION_OF_INTEREST__TYPE_ID:
				return getTypeId();
			case CDAPackage.REGION_OF_INTEREST__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.REGION_OF_INTEREST__ID:
				return getId();
			case CDAPackage.REGION_OF_INTEREST__CODE:
				return getCode();
			case CDAPackage.REGION_OF_INTEREST__VALUE:
				return getValue();
			case CDAPackage.REGION_OF_INTEREST__SUBJECT:
				return getSubject();
			case CDAPackage.REGION_OF_INTEREST__SPECIMEN:
				return getSpecimen();
			case CDAPackage.REGION_OF_INTEREST__PERFORMER:
				return getPerformer();
			case CDAPackage.REGION_OF_INTEREST__AUTHOR:
				return getAuthor();
			case CDAPackage.REGION_OF_INTEREST__INFORMANT:
				return getInformant();
			case CDAPackage.REGION_OF_INTEREST__PARTICIPANT:
				return getParticipant();
			case CDAPackage.REGION_OF_INTEREST__ENTRY_RELATIONSHIP:
				return getEntryRelationship();
			case CDAPackage.REGION_OF_INTEREST__REFERENCE:
				return getReference();
			case CDAPackage.REGION_OF_INTEREST__PRECONDITION:
				return getPrecondition();
			case CDAPackage.REGION_OF_INTEREST__REGION_OF_INTEREST_ID:
				return getRegionOfInterestId();
			case CDAPackage.REGION_OF_INTEREST__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.REGION_OF_INTEREST__CLASS_CODE:
				return getClassCode();
			case CDAPackage.REGION_OF_INTEREST__MOOD_CODE:
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
			case CDAPackage.REGION_OF_INTEREST__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__ID:
				getId().clear();
				getId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__CODE:
				setCode((CS)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends RegionOfInterestValue>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__SUBJECT:
				setSubject((Subject)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Specimen>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Performer2>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Author>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__INFORMANT:
				getInformant().clear();
				getInformant().addAll((Collection<? extends Informant12>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Participant2>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__ENTRY_RELATIONSHIP:
				getEntryRelationship().clear();
				getEntryRelationship().addAll((Collection<? extends EntryRelationship>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Precondition>)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__REGION_OF_INTEREST_ID:
				setRegionOfInterestId((String)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__CLASS_CODE:
				setClassCode((ActClass)newValue);
				return;
			case CDAPackage.REGION_OF_INTEREST__MOOD_CODE:
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
			case CDAPackage.REGION_OF_INTEREST__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.REGION_OF_INTEREST__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__ID:
				getId().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__CODE:
				setCode((CS)null);
				return;
			case CDAPackage.REGION_OF_INTEREST__VALUE:
				getValue().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__SUBJECT:
				setSubject((Subject)null);
				return;
			case CDAPackage.REGION_OF_INTEREST__SPECIMEN:
				getSpecimen().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__PERFORMER:
				getPerformer().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__AUTHOR:
				getAuthor().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__INFORMANT:
				getInformant().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__PARTICIPANT:
				getParticipant().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__ENTRY_RELATIONSHIP:
				getEntryRelationship().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__REFERENCE:
				getReference().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__PRECONDITION:
				getPrecondition().clear();
				return;
			case CDAPackage.REGION_OF_INTEREST__REGION_OF_INTEREST_ID:
				setRegionOfInterestId(REGION_OF_INTEREST_ID_EDEFAULT);
				return;
			case CDAPackage.REGION_OF_INTEREST__NULL_FLAVOR:
				setNullFlavor(NULL_FLAVOR_EDEFAULT);
				return;
			case CDAPackage.REGION_OF_INTEREST__CLASS_CODE:
				setClassCode(CLASS_CODE_EDEFAULT);
				return;
			case CDAPackage.REGION_OF_INTEREST__MOOD_CODE:
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
			case CDAPackage.REGION_OF_INTEREST__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__TYPE_ID:
				return typeId != null;
			case CDAPackage.REGION_OF_INTEREST__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__ID:
				return id != null && !id.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__CODE:
				return code != null;
			case CDAPackage.REGION_OF_INTEREST__VALUE:
				return value != null && !value.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__SUBJECT:
				return subject != null;
			case CDAPackage.REGION_OF_INTEREST__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__PERFORMER:
				return performer != null && !performer.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__AUTHOR:
				return author != null && !author.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__INFORMANT:
				return informant != null && !informant.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__ENTRY_RELATIONSHIP:
				return entryRelationship != null && !entryRelationship.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__REFERENCE:
				return reference != null && !reference.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case CDAPackage.REGION_OF_INTEREST__REGION_OF_INTEREST_ID:
				return REGION_OF_INTEREST_ID_EDEFAULT == null ? regionOfInterestId != null : !REGION_OF_INTEREST_ID_EDEFAULT.equals(regionOfInterestId);
			case CDAPackage.REGION_OF_INTEREST__NULL_FLAVOR:
				return nullFlavor != NULL_FLAVOR_EDEFAULT;
			case CDAPackage.REGION_OF_INTEREST__CLASS_CODE:
				return classCode != CLASS_CODE_EDEFAULT;
			case CDAPackage.REGION_OF_INTEREST__MOOD_CODE:
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
		result.append(" (regionOfInterestId: ");
		result.append(regionOfInterestId);
		result.append(", nullFlavor: ");
		result.append(nullFlavor);
		result.append(", classCode: ");
		result.append(classCode);
		result.append(", moodCode: ");
		result.append(moodCode);
		result.append(')');
		return result.toString();
	}

} //RegionOfInterestImpl
