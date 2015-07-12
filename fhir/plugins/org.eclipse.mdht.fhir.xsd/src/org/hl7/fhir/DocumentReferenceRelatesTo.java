/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference Relates To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DocumentReferenceRelatesTo#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReferenceRelatesTo#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceRelatesTo()
 * @model extendedMetaData="name='DocumentReference.RelatesTo' kind='elementOnly'"
 * @generated
 */
public interface DocumentReferenceRelatesTo extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of relationship that this document has with anther document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(DocumentRelationshipType)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceRelatesTo_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentRelationshipType getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceRelatesTo#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(DocumentRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target document of this relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceRelatesTo_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceRelatesTo#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Reference value);

} // DocumentReferenceRelatesTo
