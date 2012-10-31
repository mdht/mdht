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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.impl.DirectoryEntryImpl;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionListEntryImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValueSetDefinitionListEntryImpl extends DirectoryEntryImpl implements ValueSetDefinitionListEntry {
	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetDefinition> entry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionListEntryImpl() {
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
		return ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_LIST_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ValueSetDefinition> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<ValueSetDefinition>(
				ValueSetDefinition.class, this, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_LIST_ENTRY__ENTRY);
		}
		return entry;
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_LIST_ENTRY__ENTRY:
				return ((InternalEList<?>) getEntry()).basicRemove(otherEnd, msgs);
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_LIST_ENTRY__ENTRY:
				return getEntry();
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_LIST_ENTRY__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends ValueSetDefinition>) newValue);
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_LIST_ENTRY__ENTRY:
				getEntry().clear();
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_LIST_ENTRY__ENTRY:
				return entry != null && !entry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ValueSetDefinitionListEntryImpl
