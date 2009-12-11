/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Edge With Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the line connecting two shapes
 * UML: A GraphEdge class with an Anchor on its end.  (You have to have an anchor on the end.  Just created a separate type so it would have a name.)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphEdgeWithAnchor#getAnchor <em>Anchor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphEdgeWithAnchor()
 * @model extendedMetaData="name='GraphEdgeWithAnchor' kind='elementOnly'"
 * @generated
 */
public interface GraphEdgeWithAnchor extends GraphEdge {
	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point at which the edge connects to the other anchor element's "owning" element.
	 * UML: anchor association from GraphEdge to GraphConnector
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anchor</em>' containment reference.
	 * @see #setAnchor(GraphConnector)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphEdgeWithAnchor_Anchor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anchor' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphConnector getAnchor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphEdgeWithAnchor#getAnchor <em>Anchor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' containment reference.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(GraphConnector value);

} // GraphEdgeWithAnchor
