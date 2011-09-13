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
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.Encounter;
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
import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryOrganizer;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getInformants <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getReferences <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getComponents <em>Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl#getMoodCode <em>Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizerImpl extends ClinicalStatementImpl implements Organizer {
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
	 * The cached value of the '{@link #getComponents() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component4> components;

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
	protected static final x_ActClassDocumentEntryOrganizer CLASS_CODE_EDEFAULT = x_ActClassDocumentEntryOrganizer.BATTERY;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected x_ActClassDocumentEntryOrganizer classCode = CLASS_CODE_EDEFAULT;

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
	protected OrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.ORGANIZER__REALM_CODE);
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
				this, Notification.SET, CDAPackage.ORGANIZER__TYPE_ID, oldTypeId, newTypeId);
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
						CDAPackage.ORGANIZER__TYPE_ID, null, msgs);
			}
			if (newTypeId != null) {
				msgs = ((InternalEObject) newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.ORGANIZER__TYPE_ID, null, msgs);
			}
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZER__TYPE_ID, newTypeId, newTypeId));
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
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.ORGANIZER__TEMPLATE_ID);
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
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.ORGANIZER__ID);
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
				this, Notification.SET, CDAPackage.ORGANIZER__CODE, oldCode, newCode);
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
						CDAPackage.ORGANIZER__CODE, null, msgs);
			}
			if (newCode != null) {
				msgs = ((InternalEObject) newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.ORGANIZER__CODE, null, msgs);
			}
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZER__CODE, newCode, newCode));
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
				this, Notification.SET, CDAPackage.ORGANIZER__STATUS_CODE, oldStatusCode, newStatusCode);
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
						CDAPackage.ORGANIZER__STATUS_CODE, null, msgs);
			}
			if (newStatusCode != null) {
				msgs = ((InternalEObject) newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.ORGANIZER__STATUS_CODE, null, msgs);
			}
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.ORGANIZER__STATUS_CODE, newStatusCode, newStatusCode));
		}
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.ORGANIZER__EFFECTIVE_TIME, oldEffectiveTime, newEffectiveTime);
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
	public void setEffectiveTime(IVL_TS newEffectiveTime) {
		if (newEffectiveTime != effectiveTime) {
			NotificationChain msgs = null;
			if (effectiveTime != null) {
				msgs = ((InternalEObject) effectiveTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.ORGANIZER__EFFECTIVE_TIME, null, msgs);
			}
			if (newEffectiveTime != null) {
				msgs = ((InternalEObject) newEffectiveTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.ORGANIZER__EFFECTIVE_TIME, null, msgs);
			}
			msgs = basicSetEffectiveTime(newEffectiveTime, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.ORGANIZER__EFFECTIVE_TIME, newEffectiveTime, newEffectiveTime));
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
				this, Notification.SET, CDAPackage.ORGANIZER__SUBJECT, oldSubject, newSubject);
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
						CDAPackage.ORGANIZER__SUBJECT, null, msgs);
			}
			if (newSubject != null) {
				msgs = ((InternalEObject) newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.ORGANIZER__SUBJECT, null, msgs);
			}
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ORGANIZER__SUBJECT, newSubject, newSubject));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specimen> getSpecimens() {
		if (specimens == null) {
			specimens = new EObjectContainmentEList<Specimen>(Specimen.class, this, CDAPackage.ORGANIZER__SPECIMEN);
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
				Performer2.class, this, CDAPackage.ORGANIZER__PERFORMER);
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
			authors = new EObjectContainmentEList<Author>(Author.class, this, CDAPackage.ORGANIZER__AUTHOR);
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
				Informant12.class, this, CDAPackage.ORGANIZER__INFORMANT);
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
				Participant2.class, this, CDAPackage.ORGANIZER__PARTICIPANT);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(Reference.class, this, CDAPackage.ORGANIZER__REFERENCE);
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
				Precondition.class, this, CDAPackage.ORGANIZER__PRECONDITION);
		}
		return preconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component4> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component4>(
				Component4.class, this, CDAPackage.ORGANIZER__COMPONENT);
		}
		return components;
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
				this, Notification.SET, CDAPackage.ORGANIZER__NULL_FLAVOR, oldNullFlavor, nullFlavor,
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
				this, Notification.UNSET, CDAPackage.ORGANIZER__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT,
				oldNullFlavorESet));
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
	public x_ActClassDocumentEntryOrganizer getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(x_ActClassDocumentEntryOrganizer newClassCode) {
		x_ActClassDocumentEntryOrganizer oldClassCode = classCode;
		classCode = newClassCode == null
				? CLASS_CODE_EDEFAULT
				: newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.ORGANIZER__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		x_ActClassDocumentEntryOrganizer oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.ORGANIZER__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT,
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
				this, Notification.SET, CDAPackage.ORGANIZER__MOOD_CODE, oldMoodCode, moodCode, !oldMoodCodeESet));
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
				this, Notification.UNSET, CDAPackage.ORGANIZER__MOOD_CODE, oldMoodCode, MOOD_CODE_EDEFAULT,
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
	public void addAct(Act act) {
		OrganizerOperations.addAct(this, act);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addEncounter(Encounter encounter) {
		OrganizerOperations.addEncounter(this, encounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addObservation(Observation observation) {
		OrganizerOperations.addObservation(this, observation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addObservationMedia(ObservationMedia observationMedia) {
		OrganizerOperations.addObservationMedia(this, observationMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addOrganizer(Organizer newOrganizer) {
		OrganizerOperations.addOrganizer(this, newOrganizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addProcedure(Procedure procedure) {
		OrganizerOperations.addProcedure(this, procedure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addRegionOfInterest(RegionOfInterest regionOfInterest) {
		OrganizerOperations.addRegionOfInterest(this, regionOfInterest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addSubstanceAdministration(SubstanceAdministration substanceAdministration) {
		OrganizerOperations.addSubstanceAdministration(this, substanceAdministration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addSupply(Supply supply) {
		OrganizerOperations.addSupply(this, supply);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Act> getActs() {
		return OrganizerOperations.getActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Encounter> getEncounters() {
		return OrganizerOperations.getEncounters(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Observation> getObservations() {
		return OrganizerOperations.getObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservationMedia> getObservationMedia() {
		return OrganizerOperations.getObservationMedia(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Organizer> getOrganizers() {
		return OrganizerOperations.getOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Procedure> getProcedures() {
		return OrganizerOperations.getProcedures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RegionOfInterest> getRegionsOfInterest() {
		return OrganizerOperations.getRegionsOfInterest(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceAdministration> getSubstanceAdministrations() {
		return OrganizerOperations.getSubstanceAdministrations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Supply> getSupplies() {
		return OrganizerOperations.getSupplies(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClinicalStatement> getEntryRelationshipTargets(x_ActRelationshipEntryRelationship typeCode,
			Object targetClass) {
		return OrganizerOperations.getEntryRelationshipTargets(this, typeCode, targetClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClinicalStatement> getEntryRelationshipTargets(Object targetClass) {
		return OrganizerOperations.getEntryRelationshipTargets(this, targetClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.ORGANIZER__REALM_CODE:
				return ((InternalEList<?>) getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZER__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.ORGANIZER__TEMPLATE_ID:
				return ((InternalEList<?>) getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZER__ID:
				return ((InternalEList<?>) getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZER__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.ORGANIZER__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case CDAPackage.ORGANIZER__EFFECTIVE_TIME:
				return basicSetEffectiveTime(null, msgs);
			case CDAPackage.ORGANIZER__SUBJECT:
				return basicSetSubject(null, msgs);
			case CDAPackage.ORGANIZER__SPECIMEN:
				return ((InternalEList<?>) getSpecimens()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZER__PERFORMER:
				return ((InternalEList<?>) getPerformers()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZER__AUTHOR:
				return ((InternalEList<?>) getAuthors()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZER__INFORMANT:
				return ((InternalEList<?>) getInformants()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZER__PARTICIPANT:
				return ((InternalEList<?>) getParticipants()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZER__REFERENCE:
				return ((InternalEList<?>) getReferences()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZER__PRECONDITION:
				return ((InternalEList<?>) getPreconditions()).basicRemove(otherEnd, msgs);
			case CDAPackage.ORGANIZER__COMPONENT:
				return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
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
			case CDAPackage.ORGANIZER__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.ORGANIZER__TYPE_ID:
				return getTypeId();
			case CDAPackage.ORGANIZER__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.ORGANIZER__ID:
				return getIds();
			case CDAPackage.ORGANIZER__CODE:
				return getCode();
			case CDAPackage.ORGANIZER__STATUS_CODE:
				return getStatusCode();
			case CDAPackage.ORGANIZER__EFFECTIVE_TIME:
				return getEffectiveTime();
			case CDAPackage.ORGANIZER__SUBJECT:
				return getSubject();
			case CDAPackage.ORGANIZER__SPECIMEN:
				return getSpecimens();
			case CDAPackage.ORGANIZER__PERFORMER:
				return getPerformers();
			case CDAPackage.ORGANIZER__AUTHOR:
				return getAuthors();
			case CDAPackage.ORGANIZER__INFORMANT:
				return getInformants();
			case CDAPackage.ORGANIZER__PARTICIPANT:
				return getParticipants();
			case CDAPackage.ORGANIZER__REFERENCE:
				return getReferences();
			case CDAPackage.ORGANIZER__PRECONDITION:
				return getPreconditions();
			case CDAPackage.ORGANIZER__COMPONENT:
				return getComponents();
			case CDAPackage.ORGANIZER__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.ORGANIZER__CLASS_CODE:
				return getClassCode();
			case CDAPackage.ORGANIZER__MOOD_CODE:
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
			case CDAPackage.ORGANIZER__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>) newValue);
				return;
			case CDAPackage.ORGANIZER__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) newValue);
				return;
			case CDAPackage.ORGANIZER__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.ORGANIZER__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.ORGANIZER__CODE:
				setCode((CD) newValue);
				return;
			case CDAPackage.ORGANIZER__STATUS_CODE:
				setStatusCode((CS) newValue);
				return;
			case CDAPackage.ORGANIZER__EFFECTIVE_TIME:
				setEffectiveTime((IVL_TS) newValue);
				return;
			case CDAPackage.ORGANIZER__SUBJECT:
				setSubject((Subject) newValue);
				return;
			case CDAPackage.ORGANIZER__SPECIMEN:
				getSpecimens().clear();
				getSpecimens().addAll((Collection<? extends Specimen>) newValue);
				return;
			case CDAPackage.ORGANIZER__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Performer2>) newValue);
				return;
			case CDAPackage.ORGANIZER__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Author>) newValue);
				return;
			case CDAPackage.ORGANIZER__INFORMANT:
				getInformants().clear();
				getInformants().addAll((Collection<? extends Informant12>) newValue);
				return;
			case CDAPackage.ORGANIZER__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant2>) newValue);
				return;
			case CDAPackage.ORGANIZER__REFERENCE:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>) newValue);
				return;
			case CDAPackage.ORGANIZER__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection<? extends Precondition>) newValue);
				return;
			case CDAPackage.ORGANIZER__COMPONENT:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component4>) newValue);
				return;
			case CDAPackage.ORGANIZER__NULL_FLAVOR:
				setNullFlavor((NullFlavor) newValue);
				return;
			case CDAPackage.ORGANIZER__CLASS_CODE:
				setClassCode((x_ActClassDocumentEntryOrganizer) newValue);
				return;
			case CDAPackage.ORGANIZER__MOOD_CODE:
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
			case CDAPackage.ORGANIZER__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.ORGANIZER__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) null);
				return;
			case CDAPackage.ORGANIZER__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.ORGANIZER__ID:
				getIds().clear();
				return;
			case CDAPackage.ORGANIZER__CODE:
				setCode((CD) null);
				return;
			case CDAPackage.ORGANIZER__STATUS_CODE:
				setStatusCode((CS) null);
				return;
			case CDAPackage.ORGANIZER__EFFECTIVE_TIME:
				setEffectiveTime((IVL_TS) null);
				return;
			case CDAPackage.ORGANIZER__SUBJECT:
				setSubject((Subject) null);
				return;
			case CDAPackage.ORGANIZER__SPECIMEN:
				getSpecimens().clear();
				return;
			case CDAPackage.ORGANIZER__PERFORMER:
				getPerformers().clear();
				return;
			case CDAPackage.ORGANIZER__AUTHOR:
				getAuthors().clear();
				return;
			case CDAPackage.ORGANIZER__INFORMANT:
				getInformants().clear();
				return;
			case CDAPackage.ORGANIZER__PARTICIPANT:
				getParticipants().clear();
				return;
			case CDAPackage.ORGANIZER__REFERENCE:
				getReferences().clear();
				return;
			case CDAPackage.ORGANIZER__PRECONDITION:
				getPreconditions().clear();
				return;
			case CDAPackage.ORGANIZER__COMPONENT:
				getComponents().clear();
				return;
			case CDAPackage.ORGANIZER__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.ORGANIZER__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.ORGANIZER__MOOD_CODE:
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
			case CDAPackage.ORGANIZER__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.ORGANIZER__TYPE_ID:
				return typeId != null;
			case CDAPackage.ORGANIZER__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.ORGANIZER__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.ORGANIZER__CODE:
				return code != null;
			case CDAPackage.ORGANIZER__STATUS_CODE:
				return statusCode != null;
			case CDAPackage.ORGANIZER__EFFECTIVE_TIME:
				return effectiveTime != null;
			case CDAPackage.ORGANIZER__SUBJECT:
				return subject != null;
			case CDAPackage.ORGANIZER__SPECIMEN:
				return specimens != null && !specimens.isEmpty();
			case CDAPackage.ORGANIZER__PERFORMER:
				return performers != null && !performers.isEmpty();
			case CDAPackage.ORGANIZER__AUTHOR:
				return authors != null && !authors.isEmpty();
			case CDAPackage.ORGANIZER__INFORMANT:
				return informants != null && !informants.isEmpty();
			case CDAPackage.ORGANIZER__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case CDAPackage.ORGANIZER__REFERENCE:
				return references != null && !references.isEmpty();
			case CDAPackage.ORGANIZER__PRECONDITION:
				return preconditions != null && !preconditions.isEmpty();
			case CDAPackage.ORGANIZER__COMPONENT:
				return components != null && !components.isEmpty();
			case CDAPackage.ORGANIZER__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.ORGANIZER__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.ORGANIZER__MOOD_CODE:
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
		result.append(')');
		return result.toString();
	}

} // OrganizerImpl
