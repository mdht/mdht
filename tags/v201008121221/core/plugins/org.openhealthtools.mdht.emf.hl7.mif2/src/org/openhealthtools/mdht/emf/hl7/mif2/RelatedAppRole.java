/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related App Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.RelatedAppRole#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRelatedAppRole()
 * @model extendedMetaData="name='RelatedAppRole' kind='empty'"
 * @generated
 */
public interface RelatedAppRole extends PackageRef {
	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleRelationshipKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the kind of relationship between the current application role and the referenced role
	 * UML: Indicates whether the relationship is generalization or specialization
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleRelationshipKind
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #setRelationshipType(ApplicationRoleRelationshipKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRelatedAppRole_RelationshipType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='relationshipType'"
	 * @generated
	 */
	ApplicationRoleRelationshipKind getRelationshipType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RelatedAppRole#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleRelationshipKind
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(ApplicationRoleRelationshipKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RelatedAppRole#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(ApplicationRoleRelationshipKind)
	 * @generated
	 */
	void unsetRelationshipType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RelatedAppRole#getRelationshipType <em>Relationship Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship Type</em>' attribute is set.
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(ApplicationRoleRelationshipKind)
	 * @generated
	 */
	boolean isSetRelationshipType();

} // RelatedAppRole
