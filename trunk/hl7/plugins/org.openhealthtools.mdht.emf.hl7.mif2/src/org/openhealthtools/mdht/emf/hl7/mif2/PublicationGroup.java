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
 * A representation of the model object '<em><b>Publication Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of artifacts to be published as a group
 * UML: A stereotype of Package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationGroup#getPublicationContent <em>Publication Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationGroup#getPublishedItem <em>Published Item</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationGroup#getPublishedGroup <em>Published Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationGroup#getFollowingText <em>Following Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationGroup()
 * @model extendedMetaData="name='PublicationGroup' kind='elementOnly'"
 * @generated
 */
public interface PublicationGroup extends PublicationBase {
	/**
	 * Returns the value of the '<em><b>Publication Content</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication Content</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Content</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationGroup_PublicationContent()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PublicationContent:8'"
	 * @generated
	 */
	FeatureMap getPublicationContent();

	/**
	 * Returns the value of the '<em><b>Published Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a particular element to publish within the package
	 * UML: An owned element within the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Published Item</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationGroup_PublishedItem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publishedItem' namespace='##targetNamespace' group='#PublicationContent:8'"
	 * @generated
	 */
	EList<PublicationItem> getPublishedItem();

	/**
	 * Returns the value of the '<em><b>Published Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a sub-hierarchy of elements to appear within the publication
	 * UML: An owned element within the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Published Group</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationGroup_PublishedGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publishedGroup' namespace='##targetNamespace' group='#PublicationContent:8'"
	 * @generated
	 */
	EList<PublicationGroup> getPublishedGroup();

	/**
	 * Returns the value of the '<em><b>Following Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text to appear after the referenced element.
	 * UML: A tag on the PublicationBase stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Following Text</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationGroup_FollowingText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='followingText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComplexMarkupWithLanguage> getFollowingText();

} // PublicationGroup
