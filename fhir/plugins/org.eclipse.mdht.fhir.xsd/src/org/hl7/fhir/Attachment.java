/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For referring to data content defined in other formats.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Attachment#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Attachment#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.Attachment#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.fhir.Attachment#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.Attachment#getSize <em>Size</em>}</li>
 *   <li>{@link org.hl7.fhir.Attachment#getHash <em>Hash</em>}</li>
 *   <li>{@link org.hl7.fhir.Attachment#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.Attachment#getCreation <em>Creation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAttachment()
 * @model extendedMetaData="name='Attachment' kind='elementOnly'"
 * @generated
 */
public interface Attachment extends Element {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data. Includes mime type parameters such as charset where appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(Code)
	 * @see org.hl7.fhir.FhirPackage#getAttachment_ContentType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Attachment#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The human language of the content. The value can be any valid value according to BCP 47.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Code)
	 * @see org.hl7.fhir.FhirPackage#getAttachment_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Attachment#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Code value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual data of the attachment - a sequence of bytes. In XML, represented using base64.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getAttachment_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Attachment#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An alternative location where the data can be accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getAttachment_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Attachment#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bytes of data that make up this attachment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getAttachment_Size()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getSize();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Attachment#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The calculated hash of the data using SHA-1. Represented using base64.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hash</em>' containment reference.
	 * @see #setHash(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getAttachment_Hash()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hash' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getHash();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Attachment#getHash <em>Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' containment reference.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A label or set of text to display in place of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAttachment_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Attachment#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Creation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the attachment was first created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation</em>' containment reference.
	 * @see #setCreation(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAttachment_Creation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='creation' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Attachment#getCreation <em>Creation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation</em>' containment reference.
	 * @see #getCreation()
	 * @generated
	 */
	void setCreation(DateTime value);

} // Attachment
