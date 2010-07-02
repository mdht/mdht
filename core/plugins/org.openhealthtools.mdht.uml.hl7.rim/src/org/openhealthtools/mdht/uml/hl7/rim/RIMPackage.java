/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.rim;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
	 * The number of structural features of the '<em>Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ACT_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Participation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_PARTICIPATION_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ROLE_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ENTITY_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Role Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ROLE_LINK_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Act Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIM_ACT_RELATIONSHIP_FEATURE_COUNT = RIM_INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;


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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMRole
	 * @generated
	 */
	EClass getRIMRole();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Link</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink
	 * @generated
	 */
	EClass getRIMRoleLink();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMRole()
		 * @generated
		 */
		EClass RIM_ROLE = eINSTANCE.getRIMRole();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleLinkImpl <em>Role Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleLinkImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMRoleLink()
		 * @generated
		 */
		EClass RIM_ROLE_LINK = eINSTANCE.getRIMRoleLink();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActRelationshipImpl <em>Act Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActRelationshipImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRIMActRelationship()
		 * @generated
		 */
		EClass RIM_ACT_RELATIONSHIP = eINSTANCE.getRIMActRelationship();

	}

} //RIMPackage
