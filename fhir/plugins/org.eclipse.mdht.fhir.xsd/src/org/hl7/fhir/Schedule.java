/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for slot(s) of time that may be available for booking appointments.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Schedule#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Schedule#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Schedule#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.Schedule#getPlanningHorizon <em>Planning Horizon</em>}</li>
 *   <li>{@link org.hl7.fhir.Schedule#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSchedule()
 * @model extendedMetaData="name='Schedule' kind='elementOnly'"
 * @generated
 */
public interface Schedule extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External Ids for this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSchedule_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The schedule type can be used for the categorization of healthcare services or other appointment types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSchedule_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource this Schedule resource is providing availability information for. These are expected to usually be one of HealthcareService, Location, Practitioner, Device, Patient or RelatedPerson.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference.
	 * @see #setActor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSchedule_Actor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getActor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Schedule#getActor <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' containment reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Reference value);

	/**
	 * Returns the value of the '<em><b>Planning Horizon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period of time that the slots that are attached to this Schedule resource cover (even if none exist). These  cover the amount of time that an organization's planning horizon; the interval for which they are currently accepting appointments. This does not define a "template" for planning outside these dates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planning Horizon</em>' containment reference.
	 * @see #setPlanningHorizon(Period)
	 * @see org.hl7.fhir.FhirPackage#getSchedule_PlanningHorizon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='planningHorizon' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPlanningHorizon();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Schedule#getPlanningHorizon <em>Planning Horizon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Horizon</em>' containment reference.
	 * @see #getPlanningHorizon()
	 * @generated
	 */
	void setPlanningHorizon(Period value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments on the availability to describe any extended information. Such as custom constraints on the slot(s) that may be associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSchedule_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Schedule#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.fhir.String value);

} // Schedule
