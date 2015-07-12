/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value set specifies a set of codes drawn from one or more code systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ValueSetFilter#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetFilter#getOp <em>Op</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetFilter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getValueSetFilter()
 * @model extendedMetaData="name='ValueSet.Filter' kind='elementOnly'"
 * @generated
 */
public interface ValueSetFilter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that identifies a property defined in the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(Code)
	 * @see org.hl7.fhir.FhirPackage#getValueSetFilter_Property()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getProperty();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetFilter#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Code value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of operation to perform as a part of the filter criteria.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(FilterOperator)
	 * @see org.hl7.fhir.FhirPackage#getValueSetFilter_Op()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='op' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterOperator getOp();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetFilter#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(FilterOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The match value may be either a code defined by the system, or a string value which is used a regex match on the literal string of the property value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Code)
	 * @see org.hl7.fhir.FhirPackage#getValueSetFilter_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetFilter#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Code value);

} // ValueSetFilter
