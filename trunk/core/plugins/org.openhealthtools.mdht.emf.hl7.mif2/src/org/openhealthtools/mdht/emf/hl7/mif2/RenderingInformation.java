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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rendering Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about the rendering of this XML.  The textual content (if any) contains additional information about the rendering process.
 * UML: Part of a complex tag value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation#getRenderingNotes <em>Rendering Notes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation#getApplication <em>Application</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation#getRenderingTime <em>Rendering Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRenderingInformation()
 * @model extendedMetaData="name='RenderingInformation' kind='elementOnly'"
 * @generated
 */
public interface RenderingInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Rendering Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General comments about the rendering.  (May include tooling 'plugs' :&gt;)
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering Notes</em>' containment reference.
	 * @see #setRenderingNotes(Flow)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRenderingInformation_RenderingNotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='renderingNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getRenderingNotes();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation#getRenderingNotes <em>Rendering Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering Notes</em>' containment reference.
	 * @see #getRenderingNotes()
	 * @generated
	 */
	void setRenderingNotes(Flow value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the application responsible for generating the content.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRenderingInformation_Application()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='application'"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Rendering Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date this instance was created.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering Time</em>' attribute.
	 * @see #setRenderingTime(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRenderingInformation_RenderingTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='renderingTime'"
	 * @generated
	 */
	XMLGregorianCalendar getRenderingTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation#getRenderingTime <em>Rendering Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering Time</em>' attribute.
	 * @see #getRenderingTime()
	 * @generated
	 */
	void setRenderingTime(XMLGregorianCalendar value);

} // RenderingInformation
