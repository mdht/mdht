/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Metric Calibration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a measurement, calculation or setting capability of a medical device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceMetricCalibration#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceMetricCalibration#getState <em>State</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceMetricCalibration#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceMetricCalibration()
 * @model extendedMetaData="name='DeviceMetric.Calibration' kind='elementOnly'"
 * @generated
 */
public interface DeviceMetricCalibration extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the type of the calibration method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(DeviceMetricCalibrationType)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetricCalibration_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetricCalibrationType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetricCalibration#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DeviceMetricCalibrationType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the state of the calibration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(DeviceMetricCalibrationState)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetricCalibration_State()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetricCalibrationState getState();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetricCalibration#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(DeviceMetricCalibrationState value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the time last calibration has been performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Instant)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetricCalibration_Time()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetricCalibration#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Instant value);

} // DeviceMetricCalibration
