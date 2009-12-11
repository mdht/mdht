/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.DeprecationInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deprecation Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DeprecationInfoImpl#getDerivationSupplier <em>Derivation Supplier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DeprecationInfoImpl#getDeprecationEffectiveVersion <em>Deprecation Effective Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeprecationInfoImpl extends ContextAnnotationImpl implements DeprecationInfo {
	/**
	 * The cached value of the '{@link #getDerivationSupplier() <em>Derivation Supplier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationSupplier()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationDerivation> derivationSupplier;

	/**
	 * The default value of the '{@link #getDeprecationEffectiveVersion() <em>Deprecation Effective Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecationEffectiveVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPRECATION_EFFECTIVE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeprecationEffectiveVersion() <em>Deprecation Effective Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecationEffectiveVersion()
	 * @generated
	 * @ordered
	 */
	protected String deprecationEffectiveVersion = DEPRECATION_EFFECTIVE_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeprecationInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DEPRECATION_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationDerivation> getDerivationSupplier() {
		if (derivationSupplier == null) {
			derivationSupplier = new EObjectContainmentEList<AnnotationDerivation>(AnnotationDerivation.class, this, Mif2Package.DEPRECATION_INFO__DERIVATION_SUPPLIER);
		}
		return derivationSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeprecationEffectiveVersion() {
		return deprecationEffectiveVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeprecationEffectiveVersion(String newDeprecationEffectiveVersion) {
		String oldDeprecationEffectiveVersion = deprecationEffectiveVersion;
		deprecationEffectiveVersion = newDeprecationEffectiveVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DEPRECATION_INFO__DEPRECATION_EFFECTIVE_VERSION, oldDeprecationEffectiveVersion, deprecationEffectiveVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.DEPRECATION_INFO__DERIVATION_SUPPLIER:
				return ((InternalEList<?>)getDerivationSupplier()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.DEPRECATION_INFO__DERIVATION_SUPPLIER:
				return getDerivationSupplier();
			case Mif2Package.DEPRECATION_INFO__DEPRECATION_EFFECTIVE_VERSION:
				return getDeprecationEffectiveVersion();
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
			case Mif2Package.DEPRECATION_INFO__DERIVATION_SUPPLIER:
				getDerivationSupplier().clear();
				getDerivationSupplier().addAll((Collection<? extends AnnotationDerivation>)newValue);
				return;
			case Mif2Package.DEPRECATION_INFO__DEPRECATION_EFFECTIVE_VERSION:
				setDeprecationEffectiveVersion((String)newValue);
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
			case Mif2Package.DEPRECATION_INFO__DERIVATION_SUPPLIER:
				getDerivationSupplier().clear();
				return;
			case Mif2Package.DEPRECATION_INFO__DEPRECATION_EFFECTIVE_VERSION:
				setDeprecationEffectiveVersion(DEPRECATION_EFFECTIVE_VERSION_EDEFAULT);
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
			case Mif2Package.DEPRECATION_INFO__DERIVATION_SUPPLIER:
				return derivationSupplier != null && !derivationSupplier.isEmpty();
			case Mif2Package.DEPRECATION_INFO__DEPRECATION_EFFECTIVE_VERSION:
				return DEPRECATION_EFFECTIVE_VERSION_EDEFAULT == null ? deprecationEffectiveVersion != null : !DEPRECATION_EFFECTIVE_VERSION_EDEFAULT.equals(deprecationEffectiveVersion);
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
		result.append(" (deprecationEffectiveVersion: ");
		result.append(deprecationEffectiveVersion);
		result.append(')');
		return result.toString();
	}

} //DeprecationInfoImpl
