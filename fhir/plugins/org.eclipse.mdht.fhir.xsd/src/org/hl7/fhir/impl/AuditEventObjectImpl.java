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

import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventObject;
import org.hl7.fhir.AuditEventObjectLifecycle;
import org.hl7.fhir.AuditEventObjectRole;
import org.hl7.fhir.AuditEventObjectType;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AuditEventObjectImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventObjectImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventObjectImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventObjectImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventObjectImpl#getSensitivity <em>Sensitivity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventObjectImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventObjectImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventObjectImpl extends BackboneElementImpl implements AuditEventObject {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AuditEventObjectType type;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected AuditEventObjectRole role;

	/**
	 * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected AuditEventObjectLifecycle lifecycle;

	/**
	 * The cached value of the '{@link #getSensitivity() <em>Sensitivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivity()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sensitivity;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary query;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventDetail> detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAuditEventObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__REFERENCE, oldReference, newReference);
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
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AuditEventObjectType newType, NotificationChain msgs) {
		AuditEventObjectType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AuditEventObjectType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(AuditEventObjectRole newRole, NotificationChain msgs) {
		AuditEventObjectRole oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(AuditEventObjectRole newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectLifecycle getLifecycle() {
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycle(AuditEventObjectLifecycle newLifecycle, NotificationChain msgs) {
		AuditEventObjectLifecycle oldLifecycle = lifecycle;
		lifecycle = newLifecycle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__LIFECYCLE, oldLifecycle, newLifecycle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycle(AuditEventObjectLifecycle newLifecycle) {
		if (newLifecycle != lifecycle) {
			NotificationChain msgs = null;
			if (lifecycle != null)
				msgs = ((InternalEObject)lifecycle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__LIFECYCLE, null, msgs);
			if (newLifecycle != null)
				msgs = ((InternalEObject)newLifecycle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__LIFECYCLE, null, msgs);
			msgs = basicSetLifecycle(newLifecycle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__LIFECYCLE, newLifecycle, newLifecycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSensitivity() {
		return sensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensitivity(CodeableConcept newSensitivity, NotificationChain msgs) {
		CodeableConcept oldSensitivity = sensitivity;
		sensitivity = newSensitivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__SENSITIVITY, oldSensitivity, newSensitivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensitivity(CodeableConcept newSensitivity) {
		if (newSensitivity != sensitivity) {
			NotificationChain msgs = null;
			if (sensitivity != null)
				msgs = ((InternalEObject)sensitivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__SENSITIVITY, null, msgs);
			if (newSensitivity != null)
				msgs = ((InternalEObject)newSensitivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__SENSITIVITY, null, msgs);
			msgs = basicSetSensitivity(newSensitivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__SENSITIVITY, newSensitivity, newSensitivity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Base64Binary newQuery, NotificationChain msgs) {
		Base64Binary oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__QUERY, oldQuery, newQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(Base64Binary newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__QUERY, null, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_OBJECT__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_OBJECT__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventDetail> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<AuditEventDetail>(AuditEventDetail.class, this, FhirPackage.AUDIT_EVENT_OBJECT__DETAIL);
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.AUDIT_EVENT_OBJECT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.AUDIT_EVENT_OBJECT__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.AUDIT_EVENT_OBJECT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.AUDIT_EVENT_OBJECT__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.AUDIT_EVENT_OBJECT__LIFECYCLE:
				return basicSetLifecycle(null, msgs);
			case FhirPackage.AUDIT_EVENT_OBJECT__SENSITIVITY:
				return basicSetSensitivity(null, msgs);
			case FhirPackage.AUDIT_EVENT_OBJECT__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.AUDIT_EVENT_OBJECT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.AUDIT_EVENT_OBJECT__QUERY:
				return basicSetQuery(null, msgs);
			case FhirPackage.AUDIT_EVENT_OBJECT__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.AUDIT_EVENT_OBJECT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.AUDIT_EVENT_OBJECT__REFERENCE:
				return getReference();
			case FhirPackage.AUDIT_EVENT_OBJECT__TYPE:
				return getType();
			case FhirPackage.AUDIT_EVENT_OBJECT__ROLE:
				return getRole();
			case FhirPackage.AUDIT_EVENT_OBJECT__LIFECYCLE:
				return getLifecycle();
			case FhirPackage.AUDIT_EVENT_OBJECT__SENSITIVITY:
				return getSensitivity();
			case FhirPackage.AUDIT_EVENT_OBJECT__NAME:
				return getName();
			case FhirPackage.AUDIT_EVENT_OBJECT__DESCRIPTION:
				return getDescription();
			case FhirPackage.AUDIT_EVENT_OBJECT__QUERY:
				return getQuery();
			case FhirPackage.AUDIT_EVENT_OBJECT__DETAIL:
				return getDetail();
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
			case FhirPackage.AUDIT_EVENT_OBJECT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__REFERENCE:
				setReference((Reference)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__TYPE:
				setType((AuditEventObjectType)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__ROLE:
				setRole((AuditEventObjectRole)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__LIFECYCLE:
				setLifecycle((AuditEventObjectLifecycle)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__SENSITIVITY:
				setSensitivity((CodeableConcept)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__QUERY:
				setQuery((Base64Binary)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends AuditEventDetail>)newValue);
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
			case FhirPackage.AUDIT_EVENT_OBJECT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__REFERENCE:
				setReference((Reference)null);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__TYPE:
				setType((AuditEventObjectType)null);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__ROLE:
				setRole((AuditEventObjectRole)null);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__LIFECYCLE:
				setLifecycle((AuditEventObjectLifecycle)null);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__SENSITIVITY:
				setSensitivity((CodeableConcept)null);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__QUERY:
				setQuery((Base64Binary)null);
				return;
			case FhirPackage.AUDIT_EVENT_OBJECT__DETAIL:
				getDetail().clear();
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
			case FhirPackage.AUDIT_EVENT_OBJECT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.AUDIT_EVENT_OBJECT__REFERENCE:
				return reference != null;
			case FhirPackage.AUDIT_EVENT_OBJECT__TYPE:
				return type != null;
			case FhirPackage.AUDIT_EVENT_OBJECT__ROLE:
				return role != null;
			case FhirPackage.AUDIT_EVENT_OBJECT__LIFECYCLE:
				return lifecycle != null;
			case FhirPackage.AUDIT_EVENT_OBJECT__SENSITIVITY:
				return sensitivity != null;
			case FhirPackage.AUDIT_EVENT_OBJECT__NAME:
				return name != null;
			case FhirPackage.AUDIT_EVENT_OBJECT__DESCRIPTION:
				return description != null;
			case FhirPackage.AUDIT_EVENT_OBJECT__QUERY:
				return query != null;
			case FhirPackage.AUDIT_EVENT_OBJECT__DETAIL:
				return detail != null && !detail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventObjectImpl
