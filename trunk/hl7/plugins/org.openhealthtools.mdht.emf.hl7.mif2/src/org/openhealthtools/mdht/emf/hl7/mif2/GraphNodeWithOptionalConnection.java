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
package org.openhealthtools.mdht.emf.hl7.mif2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Node With Optional Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A GraphNode that has an optional connection to the shape of its 'owning' element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNodeWithOptionalConnection#getAnchorage <em>Anchorage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphNodeWithOptionalConnection()
 * @model extendedMetaData="name='GraphNodeWithOptionalConnection' kind='elementOnly'"
 * @generated
 */
public interface GraphNodeWithOptionalConnection extends ContainedGraphNode {
	/**
	 * Returns the value of the '<em><b>Anchorage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shows the connection between the current element and it's "owning" element.
	 * UML: GraphNode anchorage association to GraphConnector
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anchorage</em>' containment reference.
	 * @see #setAnchorage(GraphConnectorWithEdge)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphNodeWithOptionalConnection_Anchorage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anchorage' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphConnectorWithEdge getAnchorage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNodeWithOptionalConnection#getAnchorage <em>Anchorage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchorage</em>' containment reference.
	 * @see #getAnchorage()
	 * @generated
	 */
	void setAnchorage(GraphConnectorWithEdge value);

} // GraphNodeWithOptionalConnection
