/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.profile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.Participation#getBase_Association <em>Base Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.Participation#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getParticipation()
 * @model
 * @generated
 */
public interface Participation extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Association</em>' reference.
	 * @see #setBase_Association(Association)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getParticipation_Base_Association()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Association getBase_Association();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.Participation#getBase_Association <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Association</em>' reference.
	 * @see #getBase_Association()
	 * @generated
	 */
	void setBase_Association(Association value);

	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' reference.
	 * @see #setTypeCode(EnumerationLiteral)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getParticipation_TypeCode()
	 * @model ordered="false"
	 * @generated
	 */
	EnumerationLiteral getTypeCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.Participation#getTypeCode <em>Type Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' reference.
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(EnumerationLiteral value);

} // Participation
