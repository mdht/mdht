/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of error, warning or information messages that result from a system action.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.OperationOutcome#getIssue <em>Issue</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getOperationOutcome()
 * @model extendedMetaData="name='OperationOutcome' kind='elementOnly'"
 * @generated
 */
public interface OperationOutcome extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Issue</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.OperationOutcomeIssue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An error, warning or information message that results from a system action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getOperationOutcome_Issue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='issue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OperationOutcomeIssue> getIssue();

} // OperationOutcome
