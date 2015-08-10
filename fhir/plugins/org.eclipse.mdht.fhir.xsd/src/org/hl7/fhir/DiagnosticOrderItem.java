/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Order Item</b></em>'.
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
 *   <li>{@link org.hl7.fhir.DiagnosticOrderItem#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticOrderItem#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticOrderItem#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticOrderItem#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticOrderItem#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDiagnosticOrderItem()
 * @model extendedMetaData="name='DiagnosticOrder.Item' kind='elementOnly'"
 * @generated
 */
public interface DiagnosticOrderItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that identifies a particular diagnostic investigation, or panel of investigations, that have been requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticOrderItem_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticOrderItem#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the item is related to a specific specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticOrderItem_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSpecimen();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anatomical location where the request test should be performed.  This is the target site.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticOrderItem_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticOrderItem#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this individual item within the order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DiagnosticOrderStatus)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticOrderItem_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticOrderStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticOrderItem#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DiagnosticOrderStatus value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DiagnosticOrderEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A summary of the events of interest that have occurred as this item of the request is processed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticOrderItem_Event()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DiagnosticOrderEvent> getEvent();

} // DiagnosticOrderItem
