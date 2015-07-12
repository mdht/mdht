/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Security</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ConformanceSecurity#getCors <em>Cors</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceSecurity#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceSecurity#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceSecurity#getCertificate <em>Certificate</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformanceSecurity()
 * @model extendedMetaData="name='Conformance.Security' kind='elementOnly'"
 * @generated
 */
public interface ConformanceSecurity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Cors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Server adds CORS headers when responding to requests - this enables javascript applications to use the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cors</em>' containment reference.
	 * @see #setCors(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConformanceSecurity_Cors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cors' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getCors();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceSecurity#getCors <em>Cors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cors</em>' containment reference.
	 * @see #getCors()
	 * @generated
	 */
	void setCors(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Types of security services are supported/required by the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceSecurity_Service()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getService();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General description of how security works.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformanceSecurity_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceSecurity#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceCertificate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certificates associated with security profiles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceSecurity_Certificate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='certificate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceCertificate> getCertificate();

} // ConformanceSecurity
