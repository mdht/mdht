/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value set specifies a set of codes drawn from one or more code systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ValueSetConcept#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetConcept#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetConcept#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetConcept#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetConcept#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetConcept#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getValueSetConcept()
 * @model extendedMetaData="name='ValueSet.Concept' kind='elementOnly'"
 * @generated
 */
public interface ValueSetConcept extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code that identifies concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getValueSetConcept_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetConcept#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this code is not for use as a real concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getValueSetConcept_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAbstract();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetConcept#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text to Display to the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSetConcept_Display()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetConcept#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal definition of the concept. Formal definitions are not required, because of the prevalence of legacy systems without them, but they are highly recommended, as without them there is no formal meaning associated with the concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSetConcept_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetConcept#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetDesignation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional representations for the concept - other languages, aliases, specialised purposes, used for particular purposes, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetConcept_Designation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetDesignation> getDesignation();

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Child Concepts (is-a / contains).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetConcept_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetConcept> getConcept();

} // ValueSetConcept
