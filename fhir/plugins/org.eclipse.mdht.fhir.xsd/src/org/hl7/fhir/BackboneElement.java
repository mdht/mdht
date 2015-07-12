/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backbone Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base definition for all elements that are defined inside a resource - but not those in a data type.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.BackboneElement#getModifierExtension <em>Modifier Extension</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBackboneElement()
 * @model extendedMetaData="name='BackboneElement' kind='elementOnly'"
 * @generated
 */
public interface BackboneElement extends Element {
	/**
	 * Returns the value of the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Extension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier Extension</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBackboneElement_ModifierExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifierExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Extension> getModifierExtension();

} // BackboneElement
