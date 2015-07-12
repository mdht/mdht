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

import org.hl7.fhir.ClaimResponseAdjudication4;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Detail1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseDetail1Impl#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseDetail1Impl#getFee <em>Fee</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseDetail1Impl#getAdjudication <em>Adjudication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseDetail1Impl extends BackboneElementImpl implements ClaimResponseDetail1 {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Coding service;

	/**
	 * The cached value of the '{@link #getFee() <em>Fee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFee()
	 * @generated
	 * @ordered
	 */
	protected Money fee;

	/**
	 * The cached value of the '{@link #getAdjudication() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudication()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAdjudication4> adjudication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseDetail1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponseDetail1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Coding newService, NotificationChain msgs) {
		Coding oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_DETAIL1__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Coding newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_DETAIL1__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_DETAIL1__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_DETAIL1__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getFee() {
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFee(Money newFee, NotificationChain msgs) {
		Money oldFee = fee;
		fee = newFee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_DETAIL1__FEE, oldFee, newFee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFee(Money newFee) {
		if (newFee != fee) {
			NotificationChain msgs = null;
			if (fee != null)
				msgs = ((InternalEObject)fee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_DETAIL1__FEE, null, msgs);
			if (newFee != null)
				msgs = ((InternalEObject)newFee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_DETAIL1__FEE, null, msgs);
			msgs = basicSetFee(newFee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_DETAIL1__FEE, newFee, newFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAdjudication4> getAdjudication() {
		if (adjudication == null) {
			adjudication = new EObjectContainmentEList<ClaimResponseAdjudication4>(ClaimResponseAdjudication4.class, this, FhirPackage.CLAIM_RESPONSE_DETAIL1__ADJUDICATION);
		}
		return adjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__SERVICE:
				return basicSetService(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__FEE:
				return basicSetFee(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__ADJUDICATION:
				return ((InternalEList<?>)getAdjudication()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__SERVICE:
				return getService();
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__FEE:
				return getFee();
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__ADJUDICATION:
				return getAdjudication();
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
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__SERVICE:
				setService((Coding)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__FEE:
				setFee((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__ADJUDICATION:
				getAdjudication().clear();
				getAdjudication().addAll((Collection<? extends ClaimResponseAdjudication4>)newValue);
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
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__SERVICE:
				setService((Coding)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__FEE:
				setFee((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__ADJUDICATION:
				getAdjudication().clear();
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
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__SERVICE:
				return service != null;
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__FEE:
				return fee != null;
			case FhirPackage.CLAIM_RESPONSE_DETAIL1__ADJUDICATION:
				return adjudication != null && !adjudication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseDetail1Impl
