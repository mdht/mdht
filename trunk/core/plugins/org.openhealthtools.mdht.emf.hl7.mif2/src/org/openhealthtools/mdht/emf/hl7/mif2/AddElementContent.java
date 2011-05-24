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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Element Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an element to be inserted, where the content of this element is the content of the element to be added
 * UML: Part of a complex tag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getReplacementContent <em>Replacement Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getAddElements <em>Add Elements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getAddAttribute <em>Add Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getAddElement <em>Add Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getAfterElementName <em>After Element Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getAfterRepetition <em>After Repetition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAddElementContent()
 * @model extendedMetaData="name='AddElementContent' kind='elementOnly'"
 * @generated
 */
public interface AddElementContent extends Change {
	/**
	 * Returns the value of the '<em><b>Replacement Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the attributes and elements to be inserted into the new element
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replacement Content</em>' containment reference.
	 * @see #setReplacementContent(MifContent)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAddElementContent_ReplacementContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='replacementContent' namespace='##targetNamespace'"
	 * @generated
	 */
	MifContent getReplacementContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getReplacementContent <em>Replacement Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Content</em>' containment reference.
	 * @see #getReplacementContent()
	 * @generated
	 */
	void setReplacementContent(MifContent value);

	/**
	 * Returns the value of the '<em><b>Add Elements</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements to add attributes or elements, allows addElement content to be defined the same as changeElement
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Elements</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAddElementContent_AddElements()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AddElements:3'"
	 * @generated
	 */
	FeatureMap getAddElements();

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAddElementContent_AddAttribute()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAttribute' namespace='##targetNamespace' group='#AddElements:3'"
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAddElementContent_AddElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addElement' namespace='##targetNamespace' group='#AddElements:3'"
	 * @generated
	 */
	EList<AddElementContent> getAddElement();

	/**
	 * Returns the value of the '<em><b>After Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the element after which the new element should be inserted.  If omitted, then the new element will be inserted prior to any elements from the original reference element
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>After Element Name</em>' attribute.
	 * @see #setAfterElementName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAddElementContent_AfterElementName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId"
	 *        extendedMetaData="kind='attribute' name='afterElementName'"
	 * @generated
	 */
	String getAfterElementName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getAfterElementName <em>After Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Element Name</em>' attribute.
	 * @see #getAfterElementName()
	 * @generated
	 */
	void setAfterElementName(String value);

	/**
	 * Returns the value of the '<em><b>After Repetition</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repetition number of the element being referenced in the original specification after which to insert the new element
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>After Repetition</em>' attribute.
	 * @see #isSetAfterRepetition()
	 * @see #unsetAfterRepetition()
	 * @see #setAfterRepetition(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAddElementContent_AfterRepetition()
	 * @model default="1" unsettable="true" dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallPositiveInteger"
	 *        extendedMetaData="kind='attribute' name='afterRepetition'"
	 * @generated
	 */
	BigInteger getAfterRepetition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getAfterRepetition <em>After Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Repetition</em>' attribute.
	 * @see #isSetAfterRepetition()
	 * @see #unsetAfterRepetition()
	 * @see #getAfterRepetition()
	 * @generated
	 */
	void setAfterRepetition(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getAfterRepetition <em>After Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAfterRepetition()
	 * @see #getAfterRepetition()
	 * @see #setAfterRepetition(BigInteger)
	 * @generated
	 */
	void unsetAfterRepetition();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getAfterRepetition <em>After Repetition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>After Repetition</em>' attribute is set.
	 * @see #unsetAfterRepetition()
	 * @see #getAfterRepetition()
	 * @see #setAfterRepetition(BigInteger)
	 * @generated
	 */
	boolean isSetAfterRepetition();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the element to be added
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAddElementContent_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AddElementContent
