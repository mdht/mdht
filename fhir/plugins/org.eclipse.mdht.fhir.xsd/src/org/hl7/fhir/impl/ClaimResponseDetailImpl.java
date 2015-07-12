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

import org.hl7.fhir.ClaimResponseAdjudication1;
import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.ClaimResponseSubDetail;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseDetailImpl#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseDetailImpl#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseDetailImpl#getSubDetail <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseDetailImpl extends BackboneElementImpl implements ClaimResponseDetail {
	/**
	 * The cached value of the '{@link #getSequenceLinkId() <em>Sequence Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequenceLinkId;

	/**
	 * The cached value of the '{@link #getAdjudication() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudication()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAdjudication1> adjudication;

	/**
	 * The cached value of the '{@link #getSubDetail() <em>Sub Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseSubDetail> subDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponseDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequenceLinkId() {
		return sequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceLinkId(PositiveInt newSequenceLinkId, NotificationChain msgs) {
		PositiveInt oldSequenceLinkId = sequenceLinkId;
		sequenceLinkId = newSequenceLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_DETAIL__SEQUENCE_LINK_ID, oldSequenceLinkId, newSequenceLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceLinkId(PositiveInt newSequenceLinkId) {
		if (newSequenceLinkId != sequenceLinkId) {
			NotificationChain msgs = null;
			if (sequenceLinkId != null)
				msgs = ((InternalEObject)sequenceLinkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_DETAIL__SEQUENCE_LINK_ID, null, msgs);
			if (newSequenceLinkId != null)
				msgs = ((InternalEObject)newSequenceLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_DETAIL__SEQUENCE_LINK_ID, null, msgs);
			msgs = basicSetSequenceLinkId(newSequenceLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_DETAIL__SEQUENCE_LINK_ID, newSequenceLinkId, newSequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAdjudication1> getAdjudication() {
		if (adjudication == null) {
			adjudication = new EObjectContainmentEList<ClaimResponseAdjudication1>(ClaimResponseAdjudication1.class, this, FhirPackage.CLAIM_RESPONSE_DETAIL__ADJUDICATION);
		}
		return adjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseSubDetail> getSubDetail() {
		if (subDetail == null) {
			subDetail = new EObjectContainmentEList<ClaimResponseSubDetail>(ClaimResponseSubDetail.class, this, FhirPackage.CLAIM_RESPONSE_DETAIL__SUB_DETAIL);
		}
		return subDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE_DETAIL__SEQUENCE_LINK_ID:
				return basicSetSequenceLinkId(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_DETAIL__ADJUDICATION:
				return ((InternalEList<?>)getAdjudication()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_DETAIL__SUB_DETAIL:
				return ((InternalEList<?>)getSubDetail()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM_RESPONSE_DETAIL__SEQUENCE_LINK_ID:
				return getSequenceLinkId();
			case FhirPackage.CLAIM_RESPONSE_DETAIL__ADJUDICATION:
				return getAdjudication();
			case FhirPackage.CLAIM_RESPONSE_DETAIL__SUB_DETAIL:
				return getSubDetail();
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
			case FhirPackage.CLAIM_RESPONSE_DETAIL__SEQUENCE_LINK_ID:
				setSequenceLinkId((PositiveInt)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_DETAIL__ADJUDICATION:
				getAdjudication().clear();
				getAdjudication().addAll((Collection<? extends ClaimResponseAdjudication1>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_DETAIL__SUB_DETAIL:
				getSubDetail().clear();
				getSubDetail().addAll((Collection<? extends ClaimResponseSubDetail>)newValue);
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
			case FhirPackage.CLAIM_RESPONSE_DETAIL__SEQUENCE_LINK_ID:
				setSequenceLinkId((PositiveInt)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_DETAIL__ADJUDICATION:
				getAdjudication().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_DETAIL__SUB_DETAIL:
				getSubDetail().clear();
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
			case FhirPackage.CLAIM_RESPONSE_DETAIL__SEQUENCE_LINK_ID:
				return sequenceLinkId != null;
			case FhirPackage.CLAIM_RESPONSE_DETAIL__ADJUDICATION:
				return adjudication != null && !adjudication.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_DETAIL__SUB_DETAIL:
				return subDetail != null && !subDetail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseDetailImpl
