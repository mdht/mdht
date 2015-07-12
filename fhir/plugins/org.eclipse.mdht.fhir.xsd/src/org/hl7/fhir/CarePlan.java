/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient for a period of time, possibly limited to care for a specific condition or set of conditions.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CarePlan#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getModified <em>Modified</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getConcern <em>Concern</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getSupport <em>Support</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlan#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCarePlan()
 * @model extendedMetaData="name='CarePlan' kind='elementOnly'"
 * @generated
 */
public interface CarePlan extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this care plan that are defined by business processed and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Identifier()
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
	 * Identifies the patient/subject whose intended care is described by the plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlan#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the plan is currently being acted upon, represents future intentions or is now just historical record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CarePlanStatus)
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CarePlanStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlan#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CarePlanStatus value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when the plan did (or is intended to) come into effect and end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlan#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the individual(s) or ogranization who is responsible for the content of the care plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAuthor();

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the most recent date on which the plan has been revised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modified</em>' containment reference.
	 * @see #setModified(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Modified()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modified' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getModified();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlan#getModified <em>Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' containment reference.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(DateTime value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies what "kind" of plan this is to support differentiation between multiple co-existing plans.  E.g. "Home health", "psychiatric", "asthma", "disease management", etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Concern</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concern</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Concern()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concern' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getConcern();

	/**
	 * Returns the value of the '<em><b>Support</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Support()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='support' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupport();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CarePlanParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CarePlanParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the intended objective(s) of carrying out the Care Plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Goal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='goal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getGoal();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CarePlanActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CarePlanActivity> getActivity();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General notes about the care plan not covered elsewhere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCarePlan_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNotes();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlan#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(org.hl7.fhir.String value);

} // CarePlan
