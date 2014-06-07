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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemSectionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Active Problems Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection#validateActiveProblemsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Active Problems Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection#validateActiveProblemsSectionProblemConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Active Problems Section Problem Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection#getProblemConcernEntries() <em>Get Problem Concern Entries</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateActiveProblemsSectionTemplateId(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Active Problems Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActiveProblemsSectionTemplateId(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateActiveProblemsSectionTemplateId(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Active Problems Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActiveProblemsSectionTemplateId(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.6')
	 * @param activeProblemsSection The receiving '<em><b>Active Problems Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateActiveProblemsSectionTemplateId(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ACTIVE_PROBLEMS_SECTION);
			try {
				VALIDATE_ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activeProblemsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("ActiveProblemsSectionTemplateId"),
						 new Object [] { activeProblemsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateActiveProblemsSectionProblemConcernEntry(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Active Problems Section Problem Concern Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActiveProblemsSectionProblemConcernEntry(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ProblemConcernEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateActiveProblemsSectionProblemConcernEntry(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Active Problems Section Problem Concern Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActiveProblemsSectionProblemConcernEntry(ActiveProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ProblemConcernEntry))
	 * @param activeProblemsSection The receiving '<em><b>Active Problems Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateActiveProblemsSectionProblemConcernEntry(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ACTIVE_PROBLEMS_SECTION);
			try {
				VALIDATE_ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activeProblemsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY,
						 IHEPlugin.INSTANCE.getString("ActiveProblemsSectionProblemConcernEntry"),
						 new Object [] { activeProblemsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemConcernEntries(ActiveProblemsSection) <em>Get Problem Concern Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemConcernEntries(ActiveProblemsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_CONCERN_ENTRIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ProblemConcernEntry)).oclAsType(ihe::ProblemConcernEntry)";

	/**
	 * The cached OCL query for the '{@link #getProblemConcernEntries(ActiveProblemsSection) <em>Get Problem Concern Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemConcernEntries(ActiveProblemsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_CONCERN_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ProblemConcernEntry)).oclAsType(ihe::ProblemConcernEntry)
	 * @param activeProblemsSection The receiving '<em><b>Active Problems Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ProblemConcernEntry> getProblemConcernEntries(ActiveProblemsSection activeProblemsSection) {
		if (GET_PROBLEM_CONCERN_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.ACTIVE_PROBLEMS_SECTION, IHEPackage.Literals.ACTIVE_PROBLEMS_SECTION.getEAllOperations().get(55));
			try {
				GET_PROBLEM_CONCERN_ENTRIES__EOCL_QRY = helper.createQuery(GET_PROBLEM_CONCERN_ENTRIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_CONCERN_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemConcernEntry> result = (Collection<ProblemConcernEntry>) query.evaluate(activeProblemsSection);
		return new BasicEList.UnmodifiableEList<ProblemConcernEntry>(result.size(), result.toArray());
	}

} // ActiveProblemsSectionOperations