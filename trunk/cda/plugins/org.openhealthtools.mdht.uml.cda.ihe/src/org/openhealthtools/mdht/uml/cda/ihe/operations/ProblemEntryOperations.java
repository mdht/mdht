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
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemObservationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.Severity;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryCommentInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Comment Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntrySeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryHealthStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#getSeverity() <em>Get Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#getProblemStatusObservation() <em>Get Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#getHealthStatusObservation() <em>Get Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#getComments() <em>Get Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemEntryOperations extends ProblemObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryHasTextReference(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryHasTextReference(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryHasTextReference(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryHasTextReference(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.oclIsUndefined()
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryHasTextReference(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_HAS_TEXT_REFERENCE,
						 IHEPlugin.INSTANCE.getString("ProblemEntryHasTextReference"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryCommentInversionInd(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Comment Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryCommentInversionInd(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(rel : cda::EntryRelationship | (not rel.act.oclIsUndefined() and rel.act.oclIsKindOf(ihe::Comment)) implies rel.inversionInd='true')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryCommentInversionInd(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Comment Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryCommentInversionInd(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll(rel : cda::EntryRelationship | (not rel.act.oclIsUndefined() and rel.act.oclIsKindOf(ihe::Comment)) implies rel.inversionInd='true')
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryCommentInversionInd(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_COMMENT_INVERSION_IND,
						 IHEPlugin.INSTANCE.getString("ProblemEntryCommentInversionInd"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryTemplateId(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryTemplateId(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryTemplateId(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryTemplateId(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.5')
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryTemplateId(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("ProblemEntryTemplateId"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryCode(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryCode(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryCode(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryCode(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006'))
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryCode(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_CODE,
						 IHEPlugin.INSTANCE.getString("ProblemEntryCode"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryEffectiveTime(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryEffectiveTime(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryEffectiveTime(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryEffectiveTime(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.oclIsUndefined()
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryEffectiveTime(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_EFFECTIVE_TIME,
						 IHEPlugin.INSTANCE.getString("ProblemEntryEffectiveTime"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryId(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryId(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryId(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryId(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryId(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_ID,
						 IHEPlugin.INSTANCE.getString("ProblemEntryId"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryText(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryText(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryText(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryText(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryText(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_TEXT,
						 IHEPlugin.INSTANCE.getString("ProblemEntryText"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryValue(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryValue(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryValue(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryValue(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD))
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryValue(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_VALUE,
						 IHEPlugin.INSTANCE.getString("ProblemEntryValue"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntrySeverity(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntrySeverity(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::Severity))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntrySeverity(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Severity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntrySeverity(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::Severity))
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntrySeverity(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_SEVERITY,
						 IHEPlugin.INSTANCE.getString("ProblemEntrySeverity"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryProblemStatusObservation(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryProblemStatusObservation(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryProblemStatusObservation(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Problem Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryProblemStatusObservation(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryProblemStatusObservation(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_PROBLEM_STATUS_OBSERVATION,
						 IHEPlugin.INSTANCE.getString("ProblemEntryProblemStatusObservation"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryHealthStatusObservation(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Health Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryHealthStatusObservation(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::HealthStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryHealthStatusObservation(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Health Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryHealthStatusObservation(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::HealthStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryHealthStatusObservation(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_HEALTH_STATUS_OBSERVATION,
						 IHEPlugin.INSTANCE.getString("ProblemEntryHealthStatusObservation"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryComment(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryComment(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryComment(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryComment(ProblemEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryComment(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROBLEM_ENTRY);
			try {
				VALIDATE_PROBLEM_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROBLEM_ENTRY__PROBLEM_ENTRY_COMMENT,
						 IHEPlugin.INSTANCE.getString("ProblemEntryComment"),
						 new Object [] { problemEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeverity(ProblemEntry) <em>Get Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity(ProblemEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::Severity))->asSequence()->first().oclAsType(ihe::Severity)";

	/**
	 * The cached OCL query for the '{@link #getSeverity(ProblemEntry) <em>Get Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity(ProblemEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::Severity))->asSequence()->first().oclAsType(ihe::Severity)
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  Severity getSeverity(ProblemEntry problemEntry) {
		if (GET_SEVERITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.PROBLEM_ENTRY, IHEPackage.Literals.PROBLEM_ENTRY.getEAllOperations().get(67));
			try {
				GET_SEVERITY__EOCL_QRY = helper.createQuery(GET_SEVERITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SEVERITY__EOCL_QRY);
		return (Severity) query.evaluate(problemEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemStatusObservation(ProblemEntry) <em>Get Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservation(ProblemEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemStatusObservation))->asSequence()->first().oclAsType(ihe::ProblemStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemStatusObservation(ProblemEntry) <em>Get Problem Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservation(ProblemEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemStatusObservation))->asSequence()->first().oclAsType(ihe::ProblemStatusObservation)
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ProblemStatusObservation getProblemStatusObservation(ProblemEntry problemEntry) {
		if (GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.PROBLEM_ENTRY, IHEPackage.Literals.PROBLEM_ENTRY.getEAllOperations().get(68));
			try {
				GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PROBLEM_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY);
		return (ProblemStatusObservation) query.evaluate(problemEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHealthStatusObservation(ProblemEntry) <em>Get Health Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation(ProblemEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEALTH_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::HealthStatusObservation))->asSequence()->first().oclAsType(ihe::HealthStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getHealthStatusObservation(ProblemEntry) <em>Get Health Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation(ProblemEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::HealthStatusObservation))->asSequence()->first().oclAsType(ihe::HealthStatusObservation)
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  HealthStatusObservation getHealthStatusObservation(ProblemEntry problemEntry) {
		if (GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.PROBLEM_ENTRY, IHEPackage.Literals.PROBLEM_ENTRY.getEAllOperations().get(69));
			try {
				GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HEALTH_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY);
		return (HealthStatusObservation) query.evaluate(problemEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(ProblemEntry) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ProblemEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::Comment)).oclAsType(ihe::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(ProblemEntry) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ProblemEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::Comment)).oclAsType(ihe::Comment)
	 * @param problemEntry The receiving '<em><b>Problem Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Comment> getComments(ProblemEntry problemEntry) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.PROBLEM_ENTRY, IHEPackage.Literals.PROBLEM_ENTRY.getEAllOperations().get(70));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(problemEntry);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

} // ProblemEntryOperations