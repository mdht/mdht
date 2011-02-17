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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.hl7.datatypes.BN;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>BN</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.BN#validateNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Null Flavor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BNOperations extends ANYOperations {
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
	protected BNOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNullFlavor(BN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNullFlavor(BN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateNullFlavor(BN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNullFlavor(BN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.nullFlavor.oclIsUndefined()
	 * @param bn The receiving '<em><b>BN</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNullFlavor(BN bn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.BN);
			try {
				VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bn)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.BN__NULL_FLAVOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateNullFlavor", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bn, context) }),
						 new Object [] { bn }));
			}
			return false;
		}
		return true;
	}

} // BNOperations