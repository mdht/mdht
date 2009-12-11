/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralization;
import org.openhealthtools.mdht.emf.hl7.mif2.FlatClass;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flat Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FlatClassImpl#getChildClass <em>Child Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FlatClassImpl#getParentClass <em>Parent Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlatClassImpl extends ClassBaseImpl implements FlatClass {
	/**
	 * The cached value of the '{@link #getChildClass() <em>Child Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildClass()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassGeneralization> childClass;

	/**
	 * The cached value of the '{@link #getParentClass() <em>Parent Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClass()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassGeneralization> parentClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlatClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.FLAT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassGeneralization> getChildClass() {
		if (childClass == null) {
			childClass = new EObjectContainmentEList<ClassGeneralization>(ClassGeneralization.class, this, Mif2Package.FLAT_CLASS__CHILD_CLASS);
		}
		return childClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassGeneralization> getParentClass() {
		if (parentClass == null) {
			parentClass = new EObjectContainmentEList<ClassGeneralization>(ClassGeneralization.class, this, Mif2Package.FLAT_CLASS__PARENT_CLASS);
		}
		return parentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.FLAT_CLASS__CHILD_CLASS:
				return ((InternalEList<?>)getChildClass()).basicRemove(otherEnd, msgs);
			case Mif2Package.FLAT_CLASS__PARENT_CLASS:
				return ((InternalEList<?>)getParentClass()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.FLAT_CLASS__CHILD_CLASS:
				return getChildClass();
			case Mif2Package.FLAT_CLASS__PARENT_CLASS:
				return getParentClass();
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
			case Mif2Package.FLAT_CLASS__CHILD_CLASS:
				getChildClass().clear();
				getChildClass().addAll((Collection<? extends ClassGeneralization>)newValue);
				return;
			case Mif2Package.FLAT_CLASS__PARENT_CLASS:
				getParentClass().clear();
				getParentClass().addAll((Collection<? extends ClassGeneralization>)newValue);
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
			case Mif2Package.FLAT_CLASS__CHILD_CLASS:
				getChildClass().clear();
				return;
			case Mif2Package.FLAT_CLASS__PARENT_CLASS:
				getParentClass().clear();
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
			case Mif2Package.FLAT_CLASS__CHILD_CLASS:
				return childClass != null && !childClass.isEmpty();
			case Mif2Package.FLAT_CLASS__PARENT_CLASS:
				return parentClass != null && !parentClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlatClassImpl
