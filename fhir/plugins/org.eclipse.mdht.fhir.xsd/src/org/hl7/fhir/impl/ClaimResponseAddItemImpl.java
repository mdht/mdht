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

import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication3;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Add Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getFee <em>Fee</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getNoteNumberLinkId <em>Note Number Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseAddItemImpl extends BackboneElementImpl implements ClaimResponseAddItem {
	/**
	 * The cached value of the '{@link #getSequenceLinkId() <em>Sequence Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> sequenceLinkId;

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
	 * The cached value of the '{@link #getNoteNumberLinkId() <em>Note Number Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumberLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumberLinkId;

	/**
	 * The cached value of the '{@link #getAdjudication() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudication()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAdjudication3> adjudication;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseDetail1> detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseAddItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponseAddItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getSequenceLinkId() {
		if (sequenceLinkId == null) {
			sequenceLinkId = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SEQUENCE_LINK_ID);
		}
		return sequenceLinkId;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE, oldService, newService);
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
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE, newService, newService));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE, oldFee, newFee);
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
				msgs = ((InternalEObject)fee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE, null, msgs);
			if (newFee != null)
				msgs = ((InternalEObject)newFee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE, null, msgs);
			msgs = basicSetFee(newFee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE, newFee, newFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getNoteNumberLinkId() {
		if (noteNumberLinkId == null) {
			noteNumberLinkId = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER_LINK_ID);
		}
		return noteNumberLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAdjudication3> getAdjudication() {
		if (adjudication == null) {
			adjudication = new EObjectContainmentEList<ClaimResponseAdjudication3>(ClaimResponseAdjudication3.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION);
		}
		return adjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseDetail1> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<ClaimResponseDetail1>(ClaimResponseDetail1.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL);
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SEQUENCE_LINK_ID:
				return ((InternalEList<?>)getSequenceLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE:
				return basicSetService(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE:
				return basicSetFee(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER_LINK_ID:
				return ((InternalEList<?>)getNoteNumberLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				return ((InternalEList<?>)getAdjudication()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SEQUENCE_LINK_ID:
				return getSequenceLinkId();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE:
				return getService();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE:
				return getFee();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER_LINK_ID:
				return getNoteNumberLinkId();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				return getAdjudication();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL:
				return getDetail();
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SEQUENCE_LINK_ID:
				getSequenceLinkId().clear();
				getSequenceLinkId().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE:
				setService((Coding)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE:
				setFee((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER_LINK_ID:
				getNoteNumberLinkId().clear();
				getNoteNumberLinkId().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				getAdjudication().clear();
				getAdjudication().addAll((Collection<? extends ClaimResponseAdjudication3>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends ClaimResponseDetail1>)newValue);
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SEQUENCE_LINK_ID:
				getSequenceLinkId().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE:
				setService((Coding)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE:
				setFee((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER_LINK_ID:
				getNoteNumberLinkId().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				getAdjudication().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL:
				getDetail().clear();
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SEQUENCE_LINK_ID:
				return sequenceLinkId != null && !sequenceLinkId.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE:
				return service != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE:
				return fee != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER_LINK_ID:
				return noteNumberLinkId != null && !noteNumberLinkId.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				return adjudication != null && !adjudication.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL:
				return detail != null && !detail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseAddItemImpl
