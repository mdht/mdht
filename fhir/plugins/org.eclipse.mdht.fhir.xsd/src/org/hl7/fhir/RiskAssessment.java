/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getPrediction <em>Prediction</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getMitigation <em>Mitigation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRiskAssessment()
 * @model extendedMetaData="name='RiskAssessment' kind='elementOnly'"
 * @generated
 */
public interface RiskAssessment extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient or group the risk assessment applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessment_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date (and possibly time) the risk assessment was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessment_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For assessments or prognosis specific to a particular condition, indicates the condition being assessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Reference)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessment_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider or software application that performed the assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessment_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier assigned to the risk assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessment_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The algorithm, processs or mechanism used to evaluate the risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessment_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Basis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessment_Basis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasis();

	/**
	 * Returns the value of the '<em><b>Prediction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RiskAssessmentPrediction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the expected outcome for the subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prediction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessment_Prediction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prediction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RiskAssessmentPrediction> getPrediction();

	/**
	 * Returns the value of the '<em><b>Mitigation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the steps that might be taken to reduce the identified risk(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitigation</em>' containment reference.
	 * @see #setMitigation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getRiskAssessment_Mitigation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mitigation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMitigation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getMitigation <em>Mitigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitigation</em>' containment reference.
	 * @see #getMitigation()
	 * @generated
	 */
	void setMitigation(org.hl7.fhir.String value);

} // RiskAssessment
