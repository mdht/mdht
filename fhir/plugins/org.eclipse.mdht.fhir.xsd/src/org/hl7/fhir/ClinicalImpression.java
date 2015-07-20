/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Impression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getProblem <em>Problem</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getTriggerCodeableConcept <em>Trigger Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getTriggerReference <em>Trigger Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getInvestigations <em>Investigations</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getFinding <em>Finding</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getResolved <em>Resolved</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getRuledOut <em>Ruled Out</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPrognosis <em>Prognosis</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPlan <em>Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClinicalImpression()
 * @model extendedMetaData="name='ClinicalImpression' kind='elementOnly'"
 * @generated
 */
public interface ClinicalImpression extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient being assessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Assessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinician performing the assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessor</em>' containment reference.
	 * @see #setAssessor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Assessor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assessor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAssessor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getAssessor <em>Assessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessor</em>' containment reference.
	 * @see #getAssessor()
	 * @generated
	 */
	void setAssessor(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the workflow status of the assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ClinicalImpressionStatus)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalImpressionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ClinicalImpressionStatus value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point in time at which the assessment was concluded (not when it was recorded).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous</em>' containment reference.
	 * @see #setPrevious(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Previous()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='previous' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrevious();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getPrevious <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' containment reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Reference value);

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This a list of the general problems/conditions for a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Problem</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Problem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='problem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getProblem();

	/**
	 * Returns the value of the '<em><b>Trigger Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Codeable Concept</em>' containment reference.
	 * @see #setTriggerCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_TriggerCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='triggerCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTriggerCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getTriggerCodeableConcept <em>Trigger Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Codeable Concept</em>' containment reference.
	 * @see #getTriggerCodeableConcept()
	 * @generated
	 */
	void setTriggerCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Trigger Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Reference</em>' containment reference.
	 * @see #setTriggerReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_TriggerReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='triggerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTriggerReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getTriggerReference <em>Trigger Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Reference</em>' containment reference.
	 * @see #getTriggerReference()
	 * @generated
	 */
	void setTriggerReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Investigations</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClinicalImpressionInvestigations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more sets of investigations (signs, symptions, etc). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Investigations</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Investigations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='investigations' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClinicalImpressionInvestigations> getInvestigations();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(Uri)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Protocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getProtocol();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Uri value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text summary of the investigations and the diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' containment reference.
	 * @see #setSummary(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Summary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='summary' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSummary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getSummary <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' containment reference.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Finding</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClinicalImpressionFinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finding</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Finding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='finding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClinicalImpressionFinding> getFinding();

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagnoses/conditions resolved since the last assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolved</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Resolved()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolved' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getResolved();

	/**
	 * Returns the value of the '<em><b>Ruled Out</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClinicalImpressionRuledOut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagnosis considered not possible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruled Out</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_RuledOut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruledOut' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClinicalImpressionRuledOut> getRuledOut();

	/**
	 * Returns the value of the '<em><b>Prognosis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimate of likely outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prognosis</em>' containment reference.
	 * @see #setPrognosis(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Prognosis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prognosis' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPrognosis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getPrognosis <em>Prognosis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prognosis</em>' containment reference.
	 * @see #getPrognosis()
	 * @generated
	 */
	void setPrognosis(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan of action after assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Plan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plan' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPlan();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions taken during assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAction();

} // ClinicalImpression
