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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Schedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getPlanningHorizon <em>Planning Horizon</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends DomainResourceImpl implements Schedule {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Reference actor;

	/**
	 * The cached value of the '{@link #getPlanningHorizon() <em>Planning Horizon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningHorizon()
	 * @generated
	 * @ordered
	 */
	protected Period planningHorizon;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.SCHEDULE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SCHEDULE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActor(Reference newActor, NotificationChain msgs) {
		Reference oldActor = actor;
		actor = newActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__ACTOR, oldActor, newActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Reference newActor) {
		if (newActor != actor) {
			NotificationChain msgs = null;
			if (actor != null)
				msgs = ((InternalEObject)actor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__ACTOR, null, msgs);
			if (newActor != null)
				msgs = ((InternalEObject)newActor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__ACTOR, null, msgs);
			msgs = basicSetActor(newActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__ACTOR, newActor, newActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPlanningHorizon() {
		return planningHorizon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanningHorizon(Period newPlanningHorizon, NotificationChain msgs) {
		Period oldPlanningHorizon = planningHorizon;
		planningHorizon = newPlanningHorizon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__PLANNING_HORIZON, oldPlanningHorizon, newPlanningHorizon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanningHorizon(Period newPlanningHorizon) {
		if (newPlanningHorizon != planningHorizon) {
			NotificationChain msgs = null;
			if (planningHorizon != null)
				msgs = ((InternalEObject)planningHorizon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__PLANNING_HORIZON, null, msgs);
			if (newPlanningHorizon != null)
				msgs = ((InternalEObject)newPlanningHorizon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__PLANNING_HORIZON, null, msgs);
			msgs = basicSetPlanningHorizon(newPlanningHorizon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__PLANNING_HORIZON, newPlanningHorizon, newPlanningHorizon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SCHEDULE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SCHEDULE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.SCHEDULE__ACTOR:
				return basicSetActor(null, msgs);
			case FhirPackage.SCHEDULE__PLANNING_HORIZON:
				return basicSetPlanningHorizon(null, msgs);
			case FhirPackage.SCHEDULE__COMMENT:
				return basicSetComment(null, msgs);
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
			case FhirPackage.SCHEDULE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SCHEDULE__TYPE:
				return getType();
			case FhirPackage.SCHEDULE__ACTOR:
				return getActor();
			case FhirPackage.SCHEDULE__PLANNING_HORIZON:
				return getPlanningHorizon();
			case FhirPackage.SCHEDULE__COMMENT:
				return getComment();
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
			case FhirPackage.SCHEDULE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.SCHEDULE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SCHEDULE__ACTOR:
				setActor((Reference)newValue);
				return;
			case FhirPackage.SCHEDULE__PLANNING_HORIZON:
				setPlanningHorizon((Period)newValue);
				return;
			case FhirPackage.SCHEDULE__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SCHEDULE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.SCHEDULE__TYPE:
				getType().clear();
				return;
			case FhirPackage.SCHEDULE__ACTOR:
				setActor((Reference)null);
				return;
			case FhirPackage.SCHEDULE__PLANNING_HORIZON:
				setPlanningHorizon((Period)null);
				return;
			case FhirPackage.SCHEDULE__COMMENT:
				setComment((org.hl7.fhir.String)null);
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
			case FhirPackage.SCHEDULE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.SCHEDULE__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.SCHEDULE__ACTOR:
				return actor != null;
			case FhirPackage.SCHEDULE__PLANNING_HORIZON:
				return planningHorizon != null;
			case FhirPackage.SCHEDULE__COMMENT:
				return comment != null;
		}
		return super.eIsSet(featureID);
	}

} //ScheduleImpl
