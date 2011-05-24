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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.DurationUnitsKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary Limitation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyLimitationImpl#getDefinedVocabularyElement <em>Defined Vocabulary Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyLimitationImpl#getSubstituteVocabularyElement <em>Substitute Vocabulary Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyLimitationImpl#getMinimumUpdateTime <em>Minimum Update Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocabularyLimitationImpl extends EObjectImpl implements VocabularyLimitation {
	/**
	 * The cached value of the '{@link #getDefinedVocabularyElement() <em>Defined Vocabulary Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedVocabularyElement()
	 * @generated
	 * @ordered
	 */
	protected PackageRef definedVocabularyElement;

	/**
	 * The cached value of the '{@link #getSubstituteVocabularyElement() <em>Substitute Vocabulary Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstituteVocabularyElement()
	 * @generated
	 * @ordered
	 */
	protected PackageRef substituteVocabularyElement;

	/**
	 * The default value of the '{@link #getMinimumUpdateTime() <em>Minimum Update Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumUpdateTime()
	 * @generated
	 * @ordered
	 */
	protected static final DurationUnitsKind MINIMUM_UPDATE_TIME_EDEFAULT = DurationUnitsKind.MS;

	/**
	 * The cached value of the '{@link #getMinimumUpdateTime() <em>Minimum Update Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumUpdateTime()
	 * @generated
	 * @ordered
	 */
	protected DurationUnitsKind minimumUpdateTime = MINIMUM_UPDATE_TIME_EDEFAULT;

	/**
	 * This is true if the Minimum Update Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumUpdateTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyLimitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.VOCABULARY_LIMITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getDefinedVocabularyElement() {
		return definedVocabularyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedVocabularyElement(PackageRef newDefinedVocabularyElement,
			NotificationChain msgs) {
		PackageRef oldDefinedVocabularyElement = definedVocabularyElement;
		definedVocabularyElement = newDefinedVocabularyElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_LIMITATION__DEFINED_VOCABULARY_ELEMENT,
				oldDefinedVocabularyElement, newDefinedVocabularyElement);
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
	public void setDefinedVocabularyElement(PackageRef newDefinedVocabularyElement) {
		if (newDefinedVocabularyElement != definedVocabularyElement) {
			NotificationChain msgs = null;
			if (definedVocabularyElement != null) {
				msgs = ((InternalEObject) definedVocabularyElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VOCABULARY_LIMITATION__DEFINED_VOCABULARY_ELEMENT, null, msgs);
			}
			if (newDefinedVocabularyElement != null) {
				msgs = ((InternalEObject) newDefinedVocabularyElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VOCABULARY_LIMITATION__DEFINED_VOCABULARY_ELEMENT, null, msgs);
			}
			msgs = basicSetDefinedVocabularyElement(newDefinedVocabularyElement, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_LIMITATION__DEFINED_VOCABULARY_ELEMENT,
				newDefinedVocabularyElement, newDefinedVocabularyElement));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getSubstituteVocabularyElement() {
		return substituteVocabularyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstituteVocabularyElement(PackageRef newSubstituteVocabularyElement,
			NotificationChain msgs) {
		PackageRef oldSubstituteVocabularyElement = substituteVocabularyElement;
		substituteVocabularyElement = newSubstituteVocabularyElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_LIMITATION__SUBSTITUTE_VOCABULARY_ELEMENT,
				oldSubstituteVocabularyElement, newSubstituteVocabularyElement);
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
	public void setSubstituteVocabularyElement(PackageRef newSubstituteVocabularyElement) {
		if (newSubstituteVocabularyElement != substituteVocabularyElement) {
			NotificationChain msgs = null;
			if (substituteVocabularyElement != null) {
				msgs = ((InternalEObject) substituteVocabularyElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VOCABULARY_LIMITATION__SUBSTITUTE_VOCABULARY_ELEMENT, null, msgs);
			}
			if (newSubstituteVocabularyElement != null) {
				msgs = ((InternalEObject) newSubstituteVocabularyElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VOCABULARY_LIMITATION__SUBSTITUTE_VOCABULARY_ELEMENT, null, msgs);
			}
			msgs = basicSetSubstituteVocabularyElement(newSubstituteVocabularyElement, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_LIMITATION__SUBSTITUTE_VOCABULARY_ELEMENT,
				newSubstituteVocabularyElement, newSubstituteVocabularyElement));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationUnitsKind getMinimumUpdateTime() {
		return minimumUpdateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumUpdateTime(DurationUnitsKind newMinimumUpdateTime) {
		DurationUnitsKind oldMinimumUpdateTime = minimumUpdateTime;
		minimumUpdateTime = newMinimumUpdateTime == null
				? MINIMUM_UPDATE_TIME_EDEFAULT
				: newMinimumUpdateTime;
		boolean oldMinimumUpdateTimeESet = minimumUpdateTimeESet;
		minimumUpdateTimeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_LIMITATION__MINIMUM_UPDATE_TIME, oldMinimumUpdateTime,
				minimumUpdateTime, !oldMinimumUpdateTimeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumUpdateTime() {
		DurationUnitsKind oldMinimumUpdateTime = minimumUpdateTime;
		boolean oldMinimumUpdateTimeESet = minimumUpdateTimeESet;
		minimumUpdateTime = MINIMUM_UPDATE_TIME_EDEFAULT;
		minimumUpdateTimeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.VOCABULARY_LIMITATION__MINIMUM_UPDATE_TIME, oldMinimumUpdateTime,
				MINIMUM_UPDATE_TIME_EDEFAULT, oldMinimumUpdateTimeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumUpdateTime() {
		return minimumUpdateTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.VOCABULARY_LIMITATION__DEFINED_VOCABULARY_ELEMENT:
				return basicSetDefinedVocabularyElement(null, msgs);
			case Mif2Package.VOCABULARY_LIMITATION__SUBSTITUTE_VOCABULARY_ELEMENT:
				return basicSetSubstituteVocabularyElement(null, msgs);
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
			case Mif2Package.VOCABULARY_LIMITATION__DEFINED_VOCABULARY_ELEMENT:
				return getDefinedVocabularyElement();
			case Mif2Package.VOCABULARY_LIMITATION__SUBSTITUTE_VOCABULARY_ELEMENT:
				return getSubstituteVocabularyElement();
			case Mif2Package.VOCABULARY_LIMITATION__MINIMUM_UPDATE_TIME:
				return getMinimumUpdateTime();
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
			case Mif2Package.VOCABULARY_LIMITATION__DEFINED_VOCABULARY_ELEMENT:
				setDefinedVocabularyElement((PackageRef) newValue);
				return;
			case Mif2Package.VOCABULARY_LIMITATION__SUBSTITUTE_VOCABULARY_ELEMENT:
				setSubstituteVocabularyElement((PackageRef) newValue);
				return;
			case Mif2Package.VOCABULARY_LIMITATION__MINIMUM_UPDATE_TIME:
				setMinimumUpdateTime((DurationUnitsKind) newValue);
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
			case Mif2Package.VOCABULARY_LIMITATION__DEFINED_VOCABULARY_ELEMENT:
				setDefinedVocabularyElement((PackageRef) null);
				return;
			case Mif2Package.VOCABULARY_LIMITATION__SUBSTITUTE_VOCABULARY_ELEMENT:
				setSubstituteVocabularyElement((PackageRef) null);
				return;
			case Mif2Package.VOCABULARY_LIMITATION__MINIMUM_UPDATE_TIME:
				unsetMinimumUpdateTime();
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
			case Mif2Package.VOCABULARY_LIMITATION__DEFINED_VOCABULARY_ELEMENT:
				return definedVocabularyElement != null;
			case Mif2Package.VOCABULARY_LIMITATION__SUBSTITUTE_VOCABULARY_ELEMENT:
				return substituteVocabularyElement != null;
			case Mif2Package.VOCABULARY_LIMITATION__MINIMUM_UPDATE_TIME:
				return isSetMinimumUpdateTime();
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
		result.append(" (minimumUpdateTime: ");
		if (minimumUpdateTimeESet) {
			result.append(minimumUpdateTime);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // VocabularyLimitationImpl
