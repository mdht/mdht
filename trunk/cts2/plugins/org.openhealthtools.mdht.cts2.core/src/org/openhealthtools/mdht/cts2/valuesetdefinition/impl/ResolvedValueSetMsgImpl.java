/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.impl.MessageImpl;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolved Value Set Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetMsgImpl#getResolvedValueSet <em>Resolved Value Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ResolvedValueSetMsgImpl extends MessageImpl implements ResolvedValueSetMsg {
	/**
	 * The cached value of the '{@link #getResolvedValueSet() <em>Resolved Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResolvedValueSet()
	 * @generated
	 * @ordered
	 */
	protected ResolvedValueSet resolvedValueSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResolvedValueSetMsgImpl() {
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
		return ValueSetDefinitionPackage.Literals.RESOLVED_VALUE_SET_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSet getResolvedValueSet() {
		return resolvedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResolvedValueSet(ResolvedValueSet newResolvedValueSet, NotificationChain msgs) {
		ResolvedValueSet oldResolvedValueSet = resolvedValueSet;
		resolvedValueSet = newResolvedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET,
				oldResolvedValueSet, newResolvedValueSet);
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
	public void setResolvedValueSet(ResolvedValueSet newResolvedValueSet) {
		if (newResolvedValueSet != resolvedValueSet) {
			NotificationChain msgs = null;
			if (resolvedValueSet != null) {
				msgs = ((InternalEObject) resolvedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET, null, msgs);
			}
			if (newResolvedValueSet != null) {
				msgs = ((InternalEObject) newResolvedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET, null, msgs);
			}
			msgs = basicSetResolvedValueSet(newResolvedValueSet, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET,
				newResolvedValueSet, newResolvedValueSet));
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET:
				return basicSetResolvedValueSet(null, msgs);
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET:
				return getResolvedValueSet();
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET:
				setResolvedValueSet((ResolvedValueSet) newValue);
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET:
				setResolvedValueSet((ResolvedValueSet) null);
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET:
				return resolvedValueSet != null;
		}
		return super.eIsSet(featureID);
	}

} // ResolvedValueSetMsgImpl
