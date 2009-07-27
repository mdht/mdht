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
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.Subject;

import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.operations.ObservationMediaOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getInformant <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getEntryRelationship <em>Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getObservationMediaId <em>Observation Media Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getMoodCode <em>Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationMediaImpl extends EObjectImpl implements ObservationMedia {
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
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected CS languageCode;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ED value;

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
	 * The default value of the '{@link #getObservationMediaId() <em>Observation Media Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMediaId()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVATION_MEDIA_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservationMediaId() <em>Observation Media Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMediaId()
	 * @generated
	 * @ordered
	 */
	protected String observationMediaId = OBSERVATION_MEDIA_ID_EDEFAULT;

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
	protected static final ActMood MOOD_CODE_EDEFAULT = ActMood.APT;

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
	 * This is true if the Mood Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moodCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationMediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getObservationMedia();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCode() {
		if (realmCode == null) {
			realmCode = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.OBSERVATION_MEDIA__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION_MEDIA__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION_MEDIA__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateId() {
		if (templateId == null) {
			templateId = new EObjectContainmentEList<II>(II.class, this, CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID);
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
			id = new EObjectContainmentEList<II>(II.class, this, CDAPackage.OBSERVATION_MEDIA__ID);
		}
		return id;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE, oldLanguageCode, newLanguageCode);
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
				msgs = ((InternalEObject)languageCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE, null, msgs);
			if (newLanguageCode != null)
				msgs = ((InternalEObject)newLanguageCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE, null, msgs);
			msgs = basicSetLanguageCode(newLanguageCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE, newLanguageCode, newLanguageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ED newValue, NotificationChain msgs) {
		ED oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ED newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION_MEDIA__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION_MEDIA__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__VALUE, newValue, newValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION_MEDIA__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.OBSERVATION_MEDIA__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specimen> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Specimen>(Specimen.class, this, CDAPackage.OBSERVATION_MEDIA__SPECIMEN);
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
			performer = new EObjectContainmentEList<Performer2>(Performer2.class, this, CDAPackage.OBSERVATION_MEDIA__PERFORMER);
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
			author = new EObjectContainmentEList<Author>(Author.class, this, CDAPackage.OBSERVATION_MEDIA__AUTHOR);
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
			informant = new EObjectContainmentEList<Informant12>(Informant12.class, this, CDAPackage.OBSERVATION_MEDIA__INFORMANT);
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
			participant = new EObjectContainmentEList<Participant2>(Participant2.class, this, CDAPackage.OBSERVATION_MEDIA__PARTICIPANT);
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
			entryRelationship = new EObjectContainmentEList<EntryRelationship>(EntryRelationship.class, this, CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP);
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
			reference = new EObjectContainmentEList<Reference>(Reference.class, this, CDAPackage.OBSERVATION_MEDIA__REFERENCE);
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
			precondition = new EObjectContainmentEList<Precondition>(Precondition.class, this, CDAPackage.OBSERVATION_MEDIA__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservationMediaId() {
		return observationMediaId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservationMediaId(String newObservationMediaId) {
		String oldObservationMediaId = observationMediaId;
		observationMediaId = newObservationMediaId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__OBSERVATION_MEDIA_ID, oldObservationMediaId, observationMediaId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.OBSERVATION_MEDIA__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.OBSERVATION_MEDIA__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
		boolean oldMoodCodeESet = moodCodeESet;
		moodCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__MOOD_CODE, oldMoodCode, moodCode, !oldMoodCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoodCode() {
		ActMood oldMoodCode = moodCode;
		boolean oldMoodCodeESet = moodCodeESet;
		moodCode = MOOD_CODE_EDEFAULT;
		moodCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.OBSERVATION_MEDIA__MOOD_CODE, oldMoodCode, MOOD_CODE_EDEFAULT, oldMoodCodeESet));
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
	public void addAct(Act act) {
		ObservationMediaOperations.addAct(this, act);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEncounter(Encounter encounter) {
		ObservationMediaOperations.addEncounter(this, encounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addObservation(Observation observation) {
		ObservationMediaOperations.addObservation(this, observation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addObservationMedia(ObservationMedia newObservationMedia) {
		ObservationMediaOperations.addObservationMedia(this, newObservationMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addOrganizer(Organizer organizer) {
		ObservationMediaOperations.addOrganizer(this, organizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addProcedure(Procedure procedure) {
		ObservationMediaOperations.addProcedure(this, procedure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRegionOfInterest(RegionOfInterest regionOfInterest) {
		ObservationMediaOperations.addRegionOfInterest(this, regionOfInterest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSubstanceAdministration(SubstanceAdministration substanceAdministration) {
		ObservationMediaOperations.addSubstanceAdministration(this, substanceAdministration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSupply(Supply supply) {
		ObservationMediaOperations.addSupply(this, supply);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Act> getAct() {
		return ObservationMediaOperations.getAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encounter> getEncounter() {
		return ObservationMediaOperations.getEncounter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observation> getObservation() {
		return ObservationMediaOperations.getObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationMedia> getObservationMedia() {
		return ObservationMediaOperations.getObservationMedia(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organizer> getOrganizer() {
		return ObservationMediaOperations.getOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedure() {
		return ObservationMediaOperations.getProcedure(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegionOfInterest> getRegionOfInterest() {
		return ObservationMediaOperations.getRegionOfInterest(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceAdministration> getSubstanceAdministration() {
		return ObservationMediaOperations.getSubstanceAdministration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Supply> getSupply() {
		return ObservationMediaOperations.getSupply(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasActTemplate(String templateId) {
		return ObservationMediaOperations.hasActTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEncounterTemplate(String templateId) {
		return ObservationMediaOperations.hasEncounterTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasObservationMediaTemplate(String templateId) {
		return ObservationMediaOperations.hasObservationMediaTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasObservationTemplate(String templateId) {
		return ObservationMediaOperations.hasObservationTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasOrganizerTemplate(String templateId) {
		return ObservationMediaOperations.hasOrganizerTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasProcedureTemplate(String templateId) {
		return ObservationMediaOperations.hasProcedureTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasRegionOfInterestTemplate(String templateId) {
		return ObservationMediaOperations.hasRegionOfInterestTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSubstanceAdministrationTemplate(String templateId) {
		return ObservationMediaOperations.hasSubstanceAdministrationTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSupplyTemplate(String templateId) {
		return ObservationMediaOperations.hasSupplyTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasTemplateId(String templateId) {
		return ObservationMediaOperations.hasTemplateId(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.OBSERVATION_MEDIA__REALM_CODE:
				return ((InternalEList<?>)getRealmCode()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateId()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE:
				return basicSetLanguageCode(null, msgs);
			case CDAPackage.OBSERVATION_MEDIA__VALUE:
				return basicSetValue(null, msgs);
			case CDAPackage.OBSERVATION_MEDIA__SUBJECT:
				return basicSetSubject(null, msgs);
			case CDAPackage.OBSERVATION_MEDIA__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__INFORMANT:
				return ((InternalEList<?>)getInformant()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP:
				return ((InternalEList<?>)getEntryRelationship()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__PRECONDITION:
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
			case CDAPackage.OBSERVATION_MEDIA__REALM_CODE:
				return getRealmCode();
			case CDAPackage.OBSERVATION_MEDIA__TYPE_ID:
				return getTypeId();
			case CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.OBSERVATION_MEDIA__ID:
				return getId();
			case CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE:
				return getLanguageCode();
			case CDAPackage.OBSERVATION_MEDIA__VALUE:
				return getValue();
			case CDAPackage.OBSERVATION_MEDIA__SUBJECT:
				return getSubject();
			case CDAPackage.OBSERVATION_MEDIA__SPECIMEN:
				return getSpecimen();
			case CDAPackage.OBSERVATION_MEDIA__PERFORMER:
				return getPerformer();
			case CDAPackage.OBSERVATION_MEDIA__AUTHOR:
				return getAuthor();
			case CDAPackage.OBSERVATION_MEDIA__INFORMANT:
				return getInformant();
			case CDAPackage.OBSERVATION_MEDIA__PARTICIPANT:
				return getParticipant();
			case CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP:
				return getEntryRelationship();
			case CDAPackage.OBSERVATION_MEDIA__REFERENCE:
				return getReference();
			case CDAPackage.OBSERVATION_MEDIA__PRECONDITION:
				return getPrecondition();
			case CDAPackage.OBSERVATION_MEDIA__OBSERVATION_MEDIA_ID:
				return getObservationMediaId();
			case CDAPackage.OBSERVATION_MEDIA__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.OBSERVATION_MEDIA__CLASS_CODE:
				return getClassCode();
			case CDAPackage.OBSERVATION_MEDIA__MOOD_CODE:
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
			case CDAPackage.OBSERVATION_MEDIA__REALM_CODE:
				getRealmCode().clear();
				getRealmCode().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID:
				getTemplateId().clear();
				getTemplateId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__ID:
				getId().clear();
				getId().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE:
				setLanguageCode((CS)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__VALUE:
				setValue((ED)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__SUBJECT:
				setSubject((Subject)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Specimen>)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Performer2>)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Author>)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__INFORMANT:
				getInformant().clear();
				getInformant().addAll((Collection<? extends Informant12>)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Participant2>)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP:
				getEntryRelationship().clear();
				getEntryRelationship().addAll((Collection<? extends EntryRelationship>)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Precondition>)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__OBSERVATION_MEDIA_ID:
				setObservationMediaId((String)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__CLASS_CODE:
				setClassCode((ActClassObservation)newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__MOOD_CODE:
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
			case CDAPackage.OBSERVATION_MEDIA__REALM_CODE:
				getRealmCode().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID:
				getTemplateId().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__ID:
				getId().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE:
				setLanguageCode((CS)null);
				return;
			case CDAPackage.OBSERVATION_MEDIA__VALUE:
				setValue((ED)null);
				return;
			case CDAPackage.OBSERVATION_MEDIA__SUBJECT:
				setSubject((Subject)null);
				return;
			case CDAPackage.OBSERVATION_MEDIA__SPECIMEN:
				getSpecimen().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__PERFORMER:
				getPerformer().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__AUTHOR:
				getAuthor().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__INFORMANT:
				getInformant().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__PARTICIPANT:
				getParticipant().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP:
				getEntryRelationship().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__REFERENCE:
				getReference().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__PRECONDITION:
				getPrecondition().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__OBSERVATION_MEDIA_ID:
				setObservationMediaId(OBSERVATION_MEDIA_ID_EDEFAULT);
				return;
			case CDAPackage.OBSERVATION_MEDIA__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.OBSERVATION_MEDIA__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.OBSERVATION_MEDIA__MOOD_CODE:
				unsetMoodCode();
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
			case CDAPackage.OBSERVATION_MEDIA__REALM_CODE:
				return realmCode != null && !realmCode.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__TYPE_ID:
				return typeId != null;
			case CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID:
				return templateId != null && !templateId.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__ID:
				return id != null && !id.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE:
				return languageCode != null;
			case CDAPackage.OBSERVATION_MEDIA__VALUE:
				return value != null;
			case CDAPackage.OBSERVATION_MEDIA__SUBJECT:
				return subject != null;
			case CDAPackage.OBSERVATION_MEDIA__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__PERFORMER:
				return performer != null && !performer.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__AUTHOR:
				return author != null && !author.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__INFORMANT:
				return informant != null && !informant.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP:
				return entryRelationship != null && !entryRelationship.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__REFERENCE:
				return reference != null && !reference.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__OBSERVATION_MEDIA_ID:
				return OBSERVATION_MEDIA_ID_EDEFAULT == null ? observationMediaId != null : !OBSERVATION_MEDIA_ID_EDEFAULT.equals(observationMediaId);
			case CDAPackage.OBSERVATION_MEDIA__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.OBSERVATION_MEDIA__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.OBSERVATION_MEDIA__MOOD_CODE:
				return isSetMoodCode();
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
		result.append(" (observationMediaId: ");
		result.append(observationMediaId);
		result.append(", nullFlavor: ");
		if (nullFlavorESet) result.append(nullFlavor); else result.append("<unset>");
		result.append(", classCode: ");
		if (classCodeESet) result.append(classCode); else result.append("<unset>");
		result.append(", moodCode: ");
		if (moodCodeESet) result.append(moodCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ObservationMediaImpl
