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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.GraphConnectorWithEdge;
import org.openhealthtools.mdht.emf.hl7.mif2.GraphNodeWithOptionalConnection;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Node With Optional Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GraphNodeWithOptionalConnectionImpl#getAnchorage <em>Anchorage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphNodeWithOptionalConnectionImpl extends ContainedGraphNodeImpl implements
		GraphNodeWithOptionalConnection {
	/**
	 * The cached value of the '{@link #getAnchorage() <em>Anchorage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorage()
	 * @generated
	 * @ordered
	 */
	protected GraphConnectorWithEdge anchorage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphNodeWithOptionalConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.GRAPH_NODE_WITH_OPTIONAL_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphConnectorWithEdge getAnchorage() {
		return anchorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchorage(GraphConnectorWithEdge newAnchorage, NotificationChain msgs) {
		GraphConnectorWithEdge oldAnchorage = anchorage;
		anchorage = newAnchorage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION__ANCHORAGE, oldAnchorage,
				newAnchorage);
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
	public void setAnchorage(GraphConnectorWithEdge newAnchorage) {
		if (newAnchorage != anchorage) {
			NotificationChain msgs = null;
			if (anchorage != null) {
				msgs = ((InternalEObject) anchorage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION__ANCHORAGE, null, msgs);
			}
			if (newAnchorage != null) {
				msgs = ((InternalEObject) newAnchorage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION__ANCHORAGE, null, msgs);
			}
			msgs = basicSetAnchorage(newAnchorage, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION__ANCHORAGE, newAnchorage,
				newAnchorage));
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
			case Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION__ANCHORAGE:
				return basicSetAnchorage(null, msgs);
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
			case Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION__ANCHORAGE:
				return getAnchorage();
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
			case Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION__ANCHORAGE:
				setAnchorage((GraphConnectorWithEdge) newValue);
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
			case Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION__ANCHORAGE:
				setAnchorage((GraphConnectorWithEdge) null);
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
			case Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION__ANCHORAGE:
				return anchorage != null;
		}
		return super.eIsSet(featureID);
	}

} // GraphNodeWithOptionalConnectionImpl
