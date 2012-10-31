/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Entity List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.SpecificEntityListImpl#getReferencedEntity <em>Referenced Entity</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SpecificEntityListImpl extends EObjectImpl implements SpecificEntityList {
	/**
	 * The cached value of the '{@link #getReferencedEntity() <em>Referenced Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReferencedEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<URIAndEntityName> referencedEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SpecificEntityListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValueSetDefinitionPackage.Literals.SPECIFIC_ENTITY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<URIAndEntityName> getReferencedEntity() {
		if (referencedEntity == null) {
			referencedEntity = new EObjectContainmentEList<URIAndEntityName>(
				URIAndEntityName.class, this, ValueSetDefinitionPackage.SPECIFIC_ENTITY_LIST__REFERENCED_ENTITY);
		}
		return referencedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValueSetDefinitionPackage.SPECIFIC_ENTITY_LIST__REFERENCED_ENTITY:
				return ((InternalEList<?>) getReferencedEntity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValueSetDefinitionPackage.SPECIFIC_ENTITY_LIST__REFERENCED_ENTITY:
				return getReferencedEntity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValueSetDefinitionPackage.SPECIFIC_ENTITY_LIST__REFERENCED_ENTITY:
				getReferencedEntity().clear();
				getReferencedEntity().addAll((Collection<? extends URIAndEntityName>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ValueSetDefinitionPackage.SPECIFIC_ENTITY_LIST__REFERENCED_ENTITY:
				getReferencedEntity().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ValueSetDefinitionPackage.SPECIFIC_ENTITY_LIST__REFERENCED_ENTITY:
				return referencedEntity != null && !referencedEntity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // SpecificEntityListImpl
