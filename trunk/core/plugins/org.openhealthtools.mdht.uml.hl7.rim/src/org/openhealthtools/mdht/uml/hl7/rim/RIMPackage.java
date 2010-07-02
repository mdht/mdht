/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.rim;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMFactory
 * @model kind="package"
 * @generated
 */
public interface RIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/hl7/rim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RIMPackage eINSTANCE = org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMInfrastructureRootImpl <em>Infrastructure Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMInfrastructureRootImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMInfrastructureRoot()
	 * @generated
	 */
	int RIM_INFRASTRUCTURE_ROOT = 1;

	/**
	 * The number of structural features of the '<em>Infrastructure Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActImpl <em>Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMAct()
	 * @generated
	 */
	int RIM_ACT = 0;

	/**
	 * The feature id for the '<em><b>Participation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ACT__PARTICIPATION = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outbound Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ACT__OUTBOUND_RELATIONSHIP = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inbound Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ACT__INBOUND_RELATIONSHIP = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ACT_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMParticipationImpl <em>Participation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMParticipationImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMParticipation()
	 * @generated
	 */
	int RIM_PARTICIPATION = 2;

	/**
	 * The feature id for the '<em><b>Act</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_PARTICIPATION__ACT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_PARTICIPATION__ROLE = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Participation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_PARTICIPATION_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMRole()
	 * @generated
	 */
	int RIM_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ROLE__PLAYER = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scoper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ROLE__SCOPER = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Participation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ROLE__PARTICIPATION = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ROLE__OUTBOUND_LINK = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ROLE__INBOUND_LINK = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ROLE_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMEntityImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMEntity()
	 * @generated
	 */
	int RIM_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Played Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ENTITY__PLAYED_ROLE = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scoped Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ENTITY__SCOPED_ROLE = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ENTITY_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleLinkImpl <em>Role Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleLinkImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMRoleLink()
	 * @generated
	 */
	int RIM_ROLE_LINK = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ROLE_LINK__TARGET = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ROLE_LINK__SOURCE = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ROLE_LINK_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActRelationshipImpl <em>Act Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActRelationshipImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMActRelationship()
	 * @generated
	 */
	int RIM_ACT_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ACT_RELATIONSHIP__TARGET = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ACT_RELATIONSHIP__SOURCE = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Act Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ACT_RELATIONSHIP_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Act</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMAct
	 * @generated
	 */
	EClass getRIMAct();

	/**
	 * Returns the meta object for the reference list '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMAct#getParticipations <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participation</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMAct#getParticipations()
	 * @see #getRIMAct()
	 * @generated
	 */
	EReference getRIMAct_Participation();

	/**
	 * Returns the meta object for the reference list '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMAct#getOutboundRelationships <em>Outbound Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMAct#getOutboundRelationships()
	 * @see #getRIMAct()
	 * @generated
	 */
	EReference getRIMAct_OutboundRelationship();

	/**
	 * Returns the meta object for the reference list '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMAct#getInboundRelationships <em>Inbound Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMAct#getInboundRelationships()
	 * @see #getRIMAct()
	 * @generated
	 */
	EReference getRIMAct_InboundRelationship();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMInfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Root</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMInfrastructureRoot
	 * @generated
	 */
	EClass getRIMInfrastructureRoot();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participation</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation
	 * @generated
	 */
	EClass getRIMParticipation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Act</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation#getAct()
	 * @see #getRIMParticipation()
	 * @generated
	 */
	EReference getRIMParticipation_Act();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation#getRole()
	 * @see #getRIMParticipation()
	 * @generated
	 */
	EReference getRIMParticipation_Role();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMRole
	 * @generated
	 */
	EClass getRIMRole();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getPlayer()
	 * @see #getRIMRole()
	 * @generated
	 */
	EReference getRIMRole_Player();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getScoper <em>Scoper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scoper</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getScoper()
	 * @see #getRIMRole()
	 * @generated
	 */
	EReference getRIMRole_Scoper();

	/**
	 * Returns the meta object for the reference list '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getParticipations <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participation</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getParticipations()
	 * @see #getRIMRole()
	 * @generated
	 */
	EReference getRIMRole_Participation();

	/**
	 * Returns the meta object for the reference list '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getOutboundLinks <em>Outbound Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound Link</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getOutboundLinks()
	 * @see #getRIMRole()
	 * @generated
	 */
	EReference getRIMRole_OutboundLink();

	/**
	 * Returns the meta object for the reference list '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getInboundLinks <em>Inbound Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound Link</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMRole#getInboundLinks()
	 * @see #getRIMRole()
	 * @generated
	 */
	EReference getRIMRole_InboundLink();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMEntity
	 * @generated
	 */
	EClass getRIMEntity();

	/**
	 * Returns the meta object for the reference list '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMEntity#getPlayedRoles <em>Played Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Played Role</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMEntity#getPlayedRoles()
	 * @see #getRIMEntity()
	 * @generated
	 */
	EReference getRIMEntity_PlayedRole();

	/**
	 * Returns the meta object for the reference list '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMEntity#getScopedRoles <em>Scoped Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scoped Role</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMEntity#getScopedRoles()
	 * @see #getRIMEntity()
	 * @generated
	 */
	EReference getRIMEntity_ScopedRole();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Link</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink
	 * @generated
	 */
	EClass getRIMRoleLink();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink#getTarget()
	 * @see #getRIMRoleLink()
	 * @generated
	 */
	EReference getRIMRoleLink_Target();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink#getSource()
	 * @see #getRIMRoleLink()
	 * @generated
	 */
	EReference getRIMRoleLink_Source();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMActRelationship <em>Act Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Act Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMActRelationship
	 * @generated
	 */
	EClass getRIMActRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMActRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMActRelationship#getTarget()
	 * @see #getRIMActRelationship()
	 * @generated
	 */
	EReference getRIMActRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMActRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMActRelationship#getSource()
	 * @see #getRIMActRelationship()
	 * @generated
	 */
	EReference getRIMActRelationship_Source();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RIMFactory getRIMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActImpl <em>Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMAct()
		 * @generated
		 */
		EClass RIM_ACT = eINSTANCE.getRIMAct();

		/**
		 * The meta object literal for the '<em><b>Participation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ACT__PARTICIPATION = eINSTANCE.getRIMAct_Participation();

		/**
		 * The meta object literal for the '<em><b>Outbound Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ACT__OUTBOUND_RELATIONSHIP = eINSTANCE.getRIMAct_OutboundRelationship();

		/**
		 * The meta object literal for the '<em><b>Inbound Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ACT__INBOUND_RELATIONSHIP = eINSTANCE.getRIMAct_InboundRelationship();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMInfrastructureRootImpl <em>Infrastructure Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMInfrastructureRootImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMInfrastructureRoot()
		 * @generated
		 */
		EClass RIM_INFRASTRUCTURE_ROOT = eINSTANCE.getRIMInfrastructureRoot();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMParticipationImpl <em>Participation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMParticipationImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMParticipation()
		 * @generated
		 */
		EClass RIM_PARTICIPATION = eINSTANCE.getRIMParticipation();

		/**
		 * The meta object literal for the '<em><b>Act</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_PARTICIPATION__ACT = eINSTANCE.getRIMParticipation_Act();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_PARTICIPATION__ROLE = eINSTANCE.getRIMParticipation_Role();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMRole()
		 * @generated
		 */
		EClass RIM_ROLE = eINSTANCE.getRIMRole();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ROLE__PLAYER = eINSTANCE.getRIMRole_Player();

		/**
		 * The meta object literal for the '<em><b>Scoper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ROLE__SCOPER = eINSTANCE.getRIMRole_Scoper();

		/**
		 * The meta object literal for the '<em><b>Participation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ROLE__PARTICIPATION = eINSTANCE.getRIMRole_Participation();

		/**
		 * The meta object literal for the '<em><b>Outbound Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ROLE__OUTBOUND_LINK = eINSTANCE.getRIMRole_OutboundLink();

		/**
		 * The meta object literal for the '<em><b>Inbound Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ROLE__INBOUND_LINK = eINSTANCE.getRIMRole_InboundLink();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMEntityImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMEntity()
		 * @generated
		 */
		EClass RIM_ENTITY = eINSTANCE.getRIMEntity();

		/**
		 * The meta object literal for the '<em><b>Played Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ENTITY__PLAYED_ROLE = eINSTANCE.getRIMEntity_PlayedRole();

		/**
		 * The meta object literal for the '<em><b>Scoped Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ENTITY__SCOPED_ROLE = eINSTANCE.getRIMEntity_ScopedRole();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleLinkImpl <em>Role Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleLinkImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMRoleLink()
		 * @generated
		 */
		EClass RIM_ROLE_LINK = eINSTANCE.getRIMRoleLink();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ROLE_LINK__TARGET = eINSTANCE.getRIMRoleLink_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ROLE_LINK__SOURCE = eINSTANCE.getRIMRoleLink_Source();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActRelationshipImpl <em>Act Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActRelationshipImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMActRelationship()
		 * @generated
		 */
		EClass RIM_ACT_RELATIONSHIP = eINSTANCE.getRIMActRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ACT_RELATIONSHIP__TARGET = eINSTANCE.getRIMActRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIM_ACT_RELATIONSHIP__SOURCE = eINSTANCE.getRIMActRelationship_Source();

	}

} //RIMPackage
