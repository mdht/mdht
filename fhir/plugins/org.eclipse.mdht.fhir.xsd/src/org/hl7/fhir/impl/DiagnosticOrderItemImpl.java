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
import org.hl7.fhir.DiagnosticOrderEvent;
import org.hl7.fhir.DiagnosticOrderItem;
import org.hl7.fhir.DiagnosticOrderStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Order Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderItemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderItemImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderItemImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderItemImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosticOrderItemImpl extends BackboneElementImpl implements DiagnosticOrderItem {
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
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> specimen;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected DiagnosticOrderStatus status;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticOrderEvent> event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticOrderItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDiagnosticOrderItem();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER_ITEM__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER_ITEM__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER_ITEM__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER_ITEM__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_ORDER_ITEM__SPECIMEN);
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableConcept newBodySite, NotificationChain msgs) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(CodeableConcept newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(DiagnosticOrderStatus newStatus, NotificationChain msgs) {
		DiagnosticOrderStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER_ITEM__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(DiagnosticOrderStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER_ITEM__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticOrderEvent> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<DiagnosticOrderEvent>(DiagnosticOrderEvent.class, this, FhirPackage.DIAGNOSTIC_ORDER_ITEM__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__CODE:
				return getCode();
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__SPECIMEN:
				return getSpecimen();
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE:
				return getBodySite();
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__STATUS:
				return getStatus();
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__EVENT:
				return getEvent();
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
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__STATUS:
				setStatus((DiagnosticOrderStatus)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends DiagnosticOrderEvent>)newValue);
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
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__SPECIMEN:
				getSpecimen().clear();
				return;
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__STATUS:
				setStatus((DiagnosticOrderStatus)null);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__EVENT:
				getEvent().clear();
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
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__CODE:
				return code != null;
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE:
				return bodySite != null;
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__STATUS:
				return status != null;
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM__EVENT:
				return event != null && !event.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagnosticOrderItemImpl
