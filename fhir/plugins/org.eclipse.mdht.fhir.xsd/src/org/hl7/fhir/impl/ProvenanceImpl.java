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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Period;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Signature;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceImpl#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvenanceImpl extends DomainResourceImpl implements Provenance {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> target;

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
	 * The cached value of the '{@link #getRecorded() <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded()
	 * @generated
	 * @ordered
	 */
	protected Instant recorded;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> policy;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvenanceAgent> agent;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvenanceEntity> entity;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> signature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProvenance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROVENANCE__TARGET);
		}
		return target;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getRecorded() {
		return recorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorded(Instant newRecorded, NotificationChain msgs) {
		Instant oldRecorded = recorded;
		recorded = newRecorded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE__RECORDED, oldRecorded, newRecorded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorded(Instant newRecorded) {
		if (newRecorded != recorded) {
			NotificationChain msgs = null;
			if (recorded != null)
				msgs = ((InternalEObject)recorded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE__RECORDED, null, msgs);
			if (newRecorded != null)
				msgs = ((InternalEObject)newRecorded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE__RECORDED, null, msgs);
			msgs = basicSetRecorded(newRecorded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE__RECORDED, newRecorded, newRecorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(CodeableConcept newReason, NotificationChain msgs) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(CodeableConcept newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getPolicy() {
		if (policy == null) {
			policy = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.PROVENANCE__POLICY);
		}
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvenanceAgent> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<ProvenanceAgent>(ProvenanceAgent.class, this, FhirPackage.PROVENANCE__AGENT);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvenanceEntity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<ProvenanceEntity>(ProvenanceEntity.class, this, FhirPackage.PROVENANCE__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getSignature() {
		if (signature == null) {
			signature = new EObjectContainmentEList<Signature>(Signature.class, this, FhirPackage.PROVENANCE__SIGNATURE);
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROVENANCE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROVENANCE__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.PROVENANCE__RECORDED:
				return basicSetRecorded(null, msgs);
			case FhirPackage.PROVENANCE__REASON:
				return basicSetReason(null, msgs);
			case FhirPackage.PROVENANCE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.PROVENANCE__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROVENANCE__AGENT:
				return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROVENANCE__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROVENANCE__SIGNATURE:
				return ((InternalEList<?>)getSignature()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PROVENANCE__TARGET:
				return getTarget();
			case FhirPackage.PROVENANCE__PERIOD:
				return getPeriod();
			case FhirPackage.PROVENANCE__RECORDED:
				return getRecorded();
			case FhirPackage.PROVENANCE__REASON:
				return getReason();
			case FhirPackage.PROVENANCE__LOCATION:
				return getLocation();
			case FhirPackage.PROVENANCE__POLICY:
				return getPolicy();
			case FhirPackage.PROVENANCE__AGENT:
				return getAgent();
			case FhirPackage.PROVENANCE__ENTITY:
				return getEntity();
			case FhirPackage.PROVENANCE__SIGNATURE:
				return getSignature();
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
			case FhirPackage.PROVENANCE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROVENANCE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.PROVENANCE__RECORDED:
				setRecorded((Instant)newValue);
				return;
			case FhirPackage.PROVENANCE__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case FhirPackage.PROVENANCE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.PROVENANCE__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.PROVENANCE__AGENT:
				getAgent().clear();
				getAgent().addAll((Collection<? extends ProvenanceAgent>)newValue);
				return;
			case FhirPackage.PROVENANCE__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends ProvenanceEntity>)newValue);
				return;
			case FhirPackage.PROVENANCE__SIGNATURE:
				getSignature().clear();
				getSignature().addAll((Collection<? extends Signature>)newValue);
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
			case FhirPackage.PROVENANCE__TARGET:
				getTarget().clear();
				return;
			case FhirPackage.PROVENANCE__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.PROVENANCE__RECORDED:
				setRecorded((Instant)null);
				return;
			case FhirPackage.PROVENANCE__REASON:
				setReason((CodeableConcept)null);
				return;
			case FhirPackage.PROVENANCE__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.PROVENANCE__POLICY:
				getPolicy().clear();
				return;
			case FhirPackage.PROVENANCE__AGENT:
				getAgent().clear();
				return;
			case FhirPackage.PROVENANCE__ENTITY:
				getEntity().clear();
				return;
			case FhirPackage.PROVENANCE__SIGNATURE:
				getSignature().clear();
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
			case FhirPackage.PROVENANCE__TARGET:
				return target != null && !target.isEmpty();
			case FhirPackage.PROVENANCE__PERIOD:
				return period != null;
			case FhirPackage.PROVENANCE__RECORDED:
				return recorded != null;
			case FhirPackage.PROVENANCE__REASON:
				return reason != null;
			case FhirPackage.PROVENANCE__LOCATION:
				return location != null;
			case FhirPackage.PROVENANCE__POLICY:
				return policy != null && !policy.isEmpty();
			case FhirPackage.PROVENANCE__AGENT:
				return agent != null && !agent.isEmpty();
			case FhirPackage.PROVENANCE__ENTITY:
				return entity != null && !entity.isEmpty();
			case FhirPackage.PROVENANCE__SIGNATURE:
				return signature != null && !signature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceImpl
