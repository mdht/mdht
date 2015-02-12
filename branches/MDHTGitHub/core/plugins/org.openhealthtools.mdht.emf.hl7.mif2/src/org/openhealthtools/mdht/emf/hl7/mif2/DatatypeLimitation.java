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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Limitation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a datatype which is not fully supported, along with the datatype flavor that will be implemented in place of the full datatype.
 * UML: Complex tag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeLimitation#getDefinedDatatype <em>Defined Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeLimitation#getSubstituteDatatype <em>Substitute Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeLimitation()
 * @model extendedMetaData="name='DatatypeLimitation' kind='elementOnly'"
 * @generated
 */
public interface DatatypeLimitation extends EObject {
	/**
	 * Returns the value of the '<em><b>Defined Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the datatype that is not fully supported
	 * UML: Complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defined Datatype</em>' containment reference.
	 * @see #setDefinedDatatype(DatatypeRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeLimitation_DefinedDatatype()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definedDatatype' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeRef getDefinedDatatype();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeLimitation#getDefinedDatatype <em>Defined Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined Datatype</em>' containment reference.
	 * @see #getDefinedDatatype()
	 * @generated
	 */
	void setDefinedDatatype(DatatypeRef value);

	/**
	 * Returns the value of the '<em><b>Substitute Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the datatype or datatype flavor that should be interpretted in place of the non-supported datatype
	 * UML: Complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitute Datatype</em>' containment reference.
	 * @see #setSubstituteDatatype(DatatypeRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeLimitation_SubstituteDatatype()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='substituteDatatype' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeRef getSubstituteDatatype();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeLimitation#getSubstituteDatatype <em>Substitute Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitute Datatype</em>' containment reference.
	 * @see #getSubstituteDatatype()
	 * @generated
	 */
	void setSubstituteDatatype(DatatypeRef value);

} // DatatypeLimitation
