/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Represents the GraphElement class from Data Interchange specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphElement#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphElement()
 * @model abstract="true"
 *        extendedMetaData="name='GraphElement' kind='elementOnly'"
 * @generated
 */
public interface GraphElement extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the top-left location of the diagram element with respect to it's containing diagram.
	 * UML: position attribute on GraphElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Point)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphElement_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphElement#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

} // GraphElement
