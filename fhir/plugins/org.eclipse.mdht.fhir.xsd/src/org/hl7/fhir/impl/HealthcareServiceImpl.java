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
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.HealthcareServiceServiceType;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healthcare Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getExtraDetails <em>Extra Details</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getCoverageArea <em>Coverage Area</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getServiceProvisionCode <em>Service Provision Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getEligibility <em>Eligibility</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getEligibilityNote <em>Eligibility Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getProgramName <em>Program Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getReferralMethod <em>Referral Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getAppointmentRequired <em>Appointment Required</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getNotAvailable <em>Not Available</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthcareServiceImpl extends DomainResourceImpl implements HealthcareService {
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
	 * The cached value of the '{@link #getProvidedBy() <em>Provided By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBy()
	 * @generated
	 * @ordered
	 */
	protected Reference providedBy;

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
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept serviceCategory;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareServiceServiceType> serviceType;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String serviceName;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * The cached value of the '{@link #getExtraDetails() <em>Extra Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraDetails()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String extraDetails;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected Attachment photo;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecom;

	/**
	 * The cached value of the '{@link #getCoverageArea() <em>Coverage Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageArea()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> coverageArea;

	/**
	 * The cached value of the '{@link #getServiceProvisionCode() <em>Service Provision Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvisionCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceProvisionCode;

	/**
	 * The cached value of the '{@link #getEligibility() <em>Eligibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibility()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept eligibility;

	/**
	 * The cached value of the '{@link #getEligibilityNote() <em>Eligibility Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibilityNote()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String eligibilityNote;

	/**
	 * The cached value of the '{@link #getProgramName() <em>Program Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramName()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> programName;

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> characteristic;

	/**
	 * The cached value of the '{@link #getReferralMethod() <em>Referral Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> referralMethod;

	/**
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publicKey;

	/**
	 * The cached value of the '{@link #getAppointmentRequired() <em>Appointment Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentRequired()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean appointmentRequired;

	/**
	 * The cached value of the '{@link #getAvailableTime() <em>Available Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTime()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareServiceAvailableTime> availableTime;

	/**
	 * The cached value of the '{@link #getNotAvailable() <em>Not Available</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotAvailable()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareServiceNotAvailable> notAvailable;

	/**
	 * The cached value of the '{@link #getAvailabilityExceptions() <em>Availability Exceptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityExceptions()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String availabilityExceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthcareServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getHealthcareService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProvidedBy() {
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedBy(Reference newProvidedBy, NotificationChain msgs) {
		Reference oldProvidedBy = providedBy;
		providedBy = newProvidedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY, oldProvidedBy, newProvidedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedBy(Reference newProvidedBy) {
		if (newProvidedBy != providedBy) {
			NotificationChain msgs = null;
			if (providedBy != null)
				msgs = ((InternalEObject)providedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY, null, msgs);
			if (newProvidedBy != null)
				msgs = ((InternalEObject)newProvidedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY, null, msgs);
			msgs = basicSetProvidedBy(newProvidedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY, newProvidedBy, newProvidedBy));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getServiceCategory() {
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCategory(CodeableConcept newServiceCategory, NotificationChain msgs) {
		CodeableConcept oldServiceCategory = serviceCategory;
		serviceCategory = newServiceCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY, oldServiceCategory, newServiceCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCategory(CodeableConcept newServiceCategory) {
		if (newServiceCategory != serviceCategory) {
			NotificationChain msgs = null;
			if (serviceCategory != null)
				msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY, null, msgs);
			if (newServiceCategory != null)
				msgs = ((InternalEObject)newServiceCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY, null, msgs);
			msgs = basicSetServiceCategory(newServiceCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY, newServiceCategory, newServiceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthcareServiceServiceType> getServiceType() {
		if (serviceType == null) {
			serviceType = new EObjectContainmentEList<HealthcareServiceServiceType>(HealthcareServiceServiceType.class, this, FhirPackage.HEALTHCARE_SERVICE__SERVICE_TYPE);
		}
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceName(org.hl7.fhir.String newServiceName, NotificationChain msgs) {
		org.hl7.fhir.String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__SERVICE_NAME, oldServiceName, newServiceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(org.hl7.fhir.String newServiceName) {
		if (newServiceName != serviceName) {
			NotificationChain msgs = null;
			if (serviceName != null)
				msgs = ((InternalEObject)serviceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__SERVICE_NAME, null, msgs);
			if (newServiceName != null)
				msgs = ((InternalEObject)newServiceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__SERVICE_NAME, null, msgs);
			msgs = basicSetServiceName(newServiceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__SERVICE_NAME, newServiceName, newServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getExtraDetails() {
		return extraDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtraDetails(org.hl7.fhir.String newExtraDetails, NotificationChain msgs) {
		org.hl7.fhir.String oldExtraDetails = extraDetails;
		extraDetails = newExtraDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, oldExtraDetails, newExtraDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraDetails(org.hl7.fhir.String newExtraDetails) {
		if (newExtraDetails != extraDetails) {
			NotificationChain msgs = null;
			if (extraDetails != null)
				msgs = ((InternalEObject)extraDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, null, msgs);
			if (newExtraDetails != null)
				msgs = ((InternalEObject)newExtraDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, null, msgs);
			msgs = basicSetExtraDetails(newExtraDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, newExtraDetails, newExtraDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getPhoto() {
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhoto(Attachment newPhoto, NotificationChain msgs) {
		Attachment oldPhoto = photo;
		photo = newPhoto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__PHOTO, oldPhoto, newPhoto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoto(Attachment newPhoto) {
		if (newPhoto != photo) {
			NotificationChain msgs = null;
			if (photo != null)
				msgs = ((InternalEObject)photo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__PHOTO, null, msgs);
			if (newPhoto != null)
				msgs = ((InternalEObject)newPhoto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__PHOTO, null, msgs);
			msgs = basicSetPhoto(newPhoto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__PHOTO, newPhoto, newPhoto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.HEALTHCARE_SERVICE__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getCoverageArea() {
		if (coverageArea == null) {
			coverageArea = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA);
		}
		return coverageArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServiceProvisionCode() {
		if (serviceProvisionCode == null) {
			serviceProvisionCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE);
		}
		return serviceProvisionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getEligibility() {
		return eligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEligibility(CodeableConcept newEligibility, NotificationChain msgs) {
		CodeableConcept oldEligibility = eligibility;
		eligibility = newEligibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY, oldEligibility, newEligibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEligibility(CodeableConcept newEligibility) {
		if (newEligibility != eligibility) {
			NotificationChain msgs = null;
			if (eligibility != null)
				msgs = ((InternalEObject)eligibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY, null, msgs);
			if (newEligibility != null)
				msgs = ((InternalEObject)newEligibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY, null, msgs);
			msgs = basicSetEligibility(newEligibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY, newEligibility, newEligibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getEligibilityNote() {
		return eligibilityNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEligibilityNote(org.hl7.fhir.String newEligibilityNote, NotificationChain msgs) {
		org.hl7.fhir.String oldEligibilityNote = eligibilityNote;
		eligibilityNote = newEligibilityNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE, oldEligibilityNote, newEligibilityNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEligibilityNote(org.hl7.fhir.String newEligibilityNote) {
		if (newEligibilityNote != eligibilityNote) {
			NotificationChain msgs = null;
			if (eligibilityNote != null)
				msgs = ((InternalEObject)eligibilityNote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE, null, msgs);
			if (newEligibilityNote != null)
				msgs = ((InternalEObject)newEligibilityNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE, null, msgs);
			msgs = basicSetEligibilityNote(newEligibilityNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE, newEligibilityNote, newEligibilityNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getProgramName() {
		if (programName == null) {
			programName = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.HEALTHCARE_SERVICE__PROGRAM_NAME);
		}
		return programName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC);
		}
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReferralMethod() {
		if (referralMethod == null) {
			referralMethod = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD);
		}
		return referralMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublicKey() {
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicKey(org.hl7.fhir.String newPublicKey, NotificationChain msgs) {
		org.hl7.fhir.String oldPublicKey = publicKey;
		publicKey = newPublicKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__PUBLIC_KEY, oldPublicKey, newPublicKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicKey(org.hl7.fhir.String newPublicKey) {
		if (newPublicKey != publicKey) {
			NotificationChain msgs = null;
			if (publicKey != null)
				msgs = ((InternalEObject)publicKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__PUBLIC_KEY, null, msgs);
			if (newPublicKey != null)
				msgs = ((InternalEObject)newPublicKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__PUBLIC_KEY, null, msgs);
			msgs = basicSetPublicKey(newPublicKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__PUBLIC_KEY, newPublicKey, newPublicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAppointmentRequired() {
		return appointmentRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointmentRequired(org.hl7.fhir.Boolean newAppointmentRequired, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAppointmentRequired = appointmentRequired;
		appointmentRequired = newAppointmentRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, oldAppointmentRequired, newAppointmentRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointmentRequired(org.hl7.fhir.Boolean newAppointmentRequired) {
		if (newAppointmentRequired != appointmentRequired) {
			NotificationChain msgs = null;
			if (appointmentRequired != null)
				msgs = ((InternalEObject)appointmentRequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, null, msgs);
			if (newAppointmentRequired != null)
				msgs = ((InternalEObject)newAppointmentRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, null, msgs);
			msgs = basicSetAppointmentRequired(newAppointmentRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, newAppointmentRequired, newAppointmentRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthcareServiceAvailableTime> getAvailableTime() {
		if (availableTime == null) {
			availableTime = new EObjectContainmentEList<HealthcareServiceAvailableTime>(HealthcareServiceAvailableTime.class, this, FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME);
		}
		return availableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthcareServiceNotAvailable> getNotAvailable() {
		if (notAvailable == null) {
			notAvailable = new EObjectContainmentEList<HealthcareServiceNotAvailable>(HealthcareServiceNotAvailable.class, this, FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE);
		}
		return notAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAvailabilityExceptions() {
		return availabilityExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailabilityExceptions(org.hl7.fhir.String newAvailabilityExceptions, NotificationChain msgs) {
		org.hl7.fhir.String oldAvailabilityExceptions = availabilityExceptions;
		availabilityExceptions = newAvailabilityExceptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, oldAvailabilityExceptions, newAvailabilityExceptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityExceptions(org.hl7.fhir.String newAvailabilityExceptions) {
		if (newAvailabilityExceptions != availabilityExceptions) {
			NotificationChain msgs = null;
			if (availabilityExceptions != null)
				msgs = ((InternalEObject)availabilityExceptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, null, msgs);
			if (newAvailabilityExceptions != null)
				msgs = ((InternalEObject)newAvailabilityExceptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, null, msgs);
			msgs = basicSetAvailabilityExceptions(newAvailabilityExceptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, newAvailabilityExceptions, newAvailabilityExceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				return basicSetProvidedBy(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY:
				return basicSetServiceCategory(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_TYPE:
				return ((InternalEList<?>)getServiceType()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_NAME:
				return basicSetServiceName(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__COMMENT:
				return basicSetComment(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				return basicSetExtraDetails(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__PHOTO:
				return basicSetPhoto(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				return ((InternalEList<?>)getCoverageArea()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				return ((InternalEList<?>)getServiceProvisionCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				return basicSetEligibility(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE:
				return basicSetEligibilityNote(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__PROGRAM_NAME:
				return ((InternalEList<?>)getProgramName()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristic()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				return ((InternalEList<?>)getReferralMethod()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__PUBLIC_KEY:
				return basicSetPublicKey(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				return basicSetAppointmentRequired(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return ((InternalEList<?>)getAvailableTime()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return ((InternalEList<?>)getNotAvailable()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				return basicSetAvailabilityExceptions(null, msgs);
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
			case FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				return getProvidedBy();
			case FhirPackage.HEALTHCARE_SERVICE__LOCATION:
				return getLocation();
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY:
				return getServiceCategory();
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_TYPE:
				return getServiceType();
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_NAME:
				return getServiceName();
			case FhirPackage.HEALTHCARE_SERVICE__COMMENT:
				return getComment();
			case FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				return getExtraDetails();
			case FhirPackage.HEALTHCARE_SERVICE__PHOTO:
				return getPhoto();
			case FhirPackage.HEALTHCARE_SERVICE__TELECOM:
				return getTelecom();
			case FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				return getCoverageArea();
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				return getServiceProvisionCode();
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				return getEligibility();
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE:
				return getEligibilityNote();
			case FhirPackage.HEALTHCARE_SERVICE__PROGRAM_NAME:
				return getProgramName();
			case FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				return getCharacteristic();
			case FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				return getReferralMethod();
			case FhirPackage.HEALTHCARE_SERVICE__PUBLIC_KEY:
				return getPublicKey();
			case FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				return getAppointmentRequired();
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return getAvailableTime();
			case FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return getNotAvailable();
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				return getAvailabilityExceptions();
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
			case FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				setProvidedBy((Reference)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY:
				setServiceCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_TYPE:
				getServiceType().clear();
				getServiceType().addAll((Collection<? extends HealthcareServiceServiceType>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_NAME:
				setServiceName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				setExtraDetails((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PHOTO:
				setPhoto((Attachment)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				getCoverageArea().clear();
				getCoverageArea().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				getServiceProvisionCode().clear();
				getServiceProvisionCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				setEligibility((CodeableConcept)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE:
				setEligibilityNote((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PROGRAM_NAME:
				getProgramName().clear();
				getProgramName().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				getReferralMethod().clear();
				getReferralMethod().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PUBLIC_KEY:
				setPublicKey((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				setAppointmentRequired((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				getAvailableTime().clear();
				getAvailableTime().addAll((Collection<? extends HealthcareServiceAvailableTime>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				getNotAvailable().clear();
				getNotAvailable().addAll((Collection<? extends HealthcareServiceNotAvailable>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.hl7.fhir.String)newValue);
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
			case FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				setProvidedBy((Reference)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY:
				setServiceCategory((CodeableConcept)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_TYPE:
				getServiceType().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_NAME:
				setServiceName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__COMMENT:
				setComment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				setExtraDetails((org.hl7.fhir.String)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PHOTO:
				setPhoto((Attachment)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__TELECOM:
				getTelecom().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				getCoverageArea().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				getServiceProvisionCode().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				setEligibility((CodeableConcept)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE:
				setEligibilityNote((org.hl7.fhir.String)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PROGRAM_NAME:
				getProgramName().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				getCharacteristic().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				getReferralMethod().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PUBLIC_KEY:
				setPublicKey((org.hl7.fhir.String)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				setAppointmentRequired((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				getAvailableTime().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				getNotAvailable().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.hl7.fhir.String)null);
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
			case FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				return providedBy != null;
			case FhirPackage.HEALTHCARE_SERVICE__LOCATION:
				return location != null;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY:
				return serviceCategory != null;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_TYPE:
				return serviceType != null && !serviceType.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_NAME:
				return serviceName != null;
			case FhirPackage.HEALTHCARE_SERVICE__COMMENT:
				return comment != null;
			case FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				return extraDetails != null;
			case FhirPackage.HEALTHCARE_SERVICE__PHOTO:
				return photo != null;
			case FhirPackage.HEALTHCARE_SERVICE__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				return coverageArea != null && !coverageArea.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				return serviceProvisionCode != null && !serviceProvisionCode.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				return eligibility != null;
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE:
				return eligibilityNote != null;
			case FhirPackage.HEALTHCARE_SERVICE__PROGRAM_NAME:
				return programName != null && !programName.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				return referralMethod != null && !referralMethod.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__PUBLIC_KEY:
				return publicKey != null;
			case FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				return appointmentRequired != null;
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return availableTime != null && !availableTime.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return notAvailable != null && !notAvailable.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				return availabilityExceptions != null;
		}
		return super.eIsSet(featureID);
	}

} //HealthcareServiceImpl
