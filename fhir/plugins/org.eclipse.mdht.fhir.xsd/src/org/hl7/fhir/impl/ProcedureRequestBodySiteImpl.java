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
import org.hl7.fhir.ProcedureRequestBodySite;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Request Body Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestBodySiteImpl#getSiteCodeableConcept <em>Site Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestBodySiteImpl#getSiteReference <em>Site Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureRequestBodySiteImpl extends BackboneElementImpl implements ProcedureRequestBodySite {
	/**
	 * The cached value of the '{@link #getSiteCodeableConcept() <em>Site Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept siteCodeableConcept;

	/**
	 * The cached value of the '{@link #getSiteReference() <em>Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteReference()
	 * @generated
	 * @ordered
	 */
	protected Reference siteReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureRequestBodySiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcedureRequestBodySite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSiteCodeableConcept() {
		return siteCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiteCodeableConcept(CodeableConcept newSiteCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSiteCodeableConcept = siteCodeableConcept;
		siteCodeableConcept = newSiteCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_CODEABLE_CONCEPT, oldSiteCodeableConcept, newSiteCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteCodeableConcept(CodeableConcept newSiteCodeableConcept) {
		if (newSiteCodeableConcept != siteCodeableConcept) {
			NotificationChain msgs = null;
			if (siteCodeableConcept != null)
				msgs = ((InternalEObject)siteCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_CODEABLE_CONCEPT, null, msgs);
			if (newSiteCodeableConcept != null)
				msgs = ((InternalEObject)newSiteCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSiteCodeableConcept(newSiteCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_CODEABLE_CONCEPT, newSiteCodeableConcept, newSiteCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSiteReference() {
		return siteReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiteReference(Reference newSiteReference, NotificationChain msgs) {
		Reference oldSiteReference = siteReference;
		siteReference = newSiteReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_REFERENCE, oldSiteReference, newSiteReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteReference(Reference newSiteReference) {
		if (newSiteReference != siteReference) {
			NotificationChain msgs = null;
			if (siteReference != null)
				msgs = ((InternalEObject)siteReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_REFERENCE, null, msgs);
			if (newSiteReference != null)
				msgs = ((InternalEObject)newSiteReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_REFERENCE, null, msgs);
			msgs = basicSetSiteReference(newSiteReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_REFERENCE, newSiteReference, newSiteReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_CODEABLE_CONCEPT:
				return basicSetSiteCodeableConcept(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_REFERENCE:
				return basicSetSiteReference(null, msgs);
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
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_CODEABLE_CONCEPT:
				return getSiteCodeableConcept();
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_REFERENCE:
				return getSiteReference();
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
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_CODEABLE_CONCEPT:
				setSiteCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_REFERENCE:
				setSiteReference((Reference)newValue);
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
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_CODEABLE_CONCEPT:
				setSiteCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_REFERENCE:
				setSiteReference((Reference)null);
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
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_CODEABLE_CONCEPT:
				return siteCodeableConcept != null;
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE__SITE_REFERENCE:
				return siteReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcedureRequestBodySiteImpl
