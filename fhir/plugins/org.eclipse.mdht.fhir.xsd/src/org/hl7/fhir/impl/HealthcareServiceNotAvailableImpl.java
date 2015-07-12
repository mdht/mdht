/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healthcare Service Not Available</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceNotAvailableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceNotAvailableImpl#getDuring <em>During</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthcareServiceNotAvailableImpl extends BackboneElementImpl implements HealthcareServiceNotAvailable {
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
	 * The cached value of the '{@link #getDuring() <em>During</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuring()
	 * @generated
	 * @ordered
	 */
	protected Period during;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthcareServiceNotAvailableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getHealthcareServiceNotAvailable();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getDuring() {
		return during;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuring(Period newDuring, NotificationChain msgs) {
		Period oldDuring = during;
		during = newDuring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DURING, oldDuring, newDuring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuring(Period newDuring) {
		if (newDuring != during) {
			NotificationChain msgs = null;
			if (during != null)
				msgs = ((InternalEObject)during).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DURING, null, msgs);
			if (newDuring != null)
				msgs = ((InternalEObject)newDuring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DURING, null, msgs);
			msgs = basicSetDuring(newDuring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DURING, newDuring, newDuring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DURING:
				return basicSetDuring(null, msgs);
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
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DESCRIPTION:
				return getDescription();
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DURING:
				return getDuring();
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
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DURING:
				setDuring((Period)newValue);
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
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DURING:
				setDuring((Period)null);
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
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DESCRIPTION:
				return description != null;
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE__DURING:
				return during != null;
		}
		return super.eIsSet(featureID);
	}

} //HealthcareServiceNotAvailableImpl
