/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Reaction</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImmunizationReaction#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationReaction#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationReaction#getReported <em>Reported</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunizationReaction()
 * @model extendedMetaData="name='Immunization.Reaction' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationReaction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of reaction to the immunization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationReaction_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationReaction#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of the reaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationReaction_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationReaction#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(Reference value);

	/**
	 * Returns the value of the '<em><b>Reported</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Self-reported indicator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reported</em>' containment reference.
	 * @see #setReported(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationReaction_Reported()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reported' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getReported();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationReaction#getReported <em>Reported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reported</em>' containment reference.
	 * @see #getReported()
	 * @generated
	 */
	void setReported(org.hl7.fhir.Boolean value);

} // ImmunizationReaction
