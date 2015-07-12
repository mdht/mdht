/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Slicing</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ElementDefinitionSlicing#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionSlicing#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionSlicing#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionSlicing#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getElementDefinitionSlicing()
 * @model extendedMetaData="name='ElementDefinition.Slicing' kind='elementOnly'"
 * @generated
 */
public interface ElementDefinitionSlicing extends Element {
	/**
	 * Returns the value of the '<em><b>Discriminator</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discriminator</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionSlicing_Discriminator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='discriminator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getDiscriminator();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionSlicing_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionSlicing#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the matching elements have to occur in the same order as defined in the profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered</em>' containment reference.
	 * @see #setOrdered(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionSlicing_Ordered()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ordered' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getOrdered();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionSlicing#getOrdered <em>Ordered</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' containment reference.
	 * @see #getOrdered()
	 * @generated
	 */
	void setOrdered(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference.
	 * @see #setRules(SlicingRules)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionSlicing_Rules()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rules' namespace='##targetNamespace'"
	 * @generated
	 */
	SlicingRules getRules();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionSlicing#getRules <em>Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' containment reference.
	 * @see #getRules()
	 * @generated
	 */
	void setRules(SlicingRules value);

} // ElementDefinitionSlicing
