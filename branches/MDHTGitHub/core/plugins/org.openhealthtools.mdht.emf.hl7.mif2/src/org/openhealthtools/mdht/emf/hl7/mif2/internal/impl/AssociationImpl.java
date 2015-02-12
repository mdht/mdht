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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Association;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEnd;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.NonTraversableAssociationEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationImpl#getTraversableConnection <em>Traversable Connection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationImpl#getNonTraversableConnection <em>Non Traversable Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends AssociationBaseImpl implements Association {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Mif2Package.ASSOCIATION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationEnd> getTraversableConnection() {
		return getGroup().list(Mif2Package.Literals.ASSOCIATION__TRAVERSABLE_CONNECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonTraversableAssociationEnd> getNonTraversableConnection() {
		return getGroup().list(Mif2Package.Literals.ASSOCIATION__NON_TRAVERSABLE_CONNECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ASSOCIATION__GROUP:
				return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
			case Mif2Package.ASSOCIATION__TRAVERSABLE_CONNECTION:
				return ((InternalEList<?>) getTraversableConnection()).basicRemove(otherEnd, msgs);
			case Mif2Package.ASSOCIATION__NON_TRAVERSABLE_CONNECTION:
				return ((InternalEList<?>) getNonTraversableConnection()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.ASSOCIATION__GROUP:
				if (coreType) {
					return getGroup();
				}
				return ((FeatureMap.Internal) getGroup()).getWrapper();
			case Mif2Package.ASSOCIATION__TRAVERSABLE_CONNECTION:
				return getTraversableConnection();
			case Mif2Package.ASSOCIATION__NON_TRAVERSABLE_CONNECTION:
				return getNonTraversableConnection();
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
			case Mif2Package.ASSOCIATION__GROUP:
				((FeatureMap.Internal) getGroup()).set(newValue);
				return;
			case Mif2Package.ASSOCIATION__TRAVERSABLE_CONNECTION:
				getTraversableConnection().clear();
				getTraversableConnection().addAll((Collection<? extends AssociationEnd>) newValue);
				return;
			case Mif2Package.ASSOCIATION__NON_TRAVERSABLE_CONNECTION:
				getNonTraversableConnection().clear();
				getNonTraversableConnection().addAll((Collection<? extends NonTraversableAssociationEnd>) newValue);
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
			case Mif2Package.ASSOCIATION__GROUP:
				getGroup().clear();
				return;
			case Mif2Package.ASSOCIATION__TRAVERSABLE_CONNECTION:
				getTraversableConnection().clear();
				return;
			case Mif2Package.ASSOCIATION__NON_TRAVERSABLE_CONNECTION:
				getNonTraversableConnection().clear();
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
			case Mif2Package.ASSOCIATION__GROUP:
				return group != null && !group.isEmpty();
			case Mif2Package.ASSOCIATION__TRAVERSABLE_CONNECTION:
				return !getTraversableConnection().isEmpty();
			case Mif2Package.ASSOCIATION__NON_TRAVERSABLE_CONNECTION:
				return !getNonTraversableConnection().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} // AssociationImpl
