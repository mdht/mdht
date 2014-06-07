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
import org.openhealthtools.mdht.emf.hl7.mif2.GraphEdgeWithAnchor;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Connector With Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GraphConnectorWithEdgeImpl#getGraphEdge <em>Graph Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphConnectorWithEdgeImpl extends GraphConnectorImpl implements GraphConnectorWithEdge {
	/**
	 * The cached value of the '{@link #getGraphEdge() <em>Graph Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphEdge()
	 * @generated
	 * @ordered
	 */
	protected GraphEdgeWithAnchor graphEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphConnectorWithEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.GRAPH_CONNECTOR_WITH_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEdgeWithAnchor getGraphEdge() {
		return graphEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphEdge(GraphEdgeWithAnchor newGraphEdge, NotificationChain msgs) {
		GraphEdgeWithAnchor oldGraphEdge = graphEdge;
		graphEdge = newGraphEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.GRAPH_CONNECTOR_WITH_EDGE__GRAPH_EDGE, oldGraphEdge, newGraphEdge);
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
	public void setGraphEdge(GraphEdgeWithAnchor newGraphEdge) {
		if (newGraphEdge != graphEdge) {
			NotificationChain msgs = null;
			if (graphEdge != null) {
				msgs = ((InternalEObject) graphEdge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.GRAPH_CONNECTOR_WITH_EDGE__GRAPH_EDGE, null, msgs);
			}
			if (newGraphEdge != null) {
				msgs = ((InternalEObject) newGraphEdge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.GRAPH_CONNECTOR_WITH_EDGE__GRAPH_EDGE, null, msgs);
			}
			msgs = basicSetGraphEdge(newGraphEdge, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.GRAPH_CONNECTOR_WITH_EDGE__GRAPH_EDGE, newGraphEdge, newGraphEdge));
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
			case Mif2Package.GRAPH_CONNECTOR_WITH_EDGE__GRAPH_EDGE:
				return basicSetGraphEdge(null, msgs);
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
			case Mif2Package.GRAPH_CONNECTOR_WITH_EDGE__GRAPH_EDGE:
				return getGraphEdge();
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
			case Mif2Package.GRAPH_CONNECTOR_WITH_EDGE__GRAPH_EDGE:
				setGraphEdge((GraphEdgeWithAnchor) newValue);
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
			case Mif2Package.GRAPH_CONNECTOR_WITH_EDGE__GRAPH_EDGE:
				setGraphEdge((GraphEdgeWithAnchor) null);
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
			case Mif2Package.GRAPH_CONNECTOR_WITH_EDGE__GRAPH_EDGE:
				return graphEdge != null;
		}
		return super.eIsSet(featureID);
	}

} // GraphConnectorWithEdgeImpl
