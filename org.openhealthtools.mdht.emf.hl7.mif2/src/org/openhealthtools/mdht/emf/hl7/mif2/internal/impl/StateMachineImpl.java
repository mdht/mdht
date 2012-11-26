/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.State;
import org.openhealthtools.mdht.emf.hl7.mif2.StateMachine;
import org.openhealthtools.mdht.emf.hl7.mif2.StateMachineAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.Transition;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StateMachineImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StateMachineImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StateMachineImpl#getSubState <em>Sub State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StateMachineImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StateMachineImpl#getStateAttributeName <em>State Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected StateMachineAnnotations annotations;

	/**
	 * The cached value of the '{@link #getFigure() <em>Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigure()
	 * @generated
	 * @ordered
	 */
	protected Img figure;

	/**
	 * The cached value of the '{@link #getSubState() <em>Sub State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> subState;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The default value of the '{@link #getStateAttributeName() <em>State Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateAttributeName() <em>State Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String stateAttributeName = STATE_ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(StateMachineAnnotations newAnnotations, NotificationChain msgs) {
		StateMachineAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STATE_MACHINE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
	 * @generated
	 */
	public void setAnnotations(StateMachineAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STATE_MACHINE__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STATE_MACHINE__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STATE_MACHINE__ANNOTATIONS, newAnnotations, newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Img getFigure() {
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigure(Img newFigure, NotificationChain msgs) {
		Img oldFigure = figure;
		figure = newFigure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STATE_MACHINE__FIGURE, oldFigure, newFigure);
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
	 * @generated
	 */
	public void setFigure(Img newFigure) {
		if (newFigure != figure) {
			NotificationChain msgs = null;
			if (figure != null) {
				msgs = ((InternalEObject) figure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STATE_MACHINE__FIGURE, null, msgs);
			}
			if (newFigure != null) {
				msgs = ((InternalEObject) newFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STATE_MACHINE__FIGURE, null, msgs);
			}
			msgs = basicSetFigure(newFigure, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STATE_MACHINE__FIGURE, newFigure, newFigure));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getSubState() {
		if (subState == null) {
			subState = new EObjectContainmentEList<State>(State.class, this, Mif2Package.STATE_MACHINE__SUB_STATE);
		}
		return subState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(
				Transition.class, this, Mif2Package.STATE_MACHINE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateAttributeName() {
		return stateAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateAttributeName(String newStateAttributeName) {
		String oldStateAttributeName = stateAttributeName;
		stateAttributeName = newStateAttributeName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STATE_MACHINE__STATE_ATTRIBUTE_NAME, oldStateAttributeName,
				stateAttributeName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.STATE_MACHINE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.STATE_MACHINE__FIGURE:
				return basicSetFigure(null, msgs);
			case Mif2Package.STATE_MACHINE__SUB_STATE:
				return ((InternalEList<?>) getSubState()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATE_MACHINE__TRANSITION:
				return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.STATE_MACHINE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.STATE_MACHINE__FIGURE:
				return getFigure();
			case Mif2Package.STATE_MACHINE__SUB_STATE:
				return getSubState();
			case Mif2Package.STATE_MACHINE__TRANSITION:
				return getTransition();
			case Mif2Package.STATE_MACHINE__STATE_ATTRIBUTE_NAME:
				return getStateAttributeName();
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
			case Mif2Package.STATE_MACHINE__ANNOTATIONS:
				setAnnotations((StateMachineAnnotations) newValue);
				return;
			case Mif2Package.STATE_MACHINE__FIGURE:
				setFigure((Img) newValue);
				return;
			case Mif2Package.STATE_MACHINE__SUB_STATE:
				getSubState().clear();
				getSubState().addAll((Collection<? extends State>) newValue);
				return;
			case Mif2Package.STATE_MACHINE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>) newValue);
				return;
			case Mif2Package.STATE_MACHINE__STATE_ATTRIBUTE_NAME:
				setStateAttributeName((String) newValue);
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
			case Mif2Package.STATE_MACHINE__ANNOTATIONS:
				setAnnotations((StateMachineAnnotations) null);
				return;
			case Mif2Package.STATE_MACHINE__FIGURE:
				setFigure((Img) null);
				return;
			case Mif2Package.STATE_MACHINE__SUB_STATE:
				getSubState().clear();
				return;
			case Mif2Package.STATE_MACHINE__TRANSITION:
				getTransition().clear();
				return;
			case Mif2Package.STATE_MACHINE__STATE_ATTRIBUTE_NAME:
				setStateAttributeName(STATE_ATTRIBUTE_NAME_EDEFAULT);
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
			case Mif2Package.STATE_MACHINE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.STATE_MACHINE__FIGURE:
				return figure != null;
			case Mif2Package.STATE_MACHINE__SUB_STATE:
				return subState != null && !subState.isEmpty();
			case Mif2Package.STATE_MACHINE__TRANSITION:
				return transition != null && !transition.isEmpty();
			case Mif2Package.STATE_MACHINE__STATE_ATTRIBUTE_NAME:
				return STATE_ATTRIBUTE_NAME_EDEFAULT == null
						? stateAttributeName != null
						: !STATE_ATTRIBUTE_NAME_EDEFAULT.equals(stateAttributeName);
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stateAttributeName: ");
		result.append(stateAttributeName);
		result.append(')');
		return result.toString();
	}

} // StateMachineImpl
