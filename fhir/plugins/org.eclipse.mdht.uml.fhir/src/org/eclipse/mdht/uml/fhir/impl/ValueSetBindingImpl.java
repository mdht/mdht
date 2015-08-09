/**
 */
package org.eclipse.mdht.uml.fhir.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.mdht.uml.fhir.BindingStrengthKind;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.ValueSetBinding;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl#getValueSetUri <em>Value Set Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl#getValueSetReference <em>Value Set Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetBindingImpl extends MinimalEObjectImpl.Container implements ValueSetBinding {
	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The default value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected static final BindingStrengthKind STRENGTH_EDEFAULT = BindingStrengthKind.REQUIRED;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected BindingStrengthKind strength = STRENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSetUri() <em>Value Set Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetUri()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SET_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSetUri() <em>Value Set Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetUri()
	 * @generated
	 * @ordered
	 */
	protected String valueSetUri = VALUE_SET_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSetReference() <em>Value Set Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SET_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSetReference() <em>Value Set Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetReference()
	 * @generated
	 * @ordered
	 */
	protected String valueSetReference = VALUE_SET_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.Literals.VALUE_SET_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FHIRPackage.VALUE_SET_BINDING__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_BINDING__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthKind getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(BindingStrengthKind newStrength) {
		BindingStrengthKind oldStrength = strength;
		strength = newStrength == null ? STRENGTH_EDEFAULT : newStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_BINDING__STRENGTH, oldStrength, strength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_BINDING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSetUri() {
		return valueSetUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetUri(String newValueSetUri) {
		String oldValueSetUri = valueSetUri;
		valueSetUri = newValueSetUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_BINDING__VALUE_SET_URI, oldValueSetUri, valueSetUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSetReference() {
		return valueSetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetReference(String newValueSetReference) {
		String oldValueSetReference = valueSetReference;
		valueSetReference = newValueSetReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_BINDING__VALUE_SET_REFERENCE, oldValueSetReference, valueSetReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FHIRPackage.VALUE_SET_BINDING__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case FHIRPackage.VALUE_SET_BINDING__STRENGTH:
				return getStrength();
			case FHIRPackage.VALUE_SET_BINDING__DESCRIPTION:
				return getDescription();
			case FHIRPackage.VALUE_SET_BINDING__VALUE_SET_URI:
				return getValueSetUri();
			case FHIRPackage.VALUE_SET_BINDING__VALUE_SET_REFERENCE:
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
			case FHIRPackage.VALUE_SET_BINDING__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case FHIRPackage.VALUE_SET_BINDING__STRENGTH:
				setStrength((BindingStrengthKind)newValue);
				return;
			case FHIRPackage.VALUE_SET_BINDING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FHIRPackage.VALUE_SET_BINDING__VALUE_SET_URI:
				setValueSetUri((String)newValue);
				return;
			case FHIRPackage.VALUE_SET_BINDING__VALUE_SET_REFERENCE:
				setValueSetReference((String)newValue);
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
			case FHIRPackage.VALUE_SET_BINDING__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case FHIRPackage.VALUE_SET_BINDING__STRENGTH:
				setStrength(STRENGTH_EDEFAULT);
				return;
			case FHIRPackage.VALUE_SET_BINDING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FHIRPackage.VALUE_SET_BINDING__VALUE_SET_URI:
				setValueSetUri(VALUE_SET_URI_EDEFAULT);
				return;
			case FHIRPackage.VALUE_SET_BINDING__VALUE_SET_REFERENCE:
				setValueSetReference(VALUE_SET_REFERENCE_EDEFAULT);
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
			case FHIRPackage.VALUE_SET_BINDING__BASE_PROPERTY:
				return base_Property != null;
			case FHIRPackage.VALUE_SET_BINDING__STRENGTH:
				return strength != STRENGTH_EDEFAULT;
			case FHIRPackage.VALUE_SET_BINDING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FHIRPackage.VALUE_SET_BINDING__VALUE_SET_URI:
				return VALUE_SET_URI_EDEFAULT == null ? valueSetUri != null : !VALUE_SET_URI_EDEFAULT.equals(valueSetUri);
			case FHIRPackage.VALUE_SET_BINDING__VALUE_SET_REFERENCE:
				return VALUE_SET_REFERENCE_EDEFAULT == null ? valueSetReference != null : !VALUE_SET_REFERENCE_EDEFAULT.equals(valueSetReference);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (strength: ");
		result.append(strength);
		result.append(", description: ");
		result.append(description);
		result.append(", valueSetUri: ");
		result.append(valueSetUri);
		result.append(", valueSetReference: ");
		result.append(valueSetReference);
		result.append(')');
		return result.toString();
	}

} //ValueSetBindingImpl
