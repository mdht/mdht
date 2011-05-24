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

import javax.xml.datatype.XMLGregorianCalendar;

import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Markup With Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allows complex markup to identify the language in which it is expressed and when it was last translated
 * UML: Handled as 'mixed text' stored as a string, but with parallel tags identifying langage
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage#getLang <em>Lang</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage#getLastTranslated <em>Last Translated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getComplexMarkupWithLanguage()
 * @model extendedMetaData="name='ComplexMarkupWithLanguage' kind='mixed'"
 * @generated
 */
public interface ComplexMarkupWithLanguage extends Flow {
	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * The default value is <code>"EN"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the language in which the marked up text is expressed  FUTURE_USE
	 * UML: part of a complex stereotype tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #setLang(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getComplexMarkupWithLanguage_Lang()
	 * @model default="EN" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='attribute' name='lang'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLang()
	 * @see #getLang()
	 * @see #setLang(String)
	 * @generated
	 */
	void unsetLang();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage#getLang <em>Lang</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lang</em>' attribute is set.
	 * @see #unsetLang()
	 * @see #getLang()
	 * @see #setLang(String)
	 * @generated
	 */
	boolean isSetLang();

	/**
	 * Returns the value of the '<em><b>Last Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when this languages rendition was last translated from the original. FUTURE_USE
	 * UML: part of a complex stereotype tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Translated</em>' attribute.
	 * @see #setLastTranslated(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getComplexMarkupWithLanguage_LastTranslated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='lastTranslated'"
	 * @generated
	 */
	XMLGregorianCalendar getLastTranslated();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage#getLastTranslated <em>Last Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Translated</em>' attribute.
	 * @see #getLastTranslated()
	 * @generated
	 */
	void setLastTranslated(XMLGregorianCalendar value);

} // ComplexMarkupWithLanguage
