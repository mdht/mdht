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
import org.hl7.fhir.Period;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SpecimenCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getCollector <em>Collector</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getCollectedDateTime <em>Collected Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getCollectedPeriod <em>Collected Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getBodySiteCodeableConcept <em>Body Site Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getBodySiteReference <em>Body Site Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenCollectionImpl extends BackboneElementImpl implements SpecimenCollection {
	/**
	 * The cached value of the '{@link #getCollector() <em>Collector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollector()
	 * @generated
	 * @ordered
	 */
	protected Reference collector;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> comment;

	/**
	 * The cached value of the '{@link #getCollectedDateTime() <em>Collected Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime collectedDateTime;

	/**
	 * The cached value of the '{@link #getCollectedPeriod() <em>Collected Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period collectedPeriod;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

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
	 * The cached value of the '{@link #getBodySiteCodeableConcept() <em>Body Site Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySiteCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySiteCodeableConcept;

	/**
	 * The cached value of the '{@link #getBodySiteReference() <em>Body Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySiteReference()
	 * @generated
	 * @ordered
	 */
	protected Reference bodySiteReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSpecimenCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCollector() {
		return collector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollector(Reference newCollector, NotificationChain msgs) {
		Reference oldCollector = collector;
		collector = newCollector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__COLLECTOR, oldCollector, newCollector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollector(Reference newCollector) {
		if (newCollector != collector) {
			NotificationChain msgs = null;
			if (collector != null)
				msgs = ((InternalEObject)collector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__COLLECTOR, null, msgs);
			if (newCollector != null)
				msgs = ((InternalEObject)newCollector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__COLLECTOR, null, msgs);
			msgs = basicSetCollector(newCollector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__COLLECTOR, newCollector, newCollector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.SPECIMEN_COLLECTION__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCollectedDateTime() {
		return collectedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectedDateTime(DateTime newCollectedDateTime, NotificationChain msgs) {
		DateTime oldCollectedDateTime = collectedDateTime;
		collectedDateTime = newCollectedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME, oldCollectedDateTime, newCollectedDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectedDateTime(DateTime newCollectedDateTime) {
		if (newCollectedDateTime != collectedDateTime) {
			NotificationChain msgs = null;
			if (collectedDateTime != null)
				msgs = ((InternalEObject)collectedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME, null, msgs);
			if (newCollectedDateTime != null)
				msgs = ((InternalEObject)newCollectedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME, null, msgs);
			msgs = basicSetCollectedDateTime(newCollectedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME, newCollectedDateTime, newCollectedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getCollectedPeriod() {
		return collectedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectedPeriod(Period newCollectedPeriod, NotificationChain msgs) {
		Period oldCollectedPeriod = collectedPeriod;
		collectedPeriod = newCollectedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD, oldCollectedPeriod, newCollectedPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectedPeriod(Period newCollectedPeriod) {
		if (newCollectedPeriod != collectedPeriod) {
			NotificationChain msgs = null;
			if (collectedPeriod != null)
				msgs = ((InternalEObject)collectedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD, null, msgs);
			if (newCollectedPeriod != null)
				msgs = ((InternalEObject)newCollectedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD, null, msgs);
			msgs = basicSetCollectedPeriod(newCollectedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD, newCollectedPeriod, newCollectedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__QUANTITY, newQuantity, newQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__METHOD, oldMethod, newMethod);
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
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBodySiteCodeableConcept() {
		return bodySiteCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySiteCodeableConcept(CodeableConcept newBodySiteCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldBodySiteCodeableConcept = bodySiteCodeableConcept;
		bodySiteCodeableConcept = newBodySiteCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_CODEABLE_CONCEPT, oldBodySiteCodeableConcept, newBodySiteCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySiteCodeableConcept(CodeableConcept newBodySiteCodeableConcept) {
		if (newBodySiteCodeableConcept != bodySiteCodeableConcept) {
			NotificationChain msgs = null;
			if (bodySiteCodeableConcept != null)
				msgs = ((InternalEObject)bodySiteCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_CODEABLE_CONCEPT, null, msgs);
			if (newBodySiteCodeableConcept != null)
				msgs = ((InternalEObject)newBodySiteCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetBodySiteCodeableConcept(newBodySiteCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_CODEABLE_CONCEPT, newBodySiteCodeableConcept, newBodySiteCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getBodySiteReference() {
		return bodySiteReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySiteReference(Reference newBodySiteReference, NotificationChain msgs) {
		Reference oldBodySiteReference = bodySiteReference;
		bodySiteReference = newBodySiteReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_REFERENCE, oldBodySiteReference, newBodySiteReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySiteReference(Reference newBodySiteReference) {
		if (newBodySiteReference != bodySiteReference) {
			NotificationChain msgs = null;
			if (bodySiteReference != null)
				msgs = ((InternalEObject)bodySiteReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_REFERENCE, null, msgs);
			if (newBodySiteReference != null)
				msgs = ((InternalEObject)newBodySiteReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_REFERENCE, null, msgs);
			msgs = basicSetBodySiteReference(newBodySiteReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_REFERENCE, newBodySiteReference, newBodySiteReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTOR:
				return basicSetCollector(null, msgs);
			case FhirPackage.SPECIMEN_COLLECTION__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME:
				return basicSetCollectedDateTime(null, msgs);
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD:
				return basicSetCollectedPeriod(null, msgs);
			case FhirPackage.SPECIMEN_COLLECTION__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.SPECIMEN_COLLECTION__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_CODEABLE_CONCEPT:
				return basicSetBodySiteCodeableConcept(null, msgs);
			case FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_REFERENCE:
				return basicSetBodySiteReference(null, msgs);
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
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTOR:
				return getCollector();
			case FhirPackage.SPECIMEN_COLLECTION__COMMENT:
				return getComment();
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME:
				return getCollectedDateTime();
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD:
				return getCollectedPeriod();
			case FhirPackage.SPECIMEN_COLLECTION__QUANTITY:
				return getQuantity();
			case FhirPackage.SPECIMEN_COLLECTION__METHOD:
				return getMethod();
			case FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_CODEABLE_CONCEPT:
				return getBodySiteCodeableConcept();
			case FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_REFERENCE:
				return getBodySiteReference();
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
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTOR:
				setCollector((Reference)newValue);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME:
				setCollectedDateTime((DateTime)newValue);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD:
				setCollectedPeriod((Period)newValue);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_CODEABLE_CONCEPT:
				setBodySiteCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_REFERENCE:
				setBodySiteReference((Reference)newValue);
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
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTOR:
				setCollector((Reference)null);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__COMMENT:
				getComment().clear();
				return;
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME:
				setCollectedDateTime((DateTime)null);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD:
				setCollectedPeriod((Period)null);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_CODEABLE_CONCEPT:
				setBodySiteCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_REFERENCE:
				setBodySiteReference((Reference)null);
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
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTOR:
				return collector != null;
			case FhirPackage.SPECIMEN_COLLECTION__COMMENT:
				return comment != null && !comment.isEmpty();
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME:
				return collectedDateTime != null;
			case FhirPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD:
				return collectedPeriod != null;
			case FhirPackage.SPECIMEN_COLLECTION__QUANTITY:
				return quantity != null;
			case FhirPackage.SPECIMEN_COLLECTION__METHOD:
				return method != null;
			case FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_CODEABLE_CONCEPT:
				return bodySiteCodeableConcept != null;
			case FhirPackage.SPECIMEN_COLLECTION__BODY_SITE_REFERENCE:
				return bodySiteReference != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenCollectionImpl
