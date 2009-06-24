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
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;

import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesValidator;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EN</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#delimiter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#family(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#given(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#prefix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#suffix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addDelimiter(java.lang.String) <em>Add Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addFamily(java.lang.String) <em>Add Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addGiven(java.lang.String) <em>Add Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addPrefix(java.lang.String) <em>Add Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addSuffix(java.lang.String) <em>Add Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addText(java.lang.String) <em>Add Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getText() <em>Get Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ENOperations {
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
	protected ENOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #delimiter(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delimiter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #delimiter(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.delimiter->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::DEL)";

	/**
	 * The cached OCL invariant for the '{@link #delimiter(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delimiter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #delimiter(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.delimiter->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::DEL)
	 * @param en The receiving '<em><b>EN</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean delimiter(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EN);
			try {
				DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(en)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.EN__DELIMITER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "delimiter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(en, context) }),
						 new Object [] { en }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #family(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Family</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #family(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.family->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::FAM)";

	/**
	 * The cached OCL invariant for the '{@link #family(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Family</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #family(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.family->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::FAM)
	 * @param en The receiving '<em><b>EN</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean family(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EN);
			try {
				FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(en)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.EN__FAMILY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "family", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(en, context) }),
						 new Object [] { en }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #given(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Given</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #given(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.given->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::GIV)";

	/**
	 * The cached OCL invariant for the '{@link #given(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Given</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #given(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.given->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::GIV)
	 * @param en The receiving '<em><b>EN</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean given(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EN);
			try {
				GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(en)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.EN__GIVEN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "given", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(en, context) }),
						 new Object [] { en }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #prefix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Prefix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #prefix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.prefix->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::PFX)";

	/**
	 * The cached OCL invariant for the '{@link #prefix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Prefix</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #prefix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.prefix->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::PFX)
	 * @param en The receiving '<em><b>EN</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean prefix(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EN);
			try {
				PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(en)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.EN__PREFIX,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "prefix", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(en, context) }),
						 new Object [] { en }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #suffix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Suffix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #suffix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.suffix->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::SFX)";

	/**
	 * The cached OCL invariant for the '{@link #suffix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Suffix</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #suffix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.suffix->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::SFX)
	 * @param en The receiving '<em><b>EN</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean suffix(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EN);
			try {
				SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(en)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.EN__SUFFIX,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "suffix", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(en, context) }),
						 new Object [] { en }));
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
	public static  EN addDelimiter(EN en, String delimiter) {
		en.getDelimiter().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.DEL, delimiter));
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EN addFamily(EN en, String family) {
		en.getFamily().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.FAM, family));
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EN addGiven(EN en, String given) {
		en.getGiven().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.GIV, given));
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EN addPrefix(EN en, String prefix) {
		en.getPrefix().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.PFX, prefix));
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EN addSuffix(EN en, String suffix) {
		en.getSuffix().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.SFX, suffix));
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EN addText(EN en, String text) {
		FeatureMapUtil.addText(en.getMixed(), text);
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  String getText(EN en) {
		StringBuffer text = new StringBuffer("");
		FeatureMap featureMap = en.getMixed();
		for (int i = 0; i < featureMap.size(); i++) {
			FeatureMap.Entry entry = featureMap.get(i);
			if (FeatureMapUtil.isText(entry)) {
				text.append(entry.getValue().toString());
			}
		}
		return text.toString();
	}

} // ENOperations