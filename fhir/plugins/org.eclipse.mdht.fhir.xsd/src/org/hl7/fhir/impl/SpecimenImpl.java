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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenTreatment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenImpl#getAccessionIdentifier <em>Accession Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenImpl#getReceivedTime <em>Received Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenImpl#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenImpl extends DomainResourceImpl implements Specimen {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> parent;

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
	 * The cached value of the '{@link #getAccessionIdentifier() <em>Accession Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier accessionIdentifier;

	/**
	 * The cached value of the '{@link #getReceivedTime() <em>Received Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime receivedTime;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected SpecimenCollection collection;

	/**
	 * The cached value of the '{@link #getTreatment() <em>Treatment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenTreatment> treatment;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenContainer> container;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSpecimen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.SPECIMEN__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getParent() {
		if (parent == null) {
			parent = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SPECIMEN__PARENT);
		}
		return parent;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getAccessionIdentifier() {
		return accessionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessionIdentifier(Identifier newAccessionIdentifier, NotificationChain msgs) {
		Identifier oldAccessionIdentifier = accessionIdentifier;
		accessionIdentifier = newAccessionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN__ACCESSION_IDENTIFIER, oldAccessionIdentifier, newAccessionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessionIdentifier(Identifier newAccessionIdentifier) {
		if (newAccessionIdentifier != accessionIdentifier) {
			NotificationChain msgs = null;
			if (accessionIdentifier != null)
				msgs = ((InternalEObject)accessionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN__ACCESSION_IDENTIFIER, null, msgs);
			if (newAccessionIdentifier != null)
				msgs = ((InternalEObject)newAccessionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN__ACCESSION_IDENTIFIER, null, msgs);
			msgs = basicSetAccessionIdentifier(newAccessionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN__ACCESSION_IDENTIFIER, newAccessionIdentifier, newAccessionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getReceivedTime() {
		return receivedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivedTime(DateTime newReceivedTime, NotificationChain msgs) {
		DateTime oldReceivedTime = receivedTime;
		receivedTime = newReceivedTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN__RECEIVED_TIME, oldReceivedTime, newReceivedTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedTime(DateTime newReceivedTime) {
		if (newReceivedTime != receivedTime) {
			NotificationChain msgs = null;
			if (receivedTime != null)
				msgs = ((InternalEObject)receivedTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN__RECEIVED_TIME, null, msgs);
			if (newReceivedTime != null)
				msgs = ((InternalEObject)newReceivedTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN__RECEIVED_TIME, null, msgs);
			msgs = basicSetReceivedTime(newReceivedTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN__RECEIVED_TIME, newReceivedTime, newReceivedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollection getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(SpecimenCollection newCollection, NotificationChain msgs) {
		SpecimenCollection oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN__COLLECTION, oldCollection, newCollection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(SpecimenCollection newCollection) {
		if (newCollection != collection) {
			NotificationChain msgs = null;
			if (collection != null)
				msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN__COLLECTION, null, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN__COLLECTION, null, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN__COLLECTION, newCollection, newCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecimenTreatment> getTreatment() {
		if (treatment == null) {
			treatment = new EObjectContainmentEList<SpecimenTreatment>(SpecimenTreatment.class, this, FhirPackage.SPECIMEN__TREATMENT);
		}
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecimenContainer> getContainer() {
		if (container == null) {
			container = new EObjectContainmentEList<SpecimenContainer>(SpecimenContainer.class, this, FhirPackage.SPECIMEN__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SPECIMEN__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SPECIMEN__PARENT:
				return ((InternalEList<?>)getParent()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.SPECIMEN__ACCESSION_IDENTIFIER:
				return basicSetAccessionIdentifier(null, msgs);
			case FhirPackage.SPECIMEN__RECEIVED_TIME:
				return basicSetReceivedTime(null, msgs);
			case FhirPackage.SPECIMEN__COLLECTION:
				return basicSetCollection(null, msgs);
			case FhirPackage.SPECIMEN__TREATMENT:
				return ((InternalEList<?>)getTreatment()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN__CONTAINER:
				return ((InternalEList<?>)getContainer()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SPECIMEN__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SPECIMEN__TYPE:
				return getType();
			case FhirPackage.SPECIMEN__PARENT:
				return getParent();
			case FhirPackage.SPECIMEN__SUBJECT:
				return getSubject();
			case FhirPackage.SPECIMEN__ACCESSION_IDENTIFIER:
				return getAccessionIdentifier();
			case FhirPackage.SPECIMEN__RECEIVED_TIME:
				return getReceivedTime();
			case FhirPackage.SPECIMEN__COLLECTION:
				return getCollection();
			case FhirPackage.SPECIMEN__TREATMENT:
				return getTreatment();
			case FhirPackage.SPECIMEN__CONTAINER:
				return getContainer();
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
			case FhirPackage.SPECIMEN__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.SPECIMEN__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.SPECIMEN__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.SPECIMEN__ACCESSION_IDENTIFIER:
				setAccessionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.SPECIMEN__RECEIVED_TIME:
				setReceivedTime((DateTime)newValue);
				return;
			case FhirPackage.SPECIMEN__COLLECTION:
				setCollection((SpecimenCollection)newValue);
				return;
			case FhirPackage.SPECIMEN__TREATMENT:
				getTreatment().clear();
				getTreatment().addAll((Collection<? extends SpecimenTreatment>)newValue);
				return;
			case FhirPackage.SPECIMEN__CONTAINER:
				getContainer().clear();
				getContainer().addAll((Collection<? extends SpecimenContainer>)newValue);
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
			case FhirPackage.SPECIMEN__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.SPECIMEN__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN__PARENT:
				getParent().clear();
				return;
			case FhirPackage.SPECIMEN__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.SPECIMEN__ACCESSION_IDENTIFIER:
				setAccessionIdentifier((Identifier)null);
				return;
			case FhirPackage.SPECIMEN__RECEIVED_TIME:
				setReceivedTime((DateTime)null);
				return;
			case FhirPackage.SPECIMEN__COLLECTION:
				setCollection((SpecimenCollection)null);
				return;
			case FhirPackage.SPECIMEN__TREATMENT:
				getTreatment().clear();
				return;
			case FhirPackage.SPECIMEN__CONTAINER:
				getContainer().clear();
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
			case FhirPackage.SPECIMEN__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.SPECIMEN__TYPE:
				return type != null;
			case FhirPackage.SPECIMEN__PARENT:
				return parent != null && !parent.isEmpty();
			case FhirPackage.SPECIMEN__SUBJECT:
				return subject != null;
			case FhirPackage.SPECIMEN__ACCESSION_IDENTIFIER:
				return accessionIdentifier != null;
			case FhirPackage.SPECIMEN__RECEIVED_TIME:
				return receivedTime != null;
			case FhirPackage.SPECIMEN__COLLECTION:
				return collection != null;
			case FhirPackage.SPECIMEN__TREATMENT:
				return treatment != null && !treatment.isEmpty();
			case FhirPackage.SPECIMEN__CONTAINER:
				return container != null && !container.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecimenImpl
