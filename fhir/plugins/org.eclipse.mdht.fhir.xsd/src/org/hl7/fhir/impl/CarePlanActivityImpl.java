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

import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CarePlanActivityImpl#getActionResulting <em>Action Resulting</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanActivityImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanActivityImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanActivityImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarePlanActivityImpl extends BackboneElementImpl implements CarePlanActivity {
	/**
	 * The cached value of the '{@link #getActionResulting() <em>Action Resulting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionResulting()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> actionResulting;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String notes;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected CarePlanDetail detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCarePlanActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getActionResulting() {
		if (actionResulting == null) {
			actionResulting = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING);
		}
		return actionResulting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(org.hl7.fhir.String newNotes, NotificationChain msgs) {
		org.hl7.fhir.String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__NOTES, oldNotes, newNotes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(org.hl7.fhir.String newNotes) {
		if (newNotes != notes) {
			NotificationChain msgs = null;
			if (notes != null)
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Reference newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanDetail getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(CarePlanDetail newDetail, NotificationChain msgs) {
		CarePlanDetail oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__DETAIL, oldDetail, newDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(CarePlanDetail newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				return ((InternalEList<?>)getActionResulting()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_ACTIVITY__NOTES:
				return basicSetNotes(null, msgs);
			case FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.CARE_PLAN_ACTIVITY__DETAIL:
				return basicSetDetail(null, msgs);
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
			case FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				return getActionResulting();
			case FhirPackage.CARE_PLAN_ACTIVITY__NOTES:
				return getNotes();
			case FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				return getReference();
			case FhirPackage.CARE_PLAN_ACTIVITY__DETAIL:
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
			case FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				getActionResulting().clear();
				getActionResulting().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__NOTES:
				setNotes((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				setReference((Reference)newValue);
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__DETAIL:
				setDetail((CarePlanDetail)newValue);
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
			case FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				getActionResulting().clear();
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__NOTES:
				setNotes((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				setReference((Reference)null);
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__DETAIL:
				setDetail((CarePlanDetail)null);
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
			case FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				return actionResulting != null && !actionResulting.isEmpty();
			case FhirPackage.CARE_PLAN_ACTIVITY__NOTES:
				return notes != null;
			case FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				return reference != null;
			case FhirPackage.CARE_PLAN_ACTIVITY__DETAIL:
				return detail != null;
		}
		return super.eIsSet(featureID);
	}

} //CarePlanActivityImpl
