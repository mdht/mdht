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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.LocalClassRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnd;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedClass;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassGeneralization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serialized Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedClassImpl#getChildClass <em>Child Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedClassImpl#getParentClass <em>Parent Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedClassImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerializedClassImpl extends ClassBaseImpl implements SerializedClass {
	/**
	 * The cached value of the '{@link #getChildClass() <em>Child Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SerializedClassGeneralization> childClass;

	/**
	 * The cached value of the '{@link #getParentClass() <em>Parent Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClass()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalClassRef> parentClass;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<SerializedAssociationEnd> association;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializedClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SERIALIZED_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializedClassGeneralization> getChildClass() {
		if (childClass == null) {
			childClass = new EObjectContainmentEList<SerializedClassGeneralization>(
				SerializedClassGeneralization.class, this, Mif2Package.SERIALIZED_CLASS__CHILD_CLASS);
		}
		return childClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalClassRef> getParentClass() {
		if (parentClass == null) {
			parentClass = new EObjectContainmentEList<LocalClassRef>(
				LocalClassRef.class, this, Mif2Package.SERIALIZED_CLASS__PARENT_CLASS);
		}
		return parentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializedAssociationEnd> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentEList<SerializedAssociationEnd>(
				SerializedAssociationEnd.class, this, Mif2Package.SERIALIZED_CLASS__ASSOCIATION);
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.SERIALIZED_CLASS__CHILD_CLASS:
				return ((InternalEList<?>) getChildClass()).basicRemove(otherEnd, msgs);
			case Mif2Package.SERIALIZED_CLASS__PARENT_CLASS:
				return ((InternalEList<?>) getParentClass()).basicRemove(otherEnd, msgs);
			case Mif2Package.SERIALIZED_CLASS__ASSOCIATION:
				return ((InternalEList<?>) getAssociation()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.SERIALIZED_CLASS__CHILD_CLASS:
				return getChildClass();
			case Mif2Package.SERIALIZED_CLASS__PARENT_CLASS:
				return getParentClass();
			case Mif2Package.SERIALIZED_CLASS__ASSOCIATION:
				return getAssociation();
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
			case Mif2Package.SERIALIZED_CLASS__CHILD_CLASS:
				getChildClass().clear();
				getChildClass().addAll((Collection<? extends SerializedClassGeneralization>) newValue);
				return;
			case Mif2Package.SERIALIZED_CLASS__PARENT_CLASS:
				getParentClass().clear();
				getParentClass().addAll((Collection<? extends LocalClassRef>) newValue);
				return;
			case Mif2Package.SERIALIZED_CLASS__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends SerializedAssociationEnd>) newValue);
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
			case Mif2Package.SERIALIZED_CLASS__CHILD_CLASS:
				getChildClass().clear();
				return;
			case Mif2Package.SERIALIZED_CLASS__PARENT_CLASS:
				getParentClass().clear();
				return;
			case Mif2Package.SERIALIZED_CLASS__ASSOCIATION:
				getAssociation().clear();
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
			case Mif2Package.SERIALIZED_CLASS__CHILD_CLASS:
				return childClass != null && !childClass.isEmpty();
			case Mif2Package.SERIALIZED_CLASS__PARENT_CLASS:
				return parentClass != null && !parentClass.isEmpty();
			case Mif2Package.SERIALIZED_CLASS__ASSOCIATION:
				return association != null && !association.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // SerializedClassImpl
