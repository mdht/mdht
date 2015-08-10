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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationRelated;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.Period;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueRatio <em>Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueSampledData <em>Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValuePeriod <em>Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getReferenceRange <em>Reference Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getRelated <em>Related</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationImpl extends DomainResourceImpl implements Observation {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ObservationStatus status;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

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
	 * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveDateTime;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected Instant issued;

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
	 * The cached value of the '{@link #getValueQuantity() <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity valueQuantity;

	/**
	 * The cached value of the '{@link #getValueCodeableConcept() <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept valueCodeableConcept;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String valueString;

	/**
	 * The cached value of the '{@link #getValueRange() <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRange()
	 * @generated
	 * @ordered
	 */
	protected Range valueRange;

	/**
	 * The cached value of the '{@link #getValueRatio() <em>Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio valueRatio;

	/**
	 * The cached value of the '{@link #getValueSampledData() <em>Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData valueSampledData;

	/**
	 * The cached value of the '{@link #getValueAttachment() <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment valueAttachment;

	/**
	 * The cached value of the '{@link #getValueTime() <em>Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTime()
	 * @generated
	 * @ordered
	 */
	protected Time valueTime;

	/**
	 * The cached value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime valueDateTime;

	/**
	 * The cached value of the '{@link #getValuePeriod() <em>Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period valuePeriod;

	/**
	 * The cached value of the '{@link #getDataAbsentReason() <em>Data Absent Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAbsentReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dataAbsentReason;

	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept interpretation;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comments;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected Reference specimen;

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
	 * The cached value of the '{@link #getReferenceRange() <em>Reference Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceRange()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationReferenceRange> referenceRange;

	/**
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationRelated> related;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationComponent> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getObservation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.OBSERVATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ObservationStatus newStatus, NotificationChain msgs) {
		ObservationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ObservationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getEffectiveDateTime() {
		return effectiveDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveDateTime(DateTime newEffectiveDateTime, NotificationChain msgs) {
		DateTime oldEffectiveDateTime = effectiveDateTime;
		effectiveDateTime = newEffectiveDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, newEffectiveDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDateTime(DateTime newEffectiveDateTime) {
		if (newEffectiveDateTime != effectiveDateTime) {
			NotificationChain msgs = null;
			if (effectiveDateTime != null)
				msgs = ((InternalEObject)effectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__EFFECTIVE_DATE_TIME, null, msgs);
			if (newEffectiveDateTime != null)
				msgs = ((InternalEObject)newEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveDateTime(newEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__EFFECTIVE_DATE_TIME, newEffectiveDateTime, newEffectiveDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(Instant newIssued, NotificationChain msgs) {
		Instant oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__ISSUED, oldIssued, newIssued);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(Instant newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.OBSERVATION__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getValueQuantity() {
		return valueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueQuantity(Quantity newValueQuantity, NotificationChain msgs) {
		Quantity oldValueQuantity = valueQuantity;
		valueQuantity = newValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_QUANTITY, oldValueQuantity, newValueQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueQuantity(Quantity newValueQuantity) {
		if (newValueQuantity != valueQuantity) {
			NotificationChain msgs = null;
			if (valueQuantity != null)
				msgs = ((InternalEObject)valueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_QUANTITY, null, msgs);
			if (newValueQuantity != null)
				msgs = ((InternalEObject)newValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_QUANTITY, null, msgs);
			msgs = basicSetValueQuantity(newValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_QUANTITY, newValueQuantity, newValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getValueCodeableConcept() {
		return valueCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCodeableConcept(CodeableConcept newValueCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldValueCodeableConcept = valueCodeableConcept;
		valueCodeableConcept = newValueCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT, oldValueCodeableConcept, newValueCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueCodeableConcept(CodeableConcept newValueCodeableConcept) {
		if (newValueCodeableConcept != valueCodeableConcept) {
			NotificationChain msgs = null;
			if (valueCodeableConcept != null)
				msgs = ((InternalEObject)valueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newValueCodeableConcept != null)
				msgs = ((InternalEObject)newValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetValueCodeableConcept(newValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT, newValueCodeableConcept, newValueCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueString(org.hl7.fhir.String newValueString, NotificationChain msgs) {
		org.hl7.fhir.String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_STRING, oldValueString, newValueString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueString(org.hl7.fhir.String newValueString) {
		if (newValueString != valueString) {
			NotificationChain msgs = null;
			if (valueString != null)
				msgs = ((InternalEObject)valueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_STRING, null, msgs);
			if (newValueString != null)
				msgs = ((InternalEObject)newValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_STRING, null, msgs);
			msgs = basicSetValueString(newValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_STRING, newValueString, newValueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getValueRange() {
		return valueRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRange(Range newValueRange, NotificationChain msgs) {
		Range oldValueRange = valueRange;
		valueRange = newValueRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_RANGE, oldValueRange, newValueRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRange(Range newValueRange) {
		if (newValueRange != valueRange) {
			NotificationChain msgs = null;
			if (valueRange != null)
				msgs = ((InternalEObject)valueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_RANGE, null, msgs);
			if (newValueRange != null)
				msgs = ((InternalEObject)newValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_RANGE, null, msgs);
			msgs = basicSetValueRange(newValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_RANGE, newValueRange, newValueRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getValueRatio() {
		return valueRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRatio(Ratio newValueRatio, NotificationChain msgs) {
		Ratio oldValueRatio = valueRatio;
		valueRatio = newValueRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_RATIO, oldValueRatio, newValueRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRatio(Ratio newValueRatio) {
		if (newValueRatio != valueRatio) {
			NotificationChain msgs = null;
			if (valueRatio != null)
				msgs = ((InternalEObject)valueRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_RATIO, null, msgs);
			if (newValueRatio != null)
				msgs = ((InternalEObject)newValueRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_RATIO, null, msgs);
			msgs = basicSetValueRatio(newValueRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_RATIO, newValueRatio, newValueRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData getValueSampledData() {
		return valueSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSampledData(SampledData newValueSampledData, NotificationChain msgs) {
		SampledData oldValueSampledData = valueSampledData;
		valueSampledData = newValueSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_SAMPLED_DATA, oldValueSampledData, newValueSampledData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSampledData(SampledData newValueSampledData) {
		if (newValueSampledData != valueSampledData) {
			NotificationChain msgs = null;
			if (valueSampledData != null)
				msgs = ((InternalEObject)valueSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_SAMPLED_DATA, null, msgs);
			if (newValueSampledData != null)
				msgs = ((InternalEObject)newValueSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_SAMPLED_DATA, null, msgs);
			msgs = basicSetValueSampledData(newValueSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_SAMPLED_DATA, newValueSampledData, newValueSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getValueAttachment() {
		return valueAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAttachment(Attachment newValueAttachment, NotificationChain msgs) {
		Attachment oldValueAttachment = valueAttachment;
		valueAttachment = newValueAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_ATTACHMENT, oldValueAttachment, newValueAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueAttachment(Attachment newValueAttachment) {
		if (newValueAttachment != valueAttachment) {
			NotificationChain msgs = null;
			if (valueAttachment != null)
				msgs = ((InternalEObject)valueAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_ATTACHMENT, null, msgs);
			if (newValueAttachment != null)
				msgs = ((InternalEObject)newValueAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_ATTACHMENT, null, msgs);
			msgs = basicSetValueAttachment(newValueAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_ATTACHMENT, newValueAttachment, newValueAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getValueTime() {
		return valueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueTime(Time newValueTime, NotificationChain msgs) {
		Time oldValueTime = valueTime;
		valueTime = newValueTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_TIME, oldValueTime, newValueTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueTime(Time newValueTime) {
		if (newValueTime != valueTime) {
			NotificationChain msgs = null;
			if (valueTime != null)
				msgs = ((InternalEObject)valueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_TIME, null, msgs);
			if (newValueTime != null)
				msgs = ((InternalEObject)newValueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_TIME, null, msgs);
			msgs = basicSetValueTime(newValueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_TIME, newValueTime, newValueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getValueDateTime() {
		return valueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDateTime(DateTime newValueDateTime, NotificationChain msgs) {
		DateTime oldValueDateTime = valueDateTime;
		valueDateTime = newValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_DATE_TIME, oldValueDateTime, newValueDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDateTime(DateTime newValueDateTime) {
		if (newValueDateTime != valueDateTime) {
			NotificationChain msgs = null;
			if (valueDateTime != null)
				msgs = ((InternalEObject)valueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_DATE_TIME, null, msgs);
			if (newValueDateTime != null)
				msgs = ((InternalEObject)newValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_DATE_TIME, null, msgs);
			msgs = basicSetValueDateTime(newValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_DATE_TIME, newValueDateTime, newValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getValuePeriod() {
		return valuePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuePeriod(Period newValuePeriod, NotificationChain msgs) {
		Period oldValuePeriod = valuePeriod;
		valuePeriod = newValuePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_PERIOD, oldValuePeriod, newValuePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuePeriod(Period newValuePeriod) {
		if (newValuePeriod != valuePeriod) {
			NotificationChain msgs = null;
			if (valuePeriod != null)
				msgs = ((InternalEObject)valuePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_PERIOD, null, msgs);
			if (newValuePeriod != null)
				msgs = ((InternalEObject)newValuePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__VALUE_PERIOD, null, msgs);
			msgs = basicSetValuePeriod(newValuePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__VALUE_PERIOD, newValuePeriod, newValuePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDataAbsentReason() {
		return dataAbsentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAbsentReason(CodeableConcept newDataAbsentReason, NotificationChain msgs) {
		CodeableConcept oldDataAbsentReason = dataAbsentReason;
		dataAbsentReason = newDataAbsentReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__DATA_ABSENT_REASON, oldDataAbsentReason, newDataAbsentReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataAbsentReason(CodeableConcept newDataAbsentReason) {
		if (newDataAbsentReason != dataAbsentReason) {
			NotificationChain msgs = null;
			if (dataAbsentReason != null)
				msgs = ((InternalEObject)dataAbsentReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__DATA_ABSENT_REASON, null, msgs);
			if (newDataAbsentReason != null)
				msgs = ((InternalEObject)newDataAbsentReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__DATA_ABSENT_REASON, null, msgs);
			msgs = basicSetDataAbsentReason(newDataAbsentReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__DATA_ABSENT_REASON, newDataAbsentReason, newDataAbsentReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getInterpretation() {
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterpretation(CodeableConcept newInterpretation, NotificationChain msgs) {
		CodeableConcept oldInterpretation = interpretation;
		interpretation = newInterpretation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__INTERPRETATION, oldInterpretation, newInterpretation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretation(CodeableConcept newInterpretation) {
		if (newInterpretation != interpretation) {
			NotificationChain msgs = null;
			if (interpretation != null)
				msgs = ((InternalEObject)interpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__INTERPRETATION, null, msgs);
			if (newInterpretation != null)
				msgs = ((InternalEObject)newInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__INTERPRETATION, null, msgs);
			msgs = basicSetInterpretation(newInterpretation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__INTERPRETATION, newInterpretation, newInterpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComments(org.hl7.fhir.String newComments, NotificationChain msgs) {
		org.hl7.fhir.String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__COMMENTS, oldComments, newComments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(org.hl7.fhir.String newComments) {
		if (newComments != comments) {
			NotificationChain msgs = null;
			if (comments != null)
				msgs = ((InternalEObject)comments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__COMMENTS, null, msgs);
			if (newComments != null)
				msgs = ((InternalEObject)newComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__COMMENTS, null, msgs);
			msgs = basicSetComments(newComments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__COMMENTS, newComments, newComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableConcept newBodySite, NotificationChain msgs) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(CodeableConcept newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSpecimen() {
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimen(Reference newSpecimen, NotificationChain msgs) {
		Reference oldSpecimen = specimen;
		specimen = newSpecimen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__SPECIMEN, oldSpecimen, newSpecimen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimen(Reference newSpecimen) {
		if (newSpecimen != specimen) {
			NotificationChain msgs = null;
			if (specimen != null)
				msgs = ((InternalEObject)specimen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__SPECIMEN, null, msgs);
			if (newSpecimen != null)
				msgs = ((InternalEObject)newSpecimen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__SPECIMEN, null, msgs);
			msgs = basicSetSpecimen(newSpecimen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__SPECIMEN, newSpecimen, newSpecimen));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__DEVICE, oldDevice, newDevice);
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
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationReferenceRange> getReferenceRange() {
		if (referenceRange == null) {
			referenceRange = new EObjectContainmentEList<ObservationReferenceRange>(ObservationReferenceRange.class, this, FhirPackage.OBSERVATION__REFERENCE_RANGE);
		}
		return referenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationRelated> getRelated() {
		if (related == null) {
			related = new EObjectContainmentEList<ObservationRelated>(ObservationRelated.class, this, FhirPackage.OBSERVATION__RELATED);
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ObservationComponent>(ObservationComponent.class, this, FhirPackage.OBSERVATION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OBSERVATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.OBSERVATION__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.OBSERVATION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.OBSERVATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.OBSERVATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.OBSERVATION__EFFECTIVE_DATE_TIME:
				return basicSetEffectiveDateTime(null, msgs);
			case FhirPackage.OBSERVATION__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.OBSERVATION__ISSUED:
				return basicSetIssued(null, msgs);
			case FhirPackage.OBSERVATION__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION__VALUE_QUANTITY:
				return basicSetValueQuantity(null, msgs);
			case FhirPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT:
				return basicSetValueCodeableConcept(null, msgs);
			case FhirPackage.OBSERVATION__VALUE_STRING:
				return basicSetValueString(null, msgs);
			case FhirPackage.OBSERVATION__VALUE_RANGE:
				return basicSetValueRange(null, msgs);
			case FhirPackage.OBSERVATION__VALUE_RATIO:
				return basicSetValueRatio(null, msgs);
			case FhirPackage.OBSERVATION__VALUE_SAMPLED_DATA:
				return basicSetValueSampledData(null, msgs);
			case FhirPackage.OBSERVATION__VALUE_ATTACHMENT:
				return basicSetValueAttachment(null, msgs);
			case FhirPackage.OBSERVATION__VALUE_TIME:
				return basicSetValueTime(null, msgs);
			case FhirPackage.OBSERVATION__VALUE_DATE_TIME:
				return basicSetValueDateTime(null, msgs);
			case FhirPackage.OBSERVATION__VALUE_PERIOD:
				return basicSetValuePeriod(null, msgs);
			case FhirPackage.OBSERVATION__DATA_ABSENT_REASON:
				return basicSetDataAbsentReason(null, msgs);
			case FhirPackage.OBSERVATION__INTERPRETATION:
				return basicSetInterpretation(null, msgs);
			case FhirPackage.OBSERVATION__COMMENTS:
				return basicSetComments(null, msgs);
			case FhirPackage.OBSERVATION__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.OBSERVATION__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.OBSERVATION__SPECIMEN:
				return basicSetSpecimen(null, msgs);
			case FhirPackage.OBSERVATION__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.OBSERVATION__REFERENCE_RANGE:
				return ((InternalEList<?>)getReferenceRange()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION__RELATED:
				return ((InternalEList<?>)getRelated()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.OBSERVATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.OBSERVATION__STATUS:
				return getStatus();
			case FhirPackage.OBSERVATION__CATEGORY:
				return getCategory();
			case FhirPackage.OBSERVATION__CODE:
				return getCode();
			case FhirPackage.OBSERVATION__SUBJECT:
				return getSubject();
			case FhirPackage.OBSERVATION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.OBSERVATION__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case FhirPackage.OBSERVATION__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.OBSERVATION__ISSUED:
				return getIssued();
			case FhirPackage.OBSERVATION__PERFORMER:
				return getPerformer();
			case FhirPackage.OBSERVATION__VALUE_QUANTITY:
				return getValueQuantity();
			case FhirPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT:
				return getValueCodeableConcept();
			case FhirPackage.OBSERVATION__VALUE_STRING:
				return getValueString();
			case FhirPackage.OBSERVATION__VALUE_RANGE:
				return getValueRange();
			case FhirPackage.OBSERVATION__VALUE_RATIO:
				return getValueRatio();
			case FhirPackage.OBSERVATION__VALUE_SAMPLED_DATA:
				return getValueSampledData();
			case FhirPackage.OBSERVATION__VALUE_ATTACHMENT:
				return getValueAttachment();
			case FhirPackage.OBSERVATION__VALUE_TIME:
				return getValueTime();
			case FhirPackage.OBSERVATION__VALUE_DATE_TIME:
				return getValueDateTime();
			case FhirPackage.OBSERVATION__VALUE_PERIOD:
				return getValuePeriod();
			case FhirPackage.OBSERVATION__DATA_ABSENT_REASON:
				return getDataAbsentReason();
			case FhirPackage.OBSERVATION__INTERPRETATION:
				return getInterpretation();
			case FhirPackage.OBSERVATION__COMMENTS:
				return getComments();
			case FhirPackage.OBSERVATION__BODY_SITE:
				return getBodySite();
			case FhirPackage.OBSERVATION__METHOD:
				return getMethod();
			case FhirPackage.OBSERVATION__SPECIMEN:
				return getSpecimen();
			case FhirPackage.OBSERVATION__DEVICE:
				return getDevice();
			case FhirPackage.OBSERVATION__REFERENCE_RANGE:
				return getReferenceRange();
			case FhirPackage.OBSERVATION__RELATED:
				return getRelated();
			case FhirPackage.OBSERVATION__COMPONENT:
				return getComponent();
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
			case FhirPackage.OBSERVATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.OBSERVATION__STATUS:
				setStatus((ObservationStatus)newValue);
				return;
			case FhirPackage.OBSERVATION__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.OBSERVATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.OBSERVATION__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.OBSERVATION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.OBSERVATION__ISSUED:
				setIssued((Instant)newValue);
				return;
			case FhirPackage.OBSERVATION__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.OBSERVATION__VALUE_QUANTITY:
				setValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION__VALUE_STRING:
				setValueString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OBSERVATION__VALUE_RANGE:
				setValueRange((Range)newValue);
				return;
			case FhirPackage.OBSERVATION__VALUE_RATIO:
				setValueRatio((Ratio)newValue);
				return;
			case FhirPackage.OBSERVATION__VALUE_SAMPLED_DATA:
				setValueSampledData((SampledData)newValue);
				return;
			case FhirPackage.OBSERVATION__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)newValue);
				return;
			case FhirPackage.OBSERVATION__VALUE_TIME:
				setValueTime((Time)newValue);
				return;
			case FhirPackage.OBSERVATION__VALUE_DATE_TIME:
				setValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.OBSERVATION__VALUE_PERIOD:
				setValuePeriod((Period)newValue);
				return;
			case FhirPackage.OBSERVATION__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION__INTERPRETATION:
				setInterpretation((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION__COMMENTS:
				setComments((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OBSERVATION__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION__SPECIMEN:
				setSpecimen((Reference)newValue);
				return;
			case FhirPackage.OBSERVATION__DEVICE:
				setDevice((Reference)newValue);
				return;
			case FhirPackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRange().clear();
				getReferenceRange().addAll((Collection<? extends ObservationReferenceRange>)newValue);
				return;
			case FhirPackage.OBSERVATION__RELATED:
				getRelated().clear();
				getRelated().addAll((Collection<? extends ObservationRelated>)newValue);
				return;
			case FhirPackage.OBSERVATION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ObservationComponent>)newValue);
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
			case FhirPackage.OBSERVATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.OBSERVATION__STATUS:
				setStatus((ObservationStatus)null);
				return;
			case FhirPackage.OBSERVATION__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.OBSERVATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.OBSERVATION__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.OBSERVATION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.OBSERVATION__ISSUED:
				setIssued((Instant)null);
				return;
			case FhirPackage.OBSERVATION__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.OBSERVATION__VALUE_QUANTITY:
				setValueQuantity((Quantity)null);
				return;
			case FhirPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION__VALUE_STRING:
				setValueString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OBSERVATION__VALUE_RANGE:
				setValueRange((Range)null);
				return;
			case FhirPackage.OBSERVATION__VALUE_RATIO:
				setValueRatio((Ratio)null);
				return;
			case FhirPackage.OBSERVATION__VALUE_SAMPLED_DATA:
				setValueSampledData((SampledData)null);
				return;
			case FhirPackage.OBSERVATION__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)null);
				return;
			case FhirPackage.OBSERVATION__VALUE_TIME:
				setValueTime((Time)null);
				return;
			case FhirPackage.OBSERVATION__VALUE_DATE_TIME:
				setValueDateTime((DateTime)null);
				return;
			case FhirPackage.OBSERVATION__VALUE_PERIOD:
				setValuePeriod((Period)null);
				return;
			case FhirPackage.OBSERVATION__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION__INTERPRETATION:
				setInterpretation((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION__COMMENTS:
				setComments((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OBSERVATION__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION__SPECIMEN:
				setSpecimen((Reference)null);
				return;
			case FhirPackage.OBSERVATION__DEVICE:
				setDevice((Reference)null);
				return;
			case FhirPackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRange().clear();
				return;
			case FhirPackage.OBSERVATION__RELATED:
				getRelated().clear();
				return;
			case FhirPackage.OBSERVATION__COMPONENT:
				getComponent().clear();
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
			case FhirPackage.OBSERVATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.OBSERVATION__STATUS:
				return status != null;
			case FhirPackage.OBSERVATION__CATEGORY:
				return category != null;
			case FhirPackage.OBSERVATION__CODE:
				return code != null;
			case FhirPackage.OBSERVATION__SUBJECT:
				return subject != null;
			case FhirPackage.OBSERVATION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.OBSERVATION__EFFECTIVE_DATE_TIME:
				return effectiveDateTime != null;
			case FhirPackage.OBSERVATION__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.OBSERVATION__ISSUED:
				return issued != null;
			case FhirPackage.OBSERVATION__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.OBSERVATION__VALUE_QUANTITY:
				return valueQuantity != null;
			case FhirPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT:
				return valueCodeableConcept != null;
			case FhirPackage.OBSERVATION__VALUE_STRING:
				return valueString != null;
			case FhirPackage.OBSERVATION__VALUE_RANGE:
				return valueRange != null;
			case FhirPackage.OBSERVATION__VALUE_RATIO:
				return valueRatio != null;
			case FhirPackage.OBSERVATION__VALUE_SAMPLED_DATA:
				return valueSampledData != null;
			case FhirPackage.OBSERVATION__VALUE_ATTACHMENT:
				return valueAttachment != null;
			case FhirPackage.OBSERVATION__VALUE_TIME:
				return valueTime != null;
			case FhirPackage.OBSERVATION__VALUE_DATE_TIME:
				return valueDateTime != null;
			case FhirPackage.OBSERVATION__VALUE_PERIOD:
				return valuePeriod != null;
			case FhirPackage.OBSERVATION__DATA_ABSENT_REASON:
				return dataAbsentReason != null;
			case FhirPackage.OBSERVATION__INTERPRETATION:
				return interpretation != null;
			case FhirPackage.OBSERVATION__COMMENTS:
				return comments != null;
			case FhirPackage.OBSERVATION__BODY_SITE:
				return bodySite != null;
			case FhirPackage.OBSERVATION__METHOD:
				return method != null;
			case FhirPackage.OBSERVATION__SPECIMEN:
				return specimen != null;
			case FhirPackage.OBSERVATION__DEVICE:
				return device != null;
			case FhirPackage.OBSERVATION__REFERENCE_RANGE:
				return referenceRange != null && !referenceRange.isEmpty();
			case FhirPackage.OBSERVATION__RELATED:
				return related != null && !related.isEmpty();
			case FhirPackage.OBSERVATION__COMPONENT:
				return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObservationImpl
