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
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportImage;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getCodedDiagnosis <em>Coded Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticReportImpl#getPresentedForm <em>Presented Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosticReportImpl extends DomainResourceImpl implements DiagnosticReport {
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
	protected DiagnosticReportStatus status;

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
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> request;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> specimen;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> result;

	/**
	 * The cached value of the '{@link #getImagingStudy() <em>Imaging Study</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingStudy()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> imagingStudy;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticReportImage> image;

	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String conclusion;

	/**
	 * The cached value of the '{@link #getCodedDiagnosis() <em>Coded Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> codedDiagnosis;

	/**
	 * The cached value of the '{@link #getPresentedForm() <em>Presented Form</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentedForm()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> presentedForm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDiagnosticReport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(DiagnosticReportStatus newStatus, NotificationChain msgs) {
		DiagnosticReportStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(DiagnosticReportStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER, newEncounter, newEncounter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, newEffectiveDateTime);
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
				msgs = ((InternalEObject)effectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME, null, msgs);
			if (newEffectiveDateTime != null)
				msgs = ((InternalEObject)newEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveDateTime(newEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME, newEffectiveDateTime, newEffectiveDateTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__ISSUED, oldIssued, newIssued);
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
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__ISSUED, newIssued, newIssued));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__PERFORMER, oldPerformer, newPerformer);
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
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRequest() {
		if (request == null) {
			request = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_REPORT__REQUEST);
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN);
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_REPORT__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getImagingStudy() {
		if (imagingStudy == null) {
			imagingStudy = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY);
		}
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticReportImage> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<DiagnosticReportImage>(DiagnosticReportImage.class, this, FhirPackage.DIAGNOSTIC_REPORT__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getConclusion() {
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConclusion(org.hl7.fhir.String newConclusion, NotificationChain msgs) {
		org.hl7.fhir.String oldConclusion = conclusion;
		conclusion = newConclusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION, oldConclusion, newConclusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusion(org.hl7.fhir.String newConclusion) {
		if (newConclusion != conclusion) {
			NotificationChain msgs = null;
			if (conclusion != null)
				msgs = ((InternalEObject)conclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION, null, msgs);
			if (newConclusion != null)
				msgs = ((InternalEObject)newConclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION, null, msgs);
			msgs = basicSetConclusion(newConclusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION, newConclusion, newConclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCodedDiagnosis() {
		if (codedDiagnosis == null) {
			codedDiagnosis = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS);
		}
		return codedDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getPresentedForm() {
		if (presentedForm == null) {
			presentedForm = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM);
		}
		return presentedForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME:
				return basicSetEffectiveDateTime(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__ISSUED:
				return basicSetIssued(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__REQUEST:
				return ((InternalEList<?>)getRequest()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				return ((InternalEList<?>)getImagingStudy()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__IMAGE:
				return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				return basicSetConclusion(null, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				return ((InternalEList<?>)getCodedDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return ((InternalEList<?>)getPresentedForm()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DIAGNOSTIC_REPORT__STATUS:
				return getStatus();
			case FhirPackage.DIAGNOSTIC_REPORT__CATEGORY:
				return getCategory();
			case FhirPackage.DIAGNOSTIC_REPORT__CODE:
				return getCode();
			case FhirPackage.DIAGNOSTIC_REPORT__SUBJECT:
				return getSubject();
			case FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				return getEncounter();
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.DIAGNOSTIC_REPORT__ISSUED:
				return getIssued();
			case FhirPackage.DIAGNOSTIC_REPORT__PERFORMER:
				return getPerformer();
			case FhirPackage.DIAGNOSTIC_REPORT__REQUEST:
				return getRequest();
			case FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return getSpecimen();
			case FhirPackage.DIAGNOSTIC_REPORT__RESULT:
				return getResult();
			case FhirPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				return getImagingStudy();
			case FhirPackage.DIAGNOSTIC_REPORT__IMAGE:
				return getImage();
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				return getConclusion();
			case FhirPackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				return getCodedDiagnosis();
			case FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return getPresentedForm();
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
			case FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__STATUS:
				setStatus((DiagnosticReportStatus)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__ISSUED:
				setIssued((Instant)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__REQUEST:
				getRequest().clear();
				getRequest().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				getImagingStudy().clear();
				getImagingStudy().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends DiagnosticReportImage>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				setConclusion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				getCodedDiagnosis().clear();
				getCodedDiagnosis().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				getPresentedForm().clear();
				getPresentedForm().addAll((Collection<? extends Attachment>)newValue);
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
			case FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__STATUS:
				setStatus((DiagnosticReportStatus)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__ISSUED:
				setIssued((Instant)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__REQUEST:
				getRequest().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				getSpecimen().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__RESULT:
				getResult().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				getImagingStudy().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__IMAGE:
				getImage().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				setConclusion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				getCodedDiagnosis().clear();
				return;
			case FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				getPresentedForm().clear();
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
			case FhirPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__STATUS:
				return status != null;
			case FhirPackage.DIAGNOSTIC_REPORT__CATEGORY:
				return category != null;
			case FhirPackage.DIAGNOSTIC_REPORT__CODE:
				return code != null;
			case FhirPackage.DIAGNOSTIC_REPORT__SUBJECT:
				return subject != null;
			case FhirPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				return encounter != null;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_DATE_TIME:
				return effectiveDateTime != null;
			case FhirPackage.DIAGNOSTIC_REPORT__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.DIAGNOSTIC_REPORT__ISSUED:
				return issued != null;
			case FhirPackage.DIAGNOSTIC_REPORT__PERFORMER:
				return performer != null;
			case FhirPackage.DIAGNOSTIC_REPORT__REQUEST:
				return request != null && !request.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__RESULT:
				return result != null && !result.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				return imagingStudy != null && !imagingStudy.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__IMAGE:
				return image != null && !image.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				return conclusion != null;
			case FhirPackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				return codedDiagnosis != null && !codedDiagnosis.isEmpty();
			case FhirPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return presentedForm != null && !presentedForm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagnosticReportImpl
