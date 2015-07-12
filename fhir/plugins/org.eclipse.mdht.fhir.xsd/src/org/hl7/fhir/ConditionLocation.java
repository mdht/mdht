/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Use to record detailed information about conditions, problems or diagnoses recognized by a clinician. There are many uses including: recording a Diagnosis during an Encounter; populating a problem List or a Summary Statement, such as a Discharge Summary.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConditionLocation#getSiteCodeableConcept <em>Site Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionLocation#getSiteReference <em>Site Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConditionLocation()
 * @model extendedMetaData="name='Condition.Location' kind='elementOnly'"
 * @generated
 */
public interface ConditionLocation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Site Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Codeable Concept</em>' containment reference.
	 * @see #setSiteCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getConditionLocation_SiteCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='siteCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSiteCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionLocation#getSiteCodeableConcept <em>Site Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Codeable Concept</em>' containment reference.
	 * @see #getSiteCodeableConcept()
	 * @generated
	 */
	void setSiteCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Site Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Reference</em>' containment reference.
	 * @see #setSiteReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConditionLocation_SiteReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='siteReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSiteReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionLocation#getSiteReference <em>Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Reference</em>' containment reference.
	 * @see #getSiteReference()
	 * @generated
	 */
	void setSiteReference(Reference value);

} // ConditionLocation
