/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityPayerEntityIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Entity Is Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityCoveredPartyIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party Is Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityCoveredPartyTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivitySubscriberIsAllowed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Subscriber Is Allowed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivitySubscriberTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Subscriber Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityEntryRelationshipREFR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship REFR</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityEntryRelationshipTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityPayerEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityCoveredParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityPolicySubscriber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Policy Subscriber</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#getPayerEntity() <em>Get Payer Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#getCoveredParty() <em>Get Covered Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#getSubscriber() <em>Get Subscriber</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyActivityOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerEntityIsRequired(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Entity Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerEntityIsRequired(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(perf : cda::Performer2 | perf.typeCode = vocab::ParticipationPhysicalPerformer::PRF)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerEntityIsRequired(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Entity Is Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerEntityIsRequired(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->one(perf : cda::Performer2 | perf.typeCode = vocab::ParticipationPhysicalPerformer::PRF)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityPayerEntityIsRequired(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_ENTITY_IS_REQUIRED,
						 CCDPlugin.INSTANCE.getString("PolicyActivityPayerEntityIsRequired"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoveredPartyIsRequired(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoveredPartyIsRequired(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::COV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoveredPartyIsRequired(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party Is Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoveredPartyIsRequired(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::COV)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityCoveredPartyIsRequired(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERED_PARTY_IS_REQUIRED,
						 CCDPlugin.INSTANCE.getString("PolicyActivityCoveredPartyIsRequired"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoveredPartyTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoveredPartyTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::COV"+
"  implies not part.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoveredPartyTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoveredPartyTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::COV
	 *   implies not part.time.oclIsUndefined())
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityCoveredPartyTime(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERED_PARTY_TIME,
						 CCDPlugin.INSTANCE.getString("PolicyActivityCoveredPartyTime"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivitySubscriberIsAllowed(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Subscriber Is Allowed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivitySubscriberIsAllowed(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::HLD)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivitySubscriberIsAllowed(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Subscriber Is Allowed</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivitySubscriberIsAllowed(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::HLD)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivitySubscriberIsAllowed(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_SUBSCRIBER_IS_ALLOWED,
						 CCDPlugin.INSTANCE.getString("PolicyActivitySubscriberIsAllowed"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivitySubscriberTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Subscriber Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivitySubscriberTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::HLD"+
"  implies not part.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivitySubscriberTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Subscriber Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivitySubscriberTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::HLD
	 *   implies not part.time.oclIsUndefined())
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivitySubscriberTime(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_SUBSCRIBER_TIME,
						 CCDPlugin.INSTANCE.getString("PolicyActivitySubscriberTime"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityEntryRelationshipREFR(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship REFR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationshipREFR(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(rel : cda::EntryRelationship | rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityEntryRelationshipREFR(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship REFR</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationshipREFR(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll(rel : cda::EntryRelationship | rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityEntryRelationshipREFR(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_ENTRY_RELATIONSHIP_REFR,
						 CCDPlugin.INSTANCE.getString("PolicyActivityEntryRelationshipREFR"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityEntryRelationshipTarget(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationshipTarget(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(rel : cda::EntryRelationship | rel.act.oclIsKindOf(ccd::AuthorizationActivity)"+
"  or rel.act.oclIsKindOf(ccd::CoveragePlanDescription))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityEntryRelationshipTarget(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationshipTarget(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll(rel : cda::EntryRelationship | rel.act.oclIsKindOf(ccd::AuthorizationActivity)
	 *   or rel.act.oclIsKindOf(ccd::CoveragePlanDescription))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityEntryRelationshipTarget(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET,
						 CCDPlugin.INSTANCE.getString("PolicyActivityEntryRelationshipTarget"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.26')";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.26')
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityTemplateId(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("PolicyActivityTemplateId"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityClassCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityClassCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityClassCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityClassCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityClassCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("PolicyActivityClassCode"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityMoodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityMoodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityMoodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityMoodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityMoodCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("PolicyActivityMoodCode"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityId(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_ID,
						 CCDPlugin.INSTANCE.getString("PolicyActivityId"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityStatusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityStatusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityStatusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityStatusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed')
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityStatusCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("PolicyActivityStatusCode"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.assignedEntity.oclIsUndefined() and performer.assignedEntity.oclIsKindOf(cda::AssignedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->one(performer : cda::Performer2 | not performer.assignedEntity.oclIsUndefined() and performer.assignedEntity.oclIsKindOf(cda::AssignedEntity))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityPayerEntity(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_ENTITY,
						 CCDPlugin.INSTANCE.getString("PolicyActivityPayerEntity"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoveredParty(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoveredParty(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(cda::ParticipantRole))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoveredParty(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoveredParty(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(cda::ParticipantRole))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityCoveredParty(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERED_PARTY,
						 CCDPlugin.INSTANCE.getString("PolicyActivityCoveredParty"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPolicySubscriber(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Policy Subscriber</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPolicySubscriber(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_POLICY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(cda::ParticipantRole))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPolicySubscriber(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Policy Subscriber</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPolicySubscriber(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_POLICY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(cda::ParticipantRole))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicyActivityPolicySubscriber(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_ACTIVITY_POLICY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_POLICY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_POLICY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_POLICY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_POLICY_SUBSCRIBER,
						 CCDPlugin.INSTANCE.getString("PolicyActivityPolicySubscriber"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPayerEntity(PolicyActivity) <em>Get Payer Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerEntity(PolicyActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAYER_ENTITY__EOCL_EXP = "self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))->asSequence()->first().oclAsType(cda::AssignedEntity)";

	/**
	 * The cached OCL query for the '{@link #getPayerEntity(PolicyActivity) <em>Get Payer Entity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerEntity(PolicyActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAYER_ENTITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))->asSequence()->first().oclAsType(cda::AssignedEntity)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AssignedEntity getPayerEntity(PolicyActivity policyActivity) {
		if (GET_PAYER_ENTITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.POLICY_ACTIVITY, CCDPackage.Literals.POLICY_ACTIVITY.getEAllOperations().get(58));
			try {
				GET_PAYER_ENTITY__EOCL_QRY = helper.createQuery(GET_PAYER_ENTITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAYER_ENTITY__EOCL_QRY);
		return (AssignedEntity) query.evaluate(policyActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCoveredParty(PolicyActivity) <em>Get Covered Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredParty(PolicyActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COVERED_PARTY__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))->asSequence()->first().oclAsType(cda::ParticipantRole)";

	/**
	 * The cached OCL query for the '{@link #getCoveredParty(PolicyActivity) <em>Get Covered Party</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredParty(PolicyActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COVERED_PARTY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))->asSequence()->first().oclAsType(cda::ParticipantRole)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ParticipantRole getCoveredParty(PolicyActivity policyActivity) {
		if (GET_COVERED_PARTY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.POLICY_ACTIVITY, CCDPackage.Literals.POLICY_ACTIVITY.getEAllOperations().get(59));
			try {
				GET_COVERED_PARTY__EOCL_QRY = helper.createQuery(GET_COVERED_PARTY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COVERED_PARTY__EOCL_QRY);
		return (ParticipantRole) query.evaluate(policyActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubscriber(PolicyActivity) <em>Get Subscriber</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber(PolicyActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBSCRIBER__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))->asSequence()->first().oclAsType(cda::ParticipantRole)";

	/**
	 * The cached OCL query for the '{@link #getSubscriber(PolicyActivity) <em>Get Subscriber</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber(PolicyActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBSCRIBER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))->asSequence()->first().oclAsType(cda::ParticipantRole)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ParticipantRole getSubscriber(PolicyActivity policyActivity) {
		if (GET_SUBSCRIBER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.POLICY_ACTIVITY, CCDPackage.Literals.POLICY_ACTIVITY.getEAllOperations().get(60));
			try {
				GET_SUBSCRIBER__EOCL_QRY = helper.createQuery(GET_SUBSCRIBER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBSCRIBER__EOCL_QRY);
		return (ParticipantRole) query.evaluate(policyActivity);
	}

} // PolicyActivityOperations