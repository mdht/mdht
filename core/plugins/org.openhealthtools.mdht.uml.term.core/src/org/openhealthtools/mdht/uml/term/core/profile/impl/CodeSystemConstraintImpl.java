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
package org.openhealthtools.mdht.uml.term.core.profile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.term.core.profile.BindingKind;
import org.openhealthtools.mdht.uml.term.core.profile.CR;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemConstraintImpl#getReference <em>Reference</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemConstraintImpl#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemConstraintImpl#getName <em>Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemConstraintImpl#getVersion <em>Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemConstraintImpl#getBinding <em>Binding</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemConstraintImpl#getCode <em>Code</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemConstraintImpl#getDisplayName <em>Display Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemConstraintImpl#getQualifier <em>Qualifier</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemConstraintImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CodeSystemConstraintImpl extends EObjectImpl implements CodeSystemConstraint {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersion reference;

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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CR> qualifier;

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
	protected CodeSystemConstraintImpl() {
		super();
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
	public CodeSystemVersion basicGetReference() {
		return reference;
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
			case TermPackage.CODE_SYSTEM_CONSTRAINT__REFERENCE:
				if (resolve) {
					return getReference();
				}
				return basicGetReference();
			case TermPackage.CODE_SYSTEM_CONSTRAINT__IDENTIFIER:
				return getIdentifier();
			case TermPackage.CODE_SYSTEM_CONSTRAINT__NAME:
				return getName();
			case TermPackage.CODE_SYSTEM_CONSTRAINT__VERSION:
				return getVersion();
			case TermPackage.CODE_SYSTEM_CONSTRAINT__BINDING:
				return getBinding();
			case TermPackage.CODE_SYSTEM_CONSTRAINT__CODE:
				return getCode();
			case TermPackage.CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME:
				return getDisplayName();
			case TermPackage.CODE_SYSTEM_CONSTRAINT__QUALIFIER:
				return getQualifier();
			case TermPackage.CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TermPackage.CODE_SYSTEM_CONSTRAINT__REFERENCE:
				return reference != null;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null
						? identifier != null
						: !IDENTIFIER_EDEFAULT.equals(identifier);
			case TermPackage.CODE_SYSTEM_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case TermPackage.CODE_SYSTEM_CONSTRAINT__VERSION:
				return VERSION_EDEFAULT == null
						? version != null
						: !VERSION_EDEFAULT.equals(version);
			case TermPackage.CODE_SYSTEM_CONSTRAINT__BINDING:
				return binding != BINDING_EDEFAULT;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__CODE:
				return CODE_EDEFAULT == null
						? code != null
						: !CODE_EDEFAULT.equals(code);
			case TermPackage.CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null
						? displayName != null
						: !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case TermPackage.CODE_SYSTEM_CONSTRAINT__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case TermPackage.CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TermPackage.CODE_SYSTEM_CONSTRAINT__REFERENCE:
				setReference((CodeSystemVersion) newValue);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__IDENTIFIER:
				setIdentifier((String) newValue);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__NAME:
				setName((String) newValue);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__VERSION:
				setVersion((String) newValue);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__BINDING:
				setBinding((BindingKind) newValue);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__CODE:
				setCode((String) newValue);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME:
				setDisplayName((String) newValue);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends CR>) newValue);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY:
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
	protected EClass eStaticClass() {
		return TermPackage.Literals.CODE_SYSTEM_CONSTRAINT;
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
			case TermPackage.CODE_SYSTEM_CONSTRAINT__REFERENCE:
				setReference((CodeSystemVersion) null);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__BINDING:
				setBinding(BINDING_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__QUALIFIER:
				getQualifier().clear();
				return;
			case TermPackage.CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY:
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
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject) base_Property;
			base_Property = (Property) eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, TermPackage.CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY,
						oldBase_Property, base_Property));
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
	public BindingKind getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CR> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectResolvingEList<CR>(CR.class, this, TermPackage.CODE_SYSTEM_CONSTRAINT__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersion getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject) reference;
			reference = (CodeSystemVersion) eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, TermPackage.CODE_SYSTEM_CONSTRAINT__REFERENCE, oldReference,
						reference));
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
	public String getVersion() {
		return version;
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
				this, Notification.SET, TermPackage.CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY, oldBase_Property,
				base_Property));
		}
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
				this, Notification.SET, TermPackage.CODE_SYSTEM_CONSTRAINT__BINDING, oldBinding, binding));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.CODE_SYSTEM_CONSTRAINT__CODE, oldCode, code));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME, oldDisplayName, displayName));
		}
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
				this, Notification.SET, TermPackage.CODE_SYSTEM_CONSTRAINT__IDENTIFIER, oldIdentifier, identifier));
		}
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
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.CODE_SYSTEM_CONSTRAINT__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReference(CodeSystemVersion newReference) {
		CodeSystemVersion oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.CODE_SYSTEM_CONSTRAINT__REFERENCE, oldReference, reference));
		}
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
				this, Notification.SET, TermPackage.CODE_SYSTEM_CONSTRAINT__VERSION, oldVersion, version));
		}
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
		result.append(", code: ");
		result.append(code);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(')');
		return result.toString();
	}

} // CodeSystemConstraintImpl
