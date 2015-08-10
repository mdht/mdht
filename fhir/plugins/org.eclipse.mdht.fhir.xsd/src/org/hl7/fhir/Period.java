/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A time period defined by a start and end date and optionally time.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Period#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.Period#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPeriod()
 * @model extendedMetaData="name='Period' kind='elementOnly'"
 * @generated
 */
public interface Period extends Element {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start of the period. The boundary is inclusive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getPeriod_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Period#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(DateTime value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end of the period. If the end of the period is missing, it means that the period is ongoing. The start mey be in the past, and the end date in the future, which means that period is expected/planned to end at that time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getPeriod_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Period#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(DateTime value);

} // Period
