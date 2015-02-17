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
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getBlock <em>Block</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getP <em>P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getDiv <em>Div</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getUl <em>Ul</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getOl <em>Ol</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getDl <em>Dl</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getPre <em>Pre</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getHr <em>Hr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock()
 * @model extendedMetaData="name='Block' kind='mixed'"
 * @generated
 */
public interface Block extends EObject {
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
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock_Block()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='Block:1'"
	 * @generated
	 */
	FeatureMap getBlock();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.P}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Paragraph
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#Block:1'"
	 * @generated
	 */
	EList<P> getP();

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Div}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * generic language/style container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Div</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock_Div()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='div' namespace='##targetNamespace' group='#Block:1'"
	 * @generated
	 */
	EList<Div> getDiv();

	/**
	 * Returns the value of the '<em><b>Ul</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Ul}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unordered list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ul</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock_Ul()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ul' namespace='##targetNamespace' group='#Block:1'"
	 * @generated
	 */
	EList<Ul> getUl();

	/**
	 * Returns the value of the '<em><b>Ol</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Ol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered (numbered) list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ol</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock_Ol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ol' namespace='##targetNamespace' group='#Block:1'"
	 * @generated
	 */
	EList<Ol> getOl();

	/**
	 * Returns the value of the '<em><b>Dl</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Dl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition (term + description) list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dl</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock_Dl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dl' namespace='##targetNamespace' group='#Block:1'"
	 * @generated
	 */
	EList<Dl> getDl();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Pre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content whose spacing and formatting is to be preserved
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock_Pre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pre' namespace='##targetNamespace' group='#Block:1'"
	 * @generated
	 */
	EList<Pre> getPre();

	/**
	 * Returns the value of the '<em><b>Hr</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Hr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Horizontal rule (aka separator line)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hr</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock_Hr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hr' namespace='##targetNamespace' group='#Block:1'"
	 * @generated
	 */
	EList<Hr> getHr();

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Block quotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock_Blockquote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#Block:1'"
	 * @generated
	 */
	EList<Blockquote> getBlockquote();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.w3c.xhtml.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Two-dimensional table
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getBlock_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#Block:1'"
	 * @generated
	 */
	EList<Table> getTable();

} // Block
