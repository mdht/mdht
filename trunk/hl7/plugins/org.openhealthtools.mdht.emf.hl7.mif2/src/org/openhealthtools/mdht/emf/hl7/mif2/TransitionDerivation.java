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
 * A representation of the model object '<em><b>Transition Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A Derivation stereotype to a Transition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionDerivation#getStartStateName <em>Start State Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionDerivation#getStateTransitionName <em>State Transition Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransitionDerivation()
 * @model extendedMetaData="name='TransitionDerivation' kind='empty'"
 * @generated
 */
public interface TransitionDerivation extends ClassDerivation {
	/**
	 * Returns the value of the '<em><b>Start State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the corresponding start state in the 'parent' model.
	 * UML: Name of the supplier transition's source StateVertex
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start State Name</em>' attribute.
	 * @see #setStartStateName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransitionDerivation_StartStateName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='startStateName'"
	 * @generated
	 */
	String getStartStateName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionDerivation#getStartStateName <em>Start State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start State Name</em>' attribute.
	 * @see #getStartStateName()
	 * @generated
	 */
	void setStartStateName(String value);

	/**
	 * Returns the value of the '<em><b>State Transition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the corresponding state transition in the 'parent' model.
	 * UML: Name of the supplier transition's target StateVertex
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Transition Name</em>' attribute.
	 * @see #setStateTransitionName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransitionDerivation_StateTransitionName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='stateTransitionName'"
	 * @generated
	 */
	String getStateTransitionName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionDerivation#getStateTransitionName <em>State Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Transition Name</em>' attribute.
	 * @see #getStateTransitionName()
	 * @generated
	 */
	void setStateTransitionName(String value);

} // TransitionDerivation
