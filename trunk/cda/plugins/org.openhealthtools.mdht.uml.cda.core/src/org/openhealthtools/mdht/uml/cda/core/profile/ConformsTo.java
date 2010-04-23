/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.profile;

import org.eclipse.uml2.uml.Generalization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conforms To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo#getBase_Generalization <em>Base Generalization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo#isRequiresParentId <em>Requires Parent Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getConformsTo()
 * @model
 * @generated
 */
public interface ConformsTo extends Validation {
	/**
	 * Returns the value of the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Generalization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Generalization</em>' reference.
	 * @see #setBase_Generalization(Generalization)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getConformsTo_Base_Generalization()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Generalization getBase_Generalization();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo#getBase_Generalization <em>Base Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Generalization</em>' reference.
	 * @see #getBase_Generalization()
	 * @generated
	 */
	void setBase_Generalization(Generalization value);

	/**
	 * Returns the value of the '<em><b>Requires Parent Id</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Parent Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Parent Id</em>' attribute.
	 * @see #setRequiresParentId(boolean)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getConformsTo_RequiresParentId()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isRequiresParentId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo#isRequiresParentId <em>Requires Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Parent Id</em>' attribute.
	 * @see #isRequiresParentId()
	 * @generated
	 */
	void setRequiresParentId(boolean value);

} // ConformsTo
