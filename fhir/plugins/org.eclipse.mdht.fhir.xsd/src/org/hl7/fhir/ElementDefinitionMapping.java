/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Captures constraints on each element within the resource, profile, or extension.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ElementDefinitionMapping#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionMapping#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionMapping#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getElementDefinitionMapping()
 * @model extendedMetaData="name='ElementDefinition.Mapping' kind='elementOnly'"
 * @generated
 */
public interface ElementDefinitionMapping extends Element {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internal reference to the definition of a mapping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity</em>' containment reference.
	 * @see #setIdentity(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionMapping_Identity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identity' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getIdentity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionMapping#getIdentity <em>Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' containment reference.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(Id value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the computable language in which mapping.map is expressed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionMapping_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionMapping#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Code value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expresses what part of the target specification corresponds to this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionMapping_Map()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionMapping#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(org.hl7.fhir.String value);

} // ElementDefinitionMapping
