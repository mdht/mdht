/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import org.openhealthtools.mdht.cts2.core.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Msg</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">ValueSetDefinition</i> read from a service instance.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg#getValueSetDefinition <em>Value Set Definition</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionMsg()
 * @model extendedMetaData="name='ValueSetDefinitionMsg' kind='elementOnly'"
 * @generated
 */
public interface ValueSetDefinitionMsg extends Message {
	/**
	 * Returns the value of the '<em><b>Value Set Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Definition</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set Definition</em>' containment reference.
	 * @see #setValueSetDefinition(ValueSetDefinition)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionMsg_ValueSetDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='valueSetDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetDefinition getValueSetDefinition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg#getValueSetDefinition
	 * <em>Value Set Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Definition</em>' containment reference.
	 * @see #getValueSetDefinition()
	 * @generated
	 */
	void setValueSetDefinition(ValueSetDefinition value);

} // ValueSetDefinitionMsg
