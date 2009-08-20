/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Concern Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry#ProblemConcernEntry_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Concern Entry template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry#ProblemConcernEntry_problemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Concern Entry problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemConcernEntryOperations extends ConcernEntryOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemConcernEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #ProblemConcernEntry_templateId(ProblemConcernEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Concern Entry template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemConcernEntry_templateId(ProblemConcernEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_CONCERN_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.4.5.2')";

	/**
	 * The cached OCL invariant for the '{@link #ProblemConcernEntry_templateId(ProblemConcernEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Concern Entry template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemConcernEntry_templateId(ProblemConcernEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROBLEM_CONCERN_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.4.5.2')
	 * @param problemConcernEntry The receiving '<em><b>Problem Concern Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProblemConcernEntry_templateId(ProblemConcernEntry problemConcernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROBLEM_CONCERN_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_CONCERN_ENTRY);
			try {
				PROBLEM_CONCERN_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROBLEM_CONCERN_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROBLEM_CONCERN_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemConcernEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_CONCERN_ENTRY__PROBLEM_CONCERN_ENTRY_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("ProblemConcernEntry_templateId"),
						 new Object [] { problemConcernEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ProblemConcernEntry_problemEntry(ProblemConcernEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Concern Entry problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemConcernEntry_problemEntry(ProblemConcernEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_CONCERN_ENTRY_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ihe::ProblemEntry))";

	/**
	 * The cached OCL invariant for the '{@link #ProblemConcernEntry_problemEntry(ProblemConcernEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Problem Concern Entry problem Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProblemConcernEntry_problemEntry(ProblemConcernEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROBLEM_CONCERN_ENTRY_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ihe::ProblemEntry))
	 * @param problemConcernEntry The receiving '<em><b>Problem Concern Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProblemConcernEntry_problemEntry(ProblemConcernEntry problemConcernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROBLEM_CONCERN_ENTRY_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_CONCERN_ENTRY);
			try {
				PROBLEM_CONCERN_ENTRY_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROBLEM_CONCERN_ENTRY_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROBLEM_CONCERN_ENTRY_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemConcernEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_CONCERN_ENTRY__PROBLEM_CONCERN_ENTRY_PROBLEM_ENTRY,
						 IHEPlugin.INSTANCE.getString("ProblemConcernEntry_problemEntry"),
						 new Object [] { problemConcernEntry }));
			}
			return false;
		}
		return true;
	}

} // ProblemConcernEntryOperations