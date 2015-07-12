/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.QuestionnaireAnswersAnswer;
import org.hl7.fhir.QuestionnaireAnswersGroup;
import org.hl7.fhir.QuestionnaireAnswersQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Answers Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersQuestionImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersQuestionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersQuestionImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersQuestionImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireAnswersQuestionImpl extends BackboneElementImpl implements QuestionnaireAnswersQuestion {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String linkId;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * The cached value of the '{@link #getAnswer() <em>Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireAnswersAnswer> answer;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireAnswersGroup> group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireAnswersQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getQuestionnaireAnswersQuestion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(org.hl7.fhir.String newLinkId, NotificationChain msgs) {
		org.hl7.fhir.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__LINK_ID, oldLinkId, newLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(org.hl7.fhir.String newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireAnswersAnswer> getAnswer() {
		if (answer == null) {
			answer = new EObjectContainmentEList<QuestionnaireAnswersAnswer>(QuestionnaireAnswersAnswer.class, this, FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__ANSWER);
		}
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireAnswersGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<QuestionnaireAnswersGroup>(QuestionnaireAnswersGroup.class, this, FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__ANSWER:
				return ((InternalEList<?>)getAnswer()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__LINK_ID:
				return getLinkId();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__TEXT:
				return getText();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__ANSWER:
				return getAnswer();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__GROUP:
				return getGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__LINK_ID:
				setLinkId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__ANSWER:
				getAnswer().clear();
				getAnswer().addAll((Collection<? extends QuestionnaireAnswersAnswer>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends QuestionnaireAnswersGroup>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__LINK_ID:
				setLinkId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__ANSWER:
				getAnswer().clear();
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__GROUP:
				getGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__LINK_ID:
				return linkId != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__TEXT:
				return text != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__ANSWER:
				return answer != null && !answer.isEmpty();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION__GROUP:
				return group != null && !group.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireAnswersQuestionImpl
