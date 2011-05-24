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
 * A representation of the model object '<em><b>Association End With Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: an AssociationEnd that points to a Class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClass#getParticipantClass <em>Participant Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndWithClass()
 * @model extendedMetaData="name='AssociationEndWithClass' kind='elementOnly'"
 * @generated
 */
public interface AssociationEndWithClass extends AssociationEndBase {
	/**
	 * Returns the value of the '<em><b>Participant Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class to which the association end is attached
	 * UML: The name of the participant class for the association end (used for recursion)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Class</em>' containment reference.
	 * @see #setParticipantClass(ClassOrReference)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndWithClass_ParticipantClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='participantClass' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassOrReference getParticipantClass();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClass#getParticipantClass <em>Participant Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Class</em>' containment reference.
	 * @see #getParticipantClass()
	 * @generated
	 */
	void setParticipantClass(ClassOrReference value);

} // AssociationEndWithClass
