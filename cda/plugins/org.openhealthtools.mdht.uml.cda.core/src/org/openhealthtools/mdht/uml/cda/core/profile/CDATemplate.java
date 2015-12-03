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
package org.openhealthtools.mdht.uml.cda.core.profile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateId <em>Template Id</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getAssigningAuthorityName <em>Assigning Authority Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#isContextDependent <em>Context Dependent</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateVersion <em>Template Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateMultiplicity <em>Template Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCDATemplate()
 * @model
 * @generated
 */
public interface CDATemplate extends ClassValidation {
	/**
	 * Returns the value of the '<em><b>Assigning Authority Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigning Authority Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Assigning Authority Name</em>' attribute.
	 * @see #setAssigningAuthorityName(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCDATemplate_AssigningAuthorityName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAssigningAuthorityName();

	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Template Id</em>' attribute.
	 * @see #setTemplateId(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCDATemplate_TemplateId()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getTemplateId();

	/**
	 * Returns the value of the '<em><b>Context Dependent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Dependent</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Context Dependent</em>' attribute.
	 * @see #setContextDependent(boolean)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCDATemplate_ContextDependent()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isContextDependent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getAssigningAuthorityName
	 * <em>Assigning Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Assigning Authority Name</em>' attribute.
	 * @see #getAssigningAuthorityName()
	 * @generated
	 */
	void setAssigningAuthorityName(String value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#isContextDependent <em>Context Dependent</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Context Dependent</em>' attribute.
	 * @see #isContextDependent()
	 * @generated
	 */
	void setContextDependent(boolean value);

	/**
	 * Returns the value of the '<em><b>Template Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Version</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Template Version</em>' attribute.
	 * @see #setTemplateVersion(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCDATemplate_TemplateVersion()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getTemplateVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateVersion <em>Template Version</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Template Version</em>' attribute.
	 * @see #getTemplateVersion()
	 * @generated
	 */
	void setTemplateVersion(String value);

	/**
	 * Returns the value of the '<em><b>Template Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Multiplicity</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Template Multiplicity</em>' attribute.
	 * @see #setTemplateMultiplicity(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCDATemplate_TemplateMultiplicity()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getTemplateMultiplicity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateMultiplicity <em>Template Multiplicity</em>}
	 * ' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Template Multiplicity</em>' attribute.
	 * @see #getTemplateMultiplicity()
	 * @generated
	 */
	void setTemplateMultiplicity(String value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateId <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Template Id</em>' attribute.
	 * @see #getTemplateId()
	 * @generated
	 */
	void setTemplateId(String value);

} // CDATemplate
