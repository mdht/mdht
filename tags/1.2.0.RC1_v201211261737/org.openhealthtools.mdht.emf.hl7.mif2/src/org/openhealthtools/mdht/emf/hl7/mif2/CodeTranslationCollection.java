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
 * A representation of the model object '<em><b>Code Translation Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of translations, created by a particular group
 * UML: Package of translations
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection#getHeader <em>Header</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslationCollection()
 * @model extendedMetaData="name='CodeTranslationCollection' kind='elementOnly'"
 * @generated
 */
public interface CodeTranslationCollection extends PackageBase {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General metadata information about the package
	 * UML: complex tag value on Package stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslationCollection_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the CodeTranslationCollection.
	 * UML: A collector for the comments and constraints associated with a CodeTranslationCollection.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(CodeTranslationCollectionAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslationCollection_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeTranslationCollectionAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(CodeTranslationCollectionAnnotations value);

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a translation created within the translation package
	 * UML: Dependency Model element within the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslationCollection_Translation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='translation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeTranslation> getTranslation();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name for the package in circumstances where the 'name' is more of an identifier.
	 * UML: title tag on Package stereotype
	 * DublinCore: Equivalent to 'title'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslationCollection_Title()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // CodeTranslationCollection
