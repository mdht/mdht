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
 * A representation of the model object '<em><b>Association End With Class Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: an AssociationEnd that points to a Class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClassRef#getParticipantClassName <em>Participant Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndWithClassRef()
 * @model extendedMetaData="name='AssociationEndWithClassRef' kind='elementOnly'"
 * @generated
 */
public interface AssociationEndWithClassRef extends AssociationEndBase {
	/**
	 * Returns the value of the '<em><b>Participant Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the class to which the association end is attached
	 * UML: The name of the participant class for the association end (used for recursion)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Class Name</em>' attribute.
	 * @see #setParticipantClassName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndWithClassRef_ParticipantClassName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.AllClassName" required="true"
	 *        extendedMetaData="kind='attribute' name='participantClassName'"
	 * @generated
	 */
	String getParticipantClassName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClassRef#getParticipantClassName <em>Participant Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Class Name</em>' attribute.
	 * @see #getParticipantClassName()
	 * @generated
	 */
	void setParticipantClassName(String value);

} // AssociationEndWithClassRef
