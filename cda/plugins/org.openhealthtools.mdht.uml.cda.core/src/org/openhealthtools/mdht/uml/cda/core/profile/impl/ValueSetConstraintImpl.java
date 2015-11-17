/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.BindingKind;
import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ValueSetConstraintImpl#getReference <em>Reference</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ValueSetConstraintImpl#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ValueSetConstraintImpl#getName <em>Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ValueSetConstraintImpl#getVersion <em>Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ValueSetConstraintImpl#getBinding <em>Binding</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ValueSetConstraintImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSetConstraintImpl extends ValidationImpl implements ValueSetConstraint {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ValueSetVersion reference;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected static final BindingKind BINDING_EDEFAULT = BindingKind.STATIC;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected BindingKind binding = BINDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.VALUE_SET_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetVersion getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject) reference;
			reference = (ValueSetVersion) eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, CDAPackage.VALUE_SET_CONSTRAINT__REFERENCE, oldReference, reference));
				}
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetVersion basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReference(ValueSetVersion newReference) {
		ValueSetVersion oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.VALUE_SET_CONSTRAINT__REFERENCE, oldReference, reference));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.VALUE_SET_CONSTRAINT__IDENTIFIER, oldIdentifier, identifier));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.VALUE_SET_CONSTRAINT__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.VALUE_SET_CONSTRAINT__VERSION, oldVersion, version));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BindingKind getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBinding(BindingKind newBinding) {
		BindingKind oldBinding = binding;
		binding = newBinding == null
				? BINDING_EDEFAULT
				: newBinding;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.VALUE_SET_CONSTRAINT__BINDING, oldBinding, binding));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject) base_Property;
			base_Property = (Property) eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, CDAPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY, oldBase_Property,
						base_Property));
				}
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY, oldBase_Property, base_Property));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.VALUE_SET_CONSTRAINT__REFERENCE:
				if (resolve) {
					return getReference();
				}
				return basicGetReference();
			case CDAPackage.VALUE_SET_CONSTRAINT__IDENTIFIER:
				return getIdentifier();
			case CDAPackage.VALUE_SET_CONSTRAINT__NAME:
				return getName();
			case CDAPackage.VALUE_SET_CONSTRAINT__VERSION:
				return getVersion();
			case CDAPackage.VALUE_SET_CONSTRAINT__BINDING:
				return getBinding();
			case CDAPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY:
				if (resolve) {
					return getBase_Property();
				}
				return basicGetBase_Property();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDAPackage.VALUE_SET_CONSTRAINT__REFERENCE:
				setReference((ValueSetVersion) newValue);
				return;
			case CDAPackage.VALUE_SET_CONSTRAINT__IDENTIFIER:
				setIdentifier((String) newValue);
				return;
			case CDAPackage.VALUE_SET_CONSTRAINT__NAME:
				setName((String) newValue);
				return;
			case CDAPackage.VALUE_SET_CONSTRAINT__VERSION:
				setVersion((String) newValue);
				return;
			case CDAPackage.VALUE_SET_CONSTRAINT__BINDING:
				setBinding((BindingKind) newValue);
				return;
			case CDAPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY:
				setBase_Property((Property) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CDAPackage.VALUE_SET_CONSTRAINT__REFERENCE:
				setReference((ValueSetVersion) null);
				return;
			case CDAPackage.VALUE_SET_CONSTRAINT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CDAPackage.VALUE_SET_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CDAPackage.VALUE_SET_CONSTRAINT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CDAPackage.VALUE_SET_CONSTRAINT__BINDING:
				setBinding(BINDING_EDEFAULT);
				return;
			case CDAPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY:
				setBase_Property((Property) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDAPackage.VALUE_SET_CONSTRAINT__REFERENCE:
				return reference != null;
			case CDAPackage.VALUE_SET_CONSTRAINT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null
						? identifier != null
						: !IDENTIFIER_EDEFAULT.equals(identifier);
			case CDAPackage.VALUE_SET_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case CDAPackage.VALUE_SET_CONSTRAINT__VERSION:
				return VERSION_EDEFAULT == null
						? version != null
						: !VERSION_EDEFAULT.equals(version);
			case CDAPackage.VALUE_SET_CONSTRAINT__BINDING:
				return binding != BINDING_EDEFAULT;
			case CDAPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY:
				return base_Property != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint.class) {
			switch (derivedFeatureID) {
				case CDAPackage.VALUE_SET_CONSTRAINT__REFERENCE:
					return TermPackage.VALUE_SET_CONSTRAINT__REFERENCE;
				case CDAPackage.VALUE_SET_CONSTRAINT__IDENTIFIER:
					return TermPackage.VALUE_SET_CONSTRAINT__IDENTIFIER;
				case CDAPackage.VALUE_SET_CONSTRAINT__NAME:
					return TermPackage.VALUE_SET_CONSTRAINT__NAME;
				case CDAPackage.VALUE_SET_CONSTRAINT__VERSION:
					return TermPackage.VALUE_SET_CONSTRAINT__VERSION;
				case CDAPackage.VALUE_SET_CONSTRAINT__BINDING:
					return TermPackage.VALUE_SET_CONSTRAINT__BINDING;
				case CDAPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY:
					return TermPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY;
				default:
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint.class) {
			switch (baseFeatureID) {
				case TermPackage.VALUE_SET_CONSTRAINT__REFERENCE:
					return CDAPackage.VALUE_SET_CONSTRAINT__REFERENCE;
				case TermPackage.VALUE_SET_CONSTRAINT__IDENTIFIER:
					return CDAPackage.VALUE_SET_CONSTRAINT__IDENTIFIER;
				case TermPackage.VALUE_SET_CONSTRAINT__NAME:
					return CDAPackage.VALUE_SET_CONSTRAINT__NAME;
				case TermPackage.VALUE_SET_CONSTRAINT__VERSION:
					return CDAPackage.VALUE_SET_CONSTRAINT__VERSION;
				case TermPackage.VALUE_SET_CONSTRAINT__BINDING:
					return CDAPackage.VALUE_SET_CONSTRAINT__BINDING;
				case TermPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY:
					return CDAPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", binding: ");
		result.append(binding);
		result.append(')');
		return result.toString();
	}

} // ValueSetConstraintImpl
