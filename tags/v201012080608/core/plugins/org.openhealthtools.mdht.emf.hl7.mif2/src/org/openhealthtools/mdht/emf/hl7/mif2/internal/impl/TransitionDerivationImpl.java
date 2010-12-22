/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.TransitionDerivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TransitionDerivationImpl#getStartStateName <em>Start State Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TransitionDerivationImpl#getStateTransitionName <em>State Transition Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionDerivationImpl extends ClassDerivationImpl implements TransitionDerivation {
	/**
	 * The default value of the '{@link #getStartStateName() <em>Start State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStateName()
	 * @generated
	 * @ordered
	 */
	protected static final String START_STATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartStateName() <em>Start State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStateName()
	 * @generated
	 * @ordered
	 */
	protected String startStateName = START_STATE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateTransitionName() <em>State Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTransitionName()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_TRANSITION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateTransitionName() <em>State Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTransitionName()
	 * @generated
	 * @ordered
	 */
	protected String stateTransitionName = STATE_TRANSITION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.TRANSITION_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartStateName() {
		return startStateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartStateName(String newStartStateName) {
		String oldStartStateName = startStateName;
		startStateName = newStartStateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.TRANSITION_DERIVATION__START_STATE_NAME, oldStartStateName, startStateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateTransitionName() {
		return stateTransitionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateTransitionName(String newStateTransitionName) {
		String oldStateTransitionName = stateTransitionName;
		stateTransitionName = newStateTransitionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.TRANSITION_DERIVATION__STATE_TRANSITION_NAME, oldStateTransitionName, stateTransitionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.TRANSITION_DERIVATION__START_STATE_NAME:
				return getStartStateName();
			case Mif2Package.TRANSITION_DERIVATION__STATE_TRANSITION_NAME:
				return getStateTransitionName();
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
			case Mif2Package.TRANSITION_DERIVATION__START_STATE_NAME:
				setStartStateName((String)newValue);
				return;
			case Mif2Package.TRANSITION_DERIVATION__STATE_TRANSITION_NAME:
				setStateTransitionName((String)newValue);
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
			case Mif2Package.TRANSITION_DERIVATION__START_STATE_NAME:
				setStartStateName(START_STATE_NAME_EDEFAULT);
				return;
			case Mif2Package.TRANSITION_DERIVATION__STATE_TRANSITION_NAME:
				setStateTransitionName(STATE_TRANSITION_NAME_EDEFAULT);
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
			case Mif2Package.TRANSITION_DERIVATION__START_STATE_NAME:
				return START_STATE_NAME_EDEFAULT == null ? startStateName != null : !START_STATE_NAME_EDEFAULT.equals(startStateName);
			case Mif2Package.TRANSITION_DERIVATION__STATE_TRANSITION_NAME:
				return STATE_TRANSITION_NAME_EDEFAULT == null ? stateTransitionName != null : !STATE_TRANSITION_NAME_EDEFAULT.equals(stateTransitionName);
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
		result.append(" (startStateName: ");
		result.append(startStateName);
		result.append(", stateTransitionName: ");
		result.append(stateTransitionName);
		result.append(')');
		return result.toString();
	}

} //TransitionDerivationImpl
