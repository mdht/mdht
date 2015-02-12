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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.PolicySubscriber;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ParticipantRoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Subscriber</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicySubscriber#validatePolicySubscriberId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Subscriber Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicySubscriberOperations extends ParticipantRoleOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicySubscriberOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicySubscriberId(PolicySubscriber, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Subscriber Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicySubscriberId(PolicySubscriber, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicySubscriberId(PolicySubscriber, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Subscriber Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicySubscriberId(PolicySubscriber, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param policySubscriber The receiving '<em><b>Policy Subscriber</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePolicySubscriberId(PolicySubscriber policySubscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POLICY_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_SUBSCRIBER);
			try {
				VALIDATE_POLICY_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policySubscriber)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_SUBSCRIBER__POLICY_SUBSCRIBER_ID,
						 CCDPlugin.INSTANCE.getString("PolicySubscriberId"),
						 new Object [] { policySubscriber }));
			}
			return false;
		}
		return true;
	}

} // PolicySubscriberOperations