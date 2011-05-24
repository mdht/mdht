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

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.AttributeValueRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ElementRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ElementValueRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementRefImpl#getContextRef <em>Context Ref</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementRefImpl#getContextElement <em>Context Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementRefImpl#getContextAttribute <em>Context Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementRefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementRefImpl#getRepetition <em>Repetition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementRefImpl extends ChangeImpl implements ElementRef {
	/**
	 * The cached value of the '{@link #getContextRef() <em>Context Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextRef()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contextRef;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepetition() <em>Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger REPETITION_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getRepetition() <em>Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger repetition = REPETITION_EDEFAULT;

	/**
	 * This is true if the Repetition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repetitionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ELEMENT_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContextRef() {
		if (contextRef == null) {
			contextRef = new BasicFeatureMap(this, Mif2Package.ELEMENT_REF__CONTEXT_REF);
		}
		return contextRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementValueRef> getContextElement() {
		return getContextRef().list(Mif2Package.Literals.ELEMENT_REF__CONTEXT_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueRef> getContextAttribute() {
		return getContextRef().list(Mif2Package.Literals.ELEMENT_REF__CONTEXT_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ELEMENT_REF__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRepetition() {
		return repetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetition(BigInteger newRepetition) {
		BigInteger oldRepetition = repetition;
		repetition = newRepetition;
		boolean oldRepetitionESet = repetitionESet;
		repetitionESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ELEMENT_REF__REPETITION, oldRepetition, repetition,
				!oldRepetitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepetition() {
		BigInteger oldRepetition = repetition;
		boolean oldRepetitionESet = repetitionESet;
		repetition = REPETITION_EDEFAULT;
		repetitionESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.ELEMENT_REF__REPETITION, oldRepetition, REPETITION_EDEFAULT,
				oldRepetitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepetition() {
		return repetitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ELEMENT_REF__CONTEXT_REF:
				return ((InternalEList<?>) getContextRef()).basicRemove(otherEnd, msgs);
			case Mif2Package.ELEMENT_REF__CONTEXT_ELEMENT:
				return ((InternalEList<?>) getContextElement()).basicRemove(otherEnd, msgs);
			case Mif2Package.ELEMENT_REF__CONTEXT_ATTRIBUTE:
				return ((InternalEList<?>) getContextAttribute()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.ELEMENT_REF__CONTEXT_REF:
				if (coreType) {
					return getContextRef();
				}
				return ((FeatureMap.Internal) getContextRef()).getWrapper();
			case Mif2Package.ELEMENT_REF__CONTEXT_ELEMENT:
				return getContextElement();
			case Mif2Package.ELEMENT_REF__CONTEXT_ATTRIBUTE:
				return getContextAttribute();
			case Mif2Package.ELEMENT_REF__NAME:
				return getName();
			case Mif2Package.ELEMENT_REF__REPETITION:
				return getRepetition();
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
			case Mif2Package.ELEMENT_REF__CONTEXT_REF:
				((FeatureMap.Internal) getContextRef()).set(newValue);
				return;
			case Mif2Package.ELEMENT_REF__CONTEXT_ELEMENT:
				getContextElement().clear();
				getContextElement().addAll((Collection<? extends ElementValueRef>) newValue);
				return;
			case Mif2Package.ELEMENT_REF__CONTEXT_ATTRIBUTE:
				getContextAttribute().clear();
				getContextAttribute().addAll((Collection<? extends AttributeValueRef>) newValue);
				return;
			case Mif2Package.ELEMENT_REF__NAME:
				setName((String) newValue);
				return;
			case Mif2Package.ELEMENT_REF__REPETITION:
				setRepetition((BigInteger) newValue);
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
			case Mif2Package.ELEMENT_REF__CONTEXT_REF:
				getContextRef().clear();
				return;
			case Mif2Package.ELEMENT_REF__CONTEXT_ELEMENT:
				getContextElement().clear();
				return;
			case Mif2Package.ELEMENT_REF__CONTEXT_ATTRIBUTE:
				getContextAttribute().clear();
				return;
			case Mif2Package.ELEMENT_REF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.ELEMENT_REF__REPETITION:
				unsetRepetition();
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
			case Mif2Package.ELEMENT_REF__CONTEXT_REF:
				return contextRef != null && !contextRef.isEmpty();
			case Mif2Package.ELEMENT_REF__CONTEXT_ELEMENT:
				return !getContextElement().isEmpty();
			case Mif2Package.ELEMENT_REF__CONTEXT_ATTRIBUTE:
				return !getContextAttribute().isEmpty();
			case Mif2Package.ELEMENT_REF__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case Mif2Package.ELEMENT_REF__REPETITION:
				return isSetRepetition();
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
		result.append(" (contextRef: ");
		result.append(contextRef);
		result.append(", name: ");
		result.append(name);
		result.append(", repetition: ");
		if (repetitionESet) {
			result.append(repetition);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // ElementRefImpl
