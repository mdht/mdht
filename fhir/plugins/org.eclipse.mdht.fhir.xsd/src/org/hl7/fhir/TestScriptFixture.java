/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Fixture</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TestScriptFixture#getAutocreate <em>Autocreate</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptFixture#getAutodelete <em>Autodelete</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptFixture#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScriptFixture()
 * @model extendedMetaData="name='TestScript.Fixture' kind='elementOnly'"
 * @generated
 */
public interface TestScriptFixture extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Autocreate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autocreate</em>' containment reference.
	 * @see #setAutocreate(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptFixture_Autocreate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='autocreate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAutocreate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptFixture#getAutocreate <em>Autocreate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autocreate</em>' containment reference.
	 * @see #getAutocreate()
	 * @generated
	 */
	void setAutocreate(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Autodelete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autodelete</em>' containment reference.
	 * @see #setAutodelete(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptFixture_Autodelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='autodelete' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAutodelete();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptFixture#getAutodelete <em>Autodelete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autodelete</em>' containment reference.
	 * @see #getAutodelete()
	 * @generated
	 */
	void setAutodelete(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the resource (containing the contents of the resource needed for operations).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptFixture_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptFixture#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Reference value);

} // TestScriptFixture
