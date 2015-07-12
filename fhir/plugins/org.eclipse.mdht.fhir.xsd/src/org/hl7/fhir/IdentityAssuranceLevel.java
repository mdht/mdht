/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Assurance Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The level of confidence that this link represents the same actual person, based on NIST Authentication Levels
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.IdentityAssuranceLevel#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getIdentityAssuranceLevel()
 * @model extendedMetaData="name='IdentityAssuranceLevel' kind='elementOnly'"
 * @generated
 */
public interface IdentityAssuranceLevel extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.IdentityAssuranceLevelList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.IdentityAssuranceLevelList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(IdentityAssuranceLevelList)
	 * @see org.hl7.fhir.FhirPackage#getIdentityAssuranceLevel_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	IdentityAssuranceLevelList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IdentityAssuranceLevel#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.IdentityAssuranceLevelList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(IdentityAssuranceLevelList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.IdentityAssuranceLevel#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(IdentityAssuranceLevelList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.IdentityAssuranceLevel#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(IdentityAssuranceLevelList)
	 * @generated
	 */
	boolean isSetValue();

} // IdentityAssuranceLevel
