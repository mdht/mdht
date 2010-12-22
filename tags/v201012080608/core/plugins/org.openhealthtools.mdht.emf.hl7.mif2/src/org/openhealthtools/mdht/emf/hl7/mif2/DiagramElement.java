/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Represents a stereotype on the DiagramElement class from Data Interchange specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DiagramElement#getLastAdjustedDateTime <em>Last Adjusted Date Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DiagramElement#getShapeId <em>Shape Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDiagramElement()
 * @model abstract="true"
 *        extendedMetaData="name='DiagramElement' kind='empty'"
 * @generated
 */
public interface DiagramElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Last Adjusted Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the when the position of this shape was last adjusted/confirmed.  (Used to identify shapes whose characteristics have been adjusted, but whose positions have not yet been confirmed.
	 * UML: Tagged value on HL7GraphElement stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Adjusted Date Time</em>' attribute.
	 * @see #setLastAdjustedDateTime(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDiagramElement_LastAdjustedDateTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='lastAdjustedDateTime'"
	 * @generated
	 */
	XMLGregorianCalendar getLastAdjustedDateTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DiagramElement#getLastAdjustedDateTime <em>Last Adjusted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Adjusted Date Time</em>' attribute.
	 * @see #getLastAdjustedDateTime()
	 * @generated
	 */
	void setLastAdjustedDateTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The internal identifier assigned to a particular shape.  Used for cross-referencing.
	 * UML: Tag on DiagramElement stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shape Id</em>' attribute.
	 * @see #setShapeId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDiagramElement_ShapeId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId"
	 *        extendedMetaData="kind='attribute' name='shapeId'"
	 * @generated
	 */
	String getShapeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DiagramElement#getShapeId <em>Shape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Id</em>' attribute.
	 * @see #getShapeId()
	 * @generated
	 */
	void setShapeId(String value);

} // DiagramElement
