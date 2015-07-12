/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GoalOutcome;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Outcome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GoalOutcomeImpl#getResultCodeableConcept <em>Result Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalOutcomeImpl#getResultReference <em>Result Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalOutcomeImpl extends BackboneElementImpl implements GoalOutcome {
	/**
	 * The cached value of the '{@link #getResultCodeableConcept() <em>Result Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept resultCodeableConcept;

	/**
	 * The cached value of the '{@link #getResultReference() <em>Result Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultReference()
	 * @generated
	 * @ordered
	 */
	protected Reference resultReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalOutcomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGoalOutcome();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getResultCodeableConcept() {
		return resultCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultCodeableConcept(CodeableConcept newResultCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldResultCodeableConcept = resultCodeableConcept;
		resultCodeableConcept = newResultCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_OUTCOME__RESULT_CODEABLE_CONCEPT, oldResultCodeableConcept, newResultCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultCodeableConcept(CodeableConcept newResultCodeableConcept) {
		if (newResultCodeableConcept != resultCodeableConcept) {
			NotificationChain msgs = null;
			if (resultCodeableConcept != null)
				msgs = ((InternalEObject)resultCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_OUTCOME__RESULT_CODEABLE_CONCEPT, null, msgs);
			if (newResultCodeableConcept != null)
				msgs = ((InternalEObject)newResultCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_OUTCOME__RESULT_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetResultCodeableConcept(newResultCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_OUTCOME__RESULT_CODEABLE_CONCEPT, newResultCodeableConcept, newResultCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResultReference() {
		return resultReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultReference(Reference newResultReference, NotificationChain msgs) {
		Reference oldResultReference = resultReference;
		resultReference = newResultReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_OUTCOME__RESULT_REFERENCE, oldResultReference, newResultReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultReference(Reference newResultReference) {
		if (newResultReference != resultReference) {
			NotificationChain msgs = null;
			if (resultReference != null)
				msgs = ((InternalEObject)resultReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_OUTCOME__RESULT_REFERENCE, null, msgs);
			if (newResultReference != null)
				msgs = ((InternalEObject)newResultReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_OUTCOME__RESULT_REFERENCE, null, msgs);
			msgs = basicSetResultReference(newResultReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_OUTCOME__RESULT_REFERENCE, newResultReference, newResultReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GOAL_OUTCOME__RESULT_CODEABLE_CONCEPT:
				return basicSetResultCodeableConcept(null, msgs);
			case FhirPackage.GOAL_OUTCOME__RESULT_REFERENCE:
				return basicSetResultReference(null, msgs);
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
			case FhirPackage.GOAL_OUTCOME__RESULT_CODEABLE_CONCEPT:
				return getResultCodeableConcept();
			case FhirPackage.GOAL_OUTCOME__RESULT_REFERENCE:
				return getResultReference();
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
			case FhirPackage.GOAL_OUTCOME__RESULT_CODEABLE_CONCEPT:
				setResultCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.GOAL_OUTCOME__RESULT_REFERENCE:
				setResultReference((Reference)newValue);
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
			case FhirPackage.GOAL_OUTCOME__RESULT_CODEABLE_CONCEPT:
				setResultCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.GOAL_OUTCOME__RESULT_REFERENCE:
				setResultReference((Reference)null);
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
			case FhirPackage.GOAL_OUTCOME__RESULT_CODEABLE_CONCEPT:
				return resultCodeableConcept != null;
			case FhirPackage.GOAL_OUTCOME__RESULT_REFERENCE:
				return resultReference != null;
		}
		return super.eIsSet(featureID);
	}

} //GoalOutcomeImpl
