/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.DocumentManifestContent;
import org.hl7.fhir.DocumentManifestRelated;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getMasterIdentifier <em>Master Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestImpl#getRelated <em>Related</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentManifestImpl extends DomainResourceImpl implements DocumentManifest {
	/**
	 * The cached value of the '{@link #getMasterIdentifier() <em>Master Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier masterIdentifier;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> recipient;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> author;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Uri source;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected DocumentReferenceStatus status;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentManifestContent> content;

	/**
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentManifestRelated> related;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentManifestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDocumentManifest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getMasterIdentifier() {
		return masterIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterIdentifier(Identifier newMasterIdentifier, NotificationChain msgs) {
		Identifier oldMasterIdentifier = masterIdentifier;
		masterIdentifier = newMasterIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER, oldMasterIdentifier, newMasterIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterIdentifier(Identifier newMasterIdentifier) {
		if (newMasterIdentifier != masterIdentifier) {
			NotificationChain msgs = null;
			if (masterIdentifier != null)
				msgs = ((InternalEObject)masterIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER, null, msgs);
			if (newMasterIdentifier != null)
				msgs = ((InternalEObject)newMasterIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER, null, msgs);
			msgs = basicSetMasterIdentifier(newMasterIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER, newMasterIdentifier, newMasterIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DOCUMENT_MANIFEST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRecipient() {
		if (recipient == null) {
			recipient = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DOCUMENT_MANIFEST__RECIPIENT);
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DOCUMENT_MANIFEST__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Uri newSource, NotificationChain msgs) {
		Uri oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Uri newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(DocumentReferenceStatus newStatus, NotificationChain msgs) {
		DocumentReferenceStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(DocumentReferenceStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentManifestContent> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<DocumentManifestContent>(DocumentManifestContent.class, this, FhirPackage.DOCUMENT_MANIFEST__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentManifestRelated> getRelated() {
		if (related == null) {
			related = new EObjectContainmentEList<DocumentManifestRelated>(DocumentManifestRelated.class, this, FhirPackage.DOCUMENT_MANIFEST__RELATED);
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				return basicSetMasterIdentifier(null, msgs);
			case FhirPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_MANIFEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.DOCUMENT_MANIFEST__RECIPIENT:
				return ((InternalEList<?>)getRecipient()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_MANIFEST__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DOCUMENT_MANIFEST__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_MANIFEST__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.DOCUMENT_MANIFEST__SOURCE:
				return basicSetSource(null, msgs);
			case FhirPackage.DOCUMENT_MANIFEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.DOCUMENT_MANIFEST__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_MANIFEST__RELATED:
				return ((InternalEList<?>)getRelated()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				return getMasterIdentifier();
			case FhirPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DOCUMENT_MANIFEST__SUBJECT:
				return getSubject();
			case FhirPackage.DOCUMENT_MANIFEST__RECIPIENT:
				return getRecipient();
			case FhirPackage.DOCUMENT_MANIFEST__TYPE:
				return getType();
			case FhirPackage.DOCUMENT_MANIFEST__AUTHOR:
				return getAuthor();
			case FhirPackage.DOCUMENT_MANIFEST__CREATED:
				return getCreated();
			case FhirPackage.DOCUMENT_MANIFEST__SOURCE:
				return getSource();
			case FhirPackage.DOCUMENT_MANIFEST__STATUS:
				return getStatus();
			case FhirPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				return getDescription();
			case FhirPackage.DOCUMENT_MANIFEST__CONTENT:
				return getContent();
			case FhirPackage.DOCUMENT_MANIFEST__RELATED:
				return getRelated();
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
			case FhirPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				setMasterIdentifier((Identifier)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__RECIPIENT:
				getRecipient().clear();
				getRecipient().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__SOURCE:
				setSource((Uri)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__STATUS:
				setStatus((DocumentReferenceStatus)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends DocumentManifestContent>)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__RELATED:
				getRelated().clear();
				getRelated().addAll((Collection<? extends DocumentManifestRelated>)newValue);
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
			case FhirPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				setMasterIdentifier((Identifier)null);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DOCUMENT_MANIFEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__RECIPIENT:
				getRecipient().clear();
				return;
			case FhirPackage.DOCUMENT_MANIFEST__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.DOCUMENT_MANIFEST__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__SOURCE:
				setSource((Uri)null);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__STATUS:
				setStatus((DocumentReferenceStatus)null);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DOCUMENT_MANIFEST__CONTENT:
				getContent().clear();
				return;
			case FhirPackage.DOCUMENT_MANIFEST__RELATED:
				getRelated().clear();
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
			case FhirPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				return masterIdentifier != null;
			case FhirPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DOCUMENT_MANIFEST__SUBJECT:
				return subject != null;
			case FhirPackage.DOCUMENT_MANIFEST__RECIPIENT:
				return recipient != null && !recipient.isEmpty();
			case FhirPackage.DOCUMENT_MANIFEST__TYPE:
				return type != null;
			case FhirPackage.DOCUMENT_MANIFEST__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.DOCUMENT_MANIFEST__CREATED:
				return created != null;
			case FhirPackage.DOCUMENT_MANIFEST__SOURCE:
				return source != null;
			case FhirPackage.DOCUMENT_MANIFEST__STATUS:
				return status != null;
			case FhirPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				return description != null;
			case FhirPackage.DOCUMENT_MANIFEST__CONTENT:
				return content != null && !content.isEmpty();
			case FhirPackage.DOCUMENT_MANIFEST__RELATED:
				return related != null && !related.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentManifestImpl
