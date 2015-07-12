/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseErrorImpl#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseErrorImpl#getDetailSequenceLinkId <em>Detail Sequence Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseErrorImpl#getSubdetailSequenceLinkId <em>Subdetail Sequence Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseErrorImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseErrorImpl extends BackboneElementImpl implements ClaimResponseError {
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
	 * The cached value of the '{@link #getDetailSequenceLinkId() <em>Detail Sequence Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt detailSequenceLinkId;

	/**
	 * The cached value of the '{@link #getSubdetailSequenceLinkId() <em>Subdetail Sequence Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdetailSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt subdetailSequenceLinkId;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Coding code;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponseError();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID, oldSequenceLinkId, newSequenceLinkId);
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
				msgs = ((InternalEObject)sequenceLinkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID, null, msgs);
			if (newSequenceLinkId != null)
				msgs = ((InternalEObject)newSequenceLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID, null, msgs);
			msgs = basicSetSequenceLinkId(newSequenceLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID, newSequenceLinkId, newSequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDetailSequenceLinkId() {
		return detailSequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailSequenceLinkId(PositiveInt newDetailSequenceLinkId, NotificationChain msgs) {
		PositiveInt oldDetailSequenceLinkId = detailSequenceLinkId;
		detailSequenceLinkId = newDetailSequenceLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID, oldDetailSequenceLinkId, newDetailSequenceLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailSequenceLinkId(PositiveInt newDetailSequenceLinkId) {
		if (newDetailSequenceLinkId != detailSequenceLinkId) {
			NotificationChain msgs = null;
			if (detailSequenceLinkId != null)
				msgs = ((InternalEObject)detailSequenceLinkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID, null, msgs);
			if (newDetailSequenceLinkId != null)
				msgs = ((InternalEObject)newDetailSequenceLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID, null, msgs);
			msgs = basicSetDetailSequenceLinkId(newDetailSequenceLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID, newDetailSequenceLinkId, newDetailSequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSubdetailSequenceLinkId() {
		return subdetailSequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubdetailSequenceLinkId(PositiveInt newSubdetailSequenceLinkId, NotificationChain msgs) {
		PositiveInt oldSubdetailSequenceLinkId = subdetailSequenceLinkId;
		subdetailSequenceLinkId = newSubdetailSequenceLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID, oldSubdetailSequenceLinkId, newSubdetailSequenceLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubdetailSequenceLinkId(PositiveInt newSubdetailSequenceLinkId) {
		if (newSubdetailSequenceLinkId != subdetailSequenceLinkId) {
			NotificationChain msgs = null;
			if (subdetailSequenceLinkId != null)
				msgs = ((InternalEObject)subdetailSequenceLinkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID, null, msgs);
			if (newSubdetailSequenceLinkId != null)
				msgs = ((InternalEObject)newSubdetailSequenceLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID, null, msgs);
			msgs = basicSetSubdetailSequenceLinkId(newSubdetailSequenceLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID, newSubdetailSequenceLinkId, newSubdetailSequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Coding newCode, NotificationChain msgs) {
		Coding oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ERROR__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Coding newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ERROR__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ERROR__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ERROR__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID:
				return basicSetSequenceLinkId(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID:
				return basicSetDetailSequenceLinkId(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID:
				return basicSetSubdetailSequenceLinkId(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ERROR__CODE:
				return basicSetCode(null, msgs);
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
			case FhirPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID:
				return getSequenceLinkId();
			case FhirPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID:
				return getDetailSequenceLinkId();
			case FhirPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID:
				return getSubdetailSequenceLinkId();
			case FhirPackage.CLAIM_RESPONSE_ERROR__CODE:
				return getCode();
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
			case FhirPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID:
				setSequenceLinkId((PositiveInt)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID:
				setDetailSequenceLinkId((PositiveInt)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID:
				setSubdetailSequenceLinkId((PositiveInt)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ERROR__CODE:
				setCode((Coding)newValue);
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
			case FhirPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID:
				setSequenceLinkId((PositiveInt)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID:
				setDetailSequenceLinkId((PositiveInt)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID:
				setSubdetailSequenceLinkId((PositiveInt)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ERROR__CODE:
				setCode((Coding)null);
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
			case FhirPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID:
				return sequenceLinkId != null;
			case FhirPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID:
				return detailSequenceLinkId != null;
			case FhirPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID:
				return subdetailSequenceLinkId != null;
			case FhirPackage.CLAIM_RESPONSE_ERROR__CODE:
				return code != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseErrorImpl
