/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PolicyActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolicyActivityImpl extends ActImpl implements PolicyActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.POLICY_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityPayerEntityIsRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerEntityIsRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityCoveredPartyIsRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoveredPartyIsRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityCoveredPartyTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoveredPartyTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivitySubscriberIsAllowed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivitySubscriberIsAllowed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivitySubscriberTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivitySubscriberTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityEntryRelationshipREFR(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityEntryRelationshipREFR(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityEntryRelationshipTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityEntryRelationshipTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityPayerEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityCoveredParty(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoveredParty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivityPolicySubscriber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPolicySubscriber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedEntity getPayerEntity() {
		return PolicyActivityOperations.getPayerEntity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole getCoveredParty() {
		return PolicyActivityOperations.getCoveredParty(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole getSubscriber() {
		return PolicyActivityOperations.getSubscriber(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PolicyActivityImpl
