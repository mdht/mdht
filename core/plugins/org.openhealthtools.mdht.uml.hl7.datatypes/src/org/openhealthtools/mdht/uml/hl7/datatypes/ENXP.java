/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENXP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ENXP#getPartType <em>Part Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ENXP#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getENXP()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface ENXP extends ST {
	/**
	 * Returns the value of the '<em><b>Part Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Type</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType
	 * @see #setPartType(EntityNamePartType)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getENXP_PartType()
	 * @model transient="true" ordered="false"
	 * @generated
	 */
	EntityNamePartType getPartType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ENXP#getPartType <em>Part Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Type</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType
	 * @see #getPartType()
	 * @generated
	 */
	void setPartType(EntityNamePartType value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier}.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute list.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getENXP_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EntityNamePartQualifier> getQualifier();

} // ENXP
