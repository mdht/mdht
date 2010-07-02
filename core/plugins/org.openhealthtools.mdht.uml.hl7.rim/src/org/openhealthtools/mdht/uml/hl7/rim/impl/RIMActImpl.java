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
import org.openhealthtools.mdht.uml.hl7.rim.RIMAct;
import org.openhealthtools.mdht.uml.hl7.rim.RIMActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation;
import org.openhealthtools.mdht.uml.hl7.rim.operations.RIMActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActImpl#getParticipations <em>Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActImpl#getOutboundRelationships <em>Outbound Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMActImpl#getInboundRelationships <em>Inbound Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RIMActImpl extends RIMInfrastructureRootImpl implements RIMAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIMActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMPackage.Literals.RIM_ACT;
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
	public EList<RIMActRelationship> getOutboundRelationships() {
		// TODO: implement this method to return the 'Outbound Relationship' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RIMActRelationship> getInboundRelationships() {
		// TODO: implement this method to return the 'Inbound Relationship' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getClassCode() {
		return RIMActOperations.getClassCode(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getMoodCode() {
		return RIMActOperations.getMoodCode(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNegationInd() {
		return RIMActOperations.getNegationInd(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RIMPackage.RIM_ACT__PARTICIPATION:
				return getParticipations();
			case RIMPackage.RIM_ACT__OUTBOUND_RELATIONSHIP:
				return getOutboundRelationships();
			case RIMPackage.RIM_ACT__INBOUND_RELATIONSHIP:
				return getInboundRelationships();
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
			case RIMPackage.RIM_ACT__PARTICIPATION:
				getParticipations().clear();
				getParticipations().addAll((Collection<? extends RIMParticipation>)newValue);
				return;
			case RIMPackage.RIM_ACT__OUTBOUND_RELATIONSHIP:
				getOutboundRelationships().clear();
				getOutboundRelationships().addAll((Collection<? extends RIMActRelationship>)newValue);
				return;
			case RIMPackage.RIM_ACT__INBOUND_RELATIONSHIP:
				getInboundRelationships().clear();
				getInboundRelationships().addAll((Collection<? extends RIMActRelationship>)newValue);
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
			case RIMPackage.RIM_ACT__PARTICIPATION:
				getParticipations().clear();
				return;
			case RIMPackage.RIM_ACT__OUTBOUND_RELATIONSHIP:
				getOutboundRelationships().clear();
				return;
			case RIMPackage.RIM_ACT__INBOUND_RELATIONSHIP:
				getInboundRelationships().clear();
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
			case RIMPackage.RIM_ACT__PARTICIPATION:
				return !getParticipations().isEmpty();
			case RIMPackage.RIM_ACT__OUTBOUND_RELATIONSHIP:
				return !getOutboundRelationships().isEmpty();
			case RIMPackage.RIM_ACT__INBOUND_RELATIONSHIP:
				return !getInboundRelationships().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RIMActImpl
