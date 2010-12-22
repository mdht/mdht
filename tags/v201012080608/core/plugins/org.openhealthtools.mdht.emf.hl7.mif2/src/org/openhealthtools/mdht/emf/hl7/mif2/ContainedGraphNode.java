/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contained Graph Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A GraphNode that has a contained relationship to a Diagram
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContainedGraphNode#getShapeTemplate <em>Shape Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContainedGraphNode()
 * @model extendedMetaData="name='ContainedGraphNode' kind='elementOnly'"
 * @generated
 */
public interface ContainedGraphNode extends GraphNode {
	/**
	 * Returns the value of the '<em><b>Shape Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated: Function now handled by GraphicInformation.graphicRepresentation
	 * UML: deprecated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shape Template</em>' attribute.
	 * @see #setShapeTemplate(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContainedGraphNode_ShapeTemplate()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='shapeTemplate'"
	 * @generated
	 */
	String getShapeTemplate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContainedGraphNode#getShapeTemplate <em>Shape Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Template</em>' attribute.
	 * @see #getShapeTemplate()
	 * @generated
	 */
	void setShapeTemplate(String value);

} // ContainedGraphNode
