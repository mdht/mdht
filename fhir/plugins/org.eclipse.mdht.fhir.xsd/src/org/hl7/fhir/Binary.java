/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A binary resource can contain any content, whether text, image, pdf, zip archive, etc.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Binary#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Binary#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBinary()
 * @model extendedMetaData="name='Binary' kind='elementOnly'"
 * @generated
 */
public interface Binary extends Resource {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MimeType of the binary content represented as a standard MimeType (BCP 13).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(Code)
	 * @see org.hl7.fhir.FhirPackage#getBinary_ContentType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Binary#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual content, base64 encoded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getBinary_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getContent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Binary#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Base64Binary value);

} // Binary
