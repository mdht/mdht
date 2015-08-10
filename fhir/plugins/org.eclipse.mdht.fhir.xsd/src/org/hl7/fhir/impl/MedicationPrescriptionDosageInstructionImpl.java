/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationPrescriptionDosageInstruction;
import org.hl7.fhir.Period;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.SimpleQuantity;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Prescription Dosage Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getAdditionalInstructions <em>Additional Instructions</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getScheduledDateTime <em>Scheduled Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getScheduledPeriod <em>Scheduled Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getScheduledTiming <em>Scheduled Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getAsNeededBoolean <em>As Needed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getDoseRange <em>Dose Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDosageInstructionImpl#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationPrescriptionDosageInstructionImpl extends BackboneElementImpl implements MedicationPrescriptionDosageInstruction {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * The cached value of the '{@link #getAdditionalInstructions() <em>Additional Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInstructions()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept additionalInstructions;

	/**
	 * The cached value of the '{@link #getScheduledDateTime() <em>Scheduled Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime scheduledDateTime;

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
	 * The cached value of the '{@link #getScheduledTiming() <em>Scheduled Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing scheduledTiming;

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
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept site;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

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
	 * The cached value of the '{@link #getDoseRange() <em>Dose Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseRange()
	 * @generated
	 * @ordered
	 */
	protected Range doseRange;

	/**
	 * The cached value of the '{@link #getDoseQuantity() <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity doseQuantity;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected Ratio rate;

	/**
	 * The cached value of the '{@link #getMaxDosePerPeriod() <em>Max Dose Per Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 * @ordered
	 */
	protected Ratio maxDosePerPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationPrescriptionDosageInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationPrescriptionDosageInstruction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAdditionalInstructions() {
		return additionalInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalInstructions(CodeableConcept newAdditionalInstructions, NotificationChain msgs) {
		CodeableConcept oldAdditionalInstructions = additionalInstructions;
		additionalInstructions = newAdditionalInstructions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS, oldAdditionalInstructions, newAdditionalInstructions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalInstructions(CodeableConcept newAdditionalInstructions) {
		if (newAdditionalInstructions != additionalInstructions) {
			NotificationChain msgs = null;
			if (additionalInstructions != null)
				msgs = ((InternalEObject)additionalInstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS, null, msgs);
			if (newAdditionalInstructions != null)
				msgs = ((InternalEObject)newAdditionalInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS, null, msgs);
			msgs = basicSetAdditionalInstructions(newAdditionalInstructions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS, newAdditionalInstructions, newAdditionalInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getScheduledDateTime() {
		return scheduledDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledDateTime(DateTime newScheduledDateTime, NotificationChain msgs) {
		DateTime oldScheduledDateTime = scheduledDateTime;
		scheduledDateTime = newScheduledDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_DATE_TIME, oldScheduledDateTime, newScheduledDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledDateTime(DateTime newScheduledDateTime) {
		if (newScheduledDateTime != scheduledDateTime) {
			NotificationChain msgs = null;
			if (scheduledDateTime != null)
				msgs = ((InternalEObject)scheduledDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_DATE_TIME, null, msgs);
			if (newScheduledDateTime != null)
				msgs = ((InternalEObject)newScheduledDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_DATE_TIME, null, msgs);
			msgs = basicSetScheduledDateTime(newScheduledDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_DATE_TIME, newScheduledDateTime, newScheduledDateTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_PERIOD, oldScheduledPeriod, newScheduledPeriod);
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
				msgs = ((InternalEObject)scheduledPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_PERIOD, null, msgs);
			if (newScheduledPeriod != null)
				msgs = ((InternalEObject)newScheduledPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_PERIOD, null, msgs);
			msgs = basicSetScheduledPeriod(newScheduledPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_PERIOD, newScheduledPeriod, newScheduledPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_TIMING, oldScheduledTiming, newScheduledTiming);
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
				msgs = ((InternalEObject)scheduledTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_TIMING, null, msgs);
			if (newScheduledTiming != null)
				msgs = ((InternalEObject)newScheduledTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_TIMING, null, msgs);
			msgs = basicSetScheduledTiming(newScheduledTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_TIMING, newScheduledTiming, newScheduledTiming));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN, oldAsNeededBoolean, newAsNeededBoolean);
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
				msgs = ((InternalEObject)asNeededBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN, null, msgs);
			if (newAsNeededBoolean != null)
				msgs = ((InternalEObject)newAsNeededBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN, null, msgs);
			msgs = basicSetAsNeededBoolean(newAsNeededBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN, newAsNeededBoolean, newAsNeededBoolean));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT, oldAsNeededCodeableConcept, newAsNeededCodeableConcept);
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
				msgs = ((InternalEObject)asNeededCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			if (newAsNeededCodeableConcept != null)
				msgs = ((InternalEObject)newAsNeededCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetAsNeededCodeableConcept(newAsNeededCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT, newAsNeededCodeableConcept, newAsNeededCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(CodeableConcept newSite, NotificationChain msgs) {
		CodeableConcept oldSite = site;
		site = newSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SITE, oldSite, newSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(CodeableConcept newSite) {
		if (newSite != site) {
			NotificationChain msgs = null;
			if (site != null)
				msgs = ((InternalEObject)site).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SITE, null, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SITE, null, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SITE, newSite, newSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(CodeableConcept newRoute, NotificationChain msgs) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ROUTE, oldRoute, newRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(CodeableConcept newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ROUTE, newRoute, newRoute));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__METHOD, oldMethod, newMethod);
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
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getDoseRange() {
		return doseRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseRange(Range newDoseRange, NotificationChain msgs) {
		Range oldDoseRange = doseRange;
		doseRange = newDoseRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_RANGE, oldDoseRange, newDoseRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseRange(Range newDoseRange) {
		if (newDoseRange != doseRange) {
			NotificationChain msgs = null;
			if (doseRange != null)
				msgs = ((InternalEObject)doseRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_RANGE, null, msgs);
			if (newDoseRange != null)
				msgs = ((InternalEObject)newDoseRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_RANGE, null, msgs);
			msgs = basicSetDoseRange(newDoseRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_RANGE, newDoseRange, newDoseRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getDoseQuantity() {
		return doseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseQuantity(SimpleQuantity newDoseQuantity, NotificationChain msgs) {
		SimpleQuantity oldDoseQuantity = doseQuantity;
		doseQuantity = newDoseQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_QUANTITY, oldDoseQuantity, newDoseQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseQuantity(SimpleQuantity newDoseQuantity) {
		if (newDoseQuantity != doseQuantity) {
			NotificationChain msgs = null;
			if (doseQuantity != null)
				msgs = ((InternalEObject)doseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_QUANTITY, null, msgs);
			if (newDoseQuantity != null)
				msgs = ((InternalEObject)newDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_QUANTITY, null, msgs);
			msgs = basicSetDoseQuantity(newDoseQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_QUANTITY, newDoseQuantity, newDoseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRate(Ratio newRate, NotificationChain msgs) {
		Ratio oldRate = rate;
		rate = newRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__RATE, oldRate, newRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(Ratio newRate) {
		if (newRate != rate) {
			NotificationChain msgs = null;
			if (rate != null)
				msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__RATE, null, msgs);
			if (newRate != null)
				msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__RATE, null, msgs);
			msgs = basicSetRate(newRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__RATE, newRate, newRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getMaxDosePerPeriod() {
		return maxDosePerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDosePerPeriod(Ratio newMaxDosePerPeriod, NotificationChain msgs) {
		Ratio oldMaxDosePerPeriod = maxDosePerPeriod;
		maxDosePerPeriod = newMaxDosePerPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD, oldMaxDosePerPeriod, newMaxDosePerPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDosePerPeriod(Ratio newMaxDosePerPeriod) {
		if (newMaxDosePerPeriod != maxDosePerPeriod) {
			NotificationChain msgs = null;
			if (maxDosePerPeriod != null)
				msgs = ((InternalEObject)maxDosePerPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD, null, msgs);
			if (newMaxDosePerPeriod != null)
				msgs = ((InternalEObject)newMaxDosePerPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD, null, msgs);
			msgs = basicSetMaxDosePerPeriod(newMaxDosePerPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD, newMaxDosePerPeriod, newMaxDosePerPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				return basicSetAdditionalInstructions(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_DATE_TIME:
				return basicSetScheduledDateTime(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_PERIOD:
				return basicSetScheduledPeriod(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_TIMING:
				return basicSetScheduledTiming(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN:
				return basicSetAsNeededBoolean(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT:
				return basicSetAsNeededCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SITE:
				return basicSetSite(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ROUTE:
				return basicSetRoute(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_RANGE:
				return basicSetDoseRange(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_QUANTITY:
				return basicSetDoseQuantity(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__RATE:
				return basicSetRate(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
				return basicSetMaxDosePerPeriod(null, msgs);
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
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__TEXT:
				return getText();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				return getAdditionalInstructions();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_DATE_TIME:
				return getScheduledDateTime();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_PERIOD:
				return getScheduledPeriod();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_TIMING:
				return getScheduledTiming();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN:
				return getAsNeededBoolean();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT:
				return getAsNeededCodeableConcept();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SITE:
				return getSite();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ROUTE:
				return getRoute();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__METHOD:
				return getMethod();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_RANGE:
				return getDoseRange();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_QUANTITY:
				return getDoseQuantity();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__RATE:
				return getRate();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
				return getMaxDosePerPeriod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				setAdditionalInstructions((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_DATE_TIME:
				setScheduledDateTime((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_PERIOD:
				setScheduledPeriod((Period)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_TIMING:
				setScheduledTiming((Timing)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SITE:
				setSite((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_RANGE:
				setDoseRange((Range)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_QUANTITY:
				setDoseQuantity((SimpleQuantity)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__RATE:
				setRate((Ratio)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
				setMaxDosePerPeriod((Ratio)newValue);
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
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				setAdditionalInstructions((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_DATE_TIME:
				setScheduledDateTime((DateTime)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_PERIOD:
				setScheduledPeriod((Period)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_TIMING:
				setScheduledTiming((Timing)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SITE:
				setSite((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_RANGE:
				setDoseRange((Range)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_QUANTITY:
				setDoseQuantity((SimpleQuantity)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__RATE:
				setRate((Ratio)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
				setMaxDosePerPeriod((Ratio)null);
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
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__TEXT:
				return text != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				return additionalInstructions != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_DATE_TIME:
				return scheduledDateTime != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_PERIOD:
				return scheduledPeriod != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SCHEDULED_TIMING:
				return scheduledTiming != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN:
				return asNeededBoolean != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT:
				return asNeededCodeableConcept != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__SITE:
				return site != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__ROUTE:
				return route != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__METHOD:
				return method != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_RANGE:
				return doseRange != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__DOSE_QUANTITY:
				return doseQuantity != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__RATE:
				return rate != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
				return maxDosePerPeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationPrescriptionDosageInstructionImpl
