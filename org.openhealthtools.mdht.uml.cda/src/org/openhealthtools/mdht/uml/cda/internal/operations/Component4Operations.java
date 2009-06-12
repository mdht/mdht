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
package org.openhealthtools.mdht.uml.cda.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Component4;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#clinicalStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Clinical Statement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#clinicalStatement() <em>Clinical Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Component4Operations {
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
	protected Component4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #clinicalStatement(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Clinical Statement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #clinicalStatement(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.clinicalStatement()";

	/**
	 * The cached OCL invariant for the '{@link #clinicalStatement(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Clinical Statement</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #clinicalStatement(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.clinicalStatement()
	 * @param component4 The receiving '<em><b>Component4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean clinicalStatement(Component4 component4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.eINSTANCE.getComponent4());
			try {
				CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(component4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.COMPONENT4__CLINICAL_STATEMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "clinicalStatement", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(component4, context) }),
						 new Object [] { component4 }));
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
	public static  boolean clinicalStatement(Component4 component4) {
		return CDAUtil.validateClinicalStatementChoiceGroup(component4);
	}

} // Component4Operations