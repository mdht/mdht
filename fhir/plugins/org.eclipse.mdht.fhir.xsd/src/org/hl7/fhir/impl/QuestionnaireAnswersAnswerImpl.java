/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuestionnaireAnswersAnswer;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Time;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Answers Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueDecimal <em>Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueInstant <em>Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueUri <em>Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueCoding <em>Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireAnswersAnswerImpl#getValueReference <em>Value Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireAnswersAnswerImpl extends BackboneElementImpl implements QuestionnaireAnswersAnswer {
	/**
	 * The cached value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean valueBoolean;

	/**
	 * The cached value of the '{@link #getValueDecimal() <em>Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal valueDecimal;

	/**
	 * The cached value of the '{@link #getValueInteger() <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer valueInteger;

	/**
	 * The cached value of the '{@link #getValueDate() <em>Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDate()
	 * @generated
	 * @ordered
	 */
	protected Date valueDate;

	/**
	 * The cached value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime valueDateTime;

	/**
	 * The cached value of the '{@link #getValueInstant() <em>Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant valueInstant;

	/**
	 * The cached value of the '{@link #getValueTime() <em>Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTime()
	 * @generated
	 * @ordered
	 */
	protected Time valueTime;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String valueString;

	/**
	 * The cached value of the '{@link #getValueUri() <em>Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUri()
	 * @generated
	 * @ordered
	 */
	protected Uri valueUri;

	/**
	 * The cached value of the '{@link #getValueAttachment() <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment valueAttachment;

	/**
	 * The cached value of the '{@link #getValueCoding() <em>Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding valueCoding;

	/**
	 * The cached value of the '{@link #getValueQuantity() <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity valueQuantity;

	/**
	 * The cached value of the '{@link #getValueReference() <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueReference()
	 * @generated
	 * @ordered
	 */
	protected Reference valueReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireAnswersAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getQuestionnaireAnswersAnswer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getValueBoolean() {
		return valueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBoolean(org.hl7.fhir.Boolean newValueBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldValueBoolean = valueBoolean;
		valueBoolean = newValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_BOOLEAN, oldValueBoolean, newValueBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBoolean(org.hl7.fhir.Boolean newValueBoolean) {
		if (newValueBoolean != valueBoolean) {
			NotificationChain msgs = null;
			if (valueBoolean != null)
				msgs = ((InternalEObject)valueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_BOOLEAN, null, msgs);
			if (newValueBoolean != null)
				msgs = ((InternalEObject)newValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_BOOLEAN, null, msgs);
			msgs = basicSetValueBoolean(newValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_BOOLEAN, newValueBoolean, newValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getValueDecimal() {
		return valueDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDecimal(Decimal newValueDecimal, NotificationChain msgs) {
		Decimal oldValueDecimal = valueDecimal;
		valueDecimal = newValueDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DECIMAL, oldValueDecimal, newValueDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDecimal(Decimal newValueDecimal) {
		if (newValueDecimal != valueDecimal) {
			NotificationChain msgs = null;
			if (valueDecimal != null)
				msgs = ((InternalEObject)valueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DECIMAL, null, msgs);
			if (newValueDecimal != null)
				msgs = ((InternalEObject)newValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DECIMAL, null, msgs);
			msgs = basicSetValueDecimal(newValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DECIMAL, newValueDecimal, newValueDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getValueInteger() {
		return valueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueInteger(org.hl7.fhir.Integer newValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldValueInteger = valueInteger;
		valueInteger = newValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INTEGER, oldValueInteger, newValueInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueInteger(org.hl7.fhir.Integer newValueInteger) {
		if (newValueInteger != valueInteger) {
			NotificationChain msgs = null;
			if (valueInteger != null)
				msgs = ((InternalEObject)valueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INTEGER, null, msgs);
			if (newValueInteger != null)
				msgs = ((InternalEObject)newValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INTEGER, null, msgs);
			msgs = basicSetValueInteger(newValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INTEGER, newValueInteger, newValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValueDate() {
		return valueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDate(Date newValueDate, NotificationChain msgs) {
		Date oldValueDate = valueDate;
		valueDate = newValueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE, oldValueDate, newValueDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDate(Date newValueDate) {
		if (newValueDate != valueDate) {
			NotificationChain msgs = null;
			if (valueDate != null)
				msgs = ((InternalEObject)valueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE, null, msgs);
			if (newValueDate != null)
				msgs = ((InternalEObject)newValueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE, null, msgs);
			msgs = basicSetValueDate(newValueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE, newValueDate, newValueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getValueDateTime() {
		return valueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDateTime(DateTime newValueDateTime, NotificationChain msgs) {
		DateTime oldValueDateTime = valueDateTime;
		valueDateTime = newValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE_TIME, oldValueDateTime, newValueDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDateTime(DateTime newValueDateTime) {
		if (newValueDateTime != valueDateTime) {
			NotificationChain msgs = null;
			if (valueDateTime != null)
				msgs = ((InternalEObject)valueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE_TIME, null, msgs);
			if (newValueDateTime != null)
				msgs = ((InternalEObject)newValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE_TIME, null, msgs);
			msgs = basicSetValueDateTime(newValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE_TIME, newValueDateTime, newValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getValueInstant() {
		return valueInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueInstant(Instant newValueInstant, NotificationChain msgs) {
		Instant oldValueInstant = valueInstant;
		valueInstant = newValueInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INSTANT, oldValueInstant, newValueInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueInstant(Instant newValueInstant) {
		if (newValueInstant != valueInstant) {
			NotificationChain msgs = null;
			if (valueInstant != null)
				msgs = ((InternalEObject)valueInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INSTANT, null, msgs);
			if (newValueInstant != null)
				msgs = ((InternalEObject)newValueInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INSTANT, null, msgs);
			msgs = basicSetValueInstant(newValueInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INSTANT, newValueInstant, newValueInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getValueTime() {
		return valueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueTime(Time newValueTime, NotificationChain msgs) {
		Time oldValueTime = valueTime;
		valueTime = newValueTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_TIME, oldValueTime, newValueTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueTime(Time newValueTime) {
		if (newValueTime != valueTime) {
			NotificationChain msgs = null;
			if (valueTime != null)
				msgs = ((InternalEObject)valueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_TIME, null, msgs);
			if (newValueTime != null)
				msgs = ((InternalEObject)newValueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_TIME, null, msgs);
			msgs = basicSetValueTime(newValueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_TIME, newValueTime, newValueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueString(org.hl7.fhir.String newValueString, NotificationChain msgs) {
		org.hl7.fhir.String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_STRING, oldValueString, newValueString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueString(org.hl7.fhir.String newValueString) {
		if (newValueString != valueString) {
			NotificationChain msgs = null;
			if (valueString != null)
				msgs = ((InternalEObject)valueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_STRING, null, msgs);
			if (newValueString != null)
				msgs = ((InternalEObject)newValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_STRING, null, msgs);
			msgs = basicSetValueString(newValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_STRING, newValueString, newValueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getValueUri() {
		return valueUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueUri(Uri newValueUri, NotificationChain msgs) {
		Uri oldValueUri = valueUri;
		valueUri = newValueUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_URI, oldValueUri, newValueUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueUri(Uri newValueUri) {
		if (newValueUri != valueUri) {
			NotificationChain msgs = null;
			if (valueUri != null)
				msgs = ((InternalEObject)valueUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_URI, null, msgs);
			if (newValueUri != null)
				msgs = ((InternalEObject)newValueUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_URI, null, msgs);
			msgs = basicSetValueUri(newValueUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_URI, newValueUri, newValueUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getValueAttachment() {
		return valueAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAttachment(Attachment newValueAttachment, NotificationChain msgs) {
		Attachment oldValueAttachment = valueAttachment;
		valueAttachment = newValueAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_ATTACHMENT, oldValueAttachment, newValueAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueAttachment(Attachment newValueAttachment) {
		if (newValueAttachment != valueAttachment) {
			NotificationChain msgs = null;
			if (valueAttachment != null)
				msgs = ((InternalEObject)valueAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_ATTACHMENT, null, msgs);
			if (newValueAttachment != null)
				msgs = ((InternalEObject)newValueAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_ATTACHMENT, null, msgs);
			msgs = basicSetValueAttachment(newValueAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_ATTACHMENT, newValueAttachment, newValueAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getValueCoding() {
		return valueCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCoding(Coding newValueCoding, NotificationChain msgs) {
		Coding oldValueCoding = valueCoding;
		valueCoding = newValueCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_CODING, oldValueCoding, newValueCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueCoding(Coding newValueCoding) {
		if (newValueCoding != valueCoding) {
			NotificationChain msgs = null;
			if (valueCoding != null)
				msgs = ((InternalEObject)valueCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_CODING, null, msgs);
			if (newValueCoding != null)
				msgs = ((InternalEObject)newValueCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_CODING, null, msgs);
			msgs = basicSetValueCoding(newValueCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_CODING, newValueCoding, newValueCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getValueQuantity() {
		return valueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueQuantity(Quantity newValueQuantity, NotificationChain msgs) {
		Quantity oldValueQuantity = valueQuantity;
		valueQuantity = newValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_QUANTITY, oldValueQuantity, newValueQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueQuantity(Quantity newValueQuantity) {
		if (newValueQuantity != valueQuantity) {
			NotificationChain msgs = null;
			if (valueQuantity != null)
				msgs = ((InternalEObject)valueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_QUANTITY, null, msgs);
			if (newValueQuantity != null)
				msgs = ((InternalEObject)newValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_QUANTITY, null, msgs);
			msgs = basicSetValueQuantity(newValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_QUANTITY, newValueQuantity, newValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getValueReference() {
		return valueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueReference(Reference newValueReference, NotificationChain msgs) {
		Reference oldValueReference = valueReference;
		valueReference = newValueReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_REFERENCE, oldValueReference, newValueReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueReference(Reference newValueReference) {
		if (newValueReference != valueReference) {
			NotificationChain msgs = null;
			if (valueReference != null)
				msgs = ((InternalEObject)valueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_REFERENCE, null, msgs);
			if (newValueReference != null)
				msgs = ((InternalEObject)newValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_REFERENCE, null, msgs);
			msgs = basicSetValueReference(newValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_REFERENCE, newValueReference, newValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_BOOLEAN:
				return basicSetValueBoolean(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DECIMAL:
				return basicSetValueDecimal(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INTEGER:
				return basicSetValueInteger(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE:
				return basicSetValueDate(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE_TIME:
				return basicSetValueDateTime(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INSTANT:
				return basicSetValueInstant(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_TIME:
				return basicSetValueTime(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_STRING:
				return basicSetValueString(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_URI:
				return basicSetValueUri(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_ATTACHMENT:
				return basicSetValueAttachment(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_CODING:
				return basicSetValueCoding(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_QUANTITY:
				return basicSetValueQuantity(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_REFERENCE:
				return basicSetValueReference(null, msgs);
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
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_BOOLEAN:
				return getValueBoolean();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DECIMAL:
				return getValueDecimal();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INTEGER:
				return getValueInteger();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE:
				return getValueDate();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE_TIME:
				return getValueDateTime();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INSTANT:
				return getValueInstant();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_TIME:
				return getValueTime();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_STRING:
				return getValueString();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_URI:
				return getValueUri();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_ATTACHMENT:
				return getValueAttachment();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_CODING:
				return getValueCoding();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_QUANTITY:
				return getValueQuantity();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_REFERENCE:
				return getValueReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DECIMAL:
				setValueDecimal((Decimal)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE:
				setValueDate((Date)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE_TIME:
				setValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INSTANT:
				setValueInstant((Instant)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_TIME:
				setValueTime((Time)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_STRING:
				setValueString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_URI:
				setValueUri((Uri)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_CODING:
				setValueCoding((Coding)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_QUANTITY:
				setValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_REFERENCE:
				setValueReference((Reference)newValue);
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
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DECIMAL:
				setValueDecimal((Decimal)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE:
				setValueDate((Date)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE_TIME:
				setValueDateTime((DateTime)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INSTANT:
				setValueInstant((Instant)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_TIME:
				setValueTime((Time)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_STRING:
				setValueString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_URI:
				setValueUri((Uri)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_CODING:
				setValueCoding((Coding)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_QUANTITY:
				setValueQuantity((Quantity)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_REFERENCE:
				setValueReference((Reference)null);
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
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_BOOLEAN:
				return valueBoolean != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DECIMAL:
				return valueDecimal != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INTEGER:
				return valueInteger != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE:
				return valueDate != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_DATE_TIME:
				return valueDateTime != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_INSTANT:
				return valueInstant != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_TIME:
				return valueTime != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_STRING:
				return valueString != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_URI:
				return valueUri != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_ATTACHMENT:
				return valueAttachment != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_CODING:
				return valueCoding != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_QUANTITY:
				return valueQuantity != null;
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER__VALUE_REFERENCE:
				return valueReference != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireAnswersAnswerImpl
