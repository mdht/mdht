/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Body Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action that is or was performed on a patient. This can be a physical 'thing' like an operation, or less invasive like counseling or hypnotherapy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProcedureBodySite#getSiteCodeableConcept <em>Site Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureBodySite#getSiteReference <em>Site Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProcedureBodySite()
 * @model extendedMetaData="name='Procedure.BodySite' kind='elementOnly'"
 * @generated
 */
public interface ProcedureBodySite extends BackboneElement {
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
	 * @see org.hl7.fhir.FhirPackage#getProcedureBodySite_SiteCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='siteCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSiteCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureBodySite#getSiteCodeableConcept <em>Site Codeable Concept</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getProcedureBodySite_SiteReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='siteReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSiteReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureBodySite#getSiteReference <em>Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Reference</em>' containment reference.
	 * @see #getSiteReference()
	 * @generated
	 */
	void setSiteReference(Reference value);

} // ProcedureBodySite
