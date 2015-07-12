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

import org.hl7.fhir.AnswerFormat;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.QuestionnaireGroup;
import org.hl7.fhir.QuestionnaireQuestion;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireQuestionImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireQuestionImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireQuestionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireQuestionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireQuestionImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireQuestionImpl#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireQuestionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireQuestionImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireQuestionImpl extends BackboneElementImpl implements QuestionnaireQuestion {
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
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> concept;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AnswerFormat type;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean required;

	/**
	 * The cached value of the '{@link #getRepeats() <em>Repeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeats()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean repeats;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Reference options;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireGroup> group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getQuestionnaireQuestion();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__LINK_ID, oldLinkId, newLinkId);
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
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.QUESTIONNAIRE_QUESTION__CONCEPT);
		}
		return concept;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerFormat getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AnswerFormat newType, NotificationChain msgs) {
		AnswerFormat oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AnswerFormat newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(org.hl7.fhir.Boolean newRequired, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(org.hl7.fhir.Boolean newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRepeats() {
		return repeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeats(org.hl7.fhir.Boolean newRepeats, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRepeats = repeats;
		repeats = newRepeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__REPEATS, oldRepeats, newRepeats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeats(org.hl7.fhir.Boolean newRepeats) {
		if (newRepeats != repeats) {
			NotificationChain msgs = null;
			if (repeats != null)
				msgs = ((InternalEObject)repeats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__REPEATS, null, msgs);
			if (newRepeats != null)
				msgs = ((InternalEObject)newRepeats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__REPEATS, null, msgs);
			msgs = basicSetRepeats(newRepeats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__REPEATS, newRepeats, newRepeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(Reference newOptions, NotificationChain msgs) {
		Reference oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(Reference newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_QUESTION__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_QUESTION__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<QuestionnaireGroup>(QuestionnaireGroup.class, this, FhirPackage.QUESTIONNAIRE_QUESTION__GROUP);
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
			case FhirPackage.QUESTIONNAIRE_QUESTION__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FhirPackage.QUESTIONNAIRE_QUESTION__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE_QUESTION__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.QUESTIONNAIRE_QUESTION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.QUESTIONNAIRE_QUESTION__REQUIRED:
				return basicSetRequired(null, msgs);
			case FhirPackage.QUESTIONNAIRE_QUESTION__REPEATS:
				return basicSetRepeats(null, msgs);
			case FhirPackage.QUESTIONNAIRE_QUESTION__OPTIONS:
				return basicSetOptions(null, msgs);
			case FhirPackage.QUESTIONNAIRE_QUESTION__GROUP:
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
			case FhirPackage.QUESTIONNAIRE_QUESTION__LINK_ID:
				return getLinkId();
			case FhirPackage.QUESTIONNAIRE_QUESTION__CONCEPT:
				return getConcept();
			case FhirPackage.QUESTIONNAIRE_QUESTION__TEXT:
				return getText();
			case FhirPackage.QUESTIONNAIRE_QUESTION__TYPE:
				return getType();
			case FhirPackage.QUESTIONNAIRE_QUESTION__REQUIRED:
				return getRequired();
			case FhirPackage.QUESTIONNAIRE_QUESTION__REPEATS:
				return getRepeats();
			case FhirPackage.QUESTIONNAIRE_QUESTION__OPTIONS:
				return getOptions();
			case FhirPackage.QUESTIONNAIRE_QUESTION__GROUP:
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
			case FhirPackage.QUESTIONNAIRE_QUESTION__LINK_ID:
				setLinkId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__TYPE:
				setType((AnswerFormat)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__REPEATS:
				setRepeats((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__OPTIONS:
				setOptions((Reference)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends QuestionnaireGroup>)newValue);
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
			case FhirPackage.QUESTIONNAIRE_QUESTION__LINK_ID:
				setLinkId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__CONCEPT:
				getConcept().clear();
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__TYPE:
				setType((AnswerFormat)null);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__REPEATS:
				setRepeats((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__OPTIONS:
				setOptions((Reference)null);
				return;
			case FhirPackage.QUESTIONNAIRE_QUESTION__GROUP:
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
			case FhirPackage.QUESTIONNAIRE_QUESTION__LINK_ID:
				return linkId != null;
			case FhirPackage.QUESTIONNAIRE_QUESTION__CONCEPT:
				return concept != null && !concept.isEmpty();
			case FhirPackage.QUESTIONNAIRE_QUESTION__TEXT:
				return text != null;
			case FhirPackage.QUESTIONNAIRE_QUESTION__TYPE:
				return type != null;
			case FhirPackage.QUESTIONNAIRE_QUESTION__REQUIRED:
				return required != null;
			case FhirPackage.QUESTIONNAIRE_QUESTION__REPEATS:
				return repeats != null;
			case FhirPackage.QUESTIONNAIRE_QUESTION__OPTIONS:
				return options != null;
			case FhirPackage.QUESTIONNAIRE_QUESTION__GROUP:
				return group != null && !group.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireQuestionImpl
