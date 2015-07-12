/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Interaction</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ConformanceInteraction#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceInteraction#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformanceInteraction()
 * @model extendedMetaData="name='Conformance.Interaction' kind='elementOnly'"
 * @generated
 */
public interface ConformanceInteraction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coded identifier of the operation, supported by the system resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(TypeRestfulInteraction)
	 * @see org.hl7.fhir.FhirPackage#getConformanceInteraction_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeRestfulInteraction getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceInteraction#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(TypeRestfulInteraction value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformanceInteraction_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceInteraction#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.hl7.fhir.String value);

} // ConformanceInteraction
