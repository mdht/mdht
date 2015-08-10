/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of rules or how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole, and to publish a computable definition of all the parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImplementationGuideDependency#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideDependency#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDependency()
 * @model extendedMetaData="name='ImplementationGuide.Dependency' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuideDependency extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the dependency is represented when the guide is published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(GuideDependencyType)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDependency_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	GuideDependencyType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideDependency#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(GuideDependencyType value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the dependncy is located.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDependency_Uri()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideDependency#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(Uri value);

} // ImplementationGuideDependency
