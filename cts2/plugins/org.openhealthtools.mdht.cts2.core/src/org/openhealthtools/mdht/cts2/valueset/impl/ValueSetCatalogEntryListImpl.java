/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryListImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValueSetCatalogEntryListImpl extends DirectoryImpl implements ValueSetCatalogEntryList {
	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetCatalogEntryListEntry> entry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetCatalogEntryListImpl() {
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
		return ValueSetPackage.Literals.VALUE_SET_CATALOG_ENTRY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ValueSetCatalogEntryListEntry> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<ValueSetCatalogEntryListEntry>(
				ValueSetCatalogEntryListEntry.class, this, ValueSetPackage.VALUE_SET_CATALOG_ENTRY_LIST__ENTRY);
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_LIST__ENTRY:
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_LIST__ENTRY:
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_LIST__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends ValueSetCatalogEntryListEntry>) newValue);
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_LIST__ENTRY:
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_LIST__ENTRY:
				return entry != null && !entry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ValueSetCatalogEntryListImpl
