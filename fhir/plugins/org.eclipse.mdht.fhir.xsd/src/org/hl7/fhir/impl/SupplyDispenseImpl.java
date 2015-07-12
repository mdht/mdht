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
import org.hl7.fhir.Period;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SupplyDispense;
import org.hl7.fhir.SupplyDispenseStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SupplyDispenseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyDispenseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyDispenseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyDispenseImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyDispenseImpl#getSuppliedItem <em>Supplied Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyDispenseImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyDispenseImpl#getWhenPrepared <em>When Prepared</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyDispenseImpl#getWhenHandedOver <em>When Handed Over</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyDispenseImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyDispenseImpl#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyDispenseImpl extends BackboneElementImpl implements SupplyDispense {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SupplyDispenseStatus status;

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
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getSuppliedItem() <em>Supplied Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliedItem()
	 * @generated
	 * @ordered
	 */
	protected Reference suppliedItem;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected Reference supplier;

	/**
	 * The cached value of the '{@link #getWhenPrepared() <em>When Prepared</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenPrepared()
	 * @generated
	 * @ordered
	 */
	protected Period whenPrepared;

	/**
	 * The cached value of the '{@link #getWhenHandedOver() <em>When Handed Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenHandedOver()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenHandedOver;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Reference destination;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> receiver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSupplyDispense();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDispenseStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(SupplyDispenseStatus newStatus, NotificationChain msgs) {
		SupplyDispenseStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(SupplyDispenseStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSuppliedItem() {
		return suppliedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuppliedItem(Reference newSuppliedItem, NotificationChain msgs) {
		Reference oldSuppliedItem = suppliedItem;
		suppliedItem = newSuppliedItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__SUPPLIED_ITEM, oldSuppliedItem, newSuppliedItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppliedItem(Reference newSuppliedItem) {
		if (newSuppliedItem != suppliedItem) {
			NotificationChain msgs = null;
			if (suppliedItem != null)
				msgs = ((InternalEObject)suppliedItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__SUPPLIED_ITEM, null, msgs);
			if (newSuppliedItem != null)
				msgs = ((InternalEObject)newSuppliedItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__SUPPLIED_ITEM, null, msgs);
			msgs = basicSetSuppliedItem(newSuppliedItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__SUPPLIED_ITEM, newSuppliedItem, newSuppliedItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(Reference newSupplier, NotificationChain msgs) {
		Reference oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__SUPPLIER, oldSupplier, newSupplier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(Reference newSupplier) {
		if (newSupplier != supplier) {
			NotificationChain msgs = null;
			if (supplier != null)
				msgs = ((InternalEObject)supplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__SUPPLIER, null, msgs);
			if (newSupplier != null)
				msgs = ((InternalEObject)newSupplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__SUPPLIER, null, msgs);
			msgs = basicSetSupplier(newSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__SUPPLIER, newSupplier, newSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getWhenPrepared() {
		return whenPrepared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenPrepared(Period newWhenPrepared, NotificationChain msgs) {
		Period oldWhenPrepared = whenPrepared;
		whenPrepared = newWhenPrepared;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__WHEN_PREPARED, oldWhenPrepared, newWhenPrepared);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenPrepared(Period newWhenPrepared) {
		if (newWhenPrepared != whenPrepared) {
			NotificationChain msgs = null;
			if (whenPrepared != null)
				msgs = ((InternalEObject)whenPrepared).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__WHEN_PREPARED, null, msgs);
			if (newWhenPrepared != null)
				msgs = ((InternalEObject)newWhenPrepared).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__WHEN_PREPARED, null, msgs);
			msgs = basicSetWhenPrepared(newWhenPrepared, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__WHEN_PREPARED, newWhenPrepared, newWhenPrepared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getWhenHandedOver() {
		return whenHandedOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenHandedOver(DateTime newWhenHandedOver, NotificationChain msgs) {
		DateTime oldWhenHandedOver = whenHandedOver;
		whenHandedOver = newWhenHandedOver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__WHEN_HANDED_OVER, oldWhenHandedOver, newWhenHandedOver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenHandedOver(DateTime newWhenHandedOver) {
		if (newWhenHandedOver != whenHandedOver) {
			NotificationChain msgs = null;
			if (whenHandedOver != null)
				msgs = ((InternalEObject)whenHandedOver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__WHEN_HANDED_OVER, null, msgs);
			if (newWhenHandedOver != null)
				msgs = ((InternalEObject)newWhenHandedOver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__WHEN_HANDED_OVER, null, msgs);
			msgs = basicSetWhenHandedOver(newWhenHandedOver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__WHEN_HANDED_OVER, newWhenHandedOver, newWhenHandedOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Reference newDestination, NotificationChain msgs) {
		Reference oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Reference newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY_DISPENSE__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY_DISPENSE__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReceiver() {
		if (receiver == null) {
			receiver = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUPPLY_DISPENSE__RECEIVER);
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUPPLY_DISPENSE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.SUPPLY_DISPENSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SUPPLY_DISPENSE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUPPLY_DISPENSE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.SUPPLY_DISPENSE__SUPPLIED_ITEM:
				return basicSetSuppliedItem(null, msgs);
			case FhirPackage.SUPPLY_DISPENSE__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case FhirPackage.SUPPLY_DISPENSE__WHEN_PREPARED:
				return basicSetWhenPrepared(null, msgs);
			case FhirPackage.SUPPLY_DISPENSE__WHEN_HANDED_OVER:
				return basicSetWhenHandedOver(null, msgs);
			case FhirPackage.SUPPLY_DISPENSE__DESTINATION:
				return basicSetDestination(null, msgs);
			case FhirPackage.SUPPLY_DISPENSE__RECEIVER:
				return ((InternalEList<?>)getReceiver()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUPPLY_DISPENSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SUPPLY_DISPENSE__STATUS:
				return getStatus();
			case FhirPackage.SUPPLY_DISPENSE__TYPE:
				return getType();
			case FhirPackage.SUPPLY_DISPENSE__QUANTITY:
				return getQuantity();
			case FhirPackage.SUPPLY_DISPENSE__SUPPLIED_ITEM:
				return getSuppliedItem();
			case FhirPackage.SUPPLY_DISPENSE__SUPPLIER:
				return getSupplier();
			case FhirPackage.SUPPLY_DISPENSE__WHEN_PREPARED:
				return getWhenPrepared();
			case FhirPackage.SUPPLY_DISPENSE__WHEN_HANDED_OVER:
				return getWhenHandedOver();
			case FhirPackage.SUPPLY_DISPENSE__DESTINATION:
				return getDestination();
			case FhirPackage.SUPPLY_DISPENSE__RECEIVER:
				return getReceiver();
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
			case FhirPackage.SUPPLY_DISPENSE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.SUPPLY_DISPENSE__STATUS:
				setStatus((SupplyDispenseStatus)newValue);
				return;
			case FhirPackage.SUPPLY_DISPENSE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUPPLY_DISPENSE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.SUPPLY_DISPENSE__SUPPLIED_ITEM:
				setSuppliedItem((Reference)newValue);
				return;
			case FhirPackage.SUPPLY_DISPENSE__SUPPLIER:
				setSupplier((Reference)newValue);
				return;
			case FhirPackage.SUPPLY_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((Period)newValue);
				return;
			case FhirPackage.SUPPLY_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)newValue);
				return;
			case FhirPackage.SUPPLY_DISPENSE__DESTINATION:
				setDestination((Reference)newValue);
				return;
			case FhirPackage.SUPPLY_DISPENSE__RECEIVER:
				getReceiver().clear();
				getReceiver().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.SUPPLY_DISPENSE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.SUPPLY_DISPENSE__STATUS:
				setStatus((SupplyDispenseStatus)null);
				return;
			case FhirPackage.SUPPLY_DISPENSE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SUPPLY_DISPENSE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.SUPPLY_DISPENSE__SUPPLIED_ITEM:
				setSuppliedItem((Reference)null);
				return;
			case FhirPackage.SUPPLY_DISPENSE__SUPPLIER:
				setSupplier((Reference)null);
				return;
			case FhirPackage.SUPPLY_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((Period)null);
				return;
			case FhirPackage.SUPPLY_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)null);
				return;
			case FhirPackage.SUPPLY_DISPENSE__DESTINATION:
				setDestination((Reference)null);
				return;
			case FhirPackage.SUPPLY_DISPENSE__RECEIVER:
				getReceiver().clear();
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
			case FhirPackage.SUPPLY_DISPENSE__IDENTIFIER:
				return identifier != null;
			case FhirPackage.SUPPLY_DISPENSE__STATUS:
				return status != null;
			case FhirPackage.SUPPLY_DISPENSE__TYPE:
				return type != null;
			case FhirPackage.SUPPLY_DISPENSE__QUANTITY:
				return quantity != null;
			case FhirPackage.SUPPLY_DISPENSE__SUPPLIED_ITEM:
				return suppliedItem != null;
			case FhirPackage.SUPPLY_DISPENSE__SUPPLIER:
				return supplier != null;
			case FhirPackage.SUPPLY_DISPENSE__WHEN_PREPARED:
				return whenPrepared != null;
			case FhirPackage.SUPPLY_DISPENSE__WHEN_HANDED_OVER:
				return whenHandedOver != null;
			case FhirPackage.SUPPLY_DISPENSE__DESTINATION:
				return destination != null;
			case FhirPackage.SUPPLY_DISPENSE__RECEIVER:
				return receiver != null && !receiver.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupplyDispenseImpl
