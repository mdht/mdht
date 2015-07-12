/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Code;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Uri;
import org.hl7.fhir.ValueSetParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetParameterImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetParameterImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetParameterImpl#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetParameterImpl#getValueDecimal <em>Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetParameterImpl#getValueUri <em>Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetParameterImpl#getValueCode <em>Value Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetParameterImpl extends BackboneElementImpl implements ValueSetParameter {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String valueString;

	/**
	 * The cached value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean valueBoolean;

	/**
	 * The cached value of the '{@link #getValueInteger() <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer valueInteger;

	/**
	 * The cached value of the '{@link #getValueDecimal() <em>Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal valueDecimal;

	/**
	 * The cached value of the '{@link #getValueUri() <em>Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUri()
	 * @generated
	 * @ordered
	 */
	protected Uri valueUri;

	/**
	 * The cached value of the '{@link #getValueCode() <em>Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCode()
	 * @generated
	 * @ordered
	 */
	protected Code valueCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getValueSetParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueString(org.hl7.fhir.String newValueString, NotificationChain msgs) {
		org.hl7.fhir.String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_STRING, oldValueString, newValueString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueString(org.hl7.fhir.String newValueString) {
		if (newValueString != valueString) {
			NotificationChain msgs = null;
			if (valueString != null)
				msgs = ((InternalEObject)valueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_STRING, null, msgs);
			if (newValueString != null)
				msgs = ((InternalEObject)newValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_STRING, null, msgs);
			msgs = basicSetValueString(newValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_STRING, newValueString, newValueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getValueBoolean() {
		return valueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBoolean(org.hl7.fhir.Boolean newValueBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldValueBoolean = valueBoolean;
		valueBoolean = newValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_BOOLEAN, oldValueBoolean, newValueBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBoolean(org.hl7.fhir.Boolean newValueBoolean) {
		if (newValueBoolean != valueBoolean) {
			NotificationChain msgs = null;
			if (valueBoolean != null)
				msgs = ((InternalEObject)valueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_BOOLEAN, null, msgs);
			if (newValueBoolean != null)
				msgs = ((InternalEObject)newValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_BOOLEAN, null, msgs);
			msgs = basicSetValueBoolean(newValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_BOOLEAN, newValueBoolean, newValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getValueInteger() {
		return valueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueInteger(org.hl7.fhir.Integer newValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldValueInteger = valueInteger;
		valueInteger = newValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_INTEGER, oldValueInteger, newValueInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueInteger(org.hl7.fhir.Integer newValueInteger) {
		if (newValueInteger != valueInteger) {
			NotificationChain msgs = null;
			if (valueInteger != null)
				msgs = ((InternalEObject)valueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_INTEGER, null, msgs);
			if (newValueInteger != null)
				msgs = ((InternalEObject)newValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_INTEGER, null, msgs);
			msgs = basicSetValueInteger(newValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_INTEGER, newValueInteger, newValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getValueDecimal() {
		return valueDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDecimal(Decimal newValueDecimal, NotificationChain msgs) {
		Decimal oldValueDecimal = valueDecimal;
		valueDecimal = newValueDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_DECIMAL, oldValueDecimal, newValueDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDecimal(Decimal newValueDecimal) {
		if (newValueDecimal != valueDecimal) {
			NotificationChain msgs = null;
			if (valueDecimal != null)
				msgs = ((InternalEObject)valueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_DECIMAL, null, msgs);
			if (newValueDecimal != null)
				msgs = ((InternalEObject)newValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_DECIMAL, null, msgs);
			msgs = basicSetValueDecimal(newValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_DECIMAL, newValueDecimal, newValueDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getValueUri() {
		return valueUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueUri(Uri newValueUri, NotificationChain msgs) {
		Uri oldValueUri = valueUri;
		valueUri = newValueUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_URI, oldValueUri, newValueUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueUri(Uri newValueUri) {
		if (newValueUri != valueUri) {
			NotificationChain msgs = null;
			if (valueUri != null)
				msgs = ((InternalEObject)valueUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_URI, null, msgs);
			if (newValueUri != null)
				msgs = ((InternalEObject)newValueUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_URI, null, msgs);
			msgs = basicSetValueUri(newValueUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_URI, newValueUri, newValueUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getValueCode() {
		return valueCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCode(Code newValueCode, NotificationChain msgs) {
		Code oldValueCode = valueCode;
		valueCode = newValueCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_CODE, oldValueCode, newValueCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueCode(Code newValueCode) {
		if (newValueCode != valueCode) {
			NotificationChain msgs = null;
			if (valueCode != null)
				msgs = ((InternalEObject)valueCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_CODE, null, msgs);
			if (newValueCode != null)
				msgs = ((InternalEObject)newValueCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_PARAMETER__VALUE_CODE, null, msgs);
			msgs = basicSetValueCode(newValueCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_PARAMETER__VALUE_CODE, newValueCode, newValueCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VALUE_SET_PARAMETER__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_STRING:
				return basicSetValueString(null, msgs);
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_BOOLEAN:
				return basicSetValueBoolean(null, msgs);
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_INTEGER:
				return basicSetValueInteger(null, msgs);
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_DECIMAL:
				return basicSetValueDecimal(null, msgs);
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_URI:
				return basicSetValueUri(null, msgs);
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_CODE:
				return basicSetValueCode(null, msgs);
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
			case FhirPackage.VALUE_SET_PARAMETER__NAME:
				return getName();
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_STRING:
				return getValueString();
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_BOOLEAN:
				return getValueBoolean();
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_INTEGER:
				return getValueInteger();
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_DECIMAL:
				return getValueDecimal();
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_URI:
				return getValueUri();
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_CODE:
				return getValueCode();
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
			case FhirPackage.VALUE_SET_PARAMETER__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_STRING:
				setValueString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_DECIMAL:
				setValueDecimal((Decimal)newValue);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_URI:
				setValueUri((Uri)newValue);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_CODE:
				setValueCode((Code)newValue);
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
			case FhirPackage.VALUE_SET_PARAMETER__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_STRING:
				setValueString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_DECIMAL:
				setValueDecimal((Decimal)null);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_URI:
				setValueUri((Uri)null);
				return;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_CODE:
				setValueCode((Code)null);
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
			case FhirPackage.VALUE_SET_PARAMETER__NAME:
				return name != null;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_STRING:
				return valueString != null;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_BOOLEAN:
				return valueBoolean != null;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_INTEGER:
				return valueInteger != null;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_DECIMAL:
				return valueDecimal != null;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_URI:
				return valueUri != null;
			case FhirPackage.VALUE_SET_PARAMETER__VALUE_CODE:
				return valueCode != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSetParameterImpl
