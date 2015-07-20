/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestScriptVariable#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptVariable#getHeaderField <em>Header Field</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptVariable#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptVariable#getSourceId <em>Source Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScriptVariable()
 * @model extendedMetaData="name='TestScript.Variable' kind='elementOnly'"
 * @generated
 */
public interface TestScriptVariable extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Variable name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptVariable_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptVariable#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Header Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will be used to grab the header field value from the headers that sourceId is pointing to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Field</em>' containment reference.
	 * @see #setHeaderField(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptVariable_HeaderField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='headerField' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getHeaderField();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptVariable#getHeaderField <em>Header Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Field</em>' containment reference.
	 * @see #getHeaderField()
	 * @generated
	 */
	void setHeaderField(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptVariable_Path()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPath();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptVariable#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Id</em>' containment reference.
	 * @see #setSourceId(Id)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptVariable_SourceId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getSourceId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptVariable#getSourceId <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' containment reference.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(Id value);

} // TestScriptVariable
