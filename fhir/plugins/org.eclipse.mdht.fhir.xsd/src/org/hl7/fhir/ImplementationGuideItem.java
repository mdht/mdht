/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Item</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImplementationGuideItem#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideItem#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideItem#getExample <em>Example</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImplementationGuideItem()
 * @model extendedMetaData="name='ImplementationGuide.Item' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuideItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable name that introduces the package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideItem_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideItem#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a conformance resource that is part of the implementation Guide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideItem_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideItem#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Reference value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImplementationGuideExample}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the item is a structure definition, an example that conforms to the structure definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideItem_Example()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='example' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImplementationGuideExample> getExample();

} // ImplementationGuideItem
