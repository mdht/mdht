/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Header Destination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderDestinationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderDestinationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderDestinationImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageHeaderDestinationImpl extends BackboneElementImpl implements MessageHeaderDestination {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Reference target;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Uri endpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageHeaderDestinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMessageHeaderDestination();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Reference newTarget, NotificationChain msgs) {
		Reference oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Reference newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(Uri newEndpoint, NotificationChain msgs) {
		Uri oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT, oldEndpoint, newEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(Uri newEndpoint) {
		if (newEndpoint != endpoint) {
			NotificationChain msgs = null;
			if (endpoint != null)
				msgs = ((InternalEObject)endpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT, null, msgs);
			if (newEndpoint != null)
				msgs = ((InternalEObject)newEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT, null, msgs);
			msgs = basicSetEndpoint(newEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT, newEndpoint, newEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MESSAGE_HEADER_DESTINATION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET:
				return basicSetTarget(null, msgs);
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT:
				return basicSetEndpoint(null, msgs);
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
			case FhirPackage.MESSAGE_HEADER_DESTINATION__NAME:
				return getName();
			case FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET:
				return getTarget();
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT:
				return getEndpoint();
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
			case FhirPackage.MESSAGE_HEADER_DESTINATION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET:
				setTarget((Reference)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT:
				setEndpoint((Uri)newValue);
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
			case FhirPackage.MESSAGE_HEADER_DESTINATION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET:
				setTarget((Reference)null);
				return;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT:
				setEndpoint((Uri)null);
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
			case FhirPackage.MESSAGE_HEADER_DESTINATION__NAME:
				return name != null;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__TARGET:
				return target != null;
			case FhirPackage.MESSAGE_HEADER_DESTINATION__ENDPOINT:
				return endpoint != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageHeaderDestinationImpl
