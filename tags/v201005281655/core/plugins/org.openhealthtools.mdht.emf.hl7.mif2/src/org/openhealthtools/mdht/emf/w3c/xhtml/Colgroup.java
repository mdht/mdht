/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.w3c.xhtml;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colgroup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getCol <em>Col</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getAlign <em>Align</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getChar <em>Char</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getLang <em>Lang</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getSpan <em>Span</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getStyle <em>Style</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getValign <em>Valign</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getColgroup()
 * @model extendedMetaData="name='Colgroup' kind='elementOnly'"
 * @generated
 */
public interface Colgroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Col</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Col}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * col elements define the alignment properties for cells in one or more columns.
	 *             The width attribute specifies the width of the columns, e.g.
	 *               width=64        width in screen pixels
	 *               width=0.5*      relative width of 0.5
	 *             The span attribute causes the attributes of one col element to apply to more than one column.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getColgroup_Col()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='col' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Col> getCol();

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
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getColgroup_Align()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='align'"
	 * @generated
	 */
	AlignType getAlign();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getAlign <em>Align</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getAlign <em>Align</em>}' attribute is set.
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
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getColgroup_Char()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Character"
	 *        extendedMetaData="kind='attribute' name='char'"
	 * @generated
	 */
	String getChar();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getChar <em>Char</em>}' attribute.
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
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getColgroup_Charoff()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='charoff'"
	 * @generated
	 */
	String getCharoff();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getCharoff <em>Charoff</em>}' attribute.
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
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getColgroup_Class()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	MifClassType getClass_();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getClass_ <em>Class</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClass()
	 * @see #getClass_()
	 * @see #setClass(MifClassType)
	 * @generated
	 */
	void unsetClass();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getClass_ <em>Class</em>}' attribute is set.
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
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getColgroup_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the number of columns in the group
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Span</em>' attribute.
	 * @see #isSetSpan()
	 * @see #unsetSpan()
	 * @see #setSpan(BigInteger)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getColgroup_Span()
	 * @model default="1" unsettable="true" dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Number"
	 *        extendedMetaData="kind='attribute' name='span'"
	 * @generated
	 */
	BigInteger getSpan();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' attribute.
	 * @see #isSetSpan()
	 * @see #unsetSpan()
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpan()
	 * @see #getSpan()
	 * @see #setSpan(BigInteger)
	 * @generated
	 */
	void unsetSpan();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getSpan <em>Span</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Span</em>' attribute is set.
	 * @see #unsetSpan()
	 * @see #getSpan()
	 * @see #setSpan(BigInteger)
	 * @generated
	 */
	boolean isSetSpan();

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
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getColgroup_Style()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	StyleSheet getStyle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getStyle <em>Style</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleSheet)
	 * @generated
	 */
	void unsetStyle();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getStyle <em>Style</em>}' attribute is set.
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
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getColgroup_Valign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valign'"
	 * @generated
	 */
	ValignType getValign();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getValign <em>Valign</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	void unsetValign();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getValign <em>Valign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valign</em>' attribute is set.
	 * @see #unsetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	boolean isSetValign();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The width of the columns within the column group.  (The last width specified applies to the remaining columns in the group)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getColgroup_Width()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.MultiLength"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // Colgroup
