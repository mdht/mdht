/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource that includes narrative, extensions, and contained resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DomainResource#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.DomainResource#getContained <em>Contained</em>}</li>
 *   <li>{@link org.hl7.fhir.DomainResource#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.hl7.fhir.DomainResource#getModifierExtension <em>Modifier Extension</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDomainResource()
 * @model extendedMetaData="name='DomainResource' kind='elementOnly'"
 * @generated
 */
public interface DomainResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Narrative)
	 * @see org.hl7.fhir.FhirPackage#getDomainResource_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	Narrative getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DomainResource#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Narrative value);

	/**
	 * Returns the value of the '<em><b>Contained</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDomainResource_Contained()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contained' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResourceContainer> getContained();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Extension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDomainResource_Extension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Extension> getExtension();

	/**
	 * Returns the value of the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Extension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier Extension</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDomainResource_ModifierExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifierExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Extension> getModifierExtension();

} // DomainResource
