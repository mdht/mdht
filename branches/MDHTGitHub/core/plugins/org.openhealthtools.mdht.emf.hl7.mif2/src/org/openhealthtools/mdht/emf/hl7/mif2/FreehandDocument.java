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
 * A representation of the model object '<em><b>Freehand Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A stand-alone free-handdocument
 * UML: A stereotype on package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FreehandDocument#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FreehandDocument#getDocumentContent <em>Document Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFreehandDocument()
 * @model extendedMetaData="name='FreehandDocument' kind='elementOnly'"
 * @generated
 */
public interface FreehandDocument extends org.openhealthtools.mdht.emf.hl7.mif2.Package {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the free-hand document.
	 * UML: A collector for the comments and constraints associated with a static model package.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(FreehandDocumentAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFreehandDocument_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	FreehandDocumentAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.FreehandDocument#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(FreehandDocumentAnnotations value);

	/**
	 * Returns the value of the '<em><b>Document Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual content of the free-hand document expressed in a given language
	 * UML: A stereotype of Comment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Content</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFreehandDocument_DocumentContent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='documentContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComplexMarkupWithLanguage> getDocumentContent();

} // FreehandDocument
