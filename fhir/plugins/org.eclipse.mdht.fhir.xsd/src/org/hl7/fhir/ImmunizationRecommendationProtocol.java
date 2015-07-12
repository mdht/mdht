/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Recommendation Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A patient's point-of-time immunization status and recommendation with optional supporting justification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationProtocol#getDoseSequence <em>Dose Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationProtocol#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationProtocol#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationProtocol#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationProtocol()
 * @model extendedMetaData="name='ImmunizationRecommendation.Protocol' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationRecommendationProtocol extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Dose Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Sequence</em>' containment reference.
	 * @see #setDoseSequence(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationProtocol_DoseSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getDoseSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationProtocol#getDoseSequence <em>Dose Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Sequence</em>' containment reference.
	 * @see #getDoseSequence()
	 * @generated
	 */
	void setDoseSequence(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the description about the protocol under which the vaccine was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationProtocol_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationProtocol#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the authority who published the protocol?  E.g. ACIP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference.
	 * @see #setAuthority(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationProtocol_Authority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authority' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationProtocol#getAuthority <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' containment reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(Reference value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One possible path to achieve presumed immunity against a disease - within the context of an authority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationProtocol_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSeries();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationProtocol#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(org.hl7.fhir.String value);

} // ImmunizationRecommendationProtocol
