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

import org.hl7.fhir.AuditEventNetwork;
import org.hl7.fhir.AuditEventParticipant;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AuditEventParticipantImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventParticipantImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventParticipantImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventParticipantImpl#getAltId <em>Alt Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventParticipantImpl#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventParticipantImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventParticipantImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventParticipantImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventParticipantImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventParticipantImpl#getPurposeOfUse <em>Purpose Of Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventParticipantImpl extends BackboneElementImpl implements AuditEventParticipant {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> role;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String userId;

	/**
	 * The cached value of the '{@link #getAltId() <em>Alt Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String altId;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getRequestor() <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestor()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean requestor;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> policy;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected Coding media;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected AuditEventNetwork network;

	/**
	 * The cached value of the '{@link #getPurposeOfUse() <em>Purpose Of Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeOfUse()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> purposeOfUse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAuditEventParticipant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.AUDIT_EVENT_PARTICIPANT__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Reference newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserId(org.hl7.fhir.String newUserId, NotificationChain msgs) {
		org.hl7.fhir.String oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__USER_ID, oldUserId, newUserId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(org.hl7.fhir.String newUserId) {
		if (newUserId != userId) {
			NotificationChain msgs = null;
			if (userId != null)
				msgs = ((InternalEObject)userId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__USER_ID, null, msgs);
			if (newUserId != null)
				msgs = ((InternalEObject)newUserId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__USER_ID, null, msgs);
			msgs = basicSetUserId(newUserId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__USER_ID, newUserId, newUserId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAltId() {
		return altId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltId(org.hl7.fhir.String newAltId, NotificationChain msgs) {
		org.hl7.fhir.String oldAltId = altId;
		altId = newAltId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__ALT_ID, oldAltId, newAltId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltId(org.hl7.fhir.String newAltId) {
		if (newAltId != altId) {
			NotificationChain msgs = null;
			if (altId != null)
				msgs = ((InternalEObject)altId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__ALT_ID, null, msgs);
			if (newAltId != null)
				msgs = ((InternalEObject)newAltId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__ALT_ID, null, msgs);
			msgs = basicSetAltId(newAltId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__ALT_ID, newAltId, newAltId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRequestor() {
		return requestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestor(org.hl7.fhir.Boolean newRequestor, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRequestor = requestor;
		requestor = newRequestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR, oldRequestor, newRequestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestor(org.hl7.fhir.Boolean newRequestor) {
		if (newRequestor != requestor) {
			NotificationChain msgs = null;
			if (requestor != null)
				msgs = ((InternalEObject)requestor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR, null, msgs);
			if (newRequestor != null)
				msgs = ((InternalEObject)newRequestor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR, null, msgs);
			msgs = basicSetRequestor(newRequestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR, newRequestor, newRequestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getPolicy() {
		if (policy == null) {
			policy = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.AUDIT_EVENT_PARTICIPANT__POLICY);
		}
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getMedia() {
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedia(Coding newMedia, NotificationChain msgs) {
		Coding oldMedia = media;
		media = newMedia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__MEDIA, oldMedia, newMedia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(Coding newMedia) {
		if (newMedia != media) {
			NotificationChain msgs = null;
			if (media != null)
				msgs = ((InternalEObject)media).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__MEDIA, null, msgs);
			if (newMedia != null)
				msgs = ((InternalEObject)newMedia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__MEDIA, null, msgs);
			msgs = basicSetMedia(newMedia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__MEDIA, newMedia, newMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventNetwork getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(AuditEventNetwork newNetwork, NotificationChain msgs) {
		AuditEventNetwork oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__NETWORK, oldNetwork, newNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(AuditEventNetwork newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_PARTICIPANT__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_PARTICIPANT__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getPurposeOfUse() {
		if (purposeOfUse == null) {
			purposeOfUse = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.AUDIT_EVENT_PARTICIPANT__PURPOSE_OF_USE);
		}
		return purposeOfUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__USER_ID:
				return basicSetUserId(null, msgs);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__ALT_ID:
				return basicSetAltId(null, msgs);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR:
				return basicSetRequestor(null, msgs);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__MEDIA:
				return basicSetMedia(null, msgs);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__NETWORK:
				return basicSetNetwork(null, msgs);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__PURPOSE_OF_USE:
				return ((InternalEList<?>)getPurposeOfUse()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__ROLE:
				return getRole();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__REFERENCE:
				return getReference();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__USER_ID:
				return getUserId();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__ALT_ID:
				return getAltId();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__NAME:
				return getName();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR:
				return getRequestor();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__LOCATION:
				return getLocation();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__POLICY:
				return getPolicy();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__MEDIA:
				return getMedia();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__NETWORK:
				return getNetwork();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__PURPOSE_OF_USE:
				return getPurposeOfUse();
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
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__REFERENCE:
				setReference((Reference)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__USER_ID:
				setUserId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__ALT_ID:
				setAltId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR:
				setRequestor((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__MEDIA:
				setMedia((Coding)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__NETWORK:
				setNetwork((AuditEventNetwork)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__PURPOSE_OF_USE:
				getPurposeOfUse().clear();
				getPurposeOfUse().addAll((Collection<? extends Coding>)newValue);
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
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__ROLE:
				getRole().clear();
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__REFERENCE:
				setReference((Reference)null);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__USER_ID:
				setUserId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__ALT_ID:
				setAltId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR:
				setRequestor((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__POLICY:
				getPolicy().clear();
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__MEDIA:
				setMedia((Coding)null);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__NETWORK:
				setNetwork((AuditEventNetwork)null);
				return;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__PURPOSE_OF_USE:
				getPurposeOfUse().clear();
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
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__ROLE:
				return role != null && !role.isEmpty();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__REFERENCE:
				return reference != null;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__USER_ID:
				return userId != null;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__ALT_ID:
				return altId != null;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__NAME:
				return name != null;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR:
				return requestor != null;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__LOCATION:
				return location != null;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__POLICY:
				return policy != null && !policy.isEmpty();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__MEDIA:
				return media != null;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__NETWORK:
				return network != null;
			case FhirPackage.AUDIT_EVENT_PARTICIPANT__PURPOSE_OF_USE:
				return purposeOfUse != null && !purposeOfUse.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventParticipantImpl
