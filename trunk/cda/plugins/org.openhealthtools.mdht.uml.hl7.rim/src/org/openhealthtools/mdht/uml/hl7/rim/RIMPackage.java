/*******************************************************************************
 * Copyright (c) 2010, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.InfrastructureRootImpl <em>Infrastructure Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.InfrastructureRootImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getInfrastructureRoot()
	 * @generated
	 */
	int INFRASTRUCTURE_ROOT = 1;

	/**
	 * The number of structural features of the '<em>Infrastructure Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ROOT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.ActImpl <em>Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.ActImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getAct()
	 * @generated
	 */
	int ACT = 0;

	/**
	 * The number of structural features of the '<em>Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_FEATURE_COUNT = INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.ParticipationImpl <em>Participation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.ParticipationImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getParticipation()
	 * @generated
	 */
	int PARTICIPATION = 2;

	/**
	 * The number of structural features of the '<em>Participation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION_FEATURE_COUNT = INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RoleImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.EntityImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RoleLinkImpl <em>Role Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RoleLinkImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRoleLink()
	 * @generated
	 */
	int ROLE_LINK = 5;

	/**
	 * The number of structural features of the '<em>Role Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LINK_FEATURE_COUNT = INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.ActRelationshipImpl <em>Act Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.ActRelationshipImpl
	 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getActRelationship()
	 * @generated
	 */
	int ACT_RELATIONSHIP = 6;

	/**
	 * The number of structural features of the '<em>Act Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_RELATIONSHIP_FEATURE_COUNT = INFRASTRUCTURE_ROOT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Act</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	EClass getAct();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Root</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	EClass getInfrastructureRoot();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.Participation <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participation</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Participation
	 * @generated
	 */
	EClass getParticipation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.RoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Link</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RoleLink
	 * @generated
	 */
	EClass getRoleLink();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.rim.ActRelationship <em>Act Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Act Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.ActRelationship
	 * @generated
	 */
	EClass getActRelationship();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.ActImpl <em>Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.ActImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getAct()
		 * @generated
		 */
		EClass ACT = eINSTANCE.getAct();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.InfrastructureRootImpl <em>Infrastructure Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.InfrastructureRootImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getInfrastructureRoot()
		 * @generated
		 */
		EClass INFRASTRUCTURE_ROOT = eINSTANCE.getInfrastructureRoot();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.ParticipationImpl <em>Participation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.ParticipationImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getParticipation()
		 * @generated
		 */
		EClass PARTICIPATION = eINSTANCE.getParticipation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RoleImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.EntityImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RoleLinkImpl <em>Role Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RoleLinkImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getRoleLink()
		 * @generated
		 */
		EClass ROLE_LINK = eINSTANCE.getRoleLink();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.rim.impl.ActRelationshipImpl <em>Act Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.ActRelationshipImpl
		 * @see org.openhealthtools.mdht.uml.hl7.rim.impl.RIMPackageImpl#getActRelationship()
		 * @generated
		 */
		EClass ACT_RELATIONSHIP = eINSTANCE.getActRelationship();

	}

} // RIMPackage
