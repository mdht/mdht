/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Product</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicationProduct#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationProduct#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationProduct#getBatch <em>Batch</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationProduct()
 * @model extendedMetaData="name='Medication.Product' kind='elementOnly'"
 * @generated
 */
public interface MedicationProduct extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the form of the item.  Powder; tables; carton.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationProduct_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationProduct#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationIngredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a particular constituent of interest in the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationProduct_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationIngredient> getIngredient();

	/**
	 * Returns the value of the '<em><b>Batch</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationBatch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a group of medication produced or packaged from one production run.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationProduct_Batch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='batch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationBatch> getBatch();

} // MedicationProduct
