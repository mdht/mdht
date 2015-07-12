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
import org.hl7.fhir.OrderResponse;
import org.hl7.fhir.OrderStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OrderResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderResponseImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderResponseImpl#getWho <em>Who</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderResponseImpl#getAuthorityCodeableConcept <em>Authority Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderResponseImpl#getAuthorityReference <em>Authority Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderResponseImpl#getOrderStatus <em>Order Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderResponseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderResponseImpl#getFulfillment <em>Fulfillment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderResponseImpl extends DomainResourceImpl implements OrderResponse {
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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

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
	 * The cached value of the '{@link #getWho() <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected Reference who;

	/**
	 * The cached value of the '{@link #getAuthorityCodeableConcept() <em>Authority Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept authorityCodeableConcept;

	/**
	 * The cached value of the '{@link #getAuthorityReference() <em>Authority Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityReference()
	 * @generated
	 * @ordered
	 */
	protected Reference authorityReference;

	/**
	 * The cached value of the '{@link #getOrderStatus() <em>Order Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderStatus()
	 * @generated
	 * @ordered
	 */
	protected OrderStatus orderStatus;

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
	 * The cached value of the '{@link #getFulfillment() <em>Fulfillment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillment()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> fulfillment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getOrderResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ORDER_RESPONSE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Reference newRequest, NotificationChain msgs) {
		Reference oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__REQUEST, newRequest, newRequest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getWho() {
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWho(Reference newWho, NotificationChain msgs) {
		Reference oldWho = who;
		who = newWho;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__WHO, oldWho, newWho);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWho(Reference newWho) {
		if (newWho != who) {
			NotificationChain msgs = null;
			if (who != null)
				msgs = ((InternalEObject)who).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__WHO, null, msgs);
			if (newWho != null)
				msgs = ((InternalEObject)newWho).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__WHO, null, msgs);
			msgs = basicSetWho(newWho, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__WHO, newWho, newWho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAuthorityCodeableConcept() {
		return authorityCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorityCodeableConcept(CodeableConcept newAuthorityCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldAuthorityCodeableConcept = authorityCodeableConcept;
		authorityCodeableConcept = newAuthorityCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__AUTHORITY_CODEABLE_CONCEPT, oldAuthorityCodeableConcept, newAuthorityCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorityCodeableConcept(CodeableConcept newAuthorityCodeableConcept) {
		if (newAuthorityCodeableConcept != authorityCodeableConcept) {
			NotificationChain msgs = null;
			if (authorityCodeableConcept != null)
				msgs = ((InternalEObject)authorityCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__AUTHORITY_CODEABLE_CONCEPT, null, msgs);
			if (newAuthorityCodeableConcept != null)
				msgs = ((InternalEObject)newAuthorityCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__AUTHORITY_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetAuthorityCodeableConcept(newAuthorityCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__AUTHORITY_CODEABLE_CONCEPT, newAuthorityCodeableConcept, newAuthorityCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthorityReference() {
		return authorityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorityReference(Reference newAuthorityReference, NotificationChain msgs) {
		Reference oldAuthorityReference = authorityReference;
		authorityReference = newAuthorityReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__AUTHORITY_REFERENCE, oldAuthorityReference, newAuthorityReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorityReference(Reference newAuthorityReference) {
		if (newAuthorityReference != authorityReference) {
			NotificationChain msgs = null;
			if (authorityReference != null)
				msgs = ((InternalEObject)authorityReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__AUTHORITY_REFERENCE, null, msgs);
			if (newAuthorityReference != null)
				msgs = ((InternalEObject)newAuthorityReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__AUTHORITY_REFERENCE, null, msgs);
			msgs = basicSetAuthorityReference(newAuthorityReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__AUTHORITY_REFERENCE, newAuthorityReference, newAuthorityReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderStatus(OrderStatus newOrderStatus, NotificationChain msgs) {
		OrderStatus oldOrderStatus = orderStatus;
		orderStatus = newOrderStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__ORDER_STATUS, oldOrderStatus, newOrderStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderStatus(OrderStatus newOrderStatus) {
		if (newOrderStatus != orderStatus) {
			NotificationChain msgs = null;
			if (orderStatus != null)
				msgs = ((InternalEObject)orderStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__ORDER_STATUS, null, msgs);
			if (newOrderStatus != null)
				msgs = ((InternalEObject)newOrderStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__ORDER_STATUS, null, msgs);
			msgs = basicSetOrderStatus(newOrderStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__ORDER_STATUS, newOrderStatus, newOrderStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_RESPONSE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_RESPONSE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getFulfillment() {
		if (fulfillment == null) {
			fulfillment = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ORDER_RESPONSE__FULFILLMENT);
		}
		return fulfillment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ORDER_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORDER_RESPONSE__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.ORDER_RESPONSE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.ORDER_RESPONSE__WHO:
				return basicSetWho(null, msgs);
			case FhirPackage.ORDER_RESPONSE__AUTHORITY_CODEABLE_CONCEPT:
				return basicSetAuthorityCodeableConcept(null, msgs);
			case FhirPackage.ORDER_RESPONSE__AUTHORITY_REFERENCE:
				return basicSetAuthorityReference(null, msgs);
			case FhirPackage.ORDER_RESPONSE__ORDER_STATUS:
				return basicSetOrderStatus(null, msgs);
			case FhirPackage.ORDER_RESPONSE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.ORDER_RESPONSE__FULFILLMENT:
				return ((InternalEList<?>)getFulfillment()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ORDER_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ORDER_RESPONSE__REQUEST:
				return getRequest();
			case FhirPackage.ORDER_RESPONSE__DATE:
				return getDate();
			case FhirPackage.ORDER_RESPONSE__WHO:
				return getWho();
			case FhirPackage.ORDER_RESPONSE__AUTHORITY_CODEABLE_CONCEPT:
				return getAuthorityCodeableConcept();
			case FhirPackage.ORDER_RESPONSE__AUTHORITY_REFERENCE:
				return getAuthorityReference();
			case FhirPackage.ORDER_RESPONSE__ORDER_STATUS:
				return getOrderStatus();
			case FhirPackage.ORDER_RESPONSE__DESCRIPTION:
				return getDescription();
			case FhirPackage.ORDER_RESPONSE__FULFILLMENT:
				return getFulfillment();
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
			case FhirPackage.ORDER_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ORDER_RESPONSE__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.ORDER_RESPONSE__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.ORDER_RESPONSE__WHO:
				setWho((Reference)newValue);
				return;
			case FhirPackage.ORDER_RESPONSE__AUTHORITY_CODEABLE_CONCEPT:
				setAuthorityCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ORDER_RESPONSE__AUTHORITY_REFERENCE:
				setAuthorityReference((Reference)newValue);
				return;
			case FhirPackage.ORDER_RESPONSE__ORDER_STATUS:
				setOrderStatus((OrderStatus)newValue);
				return;
			case FhirPackage.ORDER_RESPONSE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ORDER_RESPONSE__FULFILLMENT:
				getFulfillment().clear();
				getFulfillment().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.ORDER_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ORDER_RESPONSE__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.ORDER_RESPONSE__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.ORDER_RESPONSE__WHO:
				setWho((Reference)null);
				return;
			case FhirPackage.ORDER_RESPONSE__AUTHORITY_CODEABLE_CONCEPT:
				setAuthorityCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ORDER_RESPONSE__AUTHORITY_REFERENCE:
				setAuthorityReference((Reference)null);
				return;
			case FhirPackage.ORDER_RESPONSE__ORDER_STATUS:
				setOrderStatus((OrderStatus)null);
				return;
			case FhirPackage.ORDER_RESPONSE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ORDER_RESPONSE__FULFILLMENT:
				getFulfillment().clear();
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
			case FhirPackage.ORDER_RESPONSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ORDER_RESPONSE__REQUEST:
				return request != null;
			case FhirPackage.ORDER_RESPONSE__DATE:
				return date != null;
			case FhirPackage.ORDER_RESPONSE__WHO:
				return who != null;
			case FhirPackage.ORDER_RESPONSE__AUTHORITY_CODEABLE_CONCEPT:
				return authorityCodeableConcept != null;
			case FhirPackage.ORDER_RESPONSE__AUTHORITY_REFERENCE:
				return authorityReference != null;
			case FhirPackage.ORDER_RESPONSE__ORDER_STATUS:
				return orderStatus != null;
			case FhirPackage.ORDER_RESPONSE__DESCRIPTION:
				return description != null;
			case FhirPackage.ORDER_RESPONSE__FULFILLMENT:
				return fulfillment != null && !fulfillment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrderResponseImpl
