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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Codegen Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getBasePackage <em>Base Package</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getNsPrefix <em>Ns Prefix</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getNsURI <em>Ns URI</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getPackageName <em>Package Name</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getPrefix <em>Prefix</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getBase_Namespace <em>Base Namespace</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport()
 * @model
 * @generated
 */
public interface CodegenSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Namespace</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Namespace</em>' reference.
	 * @see #setBase_Namespace(Namespace)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_Base_Namespace()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Namespace getBase_Namespace();

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_BasePackage()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Returns the value of the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns Prefix</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Ns Prefix</em>' attribute.
	 * @see #setNsPrefix(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_NsPrefix()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getNsPrefix();

	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns URI</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_NsURI()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getNsURI();

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_PackageName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_Prefix()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getBase_Namespace <em>Base Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Namespace</em>' reference.
	 * @see #getBase_Namespace()
	 * @generated
	 */
	void setBase_Namespace(Namespace value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getNsPrefix <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Ns Prefix</em>' attribute.
	 * @see #getNsPrefix()
	 * @generated
	 */
	void setNsPrefix(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.CodegenSupport#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // CodegenSupport
