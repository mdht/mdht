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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.OperationOutcomeIssue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Outcome Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OperationOutcomeIssueImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationOutcomeIssueImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationOutcomeIssueImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationOutcomeIssueImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationOutcomeIssueImpl extends BackboneElementImpl implements OperationOutcomeIssue {
	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected IssueSeverity severity;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String details;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationOutcomeIssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getOperationOutcomeIssue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(IssueSeverity newSeverity, NotificationChain msgs) {
		IssueSeverity oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_OUTCOME_ISSUE__SEVERITY, oldSeverity, newSeverity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(IssueSeverity newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_OUTCOME_ISSUE__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_OUTCOME_ISSUE__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_OUTCOME_ISSUE__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_OUTCOME_ISSUE__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_OUTCOME_ISSUE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_OUTCOME_ISSUE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_OUTCOME_ISSUE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetails(org.hl7.fhir.String newDetails, NotificationChain msgs) {
		org.hl7.fhir.String oldDetails = details;
		details = newDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_OUTCOME_ISSUE__DETAILS, oldDetails, newDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetails(org.hl7.fhir.String newDetails) {
		if (newDetails != details) {
			NotificationChain msgs = null;
			if (details != null)
				msgs = ((InternalEObject)details).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_OUTCOME_ISSUE__DETAILS, null, msgs);
			if (newDetails != null)
				msgs = ((InternalEObject)newDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_OUTCOME_ISSUE__DETAILS, null, msgs);
			msgs = basicSetDetails(newDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_OUTCOME_ISSUE__DETAILS, newDetails, newDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.OPERATION_OUTCOME_ISSUE__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				return basicSetSeverity(null, msgs);
			case FhirPackage.OPERATION_OUTCOME_ISSUE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				return basicSetDetails(null, msgs);
			case FhirPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				return getSeverity();
			case FhirPackage.OPERATION_OUTCOME_ISSUE__CODE:
				return getCode();
			case FhirPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				return getDetails();
			case FhirPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				return getLocation();
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
			case FhirPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				setSeverity((IssueSeverity)newValue);
				return;
			case FhirPackage.OPERATION_OUTCOME_ISSUE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				setDetails((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FhirPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				setSeverity((IssueSeverity)null);
				return;
			case FhirPackage.OPERATION_OUTCOME_ISSUE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				setDetails((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				getLocation().clear();
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
			case FhirPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				return severity != null;
			case FhirPackage.OPERATION_OUTCOME_ISSUE__CODE:
				return code != null;
			case FhirPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				return details != null;
			case FhirPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				return location != null && !location.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationOutcomeIssueImpl
