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
package org.openhealthtools.mdht.emf.w3c.xhtml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getTh <em>Th</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getTd <em>Td</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getAlign <em>Align</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getChar <em>Char</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getLang <em>Lang</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getStyle <em>Style</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getValign <em>Valign</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTr()
 * @model extendedMetaData="name='Tr' kind='elementOnly'"
 * @generated
 */
public interface Tr extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTr_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Th</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Th}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Table header for a row
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Th</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTr_Th()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='th' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Th> getTh();

	/**
	 * Returns the value of the '<em><b>Td</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Td}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Table data cell
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Td</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTr_Td()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='td' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Td> getTd();

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.w3c.xhtml.AlignType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of alignment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(AlignType)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTr_Align()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='align'"
	 * @generated
	 */
	AlignType getAlign();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(AlignType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getAlign <em>Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Align</em>' attribute is set.
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	boolean isSetAlign();

	/**
	 * Returns the value of the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * alignment char, e.g. char=':'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Char</em>' attribute.
	 * @see #setChar(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTr_Char()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Character"
	 *        extendedMetaData="kind='attribute' name='char'"
	 * @generated
	 */
	String getChar();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getChar <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' attribute.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(String value);

	/**
	 * Returns the value of the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * offset for alignment char
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charoff</em>' attribute.
	 * @see #setCharoff(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTr_Charoff()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='charoff'"
	 * @generated
	 */
	String getCharoff();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getCharoff <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charoff</em>' attribute.
	 * @see #getCharoff()
	 * @generated
	 */
	void setCharoff(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * space separated list of classes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType
	 * @see #isSetClass()
	 * @see #unsetClass()
	 * @see #setClass(MifClassType)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTr_Class()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	MifClassType getClass_();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType
	 * @see #isSetClass()
	 * @see #unsetClass()
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(MifClassType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClass()
	 * @see #getClass_()
	 * @see #setClass(MifClassType)
	 * @generated
	 */
	void unsetClass();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getClass_ <em>Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class</em>' attribute is set.
	 * @see #unsetClass()
	 * @see #getClass_()
	 * @see #setClass(MifClassType)
	 * @generated
	 */
	boolean isSetClass();

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * language code (as per XML 1.0 spec)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTr_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * associated style info
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #setStyle(StyleSheet)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTr_Style()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	StyleSheet getStyle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleSheet value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleSheet)
	 * @generated
	 */
	void unsetStyle();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getStyle <em>Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style</em>' attribute is set.
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleSheet)
	 * @generated
	 */
	boolean isSetStyle();

	/**
	 * Returns the value of the '<em><b>Valign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.w3c.xhtml.ValignType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the vertical position of text within the cell
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valign</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ValignType
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #setValign(ValignType)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTr_Valign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valign'"
	 * @generated
	 */
	ValignType getValign();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valign</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ValignType
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #getValign()
	 * @generated
	 */
	void setValign(ValignType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	void unsetValign();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getValign <em>Valign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valign</em>' attribute is set.
	 * @see #unsetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	boolean isSetValign();

} // Tr
