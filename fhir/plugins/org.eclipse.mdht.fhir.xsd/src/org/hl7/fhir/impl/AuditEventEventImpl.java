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

import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventEvent;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Instant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEventImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEventImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEventImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEventImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEventImpl#getOutcomeDesc <em>Outcome Desc</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEventImpl#getPurposeOfEvent <em>Purpose Of Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventEventImpl extends BackboneElementImpl implements AuditEventEvent {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subtype;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected AuditEventAction action;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Instant dateTime;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected AuditEventOutcome outcome;

	/**
	 * The cached value of the '{@link #getOutcomeDesc() <em>Outcome Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeDesc()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String outcomeDesc;

	/**
	 * The cached value of the '{@link #getPurposeOfEvent() <em>Purpose Of Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeOfEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> purposeOfEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAuditEventEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_EVENT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_EVENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_EVENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_EVENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSubtype() {
		if (subtype == null) {
			subtype = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.AUDIT_EVENT_EVENT__SUBTYPE);
		}
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(AuditEventAction newAction, NotificationChain msgs) {
		AuditEventAction oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_EVENT__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(AuditEventAction newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_EVENT__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_EVENT__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_EVENT__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(Instant newDateTime, NotificationChain msgs) {
		Instant oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_EVENT__DATE_TIME, oldDateTime, newDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Instant newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_EVENT__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_EVENT__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_EVENT__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcome getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(AuditEventOutcome newOutcome, NotificationChain msgs) {
		AuditEventOutcome oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_EVENT__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(AuditEventOutcome newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_EVENT__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_EVENT__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_EVENT__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getOutcomeDesc() {
		return outcomeDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcomeDesc(org.hl7.fhir.String newOutcomeDesc, NotificationChain msgs) {
		org.hl7.fhir.String oldOutcomeDesc = outcomeDesc;
		outcomeDesc = newOutcomeDesc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_EVENT__OUTCOME_DESC, oldOutcomeDesc, newOutcomeDesc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcomeDesc(org.hl7.fhir.String newOutcomeDesc) {
		if (newOutcomeDesc != outcomeDesc) {
			NotificationChain msgs = null;
			if (outcomeDesc != null)
				msgs = ((InternalEObject)outcomeDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_EVENT__OUTCOME_DESC, null, msgs);
			if (newOutcomeDesc != null)
				msgs = ((InternalEObject)newOutcomeDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_EVENT__OUTCOME_DESC, null, msgs);
			msgs = basicSetOutcomeDesc(newOutcomeDesc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_EVENT__OUTCOME_DESC, newOutcomeDesc, newOutcomeDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getPurposeOfEvent() {
		if (purposeOfEvent == null) {
			purposeOfEvent = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.AUDIT_EVENT_EVENT__PURPOSE_OF_EVENT);
		}
		return purposeOfEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.AUDIT_EVENT_EVENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.AUDIT_EVENT_EVENT__SUBTYPE:
				return ((InternalEList<?>)getSubtype()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT_EVENT__ACTION:
				return basicSetAction(null, msgs);
			case FhirPackage.AUDIT_EVENT_EVENT__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case FhirPackage.AUDIT_EVENT_EVENT__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.AUDIT_EVENT_EVENT__OUTCOME_DESC:
				return basicSetOutcomeDesc(null, msgs);
			case FhirPackage.AUDIT_EVENT_EVENT__PURPOSE_OF_EVENT:
				return ((InternalEList<?>)getPurposeOfEvent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.AUDIT_EVENT_EVENT__TYPE:
				return getType();
			case FhirPackage.AUDIT_EVENT_EVENT__SUBTYPE:
				return getSubtype();
			case FhirPackage.AUDIT_EVENT_EVENT__ACTION:
				return getAction();
			case FhirPackage.AUDIT_EVENT_EVENT__DATE_TIME:
				return getDateTime();
			case FhirPackage.AUDIT_EVENT_EVENT__OUTCOME:
				return getOutcome();
			case FhirPackage.AUDIT_EVENT_EVENT__OUTCOME_DESC:
				return getOutcomeDesc();
			case FhirPackage.AUDIT_EVENT_EVENT__PURPOSE_OF_EVENT:
				return getPurposeOfEvent();
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
			case FhirPackage.AUDIT_EVENT_EVENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__SUBTYPE:
				getSubtype().clear();
				getSubtype().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__ACTION:
				setAction((AuditEventAction)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__DATE_TIME:
				setDateTime((Instant)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__OUTCOME:
				setOutcome((AuditEventOutcome)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__OUTCOME_DESC:
				setOutcomeDesc((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__PURPOSE_OF_EVENT:
				getPurposeOfEvent().clear();
				getPurposeOfEvent().addAll((Collection<? extends Coding>)newValue);
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
			case FhirPackage.AUDIT_EVENT_EVENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__SUBTYPE:
				getSubtype().clear();
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__ACTION:
				setAction((AuditEventAction)null);
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__DATE_TIME:
				setDateTime((Instant)null);
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__OUTCOME:
				setOutcome((AuditEventOutcome)null);
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__OUTCOME_DESC:
				setOutcomeDesc((org.hl7.fhir.String)null);
				return;
			case FhirPackage.AUDIT_EVENT_EVENT__PURPOSE_OF_EVENT:
				getPurposeOfEvent().clear();
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
			case FhirPackage.AUDIT_EVENT_EVENT__TYPE:
				return type != null;
			case FhirPackage.AUDIT_EVENT_EVENT__SUBTYPE:
				return subtype != null && !subtype.isEmpty();
			case FhirPackage.AUDIT_EVENT_EVENT__ACTION:
				return action != null;
			case FhirPackage.AUDIT_EVENT_EVENT__DATE_TIME:
				return dateTime != null;
			case FhirPackage.AUDIT_EVENT_EVENT__OUTCOME:
				return outcome != null;
			case FhirPackage.AUDIT_EVENT_EVENT__OUTCOME_DESC:
				return outcomeDesc != null;
			case FhirPackage.AUDIT_EVENT_EVENT__PURPOSE_OF_EVENT:
				return purposeOfEvent != null && !purposeOfEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventEventImpl
