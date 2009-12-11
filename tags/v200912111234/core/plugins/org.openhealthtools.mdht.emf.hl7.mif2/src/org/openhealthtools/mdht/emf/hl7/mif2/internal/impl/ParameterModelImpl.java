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

import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.ParameterModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ParameterModelImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ParameterModelImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ParameterModelImpl#getTraversalName <em>Traversal Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterModelImpl extends BoundStaticModelImpl implements ParameterModel {
	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationEndSpecialization> specialization;

	/**
	 * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected String parameterName = PARAMETER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraversalName() <em>Traversal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversalName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAVERSAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraversalName() <em>Traversal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversalName()
	 * @generated
	 * @ordered
	 */
	protected String traversalName = TRAVERSAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PARAMETER_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationEndSpecialization> getSpecialization() {
		if (specialization == null) {
			specialization = new EObjectContainmentEList<AssociationEndSpecialization>(AssociationEndSpecialization.class, this, Mif2Package.PARAMETER_MODEL__SPECIALIZATION);
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterName(String newParameterName) {
		String oldParameterName = parameterName;
		parameterName = newParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PARAMETER_MODEL__PARAMETER_NAME, oldParameterName, parameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraversalName() {
		return traversalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraversalName(String newTraversalName) {
		String oldTraversalName = traversalName;
		traversalName = newTraversalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PARAMETER_MODEL__TRAVERSAL_NAME, oldTraversalName, traversalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.PARAMETER_MODEL__SPECIALIZATION:
				return ((InternalEList<?>)getSpecialization()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.PARAMETER_MODEL__SPECIALIZATION:
				return getSpecialization();
			case Mif2Package.PARAMETER_MODEL__PARAMETER_NAME:
				return getParameterName();
			case Mif2Package.PARAMETER_MODEL__TRAVERSAL_NAME:
				return getTraversalName();
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
			case Mif2Package.PARAMETER_MODEL__SPECIALIZATION:
				getSpecialization().clear();
				getSpecialization().addAll((Collection<? extends AssociationEndSpecialization>)newValue);
				return;
			case Mif2Package.PARAMETER_MODEL__PARAMETER_NAME:
				setParameterName((String)newValue);
				return;
			case Mif2Package.PARAMETER_MODEL__TRAVERSAL_NAME:
				setTraversalName((String)newValue);
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
			case Mif2Package.PARAMETER_MODEL__SPECIALIZATION:
				getSpecialization().clear();
				return;
			case Mif2Package.PARAMETER_MODEL__PARAMETER_NAME:
				setParameterName(PARAMETER_NAME_EDEFAULT);
				return;
			case Mif2Package.PARAMETER_MODEL__TRAVERSAL_NAME:
				setTraversalName(TRAVERSAL_NAME_EDEFAULT);
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
			case Mif2Package.PARAMETER_MODEL__SPECIALIZATION:
				return specialization != null && !specialization.isEmpty();
			case Mif2Package.PARAMETER_MODEL__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
			case Mif2Package.PARAMETER_MODEL__TRAVERSAL_NAME:
				return TRAVERSAL_NAME_EDEFAULT == null ? traversalName != null : !TRAVERSAL_NAME_EDEFAULT.equals(traversalName);
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
		result.append(" (parameterName: ");
		result.append(parameterName);
		result.append(", traversalName: ");
		result.append(traversalName);
		result.append(')');
		return result.toString();
	}

} //ParameterModelImpl
