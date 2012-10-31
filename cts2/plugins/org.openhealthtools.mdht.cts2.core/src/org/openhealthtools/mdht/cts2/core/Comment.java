/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Note</i> about the history, scope or provenance of the containing element. <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Comment</i> is differentiated from <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Example</i>
 * and <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Definition</i> specifically because it is frequently searched and
 * displayed under different circumstances and usage contexts. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Example</i> and <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Definition</i> are frequently made available to the end users of a code system while <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Comment</i>s are typically consumed by authors and
 * editors.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Comment#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getComment()
 * @model extendedMetaData="name='Comment' kind='elementOnly'"
 * @generated
 */
public interface Comment extends Note {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.NoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.NoteType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(NoteType)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getComment_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	NoteType getType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Comment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.NoteType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(NoteType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.core.Comment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(NoteType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.core.Comment#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(NoteType)
	 * @generated
	 */
	boolean isSetType();

} // Comment
