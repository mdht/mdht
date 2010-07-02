/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.rim;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMEntity#getPlayedRoles <em>Played Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMEntity#getScopedRoles <em>Scoped Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMEntity()
 * @model abstract="true"
 * @generated
 */
public interface RIMEntity extends RIMInfrastructureRoot {
	/**
	 * Returns the value of the '<em><b>Played Role</b></em>' reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Played Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Played Role</em>' reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMEntity_PlayedRole()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<RIMRole> getPlayedRoles();

	/**
	 * Returns the value of the '<em><b>Scoped Role</b></em>' reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scoped Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped Role</em>' reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMEntity_ScopedRole()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<RIMRole> getScopedRoles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Enumerator getClassCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Enumerator getDeterminerCode();

} // RIMEntity
