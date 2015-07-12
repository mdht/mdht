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
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SpecimenContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenContainerImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenContainerImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenContainerImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenContainerImpl#getSpecimenQuantity <em>Specimen Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenContainerImpl#getAdditiveCodeableConcept <em>Additive Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenContainerImpl#getAdditiveReference <em>Additive Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenContainerImpl extends BackboneElementImpl implements SpecimenContainer {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

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
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected Quantity capacity;

	/**
	 * The cached value of the '{@link #getSpecimenQuantity() <em>Specimen Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity specimenQuantity;

	/**
	 * The cached value of the '{@link #getAdditiveCodeableConcept() <em>Additive Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept additiveCodeableConcept;

	/**
	 * The cached value of the '{@link #getAdditiveReference() <em>Additive Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveReference()
	 * @generated
	 * @ordered
	 */
	protected Reference additiveReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSpecimenContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.SPECIMEN_CONTAINER__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity(Quantity newCapacity, NotificationChain msgs) {
		Quantity oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__CAPACITY, oldCapacity, newCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(Quantity newCapacity) {
		if (newCapacity != capacity) {
			NotificationChain msgs = null;
			if (capacity != null)
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__CAPACITY, newCapacity, newCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getSpecimenQuantity() {
		return specimenQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimenQuantity(Quantity newSpecimenQuantity, NotificationChain msgs) {
		Quantity oldSpecimenQuantity = specimenQuantity;
		specimenQuantity = newSpecimenQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY, oldSpecimenQuantity, newSpecimenQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimenQuantity(Quantity newSpecimenQuantity) {
		if (newSpecimenQuantity != specimenQuantity) {
			NotificationChain msgs = null;
			if (specimenQuantity != null)
				msgs = ((InternalEObject)specimenQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY, null, msgs);
			if (newSpecimenQuantity != null)
				msgs = ((InternalEObject)newSpecimenQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY, null, msgs);
			msgs = basicSetSpecimenQuantity(newSpecimenQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY, newSpecimenQuantity, newSpecimenQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAdditiveCodeableConcept() {
		return additiveCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditiveCodeableConcept(CodeableConcept newAdditiveCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldAdditiveCodeableConcept = additiveCodeableConcept;
		additiveCodeableConcept = newAdditiveCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_CODEABLE_CONCEPT, oldAdditiveCodeableConcept, newAdditiveCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditiveCodeableConcept(CodeableConcept newAdditiveCodeableConcept) {
		if (newAdditiveCodeableConcept != additiveCodeableConcept) {
			NotificationChain msgs = null;
			if (additiveCodeableConcept != null)
				msgs = ((InternalEObject)additiveCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_CODEABLE_CONCEPT, null, msgs);
			if (newAdditiveCodeableConcept != null)
				msgs = ((InternalEObject)newAdditiveCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetAdditiveCodeableConcept(newAdditiveCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_CODEABLE_CONCEPT, newAdditiveCodeableConcept, newAdditiveCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAdditiveReference() {
		return additiveReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditiveReference(Reference newAdditiveReference, NotificationChain msgs) {
		Reference oldAdditiveReference = additiveReference;
		additiveReference = newAdditiveReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_REFERENCE, oldAdditiveReference, newAdditiveReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditiveReference(Reference newAdditiveReference) {
		if (newAdditiveReference != additiveReference) {
			NotificationChain msgs = null;
			if (additiveReference != null)
				msgs = ((InternalEObject)additiveReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_REFERENCE, null, msgs);
			if (newAdditiveReference != null)
				msgs = ((InternalEObject)newAdditiveReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_REFERENCE, null, msgs);
			msgs = basicSetAdditiveReference(newAdditiveReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_REFERENCE, newAdditiveReference, newAdditiveReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.SPECIMEN_CONTAINER__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SPECIMEN_CONTAINER__CAPACITY:
				return basicSetCapacity(null, msgs);
			case FhirPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				return basicSetSpecimenQuantity(null, msgs);
			case FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_CODEABLE_CONCEPT:
				return basicSetAdditiveCodeableConcept(null, msgs);
			case FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_REFERENCE:
				return basicSetAdditiveReference(null, msgs);
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
			case FhirPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				return getDescription();
			case FhirPackage.SPECIMEN_CONTAINER__TYPE:
				return getType();
			case FhirPackage.SPECIMEN_CONTAINER__CAPACITY:
				return getCapacity();
			case FhirPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				return getSpecimenQuantity();
			case FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_CODEABLE_CONCEPT:
				return getAdditiveCodeableConcept();
			case FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_REFERENCE:
				return getAdditiveReference();
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
			case FhirPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_CONTAINER__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_CONTAINER__CAPACITY:
				setCapacity((Quantity)newValue);
				return;
			case FhirPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				setSpecimenQuantity((Quantity)newValue);
				return;
			case FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_CODEABLE_CONCEPT:
				setAdditiveCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_REFERENCE:
				setAdditiveReference((Reference)newValue);
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
			case FhirPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_CONTAINER__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_CONTAINER__CAPACITY:
				setCapacity((Quantity)null);
				return;
			case FhirPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				setSpecimenQuantity((Quantity)null);
				return;
			case FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_CODEABLE_CONCEPT:
				setAdditiveCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_REFERENCE:
				setAdditiveReference((Reference)null);
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
			case FhirPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				return description != null;
			case FhirPackage.SPECIMEN_CONTAINER__TYPE:
				return type != null;
			case FhirPackage.SPECIMEN_CONTAINER__CAPACITY:
				return capacity != null;
			case FhirPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				return specimenQuantity != null;
			case FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_CODEABLE_CONCEPT:
				return additiveCodeableConcept != null;
			case FhirPackage.SPECIMEN_CONTAINER__ADDITIVE_REFERENCE:
				return additiveReference != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenContainerImpl
