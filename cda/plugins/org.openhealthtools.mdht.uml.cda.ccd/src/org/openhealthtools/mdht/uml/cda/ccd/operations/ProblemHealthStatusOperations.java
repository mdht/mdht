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
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatus;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.operations.ObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Health Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatus#ProblemHealthStatus_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Health Status template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemHealthStatusOperations extends ObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemHealthStatusOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #ProblemHealthStatus_templateId(ProblemHealthStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Health Status template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemHealthStatus_templateId(ProblemHealthStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_HEALTH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.51')";

	/**
	 * The cached OCL invariant for the '{@link #ProblemHealthStatus_templateId(ProblemHealthStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Health Status template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemHealthStatus_templateId(ProblemHealthStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROBLEM_HEALTH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.51')
	 * @param problemHealthStatus The receiving '<em><b>Problem Health Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProblemHealthStatus_templateId(ProblemHealthStatus problemHealthStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROBLEM_HEALTH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_HEALTH_STATUS);
			try {
				PROBLEM_HEALTH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROBLEM_HEALTH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROBLEM_HEALTH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemHealthStatus)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_HEALTH_STATUS__PROBLEM_HEALTH_STATUS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemHealthStatus_templateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(problemHealthStatus, context) }),
						 new Object [] { problemHealthStatus }));
			}
			return false;
		}
		return true;
	}

} // ProblemHealthStatusOperations