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

import org.hl7.fhir.CarePlanActivityCategory;
import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SimpleQuantity;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getProhibited <em>Prohibited</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getScheduledTiming <em>Scheduled Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getScheduledPeriod <em>Scheduled Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getScheduledString <em>Scheduled String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getDailyAmount <em>Daily Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarePlanDetailImpl extends BackboneElementImpl implements CarePlanDetail {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CarePlanActivityCategory category;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getReasonCodeableConcept() <em>Reason Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonCodeableConcept;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reasonReference;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> goal;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CarePlanActivityStatus status;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept statusReason;

	/**
	 * The cached value of the '{@link #getProhibited() <em>Prohibited</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProhibited()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean prohibited;

	/**
	 * The cached value of the '{@link #getScheduledTiming() <em>Scheduled Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing scheduledTiming;

	/**
	 * The cached value of the '{@link #getScheduledPeriod() <em>Scheduled Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period scheduledPeriod;

	/**
	 * The cached value of the '{@link #getScheduledString() <em>Scheduled String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String scheduledString;

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
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> performer;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Reference product;

	/**
	 * The cached value of the '{@link #getDailyAmount() <em>Daily Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyAmount()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity dailyAmount;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCarePlanDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CarePlanActivityCategory newCategory, NotificationChain msgs) {
		CarePlanActivityCategory oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CarePlanActivityCategory newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReasonCodeableConcept() {
		return reasonCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonCodeableConcept(CodeableConcept newReasonCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldReasonCodeableConcept = reasonCodeableConcept;
		reasonCodeableConcept = newReasonCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__REASON_CODEABLE_CONCEPT, oldReasonCodeableConcept, newReasonCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonCodeableConcept(CodeableConcept newReasonCodeableConcept) {
		if (newReasonCodeableConcept != reasonCodeableConcept) {
			NotificationChain msgs = null;
			if (reasonCodeableConcept != null)
				msgs = ((InternalEObject)reasonCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__REASON_CODEABLE_CONCEPT, null, msgs);
			if (newReasonCodeableConcept != null)
				msgs = ((InternalEObject)newReasonCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__REASON_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetReasonCodeableConcept(newReasonCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__REASON_CODEABLE_CONCEPT, newReasonCodeableConcept, newReasonCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReasonReference() {
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonReference(Reference newReasonReference, NotificationChain msgs) {
		Reference oldReasonReference = reasonReference;
		reasonReference = newReasonReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE, oldReasonReference, newReasonReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonReference(Reference newReasonReference) {
		if (newReasonReference != reasonReference) {
			NotificationChain msgs = null;
			if (reasonReference != null)
				msgs = ((InternalEObject)reasonReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE, null, msgs);
			if (newReasonReference != null)
				msgs = ((InternalEObject)newReasonReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE, null, msgs);
			msgs = basicSetReasonReference(newReasonReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE, newReasonReference, newReasonReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getGoal() {
		if (goal == null) {
			goal = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CARE_PLAN_DETAIL__GOAL);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CarePlanActivityStatus newStatus, NotificationChain msgs) {
		CarePlanActivityStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CarePlanActivityStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatusReason() {
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReason(CodeableConcept newStatusReason, NotificationChain msgs) {
		CodeableConcept oldStatusReason = statusReason;
		statusReason = newStatusReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON, oldStatusReason, newStatusReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusReason(CodeableConcept newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getProhibited() {
		return prohibited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProhibited(org.hl7.fhir.Boolean newProhibited, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldProhibited = prohibited;
		prohibited = newProhibited;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__PROHIBITED, oldProhibited, newProhibited);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProhibited(org.hl7.fhir.Boolean newProhibited) {
		if (newProhibited != prohibited) {
			NotificationChain msgs = null;
			if (prohibited != null)
				msgs = ((InternalEObject)prohibited).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__PROHIBITED, null, msgs);
			if (newProhibited != null)
				msgs = ((InternalEObject)newProhibited).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__PROHIBITED, null, msgs);
			msgs = basicSetProhibited(newProhibited, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__PROHIBITED, newProhibited, newProhibited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getScheduledTiming() {
		return scheduledTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledTiming(Timing newScheduledTiming, NotificationChain msgs) {
		Timing oldScheduledTiming = scheduledTiming;
		scheduledTiming = newScheduledTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING, oldScheduledTiming, newScheduledTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledTiming(Timing newScheduledTiming) {
		if (newScheduledTiming != scheduledTiming) {
			NotificationChain msgs = null;
			if (scheduledTiming != null)
				msgs = ((InternalEObject)scheduledTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING, null, msgs);
			if (newScheduledTiming != null)
				msgs = ((InternalEObject)newScheduledTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING, null, msgs);
			msgs = basicSetScheduledTiming(newScheduledTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING, newScheduledTiming, newScheduledTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getScheduledPeriod() {
		return scheduledPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledPeriod(Period newScheduledPeriod, NotificationChain msgs) {
		Period oldScheduledPeriod = scheduledPeriod;
		scheduledPeriod = newScheduledPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD, oldScheduledPeriod, newScheduledPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledPeriod(Period newScheduledPeriod) {
		if (newScheduledPeriod != scheduledPeriod) {
			NotificationChain msgs = null;
			if (scheduledPeriod != null)
				msgs = ((InternalEObject)scheduledPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD, null, msgs);
			if (newScheduledPeriod != null)
				msgs = ((InternalEObject)newScheduledPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD, null, msgs);
			msgs = basicSetScheduledPeriod(newScheduledPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD, newScheduledPeriod, newScheduledPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getScheduledString() {
		return scheduledString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledString(org.hl7.fhir.String newScheduledString, NotificationChain msgs) {
		org.hl7.fhir.String oldScheduledString = scheduledString;
		scheduledString = newScheduledString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING, oldScheduledString, newScheduledString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledString(org.hl7.fhir.String newScheduledString) {
		if (newScheduledString != scheduledString) {
			NotificationChain msgs = null;
			if (scheduledString != null)
				msgs = ((InternalEObject)scheduledString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING, null, msgs);
			if (newScheduledString != null)
				msgs = ((InternalEObject)newScheduledString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING, null, msgs);
			msgs = basicSetScheduledString(newScheduledString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING, newScheduledString, newScheduledString));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CARE_PLAN_DETAIL__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(Reference newProduct, NotificationChain msgs) {
		Reference oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__PRODUCT, oldProduct, newProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Reference newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject)product).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__PRODUCT, null, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__PRODUCT, null, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getDailyAmount() {
		return dailyAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDailyAmount(SimpleQuantity newDailyAmount, NotificationChain msgs) {
		SimpleQuantity oldDailyAmount = dailyAmount;
		dailyAmount = newDailyAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT, oldDailyAmount, newDailyAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyAmount(SimpleQuantity newDailyAmount) {
		if (newDailyAmount != dailyAmount) {
			NotificationChain msgs = null;
			if (dailyAmount != null)
				msgs = ((InternalEObject)dailyAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT, null, msgs);
			if (newDailyAmount != null)
				msgs = ((InternalEObject)newDailyAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT, null, msgs);
			msgs = basicSetDailyAmount(newDailyAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT, newDailyAmount, newDailyAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(SimpleQuantity newQuantity, NotificationChain msgs) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(org.hl7.fhir.String newNote, NotificationChain msgs) {
		org.hl7.fhir.String oldNote = note;
		note = newNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__NOTE, oldNote, newNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(org.hl7.fhir.String newNote) {
		if (newNote != note) {
			NotificationChain msgs = null;
			if (note != null)
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__NOTE, newNote, newNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CARE_PLAN_DETAIL__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__REASON_CODEABLE_CONCEPT:
				return basicSetReasonCodeableConcept(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE:
				return basicSetReasonReference(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__GOAL:
				return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__PROHIBITED:
				return basicSetProhibited(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING:
				return basicSetScheduledTiming(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD:
				return basicSetScheduledPeriod(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING:
				return basicSetScheduledString(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT:
				return basicSetProduct(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT:
				return basicSetDailyAmount(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__NOTE:
				return basicSetNote(null, msgs);
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
			case FhirPackage.CARE_PLAN_DETAIL__CATEGORY:
				return getCategory();
			case FhirPackage.CARE_PLAN_DETAIL__CODE:
				return getCode();
			case FhirPackage.CARE_PLAN_DETAIL__REASON_CODEABLE_CONCEPT:
				return getReasonCodeableConcept();
			case FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.CARE_PLAN_DETAIL__GOAL:
				return getGoal();
			case FhirPackage.CARE_PLAN_DETAIL__STATUS:
				return getStatus();
			case FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON:
				return getStatusReason();
			case FhirPackage.CARE_PLAN_DETAIL__PROHIBITED:
				return getProhibited();
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING:
				return getScheduledTiming();
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD:
				return getScheduledPeriod();
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING:
				return getScheduledString();
			case FhirPackage.CARE_PLAN_DETAIL__LOCATION:
				return getLocation();
			case FhirPackage.CARE_PLAN_DETAIL__PERFORMER:
				return getPerformer();
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT:
				return getProduct();
			case FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT:
				return getDailyAmount();
			case FhirPackage.CARE_PLAN_DETAIL__QUANTITY:
				return getQuantity();
			case FhirPackage.CARE_PLAN_DETAIL__NOTE:
				return getNote();
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
			case FhirPackage.CARE_PLAN_DETAIL__CATEGORY:
				setCategory((CarePlanActivityCategory)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE:
				setReasonReference((Reference)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__STATUS:
				setStatus((CarePlanActivityStatus)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PROHIBITED:
				setProhibited((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING:
				setScheduledTiming((Timing)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD:
				setScheduledPeriod((Period)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING:
				setScheduledString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT:
				setProduct((Reference)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT:
				setDailyAmount((SimpleQuantity)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__NOTE:
				setNote((org.hl7.fhir.String)newValue);
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
			case FhirPackage.CARE_PLAN_DETAIL__CATEGORY:
				setCategory((CarePlanActivityCategory)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE:
				setReasonReference((Reference)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__GOAL:
				getGoal().clear();
				return;
			case FhirPackage.CARE_PLAN_DETAIL__STATUS:
				setStatus((CarePlanActivityStatus)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PROHIBITED:
				setProhibited((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING:
				setScheduledTiming((Timing)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD:
				setScheduledPeriod((Period)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING:
				setScheduledString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT:
				setProduct((Reference)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT:
				setDailyAmount((SimpleQuantity)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__NOTE:
				setNote((org.hl7.fhir.String)null);
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
			case FhirPackage.CARE_PLAN_DETAIL__CATEGORY:
				return category != null;
			case FhirPackage.CARE_PLAN_DETAIL__CODE:
				return code != null;
			case FhirPackage.CARE_PLAN_DETAIL__REASON_CODEABLE_CONCEPT:
				return reasonCodeableConcept != null;
			case FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE:
				return reasonReference != null;
			case FhirPackage.CARE_PLAN_DETAIL__GOAL:
				return goal != null && !goal.isEmpty();
			case FhirPackage.CARE_PLAN_DETAIL__STATUS:
				return status != null;
			case FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON:
				return statusReason != null;
			case FhirPackage.CARE_PLAN_DETAIL__PROHIBITED:
				return prohibited != null;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING:
				return scheduledTiming != null;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD:
				return scheduledPeriod != null;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING:
				return scheduledString != null;
			case FhirPackage.CARE_PLAN_DETAIL__LOCATION:
				return location != null;
			case FhirPackage.CARE_PLAN_DETAIL__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT:
				return product != null;
			case FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT:
				return dailyAmount != null;
			case FhirPackage.CARE_PLAN_DETAIL__QUANTITY:
				return quantity != null;
			case FhirPackage.CARE_PLAN_DETAIL__NOTE:
				return note != null;
		}
		return super.eIsSet(featureID);
	}

} //CarePlanDetailImpl
