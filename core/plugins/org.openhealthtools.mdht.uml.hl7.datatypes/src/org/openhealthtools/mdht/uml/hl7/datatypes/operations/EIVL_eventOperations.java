/**
 * Copyright (c) 2011 IBM Corporation
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
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event;
import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesValidator;
import org.openhealthtools.mdht.uml.hl7.vocab.TimingEvent;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EIVL event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#validateOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#validateTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#validateCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#validateCodeSystemName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#validateCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#init() <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EIVL_eventOperations extends CEOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EIVL_eventOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOriginalText(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOriginalText(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.originalText.oclIsUndefined()";
	/**
	 * The cached OCL invariant for the '{@link #validateOriginalText(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOriginalText(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.originalText.oclIsUndefined()
	 * @param eivL_event The receiving '<em><b>EIVL event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateOriginalText(EIVL_event eivL_event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EIVL_EVENT);
			try {
				VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eivL_event)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.EIVL_EVENT__ORIGINAL_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateOriginalText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eivL_event, context) }),
						 new Object [] { eivL_event }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTranslation(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTranslation(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.translation->size()=0";
	/**
	 * The cached OCL invariant for the '{@link #validateTranslation(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTranslation(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.translation->size()=0
	 * @param eivL_event The receiving '<em><b>EIVL event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTranslation(EIVL_event eivL_event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EIVL_EVENT);
			try {
				VALIDATE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eivL_event)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.EIVL_EVENT__TRANSLATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateTranslation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eivL_event, context) }),
						 new Object [] { eivL_event }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeSystem(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeSystem(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.codeSystem.oclIsUndefined() implies self.codeSystem='2.16.840.1.113883.5.139'";
	/**
	 * The cached OCL invariant for the '{@link #validateCodeSystem(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeSystem(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.codeSystem.oclIsUndefined() implies self.codeSystem='2.16.840.1.113883.5.139'
	 * @param eivL_event The receiving '<em><b>EIVL event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCodeSystem(EIVL_event eivL_event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EIVL_EVENT);
			try {
				VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eivL_event)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.EIVL_EVENT__CODE_SYSTEM,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCodeSystem", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eivL_event, context) }),
						 new Object [] { eivL_event }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeSystemName(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeSystemName(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.codeSystemName.oclIsUndefined() implies self.codeSystemName='TimingEvent'";
	/**
	 * The cached OCL invariant for the '{@link #validateCodeSystemName(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeSystemName(EIVL_event, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.codeSystemName.oclIsUndefined() implies self.codeSystemName='TimingEvent'
	 * @param eivL_event The receiving '<em><b>EIVL event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCodeSystemName(EIVL_event eivL_event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EIVL_EVENT);
			try {
				VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eivL_event)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.EIVL_EVENT__CODE_SYSTEM_NAME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCodeSystemName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eivL_event, context) }),
						 new Object [] { eivL_event }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eivL_event The receiving '<em><b>EIVL event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static  boolean validateCode(EIVL_event eivL_event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if ((eivL_event != null) && 
			(eivL_event.getCode() != null) &&
			(TimingEvent.get(eivL_event.getCode()) == null)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.EIVL_EVENT__CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eivL_event, context)}),
						 new Object [] { eivL_event }));
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
	public static  EIVL_event init(EIVL_event eivL_event) {
		eivL_event.setCodeSystem("2.16.840.1.113883.5.139");
		eivL_event.setCodeSystemName("TimingEvent");
		return eivL_event;
	}

} // EIVL_eventOperations