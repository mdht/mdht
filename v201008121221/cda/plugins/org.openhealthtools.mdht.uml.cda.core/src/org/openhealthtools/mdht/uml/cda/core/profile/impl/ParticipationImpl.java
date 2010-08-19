/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.Participation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ParticipationImpl#getBase_Association <em>Base Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ParticipationImpl#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipationImpl extends EObjectImpl implements Participation {
	/**
	 * The cached value of the '{@link #getBase_Association() <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Association()
	 * @generated
	 * @ordered
	 */
	protected Association base_Association;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral typeCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.PARTICIPATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getBase_Association() {
		if (base_Association != null && base_Association.eIsProxy()) {
			InternalEObject oldBase_Association = (InternalEObject)base_Association;
			base_Association = (Association)eResolveProxy(oldBase_Association);
			if (base_Association != oldBase_Association) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDAPackage.PARTICIPATION__BASE_ASSOCIATION, oldBase_Association, base_Association));
			}
		}
		return base_Association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetBase_Association() {
		return base_Association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Association(Association newBase_Association) {
		Association oldBase_Association = base_Association;
		base_Association = newBase_Association;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPATION__BASE_ASSOCIATION, oldBase_Association, base_Association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getTypeCode() {
		if (typeCode != null && typeCode.eIsProxy()) {
			InternalEObject oldTypeCode = (InternalEObject)typeCode;
			typeCode = (EnumerationLiteral)eResolveProxy(oldTypeCode);
			if (typeCode != oldTypeCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDAPackage.PARTICIPATION__TYPE_CODE, oldTypeCode, typeCode));
			}
		}
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetTypeCode() {
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCode(EnumerationLiteral newTypeCode) {
		EnumerationLiteral oldTypeCode = typeCode;
		typeCode = newTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.PARTICIPATION__TYPE_CODE, oldTypeCode, typeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.PARTICIPATION__BASE_ASSOCIATION:
				if (resolve) return getBase_Association();
				return basicGetBase_Association();
			case CDAPackage.PARTICIPATION__TYPE_CODE:
				if (resolve) return getTypeCode();
				return basicGetTypeCode();
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
			case CDAPackage.PARTICIPATION__BASE_ASSOCIATION:
				setBase_Association((Association)newValue);
				return;
			case CDAPackage.PARTICIPATION__TYPE_CODE:
				setTypeCode((EnumerationLiteral)newValue);
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
			case CDAPackage.PARTICIPATION__BASE_ASSOCIATION:
				setBase_Association((Association)null);
				return;
			case CDAPackage.PARTICIPATION__TYPE_CODE:
				setTypeCode((EnumerationLiteral)null);
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
			case CDAPackage.PARTICIPATION__BASE_ASSOCIATION:
				return base_Association != null;
			case CDAPackage.PARTICIPATION__TYPE_CODE:
				return typeCode != null;
		}
		return super.eIsSet(featureID);
	}

} //ParticipationImpl
