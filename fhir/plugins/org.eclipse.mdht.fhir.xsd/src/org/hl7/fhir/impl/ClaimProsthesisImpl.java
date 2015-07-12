/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ClaimProsthesis;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Prosthesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimProsthesisImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimProsthesisImpl#getPriorDate <em>Prior Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimProsthesisImpl#getPriorMaterial <em>Prior Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimProsthesisImpl extends BackboneElementImpl implements ClaimProsthesis {
	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean initial;

	/**
	 * The cached value of the '{@link #getPriorDate() <em>Prior Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorDate()
	 * @generated
	 * @ordered
	 */
	protected Date priorDate;

	/**
	 * The cached value of the '{@link #getPriorMaterial() <em>Prior Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorMaterial()
	 * @generated
	 * @ordered
	 */
	protected Coding priorMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimProsthesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimProsthesis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitial(org.hl7.fhir.Boolean newInitial, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROSTHESIS__INITIAL, oldInitial, newInitial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(org.hl7.fhir.Boolean newInitial) {
		if (newInitial != initial) {
			NotificationChain msgs = null;
			if (initial != null)
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROSTHESIS__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROSTHESIS__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROSTHESIS__INITIAL, newInitial, newInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPriorDate() {
		return priorDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorDate(Date newPriorDate, NotificationChain msgs) {
		Date oldPriorDate = priorDate;
		priorDate = newPriorDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROSTHESIS__PRIOR_DATE, oldPriorDate, newPriorDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorDate(Date newPriorDate) {
		if (newPriorDate != priorDate) {
			NotificationChain msgs = null;
			if (priorDate != null)
				msgs = ((InternalEObject)priorDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROSTHESIS__PRIOR_DATE, null, msgs);
			if (newPriorDate != null)
				msgs = ((InternalEObject)newPriorDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROSTHESIS__PRIOR_DATE, null, msgs);
			msgs = basicSetPriorDate(newPriorDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROSTHESIS__PRIOR_DATE, newPriorDate, newPriorDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPriorMaterial() {
		return priorMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorMaterial(Coding newPriorMaterial, NotificationChain msgs) {
		Coding oldPriorMaterial = priorMaterial;
		priorMaterial = newPriorMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROSTHESIS__PRIOR_MATERIAL, oldPriorMaterial, newPriorMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorMaterial(Coding newPriorMaterial) {
		if (newPriorMaterial != priorMaterial) {
			NotificationChain msgs = null;
			if (priorMaterial != null)
				msgs = ((InternalEObject)priorMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROSTHESIS__PRIOR_MATERIAL, null, msgs);
			if (newPriorMaterial != null)
				msgs = ((InternalEObject)newPriorMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROSTHESIS__PRIOR_MATERIAL, null, msgs);
			msgs = basicSetPriorMaterial(newPriorMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROSTHESIS__PRIOR_MATERIAL, newPriorMaterial, newPriorMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_PROSTHESIS__INITIAL:
				return basicSetInitial(null, msgs);
			case FhirPackage.CLAIM_PROSTHESIS__PRIOR_DATE:
				return basicSetPriorDate(null, msgs);
			case FhirPackage.CLAIM_PROSTHESIS__PRIOR_MATERIAL:
				return basicSetPriorMaterial(null, msgs);
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
			case FhirPackage.CLAIM_PROSTHESIS__INITIAL:
				return getInitial();
			case FhirPackage.CLAIM_PROSTHESIS__PRIOR_DATE:
				return getPriorDate();
			case FhirPackage.CLAIM_PROSTHESIS__PRIOR_MATERIAL:
				return getPriorMaterial();
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
			case FhirPackage.CLAIM_PROSTHESIS__INITIAL:
				setInitial((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CLAIM_PROSTHESIS__PRIOR_DATE:
				setPriorDate((Date)newValue);
				return;
			case FhirPackage.CLAIM_PROSTHESIS__PRIOR_MATERIAL:
				setPriorMaterial((Coding)newValue);
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
			case FhirPackage.CLAIM_PROSTHESIS__INITIAL:
				setInitial((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CLAIM_PROSTHESIS__PRIOR_DATE:
				setPriorDate((Date)null);
				return;
			case FhirPackage.CLAIM_PROSTHESIS__PRIOR_MATERIAL:
				setPriorMaterial((Coding)null);
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
			case FhirPackage.CLAIM_PROSTHESIS__INITIAL:
				return initial != null;
			case FhirPackage.CLAIM_PROSTHESIS__PRIOR_DATE:
				return priorDate != null;
			case FhirPackage.CLAIM_PROSTHESIS__PRIOR_MATERIAL:
				return priorMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimProsthesisImpl
