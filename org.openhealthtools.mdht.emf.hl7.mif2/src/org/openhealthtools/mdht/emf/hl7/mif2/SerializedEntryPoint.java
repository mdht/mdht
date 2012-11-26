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
 * A representation of the model object '<em><b>Serialized Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EntryPoint stereotype for a 'serialized' model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedEntryPoint#getEntryClass <em>Entry Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedEntryPoint()
 * @model extendedMetaData="name='SerializedEntryPoint' kind='elementOnly'"
 * @generated
 */
public interface SerializedEntryPoint extends EntryPointBase {
	/**
	 * Returns the value of the '<em><b>Entry Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class pointed to by the entry-point
	 * UML: The Class that specializes (implements) the Entry Point interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Class</em>' containment reference.
	 * @see #setEntryClass(SerializedClasses)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedEntryPoint_EntryClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entryClass' namespace='##targetNamespace'"
	 * @generated
	 */
	SerializedClasses getEntryClass();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedEntryPoint#getEntryClass <em>Entry Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Class</em>' containment reference.
	 * @see #getEntryClass()
	 * @generated
	 */
	void setEntryClass(SerializedClasses value);

} // SerializedEntryPoint
