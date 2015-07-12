/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationPrescriptionDispense;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Prescription Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDispenseImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDispenseImpl#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDispenseImpl#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDispenseImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPrescriptionDispenseImpl#getExpectedSupplyDuration <em>Expected Supply Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationPrescriptionDispenseImpl extends BackboneElementImpl implements MedicationPrescriptionDispense {
	/**
	 * The cached value of the '{@link #getMedication() <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected Reference medication;

	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period validityPeriod;

	/**
	 * The cached value of the '{@link #getNumberOfRepeatsAllowed() <em>Number Of Repeats Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepeatsAllowed()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt numberOfRepeatsAllowed;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getExpectedSupplyDuration() <em>Expected Supply Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedSupplyDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration expectedSupplyDuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationPrescriptionDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationPrescriptionDispense();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getMedication() {
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedication(Reference newMedication, NotificationChain msgs) {
		Reference oldMedication = medication;
		medication = newMedication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__MEDICATION, oldMedication, newMedication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedication(Reference newMedication) {
		if (newMedication != medication) {
			NotificationChain msgs = null;
			if (medication != null)
				msgs = ((InternalEObject)medication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__MEDICATION, null, msgs);
			if (newMedication != null)
				msgs = ((InternalEObject)newMedication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__MEDICATION, null, msgs);
			msgs = basicSetMedication(newMedication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__MEDICATION, newMedication, newMedication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getValidityPeriod() {
		return validityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityPeriod(Period newValidityPeriod, NotificationChain msgs) {
		Period oldValidityPeriod = validityPeriod;
		validityPeriod = newValidityPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__VALIDITY_PERIOD, oldValidityPeriod, newValidityPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityPeriod(Period newValidityPeriod) {
		if (newValidityPeriod != validityPeriod) {
			NotificationChain msgs = null;
			if (validityPeriod != null)
				msgs = ((InternalEObject)validityPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__VALIDITY_PERIOD, null, msgs);
			if (newValidityPeriod != null)
				msgs = ((InternalEObject)newValidityPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__VALIDITY_PERIOD, null, msgs);
			msgs = basicSetValidityPeriod(newValidityPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__VALIDITY_PERIOD, newValidityPeriod, newValidityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getNumberOfRepeatsAllowed() {
		return numberOfRepeatsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfRepeatsAllowed(PositiveInt newNumberOfRepeatsAllowed, NotificationChain msgs) {
		PositiveInt oldNumberOfRepeatsAllowed = numberOfRepeatsAllowed;
		numberOfRepeatsAllowed = newNumberOfRepeatsAllowed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__NUMBER_OF_REPEATS_ALLOWED, oldNumberOfRepeatsAllowed, newNumberOfRepeatsAllowed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRepeatsAllowed(PositiveInt newNumberOfRepeatsAllowed) {
		if (newNumberOfRepeatsAllowed != numberOfRepeatsAllowed) {
			NotificationChain msgs = null;
			if (numberOfRepeatsAllowed != null)
				msgs = ((InternalEObject)numberOfRepeatsAllowed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__NUMBER_OF_REPEATS_ALLOWED, null, msgs);
			if (newNumberOfRepeatsAllowed != null)
				msgs = ((InternalEObject)newNumberOfRepeatsAllowed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__NUMBER_OF_REPEATS_ALLOWED, null, msgs);
			msgs = basicSetNumberOfRepeatsAllowed(newNumberOfRepeatsAllowed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__NUMBER_OF_REPEATS_ALLOWED, newNumberOfRepeatsAllowed, newNumberOfRepeatsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getExpectedSupplyDuration() {
		return expectedSupplyDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedSupplyDuration(Duration newExpectedSupplyDuration, NotificationChain msgs) {
		Duration oldExpectedSupplyDuration = expectedSupplyDuration;
		expectedSupplyDuration = newExpectedSupplyDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__EXPECTED_SUPPLY_DURATION, oldExpectedSupplyDuration, newExpectedSupplyDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedSupplyDuration(Duration newExpectedSupplyDuration) {
		if (newExpectedSupplyDuration != expectedSupplyDuration) {
			NotificationChain msgs = null;
			if (expectedSupplyDuration != null)
				msgs = ((InternalEObject)expectedSupplyDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__EXPECTED_SUPPLY_DURATION, null, msgs);
			if (newExpectedSupplyDuration != null)
				msgs = ((InternalEObject)newExpectedSupplyDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__EXPECTED_SUPPLY_DURATION, null, msgs);
			msgs = basicSetExpectedSupplyDuration(newExpectedSupplyDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__EXPECTED_SUPPLY_DURATION, newExpectedSupplyDuration, newExpectedSupplyDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__MEDICATION:
				return basicSetMedication(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__VALIDITY_PERIOD:
				return basicSetValidityPeriod(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__NUMBER_OF_REPEATS_ALLOWED:
				return basicSetNumberOfRepeatsAllowed(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__EXPECTED_SUPPLY_DURATION:
				return basicSetExpectedSupplyDuration(null, msgs);
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
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__MEDICATION:
				return getMedication();
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__VALIDITY_PERIOD:
				return getValidityPeriod();
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__NUMBER_OF_REPEATS_ALLOWED:
				return getNumberOfRepeatsAllowed();
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__QUANTITY:
				return getQuantity();
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__EXPECTED_SUPPLY_DURATION:
				return getExpectedSupplyDuration();
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
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__MEDICATION:
				setMedication((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__VALIDITY_PERIOD:
				setValidityPeriod((Period)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__NUMBER_OF_REPEATS_ALLOWED:
				setNumberOfRepeatsAllowed((PositiveInt)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__EXPECTED_SUPPLY_DURATION:
				setExpectedSupplyDuration((Duration)newValue);
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
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__MEDICATION:
				setMedication((Reference)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__VALIDITY_PERIOD:
				setValidityPeriod((Period)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__NUMBER_OF_REPEATS_ALLOWED:
				setNumberOfRepeatsAllowed((PositiveInt)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__EXPECTED_SUPPLY_DURATION:
				setExpectedSupplyDuration((Duration)null);
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
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__MEDICATION:
				return medication != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__VALIDITY_PERIOD:
				return validityPeriod != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__NUMBER_OF_REPEATS_ALLOWED:
				return numberOfRepeatsAllowed != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__QUANTITY:
				return quantity != null;
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE__EXPECTED_SUPPLY_DURATION:
				return expectedSupplyDuration != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationPrescriptionDispenseImpl
