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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BIN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.BIN#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.BIN#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getBIN()
 * @model abstract="true"
 *        extendedMetaData="kind='mixed'"
 * @generated
 */
public interface BIN extends ANY {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getBIN_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="name='' kind='elementWildcard'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding
	 * @see #setRepresentation(BinaryDataEncoding)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getBIN_Representation()
	 * @model ordered="false"
	 * @generated
	 */
	BinaryDataEncoding getRepresentation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.BIN#getRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(BinaryDataEncoding value);

} // BIN
