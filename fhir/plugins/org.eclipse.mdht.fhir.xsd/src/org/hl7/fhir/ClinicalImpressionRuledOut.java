/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Impression Ruled Out</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ClinicalImpressionRuledOut#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpressionRuledOut#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClinicalImpressionRuledOut()
 * @model extendedMetaData="name='ClinicalImpression.RuledOut' kind='elementOnly'"
 * @generated
 */
public interface ClinicalImpressionRuledOut extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific text of code for diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpressionRuledOut_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpressionRuledOut#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grounds for elimination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpressionRuledOut_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpressionRuledOut#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(org.hl7.fhir.String value);

} // ClinicalImpressionRuledOut
