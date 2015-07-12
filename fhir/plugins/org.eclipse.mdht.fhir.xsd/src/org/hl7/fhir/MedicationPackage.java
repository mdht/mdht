/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Primarily used for identification and definition of Medication, but also covers ingredients and packaging.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationPackage#getContainer <em>Container</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationPackage#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationPackage()
 * @model extendedMetaData="name='Medication.Package' kind='elementOnly'"
 * @generated
 */
public interface MedicationPackage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of container that this package comes as.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationPackage_Container()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getContainer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationPackage#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of components that go to make up the described item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationPackage_Content()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationContent> getContent();

} // MedicationPackage
