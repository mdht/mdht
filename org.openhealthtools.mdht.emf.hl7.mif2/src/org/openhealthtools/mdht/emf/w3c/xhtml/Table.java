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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCol <em>Col</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getThead <em>Thead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getTr <em>Tr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getBorder <em>Border</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCellpadding <em>Cellpadding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCellspacing <em>Cellspacing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getHl7Id <em>Hl7 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getLang <em>Lang</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getStyle <em>Style</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable()
 * @model extendedMetaData="name='Table' kind='elementOnly'"
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive text for labeling a table
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(Caption)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Caption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='##targetNamespace'"
	 * @generated
	 */
	Caption getCaption();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(Caption value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Col}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * col elements define the alignment properties for cells in one or more columns.
	 *               The width attribute specifies the width of the columns, e.g.
	 *                 width=64        width in screen pixels
	 *                 width=0.5*      relative width of 0.5
	 *               The span attribute causes the attributes of one col element to apply to more than one column.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Col()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='col' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Col> getCol();

	/**
	 * Returns the value of the '<em><b>Colgroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * colgroup groups a set of col elements. It allows you to group several semantically related columns together.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Colgroup</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Colgroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='colgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Colgroup> getColgroup();

	/**
	 * Returns the value of the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Header for the table (repeated at the top of each page)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thead</em>' containment reference.
	 * @see #setThead(Thead)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Thead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thead' namespace='##targetNamespace'"
	 * @generated
	 */
	Thead getThead();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getThead <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thead</em>' containment reference.
	 * @see #getThead()
	 * @generated
	 */
	void setThead(Thead value);

	/**
	 * Returns the value of the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Footer for the table (repeated at the bottom of each page)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tfoot</em>' containment reference.
	 * @see #setTfoot(Tfoot)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Tfoot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tfoot' namespace='##targetNamespace'"
	 * @generated
	 */
	Tfoot getTfoot();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getTfoot <em>Tfoot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tfoot</em>' containment reference.
	 * @see #getTfoot()
	 * @generated
	 */
	void setTfoot(Tfoot value);

	/**
	 * Returns the value of the '<em><b>Tbody</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Table body - Main content of the table
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tbody</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Tbody()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tbody' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Tbody> getTbody();

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Table row
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Tr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Tr> getTr();

	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attributes specifies the width (in pixels only) of the frame around a table
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(BigInteger)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Border()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Pixels"
	 *        extendedMetaData="kind='attribute' name='border'"
	 * @generated
	 */
	BigInteger getBorder();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cellpadding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies the amount of space between the border of the cell and its contents. If the value of this attribute is a pixel length, all four margins should be this distance from the contents. If the value of the attribute is a percentage length, the top and bottom margins should be equally separated from the content based on a percentage of the available vertical space, and the left and right margins should be equally separated from the content based on a percentage of the available horizontal space.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cellpadding</em>' attribute.
	 * @see #setCellpadding(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Cellpadding()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='cellpadding'"
	 * @generated
	 */
	String getCellpadding();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCellpadding <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellpadding</em>' attribute.
	 * @see #getCellpadding()
	 * @generated
	 */
	void setCellpadding(String value);

	/**
	 * Returns the value of the '<em><b>Cellspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies how much space the user agent should leave between the left side of the table and the left-hand side of the leftmost column, the top of the table and the top side of the topmost row, and so on for the right and bottom of the table. The attribute also specifies the amount of space to leave between cells
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cellspacing</em>' attribute.
	 * @see #setCellspacing(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Cellspacing()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='cellspacing'"
	 * @generated
	 */
	String getCellspacing();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCellspacing <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellspacing</em>' attribute.
	 * @see #getCellspacing()
	 * @generated
	 */
	void setCellspacing(String value);

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
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Class()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	MifClassType getClass_();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getClass_ <em>Class</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClass()
	 * @see #getClass_()
	 * @see #setClass(MifClassType)
	 * @generated
	 */
	void unsetClass();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getClass_ <em>Class</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.w3c.xhtml.TFrame}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies which sides of the frame surrounding a table will be visible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TFrame
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #setFrame(TFrame)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Frame()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='frame'"
	 * @generated
	 */
	TFrame getFrame();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TFrame
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(TFrame value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrame()
	 * @see #getFrame()
	 * @see #setFrame(TFrame)
	 * @generated
	 */
	void unsetFrame();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getFrame <em>Frame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame</em>' attribute is set.
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @see #setFrame(TFrame)
	 * @generated
	 */
	boolean isSetFrame();

	/**
	 * Returns the value of the '<em><b>Hl7 Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a unique identifier for the element within the context of the element containing the markup, not necessarily the entire document
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hl7 Id</em>' attribute.
	 * @see #setHl7Id(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Hl7Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='hl7Id'"
	 * @generated
	 */
	String getHl7Id();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getHl7Id <em>Hl7 Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hl7 Id</em>' attribute.
	 * @see #getHl7Id()
	 * @generated
	 */
	void setHl7Id(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * language code (as per XML 1.0 spec)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.w3c.xhtml.TRules}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies which rules will appear between cells within a table
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rules</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TRules
	 * @see #isSetRules()
	 * @see #unsetRules()
	 * @see #setRules(TRules)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Rules()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rules'"
	 * @generated
	 */
	TRules getRules();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getRules <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TRules
	 * @see #isSetRules()
	 * @see #unsetRules()
	 * @see #getRules()
	 * @generated
	 */
	void setRules(TRules value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getRules <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRules()
	 * @see #getRules()
	 * @see #setRules(TRules)
	 * @generated
	 */
	void unsetRules();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getRules <em>Rules</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rules</em>' attribute is set.
	 * @see #unsetRules()
	 * @see #getRules()
	 * @see #setRules(TRules)
	 * @generated
	 */
	boolean isSetRules();

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
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Style()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	StyleSheet getStyle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getStyle <em>Style</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleSheet)
	 * @generated
	 */
	void unsetStyle();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getStyle <em>Style</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the desired width of the entire table and is intended for visual user agents. When the value is a percentage value, the value is relative to the user agent's available horizontal space. In the absence of any width specification, table width is determined by the user agent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getTable_Width()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // Table
