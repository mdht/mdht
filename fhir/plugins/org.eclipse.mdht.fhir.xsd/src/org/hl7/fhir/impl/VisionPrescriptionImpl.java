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
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionDispense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vision Prescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionImpl#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionImpl#getPrescriber <em>Prescriber</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionImpl#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionImpl#getDispense <em>Dispense</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisionPrescriptionImpl extends DomainResourceImpl implements VisionPrescription {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getDateWritten() <em>Date Written</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateWritten()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateWritten;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getPrescriber() <em>Prescriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriber()
	 * @generated
	 * @ordered
	 */
	protected Reference prescriber;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getReasonCodeableConcept() <em>Reason Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonCodeableConcept;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reasonReference;

	/**
	 * The cached value of the '{@link #getDispense() <em>Dispense</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispense()
	 * @generated
	 * @ordered
	 */
	protected EList<VisionPrescriptionDispense> dispense;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionPrescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getVisionPrescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.VISION_PRESCRIPTION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateWritten() {
		return dateWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateWritten(DateTime newDateWritten, NotificationChain msgs) {
		DateTime oldDateWritten = dateWritten;
		dateWritten = newDateWritten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__DATE_WRITTEN, oldDateWritten, newDateWritten);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateWritten(DateTime newDateWritten) {
		if (newDateWritten != dateWritten) {
			NotificationChain msgs = null;
			if (dateWritten != null)
				msgs = ((InternalEObject)dateWritten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__DATE_WRITTEN, null, msgs);
			if (newDateWritten != null)
				msgs = ((InternalEObject)newDateWritten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__DATE_WRITTEN, null, msgs);
			msgs = basicSetDateWritten(newDateWritten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__DATE_WRITTEN, newDateWritten, newDateWritten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrescriber() {
		return prescriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescriber(Reference newPrescriber, NotificationChain msgs) {
		Reference oldPrescriber = prescriber;
		prescriber = newPrescriber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__PRESCRIBER, oldPrescriber, newPrescriber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriber(Reference newPrescriber) {
		if (newPrescriber != prescriber) {
			NotificationChain msgs = null;
			if (prescriber != null)
				msgs = ((InternalEObject)prescriber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__PRESCRIBER, null, msgs);
			if (newPrescriber != null)
				msgs = ((InternalEObject)newPrescriber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__PRESCRIBER, null, msgs);
			msgs = basicSetPrescriber(newPrescriber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__PRESCRIBER, newPrescriber, newPrescriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReasonCodeableConcept() {
		return reasonCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonCodeableConcept(CodeableConcept newReasonCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldReasonCodeableConcept = reasonCodeableConcept;
		reasonCodeableConcept = newReasonCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__REASON_CODEABLE_CONCEPT, oldReasonCodeableConcept, newReasonCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonCodeableConcept(CodeableConcept newReasonCodeableConcept) {
		if (newReasonCodeableConcept != reasonCodeableConcept) {
			NotificationChain msgs = null;
			if (reasonCodeableConcept != null)
				msgs = ((InternalEObject)reasonCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__REASON_CODEABLE_CONCEPT, null, msgs);
			if (newReasonCodeableConcept != null)
				msgs = ((InternalEObject)newReasonCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__REASON_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetReasonCodeableConcept(newReasonCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__REASON_CODEABLE_CONCEPT, newReasonCodeableConcept, newReasonCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReasonReference() {
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonReference(Reference newReasonReference, NotificationChain msgs) {
		Reference oldReasonReference = reasonReference;
		reasonReference = newReasonReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__REASON_REFERENCE, oldReasonReference, newReasonReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonReference(Reference newReasonReference) {
		if (newReasonReference != reasonReference) {
			NotificationChain msgs = null;
			if (reasonReference != null)
				msgs = ((InternalEObject)reasonReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__REASON_REFERENCE, null, msgs);
			if (newReasonReference != null)
				msgs = ((InternalEObject)newReasonReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION__REASON_REFERENCE, null, msgs);
			msgs = basicSetReasonReference(newReasonReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION__REASON_REFERENCE, newReasonReference, newReasonReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisionPrescriptionDispense> getDispense() {
		if (dispense == null) {
			dispense = new EObjectContainmentEList<VisionPrescriptionDispense>(VisionPrescriptionDispense.class, this, FhirPackage.VISION_PRESCRIPTION__DISPENSE);
		}
		return dispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VISION_PRESCRIPTION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.VISION_PRESCRIPTION__DATE_WRITTEN:
				return basicSetDateWritten(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION__PRESCRIBER:
				return basicSetPrescriber(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION__REASON_CODEABLE_CONCEPT:
				return basicSetReasonCodeableConcept(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION__REASON_REFERENCE:
				return basicSetReasonReference(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION__DISPENSE:
				return ((InternalEList<?>)getDispense()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.VISION_PRESCRIPTION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.VISION_PRESCRIPTION__DATE_WRITTEN:
				return getDateWritten();
			case FhirPackage.VISION_PRESCRIPTION__PATIENT:
				return getPatient();
			case FhirPackage.VISION_PRESCRIPTION__PRESCRIBER:
				return getPrescriber();
			case FhirPackage.VISION_PRESCRIPTION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.VISION_PRESCRIPTION__REASON_CODEABLE_CONCEPT:
				return getReasonCodeableConcept();
			case FhirPackage.VISION_PRESCRIPTION__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.VISION_PRESCRIPTION__DISPENSE:
				return getDispense();
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
			case FhirPackage.VISION_PRESCRIPTION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION__DATE_WRITTEN:
				setDateWritten((DateTime)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION__PRESCRIBER:
				setPrescriber((Reference)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION__REASON_REFERENCE:
				setReasonReference((Reference)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION__DISPENSE:
				getDispense().clear();
				getDispense().addAll((Collection<? extends VisionPrescriptionDispense>)newValue);
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
			case FhirPackage.VISION_PRESCRIPTION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.VISION_PRESCRIPTION__DATE_WRITTEN:
				setDateWritten((DateTime)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION__PRESCRIBER:
				setPrescriber((Reference)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION__REASON_REFERENCE:
				setReasonReference((Reference)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION__DISPENSE:
				getDispense().clear();
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
			case FhirPackage.VISION_PRESCRIPTION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.VISION_PRESCRIPTION__DATE_WRITTEN:
				return dateWritten != null;
			case FhirPackage.VISION_PRESCRIPTION__PATIENT:
				return patient != null;
			case FhirPackage.VISION_PRESCRIPTION__PRESCRIBER:
				return prescriber != null;
			case FhirPackage.VISION_PRESCRIPTION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.VISION_PRESCRIPTION__REASON_CODEABLE_CONCEPT:
				return reasonCodeableConcept != null;
			case FhirPackage.VISION_PRESCRIPTION__REASON_REFERENCE:
				return reasonReference != null;
			case FhirPackage.VISION_PRESCRIPTION__DISPENSE:
				return dispense != null && !dispense.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VisionPrescriptionImpl
