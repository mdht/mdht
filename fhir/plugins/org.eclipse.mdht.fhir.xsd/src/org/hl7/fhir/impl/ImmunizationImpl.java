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
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationExplanation;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationVaccinationProtocol;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getVaccineType <em>Vaccine Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getWasNotGiven <em>Was Not Given</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getReported <em>Reported</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getReaction <em>Reaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getVaccinationProtocol <em>Vaccination Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationImpl extends DomainResourceImpl implements Immunization {
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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getVaccineType() <em>Vaccine Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept vaccineType;

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
	 * The cached value of the '{@link #getWasNotGiven() <em>Was Not Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWasNotGiven()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean wasNotGiven;

	/**
	 * The cached value of the '{@link #getReported() <em>Reported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReported()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean reported;

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
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Reference requester;

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
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Reference manufacturer;

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
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String lotNumber;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationDate;

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
	 * The cached value of the '{@link #getDoseQuantity() <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity doseQuantity;

	/**
	 * The cached value of the '{@link #getExplanation() <em>Explanation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected ImmunizationExplanation explanation;

	/**
	 * The cached value of the '{@link #getReaction() <em>Reaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationReaction> reaction;

	/**
	 * The cached value of the '{@link #getVaccinationProtocol() <em>Vaccination Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccinationProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationVaccinationProtocol> vaccinationProtocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.IMMUNIZATION__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getVaccineType() {
		return vaccineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVaccineType(CodeableConcept newVaccineType, NotificationChain msgs) {
		CodeableConcept oldVaccineType = vaccineType;
		vaccineType = newVaccineType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__VACCINE_TYPE, oldVaccineType, newVaccineType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaccineType(CodeableConcept newVaccineType) {
		if (newVaccineType != vaccineType) {
			NotificationChain msgs = null;
			if (vaccineType != null)
				msgs = ((InternalEObject)vaccineType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__VACCINE_TYPE, null, msgs);
			if (newVaccineType != null)
				msgs = ((InternalEObject)newVaccineType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__VACCINE_TYPE, null, msgs);
			msgs = basicSetVaccineType(newVaccineType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__VACCINE_TYPE, newVaccineType, newVaccineType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__WAS_NOT_GIVEN, oldWasNotGiven, newWasNotGiven);
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
				msgs = ((InternalEObject)wasNotGiven).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__WAS_NOT_GIVEN, null, msgs);
			if (newWasNotGiven != null)
				msgs = ((InternalEObject)newWasNotGiven).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__WAS_NOT_GIVEN, null, msgs);
			msgs = basicSetWasNotGiven(newWasNotGiven, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__WAS_NOT_GIVEN, newWasNotGiven, newWasNotGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getReported() {
		return reported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReported(org.hl7.fhir.Boolean newReported, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldReported = reported;
		reported = newReported;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__REPORTED, oldReported, newReported);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReported(org.hl7.fhir.Boolean newReported) {
		if (newReported != reported) {
			NotificationChain msgs = null;
			if (reported != null)
				msgs = ((InternalEObject)reported).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__REPORTED, null, msgs);
			if (newReported != null)
				msgs = ((InternalEObject)newReported).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__REPORTED, null, msgs);
			msgs = basicSetReported(newReported, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__REPORTED, newReported, newReported));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__PERFORMER, oldPerformer, newPerformer);
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
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(Reference newRequester, NotificationChain msgs) {
		Reference oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__REQUESTER, oldRequester, newRequester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(Reference newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__REQUESTER, newRequester, newRequester));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(Reference newManufacturer, NotificationChain msgs) {
		Reference oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__MANUFACTURER, oldManufacturer, newManufacturer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(Reference newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__MANUFACTURER, newManufacturer, newManufacturer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLotNumber(org.hl7.fhir.String newLotNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__LOT_NUMBER, oldLotNumber, newLotNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLotNumber(org.hl7.fhir.String newLotNumber) {
		if (newLotNumber != lotNumber) {
			NotificationChain msgs = null;
			if (lotNumber != null)
				msgs = ((InternalEObject)lotNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__LOT_NUMBER, null, msgs);
			if (newLotNumber != null)
				msgs = ((InternalEObject)newLotNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__LOT_NUMBER, null, msgs);
			msgs = basicSetLotNumber(newLotNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__LOT_NUMBER, newLotNumber, newLotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationDate(Date newExpirationDate, NotificationChain msgs) {
		Date oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__EXPIRATION_DATE, oldExpirationDate, newExpirationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(Date newExpirationDate) {
		if (newExpirationDate != expirationDate) {
			NotificationChain msgs = null;
			if (expirationDate != null)
				msgs = ((InternalEObject)expirationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__EXPIRATION_DATE, null, msgs);
			if (newExpirationDate != null)
				msgs = ((InternalEObject)newExpirationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__EXPIRATION_DATE, null, msgs);
			msgs = basicSetExpirationDate(newExpirationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__EXPIRATION_DATE, newExpirationDate, newExpirationDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__SITE, oldSite, newSite);
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
				msgs = ((InternalEObject)site).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__SITE, null, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__SITE, null, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__SITE, newSite, newSite));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__ROUTE, oldRoute, newRoute);
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
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDoseQuantity() {
		return doseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseQuantity(Quantity newDoseQuantity, NotificationChain msgs) {
		Quantity oldDoseQuantity = doseQuantity;
		doseQuantity = newDoseQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__DOSE_QUANTITY, oldDoseQuantity, newDoseQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseQuantity(Quantity newDoseQuantity) {
		if (newDoseQuantity != doseQuantity) {
			NotificationChain msgs = null;
			if (doseQuantity != null)
				msgs = ((InternalEObject)doseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__DOSE_QUANTITY, null, msgs);
			if (newDoseQuantity != null)
				msgs = ((InternalEObject)newDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__DOSE_QUANTITY, null, msgs);
			msgs = basicSetDoseQuantity(newDoseQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__DOSE_QUANTITY, newDoseQuantity, newDoseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationExplanation getExplanation() {
		return explanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExplanation(ImmunizationExplanation newExplanation, NotificationChain msgs) {
		ImmunizationExplanation oldExplanation = explanation;
		explanation = newExplanation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__EXPLANATION, oldExplanation, newExplanation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplanation(ImmunizationExplanation newExplanation) {
		if (newExplanation != explanation) {
			NotificationChain msgs = null;
			if (explanation != null)
				msgs = ((InternalEObject)explanation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__EXPLANATION, null, msgs);
			if (newExplanation != null)
				msgs = ((InternalEObject)newExplanation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__EXPLANATION, null, msgs);
			msgs = basicSetExplanation(newExplanation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__EXPLANATION, newExplanation, newExplanation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationReaction> getReaction() {
		if (reaction == null) {
			reaction = new EObjectContainmentEList<ImmunizationReaction>(ImmunizationReaction.class, this, FhirPackage.IMMUNIZATION__REACTION);
		}
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationVaccinationProtocol> getVaccinationProtocol() {
		if (vaccinationProtocol == null) {
			vaccinationProtocol = new EObjectContainmentEList<ImmunizationVaccinationProtocol>(ImmunizationVaccinationProtocol.class, this, FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL);
		}
		return vaccinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.IMMUNIZATION__VACCINE_TYPE:
				return basicSetVaccineType(null, msgs);
			case FhirPackage.IMMUNIZATION__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.IMMUNIZATION__WAS_NOT_GIVEN:
				return basicSetWasNotGiven(null, msgs);
			case FhirPackage.IMMUNIZATION__REPORTED:
				return basicSetReported(null, msgs);
			case FhirPackage.IMMUNIZATION__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FhirPackage.IMMUNIZATION__REQUESTER:
				return basicSetRequester(null, msgs);
			case FhirPackage.IMMUNIZATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.IMMUNIZATION__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case FhirPackage.IMMUNIZATION__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.IMMUNIZATION__LOT_NUMBER:
				return basicSetLotNumber(null, msgs);
			case FhirPackage.IMMUNIZATION__EXPIRATION_DATE:
				return basicSetExpirationDate(null, msgs);
			case FhirPackage.IMMUNIZATION__SITE:
				return basicSetSite(null, msgs);
			case FhirPackage.IMMUNIZATION__ROUTE:
				return basicSetRoute(null, msgs);
			case FhirPackage.IMMUNIZATION__DOSE_QUANTITY:
				return basicSetDoseQuantity(null, msgs);
			case FhirPackage.IMMUNIZATION__EXPLANATION:
				return basicSetExplanation(null, msgs);
			case FhirPackage.IMMUNIZATION__REACTION:
				return ((InternalEList<?>)getReaction()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				return ((InternalEList<?>)getVaccinationProtocol()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMMUNIZATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.IMMUNIZATION__DATE:
				return getDate();
			case FhirPackage.IMMUNIZATION__VACCINE_TYPE:
				return getVaccineType();
			case FhirPackage.IMMUNIZATION__PATIENT:
				return getPatient();
			case FhirPackage.IMMUNIZATION__WAS_NOT_GIVEN:
				return getWasNotGiven();
			case FhirPackage.IMMUNIZATION__REPORTED:
				return getReported();
			case FhirPackage.IMMUNIZATION__PERFORMER:
				return getPerformer();
			case FhirPackage.IMMUNIZATION__REQUESTER:
				return getRequester();
			case FhirPackage.IMMUNIZATION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.IMMUNIZATION__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.IMMUNIZATION__LOCATION:
				return getLocation();
			case FhirPackage.IMMUNIZATION__LOT_NUMBER:
				return getLotNumber();
			case FhirPackage.IMMUNIZATION__EXPIRATION_DATE:
				return getExpirationDate();
			case FhirPackage.IMMUNIZATION__SITE:
				return getSite();
			case FhirPackage.IMMUNIZATION__ROUTE:
				return getRoute();
			case FhirPackage.IMMUNIZATION__DOSE_QUANTITY:
				return getDoseQuantity();
			case FhirPackage.IMMUNIZATION__EXPLANATION:
				return getExplanation();
			case FhirPackage.IMMUNIZATION__REACTION:
				return getReaction();
			case FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				return getVaccinationProtocol();
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
			case FhirPackage.IMMUNIZATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.IMMUNIZATION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.IMMUNIZATION__VACCINE_TYPE:
				setVaccineType((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION__WAS_NOT_GIVEN:
				setWasNotGiven((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.IMMUNIZATION__REPORTED:
				setReported((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.IMMUNIZATION__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION__MANUFACTURER:
				setManufacturer((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION__EXPIRATION_DATE:
				setExpirationDate((Date)newValue);
				return;
			case FhirPackage.IMMUNIZATION__SITE:
				setSite((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION__DOSE_QUANTITY:
				setDoseQuantity((Quantity)newValue);
				return;
			case FhirPackage.IMMUNIZATION__EXPLANATION:
				setExplanation((ImmunizationExplanation)newValue);
				return;
			case FhirPackage.IMMUNIZATION__REACTION:
				getReaction().clear();
				getReaction().addAll((Collection<? extends ImmunizationReaction>)newValue);
				return;
			case FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				getVaccinationProtocol().clear();
				getVaccinationProtocol().addAll((Collection<? extends ImmunizationVaccinationProtocol>)newValue);
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
			case FhirPackage.IMMUNIZATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.IMMUNIZATION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.IMMUNIZATION__VACCINE_TYPE:
				setVaccineType((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION__WAS_NOT_GIVEN:
				setWasNotGiven((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.IMMUNIZATION__REPORTED:
				setReported((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.IMMUNIZATION__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION__REQUESTER:
				setRequester((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION__MANUFACTURER:
				setManufacturer((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION__EXPIRATION_DATE:
				setExpirationDate((Date)null);
				return;
			case FhirPackage.IMMUNIZATION__SITE:
				setSite((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION__DOSE_QUANTITY:
				setDoseQuantity((Quantity)null);
				return;
			case FhirPackage.IMMUNIZATION__EXPLANATION:
				setExplanation((ImmunizationExplanation)null);
				return;
			case FhirPackage.IMMUNIZATION__REACTION:
				getReaction().clear();
				return;
			case FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				getVaccinationProtocol().clear();
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
			case FhirPackage.IMMUNIZATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.IMMUNIZATION__DATE:
				return date != null;
			case FhirPackage.IMMUNIZATION__VACCINE_TYPE:
				return vaccineType != null;
			case FhirPackage.IMMUNIZATION__PATIENT:
				return patient != null;
			case FhirPackage.IMMUNIZATION__WAS_NOT_GIVEN:
				return wasNotGiven != null;
			case FhirPackage.IMMUNIZATION__REPORTED:
				return reported != null;
			case FhirPackage.IMMUNIZATION__PERFORMER:
				return performer != null;
			case FhirPackage.IMMUNIZATION__REQUESTER:
				return requester != null;
			case FhirPackage.IMMUNIZATION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.IMMUNIZATION__MANUFACTURER:
				return manufacturer != null;
			case FhirPackage.IMMUNIZATION__LOCATION:
				return location != null;
			case FhirPackage.IMMUNIZATION__LOT_NUMBER:
				return lotNumber != null;
			case FhirPackage.IMMUNIZATION__EXPIRATION_DATE:
				return expirationDate != null;
			case FhirPackage.IMMUNIZATION__SITE:
				return site != null;
			case FhirPackage.IMMUNIZATION__ROUTE:
				return route != null;
			case FhirPackage.IMMUNIZATION__DOSE_QUANTITY:
				return doseQuantity != null;
			case FhirPackage.IMMUNIZATION__EXPLANATION:
				return explanation != null;
			case FhirPackage.IMMUNIZATION__REACTION:
				return reaction != null && !reaction.isEmpty();
			case FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				return vaccinationProtocol != null && !vaccinationProtocol.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationImpl
