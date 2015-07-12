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

import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healthcare Service Available Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceAvailableTimeImpl#getDaysOfWeek <em>Days Of Week</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceAvailableTimeImpl#getAllDay <em>All Day</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceAvailableTimeImpl#getAvailableStartTime <em>Available Start Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceAvailableTimeImpl#getAvailableEndTime <em>Available End Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthcareServiceAvailableTimeImpl extends BackboneElementImpl implements HealthcareServiceAvailableTime {
	/**
	 * The cached value of the '{@link #getDaysOfWeek() <em>Days Of Week</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysOfWeek()
	 * @generated
	 * @ordered
	 */
	protected EList<DaysOfWeek> daysOfWeek;

	/**
	 * The cached value of the '{@link #getAllDay() <em>All Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllDay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean allDay;

	/**
	 * The cached value of the '{@link #getAvailableStartTime() <em>Available Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableStartTime()
	 * @generated
	 * @ordered
	 */
	protected Time availableStartTime;

	/**
	 * The cached value of the '{@link #getAvailableEndTime() <em>Available End Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableEndTime()
	 * @generated
	 * @ordered
	 */
	protected Time availableEndTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthcareServiceAvailableTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getHealthcareServiceAvailableTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaysOfWeek> getDaysOfWeek() {
		if (daysOfWeek == null) {
			daysOfWeek = new EObjectContainmentEList<DaysOfWeek>(DaysOfWeek.class, this, FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__DAYS_OF_WEEK);
		}
		return daysOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAllDay() {
		return allDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllDay(org.hl7.fhir.Boolean newAllDay, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAllDay = allDay;
		allDay = newAllDay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY, oldAllDay, newAllDay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllDay(org.hl7.fhir.Boolean newAllDay) {
		if (newAllDay != allDay) {
			NotificationChain msgs = null;
			if (allDay != null)
				msgs = ((InternalEObject)allDay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY, null, msgs);
			if (newAllDay != null)
				msgs = ((InternalEObject)newAllDay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY, null, msgs);
			msgs = basicSetAllDay(newAllDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY, newAllDay, newAllDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getAvailableStartTime() {
		return availableStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableStartTime(Time newAvailableStartTime, NotificationChain msgs) {
		Time oldAvailableStartTime = availableStartTime;
		availableStartTime = newAvailableStartTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME, oldAvailableStartTime, newAvailableStartTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableStartTime(Time newAvailableStartTime) {
		if (newAvailableStartTime != availableStartTime) {
			NotificationChain msgs = null;
			if (availableStartTime != null)
				msgs = ((InternalEObject)availableStartTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME, null, msgs);
			if (newAvailableStartTime != null)
				msgs = ((InternalEObject)newAvailableStartTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME, null, msgs);
			msgs = basicSetAvailableStartTime(newAvailableStartTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME, newAvailableStartTime, newAvailableStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getAvailableEndTime() {
		return availableEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableEndTime(Time newAvailableEndTime, NotificationChain msgs) {
		Time oldAvailableEndTime = availableEndTime;
		availableEndTime = newAvailableEndTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME, oldAvailableEndTime, newAvailableEndTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableEndTime(Time newAvailableEndTime) {
		if (newAvailableEndTime != availableEndTime) {
			NotificationChain msgs = null;
			if (availableEndTime != null)
				msgs = ((InternalEObject)availableEndTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME, null, msgs);
			if (newAvailableEndTime != null)
				msgs = ((InternalEObject)newAvailableEndTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME, null, msgs);
			msgs = basicSetAvailableEndTime(newAvailableEndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME, newAvailableEndTime, newAvailableEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__DAYS_OF_WEEK:
				return ((InternalEList<?>)getDaysOfWeek()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY:
				return basicSetAllDay(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				return basicSetAvailableStartTime(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				return basicSetAvailableEndTime(null, msgs);
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
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__DAYS_OF_WEEK:
				return getDaysOfWeek();
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY:
				return getAllDay();
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				return getAvailableStartTime();
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				return getAvailableEndTime();
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
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__DAYS_OF_WEEK:
				getDaysOfWeek().clear();
				getDaysOfWeek().addAll((Collection<? extends DaysOfWeek>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY:
				setAllDay((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				setAvailableStartTime((Time)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				setAvailableEndTime((Time)newValue);
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
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__DAYS_OF_WEEK:
				getDaysOfWeek().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY:
				setAllDay((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				setAvailableStartTime((Time)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				setAvailableEndTime((Time)null);
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
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__DAYS_OF_WEEK:
				return daysOfWeek != null && !daysOfWeek.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY:
				return allDay != null;
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				return availableStartTime != null;
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				return availableEndTime != null;
		}
		return super.eIsSet(featureID);
	}

} //HealthcareServiceAvailableTimeImpl
