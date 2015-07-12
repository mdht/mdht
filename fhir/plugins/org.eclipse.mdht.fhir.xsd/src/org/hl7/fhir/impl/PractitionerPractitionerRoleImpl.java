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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.PractitionerPractitionerRole;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner Practitioner Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PractitionerPractitionerRoleImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerPractitionerRoleImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerPractitionerRoleImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerPractitionerRoleImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerPractitionerRoleImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerPractitionerRoleImpl#getHealthcareService <em>Healthcare Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PractitionerPractitionerRoleImpl extends BackboneElementImpl implements PractitionerPractitionerRole {
	/**
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference managingOrganization;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept role;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialty;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> location;

	/**
	 * The cached value of the '{@link #getHealthcareService() <em>Healthcare Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthcareService()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> healthcareService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PractitionerPractitionerRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPractitionerPractitionerRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getManagingOrganization() {
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagingOrganization(Reference newManagingOrganization, NotificationChain msgs) {
		Reference oldManagingOrganization = managingOrganization;
		managingOrganization = newManagingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION, oldManagingOrganization, newManagingOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagingOrganization(Reference newManagingOrganization) {
		if (newManagingOrganization != managingOrganization) {
			NotificationChain msgs = null;
			if (managingOrganization != null)
				msgs = ((InternalEObject)managingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION, null, msgs);
			if (newManagingOrganization != null)
				msgs = ((InternalEObject)newManagingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION, null, msgs);
			msgs = basicSetManagingOrganization(newManagingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION, newManagingOrganization, newManagingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeableConcept newRole, NotificationChain msgs) {
		CodeableConcept oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(CodeableConcept newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialty() {
		if (specialty == null) {
			specialty = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__SPECIALTY);
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getHealthcareService() {
		if (healthcareService == null) {
			healthcareService = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__HEALTHCARE_SERVICE);
		}
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION:
				return basicSetManagingOrganization(null, msgs);
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__SPECIALTY:
				return ((InternalEList<?>)getSpecialty()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return ((InternalEList<?>)getHealthcareService()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION:
				return getManagingOrganization();
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE:
				return getRole();
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__SPECIALTY:
				return getSpecialty();
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD:
				return getPeriod();
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__LOCATION:
				return getLocation();
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return getHealthcareService();
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
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)newValue);
				return;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__SPECIALTY:
				getSpecialty().clear();
				getSpecialty().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				getHealthcareService().clear();
				getHealthcareService().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)null);
				return;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__SPECIALTY:
				getSpecialty().clear();
				return;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__LOCATION:
				getLocation().clear();
				return;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				getHealthcareService().clear();
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
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE:
				return role != null;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__SPECIALTY:
				return specialty != null && !specialty.isEmpty();
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD:
				return period != null;
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__LOCATION:
				return location != null && !location.isEmpty();
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return healthcareService != null && !healthcareService.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PractitionerPractitionerRoleImpl
