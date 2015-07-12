/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Code;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.OperationDefinitionPart;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Definition Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionPartImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionPartImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionPartImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionPartImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionPartImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionPartImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationDefinitionPartImpl extends BackboneElementImpl implements OperationDefinitionPart {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Code name;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String max;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String documentation;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Reference profile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefinitionPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getOperationDefinitionPart();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Code newName, NotificationChain msgs) {
		Code oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Code newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(UnsignedInt newMin, NotificationChain msgs) {
		UnsignedInt oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(UnsignedInt newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(org.hl7.fhir.String newMax, NotificationChain msgs) {
		org.hl7.fhir.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(org.hl7.fhir.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(org.hl7.fhir.String newDocumentation, NotificationChain msgs) {
		org.hl7.fhir.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.hl7.fhir.String newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Reference newProfile, NotificationChain msgs) {
		Reference oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__PROFILE, oldProfile, newProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(Reference newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_PART__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_PART__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OPERATION_DEFINITION_PART__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.OPERATION_DEFINITION_PART__MIN:
				return basicSetMin(null, msgs);
			case FhirPackage.OPERATION_DEFINITION_PART__MAX:
				return basicSetMax(null, msgs);
			case FhirPackage.OPERATION_DEFINITION_PART__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FhirPackage.OPERATION_DEFINITION_PART__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.OPERATION_DEFINITION_PART__PROFILE:
				return basicSetProfile(null, msgs);
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
			case FhirPackage.OPERATION_DEFINITION_PART__NAME:
				return getName();
			case FhirPackage.OPERATION_DEFINITION_PART__MIN:
				return getMin();
			case FhirPackage.OPERATION_DEFINITION_PART__MAX:
				return getMax();
			case FhirPackage.OPERATION_DEFINITION_PART__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.OPERATION_DEFINITION_PART__TYPE:
				return getType();
			case FhirPackage.OPERATION_DEFINITION_PART__PROFILE:
				return getProfile();
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
			case FhirPackage.OPERATION_DEFINITION_PART__NAME:
				setName((Code)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION_PART__MIN:
				setMin((UnsignedInt)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION_PART__MAX:
				setMax((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION_PART__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION_PART__TYPE:
				setType((Code)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION_PART__PROFILE:
				setProfile((Reference)newValue);
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
			case FhirPackage.OPERATION_DEFINITION_PART__NAME:
				setName((Code)null);
				return;
			case FhirPackage.OPERATION_DEFINITION_PART__MIN:
				setMin((UnsignedInt)null);
				return;
			case FhirPackage.OPERATION_DEFINITION_PART__MAX:
				setMax((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OPERATION_DEFINITION_PART__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OPERATION_DEFINITION_PART__TYPE:
				setType((Code)null);
				return;
			case FhirPackage.OPERATION_DEFINITION_PART__PROFILE:
				setProfile((Reference)null);
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
			case FhirPackage.OPERATION_DEFINITION_PART__NAME:
				return name != null;
			case FhirPackage.OPERATION_DEFINITION_PART__MIN:
				return min != null;
			case FhirPackage.OPERATION_DEFINITION_PART__MAX:
				return max != null;
			case FhirPackage.OPERATION_DEFINITION_PART__DOCUMENTATION:
				return documentation != null;
			case FhirPackage.OPERATION_DEFINITION_PART__TYPE:
				return type != null;
			case FhirPackage.OPERATION_DEFINITION_PART__PROFILE:
				return profile != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationDefinitionPartImpl
