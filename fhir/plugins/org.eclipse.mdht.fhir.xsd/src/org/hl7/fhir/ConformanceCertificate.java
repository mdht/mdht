/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Certificate</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ConformanceCertificate#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceCertificate#getBlob <em>Blob</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformanceCertificate()
 * @model extendedMetaData="name='Conformance.Certificate' kind='elementOnly'"
 * @generated
 */
public interface ConformanceCertificate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mime type for certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see org.hl7.fhir.FhirPackage#getConformanceCertificate_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceCertificate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Blob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blob</em>' containment reference.
	 * @see #setBlob(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getConformanceCertificate_Blob()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='blob' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getBlob();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceCertificate#getBlob <em>Blob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blob</em>' containment reference.
	 * @see #getBlob()
	 * @generated
	 */
	void setBlob(Base64Binary value);

} // ConformanceCertificate
