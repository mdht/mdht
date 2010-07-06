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
 *
 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getParticipation()
 * @model abstract="true"
 * @generated
 */
public interface Participation extends InfrastructureRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Enumerator getTypeCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Act getAct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Role getRole();

} // Participation
