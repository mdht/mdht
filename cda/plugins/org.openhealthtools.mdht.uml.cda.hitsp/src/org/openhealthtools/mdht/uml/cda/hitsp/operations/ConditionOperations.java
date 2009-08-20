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
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HitspPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HitspPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HitspValidator;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProblemConcernEntryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#Condition_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Condition template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#Condition_text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Condition text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#createProblemEntry() <em>Create Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionOperations extends ProblemConcernEntryOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #Condition_templateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Condition template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Condition_templateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.3.88.11.83.7')";

	/**
	 * The cached OCL invariant for the '{@link #Condition_templateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Condition template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Condition_templateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.3.88.11.83.7')
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean Condition_templateId(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HitspPackage.Literals.CONDITION);
			try {
				CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HitspValidator.DIAGNOSTIC_SOURCE,
						 HitspValidator.CONDITION__CONDITION_TEMPLATE_ID,
						 HitspPlugin.INSTANCE.getString("Condition_templateId"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #Condition_text(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Condition text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Condition_text(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #Condition_text(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Condition text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Condition_text(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CONDITION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean Condition_text(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CONDITION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HitspPackage.Literals.CONDITION);
			try {
				CONDITION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CONDITION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CONDITION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HitspValidator.DIAGNOSTIC_SOURCE,
						 HitspValidator.CONDITION__CONDITION_TEXT,
						 HitspPlugin.INSTANCE.getString("Condition_text"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  ProblemEntry createProblemEntry(Condition condition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ConditionOperations