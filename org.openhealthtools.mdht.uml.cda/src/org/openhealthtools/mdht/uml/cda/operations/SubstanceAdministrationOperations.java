/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#validateClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceAdministrationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceAdministrationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClassCode(SubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(SubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isClassCodeDefined() implies self.classCode=vocab::ActClass::SBADM";

	/**
	 * The cached OCL invariant for the '{@link #validateClassCode(SubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(SubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isClassCodeDefined() implies self.classCode=vocab::ActClass::SBADM
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassCode(SubstanceAdministration substanceAdministration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE,
					CDAValidator.SUBSTANCE_ADMINISTRATION__CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									substanceAdministration, context) }), new Object[] { substanceAdministration }));
			}
			return false;
		}
		return true;
	}

} // SubstanceAdministrationOperations
