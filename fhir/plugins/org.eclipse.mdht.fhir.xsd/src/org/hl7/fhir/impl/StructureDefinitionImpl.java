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
import org.hl7.fhir.Coding;
import org.hl7.fhir.ConformanceResourceStatus;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.ExtensionContext;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionContact;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureDefinitionType;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getSnapshot <em>Snapshot</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureDefinitionImpl#getDifferential <em>Differential</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureDefinitionImpl extends DomainResourceImpl implements StructureDefinition {
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
	 * The cached value of the '{@link #getUseContext() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContext()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> useContext;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String display;

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
	protected EList<StructureDefinitionContact> contact;

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
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String requirements;

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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> code;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ConformanceResourceStatus status;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getFhirVersion() <em>Fhir Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersion()
	 * @generated
	 * @ordered
	 */
	protected Id fhirVersion;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureDefinitionMapping> mapping;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinitionType type;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean abstract_;

	/**
	 * The cached value of the '{@link #getContextType() <em>Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected ExtensionContext contextType;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> context;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Uri base;

	/**
	 * The cached value of the '{@link #getSnapshot() <em>Snapshot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshot()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinitionSnapshot snapshot;

	/**
	 * The cached value of the '{@link #getDifferential() <em>Differential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferential()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinitionDifferential differential;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getStructureDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.STRUCTURE_DEFINITION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.STRUCTURE_DEFINITION__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.hl7.fhir.String newDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__DISPLAY, oldDisplay, newDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.hl7.fhir.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__DISPLAY, newDisplay, newDisplay));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDefinitionContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<StructureDefinitionContact>(StructureDefinitionContact.class, this, FhirPackage.STRUCTURE_DEFINITION__CONTACT);
		}
		return contact;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(org.hl7.fhir.String newRequirements, NotificationChain msgs) {
		org.hl7.fhir.String oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(org.hl7.fhir.String newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__REQUIREMENTS, newRequirements, newRequirements));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.STRUCTURE_DEFINITION__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResourceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ConformanceResourceStatus newStatus, NotificationChain msgs) {
		ConformanceResourceStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ConformanceResourceStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getFhirVersion() {
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFhirVersion(Id newFhirVersion, NotificationChain msgs) {
		Id oldFhirVersion = fhirVersion;
		fhirVersion = newFhirVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__FHIR_VERSION, oldFhirVersion, newFhirVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFhirVersion(Id newFhirVersion) {
		if (newFhirVersion != fhirVersion) {
			NotificationChain msgs = null;
			if (fhirVersion != null)
				msgs = ((InternalEObject)fhirVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__FHIR_VERSION, null, msgs);
			if (newFhirVersion != null)
				msgs = ((InternalEObject)newFhirVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__FHIR_VERSION, null, msgs);
			msgs = basicSetFhirVersion(newFhirVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__FHIR_VERSION, newFhirVersion, newFhirVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDefinitionMapping> getMapping() {
		if (mapping == null) {
			mapping = new EObjectContainmentEList<StructureDefinitionMapping>(StructureDefinitionMapping.class, this, FhirPackage.STRUCTURE_DEFINITION__MAPPING);
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(StructureDefinitionType newType, NotificationChain msgs) {
		StructureDefinitionType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StructureDefinitionType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(org.hl7.fhir.Boolean newAbstract, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__ABSTRACT, oldAbstract, newAbstract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(org.hl7.fhir.Boolean newAbstract) {
		if (newAbstract != abstract_) {
			NotificationChain msgs = null;
			if (abstract_ != null)
				msgs = ((InternalEObject)abstract_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__ABSTRACT, null, msgs);
			if (newAbstract != null)
				msgs = ((InternalEObject)newAbstract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__ABSTRACT, null, msgs);
			msgs = basicSetAbstract(newAbstract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__ABSTRACT, newAbstract, newAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContext getContextType() {
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextType(ExtensionContext newContextType, NotificationChain msgs) {
		ExtensionContext oldContextType = contextType;
		contextType = newContextType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE, oldContextType, newContextType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextType(ExtensionContext newContextType) {
		if (newContextType != contextType) {
			NotificationChain msgs = null;
			if (contextType != null)
				msgs = ((InternalEObject)contextType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE, null, msgs);
			if (newContextType != null)
				msgs = ((InternalEObject)newContextType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE, null, msgs);
			msgs = basicSetContextType(newContextType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE, newContextType, newContextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getContext() {
		if (context == null) {
			context = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.STRUCTURE_DEFINITION__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(Uri newBase, NotificationChain msgs) {
		Uri oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(Uri newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionSnapshot getSnapshot() {
		return snapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSnapshot(StructureDefinitionSnapshot newSnapshot, NotificationChain msgs) {
		StructureDefinitionSnapshot oldSnapshot = snapshot;
		snapshot = newSnapshot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__SNAPSHOT, oldSnapshot, newSnapshot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnapshot(StructureDefinitionSnapshot newSnapshot) {
		if (newSnapshot != snapshot) {
			NotificationChain msgs = null;
			if (snapshot != null)
				msgs = ((InternalEObject)snapshot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__SNAPSHOT, null, msgs);
			if (newSnapshot != null)
				msgs = ((InternalEObject)newSnapshot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__SNAPSHOT, null, msgs);
			msgs = basicSetSnapshot(newSnapshot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__SNAPSHOT, newSnapshot, newSnapshot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionDifferential getDifferential() {
		return differential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDifferential(StructureDefinitionDifferential newDifferential, NotificationChain msgs) {
		StructureDefinitionDifferential oldDifferential = differential;
		differential = newDifferential;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__DIFFERENTIAL, oldDifferential, newDifferential);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifferential(StructureDefinitionDifferential newDifferential) {
		if (newDifferential != differential) {
			NotificationChain msgs = null;
			if (differential != null)
				msgs = ((InternalEObject)differential).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__DIFFERENTIAL, null, msgs);
			if (newDifferential != null)
				msgs = ((InternalEObject)newDifferential).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_DEFINITION__DIFFERENTIAL, null, msgs);
			msgs = basicSetDifferential(newDifferential, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_DEFINITION__DIFFERENTIAL, newDifferential, newDifferential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.STRUCTURE_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__DISPLAY:
				return basicSetDisplay(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__FHIR_VERSION:
				return basicSetFhirVersion(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__MAPPING:
				return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				return basicSetContextType(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__BASE:
				return basicSetBase(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__SNAPSHOT:
				return basicSetSnapshot(null, msgs);
			case FhirPackage.STRUCTURE_DEFINITION__DIFFERENTIAL:
				return basicSetDifferential(null, msgs);
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
			case FhirPackage.STRUCTURE_DEFINITION__URL:
				return getUrl();
			case FhirPackage.STRUCTURE_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.STRUCTURE_DEFINITION__VERSION:
				return getVersion();
			case FhirPackage.STRUCTURE_DEFINITION__NAME:
				return getName();
			case FhirPackage.STRUCTURE_DEFINITION__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.STRUCTURE_DEFINITION__DISPLAY:
				return getDisplay();
			case FhirPackage.STRUCTURE_DEFINITION__PUBLISHER:
				return getPublisher();
			case FhirPackage.STRUCTURE_DEFINITION__CONTACT:
				return getContact();
			case FhirPackage.STRUCTURE_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.STRUCTURE_DEFINITION__REQUIREMENTS:
				return getRequirements();
			case FhirPackage.STRUCTURE_DEFINITION__COPYRIGHT:
				return getCopyright();
			case FhirPackage.STRUCTURE_DEFINITION__CODE:
				return getCode();
			case FhirPackage.STRUCTURE_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.STRUCTURE_DEFINITION__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.STRUCTURE_DEFINITION__DATE:
				return getDate();
			case FhirPackage.STRUCTURE_DEFINITION__FHIR_VERSION:
				return getFhirVersion();
			case FhirPackage.STRUCTURE_DEFINITION__MAPPING:
				return getMapping();
			case FhirPackage.STRUCTURE_DEFINITION__TYPE:
				return getType();
			case FhirPackage.STRUCTURE_DEFINITION__ABSTRACT:
				return getAbstract();
			case FhirPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				return getContextType();
			case FhirPackage.STRUCTURE_DEFINITION__CONTEXT:
				return getContext();
			case FhirPackage.STRUCTURE_DEFINITION__BASE:
				return getBase();
			case FhirPackage.STRUCTURE_DEFINITION__SNAPSHOT:
				return getSnapshot();
			case FhirPackage.STRUCTURE_DEFINITION__DIFFERENTIAL:
				return getDifferential();
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
			case FhirPackage.STRUCTURE_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__DISPLAY:
				setDisplay((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends StructureDefinitionContact>)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__STATUS:
				setStatus((ConformanceResourceStatus)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__FHIR_VERSION:
				setFhirVersion((Id)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__MAPPING:
				getMapping().clear();
				getMapping().addAll((Collection<? extends StructureDefinitionMapping>)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__TYPE:
				setType((StructureDefinitionType)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__ABSTRACT:
				setAbstract((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				setContextType((ExtensionContext)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__BASE:
				setBase((Uri)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__SNAPSHOT:
				setSnapshot((StructureDefinitionSnapshot)newValue);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__DIFFERENTIAL:
				setDifferential((StructureDefinitionDifferential)newValue);
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
			case FhirPackage.STRUCTURE_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.STRUCTURE_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.STRUCTURE_DEFINITION__DISPLAY:
				setDisplay((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.STRUCTURE_DEFINITION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__CODE:
				getCode().clear();
				return;
			case FhirPackage.STRUCTURE_DEFINITION__STATUS:
				setStatus((ConformanceResourceStatus)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__FHIR_VERSION:
				setFhirVersion((Id)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__MAPPING:
				getMapping().clear();
				return;
			case FhirPackage.STRUCTURE_DEFINITION__TYPE:
				setType((StructureDefinitionType)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__ABSTRACT:
				setAbstract((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				setContextType((ExtensionContext)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__CONTEXT:
				getContext().clear();
				return;
			case FhirPackage.STRUCTURE_DEFINITION__BASE:
				setBase((Uri)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__SNAPSHOT:
				setSnapshot((StructureDefinitionSnapshot)null);
				return;
			case FhirPackage.STRUCTURE_DEFINITION__DIFFERENTIAL:
				setDifferential((StructureDefinitionDifferential)null);
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
			case FhirPackage.STRUCTURE_DEFINITION__URL:
				return url != null;
			case FhirPackage.STRUCTURE_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.STRUCTURE_DEFINITION__VERSION:
				return version != null;
			case FhirPackage.STRUCTURE_DEFINITION__NAME:
				return name != null;
			case FhirPackage.STRUCTURE_DEFINITION__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.STRUCTURE_DEFINITION__DISPLAY:
				return display != null;
			case FhirPackage.STRUCTURE_DEFINITION__PUBLISHER:
				return publisher != null;
			case FhirPackage.STRUCTURE_DEFINITION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.STRUCTURE_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.STRUCTURE_DEFINITION__REQUIREMENTS:
				return requirements != null;
			case FhirPackage.STRUCTURE_DEFINITION__COPYRIGHT:
				return copyright != null;
			case FhirPackage.STRUCTURE_DEFINITION__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.STRUCTURE_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.STRUCTURE_DEFINITION__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.STRUCTURE_DEFINITION__DATE:
				return date != null;
			case FhirPackage.STRUCTURE_DEFINITION__FHIR_VERSION:
				return fhirVersion != null;
			case FhirPackage.STRUCTURE_DEFINITION__MAPPING:
				return mapping != null && !mapping.isEmpty();
			case FhirPackage.STRUCTURE_DEFINITION__TYPE:
				return type != null;
			case FhirPackage.STRUCTURE_DEFINITION__ABSTRACT:
				return abstract_ != null;
			case FhirPackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				return contextType != null;
			case FhirPackage.STRUCTURE_DEFINITION__CONTEXT:
				return context != null && !context.isEmpty();
			case FhirPackage.STRUCTURE_DEFINITION__BASE:
				return base != null;
			case FhirPackage.STRUCTURE_DEFINITION__SNAPSHOT:
				return snapshot != null;
			case FhirPackage.STRUCTURE_DEFINITION__DIFFERENTIAL:
				return differential != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureDefinitionImpl
