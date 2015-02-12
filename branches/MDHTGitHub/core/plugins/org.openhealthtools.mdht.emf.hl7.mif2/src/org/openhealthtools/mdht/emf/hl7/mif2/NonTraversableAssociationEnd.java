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
 * A representation of the model object '<em><b>Non Traversable Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Corresponds to an AssociationEnd where 'isTraversable' is false
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.NonTraversableAssociationEnd#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.NonTraversableAssociationEnd#getParticipantClassName <em>Participant Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getNonTraversableAssociationEnd()
 * @model extendedMetaData="name='NonTraversableAssociationEnd' kind='elementOnly'"
 * @generated
 */
public interface NonTraversableAssociationEnd extends Relationship {
	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the corresponding association in a model from which the current model has been derived.
	 * UML: derivationSupplier dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getNonTraversableAssociationEnd_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssociationEndDerivation> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Participant Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the class to which the association end is attached
	 * UML: The name of the participant class for the association end
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Class Name</em>' attribute.
	 * @see #setParticipantClassName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getNonTraversableAssociationEnd_ParticipantClassName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.AllClassName" required="true"
	 *        extendedMetaData="kind='attribute' name='participantClassName'"
	 * @generated
	 */
	String getParticipantClassName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.NonTraversableAssociationEnd#getParticipantClassName <em>Participant Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Class Name</em>' attribute.
	 * @see #getParticipantClassName()
	 * @generated
	 */
	void setParticipantClassName(String value);

} // NonTraversableAssociationEnd
