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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DeviceUseRequest;
import org.hl7.fhir.DeviceUseRequestPriority;
import org.hl7.fhir.DeviceUseRequestStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Use Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getBodySiteCodeableConcept <em>Body Site Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getBodySiteReference <em>Body Site Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getPrnReason <em>Prn Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getOrderedOn <em>Ordered On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getRecordedOn <em>Recorded On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseRequestImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceUseRequestImpl extends DomainResourceImpl implements DeviceUseRequest {
	/**
	 * The cached value of the '{@link #getBodySiteCodeableConcept() <em>Body Site Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySiteCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySiteCodeableConcept;

	/**
	 * The cached value of the '{@link #getBodySiteReference() <em>Body Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySiteReference()
	 * @generated
	 * @ordered
	 */
	protected Reference bodySiteReference;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected DeviceUseRequestStatus status;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Reference device;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

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
	 * The cached value of the '{@link #getIndication() <em>Indication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> indication;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> notes;

	/**
	 * The cached value of the '{@link #getPrnReason() <em>Prn Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrnReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> prnReason;

	/**
	 * The cached value of the '{@link #getOrderedOn() <em>Ordered On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime orderedOn;

	/**
	 * The cached value of the '{@link #getRecordedOn() <em>Recorded On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime recordedOn;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getTimingTiming() <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timingTiming;

	/**
	 * The cached value of the '{@link #getTimingPeriod() <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period timingPeriod;

	/**
	 * The cached value of the '{@link #getTimingDateTime() <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime timingDateTime;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected DeviceUseRequestPriority priority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceUseRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceUseRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBodySiteCodeableConcept() {
		return bodySiteCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySiteCodeableConcept(CodeableConcept newBodySiteCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldBodySiteCodeableConcept = bodySiteCodeableConcept;
		bodySiteCodeableConcept = newBodySiteCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_CODEABLE_CONCEPT, oldBodySiteCodeableConcept, newBodySiteCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySiteCodeableConcept(CodeableConcept newBodySiteCodeableConcept) {
		if (newBodySiteCodeableConcept != bodySiteCodeableConcept) {
			NotificationChain msgs = null;
			if (bodySiteCodeableConcept != null)
				msgs = ((InternalEObject)bodySiteCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_CODEABLE_CONCEPT, null, msgs);
			if (newBodySiteCodeableConcept != null)
				msgs = ((InternalEObject)newBodySiteCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetBodySiteCodeableConcept(newBodySiteCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_CODEABLE_CONCEPT, newBodySiteCodeableConcept, newBodySiteCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getBodySiteReference() {
		return bodySiteReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySiteReference(Reference newBodySiteReference, NotificationChain msgs) {
		Reference oldBodySiteReference = bodySiteReference;
		bodySiteReference = newBodySiteReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_REFERENCE, oldBodySiteReference, newBodySiteReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySiteReference(Reference newBodySiteReference) {
		if (newBodySiteReference != bodySiteReference) {
			NotificationChain msgs = null;
			if (bodySiteReference != null)
				msgs = ((InternalEObject)bodySiteReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_REFERENCE, null, msgs);
			if (newBodySiteReference != null)
				msgs = ((InternalEObject)newBodySiteReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_REFERENCE, null, msgs);
			msgs = basicSetBodySiteReference(newBodySiteReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_REFERENCE, newBodySiteReference, newBodySiteReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(DeviceUseRequestStatus newStatus, NotificationChain msgs) {
		DeviceUseRequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(DeviceUseRequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Reference newDevice, NotificationChain msgs) {
		Reference oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__DEVICE, oldDevice, newDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Reference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DEVICE_USE_REQUEST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getIndication() {
		if (indication == null) {
			indication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_USE_REQUEST__INDICATION);
		}
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.DEVICE_USE_REQUEST__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPrnReason() {
		if (prnReason == null) {
			prnReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_USE_REQUEST__PRN_REASON);
		}
		return prnReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOrderedOn() {
		return orderedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderedOn(DateTime newOrderedOn, NotificationChain msgs) {
		DateTime oldOrderedOn = orderedOn;
		orderedOn = newOrderedOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__ORDERED_ON, oldOrderedOn, newOrderedOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedOn(DateTime newOrderedOn) {
		if (newOrderedOn != orderedOn) {
			NotificationChain msgs = null;
			if (orderedOn != null)
				msgs = ((InternalEObject)orderedOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__ORDERED_ON, null, msgs);
			if (newOrderedOn != null)
				msgs = ((InternalEObject)newOrderedOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__ORDERED_ON, null, msgs);
			msgs = basicSetOrderedOn(newOrderedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__ORDERED_ON, newOrderedOn, newOrderedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getRecordedOn() {
		return recordedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordedOn(DateTime newRecordedOn, NotificationChain msgs) {
		DateTime oldRecordedOn = recordedOn;
		recordedOn = newRecordedOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__RECORDED_ON, oldRecordedOn, newRecordedOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordedOn(DateTime newRecordedOn) {
		if (newRecordedOn != recordedOn) {
			NotificationChain msgs = null;
			if (recordedOn != null)
				msgs = ((InternalEObject)recordedOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__RECORDED_ON, null, msgs);
			if (newRecordedOn != null)
				msgs = ((InternalEObject)newRecordedOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__RECORDED_ON, null, msgs);
			msgs = basicSetRecordedOn(newRecordedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__RECORDED_ON, newRecordedOn, newRecordedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getTimingTiming() {
		return timingTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingTiming(Timing newTimingTiming, NotificationChain msgs) {
		Timing oldTimingTiming = timingTiming;
		timingTiming = newTimingTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__TIMING_TIMING, oldTimingTiming, newTimingTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingTiming(Timing newTimingTiming) {
		if (newTimingTiming != timingTiming) {
			NotificationChain msgs = null;
			if (timingTiming != null)
				msgs = ((InternalEObject)timingTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__TIMING_TIMING, null, msgs);
			if (newTimingTiming != null)
				msgs = ((InternalEObject)newTimingTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__TIMING_TIMING, null, msgs);
			msgs = basicSetTimingTiming(newTimingTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__TIMING_TIMING, newTimingTiming, newTimingTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getTimingPeriod() {
		return timingPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingPeriod(Period newTimingPeriod, NotificationChain msgs) {
		Period oldTimingPeriod = timingPeriod;
		timingPeriod = newTimingPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__TIMING_PERIOD, oldTimingPeriod, newTimingPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingPeriod(Period newTimingPeriod) {
		if (newTimingPeriod != timingPeriod) {
			NotificationChain msgs = null;
			if (timingPeriod != null)
				msgs = ((InternalEObject)timingPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__TIMING_PERIOD, null, msgs);
			if (newTimingPeriod != null)
				msgs = ((InternalEObject)newTimingPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__TIMING_PERIOD, null, msgs);
			msgs = basicSetTimingPeriod(newTimingPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__TIMING_PERIOD, newTimingPeriod, newTimingPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getTimingDateTime() {
		return timingDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingDateTime(DateTime newTimingDateTime, NotificationChain msgs) {
		DateTime oldTimingDateTime = timingDateTime;
		timingDateTime = newTimingDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__TIMING_DATE_TIME, oldTimingDateTime, newTimingDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingDateTime(DateTime newTimingDateTime) {
		if (newTimingDateTime != timingDateTime) {
			NotificationChain msgs = null;
			if (timingDateTime != null)
				msgs = ((InternalEObject)timingDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__TIMING_DATE_TIME, null, msgs);
			if (newTimingDateTime != null)
				msgs = ((InternalEObject)newTimingDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__TIMING_DATE_TIME, null, msgs);
			msgs = basicSetTimingDateTime(newTimingDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__TIMING_DATE_TIME, newTimingDateTime, newTimingDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequestPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(DeviceUseRequestPriority newPriority, NotificationChain msgs) {
		DeviceUseRequestPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(DeviceUseRequestPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_CODEABLE_CONCEPT:
				return basicSetBodySiteCodeableConcept(null, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_REFERENCE:
				return basicSetBodySiteReference(null, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__INDICATION:
				return ((InternalEList<?>)getIndication()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__PRN_REASON:
				return ((InternalEList<?>)getPrnReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__ORDERED_ON:
				return basicSetOrderedOn(null, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__RECORDED_ON:
				return basicSetRecordedOn(null, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_TIMING:
				return basicSetTimingTiming(null, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_PERIOD:
				return basicSetTimingPeriod(null, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_DATE_TIME:
				return basicSetTimingDateTime(null, msgs);
			case FhirPackage.DEVICE_USE_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
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
			case FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_CODEABLE_CONCEPT:
				return getBodySiteCodeableConcept();
			case FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_REFERENCE:
				return getBodySiteReference();
			case FhirPackage.DEVICE_USE_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.DEVICE_USE_REQUEST__DEVICE:
				return getDevice();
			case FhirPackage.DEVICE_USE_REQUEST__ENCOUNTER:
				return getEncounter();
			case FhirPackage.DEVICE_USE_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE_USE_REQUEST__INDICATION:
				return getIndication();
			case FhirPackage.DEVICE_USE_REQUEST__NOTES:
				return getNotes();
			case FhirPackage.DEVICE_USE_REQUEST__PRN_REASON:
				return getPrnReason();
			case FhirPackage.DEVICE_USE_REQUEST__ORDERED_ON:
				return getOrderedOn();
			case FhirPackage.DEVICE_USE_REQUEST__RECORDED_ON:
				return getRecordedOn();
			case FhirPackage.DEVICE_USE_REQUEST__SUBJECT:
				return getSubject();
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_TIMING:
				return getTimingTiming();
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_PERIOD:
				return getTimingPeriod();
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_DATE_TIME:
				return getTimingDateTime();
			case FhirPackage.DEVICE_USE_REQUEST__PRIORITY:
				return getPriority();
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
			case FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_CODEABLE_CONCEPT:
				setBodySiteCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_REFERENCE:
				setBodySiteReference((Reference)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__STATUS:
				setStatus((DeviceUseRequestStatus)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__DEVICE:
				setDevice((Reference)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__INDICATION:
				getIndication().clear();
				getIndication().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__PRN_REASON:
				getPrnReason().clear();
				getPrnReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__ORDERED_ON:
				setOrderedOn((DateTime)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__RECORDED_ON:
				setRecordedOn((DateTime)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_TIMING:
				setTimingTiming((Timing)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_PERIOD:
				setTimingPeriod((Period)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)newValue);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__PRIORITY:
				setPriority((DeviceUseRequestPriority)newValue);
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
			case FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_CODEABLE_CONCEPT:
				setBodySiteCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_REFERENCE:
				setBodySiteReference((Reference)null);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__STATUS:
				setStatus((DeviceUseRequestStatus)null);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__DEVICE:
				setDevice((Reference)null);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DEVICE_USE_REQUEST__INDICATION:
				getIndication().clear();
				return;
			case FhirPackage.DEVICE_USE_REQUEST__NOTES:
				getNotes().clear();
				return;
			case FhirPackage.DEVICE_USE_REQUEST__PRN_REASON:
				getPrnReason().clear();
				return;
			case FhirPackage.DEVICE_USE_REQUEST__ORDERED_ON:
				setOrderedOn((DateTime)null);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__RECORDED_ON:
				setRecordedOn((DateTime)null);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_TIMING:
				setTimingTiming((Timing)null);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_PERIOD:
				setTimingPeriod((Period)null);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)null);
				return;
			case FhirPackage.DEVICE_USE_REQUEST__PRIORITY:
				setPriority((DeviceUseRequestPriority)null);
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
			case FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_CODEABLE_CONCEPT:
				return bodySiteCodeableConcept != null;
			case FhirPackage.DEVICE_USE_REQUEST__BODY_SITE_REFERENCE:
				return bodySiteReference != null;
			case FhirPackage.DEVICE_USE_REQUEST__STATUS:
				return status != null;
			case FhirPackage.DEVICE_USE_REQUEST__DEVICE:
				return device != null;
			case FhirPackage.DEVICE_USE_REQUEST__ENCOUNTER:
				return encounter != null;
			case FhirPackage.DEVICE_USE_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DEVICE_USE_REQUEST__INDICATION:
				return indication != null && !indication.isEmpty();
			case FhirPackage.DEVICE_USE_REQUEST__NOTES:
				return notes != null && !notes.isEmpty();
			case FhirPackage.DEVICE_USE_REQUEST__PRN_REASON:
				return prnReason != null && !prnReason.isEmpty();
			case FhirPackage.DEVICE_USE_REQUEST__ORDERED_ON:
				return orderedOn != null;
			case FhirPackage.DEVICE_USE_REQUEST__RECORDED_ON:
				return recordedOn != null;
			case FhirPackage.DEVICE_USE_REQUEST__SUBJECT:
				return subject != null;
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_TIMING:
				return timingTiming != null;
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_PERIOD:
				return timingPeriod != null;
			case FhirPackage.DEVICE_USE_REQUEST__TIMING_DATE_TIME:
				return timingDateTime != null;
			case FhirPackage.DEVICE_USE_REQUEST__PRIORITY:
				return priority != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceUseRequestImpl
