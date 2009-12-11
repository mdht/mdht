/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Connection Graphic Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The graphic representation for a UML concept displayed as a single node with a connection to its parent
 * UML: Stereotype restricting GraphicInformation to a single Node with a connection to its parent
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.NodeWithConnectionGraphicInformation#getGraphElement <em>Graph Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getNodeWithConnectionGraphicInformation()
 * @model extendedMetaData="name='NodeWithConnectionGraphicInformation' kind='elementOnly'"
 * @generated
 */
public interface NodeWithConnectionGraphicInformation extends GraphicInformation {
	/**
	 * Returns the value of the '<em><b>Graph Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The graphic node corresponding to the element
	 * UML: graphElement association to GraphNode specialization of ModelElement where GraphNode can have an edge
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Element</em>' containment reference.
	 * @see #setGraphElement(GraphNodeWithOptionalConnection)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getNodeWithConnectionGraphicInformation_GraphElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='graphElement' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphNodeWithOptionalConnection getGraphElement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.NodeWithConnectionGraphicInformation#getGraphElement <em>Graph Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Element</em>' containment reference.
	 * @see #getGraphElement()
	 * @generated
	 */
	void setGraphElement(GraphNodeWithOptionalConnection value);

} // NodeWithConnectionGraphicInformation
