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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.Validation#getMessage <em>Message</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.Validation#getSeverity <em>Severity</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.Validation#getRuleId <em>Rule Id</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.Validation#isMandatory <em>Mandatory</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.Validation#getKind <em>Kind</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.Validation#isStrict <em>Strict</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.Validation#isNegationIndicator <em>Negation Indicator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidation()
 * @model abstract="true"
 * @generated
 */
public interface Validation extends EObject {
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
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidation_Message()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Id</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Rule Id</em>' attribute list.
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidation_RuleId()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getRuleId();

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
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidation_Severity()
	 * @model ordered="false"
	 * @generated
	 */
	SeverityKind getSeverity();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidation_Mandatory()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.Validation#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"OPEN"</code>.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.cda.core.profile.ValidationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.mdht.uml.cda.core.profile.ValidationKind
	 * @see #setKind(ValidationKind)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidation_Kind()
	 * @model default="OPEN" ordered="false"
	 * @generated
	 */
	ValidationKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.Validation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.mdht.uml.cda.core.profile.ValidationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ValidationKind value);

	/**
	 * Returns the value of the '<em><b>Strict</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Strict</em>' attribute.
	 * @see #setStrict(boolean)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidation_Strict()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isStrict();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.Validation#isStrict <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Strict</em>' attribute.
	 * @see #isStrict()
	 * @generated
	 */
	void setStrict(boolean value);

	/**
	 * Returns the value of the '<em><b>Negation Indicator</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negation Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Negation Indicator</em>' attribute.
	 * @see #setNegationIndicator(boolean)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getValidation_NegationIndicator()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isNegationIndicator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.Validation#isNegationIndicator <em>Negation Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Negation Indicator</em>' attribute.
	 * @see #isNegationIndicator()
	 * @generated
	 */
	void setNegationIndicator(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.Validation#getMessage <em>Message</em>}' attribute.
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
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.Validation#getSeverity <em>Severity</em>}' attribute.
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

} // Validation
