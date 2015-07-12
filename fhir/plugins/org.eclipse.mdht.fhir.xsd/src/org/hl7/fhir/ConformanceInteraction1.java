/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Interaction1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConformanceInteraction1#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceInteraction1#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformanceInteraction1()
 * @model extendedMetaData="name='Conformance.Interaction1' kind='elementOnly'"
 * @generated
 */
public interface ConformanceInteraction1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded identifier of the operation, supported by the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(SystemRestfulInteraction)
	 * @see org.hl7.fhir.FhirPackage#getConformanceInteraction1_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemRestfulInteraction getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceInteraction1#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(SystemRestfulInteraction value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformanceInteraction1_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceInteraction1#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.hl7.fhir.String value);

} // ConformanceInteraction1
