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
import org.openhealthtools.mdht.uml.cda.core.profile.ConceptDomainConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain;
import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Domain Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConceptDomainConstraintImpl#getReference <em>Reference</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConceptDomainConstraintImpl#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConceptDomainConstraintImpl#getName <em>Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConceptDomainConstraintImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptDomainConstraintImpl extends ValidationImpl implements ConceptDomainConstraint {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ConceptDomain reference;

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
	protected ConceptDomainConstraintImpl() {
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
		return CDAPackage.Literals.CONCEPT_DOMAIN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConceptDomain getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject) reference;
			reference = (ConceptDomain) eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__REFERENCE, oldReference,
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
	public ConceptDomain basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReference(ConceptDomain newReference) {
		ConceptDomain oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__REFERENCE, oldReference, reference));
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
				this, Notification.SET, CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__NAME, oldName, name));
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
						this, Notification.RESOLVE, CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY,
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
				this, Notification.SET, CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY, oldBase_Property,
				base_Property));
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
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__REFERENCE:
				if (resolve) {
					return getReference();
				}
				return basicGetReference();
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER:
				return getIdentifier();
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__NAME:
				return getName();
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY:
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
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__REFERENCE:
				setReference((ConceptDomain) newValue);
				return;
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER:
				setIdentifier((String) newValue);
				return;
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__NAME:
				setName((String) newValue);
				return;
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY:
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
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__REFERENCE:
				setReference((ConceptDomain) null);
				return;
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY:
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
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__REFERENCE:
				return reference != null;
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null
						? identifier != null
						: !IDENTIFIER_EDEFAULT.equals(identifier);
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY:
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
		if (baseClass == org.openhealthtools.mdht.uml.term.core.profile.ConceptDomainConstraint.class) {
			switch (derivedFeatureID) {
				case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__REFERENCE:
					return TermPackage.CONCEPT_DOMAIN_CONSTRAINT__REFERENCE;
				case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER:
					return TermPackage.CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER;
				case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__NAME:
					return TermPackage.CONCEPT_DOMAIN_CONSTRAINT__NAME;
				case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY:
					return TermPackage.CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY;
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
		if (baseClass == org.openhealthtools.mdht.uml.term.core.profile.ConceptDomainConstraint.class) {
			switch (baseFeatureID) {
				case TermPackage.CONCEPT_DOMAIN_CONSTRAINT__REFERENCE:
					return CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__REFERENCE;
				case TermPackage.CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER:
					return CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER;
				case TermPackage.CONCEPT_DOMAIN_CONSTRAINT__NAME:
					return CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__NAME;
				case TermPackage.CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY:
					return CDAPackage.CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY;
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
		result.append(')');
		return result.toString();
	}

} // ConceptDomainConstraintImpl
