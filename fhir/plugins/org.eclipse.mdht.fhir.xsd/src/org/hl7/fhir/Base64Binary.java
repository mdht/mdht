/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base64 Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A stream of bytes
 * A stream of bytes, base64 encoded
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Base64Binary#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBase64Binary()
 * @model extendedMetaData="name='base64Binary' kind='elementOnly'"
 * @generated
 */
public interface Base64Binary extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte[])
	 * @see org.hl7.fhir.FhirPackage#getBase64Binary_Value()
	 * @model dataType="org.hl7.fhir.Base64BinaryPrimitive"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	byte[] getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Base64Binary#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte[] value);

} // Base64Binary
