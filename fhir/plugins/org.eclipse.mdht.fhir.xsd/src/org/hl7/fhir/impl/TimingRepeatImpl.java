/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Decimal;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.UnitsOfTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Repeat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getDurationUnits <em>Duration Units</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getFrequencyMax <em>Frequency Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getPeriodMax <em>Period Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getPeriodUnits <em>Period Units</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingRepeatImpl extends ElementImpl implements TimingRepeat {
	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Period bounds;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer count;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Decimal duration;

	/**
	 * The cached value of the '{@link #getDurationUnits() <em>Duration Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationUnits()
	 * @generated
	 * @ordered
	 */
	protected UnitsOfTime durationUnits;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer frequency;

	/**
	 * The cached value of the '{@link #getFrequencyMax() <em>Frequency Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyMax()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer frequencyMax;

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
	 * The cached value of the '{@link #getPeriodMax() <em>Period Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodMax()
	 * @generated
	 * @ordered
	 */
	protected Decimal periodMax;

	/**
	 * The cached value of the '{@link #getPeriodUnits() <em>Period Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodUnits()
	 * @generated
	 * @ordered
	 */
	protected UnitsOfTime periodUnits;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected EventTiming when;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingRepeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTimingRepeat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBounds(Period newBounds, NotificationChain msgs) {
		Period oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__BOUNDS, oldBounds, newBounds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(Period newBounds) {
		if (newBounds != bounds) {
			NotificationChain msgs = null;
			if (bounds != null)
				msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__BOUNDS, null, msgs);
			if (newBounds != null)
				msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__BOUNDS, null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__BOUNDS, newBounds, newBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(org.hl7.fhir.Integer newCount, NotificationChain msgs) {
		org.hl7.fhir.Integer oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__COUNT, oldCount, newCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(org.hl7.fhir.Integer newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Decimal newDuration, NotificationChain msgs) {
		Decimal oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Decimal newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTime getDurationUnits() {
		return durationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationUnits(UnitsOfTime newDurationUnits, NotificationChain msgs) {
		UnitsOfTime oldDurationUnits = durationUnits;
		durationUnits = newDurationUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__DURATION_UNITS, oldDurationUnits, newDurationUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationUnits(UnitsOfTime newDurationUnits) {
		if (newDurationUnits != durationUnits) {
			NotificationChain msgs = null;
			if (durationUnits != null)
				msgs = ((InternalEObject)durationUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__DURATION_UNITS, null, msgs);
			if (newDurationUnits != null)
				msgs = ((InternalEObject)newDurationUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__DURATION_UNITS, null, msgs);
			msgs = basicSetDurationUnits(newDurationUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__DURATION_UNITS, newDurationUnits, newDurationUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequency(org.hl7.fhir.Integer newFrequency, NotificationChain msgs) {
		org.hl7.fhir.Integer oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__FREQUENCY, oldFrequency, newFrequency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(org.hl7.fhir.Integer newFrequency) {
		if (newFrequency != frequency) {
			NotificationChain msgs = null;
			if (frequency != null)
				msgs = ((InternalEObject)frequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__FREQUENCY, null, msgs);
			if (newFrequency != null)
				msgs = ((InternalEObject)newFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__FREQUENCY, null, msgs);
			msgs = basicSetFrequency(newFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__FREQUENCY, newFrequency, newFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getFrequencyMax() {
		return frequencyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequencyMax(org.hl7.fhir.Integer newFrequencyMax, NotificationChain msgs) {
		org.hl7.fhir.Integer oldFrequencyMax = frequencyMax;
		frequencyMax = newFrequencyMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__FREQUENCY_MAX, oldFrequencyMax, newFrequencyMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyMax(org.hl7.fhir.Integer newFrequencyMax) {
		if (newFrequencyMax != frequencyMax) {
			NotificationChain msgs = null;
			if (frequencyMax != null)
				msgs = ((InternalEObject)frequencyMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__FREQUENCY_MAX, null, msgs);
			if (newFrequencyMax != null)
				msgs = ((InternalEObject)newFrequencyMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__FREQUENCY_MAX, null, msgs);
			msgs = basicSetFrequencyMax(newFrequencyMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__FREQUENCY_MAX, newFrequencyMax, newFrequencyMax));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPeriodMax() {
		return periodMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodMax(Decimal newPeriodMax, NotificationChain msgs) {
		Decimal oldPeriodMax = periodMax;
		periodMax = newPeriodMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD_MAX, oldPeriodMax, newPeriodMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodMax(Decimal newPeriodMax) {
		if (newPeriodMax != periodMax) {
			NotificationChain msgs = null;
			if (periodMax != null)
				msgs = ((InternalEObject)periodMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD_MAX, null, msgs);
			if (newPeriodMax != null)
				msgs = ((InternalEObject)newPeriodMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD_MAX, null, msgs);
			msgs = basicSetPeriodMax(newPeriodMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD_MAX, newPeriodMax, newPeriodMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTime getPeriodUnits() {
		return periodUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodUnits(UnitsOfTime newPeriodUnits, NotificationChain msgs) {
		UnitsOfTime oldPeriodUnits = periodUnits;
		periodUnits = newPeriodUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD_UNITS, oldPeriodUnits, newPeriodUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodUnits(UnitsOfTime newPeriodUnits) {
		if (newPeriodUnits != periodUnits) {
			NotificationChain msgs = null;
			if (periodUnits != null)
				msgs = ((InternalEObject)periodUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD_UNITS, null, msgs);
			if (newPeriodUnits != null)
				msgs = ((InternalEObject)newPeriodUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD_UNITS, null, msgs);
			msgs = basicSetPeriodUnits(newPeriodUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD_UNITS, newPeriodUnits, newPeriodUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTiming getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(EventTiming newWhen, NotificationChain msgs) {
		EventTiming oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(EventTiming newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TIMING_REPEAT__BOUNDS:
				return basicSetBounds(null, msgs);
			case FhirPackage.TIMING_REPEAT__COUNT:
				return basicSetCount(null, msgs);
			case FhirPackage.TIMING_REPEAT__DURATION:
				return basicSetDuration(null, msgs);
			case FhirPackage.TIMING_REPEAT__DURATION_UNITS:
				return basicSetDurationUnits(null, msgs);
			case FhirPackage.TIMING_REPEAT__FREQUENCY:
				return basicSetFrequency(null, msgs);
			case FhirPackage.TIMING_REPEAT__FREQUENCY_MAX:
				return basicSetFrequencyMax(null, msgs);
			case FhirPackage.TIMING_REPEAT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.TIMING_REPEAT__PERIOD_MAX:
				return basicSetPeriodMax(null, msgs);
			case FhirPackage.TIMING_REPEAT__PERIOD_UNITS:
				return basicSetPeriodUnits(null, msgs);
			case FhirPackage.TIMING_REPEAT__WHEN:
				return basicSetWhen(null, msgs);
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
			case FhirPackage.TIMING_REPEAT__BOUNDS:
				return getBounds();
			case FhirPackage.TIMING_REPEAT__COUNT:
				return getCount();
			case FhirPackage.TIMING_REPEAT__DURATION:
				return getDuration();
			case FhirPackage.TIMING_REPEAT__DURATION_UNITS:
				return getDurationUnits();
			case FhirPackage.TIMING_REPEAT__FREQUENCY:
				return getFrequency();
			case FhirPackage.TIMING_REPEAT__FREQUENCY_MAX:
				return getFrequencyMax();
			case FhirPackage.TIMING_REPEAT__PERIOD:
				return getPeriod();
			case FhirPackage.TIMING_REPEAT__PERIOD_MAX:
				return getPeriodMax();
			case FhirPackage.TIMING_REPEAT__PERIOD_UNITS:
				return getPeriodUnits();
			case FhirPackage.TIMING_REPEAT__WHEN:
				return getWhen();
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
			case FhirPackage.TIMING_REPEAT__BOUNDS:
				setBounds((Period)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__COUNT:
				setCount((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__DURATION:
				setDuration((Decimal)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__DURATION_UNITS:
				setDurationUnits((UnitsOfTime)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__FREQUENCY:
				setFrequency((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__FREQUENCY_MAX:
				setFrequencyMax((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD:
				setPeriod((Decimal)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD_MAX:
				setPeriodMax((Decimal)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD_UNITS:
				setPeriodUnits((UnitsOfTime)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__WHEN:
				setWhen((EventTiming)newValue);
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
			case FhirPackage.TIMING_REPEAT__BOUNDS:
				setBounds((Period)null);
				return;
			case FhirPackage.TIMING_REPEAT__COUNT:
				setCount((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.TIMING_REPEAT__DURATION:
				setDuration((Decimal)null);
				return;
			case FhirPackage.TIMING_REPEAT__DURATION_UNITS:
				setDurationUnits((UnitsOfTime)null);
				return;
			case FhirPackage.TIMING_REPEAT__FREQUENCY:
				setFrequency((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.TIMING_REPEAT__FREQUENCY_MAX:
				setFrequencyMax((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD:
				setPeriod((Decimal)null);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD_MAX:
				setPeriodMax((Decimal)null);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD_UNITS:
				setPeriodUnits((UnitsOfTime)null);
				return;
			case FhirPackage.TIMING_REPEAT__WHEN:
				setWhen((EventTiming)null);
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
			case FhirPackage.TIMING_REPEAT__BOUNDS:
				return bounds != null;
			case FhirPackage.TIMING_REPEAT__COUNT:
				return count != null;
			case FhirPackage.TIMING_REPEAT__DURATION:
				return duration != null;
			case FhirPackage.TIMING_REPEAT__DURATION_UNITS:
				return durationUnits != null;
			case FhirPackage.TIMING_REPEAT__FREQUENCY:
				return frequency != null;
			case FhirPackage.TIMING_REPEAT__FREQUENCY_MAX:
				return frequencyMax != null;
			case FhirPackage.TIMING_REPEAT__PERIOD:
				return period != null;
			case FhirPackage.TIMING_REPEAT__PERIOD_MAX:
				return periodMax != null;
			case FhirPackage.TIMING_REPEAT__PERIOD_UNITS:
				return periodUnits != null;
			case FhirPackage.TIMING_REPEAT__WHEN:
				return when != null;
		}
		return super.eIsSet(featureID);
	}

} //TimingRepeatImpl
