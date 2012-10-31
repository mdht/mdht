/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.association;

import java.math.BigInteger;

import org.openhealthtools.mdht.cts2.core.AssociationDirection;
import org.openhealthtools.mdht.cts2.core.EntitySynopsis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Node</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The summary of an association as represented in a flattened graph structure.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.GraphNode#getNodeEntity <em>Node Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.GraphNode#getDirection <em>Direction</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.GraphNode#getNextNodeNumber <em>Next Node Number</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.GraphNode#getNodeNumber <em>Node Number</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getGraphNode()
 * @model extendedMetaData="name='GraphNode' kind='elementOnly'"
 * @generated
 */
public interface GraphNode extends AssociationDirectoryEntry {
	/**
	 * Returns the value of the '<em><b>Node Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the URI, name and a designation for the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">EntityReference</i> represented by this
	 * node. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">nodeEntity</i> represents the association <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">subject</i> when <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">direction</i> is
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">SOURCE_TO_TARGET</i> and (one of the) targets when <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">direction</i> is <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">TARGET_TO_SOURCE.</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Node Entity</em>' containment reference.
	 * @see #setNodeEntity(EntitySynopsis)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getGraphNode_NodeEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nodeEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EntitySynopsis getNodeEntity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.GraphNode#getNodeEntity <em>Node Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Node Entity</em>' containment reference.
	 * @see #getNodeEntity()
	 * @generated
	 */
	void setNodeEntity(EntitySynopsis value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.AssociationDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an indicator whether <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">nodeEntity</i> plays a source or a target role in the
	 * accompanying <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">AssociationDirectory</i> instance
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.AssociationDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(AssociationDirection)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getGraphNode_Direction()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='direction'"
	 * @generated
	 */
	AssociationDirection getDirection();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.GraphNode#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Direction</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.AssociationDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(AssociationDirection value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.association.GraphNode#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(AssociationDirection)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.association.GraphNode#getDirection <em>Direction</em>}' attribute is
	 * set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(AssociationDirection)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Next Node Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an integer that represents the next graph node that is reached by traversing the specified <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">predicate</i> in the specified <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">direction</i>. This number will only be present if the result of
	 * traversing <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">predicate</i> results in an <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">EntityReference</i>. Target nodes of type <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">ResourceReference</i> or <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">Literal</i> will not be assigned node numbers. Note that each <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">EntityReference</i> target of
	 * a nested BNODE will be represented by a different <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">GraphNode</i>.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Next Node Number</em>' attribute.
	 * @see #setNextNodeNumber(BigInteger)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getGraphNode_NextNodeNumber()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.NaturalNumber"
	 *        extendedMetaData="kind='attribute' name='nextNodeNumber'"
	 * @generated
	 */
	BigInteger getNextNodeNumber();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.GraphNode#getNextNodeNumber <em>Next Node Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Next Node Number</em>' attribute.
	 * @see #getNextNodeNumber()
	 * @generated
	 */
	void setNextNodeNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Node Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an integer that corresponds to the particular <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">EntityReference</i> in <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">nodeEntity</i>. Every instance of the same <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">EntityReference</i> will be represented by the same <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">nodeNumber</i>. There
	 * will be graph node for every <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">source predicate target </i>combination in the
	 * association, with multiple GraphNodes being generated for <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">targets</i> that are of
	 * type set or BNode.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Node Number</em>' attribute.
	 * @see #setNodeNumber(BigInteger)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getGraphNode_NodeNumber()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.NaturalNumber" required="true"
	 *        extendedMetaData="kind='attribute' name='nodeNumber'"
	 * @generated
	 */
	BigInteger getNodeNumber();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.GraphNode#getNodeNumber <em>Node Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Node Number</em>' attribute.
	 * @see #getNodeNumber()
	 * @generated
	 */
	void setNodeNumber(BigInteger value);

} // GraphNode
