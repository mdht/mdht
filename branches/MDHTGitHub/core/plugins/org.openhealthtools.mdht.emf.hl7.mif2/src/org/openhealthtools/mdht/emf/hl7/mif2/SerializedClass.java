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
 * A representation of the model object '<em><b>Serialized Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Class within a 'serialized' model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClass#getChildClass <em>Child Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClass#getParentClass <em>Parent Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClass#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClass()
 * @model extendedMetaData="name='SerializedClass' kind='elementOnly'"
 * @generated
 */
public interface SerializedClass extends ClassBase {
	/**
	 * Returns the value of the '<em><b>Child Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassGeneralization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies classes that are descended from the current class (as part of a generalization-specialization hierarchy).
	 * UML: The children of the Generalization of this class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Class</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClass_ChildClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='childClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SerializedClassGeneralization> getChildClass();

	/**
	 * Returns the value of the '<em><b>Parent Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.LocalClassRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies classes that are parents of the current class (as part of a generalization-specialization hierarchy).
	 * UML: The parents of the Specialization of this class
	 * Derive: todo - all classes which list the current class as a childClass
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Class</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClass_ParentClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalClassRef> getParentClass();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The associations for the class
	 * UML: Association coming from the class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClass_Association()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='association' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SerializedAssociationEnd> getAssociation();

} // SerializedClass
