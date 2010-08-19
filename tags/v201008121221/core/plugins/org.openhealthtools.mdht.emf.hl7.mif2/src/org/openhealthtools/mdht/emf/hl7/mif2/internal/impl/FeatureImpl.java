/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind;
import org.openhealthtools.mdht.emf.hl7.mif2.DefaultDeterminerKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Feature;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FeatureImpl#getEnumerationValue <em>Enumeration Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FeatureImpl#getAllowedRange <em>Allowed Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FeatureImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FeatureImpl#getDefaultFrom <em>Default From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FeatureImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FeatureImpl#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FeatureImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FeatureImpl#getMaximumLength <em>Maximum Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FeatureImpl#getMinimumLength <em>Minimum Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends ModelElementImpl implements Feature {
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
	 * The cached value of the '{@link #getAllowedRange() <em>Allowed Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedRange()
	 * @generated
	 * @ordered
	 */
	protected EList<RangeDefinition> allowedRange;

	/**
	 * The default value of the '{@link #getConformance() <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected static final ConformanceKind CONFORMANCE_EDEFAULT = ConformanceKind.I;

	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected ConformanceKind conformance = CONFORMANCE_EDEFAULT;

	/**
	 * This is true if the Conformance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conformanceESet;

	/**
	 * The default value of the '{@link #getDefaultFrom() <em>Default From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFrom()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultDeterminerKind DEFAULT_FROM_EDEFAULT = DefaultDeterminerKind.ITS;

	/**
	 * The cached value of the '{@link #getDefaultFrom() <em>Default From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFrom()
	 * @generated
	 * @ordered
	 */
	protected DefaultDeterminerKind defaultFrom = DEFAULT_FROM_EDEFAULT;

	/**
	 * This is true if the Default From attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultFromESet;

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
	 * The default value of the '{@link #getFixedValue() <em>Fixed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedValue() <em>Fixed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedValue()
	 * @generated
	 * @ordered
	 */
	protected String fixedValue = FIXED_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * This is true if the Is Mandatory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatoryESet;

	/**
	 * The default value of the '{@link #getMaximumLength() <em>Maximum Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumLength() <em>Maximum Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLength()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maximumLength = MAXIMUM_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumLength() <em>Minimum Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINIMUM_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumLength() <em>Minimum Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumLength()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minimumLength = MINIMUM_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnumerationValue() {
		if (enumerationValue == null) {
			enumerationValue = new EDataTypeEList<String>(String.class, this, Mif2Package.FEATURE__ENUMERATION_VALUE);
		}
		return enumerationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RangeDefinition> getAllowedRange() {
		if (allowedRange == null) {
			allowedRange = new EObjectContainmentEList<RangeDefinition>(RangeDefinition.class, this, Mif2Package.FEATURE__ALLOWED_RANGE);
		}
		return allowedRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceKind getConformance() {
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformance(ConformanceKind newConformance) {
		ConformanceKind oldConformance = conformance;
		conformance = newConformance == null ? CONFORMANCE_EDEFAULT : newConformance;
		boolean oldConformanceESet = conformanceESet;
		conformanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.FEATURE__CONFORMANCE, oldConformance, conformance, !oldConformanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConformance() {
		ConformanceKind oldConformance = conformance;
		boolean oldConformanceESet = conformanceESet;
		conformance = CONFORMANCE_EDEFAULT;
		conformanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.FEATURE__CONFORMANCE, oldConformance, CONFORMANCE_EDEFAULT, oldConformanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConformance() {
		return conformanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultDeterminerKind getDefaultFrom() {
		return defaultFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFrom(DefaultDeterminerKind newDefaultFrom) {
		DefaultDeterminerKind oldDefaultFrom = defaultFrom;
		defaultFrom = newDefaultFrom == null ? DEFAULT_FROM_EDEFAULT : newDefaultFrom;
		boolean oldDefaultFromESet = defaultFromESet;
		defaultFromESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.FEATURE__DEFAULT_FROM, oldDefaultFrom, defaultFrom, !oldDefaultFromESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultFrom() {
		DefaultDeterminerKind oldDefaultFrom = defaultFrom;
		boolean oldDefaultFromESet = defaultFromESet;
		defaultFrom = DEFAULT_FROM_EDEFAULT;
		defaultFromESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.FEATURE__DEFAULT_FROM, oldDefaultFrom, DEFAULT_FROM_EDEFAULT, oldDefaultFromESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultFrom() {
		return defaultFromESet;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.FEATURE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFixedValue() {
		return fixedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedValue(String newFixedValue) {
		String oldFixedValue = fixedValue;
		fixedValue = newFixedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.FEATURE__FIXED_VALUE, oldFixedValue, fixedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		boolean oldIsMandatoryESet = isMandatoryESet;
		isMandatoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.FEATURE__IS_MANDATORY, oldIsMandatory, isMandatory, !oldIsMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsMandatory() {
		boolean oldIsMandatory = isMandatory;
		boolean oldIsMandatoryESet = isMandatoryESet;
		isMandatory = IS_MANDATORY_EDEFAULT;
		isMandatoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.FEATURE__IS_MANDATORY, oldIsMandatory, IS_MANDATORY_EDEFAULT, oldIsMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsMandatory() {
		return isMandatoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaximumLength() {
		return maximumLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumLength(BigInteger newMaximumLength) {
		BigInteger oldMaximumLength = maximumLength;
		maximumLength = newMaximumLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.FEATURE__MAXIMUM_LENGTH, oldMaximumLength, maximumLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinimumLength() {
		return minimumLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumLength(BigInteger newMinimumLength) {
		BigInteger oldMinimumLength = minimumLength;
		minimumLength = newMinimumLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.FEATURE__MINIMUM_LENGTH, oldMinimumLength, minimumLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.FEATURE__ALLOWED_RANGE:
				return ((InternalEList<?>)getAllowedRange()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.FEATURE__ENUMERATION_VALUE:
				return getEnumerationValue();
			case Mif2Package.FEATURE__ALLOWED_RANGE:
				return getAllowedRange();
			case Mif2Package.FEATURE__CONFORMANCE:
				return getConformance();
			case Mif2Package.FEATURE__DEFAULT_FROM:
				return getDefaultFrom();
			case Mif2Package.FEATURE__DEFAULT_VALUE:
				return getDefaultValue();
			case Mif2Package.FEATURE__FIXED_VALUE:
				return getFixedValue();
			case Mif2Package.FEATURE__IS_MANDATORY:
				return isIsMandatory() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.FEATURE__MAXIMUM_LENGTH:
				return getMaximumLength();
			case Mif2Package.FEATURE__MINIMUM_LENGTH:
				return getMinimumLength();
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
			case Mif2Package.FEATURE__ENUMERATION_VALUE:
				getEnumerationValue().clear();
				getEnumerationValue().addAll((Collection<? extends String>)newValue);
				return;
			case Mif2Package.FEATURE__ALLOWED_RANGE:
				getAllowedRange().clear();
				getAllowedRange().addAll((Collection<? extends RangeDefinition>)newValue);
				return;
			case Mif2Package.FEATURE__CONFORMANCE:
				setConformance((ConformanceKind)newValue);
				return;
			case Mif2Package.FEATURE__DEFAULT_FROM:
				setDefaultFrom((DefaultDeterminerKind)newValue);
				return;
			case Mif2Package.FEATURE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case Mif2Package.FEATURE__FIXED_VALUE:
				setFixedValue((String)newValue);
				return;
			case Mif2Package.FEATURE__IS_MANDATORY:
				setIsMandatory(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.FEATURE__MAXIMUM_LENGTH:
				setMaximumLength((BigInteger)newValue);
				return;
			case Mif2Package.FEATURE__MINIMUM_LENGTH:
				setMinimumLength((BigInteger)newValue);
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
			case Mif2Package.FEATURE__ENUMERATION_VALUE:
				getEnumerationValue().clear();
				return;
			case Mif2Package.FEATURE__ALLOWED_RANGE:
				getAllowedRange().clear();
				return;
			case Mif2Package.FEATURE__CONFORMANCE:
				unsetConformance();
				return;
			case Mif2Package.FEATURE__DEFAULT_FROM:
				unsetDefaultFrom();
				return;
			case Mif2Package.FEATURE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case Mif2Package.FEATURE__FIXED_VALUE:
				setFixedValue(FIXED_VALUE_EDEFAULT);
				return;
			case Mif2Package.FEATURE__IS_MANDATORY:
				unsetIsMandatory();
				return;
			case Mif2Package.FEATURE__MAXIMUM_LENGTH:
				setMaximumLength(MAXIMUM_LENGTH_EDEFAULT);
				return;
			case Mif2Package.FEATURE__MINIMUM_LENGTH:
				setMinimumLength(MINIMUM_LENGTH_EDEFAULT);
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
			case Mif2Package.FEATURE__ENUMERATION_VALUE:
				return enumerationValue != null && !enumerationValue.isEmpty();
			case Mif2Package.FEATURE__ALLOWED_RANGE:
				return allowedRange != null && !allowedRange.isEmpty();
			case Mif2Package.FEATURE__CONFORMANCE:
				return isSetConformance();
			case Mif2Package.FEATURE__DEFAULT_FROM:
				return isSetDefaultFrom();
			case Mif2Package.FEATURE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case Mif2Package.FEATURE__FIXED_VALUE:
				return FIXED_VALUE_EDEFAULT == null ? fixedValue != null : !FIXED_VALUE_EDEFAULT.equals(fixedValue);
			case Mif2Package.FEATURE__IS_MANDATORY:
				return isSetIsMandatory();
			case Mif2Package.FEATURE__MAXIMUM_LENGTH:
				return MAXIMUM_LENGTH_EDEFAULT == null ? maximumLength != null : !MAXIMUM_LENGTH_EDEFAULT.equals(maximumLength);
			case Mif2Package.FEATURE__MINIMUM_LENGTH:
				return MINIMUM_LENGTH_EDEFAULT == null ? minimumLength != null : !MINIMUM_LENGTH_EDEFAULT.equals(minimumLength);
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
		result.append(" (enumerationValue: ");
		result.append(enumerationValue);
		result.append(", conformance: ");
		if (conformanceESet) result.append(conformance); else result.append("<unset>");
		result.append(", defaultFrom: ");
		if (defaultFromESet) result.append(defaultFrom); else result.append("<unset>");
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", fixedValue: ");
		result.append(fixedValue);
		result.append(", isMandatory: ");
		if (isMandatoryESet) result.append(isMandatory); else result.append("<unset>");
		result.append(", maximumLength: ");
		result.append(maximumLength);
		result.append(", minimumLength: ");
		result.append(minimumLength);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
