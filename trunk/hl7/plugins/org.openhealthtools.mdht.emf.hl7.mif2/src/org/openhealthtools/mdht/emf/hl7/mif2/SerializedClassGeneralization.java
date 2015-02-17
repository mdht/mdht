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
 * A representation of the model object '<em><b>Serialized Class Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Corresponds to Generalization for a 'serialized' model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassGeneralization#getSpecializedClass <em>Specialized Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClassGeneralization()
 * @model extendedMetaData="name='SerializedClassGeneralization' kind='elementOnly'"
 * @generated
 */
public interface SerializedClassGeneralization extends ClassGeneralizationBase {
	/**
	 * Returns the value of the '<em><b>Specialized Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A class that is a specialization
	 * UML: The class that is the specialization
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialized Class</em>' containment reference.
	 * @see #setSpecializedClass(ClassOrReference)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClassGeneralization_SpecializedClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specializedClass' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassOrReference getSpecializedClass();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassGeneralization#getSpecializedClass <em>Specialized Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialized Class</em>' containment reference.
	 * @see #getSpecializedClass()
	 * @generated
	 */
	void setSpecializedClass(ClassOrReference value);

} // SerializedClassGeneralization
