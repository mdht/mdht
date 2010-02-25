/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Entry#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends AssociationValidation {
	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryKind
	 * @see #setTypeCode(EntryKind)
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getEntry_TypeCode()
	 * @model ordered="false"
	 * @generated
	 */
	EntryKind getTypeCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Entry#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryKind
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(EntryKind value);

} // Entry
