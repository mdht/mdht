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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flat Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Class within a 'flat' model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FlatClass#getChildClass <em>Child Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FlatClass#getParentClass <em>Parent Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFlatClass()
 * @model extendedMetaData="name='FlatClass' kind='elementOnly'"
 * @generated
 */
public interface FlatClass extends ClassBase {
	/**
	 * Returns the value of the '<em><b>Child Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies classes that are descended from the current class (as part of a generalization-specialization hierarchy).
	 * UML: The children of the Generalization of this class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Class</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFlatClass_ChildClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='childClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClassGeneralization> getChildClass();

	/**
	 * Returns the value of the '<em><b>Parent Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies classes that are parents of the current class (as part of a generalization-specialization hierarchy).
	 * UML: The parents of the Specialization of this class
	 * Derive: todo - all classes which list the current class as a childClass
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Class</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFlatClass_ParentClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClassGeneralization> getParentClass();

} // FlatClass
