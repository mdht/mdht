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
 * A representation of the model object '<em><b>Include Related Codes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines related codes to be included in a valueset
 * UML: Part of complex tag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.IncludeRelatedCodes#getRelationshipName <em>Relationship Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.IncludeRelatedCodes#getRelationshipTraversal <em>Relationship Traversal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getIncludeRelatedCodes()
 * @model extendedMetaData="name='IncludeRelatedCodes' kind='empty'"
 * @generated
 */
public interface IncludeRelatedCodes extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of relationship to trace when including codes
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Name</em>' attribute.
	 * @see #setRelationshipName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getIncludeRelatedCodes_RelationshipName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalProperName" required="true"
	 *        extendedMetaData="kind='attribute' name='relationshipName'"
	 * @generated
	 */
	String getRelationshipName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.IncludeRelatedCodes#getRelationshipName <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Name</em>' attribute.
	 * @see #getRelationshipName()
	 * @generated
	 */
	void setRelationshipName(String value);

	/**
	 * Returns the value of the '<em><b>Relationship Traversal</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.RelationshipTraversalKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies what set of codes to include when traversing the relationship
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Traversal</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.RelationshipTraversalKind
	 * @see #isSetRelationshipTraversal()
	 * @see #unsetRelationshipTraversal()
	 * @see #setRelationshipTraversal(RelationshipTraversalKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getIncludeRelatedCodes_RelationshipTraversal()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='relationshipTraversal'"
	 * @generated
	 */
	RelationshipTraversalKind getRelationshipTraversal();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.IncludeRelatedCodes#getRelationshipTraversal <em>Relationship Traversal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Traversal</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.RelationshipTraversalKind
	 * @see #isSetRelationshipTraversal()
	 * @see #unsetRelationshipTraversal()
	 * @see #getRelationshipTraversal()
	 * @generated
	 */
	void setRelationshipTraversal(RelationshipTraversalKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.IncludeRelatedCodes#getRelationshipTraversal <em>Relationship Traversal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationshipTraversal()
	 * @see #getRelationshipTraversal()
	 * @see #setRelationshipTraversal(RelationshipTraversalKind)
	 * @generated
	 */
	void unsetRelationshipTraversal();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.IncludeRelatedCodes#getRelationshipTraversal <em>Relationship Traversal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship Traversal</em>' attribute is set.
	 * @see #unsetRelationshipTraversal()
	 * @see #getRelationshipTraversal()
	 * @see #setRelationshipTraversal(RelationshipTraversalKind)
	 * @generated
	 */
	boolean isSetRelationshipTraversal();

} // IncludeRelatedCodes
