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
import org.hl7.fhir.ConformanceCertificate;
import org.hl7.fhir.ConformanceSecurity;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSecurityImpl#getCors <em>Cors</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSecurityImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSecurityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSecurityImpl#getCertificate <em>Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceSecurityImpl extends BackboneElementImpl implements ConformanceSecurity {
	/**
	 * The cached value of the '{@link #getCors() <em>Cors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCors()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean cors;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> service;

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
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceCertificate> certificate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceSecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConformanceSecurity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getCors() {
		return cors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCors(org.hl7.fhir.Boolean newCors, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldCors = cors;
		cors = newCors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SECURITY__CORS, oldCors, newCors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCors(org.hl7.fhir.Boolean newCors) {
		if (newCors != cors) {
			NotificationChain msgs = null;
			if (cors != null)
				msgs = ((InternalEObject)cors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SECURITY__CORS, null, msgs);
			if (newCors != null)
				msgs = ((InternalEObject)newCors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SECURITY__CORS, null, msgs);
			msgs = basicSetCors(newCors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SECURITY__CORS, newCors, newCors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONFORMANCE_SECURITY__SERVICE);
		}
		return service;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SECURITY__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SECURITY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SECURITY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SECURITY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceCertificate> getCertificate() {
		if (certificate == null) {
			certificate = new EObjectContainmentEList<ConformanceCertificate>(ConformanceCertificate.class, this, FhirPackage.CONFORMANCE_SECURITY__CERTIFICATE);
		}
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONFORMANCE_SECURITY__CORS:
				return basicSetCors(null, msgs);
			case FhirPackage.CONFORMANCE_SECURITY__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE_SECURITY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.CONFORMANCE_SECURITY__CERTIFICATE:
				return ((InternalEList<?>)getCertificate()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONFORMANCE_SECURITY__CORS:
				return getCors();
			case FhirPackage.CONFORMANCE_SECURITY__SERVICE:
				return getService();
			case FhirPackage.CONFORMANCE_SECURITY__DESCRIPTION:
				return getDescription();
			case FhirPackage.CONFORMANCE_SECURITY__CERTIFICATE:
				return getCertificate();
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
			case FhirPackage.CONFORMANCE_SECURITY__CORS:
				setCors((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONFORMANCE_SECURITY__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONFORMANCE_SECURITY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE_SECURITY__CERTIFICATE:
				getCertificate().clear();
				getCertificate().addAll((Collection<? extends ConformanceCertificate>)newValue);
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
			case FhirPackage.CONFORMANCE_SECURITY__CORS:
				setCors((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CONFORMANCE_SECURITY__SERVICE:
				getService().clear();
				return;
			case FhirPackage.CONFORMANCE_SECURITY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE_SECURITY__CERTIFICATE:
				getCertificate().clear();
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
			case FhirPackage.CONFORMANCE_SECURITY__CORS:
				return cors != null;
			case FhirPackage.CONFORMANCE_SECURITY__SERVICE:
				return service != null && !service.isEmpty();
			case FhirPackage.CONFORMANCE_SECURITY__DESCRIPTION:
				return description != null;
			case FhirPackage.CONFORMANCE_SECURITY__CERTIFICATE:
				return certificate != null && !certificate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformanceSecurityImpl
