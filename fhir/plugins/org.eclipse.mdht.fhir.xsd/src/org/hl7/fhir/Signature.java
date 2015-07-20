/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A digital signature along with supporting context. The signature may be electronic/cryptographic in nature, or a graphical image representing a hand-written signature, or a signature process. Different Signature approaches have different utilities.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Signature#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhen <em>When</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoUri <em>Who Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoReference <em>Who Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getBlob <em>Blob</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSignature()
 * @model extendedMetaData="name='Signature' kind='elementOnly'"
 * @generated
 */
public interface Signature extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSignature_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getType();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the digital signature was signed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(Instant)
	 * @see org.hl7.fhir.FhirPackage#getSignature_When()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getWhen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Instant value);

	/**
	 * Returns the value of the '<em><b>Who Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Uri</em>' containment reference.
	 * @see #setWhoUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getWhoUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoUri <em>Who Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Uri</em>' containment reference.
	 * @see #getWhoUri()
	 * @generated
	 */
	void setWhoUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Who Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Reference</em>' containment reference.
	 * @see #setWhoReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWhoReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoReference <em>Who Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Reference</em>' containment reference.
	 * @see #getWhoReference()
	 * @generated
	 */
	void setWhoReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jwt for JWT, and image/* for a graphical image of a signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(Code)
	 * @see org.hl7.fhir.FhirPackage#getSignature_ContentType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Blob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base64 encoding of the Signature content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blob</em>' containment reference.
	 * @see #setBlob(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getSignature_Blob()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='blob' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getBlob();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getBlob <em>Blob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blob</em>' containment reference.
	 * @see #getBlob()
	 * @generated
	 */
	void setBlob(Base64Binary value);

} // Signature
