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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getPrediction <em>Prediction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getMitigation <em>Mitigation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskAssessmentImpl extends DomainResourceImpl implements RiskAssessment {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Reference condition;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basis;

	/**
	 * The cached value of the '{@link #getPrediction() <em>Prediction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrediction()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskAssessmentPrediction> prediction;

	/**
	 * The cached value of the '{@link #getMitigation() <em>Mitigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String mitigation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRiskAssessment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Reference newCondition, NotificationChain msgs) {
		Reference oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Reference newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasis() {
		if (basis == null) {
			basis = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.RISK_ASSESSMENT__BASIS);
		}
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RiskAssessmentPrediction> getPrediction() {
		if (prediction == null) {
			prediction = new EObjectContainmentEList<RiskAssessmentPrediction>(RiskAssessmentPrediction.class, this, FhirPackage.RISK_ASSESSMENT__PREDICTION);
		}
		return prediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getMitigation() {
		return mitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMitigation(org.hl7.fhir.String newMitigation, NotificationChain msgs) {
		org.hl7.fhir.String oldMitigation = mitigation;
		mitigation = newMitigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__MITIGATION, oldMitigation, newMitigation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMitigation(org.hl7.fhir.String newMitigation) {
		if (newMitigation != mitigation) {
			NotificationChain msgs = null;
			if (mitigation != null)
				msgs = ((InternalEObject)mitigation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__MITIGATION, null, msgs);
			if (newMitigation != null)
				msgs = ((InternalEObject)newMitigation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_ASSESSMENT__MITIGATION, null, msgs);
			msgs = basicSetMitigation(newMitigation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_ASSESSMENT__MITIGATION, newMitigation, newMitigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RISK_ASSESSMENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.RISK_ASSESSMENT__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.RISK_ASSESSMENT__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.RISK_ASSESSMENT__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FhirPackage.RISK_ASSESSMENT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.RISK_ASSESSMENT__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.RISK_ASSESSMENT__BASIS:
				return ((InternalEList<?>)getBasis()).basicRemove(otherEnd, msgs);
			case FhirPackage.RISK_ASSESSMENT__PREDICTION:
				return ((InternalEList<?>)getPrediction()).basicRemove(otherEnd, msgs);
			case FhirPackage.RISK_ASSESSMENT__MITIGATION:
				return basicSetMitigation(null, msgs);
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
			case FhirPackage.RISK_ASSESSMENT__SUBJECT:
				return getSubject();
			case FhirPackage.RISK_ASSESSMENT__DATE:
				return getDate();
			case FhirPackage.RISK_ASSESSMENT__CONDITION:
				return getCondition();
			case FhirPackage.RISK_ASSESSMENT__PERFORMER:
				return getPerformer();
			case FhirPackage.RISK_ASSESSMENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.RISK_ASSESSMENT__METHOD:
				return getMethod();
			case FhirPackage.RISK_ASSESSMENT__BASIS:
				return getBasis();
			case FhirPackage.RISK_ASSESSMENT__PREDICTION:
				return getPrediction();
			case FhirPackage.RISK_ASSESSMENT__MITIGATION:
				return getMitigation();
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
			case FhirPackage.RISK_ASSESSMENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.RISK_ASSESSMENT__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.RISK_ASSESSMENT__CONDITION:
				setCondition((Reference)newValue);
				return;
			case FhirPackage.RISK_ASSESSMENT__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FhirPackage.RISK_ASSESSMENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.RISK_ASSESSMENT__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.RISK_ASSESSMENT__BASIS:
				getBasis().clear();
				getBasis().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.RISK_ASSESSMENT__PREDICTION:
				getPrediction().clear();
				getPrediction().addAll((Collection<? extends RiskAssessmentPrediction>)newValue);
				return;
			case FhirPackage.RISK_ASSESSMENT__MITIGATION:
				setMitigation((org.hl7.fhir.String)newValue);
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
			case FhirPackage.RISK_ASSESSMENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.RISK_ASSESSMENT__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.RISK_ASSESSMENT__CONDITION:
				setCondition((Reference)null);
				return;
			case FhirPackage.RISK_ASSESSMENT__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FhirPackage.RISK_ASSESSMENT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.RISK_ASSESSMENT__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.RISK_ASSESSMENT__BASIS:
				getBasis().clear();
				return;
			case FhirPackage.RISK_ASSESSMENT__PREDICTION:
				getPrediction().clear();
				return;
			case FhirPackage.RISK_ASSESSMENT__MITIGATION:
				setMitigation((org.hl7.fhir.String)null);
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
			case FhirPackage.RISK_ASSESSMENT__SUBJECT:
				return subject != null;
			case FhirPackage.RISK_ASSESSMENT__DATE:
				return date != null;
			case FhirPackage.RISK_ASSESSMENT__CONDITION:
				return condition != null;
			case FhirPackage.RISK_ASSESSMENT__PERFORMER:
				return performer != null;
			case FhirPackage.RISK_ASSESSMENT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.RISK_ASSESSMENT__METHOD:
				return method != null;
			case FhirPackage.RISK_ASSESSMENT__BASIS:
				return basis != null && !basis.isEmpty();
			case FhirPackage.RISK_ASSESSMENT__PREDICTION:
				return prediction != null && !prediction.isEmpty();
			case FhirPackage.RISK_ASSESSMENT__MITIGATION:
				return mitigation != null;
		}
		return super.eIsSet(featureID);
	}

} //RiskAssessmentImpl
