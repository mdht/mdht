/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the line connecting two shapes
 * UML: Represents the GraphConnector class from Data Interchange specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphConnector#getPosition <em>Position</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphConnector#getConnectToShapeId <em>Connect To Shape Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphConnector()
 * @model extendedMetaData="name='GraphConnector' kind='elementOnly'"
 * @generated
 */
public interface GraphConnector extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a point of connection from a graph edge to a graph node
	 * UML: position attribute on GraphConnector
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Point)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphConnector_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphConnector#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

	/**
	 * Returns the value of the '<em><b>Connect To Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the shape
	 * UML: Identifies the diagramElement to which the shape is connected
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connect To Shape Id</em>' attribute.
	 * @see #setConnectToShapeId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphConnector_ConnectToShapeId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId"
	 *        extendedMetaData="kind='attribute' name='connectToShapeId'"
	 * @generated
	 */
	String getConnectToShapeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphConnector#getConnectToShapeId <em>Connect To Shape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To Shape Id</em>' attribute.
	 * @see #getConnectToShapeId()
	 * @generated
	 */
	void setConnectToShapeId(String value);

} // GraphConnector
