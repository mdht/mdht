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
import org.hl7.fhir.MedicationDispenseDosageInstruction;
import org.hl7.fhir.Period;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.SimpleQuantity;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Dispense Dosage Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getAdditionalInstructions <em>Additional Instructions</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getScheduleDateTime <em>Schedule Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getSchedulePeriod <em>Schedule Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getScheduleTiming <em>Schedule Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getAsNeededBoolean <em>As Needed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getDoseRange <em>Dose Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseDosageInstructionImpl#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationDispenseDosageInstructionImpl extends BackboneElementImpl implements MedicationDispenseDosageInstruction {
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
	 * The cached value of the '{@link #getScheduleDateTime() <em>Schedule Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime scheduleDateTime;

	/**
	 * The cached value of the '{@link #getSchedulePeriod() <em>Schedule Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period schedulePeriod;

	/**
	 * The cached value of the '{@link #getScheduleTiming() <em>Schedule Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing scheduleTiming;

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
	protected MedicationDispenseDosageInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationDispenseDosageInstruction();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__TEXT, newText, newText));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS, oldAdditionalInstructions, newAdditionalInstructions);
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
				msgs = ((InternalEObject)additionalInstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS, null, msgs);
			if (newAdditionalInstructions != null)
				msgs = ((InternalEObject)newAdditionalInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS, null, msgs);
			msgs = basicSetAdditionalInstructions(newAdditionalInstructions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS, newAdditionalInstructions, newAdditionalInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getScheduleDateTime() {
		return scheduleDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleDateTime(DateTime newScheduleDateTime, NotificationChain msgs) {
		DateTime oldScheduleDateTime = scheduleDateTime;
		scheduleDateTime = newScheduleDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_DATE_TIME, oldScheduleDateTime, newScheduleDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleDateTime(DateTime newScheduleDateTime) {
		if (newScheduleDateTime != scheduleDateTime) {
			NotificationChain msgs = null;
			if (scheduleDateTime != null)
				msgs = ((InternalEObject)scheduleDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_DATE_TIME, null, msgs);
			if (newScheduleDateTime != null)
				msgs = ((InternalEObject)newScheduleDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_DATE_TIME, null, msgs);
			msgs = basicSetScheduleDateTime(newScheduleDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_DATE_TIME, newScheduleDateTime, newScheduleDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getSchedulePeriod() {
		return schedulePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedulePeriod(Period newSchedulePeriod, NotificationChain msgs) {
		Period oldSchedulePeriod = schedulePeriod;
		schedulePeriod = newSchedulePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_PERIOD, oldSchedulePeriod, newSchedulePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulePeriod(Period newSchedulePeriod) {
		if (newSchedulePeriod != schedulePeriod) {
			NotificationChain msgs = null;
			if (schedulePeriod != null)
				msgs = ((InternalEObject)schedulePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_PERIOD, null, msgs);
			if (newSchedulePeriod != null)
				msgs = ((InternalEObject)newSchedulePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_PERIOD, null, msgs);
			msgs = basicSetSchedulePeriod(newSchedulePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_PERIOD, newSchedulePeriod, newSchedulePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getScheduleTiming() {
		return scheduleTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleTiming(Timing newScheduleTiming, NotificationChain msgs) {
		Timing oldScheduleTiming = scheduleTiming;
		scheduleTiming = newScheduleTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_TIMING, oldScheduleTiming, newScheduleTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleTiming(Timing newScheduleTiming) {
		if (newScheduleTiming != scheduleTiming) {
			NotificationChain msgs = null;
			if (scheduleTiming != null)
				msgs = ((InternalEObject)scheduleTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_TIMING, null, msgs);
			if (newScheduleTiming != null)
				msgs = ((InternalEObject)newScheduleTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_TIMING, null, msgs);
			msgs = basicSetScheduleTiming(newScheduleTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_TIMING, newScheduleTiming, newScheduleTiming));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN, oldAsNeededBoolean, newAsNeededBoolean);
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
				msgs = ((InternalEObject)asNeededBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN, null, msgs);
			if (newAsNeededBoolean != null)
				msgs = ((InternalEObject)newAsNeededBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN, null, msgs);
			msgs = basicSetAsNeededBoolean(newAsNeededBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN, newAsNeededBoolean, newAsNeededBoolean));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT, oldAsNeededCodeableConcept, newAsNeededCodeableConcept);
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
				msgs = ((InternalEObject)asNeededCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			if (newAsNeededCodeableConcept != null)
				msgs = ((InternalEObject)newAsNeededCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetAsNeededCodeableConcept(newAsNeededCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT, newAsNeededCodeableConcept, newAsNeededCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SITE, oldSite, newSite);
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
				msgs = ((InternalEObject)site).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SITE, null, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SITE, null, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SITE, newSite, newSite));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ROUTE, oldRoute, newRoute);
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
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ROUTE, newRoute, newRoute));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__METHOD, oldMethod, newMethod);
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
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__METHOD, newMethod, newMethod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_RANGE, oldDoseRange, newDoseRange);
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
				msgs = ((InternalEObject)doseRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_RANGE, null, msgs);
			if (newDoseRange != null)
				msgs = ((InternalEObject)newDoseRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_RANGE, null, msgs);
			msgs = basicSetDoseRange(newDoseRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_RANGE, newDoseRange, newDoseRange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_QUANTITY, oldDoseQuantity, newDoseQuantity);
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
				msgs = ((InternalEObject)doseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_QUANTITY, null, msgs);
			if (newDoseQuantity != null)
				msgs = ((InternalEObject)newDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_QUANTITY, null, msgs);
			msgs = basicSetDoseQuantity(newDoseQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_QUANTITY, newDoseQuantity, newDoseQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__RATE, oldRate, newRate);
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
				msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__RATE, null, msgs);
			if (newRate != null)
				msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__RATE, null, msgs);
			msgs = basicSetRate(newRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__RATE, newRate, newRate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD, oldMaxDosePerPeriod, newMaxDosePerPeriod);
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
				msgs = ((InternalEObject)maxDosePerPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD, null, msgs);
			if (newMaxDosePerPeriod != null)
				msgs = ((InternalEObject)newMaxDosePerPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD, null, msgs);
			msgs = basicSetMaxDosePerPeriod(newMaxDosePerPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD, newMaxDosePerPeriod, newMaxDosePerPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				return basicSetAdditionalInstructions(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_DATE_TIME:
				return basicSetScheduleDateTime(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_PERIOD:
				return basicSetSchedulePeriod(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_TIMING:
				return basicSetScheduleTiming(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN:
				return basicSetAsNeededBoolean(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT:
				return basicSetAsNeededCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SITE:
				return basicSetSite(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ROUTE:
				return basicSetRoute(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_RANGE:
				return basicSetDoseRange(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_QUANTITY:
				return basicSetDoseQuantity(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__RATE:
				return basicSetRate(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
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
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__TEXT:
				return getText();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				return getAdditionalInstructions();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_DATE_TIME:
				return getScheduleDateTime();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_PERIOD:
				return getSchedulePeriod();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_TIMING:
				return getScheduleTiming();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN:
				return getAsNeededBoolean();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT:
				return getAsNeededCodeableConcept();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SITE:
				return getSite();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ROUTE:
				return getRoute();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__METHOD:
				return getMethod();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_RANGE:
				return getDoseRange();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_QUANTITY:
				return getDoseQuantity();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__RATE:
				return getRate();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
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
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				setAdditionalInstructions((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_DATE_TIME:
				setScheduleDateTime((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_PERIOD:
				setSchedulePeriod((Period)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_TIMING:
				setScheduleTiming((Timing)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SITE:
				setSite((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_RANGE:
				setDoseRange((Range)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_QUANTITY:
				setDoseQuantity((SimpleQuantity)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__RATE:
				setRate((Ratio)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
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
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				setAdditionalInstructions((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_DATE_TIME:
				setScheduleDateTime((DateTime)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_PERIOD:
				setSchedulePeriod((Period)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_TIMING:
				setScheduleTiming((Timing)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SITE:
				setSite((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_RANGE:
				setDoseRange((Range)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_QUANTITY:
				setDoseQuantity((SimpleQuantity)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__RATE:
				setRate((Ratio)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
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
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__TEXT:
				return text != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				return additionalInstructions != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_DATE_TIME:
				return scheduleDateTime != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_PERIOD:
				return schedulePeriod != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SCHEDULE_TIMING:
				return scheduleTiming != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_BOOLEAN:
				return asNeededBoolean != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__AS_NEEDED_CODEABLE_CONCEPT:
				return asNeededCodeableConcept != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__SITE:
				return site != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__ROUTE:
				return route != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__METHOD:
				return method != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_RANGE:
				return doseRange != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__DOSE_QUANTITY:
				return doseQuantity != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__RATE:
				return rate != null;
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
				return maxDosePerPeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationDispenseDosageInstructionImpl
