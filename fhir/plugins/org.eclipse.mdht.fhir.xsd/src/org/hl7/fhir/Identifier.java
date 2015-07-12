/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A technical identifier - identifies some entity uniquely and unambiguously.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Identifier#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.Identifier#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Identifier#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.Identifier#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.Identifier#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Identifier#getAssigner <em>Assigner</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getIdentifier()
 * @model extendedMetaData="name='Identifier' kind='elementOnly'"
 * @generated
 */
public interface Identifier extends Element {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose of this identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(IdentifierUse)
	 * @see org.hl7.fhir.FhirPackage#getIdentifier_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifierUse getUse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Identifier#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(IdentifierUse value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getIdentifier_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Identifier#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Establishes the namespace in which set of possible id values is unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(Uri)
	 * @see org.hl7.fhir.FhirPackage#getIdentifier_System()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Identifier#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The portion of the identifier typically displayed to the user and which is unique within the context of the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getIdentifier_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Identifier#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time period during which identifier is/was valid for use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getIdentifier_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Identifier#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Assigner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization that issued/manages the identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigner</em>' containment reference.
	 * @see #setAssigner(Reference)
	 * @see org.hl7.fhir.FhirPackage#getIdentifier_Assigner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assigner' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAssigner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Identifier#getAssigner <em>Assigner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigner</em>' containment reference.
	 * @see #getAssigner()
	 * @generated
	 */
	void setAssigner(Reference value);

} // Identifier
