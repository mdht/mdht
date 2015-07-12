/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Order Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a request for a diagnostic investigation service to be performed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DiagnosticOrderEvent#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticOrderEvent#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticOrderEvent#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticOrderEvent#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDiagnosticOrderEvent()
 * @model extendedMetaData="name='DiagnosticOrder.Event' kind='elementOnly'"
 * @generated
 */
public interface DiagnosticOrderEvent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status for the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DiagnosticOrderStatus)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticOrderEvent_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticOrderStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticOrderEvent#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DiagnosticOrderStatus value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about the event that occurred - e.g. if the status remained unchanged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticOrderEvent_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticOrderEvent#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date/time at which the event occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticOrderEvent_DateTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticOrderEvent#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person who was responsible for performing or recording the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference.
	 * @see #setActor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticOrderEvent_Actor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getActor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticOrderEvent#getActor <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' containment reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Reference value);

} // DiagnosticOrderEvent
