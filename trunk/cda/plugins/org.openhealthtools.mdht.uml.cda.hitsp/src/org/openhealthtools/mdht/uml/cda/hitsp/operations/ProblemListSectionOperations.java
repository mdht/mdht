/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;

import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

import org.openhealthtools.mdht.uml.cda.ihe.operations.ActiveProblemsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem List Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection#ProblemListSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem List Section template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemListSectionOperations extends ActiveProblemsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemListSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #ProblemListSection_templateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem List Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemListSection_templateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.3.88.11.83.103')";

	/**
	 * The cached OCL invariant for the '{@link #ProblemListSection_templateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem List Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemListSection_templateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.3.88.11.83.103')
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProblemListSection_templateId(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PROBLEM_LIST_SECTION);
			try {
				PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemListSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("ProblemListSection_templateId"),
						 new Object [] { problemListSection }));
			}
			return false;
		}
		return true;
	}

} // ProblemListSectionOperations