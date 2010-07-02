/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.rim;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation#getAct <em>Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMParticipation()
 * @model abstract="true"
 * @generated
 */
public interface RIMParticipation extends RIMInfrastructureRoot {
	/**
	 * Returns the value of the '<em><b>Act</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act</em>' reference.
	 * @see #setAct(RIMAct)
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMParticipation_Act()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	RIMAct getAct();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation#getAct <em>Act</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act</em>' reference.
	 * @see #getAct()
	 * @generated
	 */
	void setAct(RIMAct value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(RIMRole)
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMParticipation_Role()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	RIMRole getRole();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RIMRole value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Enumerator getTypeCode();

} // RIMParticipation
