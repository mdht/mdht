/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Answers Group</b></em>'.
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
 *   <li>{@link org.hl7.fhir.QuestionnaireAnswersGroup#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireAnswersGroup#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireAnswersGroup#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireAnswersGroup#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireAnswersGroup#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireAnswersGroup#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersGroup()
 * @model extendedMetaData="name='QuestionnaireAnswers.Group' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireAnswersGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireAnswers resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersGroup_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireAnswersGroup#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text that is displayed above the contents of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersGroup_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireAnswersGroup#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional text for the group, used for display purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersGroup_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireAnswersGroup#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * More specific subject this section's answers are about, details the subject given in QuestionnaireAnswers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersGroup_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireAnswersGroup#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireAnswersGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sub-group within a group. The ordering of groups within this group is relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersGroup_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireAnswersGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireAnswersQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of questions within this group. The order of questions within the group is relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Question</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswersGroup_Question()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='question' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireAnswersQuestion> getQuestion();

} // QuestionnaireAnswersGroup
