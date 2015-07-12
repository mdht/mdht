/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Restful Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Operations supported by REST at the system level
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SystemRestfulInteraction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSystemRestfulInteraction()
 * @model extendedMetaData="name='SystemRestfulInteraction' kind='elementOnly'"
 * @generated
 */
public interface SystemRestfulInteraction extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.SystemRestfulInteractionList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.SystemRestfulInteractionList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(SystemRestfulInteractionList)
	 * @see org.hl7.fhir.FhirPackage#getSystemRestfulInteraction_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	SystemRestfulInteractionList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SystemRestfulInteraction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.SystemRestfulInteractionList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SystemRestfulInteractionList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.SystemRestfulInteraction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(SystemRestfulInteractionList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.SystemRestfulInteraction#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(SystemRestfulInteractionList)
	 * @generated
	 */
	boolean isSetValue();

} // SystemRestfulInteraction
