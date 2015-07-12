/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Vaccination Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Immunization event information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getDoseSequence <em>Dose Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getSeries <em>Series</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getSeriesDoses <em>Series Doses</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getDoseTarget <em>Dose Target</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getDoseStatus <em>Dose Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getDoseStatusReason <em>Dose Status Reason</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunizationVaccinationProtocol()
 * @model extendedMetaData="name='Immunization.VaccinationProtocol' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationVaccinationProtocol extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Dose Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nominal position in a series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Sequence</em>' containment reference.
	 * @see #setDoseSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationVaccinationProtocol_DoseSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doseSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDoseSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getDoseSequence <em>Dose Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Sequence</em>' containment reference.
	 * @see #getDoseSequence()
	 * @generated
	 */
	void setDoseSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the description about the protocol under which the vaccine was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationVaccinationProtocol_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getDescription <em>Description</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getImmunizationVaccinationProtocol_Authority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authority' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getAuthority <em>Authority</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getImmunizationVaccinationProtocol_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSeries();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Series Doses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recommended number of doses to achieve immunity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Doses</em>' containment reference.
	 * @see #setSeriesDoses(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationVaccinationProtocol_SeriesDoses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriesDoses' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSeriesDoses();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getSeriesDoses <em>Series Doses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Doses</em>' containment reference.
	 * @see #getSeriesDoses()
	 * @generated
	 */
	void setSeriesDoses(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Dose Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The targeted disease.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Target</em>' containment reference.
	 * @see #setDoseTarget(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationVaccinationProtocol_DoseTarget()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doseTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDoseTarget();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getDoseTarget <em>Dose Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Target</em>' containment reference.
	 * @see #getDoseTarget()
	 * @generated
	 */
	void setDoseTarget(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the immunization event should "count" against  the protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Status</em>' containment reference.
	 * @see #setDoseStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationVaccinationProtocol_DoseStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doseStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDoseStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getDoseStatus <em>Dose Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Status</em>' containment reference.
	 * @see #getDoseStatus()
	 * @generated
	 */
	void setDoseStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides an explanation as to why a immunization event should or should not count against the protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Status Reason</em>' containment reference.
	 * @see #setDoseStatusReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationVaccinationProtocol_DoseStatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseStatusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDoseStatusReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationVaccinationProtocol#getDoseStatusReason <em>Dose Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Status Reason</em>' containment reference.
	 * @see #getDoseStatusReason()
	 * @generated
	 */
	void setDoseStatusReason(CodeableConcept value);

} // ImmunizationVaccinationProtocol
