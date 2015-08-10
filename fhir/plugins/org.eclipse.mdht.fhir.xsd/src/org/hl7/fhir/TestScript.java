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
 *   <li>{@link org.hl7.fhir.TestScript#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScript#getCopyright <em>Copyright</em>}</li>
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
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Url()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language name identifying the TestScript.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Name()
	 * @model containment="true" required="true"
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
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the TestScript.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getExperimental <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' containment reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the individual or organization that published the Test Script.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestScriptContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contacts to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptContact> getContact();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that this version of the TestScript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. in addition, it should change when the substantiative content of the test cases change.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language description of the TestScript and its use.
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
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of Test Scripts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScript_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getUseContext();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explains why this Test Script is needed and why it's been constrained as it has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRequirements();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScript_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScript#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(org.hl7.fhir.String value);

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
