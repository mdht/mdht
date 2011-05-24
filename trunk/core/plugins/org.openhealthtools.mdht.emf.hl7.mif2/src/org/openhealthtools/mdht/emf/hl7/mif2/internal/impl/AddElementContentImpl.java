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

import org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent;
import org.openhealthtools.mdht.emf.hl7.mif2.AttributeContent;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.MifContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Element Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AddElementContentImpl#getReplacementContent <em>Replacement Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AddElementContentImpl#getAddElements <em>Add Elements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AddElementContentImpl#getAddAttribute <em>Add Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AddElementContentImpl#getAddElement <em>Add Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AddElementContentImpl#getAfterElementName <em>After Element Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AddElementContentImpl#getAfterRepetition <em>After Repetition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AddElementContentImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddElementContentImpl extends ChangeImpl implements AddElementContent {
	/**
	 * The cached value of the '{@link #getReplacementContent() <em>Replacement Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementContent()
	 * @generated
	 * @ordered
	 */
	protected MifContent replacementContent;

	/**
	 * The cached value of the '{@link #getAddElements() <em>Add Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddElements()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap addElements;

	/**
	 * The default value of the '{@link #getAfterElementName() <em>After Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAfterElementName() <em>After Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterElementName()
	 * @generated
	 * @ordered
	 */
	protected String afterElementName = AFTER_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAfterRepetition() <em>After Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterRepetition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger AFTER_REPETITION_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getAfterRepetition() <em>After Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterRepetition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger afterRepetition = AFTER_REPETITION_EDEFAULT;

	/**
	 * This is true if the After Repetition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean afterRepetitionESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddElementContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ADD_ELEMENT_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MifContent getReplacementContent() {
		return replacementContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplacementContent(MifContent newReplacementContent, NotificationChain msgs) {
		MifContent oldReplacementContent = replacementContent;
		replacementContent = newReplacementContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.ADD_ELEMENT_CONTENT__REPLACEMENT_CONTENT, oldReplacementContent,
				newReplacementContent);
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
	public void setReplacementContent(MifContent newReplacementContent) {
		if (newReplacementContent != replacementContent) {
			NotificationChain msgs = null;
			if (replacementContent != null) {
				msgs = ((InternalEObject) replacementContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ADD_ELEMENT_CONTENT__REPLACEMENT_CONTENT, null, msgs);
			}
			if (newReplacementContent != null) {
				msgs = ((InternalEObject) newReplacementContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ADD_ELEMENT_CONTENT__REPLACEMENT_CONTENT, null, msgs);
			}
			msgs = basicSetReplacementContent(newReplacementContent, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ADD_ELEMENT_CONTENT__REPLACEMENT_CONTENT, newReplacementContent,
				newReplacementContent));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAddElements() {
		if (addElements == null) {
			addElements = new BasicFeatureMap(this, Mif2Package.ADD_ELEMENT_CONTENT__ADD_ELEMENTS);
		}
		return addElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeContent> getAddAttribute() {
		return getAddElements().list(Mif2Package.Literals.ADD_ELEMENT_CONTENT__ADD_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddElementContent> getAddElement() {
		return getAddElements().list(Mif2Package.Literals.ADD_ELEMENT_CONTENT__ADD_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterElementName() {
		return afterElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterElementName(String newAfterElementName) {
		String oldAfterElementName = afterElementName;
		afterElementName = newAfterElementName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ADD_ELEMENT_CONTENT__AFTER_ELEMENT_NAME, oldAfterElementName,
				afterElementName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAfterRepetition() {
		return afterRepetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterRepetition(BigInteger newAfterRepetition) {
		BigInteger oldAfterRepetition = afterRepetition;
		afterRepetition = newAfterRepetition;
		boolean oldAfterRepetitionESet = afterRepetitionESet;
		afterRepetitionESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ADD_ELEMENT_CONTENT__AFTER_REPETITION, oldAfterRepetition,
				afterRepetition, !oldAfterRepetitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAfterRepetition() {
		BigInteger oldAfterRepetition = afterRepetition;
		boolean oldAfterRepetitionESet = afterRepetitionESet;
		afterRepetition = AFTER_REPETITION_EDEFAULT;
		afterRepetitionESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.ADD_ELEMENT_CONTENT__AFTER_REPETITION, oldAfterRepetition,
				AFTER_REPETITION_EDEFAULT, oldAfterRepetitionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAfterRepetition() {
		return afterRepetitionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ADD_ELEMENT_CONTENT__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ADD_ELEMENT_CONTENT__REPLACEMENT_CONTENT:
				return basicSetReplacementContent(null, msgs);
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ELEMENTS:
				return ((InternalEList<?>) getAddElements()).basicRemove(otherEnd, msgs);
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ATTRIBUTE:
				return ((InternalEList<?>) getAddAttribute()).basicRemove(otherEnd, msgs);
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ELEMENT:
				return ((InternalEList<?>) getAddElement()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.ADD_ELEMENT_CONTENT__REPLACEMENT_CONTENT:
				return getReplacementContent();
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ELEMENTS:
				if (coreType) {
					return getAddElements();
				}
				return ((FeatureMap.Internal) getAddElements()).getWrapper();
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ATTRIBUTE:
				return getAddAttribute();
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ELEMENT:
				return getAddElement();
			case Mif2Package.ADD_ELEMENT_CONTENT__AFTER_ELEMENT_NAME:
				return getAfterElementName();
			case Mif2Package.ADD_ELEMENT_CONTENT__AFTER_REPETITION:
				return getAfterRepetition();
			case Mif2Package.ADD_ELEMENT_CONTENT__NAME:
				return getName();
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
			case Mif2Package.ADD_ELEMENT_CONTENT__REPLACEMENT_CONTENT:
				setReplacementContent((MifContent) newValue);
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ELEMENTS:
				((FeatureMap.Internal) getAddElements()).set(newValue);
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ATTRIBUTE:
				getAddAttribute().clear();
				getAddAttribute().addAll((Collection<? extends AttributeContent>) newValue);
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ELEMENT:
				getAddElement().clear();
				getAddElement().addAll((Collection<? extends AddElementContent>) newValue);
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__AFTER_ELEMENT_NAME:
				setAfterElementName((String) newValue);
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__AFTER_REPETITION:
				setAfterRepetition((BigInteger) newValue);
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__NAME:
				setName((String) newValue);
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
			case Mif2Package.ADD_ELEMENT_CONTENT__REPLACEMENT_CONTENT:
				setReplacementContent((MifContent) null);
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ELEMENTS:
				getAddElements().clear();
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ATTRIBUTE:
				getAddAttribute().clear();
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ELEMENT:
				getAddElement().clear();
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__AFTER_ELEMENT_NAME:
				setAfterElementName(AFTER_ELEMENT_NAME_EDEFAULT);
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__AFTER_REPETITION:
				unsetAfterRepetition();
				return;
			case Mif2Package.ADD_ELEMENT_CONTENT__NAME:
				setName(NAME_EDEFAULT);
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
			case Mif2Package.ADD_ELEMENT_CONTENT__REPLACEMENT_CONTENT:
				return replacementContent != null;
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ELEMENTS:
				return addElements != null && !addElements.isEmpty();
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ATTRIBUTE:
				return !getAddAttribute().isEmpty();
			case Mif2Package.ADD_ELEMENT_CONTENT__ADD_ELEMENT:
				return !getAddElement().isEmpty();
			case Mif2Package.ADD_ELEMENT_CONTENT__AFTER_ELEMENT_NAME:
				return AFTER_ELEMENT_NAME_EDEFAULT == null
						? afterElementName != null
						: !AFTER_ELEMENT_NAME_EDEFAULT.equals(afterElementName);
			case Mif2Package.ADD_ELEMENT_CONTENT__AFTER_REPETITION:
				return isSetAfterRepetition();
			case Mif2Package.ADD_ELEMENT_CONTENT__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
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
		result.append(" (addElements: ");
		result.append(addElements);
		result.append(", afterElementName: ");
		result.append(afterElementName);
		result.append(", afterRepetition: ");
		if (afterRepetitionESet) {
			result.append(afterRepetition);
		} else {
			result.append("<unset>");
		}
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // AddElementContentImpl
