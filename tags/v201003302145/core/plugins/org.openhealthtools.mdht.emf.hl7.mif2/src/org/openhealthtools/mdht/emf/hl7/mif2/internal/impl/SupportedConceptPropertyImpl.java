/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PropertyDefaultHandlingKind;
import org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Concept Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptPropertyImpl#isApplyToValueSetsIndicator <em>Apply To Value Sets Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptPropertyImpl#getDefaultHandlingCode <em>Default Handling Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupportedConceptPropertyImpl extends SupportedPropertyImpl implements SupportedConceptProperty {
	/**
	 * The default value of the '{@link #isApplyToValueSetsIndicator() <em>Apply To Value Sets Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToValueSetsIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_TO_VALUE_SETS_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyToValueSetsIndicator() <em>Apply To Value Sets Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToValueSetsIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean applyToValueSetsIndicator = APPLY_TO_VALUE_SETS_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Apply To Value Sets Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applyToValueSetsIndicatorESet;

	/**
	 * The default value of the '{@link #getDefaultHandlingCode() <em>Default Handling Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHandlingCode()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyDefaultHandlingKind DEFAULT_HANDLING_CODE_EDEFAULT = PropertyDefaultHandlingKind.FLAT;

	/**
	 * The cached value of the '{@link #getDefaultHandlingCode() <em>Default Handling Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHandlingCode()
	 * @generated
	 * @ordered
	 */
	protected PropertyDefaultHandlingKind defaultHandlingCode = DEFAULT_HANDLING_CODE_EDEFAULT;

	/**
	 * This is true if the Default Handling Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultHandlingCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedConceptPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SUPPORTED_CONCEPT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyToValueSetsIndicator() {
		return applyToValueSetsIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyToValueSetsIndicator(boolean newApplyToValueSetsIndicator) {
		boolean oldApplyToValueSetsIndicator = applyToValueSetsIndicator;
		applyToValueSetsIndicator = newApplyToValueSetsIndicator;
		boolean oldApplyToValueSetsIndicatorESet = applyToValueSetsIndicatorESet;
		applyToValueSetsIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_PROPERTY__APPLY_TO_VALUE_SETS_INDICATOR, oldApplyToValueSetsIndicator, applyToValueSetsIndicator, !oldApplyToValueSetsIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplyToValueSetsIndicator() {
		boolean oldApplyToValueSetsIndicator = applyToValueSetsIndicator;
		boolean oldApplyToValueSetsIndicatorESet = applyToValueSetsIndicatorESet;
		applyToValueSetsIndicator = APPLY_TO_VALUE_SETS_INDICATOR_EDEFAULT;
		applyToValueSetsIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.SUPPORTED_CONCEPT_PROPERTY__APPLY_TO_VALUE_SETS_INDICATOR, oldApplyToValueSetsIndicator, APPLY_TO_VALUE_SETS_INDICATOR_EDEFAULT, oldApplyToValueSetsIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplyToValueSetsIndicator() {
		return applyToValueSetsIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefaultHandlingKind getDefaultHandlingCode() {
		return defaultHandlingCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultHandlingCode(PropertyDefaultHandlingKind newDefaultHandlingCode) {
		PropertyDefaultHandlingKind oldDefaultHandlingCode = defaultHandlingCode;
		defaultHandlingCode = newDefaultHandlingCode == null ? DEFAULT_HANDLING_CODE_EDEFAULT : newDefaultHandlingCode;
		boolean oldDefaultHandlingCodeESet = defaultHandlingCodeESet;
		defaultHandlingCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_PROPERTY__DEFAULT_HANDLING_CODE, oldDefaultHandlingCode, defaultHandlingCode, !oldDefaultHandlingCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultHandlingCode() {
		PropertyDefaultHandlingKind oldDefaultHandlingCode = defaultHandlingCode;
		boolean oldDefaultHandlingCodeESet = defaultHandlingCodeESet;
		defaultHandlingCode = DEFAULT_HANDLING_CODE_EDEFAULT;
		defaultHandlingCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.SUPPORTED_CONCEPT_PROPERTY__DEFAULT_HANDLING_CODE, oldDefaultHandlingCode, DEFAULT_HANDLING_CODE_EDEFAULT, oldDefaultHandlingCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultHandlingCode() {
		return defaultHandlingCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.SUPPORTED_CONCEPT_PROPERTY__APPLY_TO_VALUE_SETS_INDICATOR:
				return isApplyToValueSetsIndicator() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.SUPPORTED_CONCEPT_PROPERTY__DEFAULT_HANDLING_CODE:
				return getDefaultHandlingCode();
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
			case Mif2Package.SUPPORTED_CONCEPT_PROPERTY__APPLY_TO_VALUE_SETS_INDICATOR:
				setApplyToValueSetsIndicator(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.SUPPORTED_CONCEPT_PROPERTY__DEFAULT_HANDLING_CODE:
				setDefaultHandlingCode((PropertyDefaultHandlingKind)newValue);
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
			case Mif2Package.SUPPORTED_CONCEPT_PROPERTY__APPLY_TO_VALUE_SETS_INDICATOR:
				unsetApplyToValueSetsIndicator();
				return;
			case Mif2Package.SUPPORTED_CONCEPT_PROPERTY__DEFAULT_HANDLING_CODE:
				unsetDefaultHandlingCode();
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
			case Mif2Package.SUPPORTED_CONCEPT_PROPERTY__APPLY_TO_VALUE_SETS_INDICATOR:
				return isSetApplyToValueSetsIndicator();
			case Mif2Package.SUPPORTED_CONCEPT_PROPERTY__DEFAULT_HANDLING_CODE:
				return isSetDefaultHandlingCode();
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
		result.append(" (applyToValueSetsIndicator: ");
		if (applyToValueSetsIndicatorESet) result.append(applyToValueSetsIndicator); else result.append("<unset>");
		result.append(", defaultHandlingCode: ");
		if (defaultHandlingCodeESet) result.append(defaultHandlingCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SupportedConceptPropertyImpl
