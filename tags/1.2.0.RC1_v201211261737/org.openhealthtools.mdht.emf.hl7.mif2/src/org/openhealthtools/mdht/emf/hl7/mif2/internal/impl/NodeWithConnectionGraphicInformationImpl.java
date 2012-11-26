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

import org.openhealthtools.mdht.emf.hl7.mif2.GraphNodeWithOptionalConnection;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.NodeWithConnectionGraphicInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node With Connection Graphic Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.NodeWithConnectionGraphicInformationImpl#getGraphElement <em>Graph Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeWithConnectionGraphicInformationImpl extends GraphicInformationImpl implements
		NodeWithConnectionGraphicInformation {
	/**
	 * The cached value of the '{@link #getGraphElement() <em>Graph Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphElement()
	 * @generated
	 * @ordered
	 */
	protected GraphNodeWithOptionalConnection graphElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeWithConnectionGraphicInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphNodeWithOptionalConnection getGraphElement() {
		return graphElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphElement(GraphNodeWithOptionalConnection newGraphElement,
			NotificationChain msgs) {
		GraphNodeWithOptionalConnection oldGraphElement = graphElement;
		graphElement = newGraphElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION__GRAPH_ELEMENT,
				oldGraphElement, newGraphElement);
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
	public void setGraphElement(GraphNodeWithOptionalConnection newGraphElement) {
		if (newGraphElement != graphElement) {
			NotificationChain msgs = null;
			if (graphElement != null) {
				msgs = ((InternalEObject) graphElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION__GRAPH_ELEMENT, null, msgs);
			}
			if (newGraphElement != null) {
				msgs = ((InternalEObject) newGraphElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION__GRAPH_ELEMENT, null, msgs);
			}
			msgs = basicSetGraphElement(newGraphElement, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION__GRAPH_ELEMENT,
				newGraphElement, newGraphElement));
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
			case Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION__GRAPH_ELEMENT:
				return basicSetGraphElement(null, msgs);
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
			case Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION__GRAPH_ELEMENT:
				return getGraphElement();
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
			case Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION__GRAPH_ELEMENT:
				setGraphElement((GraphNodeWithOptionalConnection) newValue);
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
			case Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION__GRAPH_ELEMENT:
				setGraphElement((GraphNodeWithOptionalConnection) null);
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
			case Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION__GRAPH_ELEMENT:
				return graphElement != null;
		}
		return super.eIsSet(featureID);
	}

} // NodeWithConnectionGraphicInformationImpl
