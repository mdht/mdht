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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationProtocol;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Recommendation Recommendation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getVaccineType <em>Vaccine Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getDoseNumber <em>Dose Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getForecastStatus <em>Forecast Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getDateCriterion <em>Date Criterion</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getSupportingImmunization <em>Supporting Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getSupportingPatientInformation <em>Supporting Patient Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationRecommendationRecommendationImpl extends BackboneElementImpl implements ImmunizationRecommendationRecommendation {
	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getVaccineType() <em>Vaccine Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept vaccineType;

	/**
	 * The cached value of the '{@link #getDoseNumber() <em>Dose Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumber()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt doseNumber;

	/**
	 * The cached value of the '{@link #getForecastStatus() <em>Forecast Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept forecastStatus;

	/**
	 * The cached value of the '{@link #getDateCriterion() <em>Date Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationRecommendationDateCriterion> dateCriterion;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ImmunizationRecommendationProtocol protocol;

	/**
	 * The cached value of the '{@link #getSupportingImmunization() <em>Supporting Immunization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingImmunization()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingImmunization;

	/**
	 * The cached value of the '{@link #getSupportingPatientInformation() <em>Supporting Patient Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingPatientInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingPatientInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationRecommendationRecommendationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationRecommendationRecommendation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getVaccineType() {
		return vaccineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVaccineType(CodeableConcept newVaccineType, NotificationChain msgs) {
		CodeableConcept oldVaccineType = vaccineType;
		vaccineType = newVaccineType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_TYPE, oldVaccineType, newVaccineType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaccineType(CodeableConcept newVaccineType) {
		if (newVaccineType != vaccineType) {
			NotificationChain msgs = null;
			if (vaccineType != null)
				msgs = ((InternalEObject)vaccineType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_TYPE, null, msgs);
			if (newVaccineType != null)
				msgs = ((InternalEObject)newVaccineType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_TYPE, null, msgs);
			msgs = basicSetVaccineType(newVaccineType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_TYPE, newVaccineType, newVaccineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDoseNumber() {
		return doseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumber(PositiveInt newDoseNumber, NotificationChain msgs) {
		PositiveInt oldDoseNumber = doseNumber;
		doseNumber = newDoseNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER, oldDoseNumber, newDoseNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseNumber(PositiveInt newDoseNumber) {
		if (newDoseNumber != doseNumber) {
			NotificationChain msgs = null;
			if (doseNumber != null)
				msgs = ((InternalEObject)doseNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER, null, msgs);
			if (newDoseNumber != null)
				msgs = ((InternalEObject)newDoseNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER, null, msgs);
			msgs = basicSetDoseNumber(newDoseNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER, newDoseNumber, newDoseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForecastStatus() {
		return forecastStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecastStatus(CodeableConcept newForecastStatus, NotificationChain msgs) {
		CodeableConcept oldForecastStatus = forecastStatus;
		forecastStatus = newForecastStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, oldForecastStatus, newForecastStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForecastStatus(CodeableConcept newForecastStatus) {
		if (newForecastStatus != forecastStatus) {
			NotificationChain msgs = null;
			if (forecastStatus != null)
				msgs = ((InternalEObject)forecastStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, null, msgs);
			if (newForecastStatus != null)
				msgs = ((InternalEObject)newForecastStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, null, msgs);
			msgs = basicSetForecastStatus(newForecastStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, newForecastStatus, newForecastStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationRecommendationDateCriterion> getDateCriterion() {
		if (dateCriterion == null) {
			dateCriterion = new EObjectContainmentEList<ImmunizationRecommendationDateCriterion>(ImmunizationRecommendationDateCriterion.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION);
		}
		return dateCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationProtocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(ImmunizationRecommendationProtocol newProtocol, NotificationChain msgs) {
		ImmunizationRecommendationProtocol oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL, oldProtocol, newProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ImmunizationRecommendationProtocol newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingImmunization() {
		if (supportingImmunization == null) {
			supportingImmunization = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION);
		}
		return supportingImmunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingPatientInformation() {
		if (supportingPatientInformation == null) {
			supportingPatientInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION);
		}
		return supportingPatientInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_TYPE:
				return basicSetVaccineType(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				return basicSetDoseNumber(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return basicSetForecastStatus(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return ((InternalEList<?>)getDateCriterion()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL:
				return basicSetProtocol(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return ((InternalEList<?>)getSupportingImmunization()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return ((InternalEList<?>)getSupportingPatientInformation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE:
				return getDate();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_TYPE:
				return getVaccineType();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				return getDoseNumber();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return getForecastStatus();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return getDateCriterion();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL:
				return getProtocol();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return getSupportingImmunization();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return getSupportingPatientInformation();
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_TYPE:
				setVaccineType((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				setDoseNumber((PositiveInt)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				setForecastStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				getDateCriterion().clear();
				getDateCriterion().addAll((Collection<? extends ImmunizationRecommendationDateCriterion>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL:
				setProtocol((ImmunizationRecommendationProtocol)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				getSupportingImmunization().clear();
				getSupportingImmunization().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				getSupportingPatientInformation().clear();
				getSupportingPatientInformation().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_TYPE:
				setVaccineType((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				setDoseNumber((PositiveInt)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				setForecastStatus((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				getDateCriterion().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL:
				setProtocol((ImmunizationRecommendationProtocol)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				getSupportingImmunization().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				getSupportingPatientInformation().clear();
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE:
				return date != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_TYPE:
				return vaccineType != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				return doseNumber != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return forecastStatus != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return dateCriterion != null && !dateCriterion.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL:
				return protocol != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return supportingImmunization != null && !supportingImmunization.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return supportingPatientInformation != null && !supportingPatientInformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationRecommendationRecommendationImpl
