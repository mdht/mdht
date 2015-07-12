/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Code;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.QuantityImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuantityImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuantityImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuantityImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuantityImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantityImpl extends ElementImpl implements Quantity {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Decimal value;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected QuantityComparator comparator;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String units;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri system;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getQuantity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Decimal newValue, NotificationChain msgs) {
		Decimal oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUANTITY__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Decimal newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUANTITY__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUANTITY__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUANTITY__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparator getComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparator(QuantityComparator newComparator, NotificationChain msgs) {
		QuantityComparator oldComparator = comparator;
		comparator = newComparator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUANTITY__COMPARATOR, oldComparator, newComparator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparator(QuantityComparator newComparator) {
		if (newComparator != comparator) {
			NotificationChain msgs = null;
			if (comparator != null)
				msgs = ((InternalEObject)comparator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUANTITY__COMPARATOR, null, msgs);
			if (newComparator != null)
				msgs = ((InternalEObject)newComparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUANTITY__COMPARATOR, null, msgs);
			msgs = basicSetComparator(newComparator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUANTITY__COMPARATOR, newComparator, newComparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnits(org.hl7.fhir.String newUnits, NotificationChain msgs) {
		org.hl7.fhir.String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUANTITY__UNITS, oldUnits, newUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(org.hl7.fhir.String newUnits) {
		if (newUnits != units) {
			NotificationChain msgs = null;
			if (units != null)
				msgs = ((InternalEObject)units).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUANTITY__UNITS, null, msgs);
			if (newUnits != null)
				msgs = ((InternalEObject)newUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUANTITY__UNITS, null, msgs);
			msgs = basicSetUnits(newUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUANTITY__UNITS, newUnits, newUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(Uri newSystem, NotificationChain msgs) {
		Uri oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUANTITY__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Uri newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUANTITY__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUANTITY__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUANTITY__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUANTITY__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUANTITY__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUANTITY__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUANTITY__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.QUANTITY__VALUE:
				return basicSetValue(null, msgs);
			case FhirPackage.QUANTITY__COMPARATOR:
				return basicSetComparator(null, msgs);
			case FhirPackage.QUANTITY__UNITS:
				return basicSetUnits(null, msgs);
			case FhirPackage.QUANTITY__SYSTEM:
				return basicSetSystem(null, msgs);
			case FhirPackage.QUANTITY__CODE:
				return basicSetCode(null, msgs);
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
			case FhirPackage.QUANTITY__VALUE:
				return getValue();
			case FhirPackage.QUANTITY__COMPARATOR:
				return getComparator();
			case FhirPackage.QUANTITY__UNITS:
				return getUnits();
			case FhirPackage.QUANTITY__SYSTEM:
				return getSystem();
			case FhirPackage.QUANTITY__CODE:
				return getCode();
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
			case FhirPackage.QUANTITY__VALUE:
				setValue((Decimal)newValue);
				return;
			case FhirPackage.QUANTITY__COMPARATOR:
				setComparator((QuantityComparator)newValue);
				return;
			case FhirPackage.QUANTITY__UNITS:
				setUnits((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUANTITY__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case FhirPackage.QUANTITY__CODE:
				setCode((Code)newValue);
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
			case FhirPackage.QUANTITY__VALUE:
				setValue((Decimal)null);
				return;
			case FhirPackage.QUANTITY__COMPARATOR:
				setComparator((QuantityComparator)null);
				return;
			case FhirPackage.QUANTITY__UNITS:
				setUnits((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUANTITY__SYSTEM:
				setSystem((Uri)null);
				return;
			case FhirPackage.QUANTITY__CODE:
				setCode((Code)null);
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
			case FhirPackage.QUANTITY__VALUE:
				return value != null;
			case FhirPackage.QUANTITY__COMPARATOR:
				return comparator != null;
			case FhirPackage.QUANTITY__UNITS:
				return units != null;
			case FhirPackage.QUANTITY__SYSTEM:
				return system != null;
			case FhirPackage.QUANTITY__CODE:
				return code != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantityImpl
