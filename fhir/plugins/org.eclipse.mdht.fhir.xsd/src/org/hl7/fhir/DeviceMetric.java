/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a measurement, calculation or setting capability of a medical device.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceMetric#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceMetric#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceMetric#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceMetric#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceMetric#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceMetric#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceMetric#getColor <em>Color</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceMetric#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceMetric#getMeasurementPeriod <em>Measurement Period</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceMetric#getCalibration <em>Calibration</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceMetric()
 * @model extendedMetaData="name='DeviceMetric' kind='elementOnly'"
 * @generated
 */
public interface DeviceMetric extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetric_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetric#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID. 
	 * It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetric_Identifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetric#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetric_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetric#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetric_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetric#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Reference value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device.
	 * An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetric_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getParent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetric#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Reference value);

	/**
	 * Returns the value of the '<em><b>Operational Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates current operational state of the device. For example: On, Off, Standby, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operational Status</em>' containment reference.
	 * @see #setOperationalStatus(DeviceMetricOperationalStatus)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetric_OperationalStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operationalStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetricOperationalStatus getOperationalStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetric#getOperationalStatus <em>Operational Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Status</em>' containment reference.
	 * @see #getOperationalStatus()
	 * @generated
	 */
	void setOperationalStatus(DeviceMetricOperationalStatus value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(DeviceMetricColor)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetric_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetricColor getColor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetric#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(DeviceMetricColor value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(DeviceMetricCategory)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetric_Category()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetricCategory getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetric#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(DeviceMetricCategory value);

	/**
	 * Returns the value of the '<em><b>Measurement Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the measurement repetition time. This is not necessarily the same as the update period.
	 * The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour.
	 * The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Period</em>' containment reference.
	 * @see #setMeasurementPeriod(Timing)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetric_MeasurementPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measurementPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getMeasurementPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetric#getMeasurementPeriod <em>Measurement Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Period</em>' containment reference.
	 * @see #getMeasurementPeriod()
	 * @generated
	 */
	void setMeasurementPeriod(Timing value);

	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceMetricCalibration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the calibrations that have been performed or that are required to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calibration</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetric_Calibration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceMetricCalibration> getCalibration();

} // DeviceMetric
