/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Explanation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Immunization event information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImmunizationExplanation#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationExplanation#getReasonNotGiven <em>Reason Not Given</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunizationExplanation()
 * @model extendedMetaData="name='Immunization.Explanation' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationExplanation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reasons why a vaccine was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationExplanation_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReason();

	/**
	 * Returns the value of the '<em><b>Reason Not Given</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason why a vaccine was not administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Not Given</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationExplanation_ReasonNotGiven()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonNotGiven' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReasonNotGiven();

} // ImmunizationExplanation
