/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestScript#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getMultiserver <em>Multiserver</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getFixture <em>Fixture</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getSetup <em>Setup</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getTest <em>Test</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getTeardown <em>Teardown</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScript()
 * @model extendedMetaData="name='TestScript' kind='elementOnly'"
 * @generated
 */
public interface TestScript extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the Test Script.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the Test Script.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required capability must exist and is assumed to function correctly on the FHIR server being tested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(TestScriptMetadata)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Metadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScriptMetadata getMetadata();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(TestScriptMetadata value);

	/**
	 * Returns the value of the '<em><b>Multiserver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiserver</em>' containment reference.
	 * @see #setMultiserver(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Multiserver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='multiserver' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getMultiserver();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getMultiserver <em>Multiserver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiserver</em>' containment reference.
	 * @see #getMultiserver()
	 * @generated
	 */
	void setMultiserver(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Fixture</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestScriptFixture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixture</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Fixture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixture' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptFixture> getFixture();

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the profile to be used for validation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getProfile();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestScriptVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Variable is set based either on element value in response body or on header field value in the response headers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptVariable> getVariable();

	/**
	 * Returns the value of the '<em><b>Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A series of required setup operations before tests are executed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setup</em>' containment reference.
	 * @see #setSetup(TestScriptSetup)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Setup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='setup' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScriptSetup getSetup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getSetup <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setup</em>' containment reference.
	 * @see #getSetup()
	 * @generated
	 */
	void setSetup(TestScriptSetup value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestScriptTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A test in this script.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Test()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='test' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptTest> getTest();

	/**
	 * Returns the value of the '<em><b>Teardown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A series of operations required to clean up after the all the tests are executed (successfully or otherwise).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Teardown</em>' containment reference.
	 * @see #setTeardown(TestScriptTeardown)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Teardown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='teardown' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScriptTeardown getTeardown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getTeardown <em>Teardown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teardown</em>' containment reference.
	 * @see #getTeardown()
	 * @generated
	 */
	void setTeardown(TestScriptTeardown value);

} // TestScript
