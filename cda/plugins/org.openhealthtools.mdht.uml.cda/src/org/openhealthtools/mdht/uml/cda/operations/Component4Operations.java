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
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;
import org.openhealthtools.mdht.uml.hl7.rim.operations.ActRelationshipOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#validateClinicalStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Statement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#validateTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#validateContextConductionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Conduction Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Component4Operations extends ActRelationshipOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Component4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalStatement(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Statement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalStatement(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "Bag{self.act.oclIsUndefined(), self.encounter.oclIsUndefined(), self.observation.oclIsUndefined(), self.observationMedia.oclIsUndefined(), self.organizer.oclIsUndefined(), self.procedure.oclIsUndefined(), self.regionOfInterest.oclIsUndefined(), self.substanceAdministration.oclIsUndefined(), self.supply.oclIsUndefined()}->one(x | x = false)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalStatement(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Statement</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalStatement(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param component4 The receiving '<em><b>Component4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClinicalStatement(Component4 component4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.COMPONENT4);
			try {
				VALIDATE_CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(component4)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE, CDAValidator.COMPONENT4__CLINICAL_STATEMENT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateClinicalStatement",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(component4, context) }),
					new Object[] { component4 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTypeCode(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTypeCode(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isTypeCodeDefined() implies self.typeCode=vocab::ActRelationshipHasComponent::COMP";

	/**
	 * The cached OCL invariant for the '{@link #validateTypeCode(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTypeCode(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param component4 The receiving '<em><b>Component4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeCode(Component4 component4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.COMPONENT4);
			try {
				VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(component4)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE, CDAValidator.COMPONENT4__TYPE_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateTypeCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(component4, context) }),
					new Object[] { component4 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContextConductionInd(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Conduction Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContextConductionInd(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTEXT_CONDUCTION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.contextConductionInd.oclIsUndefined() implies self.contextConductionInd=true";

	/**
	 * The cached OCL invariant for the '{@link #validateContextConductionInd(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Conduction Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContextConductionInd(Component4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTEXT_CONDUCTION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param component4 The receiving '<em><b>Component4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContextConductionInd(Component4 component4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONTEXT_CONDUCTION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.COMPONENT4);
			try {
				VALIDATE_CONTEXT_CONDUCTION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTEXT_CONDUCTION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTEXT_CONDUCTION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(component4)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE, CDAValidator.COMPONENT4__CONTEXT_CONDUCTION_IND,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateContextConductionInd",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(component4, context) }),
					new Object[] { component4 }));
			}
			return false;
		}
		return true;
	}

} // Component4Operations
