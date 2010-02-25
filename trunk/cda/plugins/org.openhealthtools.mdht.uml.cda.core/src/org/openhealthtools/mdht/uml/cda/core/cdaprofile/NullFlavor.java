/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Flavor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavor#getNullFlavor <em>Null Flavor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getNullFlavor()
 * @model
 * @generated
 */
public interface NullFlavor extends PropertyValidation {
	/**
	 * Returns the value of the '<em><b>Null Flavor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavorKind
	 * @see #setNullFlavor(NullFlavorKind)
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getNullFlavor_NullFlavor()
	 * @model ordered="false"
	 * @generated
	 */
	NullFlavorKind getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavor#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavorKind
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavorKind value);

} // NullFlavor
