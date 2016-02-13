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
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.ValidationSupport#getSeverity <em>Severity</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.ValidationSupport#getMessage <em>Message</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.ValidationSupport#getBase_Association <em>Base Association</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.ValidationSupport#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.ValidationSupport#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidationSupport()
 * @model
 * @generated
 */
public interface ValidationSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Association</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Association</em>' reference.
	 * @see #setBase_Association(Association)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidationSupport_Base_Association()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Association getBase_Association();

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidationSupport_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidationSupport_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidationSupport_Message()
	 * @model ordered="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.cda.core.profile.SeverityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.mdht.uml.cda.core.profile.SeverityKind
	 * @see #setSeverity(SeverityKind)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidationSupport_Severity()
	 * @model ordered="false"
	 * @generated
	 */
	SeverityKind getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.ValidationSupport#getBase_Association <em>Base Association</em>}'
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Association</em>' reference.
	 * @see #getBase_Association()
	 * @generated
	 */
	void setBase_Association(Association value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.ValidationSupport#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.ValidationSupport#getBase_Property <em>Base Property</em>}'
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.ValidationSupport#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.ValidationSupport#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.mdht.uml.cda.core.profile.SeverityKind
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityKind value);

} // ValidationSupport
