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

import org.openhealthtools.mdht.emf.hl7.mif2.Association;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassElement;
import org.openhealthtools.mdht.emf.hl7.mif2.EntryPoint;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelImpl#getContainedClass <em>Contained Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticModelImpl extends StaticModelBaseImpl implements StaticModel {
	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryPoint> entryPoint;

	/**
	 * The cached value of the '{@link #getContainedClass() <em>Contained Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedClass()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassElement> containedClass;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> association;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STATIC_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryPoint> getEntryPoint() {
		if (entryPoint == null) {
			entryPoint = new EObjectContainmentEList<EntryPoint>(EntryPoint.class, this, Mif2Package.STATIC_MODEL__ENTRY_POINT);
		}
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassElement> getContainedClass() {
		if (containedClass == null) {
			containedClass = new EObjectContainmentEList<ClassElement>(ClassElement.class, this, Mif2Package.STATIC_MODEL__CONTAINED_CLASS);
		}
		return containedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentEList<Association>(Association.class, this, Mif2Package.STATIC_MODEL__ASSOCIATION);
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
			case Mif2Package.STATIC_MODEL__ENTRY_POINT:
				return ((InternalEList<?>)getEntryPoint()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_MODEL__CONTAINED_CLASS:
				return ((InternalEList<?>)getContainedClass()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_MODEL__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.STATIC_MODEL__ENTRY_POINT:
				return getEntryPoint();
			case Mif2Package.STATIC_MODEL__CONTAINED_CLASS:
				return getContainedClass();
			case Mif2Package.STATIC_MODEL__ASSOCIATION:
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
			case Mif2Package.STATIC_MODEL__ENTRY_POINT:
				getEntryPoint().clear();
				getEntryPoint().addAll((Collection<? extends EntryPoint>)newValue);
				return;
			case Mif2Package.STATIC_MODEL__CONTAINED_CLASS:
				getContainedClass().clear();
				getContainedClass().addAll((Collection<? extends ClassElement>)newValue);
				return;
			case Mif2Package.STATIC_MODEL__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
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
			case Mif2Package.STATIC_MODEL__ENTRY_POINT:
				getEntryPoint().clear();
				return;
			case Mif2Package.STATIC_MODEL__CONTAINED_CLASS:
				getContainedClass().clear();
				return;
			case Mif2Package.STATIC_MODEL__ASSOCIATION:
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
			case Mif2Package.STATIC_MODEL__ENTRY_POINT:
				return entryPoint != null && !entryPoint.isEmpty();
			case Mif2Package.STATIC_MODEL__CONTAINED_CLASS:
				return containedClass != null && !containedClass.isEmpty();
			case Mif2Package.STATIC_MODEL__ASSOCIATION:
				return association != null && !association.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StaticModelImpl
