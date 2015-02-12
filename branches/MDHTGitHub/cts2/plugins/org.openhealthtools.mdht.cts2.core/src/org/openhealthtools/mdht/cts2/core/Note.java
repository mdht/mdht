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
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * 
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Note</i> corresponds to the target of <a href="//http://www.w3.org/TR/skos-reference/#notes"
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">skos:note</a>. It contains an attributed literal that may include a language, format and, when
 * appropriate,
 * schema.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Note#getAssertedInCodeSystemVersion <em>Asserted In Code System Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Note#getCorrespondingStatement <em>Corresponding Statement</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Note#getExternalIdentifier <em>External Identifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getNote()
 * @model abstract="true"
 *        extendedMetaData="name='Note' kind='elementOnly'"
 * @generated
 */
public interface Note extends EntryDescription {
	/**
	 * Returns the value of the '<em><b>Asserted In Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the code system version that contains the assertion(s) represented in the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Note</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Asserted In Code System Version</em>' attribute.
	 * @see #setAssertedInCodeSystemVersion(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getNote_AssertedInCodeSystemVersion()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.CodeSystemVersionName"
	 *        extendedMetaData="kind='attribute' name='assertedInCodeSystemVersion'"
	 * @generated
	 */
	String getAssertedInCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Note#getAssertedInCodeSystemVersion <em>Asserted In Code System Version</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Asserted In Code System Version</em>' attribute.
	 * @see #getAssertedInCodeSystemVersion()
	 * @generated
	 */
	void setAssertedInCodeSystemVersion(String value);

	/**
	 * Returns the value of the '<em><b>Corresponding Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the URI of the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Statement</i> from which this note was derived. This will only be present in
	 * services that support the <b xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Statement</b> profile.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Corresponding Statement</em>' attribute.
	 * @see #setCorrespondingStatement(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getNote_CorrespondingStatement()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.RenderingURI"
	 *        extendedMetaData="kind='attribute' name='correspondingStatement'"
	 * @generated
	 */
	String getCorrespondingStatement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Note#getCorrespondingStatement <em>Corresponding Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Corresponding Statement</em>' attribute.
	 * @see #getCorrespondingStatement()
	 * @generated
	 */
	void setCorrespondingStatement(String value);

	/**
	 * Returns the value of the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an external identifier assigned to this note by an outside party
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>External Identifier</em>' attribute.
	 * @see #setExternalIdentifier(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getNote_ExternalIdentifier()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='attribute' name='externalIdentifier'"
	 * @generated
	 */
	String getExternalIdentifier();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Note#getExternalIdentifier <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>External Identifier</em>' attribute.
	 * @see #getExternalIdentifier()
	 * @generated
	 */
	void setExternalIdentifier(String value);

} // Note
