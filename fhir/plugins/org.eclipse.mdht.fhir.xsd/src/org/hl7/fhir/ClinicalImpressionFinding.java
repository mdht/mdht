/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Impression Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClinicalImpressionFinding#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpressionFinding#getCause <em>Cause</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClinicalImpressionFinding()
 * @model extendedMetaData="name='ClinicalImpression.Finding' kind='elementOnly'"
 * @generated
 */
public interface ClinicalImpressionFinding extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific text of code for finding or diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpressionFinding_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpressionFinding#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which investigations support finding or diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cause</em>' containment reference.
	 * @see #setCause(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpressionFinding_Cause()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cause' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCause();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpressionFinding#getCause <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' containment reference.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(org.hl7.fhir.String value);

} // ClinicalImpressionFinding
