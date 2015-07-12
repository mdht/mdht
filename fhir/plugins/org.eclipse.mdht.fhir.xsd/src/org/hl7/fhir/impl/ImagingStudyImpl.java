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

import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ImagingModality;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.InstanceAvailability;
import org.hl7.fhir.Oid;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getAccession <em>Accession</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getModalityList <em>Modality List</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getReferrer <em>Referrer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getNumberOfSeries <em>Number Of Series</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getClinicalInformation <em>Clinical Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingStudyImpl extends DomainResourceImpl implements ImagingStudy {
	/**
	 * The cached value of the '{@link #getStarted() <em>Started</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected DateTime started;

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
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Oid uid;

	/**
	 * The cached value of the '{@link #getAccession() <em>Accession</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccession()
	 * @generated
	 * @ordered
	 */
	protected Identifier accession;

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
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> order;

	/**
	 * The cached value of the '{@link #getModalityList() <em>Modality List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalityList()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingModality> modalityList;

	/**
	 * The cached value of the '{@link #getReferrer() <em>Referrer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferrer()
	 * @generated
	 * @ordered
	 */
	protected Reference referrer;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected InstanceAvailability availability;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getNumberOfSeries() <em>Number Of Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeries()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfSeries;

	/**
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfInstances;

	/**
	 * The cached value of the '{@link #getClinicalInformation() <em>Clinical Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalInformation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String clinicalInformation;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> procedure;

	/**
	 * The cached value of the '{@link #getInterpreter() <em>Interpreter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreter()
	 * @generated
	 * @ordered
	 */
	protected Reference interpreter;

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
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingStudySeries> series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingStudy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarted(DateTime newStarted, NotificationChain msgs) {
		DateTime oldStarted = started;
		started = newStarted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__STARTED, oldStarted, newStarted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarted(DateTime newStarted) {
		if (newStarted != started) {
			NotificationChain msgs = null;
			if (started != null)
				msgs = ((InternalEObject)started).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__STARTED, null, msgs);
			if (newStarted != null)
				msgs = ((InternalEObject)newStarted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__STARTED, null, msgs);
			msgs = basicSetStarted(newStarted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__STARTED, newStarted, newStarted));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUid(Oid newUid, NotificationChain msgs) {
		Oid oldUid = uid;
		uid = newUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__UID, oldUid, newUid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(Oid newUid) {
		if (newUid != uid) {
			NotificationChain msgs = null;
			if (uid != null)
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__UID, newUid, newUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getAccession() {
		return accession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccession(Identifier newAccession, NotificationChain msgs) {
		Identifier oldAccession = accession;
		accession = newAccession;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__ACCESSION, oldAccession, newAccession);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccession(Identifier newAccession) {
		if (newAccession != accession) {
			NotificationChain msgs = null;
			if (accession != null)
				msgs = ((InternalEObject)accession).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__ACCESSION, null, msgs);
			if (newAccession != null)
				msgs = ((InternalEObject)newAccession).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__ACCESSION, null, msgs);
			msgs = basicSetAccession(newAccession, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__ACCESSION, newAccession, newAccession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.IMAGING_STUDY__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getOrder() {
		if (order == null) {
			order = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_STUDY__ORDER);
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingModality> getModalityList() {
		if (modalityList == null) {
			modalityList = new EObjectContainmentEList<ImagingModality>(ImagingModality.class, this, FhirPackage.IMAGING_STUDY__MODALITY_LIST);
		}
		return modalityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferrer() {
		return referrer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferrer(Reference newReferrer, NotificationChain msgs) {
		Reference oldReferrer = referrer;
		referrer = newReferrer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__REFERRER, oldReferrer, newReferrer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferrer(Reference newReferrer) {
		if (newReferrer != referrer) {
			NotificationChain msgs = null;
			if (referrer != null)
				msgs = ((InternalEObject)referrer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__REFERRER, null, msgs);
			if (newReferrer != null)
				msgs = ((InternalEObject)newReferrer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__REFERRER, null, msgs);
			msgs = basicSetReferrer(newReferrer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__REFERRER, newReferrer, newReferrer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailability getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailability(InstanceAvailability newAvailability, NotificationChain msgs) {
		InstanceAvailability oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__AVAILABILITY, oldAvailability, newAvailability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(InstanceAvailability newAvailability) {
		if (newAvailability != availability) {
			NotificationChain msgs = null;
			if (availability != null)
				msgs = ((InternalEObject)availability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__AVAILABILITY, null, msgs);
			if (newAvailability != null)
				msgs = ((InternalEObject)newAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__AVAILABILITY, null, msgs);
			msgs = basicSetAvailability(newAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__AVAILABILITY, newAvailability, newAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumberOfSeries() {
		return numberOfSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfSeries(UnsignedInt newNumberOfSeries, NotificationChain msgs) {
		UnsignedInt oldNumberOfSeries = numberOfSeries;
		numberOfSeries = newNumberOfSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, oldNumberOfSeries, newNumberOfSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSeries(UnsignedInt newNumberOfSeries) {
		if (newNumberOfSeries != numberOfSeries) {
			NotificationChain msgs = null;
			if (numberOfSeries != null)
				msgs = ((InternalEObject)numberOfSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, null, msgs);
			if (newNumberOfSeries != null)
				msgs = ((InternalEObject)newNumberOfSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, null, msgs);
			msgs = basicSetNumberOfSeries(newNumberOfSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, newNumberOfSeries, newNumberOfSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfInstances(UnsignedInt newNumberOfInstances, NotificationChain msgs) {
		UnsignedInt oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, oldNumberOfInstances, newNumberOfInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfInstances(UnsignedInt newNumberOfInstances) {
		if (newNumberOfInstances != numberOfInstances) {
			NotificationChain msgs = null;
			if (numberOfInstances != null)
				msgs = ((InternalEObject)numberOfInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, null, msgs);
			if (newNumberOfInstances != null)
				msgs = ((InternalEObject)newNumberOfInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, null, msgs);
			msgs = basicSetNumberOfInstances(newNumberOfInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, newNumberOfInstances, newNumberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getClinicalInformation() {
		return clinicalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalInformation(org.hl7.fhir.String newClinicalInformation, NotificationChain msgs) {
		org.hl7.fhir.String oldClinicalInformation = clinicalInformation;
		clinicalInformation = newClinicalInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__CLINICAL_INFORMATION, oldClinicalInformation, newClinicalInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalInformation(org.hl7.fhir.String newClinicalInformation) {
		if (newClinicalInformation != clinicalInformation) {
			NotificationChain msgs = null;
			if (clinicalInformation != null)
				msgs = ((InternalEObject)clinicalInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__CLINICAL_INFORMATION, null, msgs);
			if (newClinicalInformation != null)
				msgs = ((InternalEObject)newClinicalInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__CLINICAL_INFORMATION, null, msgs);
			msgs = basicSetClinicalInformation(newClinicalInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__CLINICAL_INFORMATION, newClinicalInformation, newClinicalInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getProcedure() {
		if (procedure == null) {
			procedure = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.IMAGING_STUDY__PROCEDURE);
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getInterpreter() {
		return interpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterpreter(Reference newInterpreter, NotificationChain msgs) {
		Reference oldInterpreter = interpreter;
		interpreter = newInterpreter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__INTERPRETER, oldInterpreter, newInterpreter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpreter(Reference newInterpreter) {
		if (newInterpreter != interpreter) {
			NotificationChain msgs = null;
			if (interpreter != null)
				msgs = ((InternalEObject)interpreter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__INTERPRETER, null, msgs);
			if (newInterpreter != null)
				msgs = ((InternalEObject)newInterpreter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__INTERPRETER, null, msgs);
			msgs = basicSetInterpreter(newInterpreter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__INTERPRETER, newInterpreter, newInterpreter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingStudySeries> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<ImagingStudySeries>(ImagingStudySeries.class, this, FhirPackage.IMAGING_STUDY__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_STUDY__STARTED:
				return basicSetStarted(null, msgs);
			case FhirPackage.IMAGING_STUDY__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.IMAGING_STUDY__UID:
				return basicSetUid(null, msgs);
			case FhirPackage.IMAGING_STUDY__ACCESSION:
				return basicSetAccession(null, msgs);
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__ORDER:
				return ((InternalEList<?>)getOrder()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__MODALITY_LIST:
				return ((InternalEList<?>)getModalityList()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__REFERRER:
				return basicSetReferrer(null, msgs);
			case FhirPackage.IMAGING_STUDY__AVAILABILITY:
				return basicSetAvailability(null, msgs);
			case FhirPackage.IMAGING_STUDY__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return basicSetNumberOfSeries(null, msgs);
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return basicSetNumberOfInstances(null, msgs);
			case FhirPackage.IMAGING_STUDY__CLINICAL_INFORMATION:
				return basicSetClinicalInformation(null, msgs);
			case FhirPackage.IMAGING_STUDY__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				return basicSetInterpreter(null, msgs);
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMAGING_STUDY__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_STUDY__STARTED:
				return getStarted();
			case FhirPackage.IMAGING_STUDY__PATIENT:
				return getPatient();
			case FhirPackage.IMAGING_STUDY__UID:
				return getUid();
			case FhirPackage.IMAGING_STUDY__ACCESSION:
				return getAccession();
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.IMAGING_STUDY__ORDER:
				return getOrder();
			case FhirPackage.IMAGING_STUDY__MODALITY_LIST:
				return getModalityList();
			case FhirPackage.IMAGING_STUDY__REFERRER:
				return getReferrer();
			case FhirPackage.IMAGING_STUDY__AVAILABILITY:
				return getAvailability();
			case FhirPackage.IMAGING_STUDY__URL:
				return getUrl();
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return getNumberOfSeries();
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return getNumberOfInstances();
			case FhirPackage.IMAGING_STUDY__CLINICAL_INFORMATION:
				return getClinicalInformation();
			case FhirPackage.IMAGING_STUDY__PROCEDURE:
				return getProcedure();
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				return getInterpreter();
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMAGING_STUDY__SERIES:
				return getSeries();
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
			case FhirPackage.IMAGING_STUDY__STARTED:
				setStarted((DateTime)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__UID:
				setUid((Oid)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__ACCESSION:
				setAccession((Identifier)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__ORDER:
				getOrder().clear();
				getOrder().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__MODALITY_LIST:
				getModalityList().clear();
				getModalityList().addAll((Collection<? extends ImagingModality>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__REFERRER:
				setReferrer((Reference)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__AVAILABILITY:
				setAvailability((InstanceAvailability)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				setNumberOfSeries((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__CLINICAL_INFORMATION:
				setClinicalInformation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				setInterpreter((Reference)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends ImagingStudySeries>)newValue);
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
			case FhirPackage.IMAGING_STUDY__STARTED:
				setStarted((DateTime)null);
				return;
			case FhirPackage.IMAGING_STUDY__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.IMAGING_STUDY__UID:
				setUid((Oid)null);
				return;
			case FhirPackage.IMAGING_STUDY__ACCESSION:
				setAccession((Identifier)null);
				return;
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.IMAGING_STUDY__ORDER:
				getOrder().clear();
				return;
			case FhirPackage.IMAGING_STUDY__MODALITY_LIST:
				getModalityList().clear();
				return;
			case FhirPackage.IMAGING_STUDY__REFERRER:
				setReferrer((Reference)null);
				return;
			case FhirPackage.IMAGING_STUDY__AVAILABILITY:
				setAvailability((InstanceAvailability)null);
				return;
			case FhirPackage.IMAGING_STUDY__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				setNumberOfSeries((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_STUDY__CLINICAL_INFORMATION:
				setClinicalInformation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMAGING_STUDY__PROCEDURE:
				getProcedure().clear();
				return;
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				setInterpreter((Reference)null);
				return;
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMAGING_STUDY__SERIES:
				getSeries().clear();
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
			case FhirPackage.IMAGING_STUDY__STARTED:
				return started != null;
			case FhirPackage.IMAGING_STUDY__PATIENT:
				return patient != null;
			case FhirPackage.IMAGING_STUDY__UID:
				return uid != null;
			case FhirPackage.IMAGING_STUDY__ACCESSION:
				return accession != null;
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.IMAGING_STUDY__ORDER:
				return order != null && !order.isEmpty();
			case FhirPackage.IMAGING_STUDY__MODALITY_LIST:
				return modalityList != null && !modalityList.isEmpty();
			case FhirPackage.IMAGING_STUDY__REFERRER:
				return referrer != null;
			case FhirPackage.IMAGING_STUDY__AVAILABILITY:
				return availability != null;
			case FhirPackage.IMAGING_STUDY__URL:
				return url != null;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return numberOfSeries != null;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return numberOfInstances != null;
			case FhirPackage.IMAGING_STUDY__CLINICAL_INFORMATION:
				return clinicalInformation != null;
			case FhirPackage.IMAGING_STUDY__PROCEDURE:
				return procedure != null && !procedure.isEmpty();
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				return interpreter != null;
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				return description != null;
			case FhirPackage.IMAGING_STUDY__SERIES:
				return series != null && !series.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingStudyImpl
