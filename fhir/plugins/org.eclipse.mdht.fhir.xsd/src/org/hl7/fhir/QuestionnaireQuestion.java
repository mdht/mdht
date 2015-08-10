/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.QuestionnaireQuestion#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireQuestion#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireQuestion#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireQuestion#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireQuestion#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireQuestion#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireQuestion#getOptions <em>Options</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireQuestion#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getQuestionnaireQuestion()
 * @model extendedMetaData="name='Questionnaire.Question' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireQuestion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireQuestion_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireQuestion#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a how this question is known in a particular terminology such as LOINC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireQuestion_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getConcept();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual question as shown to the user to prompt them for an answer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireQuestion_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireQuestion#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AnswerFormat)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireQuestion_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	AnswerFormat getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireQuestion#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AnswerFormat value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireQuestion_Required()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='required' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRequired();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireQuestion#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Repeats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the question may have more than one answer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeats</em>' containment reference.
	 * @see #setRepeats(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireQuestion_Repeats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeats' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRepeats();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireQuestion#getRepeats <em>Repeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeats</em>' containment reference.
	 * @see #getRepeats()
	 * @generated
	 */
	void setRepeats(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a valueset containing the a list of codes representing permitted answers for the question.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Reference)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireQuestion_Options()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='options' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOptions();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireQuestion#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Reference value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested group, containing nested question for this question. The order of groups within the question is relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireQuestion_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireGroup> getGroup();

} // QuestionnaireQuestion
