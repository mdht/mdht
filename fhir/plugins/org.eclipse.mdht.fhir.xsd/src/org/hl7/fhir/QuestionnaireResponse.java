/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getAuthored <em>Authored</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getQuestionnaireResponse()
 * @model extendedMetaData="name='QuestionnaireResponse' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A business identifier assigned to a particular completed (or partially completed) questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireResponse_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the Questionnaire resource that defines the form for which answers are being provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire</em>' containment reference.
	 * @see #setQuestionnaire(Reference)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireResponse_Questionnaire()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='questionnaire' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getQuestionnaire();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getQuestionnaire <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' containment reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lifecycle status of the questionnaire response as a whole.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(QuestionnaireResponseStatus)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireResponse_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionnaireResponseStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(QuestionnaireResponseStatus value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireResponse_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireResponse_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Authored</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and/or time that this version of the questionnaire response was authored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authored</em>' containment reference.
	 * @see #setAuthored(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireResponse_Authored()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authored' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAuthored();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getAuthored <em>Authored</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored</em>' containment reference.
	 * @see #getAuthored()
	 * @generated
	 */
	void setAuthored(DateTime value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person who answered the questions about the subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Reference)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireResponse_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter during which this set of questionnaire response were collected. When there were multiple encounters, this is the one considered most relevant to the context of the answers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireResponse_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A group of questions to a possibly similarly grouped set of questions in the questionnaire response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(QuestionnaireResponseGroup)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireResponse_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionnaireResponseGroup getGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(QuestionnaireResponseGroup value);

} // QuestionnaireResponse
