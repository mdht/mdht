/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Contains</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ValueSetContains#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetContains#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetContains#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetContains#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetContains#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetContains#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getValueSetContains()
 * @model extendedMetaData="name='ValueSet.Contains' kind='elementOnly'"
 * @generated
 */
public interface ValueSetContains extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI which is the code system in which the code for this item in the expansion is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(Uri)
	 * @see org.hl7.fhir.FhirPackage#getValueSetContains_System()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetContains#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getValueSetContains_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAbstract();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetContains#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSetContains_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetContains#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code - if blank, this is not a choosable code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getValueSetContains_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetContains#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User display for the concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSetContains_Display()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetContains#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetContains}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes contained in this concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetContains_Contains()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contains' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetContains> getContains();

} // ValueSetContains
