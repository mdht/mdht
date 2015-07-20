/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetUri <em>Value Set Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetReference <em>Value Set Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionBindingImpl extends ElementImpl implements ElementDefinitionBinding {
	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected BindingStrength strength;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

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
	protected ElementDefinitionBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getElementDefinitionBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrength getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrength(BindingStrength newStrength, NotificationChain msgs) {
		BindingStrength oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, oldStrength, newStrength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(BindingStrength newStrength) {
		if (newStrength != strength) {
			NotificationChain msgs = null;
			if (strength != null)
				msgs = ((InternalEObject)strength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, null, msgs);
			if (newStrength != null)
				msgs = ((InternalEObject)newStrength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, null, msgs);
			msgs = basicSetStrength(newStrength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, newStrength, newStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI, oldValueSetUri, newValueSetUri);
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
				msgs = ((InternalEObject)valueSetUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI, null, msgs);
			if (newValueSetUri != null)
				msgs = ((InternalEObject)newValueSetUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI, null, msgs);
			msgs = basicSetValueSetUri(newValueSetUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI, newValueSetUri, newValueSetUri));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE, oldValueSetReference, newValueSetReference);
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
				msgs = ((InternalEObject)valueSetReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE, null, msgs);
			if (newValueSetReference != null)
				msgs = ((InternalEObject)newValueSetReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE, null, msgs);
			msgs = basicSetValueSetReference(newValueSetReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE, newValueSetReference, newValueSetReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				return basicSetStrength(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI:
				return basicSetValueSetUri(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE:
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				return getStrength();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				return getDescription();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI:
				return getValueSetUri();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE:
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				setStrength((BindingStrength)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI:
				setValueSetUri((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE:
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				setStrength((BindingStrength)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI:
				setValueSetUri((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE:
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				return strength != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				return description != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI:
				return valueSetUri != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE:
				return valueSetReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionBindingImpl
