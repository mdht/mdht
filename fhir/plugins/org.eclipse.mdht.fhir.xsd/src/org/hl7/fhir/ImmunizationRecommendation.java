/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Recommendation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A patient's point-of-time immunization status and recommendation with optional supporting justification.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendation#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendation#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendation#getRecommendation <em>Recommendation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendation()
 * @model extendedMetaData="name='ImmunizationRecommendation' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationRecommendation extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier assigned to this particular recommendation record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendation_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient for whom the recommendations are for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendation_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendation#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Recommendation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImmunizationRecommendationRecommendation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vaccine administration recommendations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recommendation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendation_Recommendation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='recommendation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImmunizationRecommendationRecommendation> getRecommendation();

} // ImmunizationRecommendation
