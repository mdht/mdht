/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ImmunizationRecommendationProtocol;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Recommendation Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationProtocolImpl#getDoseSequence <em>Dose Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationProtocolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationProtocolImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationProtocolImpl#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationRecommendationProtocolImpl extends BackboneElementImpl implements ImmunizationRecommendationProtocol {
	/**
	 * The cached value of the '{@link #getDoseSequence() <em>Dose Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseSequence()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer doseSequence;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationRecommendationProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationRecommendationProtocol();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getDoseSequence() {
		return doseSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseSequence(org.hl7.fhir.Integer newDoseSequence, NotificationChain msgs) {
		org.hl7.fhir.Integer oldDoseSequence = doseSequence;
		doseSequence = newDoseSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE, oldDoseSequence, newDoseSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseSequence(org.hl7.fhir.Integer newDoseSequence) {
		if (newDoseSequence != doseSequence) {
			NotificationChain msgs = null;
			if (doseSequence != null)
				msgs = ((InternalEObject)doseSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE, null, msgs);
			if (newDoseSequence != null)
				msgs = ((InternalEObject)newDoseSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE, null, msgs);
			msgs = basicSetDoseSequence(newDoseSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE, newDoseSequence, newDoseSequence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__AUTHORITY, oldAuthority, newAuthority);
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
				msgs = ((InternalEObject)authority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__AUTHORITY, null, msgs);
			if (newAuthority != null)
				msgs = ((InternalEObject)newAuthority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__AUTHORITY, null, msgs);
			msgs = basicSetAuthority(newAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__AUTHORITY, newAuthority, newAuthority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__SERIES, oldSeries, newSeries);
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
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE:
				return basicSetDoseSequence(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__AUTHORITY:
				return basicSetAuthority(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__SERIES:
				return basicSetSeries(null, msgs);
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE:
				return getDoseSequence();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__AUTHORITY:
				return getAuthority();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__SERIES:
				return getSeries();
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE:
				setDoseSequence((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__AUTHORITY:
				setAuthority((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__SERIES:
				setSeries((org.hl7.fhir.String)newValue);
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE:
				setDoseSequence((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__AUTHORITY:
				setAuthority((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__SERIES:
				setSeries((org.hl7.fhir.String)null);
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE:
				return doseSequence != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__DESCRIPTION:
				return description != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__AUTHORITY:
				return authority != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL__SERIES:
				return series != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationRecommendationProtocolImpl
