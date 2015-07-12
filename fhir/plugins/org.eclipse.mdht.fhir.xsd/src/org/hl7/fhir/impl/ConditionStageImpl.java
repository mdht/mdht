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
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConditionStageImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionStageImpl#getAssessment <em>Assessment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionStageImpl extends BackboneElementImpl implements ConditionStage {
	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept summary;

	/**
	 * The cached value of the '{@link #getAssessment() <em>Assessment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> assessment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionStageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConditionStage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSummary(CodeableConcept newSummary, NotificationChain msgs) {
		CodeableConcept oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_STAGE__SUMMARY, oldSummary, newSummary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(CodeableConcept newSummary) {
		if (newSummary != summary) {
			NotificationChain msgs = null;
			if (summary != null)
				msgs = ((InternalEObject)summary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_STAGE__SUMMARY, null, msgs);
			if (newSummary != null)
				msgs = ((InternalEObject)newSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION_STAGE__SUMMARY, null, msgs);
			msgs = basicSetSummary(newSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION_STAGE__SUMMARY, newSummary, newSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAssessment() {
		if (assessment == null) {
			assessment = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONDITION_STAGE__ASSESSMENT);
		}
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONDITION_STAGE__SUMMARY:
				return basicSetSummary(null, msgs);
			case FhirPackage.CONDITION_STAGE__ASSESSMENT:
				return ((InternalEList<?>)getAssessment()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONDITION_STAGE__SUMMARY:
				return getSummary();
			case FhirPackage.CONDITION_STAGE__ASSESSMENT:
				return getAssessment();
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
			case FhirPackage.CONDITION_STAGE__SUMMARY:
				setSummary((CodeableConcept)newValue);
				return;
			case FhirPackage.CONDITION_STAGE__ASSESSMENT:
				getAssessment().clear();
				getAssessment().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.CONDITION_STAGE__SUMMARY:
				setSummary((CodeableConcept)null);
				return;
			case FhirPackage.CONDITION_STAGE__ASSESSMENT:
				getAssessment().clear();
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
			case FhirPackage.CONDITION_STAGE__SUMMARY:
				return summary != null;
			case FhirPackage.CONDITION_STAGE__ASSESSMENT:
				return assessment != null && !assessment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionStageImpl
