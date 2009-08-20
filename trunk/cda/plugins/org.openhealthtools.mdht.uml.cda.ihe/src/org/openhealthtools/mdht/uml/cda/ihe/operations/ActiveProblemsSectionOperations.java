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
import org.openhealthtools.mdht.uml.cda.CDAPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemSectionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Active Problems Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection#ActiveProblemsSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Active Problems Section template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection#ActiveProblemsSection_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Active Problems Section code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection#ActiveProblemsSection_problemConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Active Problems Section problem Concern Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActiveProblemsSectionOperations extends ProblemSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveProblemsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #ActiveProblemsSection_templateId(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Active Problems Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ActiveProblemsSection_templateId(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.6')";

	/**
	 * The cached OCL invariant for the '{@link #ActiveProblemsSection_templateId(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Active Problems Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ActiveProblemsSection_templateId(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.6')
	 * @param activeProblemsSection The receiving '<em><b>Active Problems Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ActiveProblemsSection_templateId(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ACTIVE_PROBLEMS_SECTION);
			try {
				ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activeProblemsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("ActiveProblemsSection_templateId"),
						 new Object [] { activeProblemsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ActiveProblemsSection_code(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Active Problems Section code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ActiveProblemsSection_code(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsTypeOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '11450-4' and value.codeSystem = '2.16.840.1.113883.6.1' and value.codeSystemName = 'LOINC')";

	/**
	 * The cached OCL invariant for the '{@link #ActiveProblemsSection_code(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Active Problems Section code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ActiveProblemsSection_code(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ACTIVE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsTypeOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '11450-4' and value.codeSystem = '2.16.840.1.113883.6.1' and value.codeSystemName = 'LOINC')
	 * @param activeProblemsSection The receiving '<em><b>Active Problems Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ActiveProblemsSection_code(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ACTIVE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ACTIVE_PROBLEMS_SECTION);
			try {
				ACTIVE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ACTIVE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ACTIVE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activeProblemsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_CODE,
						 IHEPlugin.INSTANCE.getString("ActiveProblemsSection_code"),
						 new Object [] { activeProblemsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ActiveProblemsSection_problemConcernEntry(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Active Problems Section problem Concern Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ActiveProblemsSection_problemConcernEntry(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | entry.act.oclIsKindOf(ihe::ProblemConcernEntry))";

	/**
	 * The cached OCL invariant for the '{@link #ActiveProblemsSection_problemConcernEntry(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Active Problems Section problem Concern Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ActiveProblemsSection_problemConcernEntry(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.act.oclIsKindOf(ihe::ProblemConcernEntry))
	 * @param activeProblemsSection The receiving '<em><b>Active Problems Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ActiveProblemsSection_problemConcernEntry(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ACTIVE_PROBLEMS_SECTION);
			try {
				ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activeProblemsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY,
						 IHEPlugin.INSTANCE.getString("ActiveProblemsSection_problemConcernEntry"),
						 new Object [] { activeProblemsSection }));
			}
			return false;
		}
		return true;
	}

} // ActiveProblemsSectionOperations