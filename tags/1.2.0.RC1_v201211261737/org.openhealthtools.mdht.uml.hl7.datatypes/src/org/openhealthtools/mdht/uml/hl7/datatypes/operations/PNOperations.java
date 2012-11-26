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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PN</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.PN#validateInvariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PNOperations extends ENOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PNOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInvariant(PN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Invariant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInvariant(PN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.delimiter->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.family->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.given->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.prefix->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.suffix->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS))";

	/**
	 * The cached OCL invariant for the '{@link #validateInvariant(PN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Invariant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInvariant(PN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.delimiter->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.family->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.given->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.prefix->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.suffix->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS))
	 * @param pn The receiving '<em><b>PN</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInvariant(PN pn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.PN);
			try {
				VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pn)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE, DatatypesValidator.PN__INVARIANT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateInvariant",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pn, context) }),
					new Object[] { pn }));
			}
			return false;
		}
		return true;
	}

} // PNOperations
