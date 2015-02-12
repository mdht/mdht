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
 * A representation of the model object '<em><b>Publication Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * References a specific item to be published within the publication
 * UML: A ModelElement imported into the package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem#getFollowingText <em>Following Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem#getRenderingStyle <em>Rendering Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationItem()
 * @model extendedMetaData="name='PublicationItem' kind='elementOnly'"
 * @generated
 */
public interface PublicationItem extends PublicationBase {
	/**
	 * Returns the value of the '<em><b>Item Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The item to be published
	 * UML: The imported element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Reference</em>' containment reference.
	 * @see #setItemReference(PackageOrArtifactRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationItem_ItemReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='itemReference' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageOrArtifactRef getItemReference();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem#getItemReference <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Reference</em>' containment reference.
	 * @see #getItemReference()
	 * @generated
	 */
	void setItemReference(PackageOrArtifactRef value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ItemFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what content from the referenced item should be included (for 'include') and excluded for 'exclude'.  Includes are processed first.  If no includes are specified, the base content is all content.
	 * UML: A tag on the PublicationItem stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationItem_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemFilter> getFilter();

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationItem_FollowingText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='followingText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComplexMarkupWithLanguage> getFollowingText();

	/**
	 * Returns the value of the '<em><b>Rendering Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactRenderingStyleKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides guidance on how the referenced artifact should be rendered
	 * UML: A tag on the PublicationItem stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering Style</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ArtifactRenderingStyleKind
	 * @see #isSetRenderingStyle()
	 * @see #unsetRenderingStyle()
	 * @see #setRenderingStyle(ArtifactRenderingStyleKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationItem_RenderingStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='renderingStyle'"
	 * @generated
	 */
	ArtifactRenderingStyleKind getRenderingStyle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem#getRenderingStyle <em>Rendering Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering Style</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ArtifactRenderingStyleKind
	 * @see #isSetRenderingStyle()
	 * @see #unsetRenderingStyle()
	 * @see #getRenderingStyle()
	 * @generated
	 */
	void setRenderingStyle(ArtifactRenderingStyleKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem#getRenderingStyle <em>Rendering Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRenderingStyle()
	 * @see #getRenderingStyle()
	 * @see #setRenderingStyle(ArtifactRenderingStyleKind)
	 * @generated
	 */
	void unsetRenderingStyle();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem#getRenderingStyle <em>Rendering Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rendering Style</em>' attribute is set.
	 * @see #unsetRenderingStyle()
	 * @see #getRenderingStyle()
	 * @see #setRenderingStyle(ArtifactRenderingStyleKind)
	 * @generated
	 */
	boolean isSetRenderingStyle();

} // PublicationItem
