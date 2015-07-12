/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Details for All kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ContactPoint#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.ContactPoint#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.ContactPoint#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.ContactPoint#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContactPoint()
 * @model extendedMetaData="name='ContactPoint' kind='elementOnly'"
 * @generated
 */
public interface ContactPoint extends Element {
	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telecommunications form for contact point - what communications system is required to make use of the contact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(ContactPointSystem)
	 * @see org.hl7.fhir.FhirPackage#getContactPoint_System()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPointSystem getSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContactPoint#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(ContactPointSystem value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getContactPoint_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContactPoint#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the purpose for the contact point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(ContactPointUse)
	 * @see org.hl7.fhir.FhirPackage#getContactPoint_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPointUse getUse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContactPoint#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(ContactPointUse value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time period when the contact point was/is in use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getContactPoint_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContactPoint#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // ContactPoint
