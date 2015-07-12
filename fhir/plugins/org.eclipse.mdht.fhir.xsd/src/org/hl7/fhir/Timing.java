/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing</b></em>'.
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
 *   <li>{@link org.hl7.fhir.Timing#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.fhir.Timing#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link org.hl7.fhir.Timing#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTiming()
 * @model extendedMetaData="name='Timing' kind='elementOnly'"
 * @generated
 */
public interface Timing extends Element {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DateTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies specific times when the event occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTiming_Event()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateTime> getEvent();

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of rules that describe when the event should occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat</em>' containment reference.
	 * @see #setRepeat(TimingRepeat)
	 * @see org.hl7.fhir.FhirPackage#getTiming_Repeat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeat' namespace='##targetNamespace'"
	 * @generated
	 */
	TimingRepeat getRepeat();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Timing#getRepeat <em>Repeat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' containment reference.
	 * @see #getRepeat()
	 * @generated
	 */
	void setRepeat(TimingRepeat value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code for the timing pattern. Some codes such as BID are uniquitious, but many instutions define their own additional codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getTiming_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Timing#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

} // Timing
