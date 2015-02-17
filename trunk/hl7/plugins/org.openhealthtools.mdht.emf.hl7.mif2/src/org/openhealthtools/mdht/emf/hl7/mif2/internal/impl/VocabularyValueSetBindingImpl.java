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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.CodingStrengthKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RevisionFrequencyKind;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary Value Set Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyValueSetBindingImpl#getCodingStrength <em>Coding Strength</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyValueSetBindingImpl#getIgnoredValueSet <em>Ignored Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyValueSetBindingImpl#getMinimumValueSet <em>Minimum Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyValueSetBindingImpl#getRevisionFrequency <em>Revision Frequency</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyValueSetBindingImpl#getRootCode <em>Root Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocabularyValueSetBindingImpl extends VocabularyValueSetRefImpl implements VocabularyValueSetBinding {
	/**
	 * The default value of the '{@link #getCodingStrength() <em>Coding Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodingStrength()
	 * @generated
	 * @ordered
	 */
	protected static final CodingStrengthKind CODING_STRENGTH_EDEFAULT = CodingStrengthKind.CNE;

	/**
	 * The cached value of the '{@link #getCodingStrength() <em>Coding Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodingStrength()
	 * @generated
	 * @ordered
	 */
	protected CodingStrengthKind codingStrength = CODING_STRENGTH_EDEFAULT;

	/**
	 * This is true if the Coding Strength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codingStrengthESet;

	/**
	 * The default value of the '{@link #getIgnoredValueSet() <em>Ignored Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoredValueSet()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORED_VALUE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoredValueSet() <em>Ignored Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoredValueSet()
	 * @generated
	 * @ordered
	 */
	protected String ignoredValueSet = IGNORED_VALUE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumValueSet() <em>Minimum Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValueSet()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_VALUE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumValueSet() <em>Minimum Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValueSet()
	 * @generated
	 * @ordered
	 */
	protected String minimumValueSet = MINIMUM_VALUE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionFrequency() <em>Revision Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final RevisionFrequencyKind REVISION_FREQUENCY_EDEFAULT = RevisionFrequencyKind.EDITION;

	/**
	 * The cached value of the '{@link #getRevisionFrequency() <em>Revision Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionFrequency()
	 * @generated
	 * @ordered
	 */
	protected RevisionFrequencyKind revisionFrequency = REVISION_FREQUENCY_EDEFAULT;

	/**
	 * This is true if the Revision Frequency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisionFrequencyESet;

	/**
	 * The default value of the '{@link #getRootCode() <em>Root Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootCode() <em>Root Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCode()
	 * @generated
	 * @ordered
	 */
	protected String rootCode = ROOT_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyValueSetBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.VOCABULARY_VALUE_SET_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingStrengthKind getCodingStrength() {
		return codingStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodingStrength(CodingStrengthKind newCodingStrength) {
		CodingStrengthKind oldCodingStrength = codingStrength;
		codingStrength = newCodingStrength == null
				? CODING_STRENGTH_EDEFAULT
				: newCodingStrength;
		boolean oldCodingStrengthESet = codingStrengthESet;
		codingStrengthESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_VALUE_SET_BINDING__CODING_STRENGTH, oldCodingStrength,
				codingStrength, !oldCodingStrengthESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCodingStrength() {
		CodingStrengthKind oldCodingStrength = codingStrength;
		boolean oldCodingStrengthESet = codingStrengthESet;
		codingStrength = CODING_STRENGTH_EDEFAULT;
		codingStrengthESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.VOCABULARY_VALUE_SET_BINDING__CODING_STRENGTH, oldCodingStrength,
				CODING_STRENGTH_EDEFAULT, oldCodingStrengthESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCodingStrength() {
		return codingStrengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIgnoredValueSet() {
		return ignoredValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoredValueSet(String newIgnoredValueSet) {
		String oldIgnoredValueSet = ignoredValueSet;
		ignoredValueSet = newIgnoredValueSet;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_VALUE_SET_BINDING__IGNORED_VALUE_SET,
				oldIgnoredValueSet, ignoredValueSet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimumValueSet() {
		return minimumValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumValueSet(String newMinimumValueSet) {
		String oldMinimumValueSet = minimumValueSet;
		minimumValueSet = newMinimumValueSet;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_VALUE_SET_BINDING__MINIMUM_VALUE_SET,
				oldMinimumValueSet, minimumValueSet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionFrequencyKind getRevisionFrequency() {
		return revisionFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionFrequency(RevisionFrequencyKind newRevisionFrequency) {
		RevisionFrequencyKind oldRevisionFrequency = revisionFrequency;
		revisionFrequency = newRevisionFrequency == null
				? REVISION_FREQUENCY_EDEFAULT
				: newRevisionFrequency;
		boolean oldRevisionFrequencyESet = revisionFrequencyESet;
		revisionFrequencyESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_VALUE_SET_BINDING__REVISION_FREQUENCY,
				oldRevisionFrequency, revisionFrequency, !oldRevisionFrequencyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevisionFrequency() {
		RevisionFrequencyKind oldRevisionFrequency = revisionFrequency;
		boolean oldRevisionFrequencyESet = revisionFrequencyESet;
		revisionFrequency = REVISION_FREQUENCY_EDEFAULT;
		revisionFrequencyESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.VOCABULARY_VALUE_SET_BINDING__REVISION_FREQUENCY,
				oldRevisionFrequency, REVISION_FREQUENCY_EDEFAULT, oldRevisionFrequencyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevisionFrequency() {
		return revisionFrequencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootCode() {
		return rootCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootCode(String newRootCode) {
		String oldRootCode = rootCode;
		rootCode = newRootCode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_VALUE_SET_BINDING__ROOT_CODE, oldRootCode, rootCode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__CODING_STRENGTH:
				return getCodingStrength();
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__IGNORED_VALUE_SET:
				return getIgnoredValueSet();
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__MINIMUM_VALUE_SET:
				return getMinimumValueSet();
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__REVISION_FREQUENCY:
				return getRevisionFrequency();
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__ROOT_CODE:
				return getRootCode();
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
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__CODING_STRENGTH:
				setCodingStrength((CodingStrengthKind) newValue);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__IGNORED_VALUE_SET:
				setIgnoredValueSet((String) newValue);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__MINIMUM_VALUE_SET:
				setMinimumValueSet((String) newValue);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__REVISION_FREQUENCY:
				setRevisionFrequency((RevisionFrequencyKind) newValue);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__ROOT_CODE:
				setRootCode((String) newValue);
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
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__CODING_STRENGTH:
				unsetCodingStrength();
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__IGNORED_VALUE_SET:
				setIgnoredValueSet(IGNORED_VALUE_SET_EDEFAULT);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__MINIMUM_VALUE_SET:
				setMinimumValueSet(MINIMUM_VALUE_SET_EDEFAULT);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__REVISION_FREQUENCY:
				unsetRevisionFrequency();
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__ROOT_CODE:
				setRootCode(ROOT_CODE_EDEFAULT);
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
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__CODING_STRENGTH:
				return isSetCodingStrength();
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__IGNORED_VALUE_SET:
				return IGNORED_VALUE_SET_EDEFAULT == null
						? ignoredValueSet != null
						: !IGNORED_VALUE_SET_EDEFAULT.equals(ignoredValueSet);
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__MINIMUM_VALUE_SET:
				return MINIMUM_VALUE_SET_EDEFAULT == null
						? minimumValueSet != null
						: !MINIMUM_VALUE_SET_EDEFAULT.equals(minimumValueSet);
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__REVISION_FREQUENCY:
				return isSetRevisionFrequency();
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING__ROOT_CODE:
				return ROOT_CODE_EDEFAULT == null
						? rootCode != null
						: !ROOT_CODE_EDEFAULT.equals(rootCode);
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
		result.append(" (codingStrength: ");
		if (codingStrengthESet) {
			result.append(codingStrength);
		} else {
			result.append("<unset>");
		}
		result.append(", ignoredValueSet: ");
		result.append(ignoredValueSet);
		result.append(", minimumValueSet: ");
		result.append(minimumValueSet);
		result.append(", revisionFrequency: ");
		if (revisionFrequencyESet) {
			result.append(revisionFrequency);
		} else {
			result.append("<unset>");
		}
		result.append(", rootCode: ");
		result.append(rootCode);
		result.append(')');
		return result.toString();
	}

} // VocabularyValueSetBindingImpl
