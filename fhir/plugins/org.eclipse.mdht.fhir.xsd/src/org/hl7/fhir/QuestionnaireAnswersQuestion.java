/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Answers Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.QuestionnaireAnswersQuestion#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireAnswersQuestion#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireAnswersQuestion#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireAnswersQuestion#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersQuestion()
 * @model extendedMetaData="name='QuestionnaireAnswers.Question' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireAnswersQuestion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireAnswers resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersQuestion_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireAnswersQuestion#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual question as shown to the user to prompt them for an answer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersQuestion_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireAnswersQuestion#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireAnswersAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The respondent's answer(s) to the question.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersQuestion_Answer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireAnswersAnswer> getAnswer();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireAnswersGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested group, containing nested question for this question. The order of groups within the question is relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersQuestion_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireAnswersGroup> getGroup();

} // QuestionnaireAnswersQuestion
