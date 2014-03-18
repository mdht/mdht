/**
 */
package org.openhealthtools.mdht.uml.cda.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.Inline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.InlineImpl#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.InlineImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class InlineImpl extends EObjectImpl implements Inline {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InlineImpl() {
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
		return CDAPackage.Literals.INLINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject) base_Class;
			base_Class = (org.eclipse.uml2.uml.Class) eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, CDAPackage.INLINE__BASE_CLASS, oldBase_Class, base_Class));
				}
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.INLINE__BASE_CLASS, oldBase_Class, base_Class));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.INLINE__FILTER, oldFilter, filter));
		}
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
			case CDAPackage.INLINE__BASE_CLASS:
				if (resolve) {
					return getBase_Class();
				}
				return basicGetBase_Class();
			case CDAPackage.INLINE__FILTER:
				return getFilter();
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
			case CDAPackage.INLINE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class) newValue);
				return;
			case CDAPackage.INLINE__FILTER:
				setFilter((String) newValue);
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
			case CDAPackage.INLINE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class) null);
				return;
			case CDAPackage.INLINE__FILTER:
				setFilter(FILTER_EDEFAULT);
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
			case CDAPackage.INLINE__BASE_CLASS:
				return base_Class != null;
			case CDAPackage.INLINE__FILTER:
				return FILTER_EDEFAULT == null
						? filter != null
						: !FILTER_EDEFAULT.equals(filter);
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
		result.append(" (filter: ");
		result.append(filter);
		result.append(')');
		return result.toString();
	}

} // InlineImpl
