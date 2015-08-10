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

import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DataElement;
import org.hl7.fhir.DataElementContact;
import org.hl7.fhir.DataElementMapping;
import org.hl7.fhir.DataElementStringency;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getStringency <em>Stringency</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataElementImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataElementImpl extends DomainResourceImpl implements DataElement {
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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean experimental;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publisher;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<DataElementContact> contact;

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
	 * The cached value of the '{@link #getUseContext() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContext()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> useContext;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String copyright;

	/**
	 * The cached value of the '{@link #getStringency() <em>Stringency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringency()
	 * @generated
	 * @ordered
	 */
	protected DataElementStringency stringency;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<DataElementMapping> mapping;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinition> element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDataElement();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DATA_ELEMENT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.hl7.fhir.Boolean newExperimental, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__EXPERIMENTAL, oldExperimental, newExperimental);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimental(org.hl7.fhir.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.hl7.fhir.String newPublisher, NotificationChain msgs) {
		org.hl7.fhir.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.hl7.fhir.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataElementContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<DataElementContact>(DataElementContact.class, this, FhirPackage.DATA_ELEMENT__CONTACT);
		}
		return contact;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DATA_ELEMENT__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(org.hl7.fhir.String newCopyright, NotificationChain msgs) {
		org.hl7.fhir.String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(org.hl7.fhir.String newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementStringency getStringency() {
		return stringency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringency(DataElementStringency newStringency, NotificationChain msgs) {
		DataElementStringency oldStringency = stringency;
		stringency = newStringency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__STRINGENCY, oldStringency, newStringency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringency(DataElementStringency newStringency) {
		if (newStringency != stringency) {
			NotificationChain msgs = null;
			if (stringency != null)
				msgs = ((InternalEObject)stringency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__STRINGENCY, null, msgs);
			if (newStringency != null)
				msgs = ((InternalEObject)newStringency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_ELEMENT__STRINGENCY, null, msgs);
			msgs = basicSetStringency(newStringency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_ELEMENT__STRINGENCY, newStringency, newStringency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataElementMapping> getMapping() {
		if (mapping == null) {
			mapping = new EObjectContainmentEList<DataElementMapping>(DataElementMapping.class, this, FhirPackage.DATA_ELEMENT__MAPPING);
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDefinition> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<ElementDefinition>(ElementDefinition.class, this, FhirPackage.DATA_ELEMENT__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DATA_ELEMENT__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.DATA_ELEMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DATA_ELEMENT__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.DATA_ELEMENT__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.DATA_ELEMENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DATA_ELEMENT__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.DATA_ELEMENT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.DATA_ELEMENT__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.DATA_ELEMENT__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.DATA_ELEMENT__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.DATA_ELEMENT__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.DATA_ELEMENT__STRINGENCY:
				return basicSetStringency(null, msgs);
			case FhirPackage.DATA_ELEMENT__MAPPING:
				return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
			case FhirPackage.DATA_ELEMENT__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DATA_ELEMENT__URL:
				return getUrl();
			case FhirPackage.DATA_ELEMENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DATA_ELEMENT__VERSION:
				return getVersion();
			case FhirPackage.DATA_ELEMENT__NAME:
				return getName();
			case FhirPackage.DATA_ELEMENT__STATUS:
				return getStatus();
			case FhirPackage.DATA_ELEMENT__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.DATA_ELEMENT__PUBLISHER:
				return getPublisher();
			case FhirPackage.DATA_ELEMENT__CONTACT:
				return getContact();
			case FhirPackage.DATA_ELEMENT__DATE:
				return getDate();
			case FhirPackage.DATA_ELEMENT__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.DATA_ELEMENT__COPYRIGHT:
				return getCopyright();
			case FhirPackage.DATA_ELEMENT__STRINGENCY:
				return getStringency();
			case FhirPackage.DATA_ELEMENT__MAPPING:
				return getMapping();
			case FhirPackage.DATA_ELEMENT__ELEMENT:
				return getElement();
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
			case FhirPackage.DATA_ELEMENT__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends DataElementContact>)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__STRINGENCY:
				setStringency((DataElementStringency)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__MAPPING:
				getMapping().clear();
				getMapping().addAll((Collection<? extends DataElementMapping>)newValue);
				return;
			case FhirPackage.DATA_ELEMENT__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends ElementDefinition>)newValue);
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
			case FhirPackage.DATA_ELEMENT__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.DATA_ELEMENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DATA_ELEMENT__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DATA_ELEMENT__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DATA_ELEMENT__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.DATA_ELEMENT__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.DATA_ELEMENT__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DATA_ELEMENT__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.DATA_ELEMENT__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.DATA_ELEMENT__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.DATA_ELEMENT__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DATA_ELEMENT__STRINGENCY:
				setStringency((DataElementStringency)null);
				return;
			case FhirPackage.DATA_ELEMENT__MAPPING:
				getMapping().clear();
				return;
			case FhirPackage.DATA_ELEMENT__ELEMENT:
				getElement().clear();
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
			case FhirPackage.DATA_ELEMENT__URL:
				return url != null;
			case FhirPackage.DATA_ELEMENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DATA_ELEMENT__VERSION:
				return version != null;
			case FhirPackage.DATA_ELEMENT__NAME:
				return name != null;
			case FhirPackage.DATA_ELEMENT__STATUS:
				return status != null;
			case FhirPackage.DATA_ELEMENT__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.DATA_ELEMENT__PUBLISHER:
				return publisher != null;
			case FhirPackage.DATA_ELEMENT__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.DATA_ELEMENT__DATE:
				return date != null;
			case FhirPackage.DATA_ELEMENT__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.DATA_ELEMENT__COPYRIGHT:
				return copyright != null;
			case FhirPackage.DATA_ELEMENT__STRINGENCY:
				return stringency != null;
			case FhirPackage.DATA_ELEMENT__MAPPING:
				return mapping != null && !mapping.isEmpty();
			case FhirPackage.DATA_ELEMENT__ELEMENT:
				return element != null && !element.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataElementImpl
