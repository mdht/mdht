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

import org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.ParameterModel;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelUseKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Static Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BoundStaticModelImpl#getParameterModel <em>Parameter Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BoundStaticModelImpl#getEntryPointUseKind <em>Entry Point Use Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundStaticModelImpl extends PackageRefImpl implements BoundStaticModel {
	/**
	 * The cached value of the '{@link #getParameterModel() <em>Parameter Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterModel> parameterModel;

	/**
	 * The default value of the '{@link #getEntryPointUseKind() <em>Entry Point Use Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPointUseKind()
	 * @generated
	 * @ordered
	 */
	protected static final StaticModelUseKind ENTRY_POINT_USE_KIND_EDEFAULT = StaticModelUseKind.COMMUNICATION_WRAPPER;

	/**
	 * The cached value of the '{@link #getEntryPointUseKind() <em>Entry Point Use Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPointUseKind()
	 * @generated
	 * @ordered
	 */
	protected StaticModelUseKind entryPointUseKind = ENTRY_POINT_USE_KIND_EDEFAULT;

	/**
	 * This is true if the Entry Point Use Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean entryPointUseKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundStaticModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.BOUND_STATIC_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterModel> getParameterModel() {
		if (parameterModel == null) {
			parameterModel = new EObjectContainmentEList<ParameterModel>(ParameterModel.class, this, Mif2Package.BOUND_STATIC_MODEL__PARAMETER_MODEL);
		}
		return parameterModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelUseKind getEntryPointUseKind() {
		return entryPointUseKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPointUseKind(StaticModelUseKind newEntryPointUseKind) {
		StaticModelUseKind oldEntryPointUseKind = entryPointUseKind;
		entryPointUseKind = newEntryPointUseKind == null ? ENTRY_POINT_USE_KIND_EDEFAULT : newEntryPointUseKind;
		boolean oldEntryPointUseKindESet = entryPointUseKindESet;
		entryPointUseKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BOUND_STATIC_MODEL__ENTRY_POINT_USE_KIND, oldEntryPointUseKind, entryPointUseKind, !oldEntryPointUseKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEntryPointUseKind() {
		StaticModelUseKind oldEntryPointUseKind = entryPointUseKind;
		boolean oldEntryPointUseKindESet = entryPointUseKindESet;
		entryPointUseKind = ENTRY_POINT_USE_KIND_EDEFAULT;
		entryPointUseKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.BOUND_STATIC_MODEL__ENTRY_POINT_USE_KIND, oldEntryPointUseKind, ENTRY_POINT_USE_KIND_EDEFAULT, oldEntryPointUseKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEntryPointUseKind() {
		return entryPointUseKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.BOUND_STATIC_MODEL__PARAMETER_MODEL:
				return ((InternalEList<?>)getParameterModel()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.BOUND_STATIC_MODEL__PARAMETER_MODEL:
				return getParameterModel();
			case Mif2Package.BOUND_STATIC_MODEL__ENTRY_POINT_USE_KIND:
				return getEntryPointUseKind();
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
			case Mif2Package.BOUND_STATIC_MODEL__PARAMETER_MODEL:
				getParameterModel().clear();
				getParameterModel().addAll((Collection<? extends ParameterModel>)newValue);
				return;
			case Mif2Package.BOUND_STATIC_MODEL__ENTRY_POINT_USE_KIND:
				setEntryPointUseKind((StaticModelUseKind)newValue);
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
			case Mif2Package.BOUND_STATIC_MODEL__PARAMETER_MODEL:
				getParameterModel().clear();
				return;
			case Mif2Package.BOUND_STATIC_MODEL__ENTRY_POINT_USE_KIND:
				unsetEntryPointUseKind();
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
			case Mif2Package.BOUND_STATIC_MODEL__PARAMETER_MODEL:
				return parameterModel != null && !parameterModel.isEmpty();
			case Mif2Package.BOUND_STATIC_MODEL__ENTRY_POINT_USE_KIND:
				return isSetEntryPointUseKind();
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
		result.append(" (entryPointUseKind: ");
		if (entryPointUseKindESet) result.append(entryPointUseKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BoundStaticModelImpl
