/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Code;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionBindingImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionBindingImpl#getValueSetUri <em>Value Set Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionBindingImpl#getValueSetReference <em>Value Set Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationDefinitionBindingImpl extends BackboneElementImpl implements OperationDefinitionBinding {
	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected Code strength;

	/**
	 * The cached value of the '{@link #getValueSetUri() <em>Value Set Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetUri()
	 * @generated
	 * @ordered
	 */
	protected Uri valueSetUri;

	/**
	 * The cached value of the '{@link #getValueSetReference() <em>Value Set Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetReference()
	 * @generated
	 * @ordered
	 */
	protected Reference valueSetReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefinitionBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getOperationDefinitionBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrength(Code newStrength, NotificationChain msgs) {
		Code oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_BINDING__STRENGTH, oldStrength, newStrength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(Code newStrength) {
		if (newStrength != strength) {
			NotificationChain msgs = null;
			if (strength != null)
				msgs = ((InternalEObject)strength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_BINDING__STRENGTH, null, msgs);
			if (newStrength != null)
				msgs = ((InternalEObject)newStrength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_BINDING__STRENGTH, null, msgs);
			msgs = basicSetStrength(newStrength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_BINDING__STRENGTH, newStrength, newStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getValueSetUri() {
		return valueSetUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetUri(Uri newValueSetUri, NotificationChain msgs) {
		Uri oldValueSetUri = valueSetUri;
		valueSetUri = newValueSetUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_URI, oldValueSetUri, newValueSetUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetUri(Uri newValueSetUri) {
		if (newValueSetUri != valueSetUri) {
			NotificationChain msgs = null;
			if (valueSetUri != null)
				msgs = ((InternalEObject)valueSetUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_URI, null, msgs);
			if (newValueSetUri != null)
				msgs = ((InternalEObject)newValueSetUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_URI, null, msgs);
			msgs = basicSetValueSetUri(newValueSetUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_URI, newValueSetUri, newValueSetUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getValueSetReference() {
		return valueSetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetReference(Reference newValueSetReference, NotificationChain msgs) {
		Reference oldValueSetReference = valueSetReference;
		valueSetReference = newValueSetReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_REFERENCE, oldValueSetReference, newValueSetReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetReference(Reference newValueSetReference) {
		if (newValueSetReference != valueSetReference) {
			NotificationChain msgs = null;
			if (valueSetReference != null)
				msgs = ((InternalEObject)valueSetReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_REFERENCE, null, msgs);
			if (newValueSetReference != null)
				msgs = ((InternalEObject)newValueSetReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_REFERENCE, null, msgs);
			msgs = basicSetValueSetReference(newValueSetReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_REFERENCE, newValueSetReference, newValueSetReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OPERATION_DEFINITION_BINDING__STRENGTH:
				return basicSetStrength(null, msgs);
			case FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_URI:
				return basicSetValueSetUri(null, msgs);
			case FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_REFERENCE:
				return basicSetValueSetReference(null, msgs);
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
			case FhirPackage.OPERATION_DEFINITION_BINDING__STRENGTH:
				return getStrength();
			case FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_URI:
				return getValueSetUri();
			case FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_REFERENCE:
				return getValueSetReference();
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
			case FhirPackage.OPERATION_DEFINITION_BINDING__STRENGTH:
				setStrength((Code)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_URI:
				setValueSetUri((Uri)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_REFERENCE:
				setValueSetReference((Reference)newValue);
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
			case FhirPackage.OPERATION_DEFINITION_BINDING__STRENGTH:
				setStrength((Code)null);
				return;
			case FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_URI:
				setValueSetUri((Uri)null);
				return;
			case FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_REFERENCE:
				setValueSetReference((Reference)null);
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
			case FhirPackage.OPERATION_DEFINITION_BINDING__STRENGTH:
				return strength != null;
			case FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_URI:
				return valueSetUri != null;
			case FhirPackage.OPERATION_DEFINITION_BINDING__VALUE_SET_REFERENCE:
				return valueSetReference != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationDefinitionBindingImpl
