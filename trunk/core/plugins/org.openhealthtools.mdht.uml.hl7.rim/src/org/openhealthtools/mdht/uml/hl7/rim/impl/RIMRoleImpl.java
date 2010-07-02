/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.rim.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.openhealthtools.mdht.uml.hl7.rim.RIMEntity;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation;
import org.openhealthtools.mdht.uml.hl7.rim.RIMRole;
import org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink;
import org.openhealthtools.mdht.uml.hl7.rim.operations.RIMRoleOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleImpl#getScoper <em>Scoper</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleImpl#getParticipations <em>Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleImpl#getOutboundLinks <em>Outbound Link</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleImpl#getInboundLinks <em>Inbound Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RIMRoleImpl extends RIMInfrastructureRootImpl implements RIMRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIMRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMPackage.Literals.RIM_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMEntity getPlayer() {
		RIMEntity player = basicGetPlayer();
		return player != null && player.eIsProxy() ? (RIMEntity)eResolveProxy((InternalEObject)player) : player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMEntity basicGetPlayer() {
		// TODO: implement this method to return the 'Player' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer(RIMEntity newPlayer) {
		// TODO: implement this method to set the 'Player' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMEntity getScoper() {
		RIMEntity scoper = basicGetScoper();
		return scoper != null && scoper.eIsProxy() ? (RIMEntity)eResolveProxy((InternalEObject)scoper) : scoper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMEntity basicGetScoper() {
		// TODO: implement this method to return the 'Scoper' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoper(RIMEntity newScoper) {
		// TODO: implement this method to set the 'Scoper' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RIMParticipation> getParticipations() {
		// TODO: implement this method to return the 'Participation' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RIMRoleLink> getOutboundLinks() {
		// TODO: implement this method to return the 'Outbound Link' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RIMRoleLink> getInboundLinks() {
		// TODO: implement this method to return the 'Inbound Link' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getClassCode() {
		return RIMRoleOperations.getClassCode(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RIMPackage.RIM_ROLE__PLAYER:
				if (resolve) return getPlayer();
				return basicGetPlayer();
			case RIMPackage.RIM_ROLE__SCOPER:
				if (resolve) return getScoper();
				return basicGetScoper();
			case RIMPackage.RIM_ROLE__PARTICIPATION:
				return getParticipations();
			case RIMPackage.RIM_ROLE__OUTBOUND_LINK:
				return getOutboundLinks();
			case RIMPackage.RIM_ROLE__INBOUND_LINK:
				return getInboundLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RIMPackage.RIM_ROLE__PLAYER:
				setPlayer((RIMEntity)newValue);
				return;
			case RIMPackage.RIM_ROLE__SCOPER:
				setScoper((RIMEntity)newValue);
				return;
			case RIMPackage.RIM_ROLE__PARTICIPATION:
				getParticipations().clear();
				getParticipations().addAll((Collection<? extends RIMParticipation>)newValue);
				return;
			case RIMPackage.RIM_ROLE__OUTBOUND_LINK:
				getOutboundLinks().clear();
				getOutboundLinks().addAll((Collection<? extends RIMRoleLink>)newValue);
				return;
			case RIMPackage.RIM_ROLE__INBOUND_LINK:
				getInboundLinks().clear();
				getInboundLinks().addAll((Collection<? extends RIMRoleLink>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RIMPackage.RIM_ROLE__PLAYER:
				setPlayer((RIMEntity)null);
				return;
			case RIMPackage.RIM_ROLE__SCOPER:
				setScoper((RIMEntity)null);
				return;
			case RIMPackage.RIM_ROLE__PARTICIPATION:
				getParticipations().clear();
				return;
			case RIMPackage.RIM_ROLE__OUTBOUND_LINK:
				getOutboundLinks().clear();
				return;
			case RIMPackage.RIM_ROLE__INBOUND_LINK:
				getInboundLinks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RIMPackage.RIM_ROLE__PLAYER:
				return basicGetPlayer() != null;
			case RIMPackage.RIM_ROLE__SCOPER:
				return basicGetScoper() != null;
			case RIMPackage.RIM_ROLE__PARTICIPATION:
				return !getParticipations().isEmpty();
			case RIMPackage.RIM_ROLE__OUTBOUND_LINK:
				return !getOutboundLinks().isEmpty();
			case RIMPackage.RIM_ROLE__INBOUND_LINK:
				return !getInboundLinks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RIMRoleImpl
