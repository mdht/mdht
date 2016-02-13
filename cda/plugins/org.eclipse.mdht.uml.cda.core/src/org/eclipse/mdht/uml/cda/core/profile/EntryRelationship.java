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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.EntryRelationship#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getEntryRelationship()
 * @model
 * @generated
 */
public interface EntryRelationship extends AssociationValidation {
	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.cda.core.profile.EntryRelationshipKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.cda.core.profile.EntryRelationshipKind
	 * @see #setTypeCode(EntryRelationshipKind)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getEntryRelationship_TypeCode()
	 * @model ordered="false"
	 * @generated
	 */
	EntryRelationshipKind getTypeCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.EntryRelationship#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Type Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.cda.core.profile.EntryRelationshipKind
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(EntryRelationshipKind value);

} // EntryRelationship
