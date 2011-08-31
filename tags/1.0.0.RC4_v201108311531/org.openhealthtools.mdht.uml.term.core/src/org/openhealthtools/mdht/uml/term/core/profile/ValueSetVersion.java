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
package org.openhealthtools.mdht.uml.term.core.profile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Version</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getVersion <em>Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getFullName <em>Full Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getSource <em>Source</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getUrl <em>Url</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getDefinition <em>Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getEffectiveDate <em>Effective Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getExpirationDate <em>Expiration Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getReleaseDate <em>Release Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getRevisionDate <em>Revision Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getStatus <em>Status</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getStatusDate <em>Status Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getType <em>Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getBinding <em>Binding</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getCodeSystem <em>Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getBase_Enumeration <em>Base Enumeration</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion()
 * @model
 * @generated
 */
public interface ValueSetVersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Enumeration</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Base Enumeration</em>' reference.
	 * @see #setBase_Enumeration(Enumeration)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_Base_Enumeration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Enumeration getBase_Enumeration();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.term.core.profile.BindingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Binding</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.BindingKind
	 * @see #setBinding(BindingKind)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_Binding()
	 * @model ordered="false"
	 * @generated
	 */
	BindingKind getBinding();

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System</em>' reference.
	 * @see #setCodeSystem(CodeSystemVersion)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_CodeSystem()
	 * @model ordered="false"
	 * @generated
	 */
	CodeSystemVersion getCodeSystem();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_Definition()
	 * @model ordered="false"
	 * @generated
	 */
	String getDefinition();

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #setEffectiveDate(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_EffectiveDate()
	 * @model ordered="false"
	 * @generated
	 */
	String getEffectiveDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getEnumerationName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getEnumerationQualifiedName();

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Date</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_ExpirationDate()
	 * @model ordered="false"
	 * @generated
	 */
	String getExpirationDate();

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_FullName()
	 * @model ordered="false"
	 * @generated
	 */
	String getFullName();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_Identifier()
	 * @model ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Date</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_ReleaseDate()
	 * @model ordered="false"
	 * @generated
	 */
	String getReleaseDate();

	/**
	 * Returns the value of the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Date</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Revision Date</em>' attribute.
	 * @see #setRevisionDate(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_RevisionDate()
	 * @model ordered="false"
	 * @generated
	 */
	String getRevisionDate();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_Source()
	 * @model ordered="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.term.core.profile.StatusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.StatusKind
	 * @see #setStatus(StatusKind)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_Status()
	 * @model ordered="false"
	 * @generated
	 */
	StatusKind getStatus();

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Date</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Status Date</em>' attribute.
	 * @see #setStatusDate(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_StatusDate()
	 * @model ordered="false"
	 * @generated
	 */
	String getStatusDate();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.ValueSetType
	 * @see #setType(ValueSetType)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_Type()
	 * @model ordered="false"
	 * @generated
	 */
	ValueSetType getType();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_Url()
	 * @model ordered="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetVersion_Version()
	 * @model ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getBase_Enumeration <em>Base Enumeration</em>}'
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Base Enumeration</em>' reference.
	 * @see #getBase_Enumeration()
	 * @generated
	 */
	void setBase_Enumeration(Enumeration value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getBinding <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Binding</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.BindingKind
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(BindingKind value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getCodeSystem <em>Code System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System</em>' reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(CodeSystemVersion value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getEffectiveDate <em>Effective Date</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Effective Date</em>' attribute.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void setEnumerationName(String name);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getExpirationDate <em>Expiration Date</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(String value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(String value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getRevisionDate <em>Revision Date</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Revision Date</em>' attribute.
	 * @see #getRevisionDate()
	 * @generated
	 */
	void setRevisionDate(String value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.StatusKind
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusKind value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getStatusDate <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Status Date</em>' attribute.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(String value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.ValueSetType
	 * @see #getType()
	 * @generated
	 */
	void setType(ValueSetType value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ValueSetVersion
