/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SimpleQuantity#getExtension1 <em>Extension1</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSimpleQuantity()
 * @model extendedMetaData="name='SimpleQuantity' kind='elementOnly'"
 * @generated
 */
public interface SimpleQuantity extends Quantity {
	/**
	 * Returns the value of the '<em><b>Extension1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Extension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exception as inherited from Element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension1</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSimpleQuantity_Extension1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Extension> getExtension1();

} // SimpleQuantity
