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
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.InstanceAvailability;
import org.hl7.fhir.Oid;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Study Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getLaterality <em>Laterality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingStudySeriesImpl extends BackboneElementImpl implements ImagingStudySeries {
	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt number;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected Coding modality;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

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
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected Coding bodySite;

	/**
	 * The cached value of the '{@link #getLaterality() <em>Laterality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaterality()
	 * @generated
	 * @ordered
	 */
	protected Coding laterality;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateTime;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingStudyInstance> instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingStudySeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingStudySeries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(UnsignedInt newNumber, NotificationChain msgs) {
		UnsignedInt oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__NUMBER, oldNumber, newNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(UnsignedInt newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModality(Coding newModality, NotificationChain msgs) {
		Coding oldModality = modality;
		modality = newModality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__MODALITY, oldModality, newModality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModality(Coding newModality) {
		if (newModality != modality) {
			NotificationChain msgs = null;
			if (modality != null)
				msgs = ((InternalEObject)modality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__MODALITY, null, msgs);
			if (newModality != null)
				msgs = ((InternalEObject)newModality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__MODALITY, null, msgs);
			msgs = basicSetModality(newModality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__MODALITY, newModality, newModality));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__UID, oldUid, newUid);
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
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__UID, newUid, newUid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, oldNumberOfInstances, newNumberOfInstances);
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
				msgs = ((InternalEObject)numberOfInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, null, msgs);
			if (newNumberOfInstances != null)
				msgs = ((InternalEObject)newNumberOfInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, null, msgs);
			msgs = basicSetNumberOfInstances(newNumberOfInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, newNumberOfInstances, newNumberOfInstances));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__AVAILABILITY, oldAvailability, newAvailability);
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
				msgs = ((InternalEObject)availability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__AVAILABILITY, null, msgs);
			if (newAvailability != null)
				msgs = ((InternalEObject)newAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__AVAILABILITY, null, msgs);
			msgs = basicSetAvailability(newAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__AVAILABILITY, newAvailability, newAvailability));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(Coding newBodySite, NotificationChain msgs) {
		Coding oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(Coding newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getLaterality() {
		return laterality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaterality(Coding newLaterality, NotificationChain msgs) {
		Coding oldLaterality = laterality;
		laterality = newLaterality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__LATERALITY, oldLaterality, newLaterality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaterality(Coding newLaterality) {
		if (newLaterality != laterality) {
			NotificationChain msgs = null;
			if (laterality != null)
				msgs = ((InternalEObject)laterality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__LATERALITY, null, msgs);
			if (newLaterality != null)
				msgs = ((InternalEObject)newLaterality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__LATERALITY, null, msgs);
			msgs = basicSetLaterality(newLaterality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__LATERALITY, newLaterality, newLaterality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTime newDateTime, NotificationChain msgs) {
		DateTime oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__DATE_TIME, oldDateTime, newDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(DateTime newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingStudyInstance> getInstance() {
		if (instance == null) {
			instance = new EObjectContainmentEList<ImagingStudyInstance>(ImagingStudyInstance.class, this, FhirPackage.IMAGING_STUDY_SERIES__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER:
				return basicSetNumber(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__MODALITY:
				return basicSetModality(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__UID:
				return basicSetUid(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				return basicSetNumberOfInstances(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__AVAILABILITY:
				return basicSetAvailability(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__LATERALITY:
				return basicSetLaterality(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__INSTANCE:
				return ((InternalEList<?>)getInstance()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER:
				return getNumber();
			case FhirPackage.IMAGING_STUDY_SERIES__MODALITY:
				return getModality();
			case FhirPackage.IMAGING_STUDY_SERIES__UID:
				return getUid();
			case FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				return getNumberOfInstances();
			case FhirPackage.IMAGING_STUDY_SERIES__AVAILABILITY:
				return getAvailability();
			case FhirPackage.IMAGING_STUDY_SERIES__URL:
				return getUrl();
			case FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				return getBodySite();
			case FhirPackage.IMAGING_STUDY_SERIES__LATERALITY:
				return getLaterality();
			case FhirPackage.IMAGING_STUDY_SERIES__DATE_TIME:
				return getDateTime();
			case FhirPackage.IMAGING_STUDY_SERIES__INSTANCE:
				return getInstance();
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
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER:
				setNumber((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__MODALITY:
				setModality((Coding)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__UID:
				setUid((Oid)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__AVAILABILITY:
				setAvailability((InstanceAvailability)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				setBodySite((Coding)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__LATERALITY:
				setLaterality((Coding)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__DATE_TIME:
				setDateTime((DateTime)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends ImagingStudyInstance>)newValue);
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
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER:
				setNumber((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__MODALITY:
				setModality((Coding)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__UID:
				setUid((Oid)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__AVAILABILITY:
				setAvailability((InstanceAvailability)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				setBodySite((Coding)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__LATERALITY:
				setLaterality((Coding)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__DATE_TIME:
				setDateTime((DateTime)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__INSTANCE:
				getInstance().clear();
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
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER:
				return number != null;
			case FhirPackage.IMAGING_STUDY_SERIES__MODALITY:
				return modality != null;
			case FhirPackage.IMAGING_STUDY_SERIES__UID:
				return uid != null;
			case FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				return description != null;
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				return numberOfInstances != null;
			case FhirPackage.IMAGING_STUDY_SERIES__AVAILABILITY:
				return availability != null;
			case FhirPackage.IMAGING_STUDY_SERIES__URL:
				return url != null;
			case FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				return bodySite != null;
			case FhirPackage.IMAGING_STUDY_SERIES__LATERALITY:
				return laterality != null;
			case FhirPackage.IMAGING_STUDY_SERIES__DATE_TIME:
				return dateTime != null;
			case FhirPackage.IMAGING_STUDY_SERIES__INSTANCE:
				return instance != null && !instance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingStudySeriesImpl
