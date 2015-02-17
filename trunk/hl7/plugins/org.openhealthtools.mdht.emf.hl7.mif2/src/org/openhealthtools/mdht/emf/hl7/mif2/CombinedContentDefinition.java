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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Content Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Defines the code enumerations imported into this package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CombinedContentDefinition#getUnionWithContent <em>Union With Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CombinedContentDefinition#getIntersectionWithContent <em>Intersection With Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CombinedContentDefinition#getExcludeContent <em>Exclude Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCombinedContentDefinition()
 * @model extendedMetaData="name='CombinedContentDefinition' kind='elementOnly'"
 * @generated
 */
public interface CombinedContentDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Union With Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies that the referenced content definitions are all considered to be part of this content definition
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Union With Content</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCombinedContentDefinition_UnionWithContent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='unionWithContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContentDefinition> getUnionWithContent();

	/**
	 * Returns the value of the '<em><b>Intersection With Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the overall content definition should be considered to be the combination of all "unioned" value sets intersected with each of the 'intersection with' content definitions
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intersection With Content</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCombinedContentDefinition_IntersectionWithContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intersectionWithContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContentDefinition> getIntersectionWithContent();

	/**
	 * Returns the value of the '<em><b>Exclude Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies codes that should be removed from the set of codes resulting from the previous unions and intersections
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Content</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCombinedContentDefinition_ExcludeContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludeContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContentDefinition> getExcludeContent();

} // CombinedContentDefinition
