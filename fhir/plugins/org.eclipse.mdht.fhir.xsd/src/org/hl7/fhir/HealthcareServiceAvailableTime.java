/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Healthcare Service Available Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The details of a Healthcare Service available at a location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.HealthcareServiceAvailableTime#getDaysOfWeek <em>Days Of Week</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareServiceAvailableTime#getAllDay <em>All Day</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareServiceAvailableTime#getAvailableStartTime <em>Available Start Time</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareServiceAvailableTime#getAvailableEndTime <em>Available End Time</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getHealthcareServiceAvailableTime()
 * @model extendedMetaData="name='HealthcareService.AvailableTime' kind='elementOnly'"
 * @generated
 */
public interface HealthcareServiceAvailableTime extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Days Of Week</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DaysOfWeek}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which Days of the week are available between the Start and End Times.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Days Of Week</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareServiceAvailableTime_DaysOfWeek()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='daysOfWeek' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DaysOfWeek> getDaysOfWeek();

	/**
	 * Returns the value of the '<em><b>All Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this always available? (hence times are irrelevant) e.g. 24 hour service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Day</em>' containment reference.
	 * @see #setAllDay(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareServiceAvailableTime_AllDay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allDay' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAllDay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareServiceAvailableTime#getAllDay <em>All Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Day</em>' containment reference.
	 * @see #getAllDay()
	 * @generated
	 */
	void setAllDay(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Available Start Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The opening time of day. Note: If the AllDay flag is set, then this time is ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Start Time</em>' containment reference.
	 * @see #setAvailableStartTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareServiceAvailableTime_AvailableStartTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availableStartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getAvailableStartTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareServiceAvailableTime#getAvailableStartTime <em>Available Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Start Time</em>' containment reference.
	 * @see #getAvailableStartTime()
	 * @generated
	 */
	void setAvailableStartTime(Time value);

	/**
	 * Returns the value of the '<em><b>Available End Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The closing time of day. Note: If the AllDay flag is set, then this time is ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available End Time</em>' containment reference.
	 * @see #setAvailableEndTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareServiceAvailableTime_AvailableEndTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availableEndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getAvailableEndTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareServiceAvailableTime#getAvailableEndTime <em>Available End Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available End Time</em>' containment reference.
	 * @see #getAvailableEndTime()
	 * @generated
	 */
	void setAvailableEndTime(Time value);

} // HealthcareServiceAvailableTime
