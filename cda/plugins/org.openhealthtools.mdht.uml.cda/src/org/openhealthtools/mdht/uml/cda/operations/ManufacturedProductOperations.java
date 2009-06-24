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
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Manufactured Product</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct#manufacturedDrugOrOtherMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Manufactured Drug Or Other Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManufacturedProductOperations {
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
	protected ManufacturedProductOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #manufacturedDrugOrOtherMaterial(ManufacturedProduct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Manufactured Drug Or Other Material</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #manufacturedDrugOrOtherMaterial(ManufacturedProduct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURED_DRUG_OR_OTHER_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedLabeledDrug.oclIsUndefined() xor self.manufacturedMaterial.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #manufacturedDrugOrOtherMaterial(ManufacturedProduct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Manufactured Drug Or Other Material</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #manufacturedDrugOrOtherMaterial(ManufacturedProduct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MANUFACTURED_DRUG_OR_OTHER_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedLabeledDrug.oclIsUndefined() xor self.manufacturedMaterial.oclIsUndefined()
	 * @param manufacturedProduct The receiving '<em><b>Manufactured Product</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean manufacturedDrugOrOtherMaterial(ManufacturedProduct manufacturedProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MANUFACTURED_DRUG_OR_OTHER_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.eINSTANCE.getManufacturedProduct());
			try {
				MANUFACTURED_DRUG_OR_OTHER_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MANUFACTURED_DRUG_OR_OTHER_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MANUFACTURED_DRUG_OR_OTHER_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(manufacturedProduct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.MANUFACTURED_PRODUCT__MANUFACTURED_DRUG_OR_OTHER_MATERIAL,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "manufacturedDrugOrOtherMaterial", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(manufacturedProduct, context) }),
						 new Object [] { manufacturedProduct }));
			}
			return false;
		}
		return true;
	}

} // ManufacturedProductOperations