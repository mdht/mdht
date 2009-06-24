/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Code</em>}</li>
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
	 * The cached OCL expression body for the '{@link #templateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #templateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.27')";

	/**
	 * The cached OCL invariant for the '{@link #templateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #templateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean templateId(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "templateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(problemAct, context) }),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #code(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #code(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor = vocab::NullFlavor::NA";

	/**
	 * The cached OCL invariant for the '{@link #code(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #code(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.nullFlavor = vocab::NullFlavor::NA
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean code(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "code", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(problemAct, context) }),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

} // ProblemActOperations