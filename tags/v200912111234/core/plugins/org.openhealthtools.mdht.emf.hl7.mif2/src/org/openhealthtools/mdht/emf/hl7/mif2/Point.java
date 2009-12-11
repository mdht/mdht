/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a single position using x and y coordinates where origin is in the top-left, with positive numbers increasing to the bottom and right.
 * UML: The Point datatype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Point#getX <em>X</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Point#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPoint()
 * @model extendedMetaData="name='Point' kind='empty'"
 * @generated
 */
public interface Point extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a position along the horizontal axis in inches.  Positions are relative to other GraphElements, rather than to any particular location on a page.  (The page will consist of the bounding rectangle containing all shapes.)
	 * UML: (Diagram Interchange) Point.x
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(BigDecimal)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPoint_X()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.GraphicMeasurement" required="true"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	BigDecimal getX();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Point#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a position along the vertical axis in inches.  Positions are relative to other GraphElements, rather than to any particular location on a page.  (The page will consist of the bounding rectangle containing all shapes.)
	 * UML: (Diagram Interchange) Point.y
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(BigDecimal)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPoint_Y()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.GraphicMeasurement" required="true"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	BigDecimal getY();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Point#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(BigDecimal value);

} // Point
