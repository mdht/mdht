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
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.Authorization;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.InFulfillmentOf;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.RelatedDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StructuredBody;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassClinicalDocument;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getConfidentialityCode <em>Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getSetId <em>Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getVersionNumber <em>Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getCopyTime <em>Copy Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getRecordTargets <em>Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getDataEnterer <em>Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getInformants <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getCustodian <em>Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getInformationRecipients <em>Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getLegalAuthenticator <em>Legal Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getAuthenticators <em>Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getInFulfillmentOfs <em>In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getDocumentationOfs <em>Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getRelatedDocuments <em>Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getAuthorizations <em>Authorization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getComponentOf <em>Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl#getMoodCode <em>Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalDocumentImpl extends EObjectImpl implements ClinicalDocument {
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
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected II id;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CE code;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected ST title;

	/**
	 * The cached value of the '{@link #getEffectiveTime() <em>Effective Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected TS effectiveTime;

	/**
	 * The cached value of the '{@link #getConfidentialityCode() <em>Confidentiality Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCode()
	 * @generated
	 * @ordered
	 */
	protected CE confidentialityCode;

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
	 * The cached value of the '{@link #getSetId() <em>Set Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetId()
	 * @generated
	 * @ordered
	 */
	protected II setId;

	/**
	 * The cached value of the '{@link #getVersionNumber() <em>Version Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected INT versionNumber;

	/**
	 * The cached value of the '{@link #getCopyTime() <em>Copy Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyTime()
	 * @generated
	 * @ordered
	 */
	protected TS copyTime;

	/**
	 * The cached value of the '{@link #getRecordTargets() <em>Record Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordTarget> recordTargets;

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
	 * The cached value of the '{@link #getDataEnterer() <em>Data Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEnterer()
	 * @generated
	 * @ordered
	 */
	protected DataEnterer dataEnterer;

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
	 * The cached value of the '{@link #getCustodian() <em>Custodian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected Custodian custodian;

	/**
	 * The cached value of the '{@link #getInformationRecipients() <em>Information Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationRecipient> informationRecipients;

	/**
	 * The cached value of the '{@link #getLegalAuthenticator() <em>Legal Authenticator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected LegalAuthenticator legalAuthenticator;

	/**
	 * The cached value of the '{@link #getAuthenticators() <em>Authenticator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticators()
	 * @generated
	 * @ordered
	 */
	protected EList<Authenticator> authenticators;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant1> participants;

	/**
	 * The cached value of the '{@link #getInFulfillmentOfs() <em>In Fulfillment Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInFulfillmentOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<InFulfillmentOf> inFulfillmentOfs;

	/**
	 * The cached value of the '{@link #getDocumentationOfs() <em>Documentation Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentationOf> documentationOfs;

	/**
	 * The cached value of the '{@link #getRelatedDocuments() <em>Related Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedDocument> relatedDocuments;

	/**
	 * The cached value of the '{@link #getAuthorizations() <em>Authorization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Authorization> authorizations;

	/**
	 * The cached value of the '{@link #getComponentOf() <em>Component Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentOf()
	 * @generated
	 * @ordered
	 */
	protected Component1 componentOf;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component2 component;

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
	protected static final ActClassClinicalDocument CLASS_CODE_EDEFAULT = ActClassClinicalDocument.DOCCLIN;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected ActClassClinicalDocument classCode = CLASS_CODE_EDEFAULT;

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
	protected ClinicalDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.CLINICAL_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.CLINICAL_DOCUMENT__REALM_CODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__TYPE_ID, oldTypeId, newTypeId);
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
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID);
		}
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(II newId, NotificationChain msgs) {
		II oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__ID, oldId, newId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(II newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CE newCode, NotificationChain msgs) {
		CE oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CE newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(ST newTitle, NotificationChain msgs) {
		ST oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(ST newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS getEffectiveTime() {
		return effectiveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveTime(TS newEffectiveTime, NotificationChain msgs) {
		TS oldEffectiveTime = effectiveTime;
		effectiveTime = newEffectiveTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME, oldEffectiveTime, newEffectiveTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveTime(TS newEffectiveTime) {
		if (newEffectiveTime != effectiveTime) {
			NotificationChain msgs = null;
			if (effectiveTime != null)
				msgs = ((InternalEObject)effectiveTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME, null, msgs);
			if (newEffectiveTime != null)
				msgs = ((InternalEObject)newEffectiveTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME, null, msgs);
			msgs = basicSetEffectiveTime(newEffectiveTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME, newEffectiveTime, newEffectiveTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getConfidentialityCode() {
		return confidentialityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidentialityCode(CE newConfidentialityCode, NotificationChain msgs) {
		CE oldConfidentialityCode = confidentialityCode;
		confidentialityCode = newConfidentialityCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE, oldConfidentialityCode, newConfidentialityCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentialityCode(CE newConfidentialityCode) {
		if (newConfidentialityCode != confidentialityCode) {
			NotificationChain msgs = null;
			if (confidentialityCode != null)
				msgs = ((InternalEObject)confidentialityCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE, null, msgs);
			if (newConfidentialityCode != null)
				msgs = ((InternalEObject)newConfidentialityCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE, null, msgs);
			msgs = basicSetConfidentialityCode(newConfidentialityCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE, newConfidentialityCode, newConfidentialityCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE, oldLanguageCode, newLanguageCode);
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
				msgs = ((InternalEObject)languageCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE, null, msgs);
			if (newLanguageCode != null)
				msgs = ((InternalEObject)newLanguageCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE, null, msgs);
			msgs = basicSetLanguageCode(newLanguageCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE, newLanguageCode, newLanguageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II getSetId() {
		return setId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetId(II newSetId, NotificationChain msgs) {
		II oldSetId = setId;
		setId = newSetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__SET_ID, oldSetId, newSetId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetId(II newSetId) {
		if (newSetId != setId) {
			NotificationChain msgs = null;
			if (setId != null)
				msgs = ((InternalEObject)setId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__SET_ID, null, msgs);
			if (newSetId != null)
				msgs = ((InternalEObject)newSetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__SET_ID, null, msgs);
			msgs = basicSetSetId(newSetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__SET_ID, newSetId, newSetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INT getVersionNumber() {
		return versionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionNumber(INT newVersionNumber, NotificationChain msgs) {
		INT oldVersionNumber = versionNumber;
		versionNumber = newVersionNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER, oldVersionNumber, newVersionNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionNumber(INT newVersionNumber) {
		if (newVersionNumber != versionNumber) {
			NotificationChain msgs = null;
			if (versionNumber != null)
				msgs = ((InternalEObject)versionNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER, null, msgs);
			if (newVersionNumber != null)
				msgs = ((InternalEObject)newVersionNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER, null, msgs);
			msgs = basicSetVersionNumber(newVersionNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER, newVersionNumber, newVersionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS getCopyTime() {
		return copyTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyTime(TS newCopyTime, NotificationChain msgs) {
		TS oldCopyTime = copyTime;
		copyTime = newCopyTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__COPY_TIME, oldCopyTime, newCopyTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyTime(TS newCopyTime) {
		if (newCopyTime != copyTime) {
			NotificationChain msgs = null;
			if (copyTime != null)
				msgs = ((InternalEObject)copyTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__COPY_TIME, null, msgs);
			if (newCopyTime != null)
				msgs = ((InternalEObject)newCopyTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__COPY_TIME, null, msgs);
			msgs = basicSetCopyTime(newCopyTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__COPY_TIME, newCopyTime, newCopyTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordTarget> getRecordTargets() {
		if (recordTargets == null) {
			recordTargets = new EObjectContainmentEList<RecordTarget>(RecordTarget.class, this, CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET);
		}
		return recordTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Author> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<Author>(Author.class, this, CDAPackage.CLINICAL_DOCUMENT__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEnterer getDataEnterer() {
		return dataEnterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataEnterer(DataEnterer newDataEnterer, NotificationChain msgs) {
		DataEnterer oldDataEnterer = dataEnterer;
		dataEnterer = newDataEnterer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER, oldDataEnterer, newDataEnterer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEnterer(DataEnterer newDataEnterer) {
		if (newDataEnterer != dataEnterer) {
			NotificationChain msgs = null;
			if (dataEnterer != null)
				msgs = ((InternalEObject)dataEnterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER, null, msgs);
			if (newDataEnterer != null)
				msgs = ((InternalEObject)newDataEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER, null, msgs);
			msgs = basicSetDataEnterer(newDataEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER, newDataEnterer, newDataEnterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Informant12> getInformants() {
		if (informants == null) {
			informants = new EObjectContainmentEList<Informant12>(Informant12.class, this, CDAPackage.CLINICAL_DOCUMENT__INFORMANT);
		}
		return informants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian getCustodian() {
		return custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustodian(Custodian newCustodian, NotificationChain msgs) {
		Custodian oldCustodian = custodian;
		custodian = newCustodian;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN, oldCustodian, newCustodian);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustodian(Custodian newCustodian) {
		if (newCustodian != custodian) {
			NotificationChain msgs = null;
			if (custodian != null)
				msgs = ((InternalEObject)custodian).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN, null, msgs);
			if (newCustodian != null)
				msgs = ((InternalEObject)newCustodian).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN, null, msgs);
			msgs = basicSetCustodian(newCustodian, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN, newCustodian, newCustodian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationRecipient> getInformationRecipients() {
		if (informationRecipients == null) {
			informationRecipients = new EObjectContainmentEList<InformationRecipient>(InformationRecipient.class, this, CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT);
		}
		return informationRecipients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalAuthenticator getLegalAuthenticator() {
		return legalAuthenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalAuthenticator(LegalAuthenticator newLegalAuthenticator, NotificationChain msgs) {
		LegalAuthenticator oldLegalAuthenticator = legalAuthenticator;
		legalAuthenticator = newLegalAuthenticator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR, oldLegalAuthenticator, newLegalAuthenticator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalAuthenticator(LegalAuthenticator newLegalAuthenticator) {
		if (newLegalAuthenticator != legalAuthenticator) {
			NotificationChain msgs = null;
			if (legalAuthenticator != null)
				msgs = ((InternalEObject)legalAuthenticator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR, null, msgs);
			if (newLegalAuthenticator != null)
				msgs = ((InternalEObject)newLegalAuthenticator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR, null, msgs);
			msgs = basicSetLegalAuthenticator(newLegalAuthenticator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR, newLegalAuthenticator, newLegalAuthenticator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Authenticator> getAuthenticators() {
		if (authenticators == null) {
			authenticators = new EObjectContainmentEList<Authenticator>(Authenticator.class, this, CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR);
		}
		return authenticators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant1> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Participant1>(Participant1.class, this, CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InFulfillmentOf> getInFulfillmentOfs() {
		if (inFulfillmentOfs == null) {
			inFulfillmentOfs = new EObjectContainmentEList<InFulfillmentOf>(InFulfillmentOf.class, this, CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF);
		}
		return inFulfillmentOfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationOf> getDocumentationOfs() {
		if (documentationOfs == null) {
			documentationOfs = new EObjectContainmentEList<DocumentationOf>(DocumentationOf.class, this, CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF);
		}
		return documentationOfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedDocument> getRelatedDocuments() {
		if (relatedDocuments == null) {
			relatedDocuments = new EObjectContainmentEList<RelatedDocument>(RelatedDocument.class, this, CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT);
		}
		return relatedDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Authorization> getAuthorizations() {
		if (authorizations == null) {
			authorizations = new EObjectContainmentEList<Authorization>(Authorization.class, this, CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION);
		}
		return authorizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component1 getComponentOf() {
		return componentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentOf(Component1 newComponentOf, NotificationChain msgs) {
		Component1 oldComponentOf = componentOf;
		componentOf = newComponentOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF, oldComponentOf, newComponentOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentOf(Component1 newComponentOf) {
		if (newComponentOf != componentOf) {
			NotificationChain msgs = null;
			if (componentOf != null)
				msgs = ((InternalEObject)componentOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF, null, msgs);
			if (newComponentOf != null)
				msgs = ((InternalEObject)newComponentOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF, null, msgs);
			msgs = basicSetComponentOf(newComponentOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF, newComponentOf, newComponentOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component2 getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component2 newComponent, NotificationChain msgs) {
		Component2 oldComponent = component;
		component = newComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__COMPONENT, oldComponent, newComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component2 newComponent) {
		if (newComponent != component) {
			NotificationChain msgs = null;
			if (component != null)
				msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__COMPONENT, null, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.CLINICAL_DOCUMENT__COMPONENT, null, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__COMPONENT, newComponent, newComponent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
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
	public ActClassClinicalDocument getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(ActClassClinicalDocument newClassCode) {
		ActClassClinicalDocument oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE, oldClassCode, classCode, !oldClassCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		ActClassClinicalDocument oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT, oldClassCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE, oldMoodCode, moodCode, !oldMoodCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE, oldMoodCode, MOOD_CODE_EDEFAULT, oldMoodCodeESet));
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
	public void setStructuredBody(StructuredBody structuredBody) {
		ClinicalDocumentOperations.setStructuredBody(this, structuredBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSection(Section section) {
		ClinicalDocumentOperations.addSection(this, section);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Patient> getPatients() {
		return ClinicalDocumentOperations.getPatients(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientRole> getPatientRoles() {
		return ClinicalDocumentOperations.getPatientRoles(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		return ClinicalDocumentOperations.getSections(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getAllSections() {
		return ClinicalDocumentOperations.getAllSections(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasCode(String code, String codeSystem, String codeSystemName) {
		return ClinicalDocumentOperations.hasCode(this, code, codeSystem, codeSystemName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSectionTemplate(String templateId) {
		return ClinicalDocumentOperations.hasSectionTemplate(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasTemplateId(String templateId) {
		return ClinicalDocumentOperations.hasTemplateId(this, templateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPatientRole(PatientRole patientRole) {
		ClinicalDocumentOperations.addPatientRole(this, patientRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPatient(Patient patient) {
		ClinicalDocumentOperations.addPatient(this, patient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.CLINICAL_DOCUMENT__REALM_CODE:
				return ((InternalEList<?>)getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__ID:
				return basicSetId(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__TITLE:
				return basicSetTitle(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME:
				return basicSetEffectiveTime(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE:
				return basicSetConfidentialityCode(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE:
				return basicSetLanguageCode(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__SET_ID:
				return basicSetSetId(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER:
				return basicSetVersionNumber(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__COPY_TIME:
				return basicSetCopyTime(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET:
				return ((InternalEList<?>)getRecordTargets()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__AUTHOR:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER:
				return basicSetDataEnterer(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__INFORMANT:
				return ((InternalEList<?>)getInformants()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN:
				return basicSetCustodian(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT:
				return ((InternalEList<?>)getInformationRecipients()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR:
				return basicSetLegalAuthenticator(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR:
				return ((InternalEList<?>)getAuthenticators()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF:
				return ((InternalEList<?>)getInFulfillmentOfs()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF:
				return ((InternalEList<?>)getDocumentationOfs()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT:
				return ((InternalEList<?>)getRelatedDocuments()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION:
				return ((InternalEList<?>)getAuthorizations()).basicRemove(otherEnd, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF:
				return basicSetComponentOf(null, msgs);
			case CDAPackage.CLINICAL_DOCUMENT__COMPONENT:
				return basicSetComponent(null, msgs);
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
			case CDAPackage.CLINICAL_DOCUMENT__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.CLINICAL_DOCUMENT__TYPE_ID:
				return getTypeId();
			case CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.CLINICAL_DOCUMENT__ID:
				return getId();
			case CDAPackage.CLINICAL_DOCUMENT__CODE:
				return getCode();
			case CDAPackage.CLINICAL_DOCUMENT__TITLE:
				return getTitle();
			case CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME:
				return getEffectiveTime();
			case CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE:
				return getConfidentialityCode();
			case CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE:
				return getLanguageCode();
			case CDAPackage.CLINICAL_DOCUMENT__SET_ID:
				return getSetId();
			case CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER:
				return getVersionNumber();
			case CDAPackage.CLINICAL_DOCUMENT__COPY_TIME:
				return getCopyTime();
			case CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET:
				return getRecordTargets();
			case CDAPackage.CLINICAL_DOCUMENT__AUTHOR:
				return getAuthors();
			case CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER:
				return getDataEnterer();
			case CDAPackage.CLINICAL_DOCUMENT__INFORMANT:
				return getInformants();
			case CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN:
				return getCustodian();
			case CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT:
				return getInformationRecipients();
			case CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR:
				return getLegalAuthenticator();
			case CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR:
				return getAuthenticators();
			case CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT:
				return getParticipants();
			case CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF:
				return getInFulfillmentOfs();
			case CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF:
				return getDocumentationOfs();
			case CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT:
				return getRelatedDocuments();
			case CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION:
				return getAuthorizations();
			case CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF:
				return getComponentOf();
			case CDAPackage.CLINICAL_DOCUMENT__COMPONENT:
				return getComponent();
			case CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE:
				return getClassCode();
			case CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE:
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
			case CDAPackage.CLINICAL_DOCUMENT__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__ID:
				setId((II)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__CODE:
				setCode((CE)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__TITLE:
				setTitle((ST)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME:
				setEffectiveTime((TS)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE:
				setConfidentialityCode((CE)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE:
				setLanguageCode((CS)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__SET_ID:
				setSetId((II)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER:
				setVersionNumber((INT)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__COPY_TIME:
				setCopyTime((TS)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET:
				getRecordTargets().clear();
				getRecordTargets().addAll((Collection<? extends RecordTarget>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Author>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER:
				setDataEnterer((DataEnterer)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__INFORMANT:
				getInformants().clear();
				getInformants().addAll((Collection<? extends Informant12>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN:
				setCustodian((Custodian)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT:
				getInformationRecipients().clear();
				getInformationRecipients().addAll((Collection<? extends InformationRecipient>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR:
				setLegalAuthenticator((LegalAuthenticator)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR:
				getAuthenticators().clear();
				getAuthenticators().addAll((Collection<? extends Authenticator>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant1>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF:
				getInFulfillmentOfs().clear();
				getInFulfillmentOfs().addAll((Collection<? extends InFulfillmentOf>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF:
				getDocumentationOfs().clear();
				getDocumentationOfs().addAll((Collection<? extends DocumentationOf>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT:
				getRelatedDocuments().clear();
				getRelatedDocuments().addAll((Collection<? extends RelatedDocument>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION:
				getAuthorizations().clear();
				getAuthorizations().addAll((Collection<? extends Authorization>)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF:
				setComponentOf((Component1)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__COMPONENT:
				setComponent((Component2)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE:
				setClassCode((ActClassClinicalDocument)newValue);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE:
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
			case CDAPackage.CLINICAL_DOCUMENT__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__ID:
				setId((II)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__CODE:
				setCode((CE)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__TITLE:
				setTitle((ST)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME:
				setEffectiveTime((TS)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE:
				setConfidentialityCode((CE)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE:
				setLanguageCode((CS)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__SET_ID:
				setSetId((II)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER:
				setVersionNumber((INT)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__COPY_TIME:
				setCopyTime((TS)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET:
				getRecordTargets().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__AUTHOR:
				getAuthors().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER:
				setDataEnterer((DataEnterer)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__INFORMANT:
				getInformants().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN:
				setCustodian((Custodian)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT:
				getInformationRecipients().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR:
				setLegalAuthenticator((LegalAuthenticator)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR:
				getAuthenticators().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT:
				getParticipants().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF:
				getInFulfillmentOfs().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF:
				getDocumentationOfs().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT:
				getRelatedDocuments().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION:
				getAuthorizations().clear();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF:
				setComponentOf((Component1)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__COMPONENT:
				setComponent((Component2)null);
				return;
			case CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE:
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
			case CDAPackage.CLINICAL_DOCUMENT__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__TYPE_ID:
				return typeId != null;
			case CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__ID:
				return id != null;
			case CDAPackage.CLINICAL_DOCUMENT__CODE:
				return code != null;
			case CDAPackage.CLINICAL_DOCUMENT__TITLE:
				return title != null;
			case CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME:
				return effectiveTime != null;
			case CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE:
				return confidentialityCode != null;
			case CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE:
				return languageCode != null;
			case CDAPackage.CLINICAL_DOCUMENT__SET_ID:
				return setId != null;
			case CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER:
				return versionNumber != null;
			case CDAPackage.CLINICAL_DOCUMENT__COPY_TIME:
				return copyTime != null;
			case CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET:
				return recordTargets != null && !recordTargets.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__AUTHOR:
				return authors != null && !authors.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER:
				return dataEnterer != null;
			case CDAPackage.CLINICAL_DOCUMENT__INFORMANT:
				return informants != null && !informants.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN:
				return custodian != null;
			case CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT:
				return informationRecipients != null && !informationRecipients.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR:
				return legalAuthenticator != null;
			case CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR:
				return authenticators != null && !authenticators.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF:
				return inFulfillmentOfs != null && !inFulfillmentOfs.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF:
				return documentationOfs != null && !documentationOfs.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT:
				return relatedDocuments != null && !relatedDocuments.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION:
				return authorizations != null && !authorizations.isEmpty();
			case CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF:
				return componentOf != null;
			case CDAPackage.CLINICAL_DOCUMENT__COMPONENT:
				return component != null;
			case CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE:
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
		result.append(" (nullFlavor: ");
		if (nullFlavorESet) result.append(nullFlavor); else result.append("<unset>");
		result.append(", classCode: ");
		if (classCodeESet) result.append(classCode); else result.append("<unset>");
		result.append(", moodCode: ");
		if (moodCodeESet) result.append(moodCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ClinicalDocumentImpl
