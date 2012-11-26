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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Transition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getEndStateName <em>End State Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getStartStateName <em>Start State Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransition()
 * @model extendedMetaData="name='Transition' kind='elementOnly'"
 * @generated
 */
public interface Transition extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Business Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BusinessName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business names associated with the element. CURRENT- 0..1
	 * UML: Tag value inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransition_BusinessName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusinessName> getBusinessName();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the containing element.
	 * UML: A collector for the comments and constraints associated with a transition.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(TransitionAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransition_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	TransitionAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(TransitionAnnotations value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the corresponding state transition in a model from which the current model has been derived.
	 * UML: A derivationSupplier dependency associated with the transition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransition_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransitionDerivation> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>End State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the target state which is transitioned to.  (It is possible for the start and end state to bethe same.
	 * UML: Name of the target StateVertex
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End State Name</em>' attribute.
	 * @see #setEndStateName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransition_EndStateName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='endStateName'"
	 * @generated
	 */
	String getEndStateName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getEndStateName <em>End State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End State Name</em>' attribute.
	 * @see #getEndStateName()
	 * @generated
	 */
	void setEndStateName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal name for the transition.
	 * UML: inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransition_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name used in determining the sort order of the model element within its siblings.
	 * Impl: This will usually be a sequential number, but could be something else.
	 * UML: tag value within ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #setSortKey(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransition_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

	/**
	 * Returns the value of the '<em><b>Start State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the original state which is transitioned from.
	 * UML: Name of the source StateVertex
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start State Name</em>' attribute.
	 * @see #setStartStateName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTransition_StartStateName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='startStateName'"
	 * @generated
	 */
	String getStartStateName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition#getStartStateName <em>Start State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start State Name</em>' attribute.
	 * @see #getStartStateName()
	 * @generated
	 */
	void setStartStateName(String value);

} // Transition
