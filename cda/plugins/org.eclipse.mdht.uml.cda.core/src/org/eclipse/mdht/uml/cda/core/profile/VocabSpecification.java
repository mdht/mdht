/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.core.profile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocab Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.VocabSpecification#getCode <em>Code</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystem <em>Code System</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystemName <em>Code System Name</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystemVersion <em>Code System Version</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.VocabSpecification#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getVocabSpecification()
 * @model
 * @generated
 */
public interface VocabSpecification extends PropertyValidation {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getVocabSpecification_Code()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Code System</em>' attribute.
	 * @see #setCodeSystem(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getVocabSpecification_CodeSystem()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCodeSystem();

	/**
	 * Returns the value of the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Code System Name</em>' attribute.
	 * @see #setCodeSystemName(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getVocabSpecification_CodeSystemName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCodeSystemName();

	/**
	 * Returns the value of the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Version</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Code System Version</em>' attribute.
	 * @see #setCodeSystemVersion(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getVocabSpecification_CodeSystemVersion()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCodeSystemVersion();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getVocabSpecification_DisplayName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.VocabSpecification#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystem <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Code System</em>' attribute.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystemName <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Code System Name</em>' attribute.
	 * @see #getCodeSystemName()
	 * @generated
	 */
	void setCodeSystemName(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystemVersion <em>Code System Version</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Code System Version</em>' attribute.
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	void setCodeSystemVersion(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.VocabSpecification#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

} // VocabSpecification
