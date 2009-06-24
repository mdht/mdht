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
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Entry;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Entry#clinicalStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Clinical Statement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Entry#clinicalStatement() <em>Clinical Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #clinicalStatement(Entry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Clinical Statement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #clinicalStatement(Entry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.clinicalStatement()";

	/**
	 * The cached OCL invariant for the '{@link #clinicalStatement(Entry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Clinical Statement</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #clinicalStatement(Entry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.clinicalStatement()
	 * @param entry The receiving '<em><b>Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean clinicalStatement(Entry entry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.eINSTANCE.getEntry());
			try {
				CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(entry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.ENTRY__CLINICAL_STATEMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "clinicalStatement", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(entry, context) }),
						 new Object [] { entry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  boolean clinicalStatement(Entry entry) {
		return CDAUtil.validateClinicalStatementChoiceGroup(entry);
	}

} // EntryOperations