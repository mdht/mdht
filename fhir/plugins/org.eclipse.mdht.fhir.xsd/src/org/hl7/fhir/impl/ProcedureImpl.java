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
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureBodySite;
import org.hl7.fhir.ProcedureDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProcedureRelatedItem;
import org.hl7.fhir.ProcedureStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPerformedDateTime <em>Performed Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPerformedPeriod <em>Performed Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReport <em>Report</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getComplication <em>Complication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getFollowUp <em>Follow Up</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getUsed <em>Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends DomainResourceImpl implements Procedure {
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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ProcedureStatus status;

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
	protected EList<ProcedureBodySite> bodySite;

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
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedurePerformer> performer;

	/**
	 * The cached value of the '{@link #getPerformedDateTime() <em>Performed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime performedDateTime;

	/**
	 * The cached value of the '{@link #getPerformedPeriod() <em>Performed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period performedPeriod;

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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getReport() <em>Report</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> report;

	/**
	 * The cached value of the '{@link #getComplication() <em>Complication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> complication;

	/**
	 * The cached value of the '{@link #getFollowUp() <em>Follow Up</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowUp()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> followUp;

	/**
	 * The cached value of the '{@link #getRelatedItem() <em>Related Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureRelatedItem> relatedItem;

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
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureDevice> device;

	/**
	 * The cached value of the '{@link #getUsed() <em>Used</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> used;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PROCEDURE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ProcedureStatus newStatus, NotificationChain msgs) {
		ProcedureStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ProcedureStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureBodySite> getBodySite() {
		if (bodySite == null) {
			bodySite = new EObjectContainmentEList<ProcedureBodySite>(ProcedureBodySite.class, this, FhirPackage.PROCEDURE__BODY_SITE);
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
			indication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__INDICATION);
		}
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedurePerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<ProcedurePerformer>(ProcedurePerformer.class, this, FhirPackage.PROCEDURE__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getPerformedDateTime() {
		return performedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedDateTime(DateTime newPerformedDateTime, NotificationChain msgs) {
		DateTime oldPerformedDateTime = performedDateTime;
		performedDateTime = newPerformedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, oldPerformedDateTime, newPerformedDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedDateTime(DateTime newPerformedDateTime) {
		if (newPerformedDateTime != performedDateTime) {
			NotificationChain msgs = null;
			if (performedDateTime != null)
				msgs = ((InternalEObject)performedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, null, msgs);
			if (newPerformedDateTime != null)
				msgs = ((InternalEObject)newPerformedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, null, msgs);
			msgs = basicSetPerformedDateTime(newPerformedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, newPerformedDateTime, newPerformedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPerformedPeriod() {
		return performedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedPeriod(Period newPerformedPeriod, NotificationChain msgs) {
		Period oldPerformedPeriod = performedPeriod;
		performedPeriod = newPerformedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_PERIOD, oldPerformedPeriod, newPerformedPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedPeriod(Period newPerformedPeriod) {
		if (newPerformedPeriod != performedPeriod) {
			NotificationChain msgs = null;
			if (performedPeriod != null)
				msgs = ((InternalEObject)performedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_PERIOD, null, msgs);
			if (newPerformedPeriod != null)
				msgs = ((InternalEObject)newPerformedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_PERIOD, null, msgs);
			msgs = basicSetPerformedPeriod(newPerformedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_PERIOD, newPerformedPeriod, newPerformedPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__ENCOUNTER, newEncounter, newEncounter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(CodeableConcept newOutcome, NotificationChain msgs) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(CodeableConcept newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReport() {
		if (report == null) {
			report = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__REPORT);
		}
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getComplication() {
		if (complication == null) {
			complication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__COMPLICATION);
		}
		return complication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFollowUp() {
		if (followUp == null) {
			followUp = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__FOLLOW_UP);
		}
		return followUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureRelatedItem> getRelatedItem() {
		if (relatedItem == null) {
			relatedItem = new EObjectContainmentEList<ProcedureRelatedItem>(ProcedureRelatedItem.class, this, FhirPackage.PROCEDURE__RELATED_ITEM);
		}
		return relatedItem;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__NOTES, oldNotes, newNotes);
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
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureDevice> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<ProcedureDevice>(ProcedureDevice.class, this, FhirPackage.PROCEDURE__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getUsed() {
		if (used == null) {
			used = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__USED);
		}
		return used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.PROCEDURE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PROCEDURE__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.PROCEDURE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PROCEDURE__BODY_SITE:
				return ((InternalEList<?>)getBodySite()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__INDICATION:
				return ((InternalEList<?>)getIndication()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				return basicSetPerformedDateTime(null, msgs);
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				return basicSetPerformedPeriod(null, msgs);
			case FhirPackage.PROCEDURE__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.PROCEDURE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.PROCEDURE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.PROCEDURE__REPORT:
				return ((InternalEList<?>)getReport()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__COMPLICATION:
				return ((InternalEList<?>)getComplication()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return ((InternalEList<?>)getFollowUp()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__RELATED_ITEM:
				return ((InternalEList<?>)getRelatedItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__NOTES:
				return basicSetNotes(null, msgs);
			case FhirPackage.PROCEDURE__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__USED:
				return ((InternalEList<?>)getUsed()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PROCEDURE__PATIENT:
				return getPatient();
			case FhirPackage.PROCEDURE__STATUS:
				return getStatus();
			case FhirPackage.PROCEDURE__CATEGORY:
				return getCategory();
			case FhirPackage.PROCEDURE__TYPE:
				return getType();
			case FhirPackage.PROCEDURE__BODY_SITE:
				return getBodySite();
			case FhirPackage.PROCEDURE__INDICATION:
				return getIndication();
			case FhirPackage.PROCEDURE__PERFORMER:
				return getPerformer();
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				return getPerformedDateTime();
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				return getPerformedPeriod();
			case FhirPackage.PROCEDURE__ENCOUNTER:
				return getEncounter();
			case FhirPackage.PROCEDURE__LOCATION:
				return getLocation();
			case FhirPackage.PROCEDURE__OUTCOME:
				return getOutcome();
			case FhirPackage.PROCEDURE__REPORT:
				return getReport();
			case FhirPackage.PROCEDURE__COMPLICATION:
				return getComplication();
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return getFollowUp();
			case FhirPackage.PROCEDURE__RELATED_ITEM:
				return getRelatedItem();
			case FhirPackage.PROCEDURE__NOTES:
				return getNotes();
			case FhirPackage.PROCEDURE__DEVICE:
				return getDevice();
			case FhirPackage.PROCEDURE__USED:
				return getUsed();
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PROCEDURE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__STATUS:
				setStatus((ProcedureStatus)newValue);
				return;
			case FhirPackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__BODY_SITE:
				getBodySite().clear();
				getBodySite().addAll((Collection<? extends ProcedureBodySite>)newValue);
				return;
			case FhirPackage.PROCEDURE__INDICATION:
				getIndication().clear();
				getIndication().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends ProcedurePerformer>)newValue);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				setPerformedDateTime((DateTime)newValue);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				setPerformedPeriod((Period)newValue);
				return;
			case FhirPackage.PROCEDURE__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__REPORT:
				getReport().clear();
				getReport().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__COMPLICATION:
				getComplication().clear();
				getComplication().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				getFollowUp().clear();
				getFollowUp().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__RELATED_ITEM:
				getRelatedItem().clear();
				getRelatedItem().addAll((Collection<? extends ProcedureRelatedItem>)newValue);
				return;
			case FhirPackage.PROCEDURE__NOTES:
				setNotes((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PROCEDURE__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends ProcedureDevice>)newValue);
				return;
			case FhirPackage.PROCEDURE__USED:
				getUsed().clear();
				getUsed().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PROCEDURE__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.PROCEDURE__STATUS:
				setStatus((ProcedureStatus)null);
				return;
			case FhirPackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__BODY_SITE:
				getBodySite().clear();
				return;
			case FhirPackage.PROCEDURE__INDICATION:
				getIndication().clear();
				return;
			case FhirPackage.PROCEDURE__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				setPerformedDateTime((DateTime)null);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				setPerformedPeriod((Period)null);
				return;
			case FhirPackage.PROCEDURE__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.PROCEDURE__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__REPORT:
				getReport().clear();
				return;
			case FhirPackage.PROCEDURE__COMPLICATION:
				getComplication().clear();
				return;
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				getFollowUp().clear();
				return;
			case FhirPackage.PROCEDURE__RELATED_ITEM:
				getRelatedItem().clear();
				return;
			case FhirPackage.PROCEDURE__NOTES:
				setNotes((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PROCEDURE__DEVICE:
				getDevice().clear();
				return;
			case FhirPackage.PROCEDURE__USED:
				getUsed().clear();
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PROCEDURE__PATIENT:
				return patient != null;
			case FhirPackage.PROCEDURE__STATUS:
				return status != null;
			case FhirPackage.PROCEDURE__CATEGORY:
				return category != null;
			case FhirPackage.PROCEDURE__TYPE:
				return type != null;
			case FhirPackage.PROCEDURE__BODY_SITE:
				return bodySite != null && !bodySite.isEmpty();
			case FhirPackage.PROCEDURE__INDICATION:
				return indication != null && !indication.isEmpty();
			case FhirPackage.PROCEDURE__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				return performedDateTime != null;
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				return performedPeriod != null;
			case FhirPackage.PROCEDURE__ENCOUNTER:
				return encounter != null;
			case FhirPackage.PROCEDURE__LOCATION:
				return location != null;
			case FhirPackage.PROCEDURE__OUTCOME:
				return outcome != null;
			case FhirPackage.PROCEDURE__REPORT:
				return report != null && !report.isEmpty();
			case FhirPackage.PROCEDURE__COMPLICATION:
				return complication != null && !complication.isEmpty();
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return followUp != null && !followUp.isEmpty();
			case FhirPackage.PROCEDURE__RELATED_ITEM:
				return relatedItem != null && !relatedItem.isEmpty();
			case FhirPackage.PROCEDURE__NOTES:
				return notes != null;
			case FhirPackage.PROCEDURE__DEVICE:
				return device != null && !device.isEmpty();
			case FhirPackage.PROCEDURE__USED:
				return used != null && !used.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcedureImpl
