/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A human's name with the ability to identify parts and usage.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.HumanName#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.HumanName#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.HumanName#getFamily <em>Family</em>}</li>
 *   <li>{@link org.hl7.fhir.HumanName#getGiven <em>Given</em>}</li>
 *   <li>{@link org.hl7.fhir.HumanName#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.hl7.fhir.HumanName#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.hl7.fhir.HumanName#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getHumanName()
 * @model extendedMetaData="name='HumanName' kind='elementOnly'"
 * @generated
 */
public interface HumanName extends Element {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the purpose for this name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(NameUse)
	 * @see org.hl7.fhir.FhirPackage#getHumanName_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	NameUse getUse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HumanName#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(NameUse value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A full text representation of the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getHumanName_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HumanName#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHumanName_Family()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='family' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getFamily();

	/**
	 * Returns the value of the '<em><b>Given</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Given</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHumanName_Given()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='given' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getGiven();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHumanName_Prefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prefix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getPrefix();

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suffix</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHumanName_Suffix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='suffix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getSuffix();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the period of time when this name was valid for the named person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getHumanName_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HumanName#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // HumanName
