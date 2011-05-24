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
 * A representation of the model object '<em><b>Serialized Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: An Association that points to an association end attached to a class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnd#getTargetConnection <em>Target Connection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnd#getSourceConnection <em>Source Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedAssociationEnd()
 * @model extendedMetaData="name='SerializedAssociationEnd' kind='elementOnly'"
 * @generated
 */
public interface SerializedAssociationEnd extends AssociationBase {
	/**
	 * Returns the value of the '<em><b>Target Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end at the opposite end of the association
	 * UML: The connection association to the Association
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Connection</em>' containment reference.
	 * @see #setTargetConnection(AssociationEndWithClass)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedAssociationEnd_TargetConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationEndWithClass getTargetConnection();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnd#getTargetConnection <em>Target Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Connection</em>' containment reference.
	 * @see #getTargetConnection()
	 * @generated
	 */
	void setTargetConnection(AssociationEndWithClass value);

	/**
	 * Returns the value of the '<em><b>Source Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details of the association in the opposite direction.
	 * UML: The associationEnd on the near side of the association.  Only present if the association is traversable in the opposite direction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Connection</em>' containment reference.
	 * @see #setSourceConnection(SerializedAssociationEnds)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedAssociationEnd_SourceConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sourceConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	SerializedAssociationEnds getSourceConnection();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnd#getSourceConnection <em>Source Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Connection</em>' containment reference.
	 * @see #getSourceConnection()
	 * @generated
	 */
	void setSourceConnection(SerializedAssociationEnds value);

} // SerializedAssociationEnd
