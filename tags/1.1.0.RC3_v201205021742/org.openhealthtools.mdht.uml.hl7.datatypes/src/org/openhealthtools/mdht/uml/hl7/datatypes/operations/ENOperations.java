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
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#validateDelimiter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#validateFamily(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#validateGiven(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#validatePrefix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#validateSuffix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Suffix</em>}</li>
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
public class ENOperations extends ANYOperations {
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
	 * The cached OCL expression body for the '{@link #validateDelimiter(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delimiter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelimiter(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.delimiter->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::DEL)";

	/**
	 * The cached OCL invariant for the '{@link #validateDelimiter(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delimiter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelimiter(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static boolean validateDelimiter(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EN);
			try {
				VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(en)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE, DatatypesValidator.EN__DELIMITER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateDelimiter",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(en, context) }),
					new Object[] { en }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamily(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamily(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.family->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::FAM)";

	/**
	 * The cached OCL invariant for the '{@link #validateFamily(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamily(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static boolean validateFamily(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EN);
			try {
				VALIDATE_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(en)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE, DatatypesValidator.EN__FAMILY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateFamily",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(en, context) }),
					new Object[] { en }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGiven(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Given</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGiven(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.given->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::GIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateGiven(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Given</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGiven(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static boolean validateGiven(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EN);
			try {
				VALIDATE_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(en)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE, DatatypesValidator.EN__GIVEN,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateGiven",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(en, context) }),
					new Object[] { en }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrefix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prefix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrefix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.prefix->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::PFX)";

	/**
	 * The cached OCL invariant for the '{@link #validatePrefix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prefix</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrefix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static boolean validatePrefix(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EN);
			try {
				VALIDATE_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(en)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE, DatatypesValidator.EN__PREFIX,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validatePrefix",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(en, context) }),
					new Object[] { en }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSuffix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Suffix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSuffix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.suffix->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::SFX)";

	/**
	 * The cached OCL invariant for the '{@link #validateSuffix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Suffix</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSuffix(EN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static boolean validateSuffix(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.EN);
			try {
				VALIDATE_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(en)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE, DatatypesValidator.EN__SUFFIX,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateSuffix",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(en, context) }),
					new Object[] { en }));
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
	public static EN addDelimiter(EN en, String delimiter) {
		if (delimiter == null) {
			throw new IllegalArgumentException("delimiter is null");
		}
		en.getDelimiters().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.DEL, delimiter));
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EN addFamily(EN en, String family) {
		if (family == null) {
			throw new IllegalArgumentException("family is null");
		}
		en.getFamilies().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.FAM, family));
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EN addGiven(EN en, String given) {
		if (given == null) {
			throw new IllegalArgumentException("given is null");
		}
		en.getGivens().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.GIV, given));
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EN addPrefix(EN en, String prefix) {
		if (prefix == null) {
			throw new IllegalArgumentException("prefix is null");
		}
		en.getPrefixes().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.PFX, prefix));
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EN addSuffix(EN en, String suffix) {
		if (suffix == null) {
			throw new IllegalArgumentException("suffix is null");
		}
		en.getSuffixes().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.SFX, suffix));
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EN addText(EN en, String text) {
		if (text == null) {
			throw new IllegalArgumentException("text is null");
		}
		FeatureMapUtil.addText(en.getMixed(), text);
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getText(EN en) {
		StringBuffer text = new StringBuffer("");
		for (FeatureMap.Entry entry : en.getMixed()) {
			if (FeatureMapUtil.isText(entry)) {
				text.append(entry.getValue().toString());
			}
		}
		return text.toString();
	}

} // ENOperations
