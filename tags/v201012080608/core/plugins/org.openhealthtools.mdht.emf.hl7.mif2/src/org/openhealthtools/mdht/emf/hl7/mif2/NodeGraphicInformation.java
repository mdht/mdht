/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Graphic Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The graphic representation for a UML concept displayed as a single node
 * UML: Stereotype restricting GraphicInformation to a single Node
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.NodeGraphicInformation#getGraphElement <em>Graph Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getNodeGraphicInformation()
 * @model extendedMetaData="name='NodeGraphicInformation' kind='elementOnly'"
 * @generated
 */
public interface NodeGraphicInformation extends GraphicInformation {
	/**
	 * Returns the value of the '<em><b>Graph Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The graphic node corresponding to the element
	 * UML: graphElement association to GraphNode specialization of ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Element</em>' containment reference.
	 * @see #setGraphElement(ContainedGraphNode)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getNodeGraphicInformation_GraphElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='graphElement' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainedGraphNode getGraphElement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.NodeGraphicInformation#getGraphElement <em>Graph Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Element</em>' containment reference.
	 * @see #getGraphElement()
	 * @generated
	 */
	void setGraphElement(ContainedGraphNode value);

} // NodeGraphicInformation
