/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things are expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getBoundsQuantity <em>Bounds Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getBoundsRange <em>Bounds Range</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getBoundsPeriod <em>Bounds Period</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getDurationUnits <em>Duration Units</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getFrequencyMax <em>Frequency Max</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getPeriodMax <em>Period Max</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getPeriodUnits <em>Period Units</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTimingRepeat()
 * @model extendedMetaData="name='Timing.Repeat' kind='elementOnly'"
 * @generated
 */
public interface TimingRepeat extends Element {
	/**
	 * Returns the value of the '<em><b>Bounds Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds Quantity</em>' containment reference.
	 * @see #setBoundsQuantity(Duration)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_BoundsQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundsQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getBoundsQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getBoundsQuantity <em>Bounds Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds Quantity</em>' containment reference.
	 * @see #getBoundsQuantity()
	 * @generated
	 */
	void setBoundsQuantity(Duration value);

	/**
	 * Returns the value of the '<em><b>Bounds Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds Range</em>' containment reference.
	 * @see #setBoundsRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_BoundsRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundsRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getBoundsRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getBoundsRange <em>Bounds Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds Range</em>' containment reference.
	 * @see #getBoundsRange()
	 * @generated
	 */
	void setBoundsRange(Range value);

	/**
	 * Returns the value of the '<em><b>Bounds Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds Period</em>' containment reference.
	 * @see #setBoundsPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_BoundsPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundsPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getBoundsPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getBoundsPeriod <em>Bounds Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds Period</em>' containment reference.
	 * @see #getBoundsPeriod()
	 * @generated
	 */
	void setBoundsPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A total count of the desired number of repetitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_Count()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How long this thing happens for when it happens.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper limit of how long this thing happens for when it happens.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration Max</em>' containment reference.
	 * @see #setDurationMax(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_DurationMax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='durationMax' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getDurationMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getDurationMax <em>Duration Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Max</em>' containment reference.
	 * @see #getDurationMax()
	 * @generated
	 */
	void setDurationMax(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of time for the duration, in UCUM units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration Units</em>' containment reference.
	 * @see #setDurationUnits(UnitsOfTime)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_DurationUnits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='durationUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitsOfTime getDurationUnits();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getDurationUnits <em>Duration Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Units</em>' containment reference.
	 * @see #getDurationUnits()
	 * @generated
	 */
	void setDurationUnits(UnitsOfTime value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_Frequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getFrequency();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Frequency Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that the frequency is a range - so repeat between [frequency] and [frequencyMax] times within the period or period range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency Max</em>' containment reference.
	 * @see #setFrequencyMax(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_FrequencyMax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frequencyMax' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getFrequencyMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getFrequencyMax <em>Frequency Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Max</em>' containment reference.
	 * @see #getFrequencyMax()
	 * @generated
	 */
	void setFrequencyMax(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the duration of time over which repetitions are to occur.  E.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Decimal value);

	/**
	 * Returns the value of the '<em><b>Period Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period Max</em>' containment reference.
	 * @see #setPeriodMax(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_PeriodMax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodMax' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPeriodMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getPeriodMax <em>Period Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Max</em>' containment reference.
	 * @see #getPeriodMax()
	 * @generated
	 */
	void setPeriodMax(Decimal value);

	/**
	 * Returns the value of the '<em><b>Period Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of time for the period in UCUM units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period Units</em>' containment reference.
	 * @see #setPeriodUnits(UnitsOfTime)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_PeriodUnits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitsOfTime getPeriodUnits();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getPeriodUnits <em>Period Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Units</em>' containment reference.
	 * @see #getPeriodUnits()
	 * @generated
	 */
	void setPeriodUnits(UnitsOfTime value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A real world event that the occurrence of the event should be tied to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(EventTiming)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_When()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	EventTiming getWhen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(EventTiming value);

} // TimingRepeat
