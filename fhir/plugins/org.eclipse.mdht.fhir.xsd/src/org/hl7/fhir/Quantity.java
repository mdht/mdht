/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Quantity#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.Quantity#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.fhir.Quantity#getUnits <em>Units</em>}</li>
 *   <li>{@link org.hl7.fhir.Quantity#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.Quantity#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getQuantity()
 * @model extendedMetaData="name='Quantity' kind='elementOnly'"
 * @generated
 */
public interface Quantity extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the measured amount. The value includes an implicit precision in the presentation of the value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getQuantity_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Quantity#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Decimal value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues. E.g. if the comparator is "<" , then the real value is < stated value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comparator</em>' containment reference.
	 * @see #setComparator(QuantityComparator)
	 * @see org.hl7.fhir.FhirPackage#getQuantity_Comparator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comparator' namespace='##targetNamespace'"
	 * @generated
	 */
	QuantityComparator getComparator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Quantity#getComparator <em>Comparator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' containment reference.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(QuantityComparator value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable form of the units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units</em>' containment reference.
	 * @see #setUnits(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuantity_Units()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='units' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getUnits();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Quantity#getUnits <em>Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' containment reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identification of the system that provides the coded form of the unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(Uri)
	 * @see org.hl7.fhir.FhirPackage#getQuantity_System()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Quantity#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A computer processable form of the units in some unit representation system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getQuantity_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Quantity#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

} // Quantity
