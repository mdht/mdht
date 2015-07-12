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
import org.hl7.fhir.PatientAnimal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Animal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PatientAnimalImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientAnimalImpl#getBreed <em>Breed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientAnimalImpl#getGenderStatus <em>Gender Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientAnimalImpl extends BackboneElementImpl implements PatientAnimal {
	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept species;

	/**
	 * The cached value of the '{@link #getBreed() <em>Breed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreed()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept breed;

	/**
	 * The cached value of the '{@link #getGenderStatus() <em>Gender Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenderStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept genderStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientAnimalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPatientAnimal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecies(CodeableConcept newSpecies, NotificationChain msgs) {
		CodeableConcept oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT_ANIMAL__SPECIES, oldSpecies, newSpecies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(CodeableConcept newSpecies) {
		if (newSpecies != species) {
			NotificationChain msgs = null;
			if (species != null)
				msgs = ((InternalEObject)species).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT_ANIMAL__SPECIES, null, msgs);
			if (newSpecies != null)
				msgs = ((InternalEObject)newSpecies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT_ANIMAL__SPECIES, null, msgs);
			msgs = basicSetSpecies(newSpecies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT_ANIMAL__SPECIES, newSpecies, newSpecies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBreed() {
		return breed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBreed(CodeableConcept newBreed, NotificationChain msgs) {
		CodeableConcept oldBreed = breed;
		breed = newBreed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT_ANIMAL__BREED, oldBreed, newBreed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreed(CodeableConcept newBreed) {
		if (newBreed != breed) {
			NotificationChain msgs = null;
			if (breed != null)
				msgs = ((InternalEObject)breed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT_ANIMAL__BREED, null, msgs);
			if (newBreed != null)
				msgs = ((InternalEObject)newBreed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT_ANIMAL__BREED, null, msgs);
			msgs = basicSetBreed(newBreed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT_ANIMAL__BREED, newBreed, newBreed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getGenderStatus() {
		return genderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenderStatus(CodeableConcept newGenderStatus, NotificationChain msgs) {
		CodeableConcept oldGenderStatus = genderStatus;
		genderStatus = newGenderStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT_ANIMAL__GENDER_STATUS, oldGenderStatus, newGenderStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenderStatus(CodeableConcept newGenderStatus) {
		if (newGenderStatus != genderStatus) {
			NotificationChain msgs = null;
			if (genderStatus != null)
				msgs = ((InternalEObject)genderStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT_ANIMAL__GENDER_STATUS, null, msgs);
			if (newGenderStatus != null)
				msgs = ((InternalEObject)newGenderStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT_ANIMAL__GENDER_STATUS, null, msgs);
			msgs = basicSetGenderStatus(newGenderStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT_ANIMAL__GENDER_STATUS, newGenderStatus, newGenderStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PATIENT_ANIMAL__SPECIES:
				return basicSetSpecies(null, msgs);
			case FhirPackage.PATIENT_ANIMAL__BREED:
				return basicSetBreed(null, msgs);
			case FhirPackage.PATIENT_ANIMAL__GENDER_STATUS:
				return basicSetGenderStatus(null, msgs);
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
			case FhirPackage.PATIENT_ANIMAL__SPECIES:
				return getSpecies();
			case FhirPackage.PATIENT_ANIMAL__BREED:
				return getBreed();
			case FhirPackage.PATIENT_ANIMAL__GENDER_STATUS:
				return getGenderStatus();
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
			case FhirPackage.PATIENT_ANIMAL__SPECIES:
				setSpecies((CodeableConcept)newValue);
				return;
			case FhirPackage.PATIENT_ANIMAL__BREED:
				setBreed((CodeableConcept)newValue);
				return;
			case FhirPackage.PATIENT_ANIMAL__GENDER_STATUS:
				setGenderStatus((CodeableConcept)newValue);
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
			case FhirPackage.PATIENT_ANIMAL__SPECIES:
				setSpecies((CodeableConcept)null);
				return;
			case FhirPackage.PATIENT_ANIMAL__BREED:
				setBreed((CodeableConcept)null);
				return;
			case FhirPackage.PATIENT_ANIMAL__GENDER_STATUS:
				setGenderStatus((CodeableConcept)null);
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
			case FhirPackage.PATIENT_ANIMAL__SPECIES:
				return species != null;
			case FhirPackage.PATIENT_ANIMAL__BREED:
				return breed != null;
			case FhirPackage.PATIENT_ANIMAL__GENDER_STATUS:
				return genderStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //PatientAnimalImpl
