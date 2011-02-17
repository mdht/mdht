/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>II</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getRoot <em>Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getAssigningAuthorityName <em>Assigning Authority Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getDisplayable <em>Displayable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getII()
 * @model
 * @generated
 */
public interface II extends ANY {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getII_Root()
	 * @model dataType="org.openhealthtools.mdht.uml.hl7.datatypes.uid" ordered="false"
	 * @generated
	 */
	String getRoot();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getII_Extension()
	 * @model ordered="false"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Assigning Authority Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigning Authority Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigning Authority Name</em>' attribute.
	 * @see #setAssigningAuthorityName(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getII_AssigningAuthorityName()
	 * @model ordered="false"
	 * @generated
	 */
	String getAssigningAuthorityName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getAssigningAuthorityName <em>Assigning Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigning Authority Name</em>' attribute.
	 * @see #getAssigningAuthorityName()
	 * @generated
	 */
	void setAssigningAuthorityName(String value);

	/**
	 * Returns the value of the '<em><b>Displayable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayable</em>' attribute.
	 * @see #setDisplayable(Boolean)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getII_Displayable()
	 * @model ordered="false"
	 * @generated
	 */
	Boolean getDisplayable();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getDisplayable <em>Displayable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displayable</em>' attribute.
	 * @see #getDisplayable()
	 * @generated
	 */
	void setDisplayable(Boolean value);

} // II
