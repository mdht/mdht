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

import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AddressImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AddressImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AddressImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AddressImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AddressImpl#getDistrict <em>District</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AddressImpl#getState <em>State</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AddressImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends ElementImpl implements Address {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected AddressUse use;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AddressType type;

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
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> line;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String city;

	/**
	 * The cached value of the '{@link #getDistrict() <em>District</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistrict()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String district;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String state;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String postalCode;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String country;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUse getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(AddressUse newUse, NotificationChain msgs) {
		AddressUse oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__USE, oldUse, newUse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(AddressUse newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AddressType newType, NotificationChain msgs) {
		AddressType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AddressType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getLine() {
		if (line == null) {
			line = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.ADDRESS__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCity(org.hl7.fhir.String newCity, NotificationChain msgs) {
		org.hl7.fhir.String oldCity = city;
		city = newCity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__CITY, oldCity, newCity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(org.hl7.fhir.String newCity) {
		if (newCity != city) {
			NotificationChain msgs = null;
			if (city != null)
				msgs = ((InternalEObject)city).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__CITY, null, msgs);
			if (newCity != null)
				msgs = ((InternalEObject)newCity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__CITY, null, msgs);
			msgs = basicSetCity(newCity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__CITY, newCity, newCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDistrict() {
		return district;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistrict(org.hl7.fhir.String newDistrict, NotificationChain msgs) {
		org.hl7.fhir.String oldDistrict = district;
		district = newDistrict;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__DISTRICT, oldDistrict, newDistrict);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistrict(org.hl7.fhir.String newDistrict) {
		if (newDistrict != district) {
			NotificationChain msgs = null;
			if (district != null)
				msgs = ((InternalEObject)district).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__DISTRICT, null, msgs);
			if (newDistrict != null)
				msgs = ((InternalEObject)newDistrict).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__DISTRICT, null, msgs);
			msgs = basicSetDistrict(newDistrict, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__DISTRICT, newDistrict, newDistrict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(org.hl7.fhir.String newState, NotificationChain msgs) {
		org.hl7.fhir.String oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__STATE, oldState, newState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(org.hl7.fhir.String newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalCode(org.hl7.fhir.String newPostalCode, NotificationChain msgs) {
		org.hl7.fhir.String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__POSTAL_CODE, oldPostalCode, newPostalCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(org.hl7.fhir.String newPostalCode) {
		if (newPostalCode != postalCode) {
			NotificationChain msgs = null;
			if (postalCode != null)
				msgs = ((InternalEObject)postalCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__POSTAL_CODE, null, msgs);
			if (newPostalCode != null)
				msgs = ((InternalEObject)newPostalCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__POSTAL_CODE, null, msgs);
			msgs = basicSetPostalCode(newPostalCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__POSTAL_CODE, newPostalCode, newPostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(org.hl7.fhir.String newCountry, NotificationChain msgs) {
		org.hl7.fhir.String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__COUNTRY, oldCountry, newCountry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(org.hl7.fhir.String newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__COUNTRY, newCountry, newCountry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADDRESS__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADDRESS__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ADDRESS__USE:
				return basicSetUse(null, msgs);
			case FhirPackage.ADDRESS__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.ADDRESS__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.ADDRESS__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADDRESS__CITY:
				return basicSetCity(null, msgs);
			case FhirPackage.ADDRESS__DISTRICT:
				return basicSetDistrict(null, msgs);
			case FhirPackage.ADDRESS__STATE:
				return basicSetState(null, msgs);
			case FhirPackage.ADDRESS__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case FhirPackage.ADDRESS__COUNTRY:
				return basicSetCountry(null, msgs);
			case FhirPackage.ADDRESS__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case FhirPackage.ADDRESS__USE:
				return getUse();
			case FhirPackage.ADDRESS__TYPE:
				return getType();
			case FhirPackage.ADDRESS__TEXT:
				return getText();
			case FhirPackage.ADDRESS__LINE:
				return getLine();
			case FhirPackage.ADDRESS__CITY:
				return getCity();
			case FhirPackage.ADDRESS__DISTRICT:
				return getDistrict();
			case FhirPackage.ADDRESS__STATE:
				return getState();
			case FhirPackage.ADDRESS__POSTAL_CODE:
				return getPostalCode();
			case FhirPackage.ADDRESS__COUNTRY:
				return getCountry();
			case FhirPackage.ADDRESS__PERIOD:
				return getPeriod();
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
			case FhirPackage.ADDRESS__USE:
				setUse((AddressUse)newValue);
				return;
			case FhirPackage.ADDRESS__TYPE:
				setType((AddressType)newValue);
				return;
			case FhirPackage.ADDRESS__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ADDRESS__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.ADDRESS__CITY:
				setCity((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ADDRESS__DISTRICT:
				setDistrict((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ADDRESS__STATE:
				setState((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ADDRESS__POSTAL_CODE:
				setPostalCode((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ADDRESS__COUNTRY:
				setCountry((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ADDRESS__PERIOD:
				setPeriod((Period)newValue);
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
			case FhirPackage.ADDRESS__USE:
				setUse((AddressUse)null);
				return;
			case FhirPackage.ADDRESS__TYPE:
				setType((AddressType)null);
				return;
			case FhirPackage.ADDRESS__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ADDRESS__LINE:
				getLine().clear();
				return;
			case FhirPackage.ADDRESS__CITY:
				setCity((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ADDRESS__DISTRICT:
				setDistrict((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ADDRESS__STATE:
				setState((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ADDRESS__POSTAL_CODE:
				setPostalCode((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ADDRESS__COUNTRY:
				setCountry((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ADDRESS__PERIOD:
				setPeriod((Period)null);
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
			case FhirPackage.ADDRESS__USE:
				return use != null;
			case FhirPackage.ADDRESS__TYPE:
				return type != null;
			case FhirPackage.ADDRESS__TEXT:
				return text != null;
			case FhirPackage.ADDRESS__LINE:
				return line != null && !line.isEmpty();
			case FhirPackage.ADDRESS__CITY:
				return city != null;
			case FhirPackage.ADDRESS__DISTRICT:
				return district != null;
			case FhirPackage.ADDRESS__STATE:
				return state != null;
			case FhirPackage.ADDRESS__POSTAL_CODE:
				return postalCode != null;
			case FhirPackage.ADDRESS__COUNTRY:
				return country != null;
			case FhirPackage.ADDRESS__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressImpl
