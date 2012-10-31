/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference;
import org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionDirectoryEntryImpl;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntrySummaryImpl#getCurrentDefinition <em>Current Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntrySummaryImpl#getValueSetName <em>Value Set Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValueSetCatalogEntrySummaryImpl extends AbstractResourceDescriptionDirectoryEntryImpl implements
		ValueSetCatalogEntrySummary {
	/**
	 * The cached value of the '{@link #getCurrentDefinition() <em>Current Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCurrentDefinition()
	 * @generated
	 * @ordered
	 */
	protected ValueSetDefinitionReference currentDefinition;

	/**
	 * The default value of the '{@link #getValueSetName() <em>Value Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSetName() <em>Value Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetName()
	 * @generated
	 * @ordered
	 */
	protected String valueSetName = VALUE_SET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetCatalogEntrySummaryImpl() {
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
		return ValueSetPackage.Literals.VALUE_SET_CATALOG_ENTRY_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionReference getCurrentDefinition() {
		return currentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCurrentDefinition(ValueSetDefinitionReference newCurrentDefinition,
			NotificationChain msgs) {
		ValueSetDefinitionReference oldCurrentDefinition = currentDefinition;
		currentDefinition = newCurrentDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION,
				oldCurrentDefinition, newCurrentDefinition);
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
	 * 
	 * @generated
	 */
	public void setCurrentDefinition(ValueSetDefinitionReference newCurrentDefinition) {
		if (newCurrentDefinition != currentDefinition) {
			NotificationChain msgs = null;
			if (currentDefinition != null) {
				msgs = ((InternalEObject) currentDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION, null, msgs);
			}
			if (newCurrentDefinition != null) {
				msgs = ((InternalEObject) newCurrentDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION, null, msgs);
			}
			msgs = basicSetCurrentDefinition(newCurrentDefinition, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION,
				newCurrentDefinition, newCurrentDefinition));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getValueSetName() {
		return valueSetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetName(String newValueSetName) {
		String oldValueSetName = valueSetName;
		valueSetName = newValueSetName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__VALUE_SET_NAME,
				oldValueSetName, valueSetName));
		}
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION:
				return basicSetCurrentDefinition(null, msgs);
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION:
				return getCurrentDefinition();
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__VALUE_SET_NAME:
				return getValueSetName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION:
				setCurrentDefinition((ValueSetDefinitionReference) newValue);
				return;
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__VALUE_SET_NAME:
				setValueSetName((String) newValue);
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION:
				setCurrentDefinition((ValueSetDefinitionReference) null);
				return;
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__VALUE_SET_NAME:
				setValueSetName(VALUE_SET_NAME_EDEFAULT);
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION:
				return currentDefinition != null;
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY__VALUE_SET_NAME:
				return VALUE_SET_NAME_EDEFAULT == null
						? valueSetName != null
						: !VALUE_SET_NAME_EDEFAULT.equals(valueSetName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (valueSetName: ");
		result.append(valueSetName);
		result.append(')');
		return result.toString();
	}

} // ValueSetCatalogEntrySummaryImpl
