/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Demographics and administrative information about a person independent of a specific health-related context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PersonLink#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.PersonLink#getAssurance <em>Assurance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPersonLink()
 * @model extendedMetaData="name='Person.Link' kind='elementOnly'"
 * @generated
 */
public interface PersonLink extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource to which this actual person is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPersonLink_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PersonLink#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Reference value);

	/**
	 * Returns the value of the '<em><b>Assurance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level of assurance that this link is actually associated with the target resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assurance</em>' containment reference.
	 * @see #setAssurance(IdentityAssuranceLevel)
	 * @see org.hl7.fhir.FhirPackage#getPersonLink_Assurance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assurance' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentityAssuranceLevel getAssurance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PersonLink#getAssurance <em>Assurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance</em>' containment reference.
	 * @see #getAssurance()
	 * @generated
	 */
	void setAssurance(IdentityAssuranceLevel value);

} // PersonLink
