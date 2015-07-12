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
import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Use Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getBodySiteCodeableConcept <em>Body Site Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getBodySiteReference <em>Body Site Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getWhenUsed <em>When Used</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getRecordedOn <em>Recorded On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUseStatementImpl#getTimingDateTime <em>Timing Date Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceUseStatementImpl extends DomainResourceImpl implements DeviceUseStatement {
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
	 * The cached value of the '{@link #getWhenUsed() <em>When Used</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenUsed()
	 * @generated
	 * @ordered
	 */
	protected Period whenUsed;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceUseStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceUseStatement();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_CODEABLE_CONCEPT, oldBodySiteCodeableConcept, newBodySiteCodeableConcept);
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
				msgs = ((InternalEObject)bodySiteCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_CODEABLE_CONCEPT, null, msgs);
			if (newBodySiteCodeableConcept != null)
				msgs = ((InternalEObject)newBodySiteCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetBodySiteCodeableConcept(newBodySiteCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_CODEABLE_CONCEPT, newBodySiteCodeableConcept, newBodySiteCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_REFERENCE, oldBodySiteReference, newBodySiteReference);
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
				msgs = ((InternalEObject)bodySiteReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_REFERENCE, null, msgs);
			if (newBodySiteReference != null)
				msgs = ((InternalEObject)newBodySiteReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_REFERENCE, null, msgs);
			msgs = basicSetBodySiteReference(newBodySiteReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_REFERENCE, newBodySiteReference, newBodySiteReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getWhenUsed() {
		return whenUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenUsed(Period newWhenUsed, NotificationChain msgs) {
		Period oldWhenUsed = whenUsed;
		whenUsed = newWhenUsed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__WHEN_USED, oldWhenUsed, newWhenUsed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenUsed(Period newWhenUsed) {
		if (newWhenUsed != whenUsed) {
			NotificationChain msgs = null;
			if (whenUsed != null)
				msgs = ((InternalEObject)whenUsed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__WHEN_USED, null, msgs);
			if (newWhenUsed != null)
				msgs = ((InternalEObject)newWhenUsed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__WHEN_USED, null, msgs);
			msgs = basicSetWhenUsed(newWhenUsed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__WHEN_USED, newWhenUsed, newWhenUsed));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__DEVICE, oldDevice, newDevice);
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
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DEVICE_USE_STATEMENT__IDENTIFIER);
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
			indication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_USE_STATEMENT__INDICATION);
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
			notes = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.DEVICE_USE_STATEMENT__NOTES);
		}
		return notes;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__RECORDED_ON, oldRecordedOn, newRecordedOn);
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
				msgs = ((InternalEObject)recordedOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__RECORDED_ON, null, msgs);
			if (newRecordedOn != null)
				msgs = ((InternalEObject)newRecordedOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__RECORDED_ON, null, msgs);
			msgs = basicSetRecordedOn(newRecordedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__RECORDED_ON, newRecordedOn, newRecordedOn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__TIMING_TIMING, oldTimingTiming, newTimingTiming);
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
				msgs = ((InternalEObject)timingTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__TIMING_TIMING, null, msgs);
			if (newTimingTiming != null)
				msgs = ((InternalEObject)newTimingTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__TIMING_TIMING, null, msgs);
			msgs = basicSetTimingTiming(newTimingTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__TIMING_TIMING, newTimingTiming, newTimingTiming));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__TIMING_PERIOD, oldTimingPeriod, newTimingPeriod);
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
				msgs = ((InternalEObject)timingPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__TIMING_PERIOD, null, msgs);
			if (newTimingPeriod != null)
				msgs = ((InternalEObject)newTimingPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__TIMING_PERIOD, null, msgs);
			msgs = basicSetTimingPeriod(newTimingPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__TIMING_PERIOD, newTimingPeriod, newTimingPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__TIMING_DATE_TIME, oldTimingDateTime, newTimingDateTime);
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
				msgs = ((InternalEObject)timingDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__TIMING_DATE_TIME, null, msgs);
			if (newTimingDateTime != null)
				msgs = ((InternalEObject)newTimingDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_USE_STATEMENT__TIMING_DATE_TIME, null, msgs);
			msgs = basicSetTimingDateTime(newTimingDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_USE_STATEMENT__TIMING_DATE_TIME, newTimingDateTime, newTimingDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_CODEABLE_CONCEPT:
				return basicSetBodySiteCodeableConcept(null, msgs);
			case FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_REFERENCE:
				return basicSetBodySiteReference(null, msgs);
			case FhirPackage.DEVICE_USE_STATEMENT__WHEN_USED:
				return basicSetWhenUsed(null, msgs);
			case FhirPackage.DEVICE_USE_STATEMENT__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USE_STATEMENT__INDICATION:
				return ((InternalEList<?>)getIndication()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USE_STATEMENT__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				return basicSetRecordedOn(null, msgs);
			case FhirPackage.DEVICE_USE_STATEMENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_TIMING:
				return basicSetTimingTiming(null, msgs);
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_PERIOD:
				return basicSetTimingPeriod(null, msgs);
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_DATE_TIME:
				return basicSetTimingDateTime(null, msgs);
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
			case FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_CODEABLE_CONCEPT:
				return getBodySiteCodeableConcept();
			case FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_REFERENCE:
				return getBodySiteReference();
			case FhirPackage.DEVICE_USE_STATEMENT__WHEN_USED:
				return getWhenUsed();
			case FhirPackage.DEVICE_USE_STATEMENT__DEVICE:
				return getDevice();
			case FhirPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE_USE_STATEMENT__INDICATION:
				return getIndication();
			case FhirPackage.DEVICE_USE_STATEMENT__NOTES:
				return getNotes();
			case FhirPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				return getRecordedOn();
			case FhirPackage.DEVICE_USE_STATEMENT__SUBJECT:
				return getSubject();
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_TIMING:
				return getTimingTiming();
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_PERIOD:
				return getTimingPeriod();
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_DATE_TIME:
				return getTimingDateTime();
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
			case FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_CODEABLE_CONCEPT:
				setBodySiteCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_REFERENCE:
				setBodySiteReference((Reference)newValue);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__WHEN_USED:
				setWhenUsed((Period)newValue);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__DEVICE:
				setDevice((Reference)newValue);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__INDICATION:
				getIndication().clear();
				getIndication().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				setRecordedOn((DateTime)newValue);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_TIMING:
				setTimingTiming((Timing)newValue);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_PERIOD:
				setTimingPeriod((Period)newValue);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)newValue);
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
			case FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_CODEABLE_CONCEPT:
				setBodySiteCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_REFERENCE:
				setBodySiteReference((Reference)null);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__WHEN_USED:
				setWhenUsed((Period)null);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__DEVICE:
				setDevice((Reference)null);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__INDICATION:
				getIndication().clear();
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__NOTES:
				getNotes().clear();
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				setRecordedOn((DateTime)null);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_TIMING:
				setTimingTiming((Timing)null);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_PERIOD:
				setTimingPeriod((Period)null);
				return;
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)null);
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
			case FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_CODEABLE_CONCEPT:
				return bodySiteCodeableConcept != null;
			case FhirPackage.DEVICE_USE_STATEMENT__BODY_SITE_REFERENCE:
				return bodySiteReference != null;
			case FhirPackage.DEVICE_USE_STATEMENT__WHEN_USED:
				return whenUsed != null;
			case FhirPackage.DEVICE_USE_STATEMENT__DEVICE:
				return device != null;
			case FhirPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DEVICE_USE_STATEMENT__INDICATION:
				return indication != null && !indication.isEmpty();
			case FhirPackage.DEVICE_USE_STATEMENT__NOTES:
				return notes != null && !notes.isEmpty();
			case FhirPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				return recordedOn != null;
			case FhirPackage.DEVICE_USE_STATEMENT__SUBJECT:
				return subject != null;
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_TIMING:
				return timingTiming != null;
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_PERIOD:
				return timingPeriod != null;
			case FhirPackage.DEVICE_USE_STATEMENT__TIMING_DATE_TIME:
				return timingDateTime != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceUseStatementImpl
