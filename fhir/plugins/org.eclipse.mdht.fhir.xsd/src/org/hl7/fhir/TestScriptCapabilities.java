/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Capabilities</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TestScriptCapabilities#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptCapabilities#getValidated <em>Validated</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptCapabilities#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptCapabilities#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptCapabilities#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptCapabilities#getConformance <em>Conformance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScriptCapabilities()
 * @model extendedMetaData="name='TestScript.Capabilities' kind='elementOnly'"
 * @generated
 */
public interface TestScriptCapabilities extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The capabilities required of the server in order for this test script to execute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptCapabilities_Required()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='required' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRequired();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptCapabilities#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Validated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the capabilities are primarily getting validated by this test script.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validated</em>' containment reference.
	 * @see #setValidated(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptCapabilities_Validated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validated' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getValidated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptCapabilities#getValidated <em>Validated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated</em>' containment reference.
	 * @see #getValidated()
	 * @generated
	 */
	void setValidated(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the capabilities that this test script is requiring the server to support.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptCapabilities_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptCapabilities#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which server these requirements apply to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptCapabilities_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getDestination();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptCapabilities#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScriptCapabilities_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getLink();

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference.
	 * @see #setConformance(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptCapabilities_Conformance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='conformance' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getConformance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptCapabilities#getConformance <em>Conformance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' containment reference.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(Reference value);

} // TestScriptCapabilities
