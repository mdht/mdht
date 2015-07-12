/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DeviceComponentProductionSpecification;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Component Production Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentProductionSpecificationImpl#getSpecType <em>Spec Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentProductionSpecificationImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentProductionSpecificationImpl#getProductionSpec <em>Production Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceComponentProductionSpecificationImpl extends BackboneElementImpl implements DeviceComponentProductionSpecification {
	/**
	 * The cached value of the '{@link #getSpecType() <em>Spec Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept specType;

	/**
	 * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected Identifier componentId;

	/**
	 * The cached value of the '{@link #getProductionSpec() <em>Production Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionSpec()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String productionSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceComponentProductionSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceComponentProductionSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecType() {
		return specType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecType(CodeableConcept newSpecType, NotificationChain msgs) {
		CodeableConcept oldSpecType = specType;
		specType = newSpecType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE, oldSpecType, newSpecType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecType(CodeableConcept newSpecType) {
		if (newSpecType != specType) {
			NotificationChain msgs = null;
			if (specType != null)
				msgs = ((InternalEObject)specType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE, null, msgs);
			if (newSpecType != null)
				msgs = ((InternalEObject)newSpecType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE, null, msgs);
			msgs = basicSetSpecType(newSpecType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE, newSpecType, newSpecType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentId(Identifier newComponentId, NotificationChain msgs) {
		Identifier oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID, oldComponentId, newComponentId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId(Identifier newComponentId) {
		if (newComponentId != componentId) {
			NotificationChain msgs = null;
			if (componentId != null)
				msgs = ((InternalEObject)componentId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID, null, msgs);
			if (newComponentId != null)
				msgs = ((InternalEObject)newComponentId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID, null, msgs);
			msgs = basicSetComponentId(newComponentId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID, newComponentId, newComponentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getProductionSpec() {
		return productionSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductionSpec(org.hl7.fhir.String newProductionSpec, NotificationChain msgs) {
		org.hl7.fhir.String oldProductionSpec = productionSpec;
		productionSpec = newProductionSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC, oldProductionSpec, newProductionSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductionSpec(org.hl7.fhir.String newProductionSpec) {
		if (newProductionSpec != productionSpec) {
			NotificationChain msgs = null;
			if (productionSpec != null)
				msgs = ((InternalEObject)productionSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC, null, msgs);
			if (newProductionSpec != null)
				msgs = ((InternalEObject)newProductionSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC, null, msgs);
			msgs = basicSetProductionSpec(newProductionSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC, newProductionSpec, newProductionSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE:
				return basicSetSpecType(null, msgs);
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID:
				return basicSetComponentId(null, msgs);
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC:
				return basicSetProductionSpec(null, msgs);
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
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE:
				return getSpecType();
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID:
				return getComponentId();
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC:
				return getProductionSpec();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE:
				setSpecType((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID:
				setComponentId((Identifier)newValue);
				return;
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC:
				setProductionSpec((org.hl7.fhir.String)newValue);
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
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE:
				setSpecType((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID:
				setComponentId((Identifier)null);
				return;
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC:
				setProductionSpec((org.hl7.fhir.String)null);
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
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE:
				return specType != null;
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID:
				return componentId != null;
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC:
				return productionSpec != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceComponentProductionSpecificationImpl
