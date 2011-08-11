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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.Subject;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getInformants <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getEntryRelationships <em>Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getReferences <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getObservationMediaId <em>Observation Media Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl#getMoodCode <em>Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationMediaImpl extends ClinicalStatementImpl implements ObservationMedia {
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
		return CDAPackage.Literals.OBSERVATION_MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.OBSERVATION_MEDIA__REALM_CODE);
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
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__TYPE_ID, oldTypeId, newTypeId);
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
						CDAPackage.OBSERVATION_MEDIA__TYPE_ID, null, msgs);
			}
			if (newTypeId != null) {
				msgs = ((InternalEObject) newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.OBSERVATION_MEDIA__TYPE_ID, null, msgs);
			}
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__TYPE_ID, newTypeId, newTypeId));
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
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID);
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
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.OBSERVATION_MEDIA__ID);
		}
		return ids;
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE, oldLanguageCode, newLanguageCode);
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
	public void setLanguageCode(CS newLanguageCode) {
		if (newLanguageCode != languageCode) {
			NotificationChain msgs = null;
			if (languageCode != null) {
				msgs = ((InternalEObject) languageCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE, null, msgs);
			}
			if (newLanguageCode != null) {
				msgs = ((InternalEObject) newLanguageCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE, null, msgs);
			}
			msgs = basicSetLanguageCode(newLanguageCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE, newLanguageCode, newLanguageCode));
		}
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__VALUE, oldValue, newValue);
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
	public void setValue(ED newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null) {
				msgs = ((InternalEObject) value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.OBSERVATION_MEDIA__VALUE, null, msgs);
			}
			if (newValue != null) {
				msgs = ((InternalEObject) newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.OBSERVATION_MEDIA__VALUE, null, msgs);
			}
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__VALUE, newValue, newValue));
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
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__SUBJECT, oldSubject, newSubject);
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
						CDAPackage.OBSERVATION_MEDIA__SUBJECT, null, msgs);
			}
			if (newSubject != null) {
				msgs = ((InternalEObject) newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.OBSERVATION_MEDIA__SUBJECT, null, msgs);
			}
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__SUBJECT, newSubject, newSubject));
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
				Specimen.class, this, CDAPackage.OBSERVATION_MEDIA__SPECIMEN);
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
			performers = new EObjectContainmentEList<Performer2>(
				Performer2.class, this, CDAPackage.OBSERVATION_MEDIA__PERFORMER);
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
			authors = new EObjectContainmentEList<Author>(Author.class, this, CDAPackage.OBSERVATION_MEDIA__AUTHOR);
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
				Informant12.class, this, CDAPackage.OBSERVATION_MEDIA__INFORMANT);
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
			participants = new EObjectContainmentEList<Participant2>(
				Participant2.class, this, CDAPackage.OBSERVATION_MEDIA__PARTICIPANT);
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
				EntryRelationship.class, this, CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP);
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
			references = new EObjectContainmentEList<Reference>(
				Reference.class, this, CDAPackage.OBSERVATION_MEDIA__REFERENCE);
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
			preconditions = new EObjectContainmentEList<Precondition>(
				Precondition.class, this, CDAPackage.OBSERVATION_MEDIA__PRECONDITION);
		}
		return preconditions;
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__OBSERVATION_MEDIA_ID, oldObservationMediaId,
				observationMediaId));
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
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__NULL_FLAVOR, oldNullFlavor, nullFlavor,
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
				this, Notification.UNSET, CDAPackage.OBSERVATION_MEDIA__NULL_FLAVOR, oldNullFlavor,
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
		classCode = newClassCode == null
				? CLASS_CODE_EDEFAULT
				: newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__CLASS_CODE, oldClassCode, classCode,
				!oldClassCodeESet));
		}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.OBSERVATION_MEDIA__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT,
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
		moodCode = newMoodCode == null
				? MOOD_CODE_EDEFAULT
				: newMoodCode;
		boolean oldMoodCodeESet = moodCodeESet;
		moodCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.OBSERVATION_MEDIA__MOOD_CODE, oldMoodCode, moodCode,
				!oldMoodCodeESet));
		}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.OBSERVATION_MEDIA__MOOD_CODE, oldMoodCode, MOOD_CODE_EDEFAULT,
				oldMoodCodeESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.OBSERVATION_MEDIA__REALM_CODE:
				return ((InternalEList<?>) getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID:
				return ((InternalEList<?>) getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__ID:
				return ((InternalEList<?>) getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE:
				return basicSetLanguageCode(null, msgs);
			case CDAPackage.OBSERVATION_MEDIA__VALUE:
				return basicSetValue(null, msgs);
			case CDAPackage.OBSERVATION_MEDIA__SUBJECT:
				return basicSetSubject(null, msgs);
			case CDAPackage.OBSERVATION_MEDIA__SPECIMEN:
				return ((InternalEList<?>) getSpecimens()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__PERFORMER:
				return ((InternalEList<?>) getPerformers()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__AUTHOR:
				return ((InternalEList<?>) getAuthors()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__INFORMANT:
				return ((InternalEList<?>) getInformants()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__PARTICIPANT:
				return ((InternalEList<?>) getParticipants()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP:
				return ((InternalEList<?>) getEntryRelationships()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__REFERENCE:
				return ((InternalEList<?>) getReferences()).basicRemove(otherEnd, msgs);
			case CDAPackage.OBSERVATION_MEDIA__PRECONDITION:
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
			case CDAPackage.OBSERVATION_MEDIA__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.OBSERVATION_MEDIA__TYPE_ID:
				return getTypeId();
			case CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.OBSERVATION_MEDIA__ID:
				return getIds();
			case CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE:
				return getLanguageCode();
			case CDAPackage.OBSERVATION_MEDIA__VALUE:
				return getValue();
			case CDAPackage.OBSERVATION_MEDIA__SUBJECT:
				return getSubject();
			case CDAPackage.OBSERVATION_MEDIA__SPECIMEN:
				return getSpecimens();
			case CDAPackage.OBSERVATION_MEDIA__PERFORMER:
				return getPerformers();
			case CDAPackage.OBSERVATION_MEDIA__AUTHOR:
				return getAuthors();
			case CDAPackage.OBSERVATION_MEDIA__INFORMANT:
				return getInformants();
			case CDAPackage.OBSERVATION_MEDIA__PARTICIPANT:
				return getParticipants();
			case CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP:
				return getEntryRelationships();
			case CDAPackage.OBSERVATION_MEDIA__REFERENCE:
				return getReferences();
			case CDAPackage.OBSERVATION_MEDIA__PRECONDITION:
				return getPreconditions();
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
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE:
				setLanguageCode((CS) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__VALUE:
				setValue((ED) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__SUBJECT:
				setSubject((Subject) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__SPECIMEN:
				getSpecimens().clear();
				getSpecimens().addAll((Collection<? extends Specimen>) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Performer2>) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Author>) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__INFORMANT:
				getInformants().clear();
				getInformants().addAll((Collection<? extends Informant12>) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant2>) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP:
				getEntryRelationships().clear();
				getEntryRelationships().addAll((Collection<? extends EntryRelationship>) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__REFERENCE:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection<? extends Precondition>) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__OBSERVATION_MEDIA_ID:
				setObservationMediaId((String) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__NULL_FLAVOR:
				setNullFlavor((NullFlavor) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__CLASS_CODE:
				setClassCode((ActClassObservation) newValue);
				return;
			case CDAPackage.OBSERVATION_MEDIA__MOOD_CODE:
				setMoodCode((ActMood) newValue);
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
				getRealmCodes().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) null);
				return;
			case CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__ID:
				getIds().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE:
				setLanguageCode((CS) null);
				return;
			case CDAPackage.OBSERVATION_MEDIA__VALUE:
				setValue((ED) null);
				return;
			case CDAPackage.OBSERVATION_MEDIA__SUBJECT:
				setSubject((Subject) null);
				return;
			case CDAPackage.OBSERVATION_MEDIA__SPECIMEN:
				getSpecimens().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__PERFORMER:
				getPerformers().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__AUTHOR:
				getAuthors().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__INFORMANT:
				getInformants().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__PARTICIPANT:
				getParticipants().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP:
				getEntryRelationships().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__REFERENCE:
				getReferences().clear();
				return;
			case CDAPackage.OBSERVATION_MEDIA__PRECONDITION:
				getPreconditions().clear();
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
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__TYPE_ID:
				return typeId != null;
			case CDAPackage.OBSERVATION_MEDIA__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__LANGUAGE_CODE:
				return languageCode != null;
			case CDAPackage.OBSERVATION_MEDIA__VALUE:
				return value != null;
			case CDAPackage.OBSERVATION_MEDIA__SUBJECT:
				return subject != null;
			case CDAPackage.OBSERVATION_MEDIA__SPECIMEN:
				return specimens != null && !specimens.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__PERFORMER:
				return performers != null && !performers.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__AUTHOR:
				return authors != null && !authors.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__INFORMANT:
				return informants != null && !informants.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__ENTRY_RELATIONSHIP:
				return entryRelationships != null && !entryRelationships.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__REFERENCE:
				return references != null && !references.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__PRECONDITION:
				return preconditions != null && !preconditions.isEmpty();
			case CDAPackage.OBSERVATION_MEDIA__OBSERVATION_MEDIA_ID:
				return OBSERVATION_MEDIA_ID_EDEFAULT == null
						? observationMediaId != null
						: !OBSERVATION_MEDIA_ID_EDEFAULT.equals(observationMediaId);
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (observationMediaId: ");
		result.append(observationMediaId);
		result.append(", nullFlavor: ");
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
		result.append(')');
		return result.toString();
	}

} // ObservationMediaImpl
