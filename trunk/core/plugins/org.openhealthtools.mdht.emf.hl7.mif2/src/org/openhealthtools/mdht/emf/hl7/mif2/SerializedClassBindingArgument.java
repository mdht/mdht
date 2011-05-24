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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serialized Class Binding Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A binding to a parameterized serialized Static Model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassBindingArgument#getArgumentClass <em>Argument Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClassBindingArgument()
 * @model extendedMetaData="name='SerializedClassBindingArgument' kind='elementOnly'"
 * @generated
 */
public interface SerializedClassBindingArgument extends ClassBindingArgumentBase {
	/**
	 * Returns the value of the '<em><b>Argument Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class bound to the argument.
	 * UML: The class that is bound as an argument
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument Class</em>' containment reference.
	 * @see #setArgumentClass(ClassOrReference)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClassBindingArgument_ArgumentClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='argumentClass' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassOrReference getArgumentClass();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassBindingArgument#getArgumentClass <em>Argument Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Class</em>' containment reference.
	 * @see #getArgumentClass()
	 * @generated
	 */
	void setArgumentClass(ClassOrReference value);

} // SerializedClassBindingArgument
