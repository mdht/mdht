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
import org.openhealthtools.mdht.uml.cda.Informant12;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Informant12</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Informant12#informantChoice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Informant Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Informant12Operations {
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
	protected Informant12Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #informantChoice(Informant12, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Informant Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #informantChoice(Informant12, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMANT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity.oclIsUndefined() xor self.relatedEntity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #informantChoice(Informant12, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Informant Choice</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #informantChoice(Informant12, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint INFORMANT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity.oclIsUndefined() xor self.relatedEntity.oclIsUndefined()
	 * @param informant12 The receiving '<em><b>Informant12</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean informantChoice(Informant12 informant12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (INFORMANT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.eINSTANCE.getInformant12());
			try {
				INFORMANT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(INFORMANT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(INFORMANT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(informant12)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.INFORMANT12__INFORMANT_CHOICE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "informantChoice", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(informant12, context) }),
						 new Object [] { informant12 }));
			}
			return false;
		}
		return true;
	}

} // Informant12Operations