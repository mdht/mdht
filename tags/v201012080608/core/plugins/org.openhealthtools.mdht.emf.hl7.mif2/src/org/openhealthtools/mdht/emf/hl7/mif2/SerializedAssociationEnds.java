/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serialized Association Ends</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Handles associations that can be traversable or not.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnds#getTraversableConnection <em>Traversable Connection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnds#getNonTraversableConnection <em>Non Traversable Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedAssociationEnds()
 * @model extendedMetaData="name='SerializedAssociationEnds' kind='elementOnly'"
 * @generated
 */
public interface SerializedAssociationEnds extends EObject {
	/**
	 * Returns the value of the '<em><b>Traversable Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A connection that can be traversed.
	 * UML: An AssociationEnd that is traversable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traversable Connection</em>' containment reference.
	 * @see #setTraversableConnection(AssociationEndWithClassRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedAssociationEnds_TraversableConnection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='traversableConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationEndWithClassRef getTraversableConnection();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnds#getTraversableConnection <em>Traversable Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traversable Connection</em>' containment reference.
	 * @see #getTraversableConnection()
	 * @generated
	 */
	void setTraversableConnection(AssociationEndWithClassRef value);

	/**
	 * Returns the value of the '<em><b>Non Traversable Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A connection that cannot be traversed
	 * UML: An AssociationEnd that is not traversable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Traversable Connection</em>' containment reference.
	 * @see #setNonTraversableConnection(NonTraversableAssociationEnd)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedAssociationEnds_NonTraversableConnection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nonTraversableConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	NonTraversableAssociationEnd getNonTraversableConnection();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnds#getNonTraversableConnection <em>Non Traversable Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Traversable Connection</em>' containment reference.
	 * @see #getNonTraversableConnection()
	 * @generated
	 */
	void setNonTraversableConnection(NonTraversableAssociationEnd value);

} // SerializedAssociationEnds
