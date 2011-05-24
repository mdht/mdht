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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint expressed in a particular language
 * UML: Type used by a complex stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalExpression#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFormalExpression()
 * @model extendedMetaData="name='FormalExpression' kind='mixed'"
 * @generated
 */
public interface FormalExpression extends VariousMixedContent {
	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ExpressionLanguageKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the language in which the expression is encoded
	 * UML: Type used by a complex stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ExpressionLanguageKind
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #setEncoding(ExpressionLanguageKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFormalExpression_Encoding()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	ExpressionLanguageKind getEncoding();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalExpression#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ExpressionLanguageKind
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(ExpressionLanguageKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalExpression#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(ExpressionLanguageKind)
	 * @generated
	 */
	void unsetEncoding();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalExpression#getEncoding <em>Encoding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encoding</em>' attribute is set.
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(ExpressionLanguageKind)
	 * @generated
	 */
	boolean isSetEncoding();

} // FormalExpression
