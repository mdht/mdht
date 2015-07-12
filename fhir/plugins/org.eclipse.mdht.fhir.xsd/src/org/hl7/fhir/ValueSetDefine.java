/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Define</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ValueSetDefine#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetDefine#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetDefine#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetDefine#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getValueSetDefine()
 * @model extendedMetaData="name='ValueSet.Define' kind='elementOnly'"
 * @generated
 */
public interface ValueSetDefine extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(Uri)
	 * @see org.hl7.fhir.FhirPackage#getValueSetDefine_System()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetDefine#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSetDefine_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetDefine#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If code comparison is case sensitive when codes within this system are compared to each other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' containment reference.
	 * @see #setCaseSensitive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getValueSetDefine_CaseSensitive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caseSensitive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getCaseSensitive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetDefine#getCaseSensitive <em>Case Sensitive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' containment reference.
	 * @see #getCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concepts in the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetDefine_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetConcept> getConcept();

} // ValueSetDefine
