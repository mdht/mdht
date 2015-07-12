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
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getAttester <em>Attester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getCustodian <em>Custodian</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionImpl#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionImpl extends DomainResourceImpl implements Composition {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept class_;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CompositionStatus status;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Code confidentiality;

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
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> author;

	/**
	 * The cached value of the '{@link #getAttester() <em>Attester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttester()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionAttester> attester;

	/**
	 * The cached value of the '{@link #getCustodian() <em>Custodian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected Reference custodian;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionEvent> event;

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
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionSection> section;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getComposition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(CodeableConcept newClass, NotificationChain msgs) {
		CodeableConcept oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(CodeableConcept newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CompositionStatus newStatus, NotificationChain msgs) {
		CompositionStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CompositionStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getConfidentiality() {
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidentiality(Code newConfidentiality, NotificationChain msgs) {
		Code oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__CONFIDENTIALITY, oldConfidentiality, newConfidentiality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Code newConfidentiality) {
		if (newConfidentiality != confidentiality) {
			NotificationChain msgs = null;
			if (confidentiality != null)
				msgs = ((InternalEObject)confidentiality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__CONFIDENTIALITY, null, msgs);
			if (newConfidentiality != null)
				msgs = ((InternalEObject)newConfidentiality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__CONFIDENTIALITY, null, msgs);
			msgs = basicSetConfidentiality(newConfidentiality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__CONFIDENTIALITY, newConfidentiality, newConfidentiality));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMPOSITION__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionAttester> getAttester() {
		if (attester == null) {
			attester = new EObjectContainmentEList<CompositionAttester>(CompositionAttester.class, this, FhirPackage.COMPOSITION__ATTESTER);
		}
		return attester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCustodian() {
		return custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustodian(Reference newCustodian, NotificationChain msgs) {
		Reference oldCustodian = custodian;
		custodian = newCustodian;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__CUSTODIAN, oldCustodian, newCustodian);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustodian(Reference newCustodian) {
		if (newCustodian != custodian) {
			NotificationChain msgs = null;
			if (custodian != null)
				msgs = ((InternalEObject)custodian).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__CUSTODIAN, null, msgs);
			if (newCustodian != null)
				msgs = ((InternalEObject)newCustodian).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__CUSTODIAN, null, msgs);
			msgs = basicSetCustodian(newCustodian, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__CUSTODIAN, newCustodian, newCustodian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionEvent> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<CompositionEvent>(CompositionEvent.class, this, FhirPackage.COMPOSITION__EVENT);
		}
		return event;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionSection> getSection() {
		if (section == null) {
			section = new EObjectContainmentEList<CompositionSection>(CompositionSection.class, this, FhirPackage.COMPOSITION__SECTION);
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COMPOSITION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.COMPOSITION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.COMPOSITION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.COMPOSITION__CLASS:
				return basicSetClass(null, msgs);
			case FhirPackage.COMPOSITION__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.COMPOSITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.COMPOSITION__CONFIDENTIALITY:
				return basicSetConfidentiality(null, msgs);
			case FhirPackage.COMPOSITION__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.COMPOSITION__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMPOSITION__ATTESTER:
				return ((InternalEList<?>)getAttester()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMPOSITION__CUSTODIAN:
				return basicSetCustodian(null, msgs);
			case FhirPackage.COMPOSITION__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMPOSITION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.COMPOSITION__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.COMPOSITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.COMPOSITION__DATE:
				return getDate();
			case FhirPackage.COMPOSITION__TYPE:
				return getType();
			case FhirPackage.COMPOSITION__CLASS:
				return getClass_();
			case FhirPackage.COMPOSITION__TITLE:
				return getTitle();
			case FhirPackage.COMPOSITION__STATUS:
				return getStatus();
			case FhirPackage.COMPOSITION__CONFIDENTIALITY:
				return getConfidentiality();
			case FhirPackage.COMPOSITION__SUBJECT:
				return getSubject();
			case FhirPackage.COMPOSITION__AUTHOR:
				return getAuthor();
			case FhirPackage.COMPOSITION__ATTESTER:
				return getAttester();
			case FhirPackage.COMPOSITION__CUSTODIAN:
				return getCustodian();
			case FhirPackage.COMPOSITION__EVENT:
				return getEvent();
			case FhirPackage.COMPOSITION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.COMPOSITION__SECTION:
				return getSection();
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
			case FhirPackage.COMPOSITION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.COMPOSITION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.COMPOSITION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.COMPOSITION__CLASS:
				setClass((CodeableConcept)newValue);
				return;
			case FhirPackage.COMPOSITION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COMPOSITION__STATUS:
				setStatus((CompositionStatus)newValue);
				return;
			case FhirPackage.COMPOSITION__CONFIDENTIALITY:
				setConfidentiality((Code)newValue);
				return;
			case FhirPackage.COMPOSITION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.COMPOSITION__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMPOSITION__ATTESTER:
				getAttester().clear();
				getAttester().addAll((Collection<? extends CompositionAttester>)newValue);
				return;
			case FhirPackage.COMPOSITION__CUSTODIAN:
				setCustodian((Reference)newValue);
				return;
			case FhirPackage.COMPOSITION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends CompositionEvent>)newValue);
				return;
			case FhirPackage.COMPOSITION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.COMPOSITION__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends CompositionSection>)newValue);
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
			case FhirPackage.COMPOSITION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.COMPOSITION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.COMPOSITION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.COMPOSITION__CLASS:
				setClass((CodeableConcept)null);
				return;
			case FhirPackage.COMPOSITION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COMPOSITION__STATUS:
				setStatus((CompositionStatus)null);
				return;
			case FhirPackage.COMPOSITION__CONFIDENTIALITY:
				setConfidentiality((Code)null);
				return;
			case FhirPackage.COMPOSITION__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.COMPOSITION__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.COMPOSITION__ATTESTER:
				getAttester().clear();
				return;
			case FhirPackage.COMPOSITION__CUSTODIAN:
				setCustodian((Reference)null);
				return;
			case FhirPackage.COMPOSITION__EVENT:
				getEvent().clear();
				return;
			case FhirPackage.COMPOSITION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.COMPOSITION__SECTION:
				getSection().clear();
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
			case FhirPackage.COMPOSITION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.COMPOSITION__DATE:
				return date != null;
			case FhirPackage.COMPOSITION__TYPE:
				return type != null;
			case FhirPackage.COMPOSITION__CLASS:
				return class_ != null;
			case FhirPackage.COMPOSITION__TITLE:
				return title != null;
			case FhirPackage.COMPOSITION__STATUS:
				return status != null;
			case FhirPackage.COMPOSITION__CONFIDENTIALITY:
				return confidentiality != null;
			case FhirPackage.COMPOSITION__SUBJECT:
				return subject != null;
			case FhirPackage.COMPOSITION__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.COMPOSITION__ATTESTER:
				return attester != null && !attester.isEmpty();
			case FhirPackage.COMPOSITION__CUSTODIAN:
				return custodian != null;
			case FhirPackage.COMPOSITION__EVENT:
				return event != null && !event.isEmpty();
			case FhirPackage.COMPOSITION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.COMPOSITION__SECTION:
				return section != null && !section.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositionImpl
