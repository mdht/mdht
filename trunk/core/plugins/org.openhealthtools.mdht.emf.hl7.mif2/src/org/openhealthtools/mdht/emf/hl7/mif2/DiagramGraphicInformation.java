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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Graphic Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The graphic representation for a UML concept that corresponds to a complete diagram
 * UML: Stereotype restricting GraphicInformation to a Diagram
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DiagramGraphicInformation#getGraphElement <em>Graph Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDiagramGraphicInformation()
 * @model extendedMetaData="name='DiagramGraphicInformation' kind='elementOnly'"
 * @generated
 */
public interface DiagramGraphicInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Graph Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The graphic node corresponding to the element
	 * UML: graphElement association to Diagram specialization of ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Element</em>' containment reference.
	 * @see #setGraphElement(Diagram)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDiagramGraphicInformation_GraphElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='graphElement' namespace='##targetNamespace'"
	 * @generated
	 */
	Diagram getGraphElement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DiagramGraphicInformation#getGraphElement <em>Graph Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Element</em>' containment reference.
	 * @see #getGraphElement()
	 * @generated
	 */
	void setGraphElement(Diagram value);

} // DiagramGraphicInformation
