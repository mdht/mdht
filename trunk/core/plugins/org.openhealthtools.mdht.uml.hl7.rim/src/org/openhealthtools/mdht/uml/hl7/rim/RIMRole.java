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
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getScoper <em>Scoper</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getParticipations <em>Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getOutboundLinks <em>Outbound Link</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getInboundLinks <em>Inbound Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMRole()
 * @model abstract="true"
 * @generated
 */
public interface RIMRole extends RIMInfrastructureRoot {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(RIMEntity)
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMRole_Player()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	RIMEntity getPlayer();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(RIMEntity value);

	/**
	 * Returns the value of the '<em><b>Scoper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scoper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoper</em>' reference.
	 * @see #setScoper(RIMEntity)
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMRole_Scoper()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	RIMEntity getScoper();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getScoper <em>Scoper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoper</em>' reference.
	 * @see #getScoper()
	 * @generated
	 */
	void setScoper(RIMEntity value);

	/**
	 * Returns the value of the '<em><b>Participation</b></em>' reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participation</em>' reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMRole_Participation()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<RIMParticipation> getParticipations();

	/**
	 * Returns the value of the '<em><b>Outbound Link</b></em>' reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Link</em>' reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMRole_OutboundLink()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<RIMRoleLink> getOutboundLinks();

	/**
	 * Returns the value of the '<em><b>Inbound Link</b></em>' reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Link</em>' reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMRole_InboundLink()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<RIMRoleLink> getInboundLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Enumerator getClassCode();

} // RIMRole
