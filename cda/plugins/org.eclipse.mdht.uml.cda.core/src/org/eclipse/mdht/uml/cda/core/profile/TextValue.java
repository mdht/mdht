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
package org.eclipse.mdht.uml.cda.core.profile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.TextValue#getValue <em>Value</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.TextValue#isIgnoreCase <em>Ignore Case</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getTextValue()
 * @model
 * @generated
 */
public interface TextValue extends PropertyValidation {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getTextValue_Value()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Returns the value of the '<em><b>Ignore Case</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Case</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Ignore Case</em>' attribute.
	 * @see #setIgnoreCase(boolean)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getTextValue_IgnoreCase()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isIgnoreCase();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.TextValue#isIgnoreCase <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Ignore Case</em>' attribute.
	 * @see #isIgnoreCase()
	 * @generated
	 */
	void setIgnoreCase(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.TextValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TextValue
