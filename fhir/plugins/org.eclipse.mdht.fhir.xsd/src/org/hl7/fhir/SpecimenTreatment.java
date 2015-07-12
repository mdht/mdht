/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Treatment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sample for analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SpecimenTreatment#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenTreatment#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenTreatment#getAdditive <em>Additive</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimenTreatment()
 * @model extendedMetaData="name='Specimen.Treatment' kind='elementOnly'"
 * @generated
 */
public interface SpecimenTreatment extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual description of procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenTreatment_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenTreatment#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded value specifying the procedure used to process the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenTreatment_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenTreatment#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additive</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material used in the processing step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additive</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimenTreatment_Additive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additive' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAdditive();

} // SpecimenTreatment
