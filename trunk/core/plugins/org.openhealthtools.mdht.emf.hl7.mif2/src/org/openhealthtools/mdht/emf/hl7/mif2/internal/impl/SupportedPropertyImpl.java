/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyTypeKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty;
import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedPropertyImpl#getEnumerationValue <em>Enumeration Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedPropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedPropertyImpl#isIsMandatoryIndicator <em>Is Mandatory Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedPropertyImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedPropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupportedPropertyImpl extends EObjectImpl implements SupportedProperty {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Inline description;

	/**
	 * The cached value of the '{@link #getEnumerationValue() <em>Enumeration Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> enumerationValue;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatoryIndicator() <em>Is Mandatory Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatoryIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatoryIndicator() <em>Is Mandatory Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatoryIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatoryIndicator = IS_MANDATORY_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Is Mandatory Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatoryIndicatorESet;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConceptPropertyTypeKind TYPE_EDEFAULT = ConceptPropertyTypeKind.BOOLEAN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConceptPropertyTypeKind type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SUPPORTED_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inline getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Inline newDescription, NotificationChain msgs) {
		Inline oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.SUPPORTED_PROPERTY__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Inline newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null) {
				msgs = ((InternalEObject) description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SUPPORTED_PROPERTY__DESCRIPTION, null, msgs);
			}
			if (newDescription != null) {
				msgs = ((InternalEObject) newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SUPPORTED_PROPERTY__DESCRIPTION, null, msgs);
			}
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SUPPORTED_PROPERTY__DESCRIPTION, newDescription, newDescription));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnumerationValue() {
		if (enumerationValue == null) {
			enumerationValue = new EDataTypeEList<String>(
				String.class, this, Mif2Package.SUPPORTED_PROPERTY__ENUMERATION_VALUE);
		}
		return enumerationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SUPPORTED_PROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatoryIndicator() {
		return isMandatoryIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatoryIndicator(boolean newIsMandatoryIndicator) {
		boolean oldIsMandatoryIndicator = isMandatoryIndicator;
		isMandatoryIndicator = newIsMandatoryIndicator;
		boolean oldIsMandatoryIndicatorESet = isMandatoryIndicatorESet;
		isMandatoryIndicatorESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SUPPORTED_PROPERTY__IS_MANDATORY_INDICATOR,
				oldIsMandatoryIndicator, isMandatoryIndicator, !oldIsMandatoryIndicatorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsMandatoryIndicator() {
		boolean oldIsMandatoryIndicator = isMandatoryIndicator;
		boolean oldIsMandatoryIndicatorESet = isMandatoryIndicatorESet;
		isMandatoryIndicator = IS_MANDATORY_INDICATOR_EDEFAULT;
		isMandatoryIndicatorESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.SUPPORTED_PROPERTY__IS_MANDATORY_INDICATOR,
				oldIsMandatoryIndicator, IS_MANDATORY_INDICATOR_EDEFAULT, oldIsMandatoryIndicatorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsMandatoryIndicator() {
		return isMandatoryIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SUPPORTED_PROPERTY__PROPERTY_NAME, oldPropertyName, propertyName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptPropertyTypeKind getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConceptPropertyTypeKind newType) {
		ConceptPropertyTypeKind oldType = type;
		type = newType == null
				? TYPE_EDEFAULT
				: newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SUPPORTED_PROPERTY__TYPE, oldType, type, !oldTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		ConceptPropertyTypeKind oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.SUPPORTED_PROPERTY__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.SUPPORTED_PROPERTY__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case Mif2Package.SUPPORTED_PROPERTY__DESCRIPTION:
				return getDescription();
			case Mif2Package.SUPPORTED_PROPERTY__ENUMERATION_VALUE:
				return getEnumerationValue();
			case Mif2Package.SUPPORTED_PROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case Mif2Package.SUPPORTED_PROPERTY__IS_MANDATORY_INDICATOR:
				return isIsMandatoryIndicator()
						? Boolean.TRUE
						: Boolean.FALSE;
			case Mif2Package.SUPPORTED_PROPERTY__PROPERTY_NAME:
				return getPropertyName();
			case Mif2Package.SUPPORTED_PROPERTY__TYPE:
				return getType();
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
			case Mif2Package.SUPPORTED_PROPERTY__DESCRIPTION:
				setDescription((Inline) newValue);
				return;
			case Mif2Package.SUPPORTED_PROPERTY__ENUMERATION_VALUE:
				getEnumerationValue().clear();
				getEnumerationValue().addAll((Collection<? extends String>) newValue);
				return;
			case Mif2Package.SUPPORTED_PROPERTY__DEFAULT_VALUE:
				setDefaultValue((String) newValue);
				return;
			case Mif2Package.SUPPORTED_PROPERTY__IS_MANDATORY_INDICATOR:
				setIsMandatoryIndicator(((Boolean) newValue).booleanValue());
				return;
			case Mif2Package.SUPPORTED_PROPERTY__PROPERTY_NAME:
				setPropertyName((String) newValue);
				return;
			case Mif2Package.SUPPORTED_PROPERTY__TYPE:
				setType((ConceptPropertyTypeKind) newValue);
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
			case Mif2Package.SUPPORTED_PROPERTY__DESCRIPTION:
				setDescription((Inline) null);
				return;
			case Mif2Package.SUPPORTED_PROPERTY__ENUMERATION_VALUE:
				getEnumerationValue().clear();
				return;
			case Mif2Package.SUPPORTED_PROPERTY__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case Mif2Package.SUPPORTED_PROPERTY__IS_MANDATORY_INDICATOR:
				unsetIsMandatoryIndicator();
				return;
			case Mif2Package.SUPPORTED_PROPERTY__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case Mif2Package.SUPPORTED_PROPERTY__TYPE:
				unsetType();
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
			case Mif2Package.SUPPORTED_PROPERTY__DESCRIPTION:
				return description != null;
			case Mif2Package.SUPPORTED_PROPERTY__ENUMERATION_VALUE:
				return enumerationValue != null && !enumerationValue.isEmpty();
			case Mif2Package.SUPPORTED_PROPERTY__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null
						? defaultValue != null
						: !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case Mif2Package.SUPPORTED_PROPERTY__IS_MANDATORY_INDICATOR:
				return isSetIsMandatoryIndicator();
			case Mif2Package.SUPPORTED_PROPERTY__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null
						? propertyName != null
						: !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case Mif2Package.SUPPORTED_PROPERTY__TYPE:
				return isSetType();
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (enumerationValue: ");
		result.append(enumerationValue);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", isMandatoryIndicator: ");
		if (isMandatoryIndicatorESet) {
			result.append(isMandatoryIndicator);
		} else {
			result.append("<unset>");
		}
		result.append(", propertyName: ");
		result.append(propertyName);
		result.append(", type: ");
		if (typeESet) {
			result.append(type);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // SupportedPropertyImpl
