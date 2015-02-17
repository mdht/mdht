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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a collection of changes accomplishing the same purpose or objective
 * UML: Part of a complex tag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupChange#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupChange#getAddAttribute <em>Add Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupChange#getAddElement <em>Add Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupChange#getRemoveAttribute <em>Remove Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupChange#getReplaceAttribute <em>Replace Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupChange#getRemoveElement <em>Remove Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupChange#getReplaceElement <em>Replace Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupChange#getChangeElement <em>Change Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupChange#getChangeGroup <em>Change Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupChange()
 * @model extendedMetaData="name='GroupChange' kind='elementOnly'"
 * @generated
 */
public interface GroupChange extends Change {
	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupChange_ChangeItems()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ChangeItems:2'"
	 * @generated
	 */
	FeatureMap getChangeItems();

	/**
	 * Returns the value of the '<em><b>Add Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an XML attribute to be added to the current context element.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Attribute</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupChange_AddAttribute()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAttribute' namespace='##targetNamespace' group='#ChangeItems:2'"
	 * @generated
	 */
	EList<AttributeContent> getAddAttribute();

	/**
	 * Returns the value of the '<em><b>Add Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an attribute to be inserted after the referenced element.  (If the element is to be inserted at the beginning prior to any element in the original document, the element name will be ommitted.)
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Element</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupChange_AddElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addElement' namespace='##targetNamespace' group='#ChangeItems:2'"
	 * @generated
	 */
	EList<AddElementContent> getAddElement();

	/**
	 * Returns the value of the '<em><b>Remove Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an XML attribute from the context element which should not appear in the resulting element
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Attribute</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupChange_RemoveAttribute()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeAttribute' namespace='##targetNamespace' group='#ChangeItems:2'"
	 * @generated
	 */
	EList<AttributeRef> getRemoveAttribute();

	/**
	 * Returns the value of the '<em><b>Replace Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an attribute in the context element which should appear in the resulting element but should have its content replaced by the specified value.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replace Attribute</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupChange_ReplaceAttribute()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replaceAttribute' namespace='##targetNamespace' group='#ChangeItems:2'"
	 * @generated
	 */
	EList<AttributeContent> getReplaceAttribute();

	/**
	 * Returns the value of the '<em><b>Remove Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ElementRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an element present in the context element which should be excluded from the resulting element.  (Default is to copy everything across.)
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Element</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupChange_RemoveElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeElement' namespace='##targetNamespace' group='#ChangeItems:2'"
	 * @generated
	 */
	EList<ElementRef> getRemoveElement();

	/**
	 * Returns the value of the '<em><b>Replace Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ReplaceElementContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an element present in the context element which should be included from the resulting element but whose content should be replaced by the specified element content
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replace Element</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupChange_ReplaceElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replaceElement' namespace='##targetNamespace' group='#ChangeItems:2'"
	 * @generated
	 */
	EList<ReplaceElementContent> getReplaceElement();

	/**
	 * Returns the value of the '<em><b>Change Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ElementChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an element present in the context element which should be included from the resulting element and which has revisions to its children
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Element</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupChange_ChangeElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeElement' namespace='##targetNamespace' group='#ChangeItems:2'"
	 * @generated
	 */
	EList<ElementChange> getChangeElement();

	/**
	 * Returns the value of the '<em><b>Change Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GroupChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a collection of changes related to a common objective or purpose
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Group</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupChange_ChangeGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeGroup' namespace='##targetNamespace' group='#ChangeItems:2'"
	 * @generated
	 */
	EList<GroupChange> getChangeGroup();

} // GroupChange
