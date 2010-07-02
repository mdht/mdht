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
 * A representation of the model object '<em><b>Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMAct#getParticipations <em>Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMAct#getOutboundRelationships <em>Outbound Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.RIMAct#getInboundRelationships <em>Inbound Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMAct()
 * @model abstract="true"
 * @generated
 */
public interface RIMAct extends RIMInfrastructureRoot {
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
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMAct_Participation()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<RIMParticipation> getParticipations();

	/**
	 * Returns the value of the '<em><b>Outbound Relationship</b></em>' reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.rim.RIMActRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Relationship</em>' reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMAct_OutboundRelationship()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<RIMActRelationship> getOutboundRelationships();

	/**
	 * Returns the value of the '<em><b>Inbound Relationship</b></em>' reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.rim.RIMActRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Relationship</em>' reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#getRIMAct_InboundRelationship()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<RIMActRelationship> getInboundRelationships();

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
	Enumerator getMoodCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	Boolean getNegationInd();

} // RIMAct
