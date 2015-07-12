/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition Part</b></em>'.
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
 *   <li>{@link org.hl7.fhir.OperationDefinitionPart#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionPart#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionPart#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionPart#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionPart#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionPart#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionPart()
 * @model extendedMetaData="name='OperationDefinition.Part' kind='elementOnly'"
 * @generated
 */
public interface OperationDefinitionPart extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of used to identify the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Code)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionPart_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionPart#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Code value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum number of times this parameter SHALL appear in the request or response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionPart_Min()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getMin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionPart#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of times this element is permitted to appear in the request or response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionPart_Max()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionPart#getMax <em>Max</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionPart_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionPart#getDocumentation <em>Documentation</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionPart_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionPart#getType <em>Type</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionPart_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionPart#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Reference value);

} // OperationDefinitionPart
