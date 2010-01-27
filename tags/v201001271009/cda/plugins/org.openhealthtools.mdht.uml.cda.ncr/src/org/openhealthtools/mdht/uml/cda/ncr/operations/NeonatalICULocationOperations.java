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
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncounterLocationOperations;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPackage;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPlugin;
import org.openhealthtools.mdht.uml.cda.ncr.NeonatalICULocation;
import org.openhealthtools.mdht.uml.cda.ncr.util.NCRValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Neonatal ICU Location</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.NeonatalICULocation#validateNeonatalICULocationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Location Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.NeonatalICULocation#validateNeonatalICULocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Location Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NeonatalICULocationOperations extends EncounterLocationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeonatalICULocationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeonatalICULocationTemplateId(NeonatalICULocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Location Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICULocationTemplateId(NeonatalICULocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEONATAL_ICU_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.17.3.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateNeonatalICULocationTemplateId(NeonatalICULocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Location Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICULocationTemplateId(NeonatalICULocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NEONATAL_ICU_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.17.3.14')
	 * @param neonatalICULocation The receiving '<em><b>Neonatal ICU Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNeonatalICULocationTemplateId(NeonatalICULocation neonatalICULocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NEONATAL_ICU_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.NEONATAL_ICU_LOCATION);
			try {
				VALIDATE_NEONATAL_ICU_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEONATAL_ICU_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEONATAL_ICU_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(neonatalICULocation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.NEONATAL_ICU_LOCATION__NEONATAL_ICU_LOCATION_TEMPLATE_ID,
						 NCRPlugin.INSTANCE.getString("NeonatalICULocationTemplateId"),
						 new Object [] { neonatalICULocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeonatalICULocationTypeCode(NeonatalICULocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Location Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICULocationTypeCode(NeonatalICULocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEONATAL_ICU_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.typeCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateNeonatalICULocationTypeCode(NeonatalICULocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Location Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICULocationTypeCode(NeonatalICULocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NEONATAL_ICU_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.typeCode.oclIsUndefined()
	 * @param neonatalICULocation The receiving '<em><b>Neonatal ICU Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNeonatalICULocationTypeCode(NeonatalICULocation neonatalICULocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NEONATAL_ICU_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.NEONATAL_ICU_LOCATION);
			try {
				VALIDATE_NEONATAL_ICU_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEONATAL_ICU_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEONATAL_ICU_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(neonatalICULocation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.NEONATAL_ICU_LOCATION__NEONATAL_ICU_LOCATION_TYPE_CODE,
						 NCRPlugin.INSTANCE.getString("NeonatalICULocationTypeCode"),
						 new Object [] { neonatalICULocation }));
			}
			return false;
		}
		return true;
	}

} // NeonatalICULocationOperations