/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ImmunizationExplanation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Explanation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationExplanationImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationExplanationImpl#getReasonNotGiven <em>Reason Not Given</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationExplanationImpl extends BackboneElementImpl implements ImmunizationExplanation {
	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reason;

	/**
	 * The cached value of the '{@link #getReasonNotGiven() <em>Reason Not Given</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonNotGiven()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonNotGiven;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationExplanationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationExplanation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_EXPLANATION__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonNotGiven() {
		if (reasonNotGiven == null) {
			reasonNotGiven = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_EXPLANATION__REASON_NOT_GIVEN);
		}
		return reasonNotGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_EXPLANATION__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_EXPLANATION__REASON_NOT_GIVEN:
				return ((InternalEList<?>)getReasonNotGiven()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMMUNIZATION_EXPLANATION__REASON:
				return getReason();
			case FhirPackage.IMMUNIZATION_EXPLANATION__REASON_NOT_GIVEN:
				return getReasonNotGiven();
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
			case FhirPackage.IMMUNIZATION_EXPLANATION__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EXPLANATION__REASON_NOT_GIVEN:
				getReasonNotGiven().clear();
				getReasonNotGiven().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.IMMUNIZATION_EXPLANATION__REASON:
				getReason().clear();
				return;
			case FhirPackage.IMMUNIZATION_EXPLANATION__REASON_NOT_GIVEN:
				getReasonNotGiven().clear();
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
			case FhirPackage.IMMUNIZATION_EXPLANATION__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.IMMUNIZATION_EXPLANATION__REASON_NOT_GIVEN:
				return reasonNotGiven != null && !reasonNotGiven.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationExplanationImpl
