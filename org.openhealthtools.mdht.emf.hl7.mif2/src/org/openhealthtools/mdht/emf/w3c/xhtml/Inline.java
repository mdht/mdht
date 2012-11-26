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
 * A representation of the model object '<em><b>Inline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * "Inline" covers inline or "text-level" elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getInline <em>Inline</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getA <em>A</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getBr <em>Br</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSpan <em>Span</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getObject <em>Object</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getImg <em>Img</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getTt <em>Tt</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getI <em>I</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getB <em>B</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getBig <em>Big</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSmall <em>Small</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getEm <em>Em</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getQ <em>Q</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getVar <em>Var</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getCite <em>Cite</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSub <em>Sub</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSup <em>Sup</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline()
 * @model extendedMetaData="name='Inline' kind='mixed'"
 * @generated
 */
public interface Inline extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Inline</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inline</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Inline()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='Inline:1'"
	 * @generated
	 */
	FeatureMap getInline();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.A}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * content is "Inline" except that anchors shouldn't be nested
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_A()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<A> getA();

	/**
	 * Returns the value of the '<em><b>Br</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Br}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * forced line break
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Br</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Br()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Br> getBr();

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Span}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * generic language/style container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Span</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Span> getSpan();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OBJECT element allows specification of data that needs to be rendered by HL7-specific tools rather than generic HTML tools.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<org.openhealthtools.mdht.emf.w3c.xhtml.Object> getObject();

	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Img}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IMG element embeds an image in the current document at the location of the element's definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Img</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Img()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Img> getImg();

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Tt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * fixed pitch font
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tt</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Tt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Tt> getTt();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.I}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * italic font
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<I> getI();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.B}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bold font
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<B> getB();

	/**
	 * Returns the value of the '<em><b>Big</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Big}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bigger font
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Big</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Big()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Big> getBig();

	/**
	 * Returns the value of the '<em><b>Small</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Small}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * smaller font
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Small</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Small()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Small> getSmall();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Em}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * emphasis
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Em> getEm();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Strong}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * strong emphasis
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Strong> getStrong();

	/**
	 * Returns the value of the '<em><b>Dfn</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Dfn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * definitional
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dfn</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Dfn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Dfn> getDfn();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * program code
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Code> getCode();

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Q}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * inlined quote
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Q()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Q> getQ();

	/**
	 * Returns the value of the '<em><b>Samp</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Samp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * sample
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Samp</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Samp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Samp> getSamp();

	/**
	 * Returns the value of the '<em><b>Kbd</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Kbd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * something user would type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kbd</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Kbd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Kbd> getKbd();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Var}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * variable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Var()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Var> getVar();

	/**
	 * Returns the value of the '<em><b>Cite</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Cite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * citation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cite</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Cite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Cite> getCite();

	/**
	 * Returns the value of the '<em><b>Abbr</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Abbr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * abbreviation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abbr</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Abbr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Abbr> getAbbr();

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Acronym}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * acronym
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Acronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Acronym> getAcronym();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Sub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * subscript
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Sub> getSub();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Sup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * superscript
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getInline_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#Inline:1'"
	 * @generated
	 */
	EList<Sup> getSup();

} // Inline
