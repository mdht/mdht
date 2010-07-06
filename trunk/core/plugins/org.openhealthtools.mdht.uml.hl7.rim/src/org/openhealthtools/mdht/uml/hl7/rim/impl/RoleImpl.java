/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.rim.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.hl7.rim.Entity;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.rim.Role;
import org.openhealthtools.mdht.uml.hl7.rim.RoleLink;
import org.openhealthtools.mdht.uml.hl7.rim.operations.RoleOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class RoleImpl extends InfrastructureRootImpl implements Role {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getClassCode() {
		return RoleOperations.getClassCode(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getPlayer() {
		return RoleOperations.getPlayer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getScoper() {
		return RoleOperations.getScoper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participation> getParticipations() {
		return RoleOperations.getParticipations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleLink> getOutboundLinks() {
		return RoleOperations.getOutboundLinks(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleLink> getInboundLinks() {
		return RoleOperations.getInboundLinks(this);
	}

} //RoleImpl
