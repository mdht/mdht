/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationshipKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.EntryRelationshipImpl#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryRelationshipImpl extends AssociationValidationImpl implements EntryRelationship {
	/**
	 * The default value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final EntryRelationshipKind TYPE_CODE_EDEFAULT = EntryRelationshipKind.CAUS;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected EntryRelationshipKind typeCode = TYPE_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.ENTRY_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryRelationshipKind getTypeCode() {
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCode(EntryRelationshipKind newTypeCode) {
		EntryRelationshipKind oldTypeCode = typeCode;
		typeCode = newTypeCode == null ? TYPE_CODE_EDEFAULT : newTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.ENTRY_RELATIONSHIP__TYPE_CODE, oldTypeCode, typeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.ENTRY_RELATIONSHIP__TYPE_CODE:
				return getTypeCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDAPackage.ENTRY_RELATIONSHIP__TYPE_CODE:
				setTypeCode((EntryRelationshipKind)newValue);
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
			case CDAPackage.ENTRY_RELATIONSHIP__TYPE_CODE:
				setTypeCode(TYPE_CODE_EDEFAULT);
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
			case CDAPackage.ENTRY_RELATIONSHIP__TYPE_CODE:
				return typeCode != TYPE_CODE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typeCode: ");
		result.append(typeCode);
		result.append(')');
		return result.toString();
	}

} //EntryRelationshipImpl
