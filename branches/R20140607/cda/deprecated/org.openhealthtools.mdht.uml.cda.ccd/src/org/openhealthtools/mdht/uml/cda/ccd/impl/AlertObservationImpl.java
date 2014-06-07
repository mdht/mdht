/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AlertObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alert Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AlertObservationImpl extends ObservationImpl implements AlertObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlertObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.ALERT_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservationInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertObservationOperations.validateAlertObservationInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservationAgentRepresentation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertObservationOperations.validateAlertObservationAgentRepresentation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservationPlayingEntityRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertObservationOperations.validateAlertObservationPlayingEntityRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertObservationOperations.validateAlertObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertObservationOperations.validateAlertObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertObservationOperations.validateAlertObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertObservationOperations.validateAlertObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservationAlertStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertObservationOperations.validateAlertObservationAlertStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservationReactionObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertObservationOperations.validateAlertObservationReactionObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertStatusObservation getAlertStatusObservation() {
		return AlertObservationOperations.getAlertStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactionObservation> getReactionObservations() {
		return AlertObservationOperations.getReactionObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertObservation init() {
    		CDAUtil.init(this);
    		return this;
	}
} //AlertObservationImpl
