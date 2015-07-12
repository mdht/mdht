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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Supply;
import org.hl7.fhir.SupplyDispense;
import org.hl7.fhir.SupplyStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SupplyImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyImpl#getOrderedItem <em>Ordered Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SupplyImpl#getDispense <em>Dispense</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyImpl extends DomainResourceImpl implements Supply {
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept kind;

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
	protected SupplyStatus status;

	/**
	 * The cached value of the '{@link #getOrderedItem() <em>Ordered Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedItem()
	 * @generated
	 * @ordered
	 */
	protected Reference orderedItem;

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
	 * The cached value of the '{@link #getDispense() <em>Dispense</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispense()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplyDispense> dispense;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSupply();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(CodeableConcept newKind, NotificationChain msgs) {
		CodeableConcept oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY__KIND, oldKind, newKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(CodeableConcept newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY__KIND, newKind, newKind));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(SupplyStatus newStatus, NotificationChain msgs) {
		SupplyStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(SupplyStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrderedItem() {
		return orderedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderedItem(Reference newOrderedItem, NotificationChain msgs) {
		Reference oldOrderedItem = orderedItem;
		orderedItem = newOrderedItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY__ORDERED_ITEM, oldOrderedItem, newOrderedItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedItem(Reference newOrderedItem) {
		if (newOrderedItem != orderedItem) {
			NotificationChain msgs = null;
			if (orderedItem != null)
				msgs = ((InternalEObject)orderedItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY__ORDERED_ITEM, null, msgs);
			if (newOrderedItem != null)
				msgs = ((InternalEObject)newOrderedItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY__ORDERED_ITEM, null, msgs);
			msgs = basicSetOrderedItem(newOrderedItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY__ORDERED_ITEM, newOrderedItem, newOrderedItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUPPLY__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUPPLY__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplyDispense> getDispense() {
		if (dispense == null) {
			dispense = new EObjectContainmentEList<SupplyDispense>(SupplyDispense.class, this, FhirPackage.SUPPLY__DISPENSE);
		}
		return dispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUPPLY__KIND:
				return basicSetKind(null, msgs);
			case FhirPackage.SUPPLY__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.SUPPLY__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SUPPLY__ORDERED_ITEM:
				return basicSetOrderedItem(null, msgs);
			case FhirPackage.SUPPLY__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.SUPPLY__DISPENSE:
				return ((InternalEList<?>)getDispense()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUPPLY__KIND:
				return getKind();
			case FhirPackage.SUPPLY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SUPPLY__STATUS:
				return getStatus();
			case FhirPackage.SUPPLY__ORDERED_ITEM:
				return getOrderedItem();
			case FhirPackage.SUPPLY__PATIENT:
				return getPatient();
			case FhirPackage.SUPPLY__DISPENSE:
				return getDispense();
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
			case FhirPackage.SUPPLY__KIND:
				setKind((CodeableConcept)newValue);
				return;
			case FhirPackage.SUPPLY__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.SUPPLY__STATUS:
				setStatus((SupplyStatus)newValue);
				return;
			case FhirPackage.SUPPLY__ORDERED_ITEM:
				setOrderedItem((Reference)newValue);
				return;
			case FhirPackage.SUPPLY__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.SUPPLY__DISPENSE:
				getDispense().clear();
				getDispense().addAll((Collection<? extends SupplyDispense>)newValue);
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
			case FhirPackage.SUPPLY__KIND:
				setKind((CodeableConcept)null);
				return;
			case FhirPackage.SUPPLY__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.SUPPLY__STATUS:
				setStatus((SupplyStatus)null);
				return;
			case FhirPackage.SUPPLY__ORDERED_ITEM:
				setOrderedItem((Reference)null);
				return;
			case FhirPackage.SUPPLY__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.SUPPLY__DISPENSE:
				getDispense().clear();
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
			case FhirPackage.SUPPLY__KIND:
				return kind != null;
			case FhirPackage.SUPPLY__IDENTIFIER:
				return identifier != null;
			case FhirPackage.SUPPLY__STATUS:
				return status != null;
			case FhirPackage.SUPPLY__ORDERED_ITEM:
				return orderedItem != null;
			case FhirPackage.SUPPLY__PATIENT:
				return patient != null;
			case FhirPackage.SUPPLY__DISPENSE:
				return dispense != null && !dispense.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupplyImpl
