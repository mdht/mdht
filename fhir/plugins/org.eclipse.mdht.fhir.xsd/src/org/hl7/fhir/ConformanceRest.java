/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Rest</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ConformanceRest#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getTransactionMode <em>Transaction Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getDocumentMailbox <em>Document Mailbox</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getCompartment <em>Compartment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformanceRest()
 * @model extendedMetaData="name='Conformance.Rest' kind='elementOnly'"
 * @generated
 */
public interface ConformanceRest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(RestfulConformanceMode)
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Mode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	RestfulConformanceMode getMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceRest#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(RestfulConformanceMode value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the system's restful capabilities that apply across all applications, such as security.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceRest#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about security implementation from an interface perspective - what a client needs to know.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(ConformanceSecurity)
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Security()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceSecurity getSecurity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceRest#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(ConformanceSecurity value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification of the restful capabilities of the solution for a specific resource type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Resource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceResource> getResource();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceInteraction1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification of restful operations supported by the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Interaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceInteraction1> getInteraction();

	/**
	 * Returns the value of the '<em><b>Transaction Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that indicates how transactions are supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Mode</em>' containment reference.
	 * @see #setTransactionMode(TransactionMode)
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_TransactionMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transactionMode' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionMode getTransactionMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceRest#getTransactionMode <em>Transaction Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Mode</em>' containment reference.
	 * @see #getTransactionMode()
	 * @generated
	 */
	void setTransactionMode(TransactionMode value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of an operation or a named query and with its parameters and their meaning and type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Document Mailbox</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of absolute URIs that identify profiles that this server implements for accepting documents in the mailbox. If this list is empty, then documents are not accepted. The base specification has the profile identifier "http://hl7.org/fhir/documents/mailbox". Other specifications can declare their own identifier for this purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Mailbox</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_DocumentMailbox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentMailbox' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getDocumentMailbox();

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI which is a reference to the definition of a compartment hosted by the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compartment</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Compartment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compartment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getCompartment();

} // ConformanceRest
