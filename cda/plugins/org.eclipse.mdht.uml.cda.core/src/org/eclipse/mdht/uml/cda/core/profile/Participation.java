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
import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.Participation#getBase_Association <em>Base Association</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.Participation#getAssociationType <em>Association Type</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.Participation#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getParticipation()
 * @model
 * @generated
 */
public interface Participation extends EObject {
	/**
	 * Returns the value of the '<em><b>Association Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Type</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Association Type</em>' reference.
	 * @see #setAssociationType(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getParticipation_AssociationType()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getAssociationType();

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
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getParticipation_Base_Association()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Association getBase_Association();

	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Type Code</em>' reference.
	 * @see #setTypeCode(EnumerationLiteral)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getParticipation_TypeCode()
	 * @model ordered="false"
	 * @generated
	 */
	EnumerationLiteral getTypeCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.Participation#getAssociationType <em>Association Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Association Type</em>' reference.
	 * @see #getAssociationType()
	 * @generated
	 */
	void setAssociationType(org.eclipse.uml2.uml.Class value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.Participation#getBase_Association <em>Base Association</em>}' reference.
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
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.Participation#getTypeCode <em>Type Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Type Code</em>' reference.
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(EnumerationLiteral value);

} // Participation
