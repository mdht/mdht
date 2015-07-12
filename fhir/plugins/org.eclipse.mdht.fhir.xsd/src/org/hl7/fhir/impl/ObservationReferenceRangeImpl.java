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
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Reference Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getLow <em>Low</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getHigh <em>High</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationReferenceRangeImpl extends BackboneElementImpl implements ObservationReferenceRange {
	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected Quantity low;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected Quantity high;

	/**
	 * The cached value of the '{@link #getMeaning() <em>Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaning()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept meaning;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected Range age;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationReferenceRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getObservationReferenceRange();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLow(Quantity newLow, NotificationChain msgs) {
		Quantity oldLow = low;
		low = newLow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_REFERENCE_RANGE__LOW, oldLow, newLow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLow(Quantity newLow) {
		if (newLow != low) {
			NotificationChain msgs = null;
			if (low != null)
				msgs = ((InternalEObject)low).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_REFERENCE_RANGE__LOW, null, msgs);
			if (newLow != null)
				msgs = ((InternalEObject)newLow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_REFERENCE_RANGE__LOW, null, msgs);
			msgs = basicSetLow(newLow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_REFERENCE_RANGE__LOW, newLow, newLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHigh(Quantity newHigh, NotificationChain msgs) {
		Quantity oldHigh = high;
		high = newHigh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_REFERENCE_RANGE__HIGH, oldHigh, newHigh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigh(Quantity newHigh) {
		if (newHigh != high) {
			NotificationChain msgs = null;
			if (high != null)
				msgs = ((InternalEObject)high).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_REFERENCE_RANGE__HIGH, null, msgs);
			if (newHigh != null)
				msgs = ((InternalEObject)newHigh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_REFERENCE_RANGE__HIGH, null, msgs);
			msgs = basicSetHigh(newHigh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_REFERENCE_RANGE__HIGH, newHigh, newHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMeaning() {
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeaning(CodeableConcept newMeaning, NotificationChain msgs) {
		CodeableConcept oldMeaning = meaning;
		meaning = newMeaning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_REFERENCE_RANGE__MEANING, oldMeaning, newMeaning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaning(CodeableConcept newMeaning) {
		if (newMeaning != meaning) {
			NotificationChain msgs = null;
			if (meaning != null)
				msgs = ((InternalEObject)meaning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_REFERENCE_RANGE__MEANING, null, msgs);
			if (newMeaning != null)
				msgs = ((InternalEObject)newMeaning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_REFERENCE_RANGE__MEANING, null, msgs);
			msgs = basicSetMeaning(newMeaning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_REFERENCE_RANGE__MEANING, newMeaning, newMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAge(Range newAge, NotificationChain msgs) {
		Range oldAge = age;
		age = newAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_REFERENCE_RANGE__AGE, oldAge, newAge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(Range newAge) {
		if (newAge != age) {
			NotificationChain msgs = null;
			if (age != null)
				msgs = ((InternalEObject)age).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_REFERENCE_RANGE__AGE, null, msgs);
			if (newAge != null)
				msgs = ((InternalEObject)newAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_REFERENCE_RANGE__AGE, null, msgs);
			msgs = basicSetAge(newAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_REFERENCE_RANGE__AGE, newAge, newAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_REFERENCE_RANGE__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_REFERENCE_RANGE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_REFERENCE_RANGE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_REFERENCE_RANGE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				return basicSetLow(null, msgs);
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				return basicSetHigh(null, msgs);
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__MEANING:
				return basicSetMeaning(null, msgs);
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				return basicSetAge(null, msgs);
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				return basicSetText(null, msgs);
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
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				return getLow();
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				return getHigh();
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__MEANING:
				return getMeaning();
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				return getAge();
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				return getText();
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
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				setLow((Quantity)newValue);
				return;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				setHigh((Quantity)newValue);
				return;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__MEANING:
				setMeaning((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				setAge((Range)newValue);
				return;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				setText((org.hl7.fhir.String)newValue);
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
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				setLow((Quantity)null);
				return;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				setHigh((Quantity)null);
				return;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__MEANING:
				setMeaning((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				setAge((Range)null);
				return;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				setText((org.hl7.fhir.String)null);
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
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				return low != null;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				return high != null;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__MEANING:
				return meaning != null;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				return age != null;
			case FhirPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				return text != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationReferenceRangeImpl
