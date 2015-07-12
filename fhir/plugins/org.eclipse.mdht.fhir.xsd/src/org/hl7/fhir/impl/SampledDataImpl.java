/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sampled Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SampledDataImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SampledDataImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SampledDataImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SampledDataImpl#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SampledDataImpl#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SampledDataImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SampledDataImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SampledDataImpl extends ElementImpl implements SampledData {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Quantity origin;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Decimal period;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected Decimal lowerLimit;

	/**
	 * The cached value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected Decimal upperLimit;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt dimensions;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected SampledDataDataType data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampledDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSampledData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(Quantity newOrigin, NotificationChain msgs) {
		Quantity oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__ORIGIN, oldOrigin, newOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Quantity newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Decimal newPeriod, NotificationChain msgs) {
		Decimal oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Decimal newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactor(Decimal newFactor, NotificationChain msgs) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__FACTOR, oldFactor, newFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Decimal newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getLowerLimit() {
		return lowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerLimit(Decimal newLowerLimit, NotificationChain msgs) {
		Decimal oldLowerLimit = lowerLimit;
		lowerLimit = newLowerLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__LOWER_LIMIT, oldLowerLimit, newLowerLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLimit(Decimal newLowerLimit) {
		if (newLowerLimit != lowerLimit) {
			NotificationChain msgs = null;
			if (lowerLimit != null)
				msgs = ((InternalEObject)lowerLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__LOWER_LIMIT, null, msgs);
			if (newLowerLimit != null)
				msgs = ((InternalEObject)newLowerLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__LOWER_LIMIT, null, msgs);
			msgs = basicSetLowerLimit(newLowerLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__LOWER_LIMIT, newLowerLimit, newLowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getUpperLimit() {
		return upperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperLimit(Decimal newUpperLimit, NotificationChain msgs) {
		Decimal oldUpperLimit = upperLimit;
		upperLimit = newUpperLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__UPPER_LIMIT, oldUpperLimit, newUpperLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperLimit(Decimal newUpperLimit) {
		if (newUpperLimit != upperLimit) {
			NotificationChain msgs = null;
			if (upperLimit != null)
				msgs = ((InternalEObject)upperLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__UPPER_LIMIT, null, msgs);
			if (newUpperLimit != null)
				msgs = ((InternalEObject)newUpperLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__UPPER_LIMIT, null, msgs);
			msgs = basicSetUpperLimit(newUpperLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__UPPER_LIMIT, newUpperLimit, newUpperLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensions(PositiveInt newDimensions, NotificationChain msgs) {
		PositiveInt oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__DIMENSIONS, oldDimensions, newDimensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(PositiveInt newDimensions) {
		if (newDimensions != dimensions) {
			NotificationChain msgs = null;
			if (dimensions != null)
				msgs = ((InternalEObject)dimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__DIMENSIONS, null, msgs);
			if (newDimensions != null)
				msgs = ((InternalEObject)newDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__DIMENSIONS, null, msgs);
			msgs = basicSetDimensions(newDimensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__DIMENSIONS, newDimensions, newDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledDataDataType getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(SampledDataDataType newData, NotificationChain msgs) {
		SampledDataDataType oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__DATA, oldData, newData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(SampledDataDataType newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SAMPLED_DATA__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SAMPLED_DATA__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SAMPLED_DATA__ORIGIN:
				return basicSetOrigin(null, msgs);
			case FhirPackage.SAMPLED_DATA__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.SAMPLED_DATA__FACTOR:
				return basicSetFactor(null, msgs);
			case FhirPackage.SAMPLED_DATA__LOWER_LIMIT:
				return basicSetLowerLimit(null, msgs);
			case FhirPackage.SAMPLED_DATA__UPPER_LIMIT:
				return basicSetUpperLimit(null, msgs);
			case FhirPackage.SAMPLED_DATA__DIMENSIONS:
				return basicSetDimensions(null, msgs);
			case FhirPackage.SAMPLED_DATA__DATA:
				return basicSetData(null, msgs);
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
			case FhirPackage.SAMPLED_DATA__ORIGIN:
				return getOrigin();
			case FhirPackage.SAMPLED_DATA__PERIOD:
				return getPeriod();
			case FhirPackage.SAMPLED_DATA__FACTOR:
				return getFactor();
			case FhirPackage.SAMPLED_DATA__LOWER_LIMIT:
				return getLowerLimit();
			case FhirPackage.SAMPLED_DATA__UPPER_LIMIT:
				return getUpperLimit();
			case FhirPackage.SAMPLED_DATA__DIMENSIONS:
				return getDimensions();
			case FhirPackage.SAMPLED_DATA__DATA:
				return getData();
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
			case FhirPackage.SAMPLED_DATA__ORIGIN:
				setOrigin((Quantity)newValue);
				return;
			case FhirPackage.SAMPLED_DATA__PERIOD:
				setPeriod((Decimal)newValue);
				return;
			case FhirPackage.SAMPLED_DATA__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FhirPackage.SAMPLED_DATA__LOWER_LIMIT:
				setLowerLimit((Decimal)newValue);
				return;
			case FhirPackage.SAMPLED_DATA__UPPER_LIMIT:
				setUpperLimit((Decimal)newValue);
				return;
			case FhirPackage.SAMPLED_DATA__DIMENSIONS:
				setDimensions((PositiveInt)newValue);
				return;
			case FhirPackage.SAMPLED_DATA__DATA:
				setData((SampledDataDataType)newValue);
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
			case FhirPackage.SAMPLED_DATA__ORIGIN:
				setOrigin((Quantity)null);
				return;
			case FhirPackage.SAMPLED_DATA__PERIOD:
				setPeriod((Decimal)null);
				return;
			case FhirPackage.SAMPLED_DATA__FACTOR:
				setFactor((Decimal)null);
				return;
			case FhirPackage.SAMPLED_DATA__LOWER_LIMIT:
				setLowerLimit((Decimal)null);
				return;
			case FhirPackage.SAMPLED_DATA__UPPER_LIMIT:
				setUpperLimit((Decimal)null);
				return;
			case FhirPackage.SAMPLED_DATA__DIMENSIONS:
				setDimensions((PositiveInt)null);
				return;
			case FhirPackage.SAMPLED_DATA__DATA:
				setData((SampledDataDataType)null);
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
			case FhirPackage.SAMPLED_DATA__ORIGIN:
				return origin != null;
			case FhirPackage.SAMPLED_DATA__PERIOD:
				return period != null;
			case FhirPackage.SAMPLED_DATA__FACTOR:
				return factor != null;
			case FhirPackage.SAMPLED_DATA__LOWER_LIMIT:
				return lowerLimit != null;
			case FhirPackage.SAMPLED_DATA__UPPER_LIMIT:
				return upperLimit != null;
			case FhirPackage.SAMPLED_DATA__DIMENSIONS:
				return dimensions != null;
			case FhirPackage.SAMPLED_DATA__DATA:
				return data != null;
		}
		return super.eIsSet(featureID);
	}

} //SampledDataImpl
