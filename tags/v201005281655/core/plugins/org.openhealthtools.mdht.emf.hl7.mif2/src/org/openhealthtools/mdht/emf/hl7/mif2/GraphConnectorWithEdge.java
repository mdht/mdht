/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Connector With Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the line connecting two shapes
 * UML: A GraphConnector class with an out-going line on its end.  (You have to have an outgoing line.  Just created a separate type so it would have a name.)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphConnectorWithEdge#getGraphEdge <em>Graph Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphConnectorWithEdge()
 * @model extendedMetaData="name='GraphConnectorWithEdge' kind='elementOnly'"
 * @generated
 */
public interface GraphConnectorWithEdge extends GraphConnector {
	/**
	 * Returns the value of the '<em><b>Graph Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The edge that connects the current element to it's containing element.
	 * UML: GraphConnector graphEdge association to GraphEdge
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Edge</em>' containment reference.
	 * @see #setGraphEdge(GraphEdgeWithAnchor)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphConnectorWithEdge_GraphEdge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='graphEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphEdgeWithAnchor getGraphEdge();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphConnectorWithEdge#getGraphEdge <em>Graph Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Edge</em>' containment reference.
	 * @see #getGraphEdge()
	 * @generated
	 */
	void setGraphEdge(GraphEdgeWithAnchor value);

} // GraphConnectorWithEdge
