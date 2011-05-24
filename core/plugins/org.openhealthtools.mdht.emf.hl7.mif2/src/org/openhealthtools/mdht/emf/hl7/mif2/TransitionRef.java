/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a state transition defined elsewhere.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionRef#getStateTransitionName <em>State Transition Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransitionRef()
 * @model extendedMetaData="name='TransitionRef' kind='empty'"
 * @generated
 */
public interface TransitionRef extends ClassRef {
	/**
	 * Returns the value of the '<em><b>State Transition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the state transition within the 'focal' class that is the basis for the trigger event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Transition Name</em>' attribute.
	 * @see #setStateTransitionName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransitionRef_StateTransitionName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='stateTransitionName'"
	 * @generated
	 */
	String getStateTransitionName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionRef#getStateTransitionName <em>State Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Transition Name</em>' attribute.
	 * @see #getStateTransitionName()
	 * @generated
	 */
	void setStateTransitionName(String value);

} // TransitionRef
