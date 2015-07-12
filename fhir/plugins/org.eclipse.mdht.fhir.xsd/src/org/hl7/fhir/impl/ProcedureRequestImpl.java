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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.ProcedureRequest;
import org.hl7.fhir.ProcedureRequestBodySite;
import org.hl7.fhir.ProcedureRequestPriority;
import org.hl7.fhir.ProcedureRequestStatus;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getAsNeededBoolean <em>As Needed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getOrderedOn <em>Ordered On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureRequestImpl extends DomainResourceImpl implements ProcedureRequest {
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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

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
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureRequestBodySite> bodySite;

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
	 * The cached value of the '{@link #getTimingDateTime() <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime timingDateTime;

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
	 * The cached value of the '{@link #getTimingTiming() <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timingTiming;

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
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ProcedureRequestStatus status;

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
	 * The cached value of the '{@link #getAsNeededBoolean() <em>As Needed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean asNeededBoolean;

	/**
	 * The cached value of the '{@link #getAsNeededCodeableConcept() <em>As Needed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept asNeededCodeableConcept;

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
	 * The cached value of the '{@link #getOrderer() <em>Orderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderer()
	 * @generated
	 * @ordered
	 */
	protected Reference orderer;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected ProcedureRequestPriority priority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcedureRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PROCEDURE_REQUEST__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureRequestBodySite> getBodySite() {
		if (bodySite == null) {
			bodySite = new EObjectContainmentEList<ProcedureRequestBodySite>(ProcedureRequestBodySite.class, this, FhirPackage.PROCEDURE_REQUEST__BODY_SITE);
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getIndication() {
		if (indication == null) {
			indication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE_REQUEST__INDICATION);
		}
		return indication;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__TIMING_DATE_TIME, oldTimingDateTime, newTimingDateTime);
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
				msgs = ((InternalEObject)timingDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__TIMING_DATE_TIME, null, msgs);
			if (newTimingDateTime != null)
				msgs = ((InternalEObject)newTimingDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__TIMING_DATE_TIME, null, msgs);
			msgs = basicSetTimingDateTime(newTimingDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__TIMING_DATE_TIME, newTimingDateTime, newTimingDateTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__TIMING_PERIOD, oldTimingPeriod, newTimingPeriod);
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
				msgs = ((InternalEObject)timingPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__TIMING_PERIOD, null, msgs);
			if (newTimingPeriod != null)
				msgs = ((InternalEObject)newTimingPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__TIMING_PERIOD, null, msgs);
			msgs = basicSetTimingPeriod(newTimingPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__TIMING_PERIOD, newTimingPeriod, newTimingPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__TIMING_TIMING, oldTimingTiming, newTimingTiming);
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
				msgs = ((InternalEObject)timingTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__TIMING_TIMING, null, msgs);
			if (newTimingTiming != null)
				msgs = ((InternalEObject)newTimingTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__TIMING_TIMING, null, msgs);
			msgs = basicSetTimingTiming(newTimingTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__TIMING_TIMING, newTimingTiming, newTimingTiming));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ProcedureRequestStatus newStatus, NotificationChain msgs) {
		ProcedureRequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ProcedureRequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.PROCEDURE_REQUEST__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAsNeededBoolean() {
		return asNeededBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededBoolean(org.hl7.fhir.Boolean newAsNeededBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAsNeededBoolean = asNeededBoolean;
		asNeededBoolean = newAsNeededBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN, oldAsNeededBoolean, newAsNeededBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsNeededBoolean(org.hl7.fhir.Boolean newAsNeededBoolean) {
		if (newAsNeededBoolean != asNeededBoolean) {
			NotificationChain msgs = null;
			if (asNeededBoolean != null)
				msgs = ((InternalEObject)asNeededBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN, null, msgs);
			if (newAsNeededBoolean != null)
				msgs = ((InternalEObject)newAsNeededBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN, null, msgs);
			msgs = basicSetAsNeededBoolean(newAsNeededBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN, newAsNeededBoolean, newAsNeededBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAsNeededCodeableConcept() {
		return asNeededCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededCodeableConcept(CodeableConcept newAsNeededCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldAsNeededCodeableConcept = asNeededCodeableConcept;
		asNeededCodeableConcept = newAsNeededCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT, oldAsNeededCodeableConcept, newAsNeededCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsNeededCodeableConcept(CodeableConcept newAsNeededCodeableConcept) {
		if (newAsNeededCodeableConcept != asNeededCodeableConcept) {
			NotificationChain msgs = null;
			if (asNeededCodeableConcept != null)
				msgs = ((InternalEObject)asNeededCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			if (newAsNeededCodeableConcept != null)
				msgs = ((InternalEObject)newAsNeededCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetAsNeededCodeableConcept(newAsNeededCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT, newAsNeededCodeableConcept, newAsNeededCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ORDERED_ON, oldOrderedOn, newOrderedOn);
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
				msgs = ((InternalEObject)orderedOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ORDERED_ON, null, msgs);
			if (newOrderedOn != null)
				msgs = ((InternalEObject)newOrderedOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ORDERED_ON, null, msgs);
			msgs = basicSetOrderedOn(newOrderedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ORDERED_ON, newOrderedOn, newOrderedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrderer() {
		return orderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderer(Reference newOrderer, NotificationChain msgs) {
		Reference oldOrderer = orderer;
		orderer = newOrderer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ORDERER, oldOrderer, newOrderer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderer(Reference newOrderer) {
		if (newOrderer != orderer) {
			NotificationChain msgs = null;
			if (orderer != null)
				msgs = ((InternalEObject)orderer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ORDERER, null, msgs);
			if (newOrderer != null)
				msgs = ((InternalEObject)newOrderer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ORDERER, null, msgs);
			msgs = basicSetOrderer(newOrderer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ORDERER, newOrderer, newOrderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(ProcedureRequestPriority newPriority, NotificationChain msgs) {
		ProcedureRequestPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(ProcedureRequestPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCEDURE_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE_REQUEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__BODY_SITE:
				return ((InternalEList<?>)getBodySite()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE_REQUEST__INDICATION:
				return ((InternalEList<?>)getIndication()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE_REQUEST__TIMING_DATE_TIME:
				return basicSetTimingDateTime(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__TIMING_PERIOD:
				return basicSetTimingPeriod(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__TIMING_TIMING:
				return basicSetTimingTiming(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN:
				return basicSetAsNeededBoolean(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT:
				return basicSetAsNeededCodeableConcept(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__ORDERED_ON:
				return basicSetOrderedOn(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__ORDERER:
				return basicSetOrderer(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__PRIORITY:
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
			case FhirPackage.PROCEDURE_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PROCEDURE_REQUEST__SUBJECT:
				return getSubject();
			case FhirPackage.PROCEDURE_REQUEST__TYPE:
				return getType();
			case FhirPackage.PROCEDURE_REQUEST__BODY_SITE:
				return getBodySite();
			case FhirPackage.PROCEDURE_REQUEST__INDICATION:
				return getIndication();
			case FhirPackage.PROCEDURE_REQUEST__TIMING_DATE_TIME:
				return getTimingDateTime();
			case FhirPackage.PROCEDURE_REQUEST__TIMING_PERIOD:
				return getTimingPeriod();
			case FhirPackage.PROCEDURE_REQUEST__TIMING_TIMING:
				return getTimingTiming();
			case FhirPackage.PROCEDURE_REQUEST__ENCOUNTER:
				return getEncounter();
			case FhirPackage.PROCEDURE_REQUEST__PERFORMER:
				return getPerformer();
			case FhirPackage.PROCEDURE_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.PROCEDURE_REQUEST__NOTES:
				return getNotes();
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN:
				return getAsNeededBoolean();
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT:
				return getAsNeededCodeableConcept();
			case FhirPackage.PROCEDURE_REQUEST__ORDERED_ON:
				return getOrderedOn();
			case FhirPackage.PROCEDURE_REQUEST__ORDERER:
				return getOrderer();
			case FhirPackage.PROCEDURE_REQUEST__PRIORITY:
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
			case FhirPackage.PROCEDURE_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__BODY_SITE:
				getBodySite().clear();
				getBodySite().addAll((Collection<? extends ProcedureRequestBodySite>)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__INDICATION:
				getIndication().clear();
				getIndication().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__TIMING_PERIOD:
				setTimingPeriod((Period)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__TIMING_TIMING:
				setTimingTiming((Timing)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__STATUS:
				setStatus((ProcedureRequestStatus)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ORDERED_ON:
				setOrderedOn((DateTime)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ORDERER:
				setOrderer((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__PRIORITY:
				setPriority((ProcedureRequestPriority)newValue);
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
			case FhirPackage.PROCEDURE_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PROCEDURE_REQUEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__BODY_SITE:
				getBodySite().clear();
				return;
			case FhirPackage.PROCEDURE_REQUEST__INDICATION:
				getIndication().clear();
				return;
			case FhirPackage.PROCEDURE_REQUEST__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__TIMING_PERIOD:
				setTimingPeriod((Period)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__TIMING_TIMING:
				setTimingTiming((Timing)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__STATUS:
				setStatus((ProcedureRequestStatus)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__NOTES:
				getNotes().clear();
				return;
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ORDERED_ON:
				setOrderedOn((DateTime)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ORDERER:
				setOrderer((Reference)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__PRIORITY:
				setPriority((ProcedureRequestPriority)null);
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
			case FhirPackage.PROCEDURE_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PROCEDURE_REQUEST__SUBJECT:
				return subject != null;
			case FhirPackage.PROCEDURE_REQUEST__TYPE:
				return type != null;
			case FhirPackage.PROCEDURE_REQUEST__BODY_SITE:
				return bodySite != null && !bodySite.isEmpty();
			case FhirPackage.PROCEDURE_REQUEST__INDICATION:
				return indication != null && !indication.isEmpty();
			case FhirPackage.PROCEDURE_REQUEST__TIMING_DATE_TIME:
				return timingDateTime != null;
			case FhirPackage.PROCEDURE_REQUEST__TIMING_PERIOD:
				return timingPeriod != null;
			case FhirPackage.PROCEDURE_REQUEST__TIMING_TIMING:
				return timingTiming != null;
			case FhirPackage.PROCEDURE_REQUEST__ENCOUNTER:
				return encounter != null;
			case FhirPackage.PROCEDURE_REQUEST__PERFORMER:
				return performer != null;
			case FhirPackage.PROCEDURE_REQUEST__STATUS:
				return status != null;
			case FhirPackage.PROCEDURE_REQUEST__NOTES:
				return notes != null && !notes.isEmpty();
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN:
				return asNeededBoolean != null;
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT:
				return asNeededCodeableConcept != null;
			case FhirPackage.PROCEDURE_REQUEST__ORDERED_ON:
				return orderedOn != null;
			case FhirPackage.PROCEDURE_REQUEST__ORDERER:
				return orderer != null;
			case FhirPackage.PROCEDURE_REQUEST__PRIORITY:
				return priority != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcedureRequestImpl
