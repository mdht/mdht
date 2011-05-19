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
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>RTO PQ PQ</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ#validateDenominator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTO_PQ_PQOperations extends ANYOperations {
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
	protected RTO_PQ_PQOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDenominator(RTO_PQ_PQ, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Denominator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDenominator(RTO_PQ_PQ, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DENOMINATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.denominator.value<>0";

	/**
	 * The cached OCL invariant for the '{@link #validateDenominator(RTO_PQ_PQ, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Denominator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDenominator(RTO_PQ_PQ, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DENOMINATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.denominator.value<>0
	 * @param rtO_PQ_PQ The receiving '<em><b>RTO PQ PQ</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDenominator(RTO_PQ_PQ rtO_PQ_PQ, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_DENOMINATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.RTO_PQ_PQ);
			try {
				VALIDATE_DENOMINATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DENOMINATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DENOMINATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(rtO_PQ_PQ)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE, DatatypesValidator.RTO_PQ_PQ__DENOMINATOR,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateDenominator",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(rtO_PQ_PQ, context) }),
					new Object[] { rtO_PQ_PQ }));
			}
			return false;
		}
		return true;
	}

} // RTO_PQ_PQOperations
