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

import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.ClinicalImpressionInvestigations;
import org.hl7.fhir.ClinicalImpressionRuledOut;
import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Impression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getTriggerCodeableConcept <em>Trigger Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getTriggerReference <em>Trigger Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getInvestigations <em>Investigations</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getFinding <em>Finding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getResolved <em>Resolved</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getRuledOut <em>Ruled Out</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getPrognosis <em>Prognosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalImpressionImpl extends DomainResourceImpl implements ClinicalImpression {
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
	 * The cached value of the '{@link #getAssessor() <em>Assessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessor()
	 * @generated
	 * @ordered
	 */
	protected Reference assessor;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ClinicalImpressionStatus status;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Reference previous;

	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> problem;

	/**
	 * The cached value of the '{@link #getTriggerCodeableConcept() <em>Trigger Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept triggerCodeableConcept;

	/**
	 * The cached value of the '{@link #getTriggerReference() <em>Trigger Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerReference()
	 * @generated
	 * @ordered
	 */
	protected Reference triggerReference;

	/**
	 * The cached value of the '{@link #getInvestigations() <em>Investigations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvestigations()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionInvestigations> investigations;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Uri protocol;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String summary;

	/**
	 * The cached value of the '{@link #getFinding() <em>Finding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinding()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionFinding> finding;

	/**
	 * The cached value of the '{@link #getResolved() <em>Resolved</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> resolved;

	/**
	 * The cached value of the '{@link #getRuledOut() <em>Ruled Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuledOut()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionRuledOut> ruledOut;

	/**
	 * The cached value of the '{@link #getPrognosis() <em>Prognosis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosis()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String prognosis;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> plan;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalImpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClinicalImpression();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAssessor() {
		return assessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessor(Reference newAssessor, NotificationChain msgs) {
		Reference oldAssessor = assessor;
		assessor = newAssessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__ASSESSOR, oldAssessor, newAssessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessor(Reference newAssessor) {
		if (newAssessor != assessor) {
			NotificationChain msgs = null;
			if (assessor != null)
				msgs = ((InternalEObject)assessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__ASSESSOR, null, msgs);
			if (newAssessor != null)
				msgs = ((InternalEObject)newAssessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__ASSESSOR, null, msgs);
			msgs = basicSetAssessor(newAssessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__ASSESSOR, newAssessor, newAssessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ClinicalImpressionStatus newStatus, NotificationChain msgs) {
		ClinicalImpressionStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ClinicalImpressionStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Reference newPrevious, NotificationChain msgs) {
		Reference oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(Reference newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__PREVIOUS, null, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__PREVIOUS, null, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getProblem() {
		if (problem == null) {
			problem = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLINICAL_IMPRESSION__PROBLEM);
		}
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getTriggerCodeableConcept() {
		return triggerCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerCodeableConcept(CodeableConcept newTriggerCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldTriggerCodeableConcept = triggerCodeableConcept;
		triggerCodeableConcept = newTriggerCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__TRIGGER_CODEABLE_CONCEPT, oldTriggerCodeableConcept, newTriggerCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerCodeableConcept(CodeableConcept newTriggerCodeableConcept) {
		if (newTriggerCodeableConcept != triggerCodeableConcept) {
			NotificationChain msgs = null;
			if (triggerCodeableConcept != null)
				msgs = ((InternalEObject)triggerCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__TRIGGER_CODEABLE_CONCEPT, null, msgs);
			if (newTriggerCodeableConcept != null)
				msgs = ((InternalEObject)newTriggerCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__TRIGGER_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetTriggerCodeableConcept(newTriggerCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__TRIGGER_CODEABLE_CONCEPT, newTriggerCodeableConcept, newTriggerCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getTriggerReference() {
		return triggerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerReference(Reference newTriggerReference, NotificationChain msgs) {
		Reference oldTriggerReference = triggerReference;
		triggerReference = newTriggerReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__TRIGGER_REFERENCE, oldTriggerReference, newTriggerReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerReference(Reference newTriggerReference) {
		if (newTriggerReference != triggerReference) {
			NotificationChain msgs = null;
			if (triggerReference != null)
				msgs = ((InternalEObject)triggerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__TRIGGER_REFERENCE, null, msgs);
			if (newTriggerReference != null)
				msgs = ((InternalEObject)newTriggerReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__TRIGGER_REFERENCE, null, msgs);
			msgs = basicSetTriggerReference(newTriggerReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__TRIGGER_REFERENCE, newTriggerReference, newTriggerReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalImpressionInvestigations> getInvestigations() {
		if (investigations == null) {
			investigations = new EObjectContainmentEList<ClinicalImpressionInvestigations>(ClinicalImpressionInvestigations.class, this, FhirPackage.CLINICAL_IMPRESSION__INVESTIGATIONS);
		}
		return investigations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(Uri newProtocol, NotificationChain msgs) {
		Uri oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__PROTOCOL, oldProtocol, newProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(Uri newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSummary(org.hl7.fhir.String newSummary, NotificationChain msgs) {
		org.hl7.fhir.String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__SUMMARY, oldSummary, newSummary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(org.hl7.fhir.String newSummary) {
		if (newSummary != summary) {
			NotificationChain msgs = null;
			if (summary != null)
				msgs = ((InternalEObject)summary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__SUMMARY, null, msgs);
			if (newSummary != null)
				msgs = ((InternalEObject)newSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__SUMMARY, null, msgs);
			msgs = basicSetSummary(newSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__SUMMARY, newSummary, newSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalImpressionFinding> getFinding() {
		if (finding == null) {
			finding = new EObjectContainmentEList<ClinicalImpressionFinding>(ClinicalImpressionFinding.class, this, FhirPackage.CLINICAL_IMPRESSION__FINDING);
		}
		return finding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getResolved() {
		if (resolved == null) {
			resolved = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CLINICAL_IMPRESSION__RESOLVED);
		}
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalImpressionRuledOut> getRuledOut() {
		if (ruledOut == null) {
			ruledOut = new EObjectContainmentEList<ClinicalImpressionRuledOut>(ClinicalImpressionRuledOut.class, this, FhirPackage.CLINICAL_IMPRESSION__RULED_OUT);
		}
		return ruledOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPrognosis() {
		return prognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrognosis(org.hl7.fhir.String newPrognosis, NotificationChain msgs) {
		org.hl7.fhir.String oldPrognosis = prognosis;
		prognosis = newPrognosis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS, oldPrognosis, newPrognosis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrognosis(org.hl7.fhir.String newPrognosis) {
		if (newPrognosis != prognosis) {
			NotificationChain msgs = null;
			if (prognosis != null)
				msgs = ((InternalEObject)prognosis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS, null, msgs);
			if (newPrognosis != null)
				msgs = ((InternalEObject)newPrognosis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS, null, msgs);
			msgs = basicSetPrognosis(newPrognosis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS, newPrognosis, newPrognosis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPlan() {
		if (plan == null) {
			plan = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLINICAL_IMPRESSION__PLAN);
		}
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLINICAL_IMPRESSION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLINICAL_IMPRESSION__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__ASSESSOR:
				return basicSetAssessor(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__PROBLEM:
				return ((InternalEList<?>)getProblem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__TRIGGER_CODEABLE_CONCEPT:
				return basicSetTriggerCodeableConcept(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__TRIGGER_REFERENCE:
				return basicSetTriggerReference(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__INVESTIGATIONS:
				return ((InternalEList<?>)getInvestigations()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__PROTOCOL:
				return basicSetProtocol(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__SUMMARY:
				return basicSetSummary(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__FINDING:
				return ((InternalEList<?>)getFinding()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__RESOLVED:
				return ((InternalEList<?>)getResolved()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__RULED_OUT:
				return ((InternalEList<?>)getRuledOut()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS:
				return basicSetPrognosis(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__PLAN:
				return ((InternalEList<?>)getPlan()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLINICAL_IMPRESSION__PATIENT:
				return getPatient();
			case FhirPackage.CLINICAL_IMPRESSION__ASSESSOR:
				return getAssessor();
			case FhirPackage.CLINICAL_IMPRESSION__STATUS:
				return getStatus();
			case FhirPackage.CLINICAL_IMPRESSION__DATE:
				return getDate();
			case FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				return getDescription();
			case FhirPackage.CLINICAL_IMPRESSION__PREVIOUS:
				return getPrevious();
			case FhirPackage.CLINICAL_IMPRESSION__PROBLEM:
				return getProblem();
			case FhirPackage.CLINICAL_IMPRESSION__TRIGGER_CODEABLE_CONCEPT:
				return getTriggerCodeableConcept();
			case FhirPackage.CLINICAL_IMPRESSION__TRIGGER_REFERENCE:
				return getTriggerReference();
			case FhirPackage.CLINICAL_IMPRESSION__INVESTIGATIONS:
				return getInvestigations();
			case FhirPackage.CLINICAL_IMPRESSION__PROTOCOL:
				return getProtocol();
			case FhirPackage.CLINICAL_IMPRESSION__SUMMARY:
				return getSummary();
			case FhirPackage.CLINICAL_IMPRESSION__FINDING:
				return getFinding();
			case FhirPackage.CLINICAL_IMPRESSION__RESOLVED:
				return getResolved();
			case FhirPackage.CLINICAL_IMPRESSION__RULED_OUT:
				return getRuledOut();
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS:
				return getPrognosis();
			case FhirPackage.CLINICAL_IMPRESSION__PLAN:
				return getPlan();
			case FhirPackage.CLINICAL_IMPRESSION__ACTION:
				return getAction();
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
			case FhirPackage.CLINICAL_IMPRESSION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__ASSESSOR:
				setAssessor((Reference)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__STATUS:
				setStatus((ClinicalImpressionStatus)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PREVIOUS:
				setPrevious((Reference)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROBLEM:
				getProblem().clear();
				getProblem().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__TRIGGER_CODEABLE_CONCEPT:
				setTriggerCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__TRIGGER_REFERENCE:
				setTriggerReference((Reference)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__INVESTIGATIONS:
				getInvestigations().clear();
				getInvestigations().addAll((Collection<? extends ClinicalImpressionInvestigations>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROTOCOL:
				setProtocol((Uri)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__SUMMARY:
				setSummary((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__FINDING:
				getFinding().clear();
				getFinding().addAll((Collection<? extends ClinicalImpressionFinding>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__RESOLVED:
				getResolved().clear();
				getResolved().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__RULED_OUT:
				getRuledOut().clear();
				getRuledOut().addAll((Collection<? extends ClinicalImpressionRuledOut>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS:
				setPrognosis((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PLAN:
				getPlan().clear();
				getPlan().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.CLINICAL_IMPRESSION__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__ASSESSOR:
				setAssessor((Reference)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__STATUS:
				setStatus((ClinicalImpressionStatus)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PREVIOUS:
				setPrevious((Reference)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROBLEM:
				getProblem().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__TRIGGER_CODEABLE_CONCEPT:
				setTriggerCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__TRIGGER_REFERENCE:
				setTriggerReference((Reference)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__INVESTIGATIONS:
				getInvestigations().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROTOCOL:
				setProtocol((Uri)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__SUMMARY:
				setSummary((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__FINDING:
				getFinding().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__RESOLVED:
				getResolved().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__RULED_OUT:
				getRuledOut().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS:
				setPrognosis((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PLAN:
				getPlan().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__ACTION:
				getAction().clear();
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
			case FhirPackage.CLINICAL_IMPRESSION__PATIENT:
				return patient != null;
			case FhirPackage.CLINICAL_IMPRESSION__ASSESSOR:
				return assessor != null;
			case FhirPackage.CLINICAL_IMPRESSION__STATUS:
				return status != null;
			case FhirPackage.CLINICAL_IMPRESSION__DATE:
				return date != null;
			case FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				return description != null;
			case FhirPackage.CLINICAL_IMPRESSION__PREVIOUS:
				return previous != null;
			case FhirPackage.CLINICAL_IMPRESSION__PROBLEM:
				return problem != null && !problem.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__TRIGGER_CODEABLE_CONCEPT:
				return triggerCodeableConcept != null;
			case FhirPackage.CLINICAL_IMPRESSION__TRIGGER_REFERENCE:
				return triggerReference != null;
			case FhirPackage.CLINICAL_IMPRESSION__INVESTIGATIONS:
				return investigations != null && !investigations.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__PROTOCOL:
				return protocol != null;
			case FhirPackage.CLINICAL_IMPRESSION__SUMMARY:
				return summary != null;
			case FhirPackage.CLINICAL_IMPRESSION__FINDING:
				return finding != null && !finding.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__RESOLVED:
				return resolved != null && !resolved.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__RULED_OUT:
				return ruledOut != null && !ruledOut.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS:
				return prognosis != null;
			case FhirPackage.CLINICAL_IMPRESSION__PLAN:
				return plan != null && !plan.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__ACTION:
				return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClinicalImpressionImpl
