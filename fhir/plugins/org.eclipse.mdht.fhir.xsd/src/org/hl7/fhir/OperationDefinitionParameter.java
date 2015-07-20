/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.OperationDefinitionParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionParameter#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionParameter#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionParameter#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionParameter#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionParameter#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionParameter#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionParameter#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionParameter()
 * @model extendedMetaData="name='OperationDefinition.Parameter' kind='elementOnly'"
 * @generated
 */
public interface OperationDefinitionParameter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of used to identify the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Code)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionParameter_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionParameter#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Code value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this is an input or an output parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(OperationParameterUse)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionParameter_Use()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationParameterUse getUse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionParameter#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(OperationParameterUse value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum number of times this parameter SHALL appear in the request or response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionParameter_Min()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionParameter#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of times this element is permitted to appear in the request or response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionParameter_Max()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionParameter#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the meaning or use of this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionParameter_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionParameter#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type for this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionParameter_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionParameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A profile the specifies the rules that this parameter must conform to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Reference)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionParameter_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionParameter#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Reference value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(OperationDefinitionBinding)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionParameter_Binding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationDefinitionBinding getBinding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionParameter#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(OperationDefinitionBinding value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.OperationDefinitionParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parts of a Tuple Parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionParameter_Part()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OperationDefinitionParameter> getPart();

} // OperationDefinitionParameter
