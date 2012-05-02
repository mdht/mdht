/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.term.core.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CR</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CR#getName <em>Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CR#getValue <em>Value</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CR#isInverted <em>Inverted</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCR()
 * @model
 * @generated
 */
public interface CR extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(CD)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCR_Name()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CD getName();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(CD)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCR_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CD getValue();

	/**
	 * Returns the value of the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverted</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Inverted</em>' attribute.
	 * @see #setInverted(boolean)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCR_Inverted()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isInverted();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CR#isInverted <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Inverted</em>' attribute.
	 * @see #isInverted()
	 * @generated
	 */
	void setInverted(boolean value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CR#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CD value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CR#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CD value);

} // CR
