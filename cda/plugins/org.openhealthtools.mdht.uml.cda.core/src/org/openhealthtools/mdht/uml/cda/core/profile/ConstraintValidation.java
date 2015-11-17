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

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation#getBase_Constraint <em>Base Constraint</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation#isEnabledDitaForConstraints <em>Enabled Dita For Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getConstraintValidation()
 * @model
 * @generated
 */
public interface ConstraintValidation extends Validation {
	/**
	 * Returns the value of the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Constraint</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Base Constraint</em>' reference.
	 * @see #setBase_Constraint(Constraint)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getConstraintValidation_Base_Constraint()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Constraint getBase_Constraint();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation#getBase_Constraint <em>Base Constraint</em>}'
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Base Constraint</em>' reference.
	 * @see #getBase_Constraint()
	 * @generated
	 */
	void setBase_Constraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Enabled Dita For Constraints</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Dita For Constraints</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enabled Dita For Constraints</em>' attribute.
	 * @see #setEnabledDitaForConstraints(boolean)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getConstraintValidation_EnabledDitaForConstraints()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isEnabledDitaForConstraints();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation#isEnabledDitaForConstraints
	 * <em>Enabled Dita For Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Enabled Dita For Constraints</em>' attribute.
	 * @see #isEnabledDitaForConstraints()
	 * @generated
	 */
	void setEnabledDitaForConstraints(boolean value);

} // ConstraintValidation
