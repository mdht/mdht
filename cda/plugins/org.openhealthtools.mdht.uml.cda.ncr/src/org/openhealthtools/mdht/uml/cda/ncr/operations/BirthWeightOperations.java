/*******************************************************************************
 * Copyright (c) 2009, 2010 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.ncr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultObservationOperations;

import org.openhealthtools.mdht.uml.cda.ncr.BirthWeight;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPackage;

import org.openhealthtools.mdht.uml.cda.ncr.util.NCRValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Birth Weight</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateBirthWeightTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateBirthWeightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateBirthWeightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateBirthWeightCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateBirthWeightStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateBirthWeightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BirthWeightOperations extends ResultObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BirthWeightOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "This value SHALL contain [1..1] @unit="g" gram (CodeSystem: 2.16.840.1.113883.6.8 UCUM) STATIC.";

	/**
	 * The cached OCL invariant for the '{@link #validateValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This value SHALL contain [1..1] @unit="g" gram (CodeSystem: 2.16.840.1.113883.6.8 UCUM) STATIC.
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateValue(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Value", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthWeight, context) }),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthWeightTemplateId(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightTemplateId(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.17.3.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthWeightTemplateId(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightTemplateId(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_BIRTH_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.17.3.1')
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateBirthWeightTemplateId(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_BIRTH_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_BIRTH_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__BIRTH_WEIGHT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthWeightTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthWeight, context) }),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthWeightClassCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightClassCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthWeightClassCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightClassCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateBirthWeightClassCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__BIRTH_WEIGHT_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthWeightClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthWeight, context) }),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthWeightMoodCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightMoodCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthWeightMoodCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightMoodCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateBirthWeightMoodCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__BIRTH_WEIGHT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthWeightMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthWeight, context) }),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthWeightCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '47340003' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthWeightCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_BIRTH_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '47340003' and value.codeSystem = '2.16.840.1.113883.6.96')
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateBirthWeightCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_BIRTH_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_BIRTH_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__BIRTH_WEIGHT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthWeightCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthWeight, context) }),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthWeightStatusCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightStatusCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthWeightStatusCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightStatusCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_BIRTH_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateBirthWeightStatusCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_BIRTH_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_BIRTH_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__BIRTH_WEIGHT_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthWeightStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthWeight, context) }),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthWeightValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->exists(value : datatypes::ANY | not value.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthWeightValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value->exists(value : datatypes::ANY | not value.oclIsUndefined())
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateBirthWeightValue(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__BIRTH_WEIGHT_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthWeightValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthWeight, context) }),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

} // BirthWeightOperations