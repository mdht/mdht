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
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#ProblemAct_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Act template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#ProblemAct_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Act code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemActOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #ProblemAct_templateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Act template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemAct_templateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.27')";

	/**
	 * The cached OCL invariant for the '{@link #ProblemAct_templateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Act template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemAct_templateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.27')
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProblemAct_templateId(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("ProblemAct_templateId"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ProblemAct_code(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Act code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemAct_code(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.nullFlavor = vocab::NullFlavor::NA";

	/**
	 * The cached OCL invariant for the '{@link #ProblemAct_code(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Act code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemAct_code(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.nullFlavor = vocab::NullFlavor::NA
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProblemAct_code(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_CODE,
						 CCDPlugin.INSTANCE.getString("ProblemAct_code"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

} // ProblemActOperations