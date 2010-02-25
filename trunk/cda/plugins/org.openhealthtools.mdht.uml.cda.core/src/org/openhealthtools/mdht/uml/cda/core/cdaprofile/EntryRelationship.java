/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationship#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getEntryRelationship()
 * @model
 * @generated
 */
public interface EntryRelationship extends AssociationValidation {
	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationshipKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationshipKind
	 * @see #setTypeCode(EntryRelationshipKind)
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getEntryRelationship_TypeCode()
	 * @model ordered="false"
	 * @generated
	 */
	EntryRelationshipKind getTypeCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationship#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationshipKind
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(EntryRelationshipKind value);

} // EntryRelationship
