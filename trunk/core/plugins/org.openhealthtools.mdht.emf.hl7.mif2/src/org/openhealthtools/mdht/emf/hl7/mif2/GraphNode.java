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

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Corresponds to a single 'boxed' shape
 * UML: A stereotype on the GraphNode class from Data Interchange specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#getSize <em>Size</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#isIsHeightAutoSize <em>Is Height Auto Size</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#isIsWidthAutoSize <em>Is Width Auto Size</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#getNodeOrientation <em>Node Orientation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#getTextWrappingWidth <em>Text Wrapping Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphNode()
 * @model extendedMetaData="name='GraphNode' kind='elementOnly'"
 * @generated
 */
public interface GraphNode extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the soze of the node
	 * UML: size attribute on GraphNode
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Dimension)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphNode_Size()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	Dimension getSize();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Dimension value);

	/**
	 * Returns the value of the '<em><b>Is Height Auto Size</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this element should be automatically scaled vertically to fit the contents of the element.
	 * UML: Tagged value on GraphNode stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Height Auto Size</em>' attribute.
	 * @see #isSetIsHeightAutoSize()
	 * @see #unsetIsHeightAutoSize()
	 * @see #setIsHeightAutoSize(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphNode_IsHeightAutoSize()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isHeightAutoSize'"
	 * @generated
	 */
	boolean isIsHeightAutoSize();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#isIsHeightAutoSize <em>Is Height Auto Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Height Auto Size</em>' attribute.
	 * @see #isSetIsHeightAutoSize()
	 * @see #unsetIsHeightAutoSize()
	 * @see #isIsHeightAutoSize()
	 * @generated
	 */
	void setIsHeightAutoSize(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#isIsHeightAutoSize <em>Is Height Auto Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsHeightAutoSize()
	 * @see #isIsHeightAutoSize()
	 * @see #setIsHeightAutoSize(boolean)
	 * @generated
	 */
	void unsetIsHeightAutoSize();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#isIsHeightAutoSize <em>Is Height Auto Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Height Auto Size</em>' attribute is set.
	 * @see #unsetIsHeightAutoSize()
	 * @see #isIsHeightAutoSize()
	 * @see #setIsHeightAutoSize(boolean)
	 * @generated
	 */
	boolean isSetIsHeightAutoSize();

	/**
	 * Returns the value of the '<em><b>Is Width Auto Size</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this element should be automatically scaled horizontally to fit the contents of the element.
	 * UML: Tagged value on GraphNode stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Width Auto Size</em>' attribute.
	 * @see #isSetIsWidthAutoSize()
	 * @see #unsetIsWidthAutoSize()
	 * @see #setIsWidthAutoSize(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphNode_IsWidthAutoSize()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isWidthAutoSize'"
	 * @generated
	 */
	boolean isIsWidthAutoSize();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#isIsWidthAutoSize <em>Is Width Auto Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Width Auto Size</em>' attribute.
	 * @see #isSetIsWidthAutoSize()
	 * @see #unsetIsWidthAutoSize()
	 * @see #isIsWidthAutoSize()
	 * @generated
	 */
	void setIsWidthAutoSize(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#isIsWidthAutoSize <em>Is Width Auto Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsWidthAutoSize()
	 * @see #isIsWidthAutoSize()
	 * @see #setIsWidthAutoSize(boolean)
	 * @generated
	 */
	void unsetIsWidthAutoSize();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#isIsWidthAutoSize <em>Is Width Auto Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Width Auto Size</em>' attribute is set.
	 * @see #unsetIsWidthAutoSize()
	 * @see #isIsWidthAutoSize()
	 * @see #setIsWidthAutoSize(boolean)
	 * @generated
	 */
	boolean isSetIsWidthAutoSize();

	/**
	 * Returns the value of the '<em><b>Node Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.NodeOrientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code specifying the orientation of graphic node elements, including ChoiceBox alignment and the four, flip-orientations for a Role.
	 * UML: Tagged value on GraphNode stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Orientation</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.NodeOrientation
	 * @see #isSetNodeOrientation()
	 * @see #unsetNodeOrientation()
	 * @see #setNodeOrientation(NodeOrientation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphNode_NodeOrientation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='nodeOrientation'"
	 * @generated
	 */
	NodeOrientation getNodeOrientation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#getNodeOrientation <em>Node Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Orientation</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.NodeOrientation
	 * @see #isSetNodeOrientation()
	 * @see #unsetNodeOrientation()
	 * @see #getNodeOrientation()
	 * @generated
	 */
	void setNodeOrientation(NodeOrientation value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#getNodeOrientation <em>Node Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeOrientation()
	 * @see #getNodeOrientation()
	 * @see #setNodeOrientation(NodeOrientation)
	 * @generated
	 */
	void unsetNodeOrientation();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#getNodeOrientation <em>Node Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Orientation</em>' attribute is set.
	 * @see #unsetNodeOrientation()
	 * @see #getNodeOrientation()
	 * @see #setNodeOrientation(NodeOrientation)
	 * @generated
	 */
	boolean isSetNodeOrientation();

	/**
	 * Returns the value of the '<em><b>Text Wrapping Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the width at which the text within the shape should be wrapped
	 * UML: tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Wrapping Width</em>' attribute.
	 * @see #setTextWrappingWidth(BigDecimal)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphNode_TextWrappingWidth()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.GraphicMeasurement"
	 *        extendedMetaData="kind='attribute' name='textWrappingWidth'"
	 * @generated
	 */
	BigDecimal getTextWrappingWidth();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode#getTextWrappingWidth <em>Text Wrapping Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Wrapping Width</em>' attribute.
	 * @see #getTextWrappingWidth()
	 * @generated
	 */
	void setTextWrappingWidth(BigDecimal value);

} // GraphNode
