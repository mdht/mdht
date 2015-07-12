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
import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.DocumentReferenceRelated;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Reference Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceContextImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceContextImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceContextImpl#getFacilityType <em>Facility Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceContextImpl#getPracticeSetting <em>Practice Setting</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceContextImpl#getSourcePatientInfo <em>Source Patient Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceContextImpl#getRelated <em>Related</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentReferenceContextImpl extends BackboneElementImpl implements DocumentReferenceContext {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> event;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getFacilityType() <em>Facility Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept facilityType;

	/**
	 * The cached value of the '{@link #getPracticeSetting() <em>Practice Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPracticeSetting()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept practiceSetting;

	/**
	 * The cached value of the '{@link #getSourcePatientInfo() <em>Source Patient Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePatientInfo()
	 * @generated
	 * @ordered
	 */
	protected Reference sourcePatientInfo;

	/**
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentReferenceRelated> related;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentReferenceContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDocumentReferenceContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFacilityType() {
		return facilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacilityType(CodeableConcept newFacilityType, NotificationChain msgs) {
		CodeableConcept oldFacilityType = facilityType;
		facilityType = newFacilityType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE, oldFacilityType, newFacilityType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacilityType(CodeableConcept newFacilityType) {
		if (newFacilityType != facilityType) {
			NotificationChain msgs = null;
			if (facilityType != null)
				msgs = ((InternalEObject)facilityType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE, null, msgs);
			if (newFacilityType != null)
				msgs = ((InternalEObject)newFacilityType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE, null, msgs);
			msgs = basicSetFacilityType(newFacilityType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE, newFacilityType, newFacilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPracticeSetting() {
		return practiceSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPracticeSetting(CodeableConcept newPracticeSetting, NotificationChain msgs) {
		CodeableConcept oldPracticeSetting = practiceSetting;
		practiceSetting = newPracticeSetting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING, oldPracticeSetting, newPracticeSetting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPracticeSetting(CodeableConcept newPracticeSetting) {
		if (newPracticeSetting != practiceSetting) {
			NotificationChain msgs = null;
			if (practiceSetting != null)
				msgs = ((InternalEObject)practiceSetting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING, null, msgs);
			if (newPracticeSetting != null)
				msgs = ((InternalEObject)newPracticeSetting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING, null, msgs);
			msgs = basicSetPracticeSetting(newPracticeSetting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING, newPracticeSetting, newPracticeSetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSourcePatientInfo() {
		return sourcePatientInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcePatientInfo(Reference newSourcePatientInfo, NotificationChain msgs) {
		Reference oldSourcePatientInfo = sourcePatientInfo;
		sourcePatientInfo = newSourcePatientInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO, oldSourcePatientInfo, newSourcePatientInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePatientInfo(Reference newSourcePatientInfo) {
		if (newSourcePatientInfo != sourcePatientInfo) {
			NotificationChain msgs = null;
			if (sourcePatientInfo != null)
				msgs = ((InternalEObject)sourcePatientInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO, null, msgs);
			if (newSourcePatientInfo != null)
				msgs = ((InternalEObject)newSourcePatientInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO, null, msgs);
			msgs = basicSetSourcePatientInfo(newSourcePatientInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO, newSourcePatientInfo, newSourcePatientInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentReferenceRelated> getRelated() {
		if (related == null) {
			related = new EObjectContainmentEList<DocumentReferenceRelated>(DocumentReferenceRelated.class, this, FhirPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED);
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				return basicSetFacilityType(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				return basicSetPracticeSetting(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				return basicSetSourcePatientInfo(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				return ((InternalEList<?>)getRelated()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				return getEvent();
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				return getPeriod();
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				return getFacilityType();
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				return getPracticeSetting();
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				return getSourcePatientInfo();
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				return getRelated();
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
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				setFacilityType((CodeableConcept)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				setPracticeSetting((CodeableConcept)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				setSourcePatientInfo((Reference)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				getRelated().clear();
				getRelated().addAll((Collection<? extends DocumentReferenceRelated>)newValue);
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
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				getEvent().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				setFacilityType((CodeableConcept)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				setPracticeSetting((CodeableConcept)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				setSourcePatientInfo((Reference)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				getRelated().clear();
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
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				return event != null && !event.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				return period != null;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				return facilityType != null;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				return practiceSetting != null;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				return sourcePatientInfo != null;
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				return related != null && !related.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentReferenceContextImpl
