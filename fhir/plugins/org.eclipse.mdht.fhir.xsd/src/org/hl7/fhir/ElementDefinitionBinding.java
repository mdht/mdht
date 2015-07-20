/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Captures constraints on each element within the resource, profile, or extension.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetUri <em>Value Set Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetReference <em>Value Set Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding()
 * @model extendedMetaData="name='ElementDefinition.Binding' kind='elementOnly'"
 * @generated
 */
public interface ElementDefinitionBinding extends Element {
	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference.
	 * @see #setStrength(BindingStrength)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_Strength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strength' namespace='##targetNamespace'"
	 * @generated
	 */
	BindingStrength getStrength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(BindingStrength value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the intended use of this particular set of codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Set Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Uri</em>' containment reference.
	 * @see #setValueSetUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getValueSetUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetUri <em>Value Set Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Uri</em>' containment reference.
	 * @see #getValueSetUri()
	 * @generated
	 */
	void setValueSetUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Value Set Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Reference</em>' containment reference.
	 * @see #setValueSetReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueSetReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetReference <em>Value Set Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Reference</em>' containment reference.
	 * @see #getValueSetReference()
	 * @generated
	 */
	void setValueSetReference(Reference value);

} // ElementDefinitionBinding
