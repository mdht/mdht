/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ImmunizationVaccinationProtocol;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Vaccination Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationVaccinationProtocolImpl#getDoseSequence <em>Dose Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationVaccinationProtocolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationVaccinationProtocolImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationVaccinationProtocolImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationVaccinationProtocolImpl#getSeriesDoses <em>Series Doses</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationVaccinationProtocolImpl#getDoseTarget <em>Dose Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationVaccinationProtocolImpl#getDoseStatus <em>Dose Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationVaccinationProtocolImpl#getDoseStatusReason <em>Dose Status Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationVaccinationProtocolImpl extends BackboneElementImpl implements ImmunizationVaccinationProtocol {
	/**
	 * The cached value of the '{@link #getDoseSequence() <em>Dose Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt doseSequence;

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
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected Reference authority;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String series;

	/**
	 * The cached value of the '{@link #getSeriesDoses() <em>Series Doses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDoses()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt seriesDoses;

	/**
	 * The cached value of the '{@link #getDoseTarget() <em>Dose Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseTarget()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseTarget;

	/**
	 * The cached value of the '{@link #getDoseStatus() <em>Dose Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseStatus;

	/**
	 * The cached value of the '{@link #getDoseStatusReason() <em>Dose Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseStatusReason;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationVaccinationProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationVaccinationProtocol();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDoseSequence() {
		return doseSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseSequence(PositiveInt newDoseSequence, NotificationChain msgs) {
		PositiveInt oldDoseSequence = doseSequence;
		doseSequence = newDoseSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE, oldDoseSequence, newDoseSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseSequence(PositiveInt newDoseSequence) {
		if (newDoseSequence != doseSequence) {
			NotificationChain msgs = null;
			if (doseSequence != null)
				msgs = ((InternalEObject)doseSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE, null, msgs);
			if (newDoseSequence != null)
				msgs = ((InternalEObject)newDoseSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE, null, msgs);
			msgs = basicSetDoseSequence(newDoseSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE, newDoseSequence, newDoseSequence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthority(Reference newAuthority, NotificationChain msgs) {
		Reference oldAuthority = authority;
		authority = newAuthority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY, oldAuthority, newAuthority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthority(Reference newAuthority) {
		if (newAuthority != authority) {
			NotificationChain msgs = null;
			if (authority != null)
				msgs = ((InternalEObject)authority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY, null, msgs);
			if (newAuthority != null)
				msgs = ((InternalEObject)newAuthority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY, null, msgs);
			msgs = basicSetAuthority(newAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY, newAuthority, newAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(org.hl7.fhir.String newSeries, NotificationChain msgs) {
		org.hl7.fhir.String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES, oldSeries, newSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(org.hl7.fhir.String newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSeriesDoses() {
		return seriesDoses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDoses(PositiveInt newSeriesDoses, NotificationChain msgs) {
		PositiveInt oldSeriesDoses = seriesDoses;
		seriesDoses = newSeriesDoses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES, oldSeriesDoses, newSeriesDoses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesDoses(PositiveInt newSeriesDoses) {
		if (newSeriesDoses != seriesDoses) {
			NotificationChain msgs = null;
			if (seriesDoses != null)
				msgs = ((InternalEObject)seriesDoses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES, null, msgs);
			if (newSeriesDoses != null)
				msgs = ((InternalEObject)newSeriesDoses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES, null, msgs);
			msgs = basicSetSeriesDoses(newSeriesDoses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES, newSeriesDoses, newSeriesDoses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDoseTarget() {
		return doseTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseTarget(CodeableConcept newDoseTarget, NotificationChain msgs) {
		CodeableConcept oldDoseTarget = doseTarget;
		doseTarget = newDoseTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_TARGET, oldDoseTarget, newDoseTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseTarget(CodeableConcept newDoseTarget) {
		if (newDoseTarget != doseTarget) {
			NotificationChain msgs = null;
			if (doseTarget != null)
				msgs = ((InternalEObject)doseTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_TARGET, null, msgs);
			if (newDoseTarget != null)
				msgs = ((InternalEObject)newDoseTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_TARGET, null, msgs);
			msgs = basicSetDoseTarget(newDoseTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_TARGET, newDoseTarget, newDoseTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDoseStatus() {
		return doseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseStatus(CodeableConcept newDoseStatus, NotificationChain msgs) {
		CodeableConcept oldDoseStatus = doseStatus;
		doseStatus = newDoseStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS, oldDoseStatus, newDoseStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseStatus(CodeableConcept newDoseStatus) {
		if (newDoseStatus != doseStatus) {
			NotificationChain msgs = null;
			if (doseStatus != null)
				msgs = ((InternalEObject)doseStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS, null, msgs);
			if (newDoseStatus != null)
				msgs = ((InternalEObject)newDoseStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS, null, msgs);
			msgs = basicSetDoseStatus(newDoseStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS, newDoseStatus, newDoseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDoseStatusReason() {
		return doseStatusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseStatusReason(CodeableConcept newDoseStatusReason, NotificationChain msgs) {
		CodeableConcept oldDoseStatusReason = doseStatusReason;
		doseStatusReason = newDoseStatusReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON, oldDoseStatusReason, newDoseStatusReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseStatusReason(CodeableConcept newDoseStatusReason) {
		if (newDoseStatusReason != doseStatusReason) {
			NotificationChain msgs = null;
			if (doseStatusReason != null)
				msgs = ((InternalEObject)doseStatusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON, null, msgs);
			if (newDoseStatusReason != null)
				msgs = ((InternalEObject)newDoseStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON, null, msgs);
			msgs = basicSetDoseStatusReason(newDoseStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON, newDoseStatusReason, newDoseStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE:
				return basicSetDoseSequence(null, msgs);
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY:
				return basicSetAuthority(null, msgs);
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES:
				return basicSetSeries(null, msgs);
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES:
				return basicSetSeriesDoses(null, msgs);
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_TARGET:
				return basicSetDoseTarget(null, msgs);
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS:
				return basicSetDoseStatus(null, msgs);
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON:
				return basicSetDoseStatusReason(null, msgs);
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
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE:
				return getDoseSequence();
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY:
				return getAuthority();
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES:
				return getSeries();
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES:
				return getSeriesDoses();
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_TARGET:
				return getDoseTarget();
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS:
				return getDoseStatus();
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON:
				return getDoseStatusReason();
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
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE:
				setDoseSequence((PositiveInt)newValue);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY:
				setAuthority((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES:
				setSeries((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES:
				setSeriesDoses((PositiveInt)newValue);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_TARGET:
				setDoseTarget((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS:
				setDoseStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON:
				setDoseStatusReason((CodeableConcept)newValue);
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
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE:
				setDoseSequence((PositiveInt)null);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY:
				setAuthority((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES:
				setSeries((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES:
				setSeriesDoses((PositiveInt)null);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_TARGET:
				setDoseTarget((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS:
				setDoseStatus((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON:
				setDoseStatusReason((CodeableConcept)null);
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
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE:
				return doseSequence != null;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION:
				return description != null;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY:
				return authority != null;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES:
				return series != null;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES:
				return seriesDoses != null;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_TARGET:
				return doseTarget != null;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS:
				return doseStatus != null;
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON:
				return doseStatusReason != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationVaccinationProtocolImpl
