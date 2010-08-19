/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the line connecting two shapes
 * UML: Represents the GraphEdge class from Data Interchange specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphEdge#getWaypoint <em>Waypoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphEdge()
 * @model abstract="true"
 *        extendedMetaData="name='GraphEdge' kind='elementOnly'"
 * @generated
 */
public interface GraphEdge extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Waypoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies points along the path of the graph edge between two GraphNodes.
	 * UML: waypoint attribute on GraphEdge
	 * Impl: At present, these are not used in Visio diagrams, but may be in UML
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Waypoint</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphEdge_Waypoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='waypoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Point> getWaypoint();

} // GraphEdge
