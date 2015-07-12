/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ratio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RatioImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RatioImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatioImpl extends ElementImpl implements Ratio {
	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected Quantity numerator;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected Quantity denominator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRatio();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getNumerator() {
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumerator(Quantity newNumerator, NotificationChain msgs) {
		Quantity oldNumerator = numerator;
		numerator = newNumerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RATIO__NUMERATOR, oldNumerator, newNumerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumerator(Quantity newNumerator) {
		if (newNumerator != numerator) {
			NotificationChain msgs = null;
			if (numerator != null)
				msgs = ((InternalEObject)numerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RATIO__NUMERATOR, null, msgs);
			if (newNumerator != null)
				msgs = ((InternalEObject)newNumerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RATIO__NUMERATOR, null, msgs);
			msgs = basicSetNumerator(newNumerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RATIO__NUMERATOR, newNumerator, newNumerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDenominator(Quantity newDenominator, NotificationChain msgs) {
		Quantity oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RATIO__DENOMINATOR, oldDenominator, newDenominator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominator(Quantity newDenominator) {
		if (newDenominator != denominator) {
			NotificationChain msgs = null;
			if (denominator != null)
				msgs = ((InternalEObject)denominator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RATIO__DENOMINATOR, null, msgs);
			if (newDenominator != null)
				msgs = ((InternalEObject)newDenominator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RATIO__DENOMINATOR, null, msgs);
			msgs = basicSetDenominator(newDenominator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RATIO__DENOMINATOR, newDenominator, newDenominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RATIO__NUMERATOR:
				return basicSetNumerator(null, msgs);
			case FhirPackage.RATIO__DENOMINATOR:
				return basicSetDenominator(null, msgs);
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
			case FhirPackage.RATIO__NUMERATOR:
				return getNumerator();
			case FhirPackage.RATIO__DENOMINATOR:
				return getDenominator();
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
			case FhirPackage.RATIO__NUMERATOR:
				setNumerator((Quantity)newValue);
				return;
			case FhirPackage.RATIO__DENOMINATOR:
				setDenominator((Quantity)newValue);
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
			case FhirPackage.RATIO__NUMERATOR:
				setNumerator((Quantity)null);
				return;
			case FhirPackage.RATIO__DENOMINATOR:
				setDenominator((Quantity)null);
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
			case FhirPackage.RATIO__NUMERATOR:
				return numerator != null;
			case FhirPackage.RATIO__DENOMINATOR:
				return denominator != null;
		}
		return super.eIsSet(featureID);
	}

} //RatioImpl
