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

import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.AssociationValidation#getBase_Association <em>Base Association</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getAssociationValidation()
 * @model
 * @generated
 */
public interface AssociationValidation extends Validation {
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
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getAssociationValidation_Base_Association()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Association getBase_Association();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.AssociationValidation#getBase_Association <em>Base Association</em>}'
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

} // AssociationValidation
