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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A preferred or alternative designation for a concept in a specified language.
 * UML: Complex tag on Concept Code stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName#isPreferredForLanguage <em>Preferred For Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPrintName()
 * @model extendedMetaData="name='PrintName' kind='elementOnly'"
 * @generated
 */
public interface PrintName extends EObject {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Communicates an icon representation of the code 
	 * UML: tag on Concept Code stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(CodeIcon)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPrintName_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeIcon getIcon();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(CodeIcon value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the language in which the print name is expressed
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPrintName_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Language" required="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Preferred For Language</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether this is the preferred print name for the specified language
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred For Language</em>' attribute.
	 * @see #isSetPreferredForLanguage()
	 * @see #unsetPreferredForLanguage()
	 * @see #setPreferredForLanguage(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPrintName_PreferredForLanguage()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='preferredForLanguage'"
	 * @generated
	 */
	boolean isPreferredForLanguage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName#isPreferredForLanguage <em>Preferred For Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred For Language</em>' attribute.
	 * @see #isSetPreferredForLanguage()
	 * @see #unsetPreferredForLanguage()
	 * @see #isPreferredForLanguage()
	 * @generated
	 */
	void setPreferredForLanguage(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName#isPreferredForLanguage <em>Preferred For Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreferredForLanguage()
	 * @see #isPreferredForLanguage()
	 * @see #setPreferredForLanguage(boolean)
	 * @generated
	 */
	void unsetPreferredForLanguage();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName#isPreferredForLanguage <em>Preferred For Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preferred For Language</em>' attribute is set.
	 * @see #unsetPreferredForLanguage()
	 * @see #isPreferredForLanguage()
	 * @see #setPreferredForLanguage(boolean)
	 * @generated
	 */
	boolean isSetPreferredForLanguage();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text representation of the print name
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPrintName_Text()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.LongDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='text'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // PrintName
