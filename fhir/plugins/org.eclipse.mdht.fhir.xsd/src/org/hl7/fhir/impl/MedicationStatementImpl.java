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
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementDosage;
import org.hl7.fhir.MedicationStatementStatus;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getWasNotGiven <em>Was Not Given</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getReasonNotGiven <em>Reason Not Given</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getReasonForUseCodeableConcept <em>Reason For Use Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getReasonForUseReference <em>Reason For Use Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getDosage <em>Dosage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationStatementImpl extends DomainResourceImpl implements MedicationStatement {
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
	 * The cached value of the '{@link #getInformationSource() <em>Information Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSource()
	 * @generated
	 * @ordered
	 */
	protected Reference informationSource;

	/**
	 * The cached value of the '{@link #getDateAsserted() <em>Date Asserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAsserted()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateAsserted;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MedicationStatementStatus status;

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
	 * The cached value of the '{@link #getReasonForUseCodeableConcept() <em>Reason For Use Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForUseCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonForUseCodeableConcept;

	/**
	 * The cached value of the '{@link #getReasonForUseReference() <em>Reason For Use Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForUseReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reasonForUseReference;

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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String note;

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
	 * The cached value of the '{@link #getDosage() <em>Dosage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosage()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationStatementDosage> dosage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION_STATEMENT__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getInformationSource() {
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationSource(Reference newInformationSource, NotificationChain msgs) {
		Reference oldInformationSource = informationSource;
		informationSource = newInformationSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, oldInformationSource, newInformationSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationSource(Reference newInformationSource) {
		if (newInformationSource != informationSource) {
			NotificationChain msgs = null;
			if (informationSource != null)
				msgs = ((InternalEObject)informationSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, null, msgs);
			if (newInformationSource != null)
				msgs = ((InternalEObject)newInformationSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, null, msgs);
			msgs = basicSetInformationSource(newInformationSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, newInformationSource, newInformationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateAsserted() {
		return dateAsserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateAsserted(DateTime newDateAsserted, NotificationChain msgs) {
		DateTime oldDateAsserted = dateAsserted;
		dateAsserted = newDateAsserted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, oldDateAsserted, newDateAsserted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAsserted(DateTime newDateAsserted) {
		if (newDateAsserted != dateAsserted) {
			NotificationChain msgs = null;
			if (dateAsserted != null)
				msgs = ((InternalEObject)dateAsserted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, null, msgs);
			if (newDateAsserted != null)
				msgs = ((InternalEObject)newDateAsserted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, null, msgs);
			msgs = basicSetDateAsserted(newDateAsserted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, newDateAsserted, newDateAsserted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationStatementStatus newStatus, NotificationChain msgs) {
		MedicationStatementStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationStatementStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__WAS_NOT_GIVEN, oldWasNotGiven, newWasNotGiven);
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
				msgs = ((InternalEObject)wasNotGiven).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__WAS_NOT_GIVEN, null, msgs);
			if (newWasNotGiven != null)
				msgs = ((InternalEObject)newWasNotGiven).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__WAS_NOT_GIVEN, null, msgs);
			msgs = basicSetWasNotGiven(newWasNotGiven, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__WAS_NOT_GIVEN, newWasNotGiven, newWasNotGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonNotGiven() {
		if (reasonNotGiven == null) {
			reasonNotGiven = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_STATEMENT__REASON_NOT_GIVEN);
		}
		return reasonNotGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReasonForUseCodeableConcept() {
		return reasonForUseCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonForUseCodeableConcept(CodeableConcept newReasonForUseCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldReasonForUseCodeableConcept = reasonForUseCodeableConcept;
		reasonForUseCodeableConcept = newReasonForUseCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT, oldReasonForUseCodeableConcept, newReasonForUseCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonForUseCodeableConcept(CodeableConcept newReasonForUseCodeableConcept) {
		if (newReasonForUseCodeableConcept != reasonForUseCodeableConcept) {
			NotificationChain msgs = null;
			if (reasonForUseCodeableConcept != null)
				msgs = ((InternalEObject)reasonForUseCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT, null, msgs);
			if (newReasonForUseCodeableConcept != null)
				msgs = ((InternalEObject)newReasonForUseCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetReasonForUseCodeableConcept(newReasonForUseCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT, newReasonForUseCodeableConcept, newReasonForUseCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReasonForUseReference() {
		return reasonForUseReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonForUseReference(Reference newReasonForUseReference, NotificationChain msgs) {
		Reference oldReasonForUseReference = reasonForUseReference;
		reasonForUseReference = newReasonForUseReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE, oldReasonForUseReference, newReasonForUseReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonForUseReference(Reference newReasonForUseReference) {
		if (newReasonForUseReference != reasonForUseReference) {
			NotificationChain msgs = null;
			if (reasonForUseReference != null)
				msgs = ((InternalEObject)reasonForUseReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE, null, msgs);
			if (newReasonForUseReference != null)
				msgs = ((InternalEObject)newReasonForUseReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE, null, msgs);
			msgs = basicSetReasonForUseReference(newReasonForUseReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE, newReasonForUseReference, newReasonForUseReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, newEffectiveDateTime);
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
				msgs = ((InternalEObject)effectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, null, msgs);
			if (newEffectiveDateTime != null)
				msgs = ((InternalEObject)newEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveDateTime(newEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, newEffectiveDateTime, newEffectiveDateTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__NOTE, oldNote, newNote);
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
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__NOTE, newNote, newNote));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__MEDICATION, oldMedication, newMedication);
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
				msgs = ((InternalEObject)medication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__MEDICATION, null, msgs);
			if (newMedication != null)
				msgs = ((InternalEObject)newMedication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__MEDICATION, null, msgs);
			msgs = basicSetMedication(newMedication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__MEDICATION, newMedication, newMedication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationStatementDosage> getDosage() {
		if (dosage == null) {
			dosage = new EObjectContainmentEList<MedicationStatementDosage>(MedicationStatementDosage.class, this, FhirPackage.MEDICATION_STATEMENT__DOSAGE);
		}
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return basicSetInformationSource(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return basicSetDateAsserted(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__WAS_NOT_GIVEN:
				return basicSetWasNotGiven(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__REASON_NOT_GIVEN:
				return ((InternalEList<?>)getReasonNotGiven()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				return basicSetReasonForUseCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				return basicSetReasonForUseReference(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				return basicSetEffectiveDateTime(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				return basicSetNote(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION:
				return basicSetMedication(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				return ((InternalEList<?>)getDosage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION_STATEMENT__PATIENT:
				return getPatient();
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return getInformationSource();
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return getDateAsserted();
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_STATEMENT__WAS_NOT_GIVEN:
				return getWasNotGiven();
			case FhirPackage.MEDICATION_STATEMENT__REASON_NOT_GIVEN:
				return getReasonNotGiven();
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				return getReasonForUseCodeableConcept();
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				return getReasonForUseReference();
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION:
				return getMedication();
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				setInformationSource((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				setStatus((MedicationStatementStatus)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__WAS_NOT_GIVEN:
				setWasNotGiven((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_NOT_GIVEN:
				getReasonNotGiven().clear();
				getReasonNotGiven().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				setReasonForUseCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				setReasonForUseReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				setNote((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION:
				setMedication((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				getDosage().clear();
				getDosage().addAll((Collection<? extends MedicationStatementDosage>)newValue);
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				setInformationSource((Reference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				setStatus((MedicationStatementStatus)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__WAS_NOT_GIVEN:
				setWasNotGiven((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_NOT_GIVEN:
				getReasonNotGiven().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				setReasonForUseCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				setReasonForUseReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				setNote((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION:
				setMedication((Reference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				getDosage().clear();
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__PATIENT:
				return patient != null;
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return informationSource != null;
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return dateAsserted != null;
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_STATEMENT__WAS_NOT_GIVEN:
				return wasNotGiven != null;
			case FhirPackage.MEDICATION_STATEMENT__REASON_NOT_GIVEN:
				return reasonNotGiven != null && !reasonNotGiven.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				return reasonForUseCodeableConcept != null;
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				return reasonForUseReference != null;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				return effectiveDateTime != null;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				return note != null;
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION:
				return medication != null;
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				return dosage != null && !dosage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationStatementImpl
