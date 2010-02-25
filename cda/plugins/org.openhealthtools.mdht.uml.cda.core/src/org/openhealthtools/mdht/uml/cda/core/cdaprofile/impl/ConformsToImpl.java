/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Generalization;

import org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConformsTo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conforms To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConformsToImpl#getBase_Generalization <em>Base Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConformsToImpl extends EObjectImpl implements ConformsTo {
	/**
	 * The cached value of the '{@link #getBase_Generalization() <em>Base Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Generalization()
	 * @generated
	 * @ordered
	 */
	protected Generalization base_Generalization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformsToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.CONFORMS_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getBase_Generalization() {
		if (base_Generalization != null && base_Generalization.eIsProxy()) {
			InternalEObject oldBase_Generalization = (InternalEObject)base_Generalization;
			base_Generalization = (Generalization)eResolveProxy(oldBase_Generalization);
			if (base_Generalization != oldBase_Generalization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDAPackage.CONFORMS_TO__BASE_GENERALIZATION, oldBase_Generalization, base_Generalization));
			}
		}
		return base_Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization basicGetBase_Generalization() {
		return base_Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Generalization(Generalization newBase_Generalization) {
		Generalization oldBase_Generalization = base_Generalization;
		base_Generalization = newBase_Generalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CONFORMS_TO__BASE_GENERALIZATION, oldBase_Generalization, base_Generalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.CONFORMS_TO__BASE_GENERALIZATION:
				if (resolve) return getBase_Generalization();
				return basicGetBase_Generalization();
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
			case CDAPackage.CONFORMS_TO__BASE_GENERALIZATION:
				setBase_Generalization((Generalization)newValue);
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
			case CDAPackage.CONFORMS_TO__BASE_GENERALIZATION:
				setBase_Generalization((Generalization)null);
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
			case CDAPackage.CONFORMS_TO__BASE_GENERALIZATION:
				return base_Generalization != null;
		}
		return super.eIsSet(featureID);
	}

} //ConformsToImpl
