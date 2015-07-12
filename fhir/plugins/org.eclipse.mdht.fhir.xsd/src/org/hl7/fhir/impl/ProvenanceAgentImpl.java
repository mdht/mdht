/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getReferenceUri <em>Reference Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getReferenceReference <em>Reference Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvenanceAgentImpl extends BackboneElementImpl implements ProvenanceAgent {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Coding role;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getReferenceUri() <em>Reference Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceUri()
	 * @generated
	 * @ordered
	 */
	protected Uri referenceUri;

	/**
	 * The cached value of the '{@link #getReferenceReference() <em>Reference Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference referenceReference;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String display;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProvenanceAgent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Coding newRole, NotificationChain msgs) {
		Coding oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Coding newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getReferenceUri() {
		return referenceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceUri(Uri newReferenceUri, NotificationChain msgs) {
		Uri oldReferenceUri = referenceUri;
		referenceUri = newReferenceUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__REFERENCE_URI, oldReferenceUri, newReferenceUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceUri(Uri newReferenceUri) {
		if (newReferenceUri != referenceUri) {
			NotificationChain msgs = null;
			if (referenceUri != null)
				msgs = ((InternalEObject)referenceUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__REFERENCE_URI, null, msgs);
			if (newReferenceUri != null)
				msgs = ((InternalEObject)newReferenceUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__REFERENCE_URI, null, msgs);
			msgs = basicSetReferenceUri(newReferenceUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__REFERENCE_URI, newReferenceUri, newReferenceUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferenceReference() {
		return referenceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceReference(Reference newReferenceReference, NotificationChain msgs) {
		Reference oldReferenceReference = referenceReference;
		referenceReference = newReferenceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__REFERENCE_REFERENCE, oldReferenceReference, newReferenceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceReference(Reference newReferenceReference) {
		if (newReferenceReference != referenceReference) {
			NotificationChain msgs = null;
			if (referenceReference != null)
				msgs = ((InternalEObject)referenceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__REFERENCE_REFERENCE, null, msgs);
			if (newReferenceReference != null)
				msgs = ((InternalEObject)newReferenceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__REFERENCE_REFERENCE, null, msgs);
			msgs = basicSetReferenceReference(newReferenceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__REFERENCE_REFERENCE, newReferenceReference, newReferenceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.hl7.fhir.String newDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__DISPLAY, oldDisplay, newDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.hl7.fhir.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__REFERENCE_URI:
				return basicSetReferenceUri(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__REFERENCE_REFERENCE:
				return basicSetReferenceReference(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__DISPLAY:
				return basicSetDisplay(null, msgs);
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
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return getRole();
			case FhirPackage.PROVENANCE_AGENT__TYPE:
				return getType();
			case FhirPackage.PROVENANCE_AGENT__REFERENCE_URI:
				return getReferenceUri();
			case FhirPackage.PROVENANCE_AGENT__REFERENCE_REFERENCE:
				return getReferenceReference();
			case FhirPackage.PROVENANCE_AGENT__DISPLAY:
				return getDisplay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				setRole((Coding)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__REFERENCE_URI:
				setReferenceUri((Uri)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__REFERENCE_REFERENCE:
				setReferenceReference((Reference)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__DISPLAY:
				setDisplay((org.hl7.fhir.String)newValue);
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
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				setRole((Coding)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__REFERENCE_URI:
				setReferenceUri((Uri)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__REFERENCE_REFERENCE:
				setReferenceReference((Reference)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__DISPLAY:
				setDisplay((org.hl7.fhir.String)null);
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
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return role != null;
			case FhirPackage.PROVENANCE_AGENT__TYPE:
				return type != null;
			case FhirPackage.PROVENANCE_AGENT__REFERENCE_URI:
				return referenceUri != null;
			case FhirPackage.PROVENANCE_AGENT__REFERENCE_REFERENCE:
				return referenceReference != null;
			case FhirPackage.PROVENANCE_AGENT__DISPLAY:
				return display != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceAgentImpl
