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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Reference;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#externalActChoice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>External Act Choice</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#externalActChoice() <em>External Act Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceOperations {
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
	protected ReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #externalActChoice(Reference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>External Act Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #externalActChoice(Reference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ACT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.externalActChoice()";

	/**
	 * The cached OCL invariant for the '{@link #externalActChoice(Reference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>External Act Choice</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #externalActChoice(Reference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EXTERNAL_ACT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.externalActChoice()
	 * @param reference The receiving '<em><b>Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean externalActChoice(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (EXTERNAL_ACT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.eINSTANCE.getReference());
			try {
				EXTERNAL_ACT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(EXTERNAL_ACT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(EXTERNAL_ACT_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.REFERENCE__EXTERNAL_ACT_CHOICE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "externalActChoice", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reference, context) }),
						 new Object [] { reference }));
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
	public static  boolean externalActChoice(Reference reference) {
		List<EObject> choiceGroup = new ArrayList<EObject>();
		choiceGroup.add(reference.getExternalAct());
		choiceGroup.add(reference.getExternalObservation());
		choiceGroup.add(reference.getExternalProcedure());
		choiceGroup.add(reference.getExternalDocument());
		return CDAUtil.validateChoiceGroup(choiceGroup);
	}

} // ReferenceOperations