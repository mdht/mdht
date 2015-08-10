/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GroupMemberImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupMemberImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupMemberImpl#getInactive <em>Inactive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupMemberImpl extends BackboneElementImpl implements GroupMember {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Reference entity;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getInactive() <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean inactive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGroupMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Reference newEntity, NotificationChain msgs) {
		Reference oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GROUP_MEMBER__ENTITY, oldEntity, newEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Reference newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GROUP_MEMBER__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GROUP_MEMBER__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GROUP_MEMBER__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GROUP_MEMBER__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GROUP_MEMBER__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GROUP_MEMBER__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GROUP_MEMBER__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getInactive() {
		return inactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInactive(org.hl7.fhir.Boolean newInactive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldInactive = inactive;
		inactive = newInactive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GROUP_MEMBER__INACTIVE, oldInactive, newInactive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInactive(org.hl7.fhir.Boolean newInactive) {
		if (newInactive != inactive) {
			NotificationChain msgs = null;
			if (inactive != null)
				msgs = ((InternalEObject)inactive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GROUP_MEMBER__INACTIVE, null, msgs);
			if (newInactive != null)
				msgs = ((InternalEObject)newInactive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GROUP_MEMBER__INACTIVE, null, msgs);
			msgs = basicSetInactive(newInactive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GROUP_MEMBER__INACTIVE, newInactive, newInactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GROUP_MEMBER__ENTITY:
				return basicSetEntity(null, msgs);
			case FhirPackage.GROUP_MEMBER__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.GROUP_MEMBER__INACTIVE:
				return basicSetInactive(null, msgs);
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
			case FhirPackage.GROUP_MEMBER__ENTITY:
				return getEntity();
			case FhirPackage.GROUP_MEMBER__PERIOD:
				return getPeriod();
			case FhirPackage.GROUP_MEMBER__INACTIVE:
				return getInactive();
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
			case FhirPackage.GROUP_MEMBER__ENTITY:
				setEntity((Reference)newValue);
				return;
			case FhirPackage.GROUP_MEMBER__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.GROUP_MEMBER__INACTIVE:
				setInactive((org.hl7.fhir.Boolean)newValue);
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
			case FhirPackage.GROUP_MEMBER__ENTITY:
				setEntity((Reference)null);
				return;
			case FhirPackage.GROUP_MEMBER__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.GROUP_MEMBER__INACTIVE:
				setInactive((org.hl7.fhir.Boolean)null);
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
			case FhirPackage.GROUP_MEMBER__ENTITY:
				return entity != null;
			case FhirPackage.GROUP_MEMBER__PERIOD:
				return period != null;
			case FhirPackage.GROUP_MEMBER__INACTIVE:
				return inactive != null;
		}
		return super.eIsSet(featureID);
	}

} //GroupMemberImpl
