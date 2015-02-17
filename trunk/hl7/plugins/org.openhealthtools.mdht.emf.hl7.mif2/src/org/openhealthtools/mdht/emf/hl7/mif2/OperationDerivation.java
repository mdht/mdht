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
 * A representation of the model object '<em><b>Operation Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A derivation dependency on another datatype operation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.OperationDerivation#getType <em>Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.OperationDerivation#getTargetDatatype <em>Target Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getOperationDerivation()
 * @model extendedMetaData="name='OperationDerivation' kind='elementOnly'"
 * @generated
 */
public interface OperationDerivation extends Derivation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For 'conversion' properties, identifies the target datatype for the conversion.
	 * UML: result type of the operation.  Used for referencing non-named 'conversion' operations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(DatatypeRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getOperationDerivation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeRef getType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.OperationDerivation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeRef value);

	/**
	 * Returns the value of the '<em><b>Target Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the datatype from which the property is derived.
	 * UML: client association on the derivedFrom dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Datatype</em>' containment reference.
	 * @see #setTargetDatatype(DatatypeRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getOperationDerivation_TargetDatatype()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetDatatype' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeRef getTargetDatatype();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.OperationDerivation#getTargetDatatype <em>Target Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Datatype</em>' containment reference.
	 * @see #getTargetDatatype()
	 * @generated
	 */
	void setTargetDatatype(DatatypeRef value);

} // OperationDerivation
