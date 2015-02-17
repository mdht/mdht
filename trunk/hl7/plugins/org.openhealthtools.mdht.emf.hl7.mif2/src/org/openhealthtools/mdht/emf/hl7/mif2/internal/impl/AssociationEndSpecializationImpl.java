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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndSpecializationImpl#getChoiceItem <em>Choice Item</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndSpecializationImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndSpecializationImpl#getTraversalName <em>Traversal Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationEndSpecializationImpl extends EObjectImpl implements AssociationEndSpecialization {
	/**
	 * The cached value of the '{@link #getChoiceItem() <em>Choice Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiceItem()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationEndSpecialization> choiceItem;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraversalName() <em>Traversal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversalName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAVERSAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraversalName() <em>Traversal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversalName()
	 * @generated
	 * @ordered
	 */
	protected String traversalName = TRAVERSAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndSpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ASSOCIATION_END_SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationEndSpecialization> getChoiceItem() {
		if (choiceItem == null) {
			choiceItem = new EObjectContainmentEList<AssociationEndSpecialization>(
				AssociationEndSpecialization.class, this, Mif2Package.ASSOCIATION_END_SPECIALIZATION__CHOICE_ITEM);
		}
		return choiceItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ASSOCIATION_END_SPECIALIZATION__CLASS_NAME, oldClassName, className));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraversalName() {
		return traversalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraversalName(String newTraversalName) {
		String oldTraversalName = traversalName;
		traversalName = newTraversalName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ASSOCIATION_END_SPECIALIZATION__TRAVERSAL_NAME, oldTraversalName,
				traversalName));
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
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__CHOICE_ITEM:
				return ((InternalEList<?>) getChoiceItem()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__CHOICE_ITEM:
				return getChoiceItem();
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__CLASS_NAME:
				return getClassName();
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__TRAVERSAL_NAME:
				return getTraversalName();
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
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__CHOICE_ITEM:
				getChoiceItem().clear();
				getChoiceItem().addAll((Collection<? extends AssociationEndSpecialization>) newValue);
				return;
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__CLASS_NAME:
				setClassName((String) newValue);
				return;
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__TRAVERSAL_NAME:
				setTraversalName((String) newValue);
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
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__CHOICE_ITEM:
				getChoiceItem().clear();
				return;
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__TRAVERSAL_NAME:
				setTraversalName(TRAVERSAL_NAME_EDEFAULT);
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
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__CHOICE_ITEM:
				return choiceItem != null && !choiceItem.isEmpty();
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null
						? className != null
						: !CLASS_NAME_EDEFAULT.equals(className);
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION__TRAVERSAL_NAME:
				return TRAVERSAL_NAME_EDEFAULT == null
						? traversalName != null
						: !TRAVERSAL_NAME_EDEFAULT.equals(traversalName);
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
		result.append(" (className: ");
		result.append(className);
		result.append(", traversalName: ");
		result.append(traversalName);
		result.append(')');
		return result.toString();
	}

} // AssociationEndSpecializationImpl
