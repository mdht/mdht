/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Definition Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionMappingImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionMappingImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionMappingImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureDefinitionMappingImpl extends BackboneElementImpl implements StructureDefinitionMapping {
	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected Id identity;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected Uri uri;

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
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDefinitionMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getStructureDefinitionMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentity(Id newIdentity, NotificationChain msgs) {
		Id oldIdentity = identity;
		identity = newIdentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY, oldIdentity, newIdentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(Id newIdentity) {
		if (newIdentity != identity) {
			NotificationChain msgs = null;
			if (identity != null)
				msgs = ((InternalEObject)identity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY, null, msgs);
			if (newIdentity != null)
				msgs = ((InternalEObject)newIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY, null, msgs);
			msgs = basicSetIdentity(newIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY, newIdentity, newIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUri(Uri newUri, NotificationChain msgs) {
		Uri oldUri = uri;
		uri = newUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION_MAPPING__URI, oldUri, newUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(Uri newUri) {
		if (newUri != uri) {
			NotificationChain msgs = null;
			if (uri != null)
				msgs = ((InternalEObject)uri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION_MAPPING__URI, null, msgs);
			if (newUri != null)
				msgs = ((InternalEObject)newUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION_MAPPING__URI, null, msgs);
			msgs = basicSetUri(newUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION_MAPPING__URI, newUri, newUri));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION_MAPPING__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION_MAPPING__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION_MAPPING__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION_MAPPING__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComments(org.hl7.fhir.String newComments, NotificationChain msgs) {
		org.hl7.fhir.String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS, oldComments, newComments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(org.hl7.fhir.String newComments) {
		if (newComments != comments) {
			NotificationChain msgs = null;
			if (comments != null)
				msgs = ((InternalEObject)comments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS, null, msgs);
			if (newComments != null)
				msgs = ((InternalEObject)newComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS, null, msgs);
			msgs = basicSetComments(newComments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS, newComments, newComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY:
				return basicSetIdentity(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__URI:
				return basicSetUri(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS:
				return basicSetComments(null, msgs);
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
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY:
				return getIdentity();
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__URI:
				return getUri();
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__NAME:
				return getName();
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS:
				return getComments();
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
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY:
				setIdentity((Id)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__URI:
				setUri((Uri)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS:
				setComments((org.hl7.fhir.String)newValue);
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
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY:
				setIdentity((Id)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__URI:
				setUri((Uri)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS:
				setComments((org.hl7.fhir.String)null);
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
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY:
				return identity != null;
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__URI:
				return uri != null;
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__NAME:
				return name != null;
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS:
				return comments != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureDefinitionMappingImpl
