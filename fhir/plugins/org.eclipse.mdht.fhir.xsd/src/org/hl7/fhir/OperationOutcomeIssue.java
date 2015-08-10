/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Outcome Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of error, warning or information messages that result from a system action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.OperationOutcomeIssue#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationOutcomeIssue#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationOutcomeIssue#getDetails <em>Details</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationOutcomeIssue#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationOutcomeIssue#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getOperationOutcomeIssue()
 * @model extendedMetaData="name='OperationOutcome.Issue' kind='elementOnly'"
 * @generated
 */
public interface OperationOutcomeIssue extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the issue indicates a variation from successful processing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(IssueSeverity)
	 * @see org.hl7.fhir.FhirPackage#getOperationOutcomeIssue_Severity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	IssueSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationOutcomeIssue#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(IssueSeverity value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide it's own code for the error in the details element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(IssueType)
	 * @see org.hl7.fhir.FhirPackage#getOperationOutcomeIssue_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	IssueType getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationOutcomeIssue#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(IssueType value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional details about the error. This may be a text description of the error, or a system code that identifies the error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Details</em>' containment reference.
	 * @see #setDetails(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getOperationOutcomeIssue_Details()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='details' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDetails();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationOutcomeIssue#getDetails <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' containment reference.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Diagnostics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostics</em>' containment reference.
	 * @see #setDiagnostics(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getOperationOutcomeIssue_Diagnostics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnostics' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDiagnostics();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationOutcomeIssue#getDiagnostics <em>Diagnostics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostics</em>' containment reference.
	 * @see #getDiagnostics()
	 * @generated
	 */
	void setDiagnostics(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getOperationOutcomeIssue_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getLocation();

} // OperationOutcomeIssue
