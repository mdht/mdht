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
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationStatus;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getWasNotGiven <em>Was Not Given</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getReasonNotGiven <em>Reason Not Given</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getReasonGiven <em>Reason Given</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getEffectiveTimeDateTime <em>Effective Time Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getEffectiveTimePeriod <em>Effective Time Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getDosage <em>Dosage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationAdministrationImpl extends DomainResourceImpl implements MedicationAdministration {
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
	protected MedicationAdministrationStatus status;

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
	 * The cached value of the '{@link #getPractitioner() <em>Practitioner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitioner()
	 * @generated
	 * @ordered
	 */
	protected Reference practitioner;

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
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference prescription;

	/**
	 * The cached value of the '{@link #getWasNotGiven() <em>Was Not Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWasNotGiven()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean wasNotGiven;

	/**
	 * The cached value of the '{@link #getReasonNotGiven() <em>Reason Not Given</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonNotGiven()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonNotGiven;

	/**
	 * The cached value of the '{@link #getReasonGiven() <em>Reason Given</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonGiven()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonGiven;

	/**
	 * The cached value of the '{@link #getEffectiveTimeDateTime() <em>Effective Time Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTimeDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveTimeDateTime;

	/**
	 * The cached value of the '{@link #getEffectiveTimePeriod() <em>Effective Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectiveTimePeriod;

	/**
	 * The cached value of the '{@link #getMedication() <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected Reference medication;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> device;

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
	 * The cached value of the '{@link #getDosage() <em>Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosage()
	 * @generated
	 * @ordered
	 */
	protected MedicationAdministrationDosage dosage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationAdministration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationAdministrationStatus newStatus, NotificationChain msgs) {
		MedicationAdministrationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationAdministrationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPractitioner() {
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPractitioner(Reference newPractitioner, NotificationChain msgs) {
		Reference oldPractitioner = practitioner;
		practitioner = newPractitioner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PRACTITIONER, oldPractitioner, newPractitioner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPractitioner(Reference newPractitioner) {
		if (newPractitioner != practitioner) {
			NotificationChain msgs = null;
			if (practitioner != null)
				msgs = ((InternalEObject)practitioner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PRACTITIONER, null, msgs);
			if (newPractitioner != null)
				msgs = ((InternalEObject)newPractitioner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PRACTITIONER, null, msgs);
			msgs = basicSetPractitioner(newPractitioner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PRACTITIONER, newPractitioner, newPractitioner));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescription(Reference newPrescription, NotificationChain msgs) {
		Reference oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION, oldPrescription, newPrescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescription(Reference newPrescription) {
		if (newPrescription != prescription) {
			NotificationChain msgs = null;
			if (prescription != null)
				msgs = ((InternalEObject)prescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION, null, msgs);
			if (newPrescription != null)
				msgs = ((InternalEObject)newPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION, null, msgs);
			msgs = basicSetPrescription(newPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION, newPrescription, newPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getWasNotGiven() {
		return wasNotGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasNotGiven(org.hl7.fhir.Boolean newWasNotGiven, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldWasNotGiven = wasNotGiven;
		wasNotGiven = newWasNotGiven;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN, oldWasNotGiven, newWasNotGiven);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasNotGiven(org.hl7.fhir.Boolean newWasNotGiven) {
		if (newWasNotGiven != wasNotGiven) {
			NotificationChain msgs = null;
			if (wasNotGiven != null)
				msgs = ((InternalEObject)wasNotGiven).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN, null, msgs);
			if (newWasNotGiven != null)
				msgs = ((InternalEObject)newWasNotGiven).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN, null, msgs);
			msgs = basicSetWasNotGiven(newWasNotGiven, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN, newWasNotGiven, newWasNotGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonNotGiven() {
		if (reasonNotGiven == null) {
			reasonNotGiven = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN);
		}
		return reasonNotGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonGiven() {
		if (reasonGiven == null) {
			reasonGiven = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN);
		}
		return reasonGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getEffectiveTimeDateTime() {
		return effectiveTimeDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveTimeDateTime(DateTime newEffectiveTimeDateTime, NotificationChain msgs) {
		DateTime oldEffectiveTimeDateTime = effectiveTimeDateTime;
		effectiveTimeDateTime = newEffectiveTimeDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_DATE_TIME, oldEffectiveTimeDateTime, newEffectiveTimeDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveTimeDateTime(DateTime newEffectiveTimeDateTime) {
		if (newEffectiveTimeDateTime != effectiveTimeDateTime) {
			NotificationChain msgs = null;
			if (effectiveTimeDateTime != null)
				msgs = ((InternalEObject)effectiveTimeDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_DATE_TIME, null, msgs);
			if (newEffectiveTimeDateTime != null)
				msgs = ((InternalEObject)newEffectiveTimeDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveTimeDateTime(newEffectiveTimeDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_DATE_TIME, newEffectiveTimeDateTime, newEffectiveTimeDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectiveTimePeriod() {
		return effectiveTimePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveTimePeriod(Period newEffectiveTimePeriod, NotificationChain msgs) {
		Period oldEffectiveTimePeriod = effectiveTimePeriod;
		effectiveTimePeriod = newEffectiveTimePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_PERIOD, oldEffectiveTimePeriod, newEffectiveTimePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveTimePeriod(Period newEffectiveTimePeriod) {
		if (newEffectiveTimePeriod != effectiveTimePeriod) {
			NotificationChain msgs = null;
			if (effectiveTimePeriod != null)
				msgs = ((InternalEObject)effectiveTimePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_PERIOD, null, msgs);
			if (newEffectiveTimePeriod != null)
				msgs = ((InternalEObject)newEffectiveTimePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_PERIOD, null, msgs);
			msgs = basicSetEffectiveTimePeriod(newEffectiveTimePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_PERIOD, newEffectiveTimePeriod, newEffectiveTimePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getMedication() {
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedication(Reference newMedication, NotificationChain msgs) {
		Reference oldMedication = medication;
		medication = newMedication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION, oldMedication, newMedication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedication(Reference newMedication) {
		if (newMedication != medication) {
			NotificationChain msgs = null;
			if (medication != null)
				msgs = ((InternalEObject)medication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION, null, msgs);
			if (newMedication != null)
				msgs = ((InternalEObject)newMedication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION, null, msgs);
			msgs = basicSetMedication(newMedication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION, newMedication, newMedication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_ADMINISTRATION__DEVICE);
		}
		return device;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__NOTE, oldNote, newNote);
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
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__NOTE, newNote, newNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationDosage getDosage() {
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDosage(MedicationAdministrationDosage newDosage, NotificationChain msgs) {
		MedicationAdministrationDosage oldDosage = dosage;
		dosage = newDosage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE, oldDosage, newDosage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDosage(MedicationAdministrationDosage newDosage) {
		if (newDosage != dosage) {
			NotificationChain msgs = null;
			if (dosage != null)
				msgs = ((InternalEObject)dosage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE, null, msgs);
			if (newDosage != null)
				msgs = ((InternalEObject)newDosage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE, null, msgs);
			msgs = basicSetDosage(newDosage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE, newDosage, newDosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__PRACTITIONER:
				return basicSetPractitioner(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				return basicSetPrescription(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN:
				return basicSetWasNotGiven(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				return ((InternalEList<?>)getReasonNotGiven()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				return ((InternalEList<?>)getReasonGiven()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_DATE_TIME:
				return basicSetEffectiveTimeDateTime(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_PERIOD:
				return basicSetEffectiveTimePeriod(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION:
				return basicSetMedication(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__NOTE:
				return basicSetNote(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return basicSetDosage(null, msgs);
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
			case FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION_ADMINISTRATION__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_ADMINISTRATION__PATIENT:
				return getPatient();
			case FhirPackage.MEDICATION_ADMINISTRATION__PRACTITIONER:
				return getPractitioner();
			case FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				return getPrescription();
			case FhirPackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN:
				return getWasNotGiven();
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				return getReasonNotGiven();
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				return getReasonGiven();
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_DATE_TIME:
				return getEffectiveTimeDateTime();
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_PERIOD:
				return getEffectiveTimePeriod();
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION:
				return getMedication();
			case FhirPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return getDevice();
			case FhirPackage.MEDICATION_ADMINISTRATION__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return getDosage();
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
			case FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__STATUS:
				setStatus((MedicationAdministrationStatus)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PRACTITIONER:
				setPractitioner((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				setPrescription((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN:
				setWasNotGiven((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				getReasonNotGiven().clear();
				getReasonNotGiven().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				getReasonGiven().clear();
				getReasonGiven().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_DATE_TIME:
				setEffectiveTimeDateTime((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_PERIOD:
				setEffectiveTimePeriod((Period)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION:
				setMedication((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__NOTE:
				setNote((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				setDosage((MedicationAdministrationDosage)newValue);
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
			case FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__STATUS:
				setStatus((MedicationAdministrationStatus)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PRACTITIONER:
				setPractitioner((Reference)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				setPrescription((Reference)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN:
				setWasNotGiven((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				getReasonNotGiven().clear();
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				getReasonGiven().clear();
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_DATE_TIME:
				setEffectiveTimeDateTime((DateTime)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_PERIOD:
				setEffectiveTimePeriod((Period)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION:
				setMedication((Reference)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__DEVICE:
				getDevice().clear();
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__NOTE:
				setNote((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				setDosage((MedicationAdministrationDosage)null);
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
			case FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION_ADMINISTRATION__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__PATIENT:
				return patient != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__PRACTITIONER:
				return practitioner != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				return prescription != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN:
				return wasNotGiven != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				return reasonNotGiven != null && !reasonNotGiven.isEmpty();
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				return reasonGiven != null && !reasonGiven.isEmpty();
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_DATE_TIME:
				return effectiveTimeDateTime != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIME_PERIOD:
				return effectiveTimePeriod != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION:
				return medication != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return device != null && !device.isEmpty();
			case FhirPackage.MEDICATION_ADMINISTRATION__NOTE:
				return note != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return dosage != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationAdministrationImpl
