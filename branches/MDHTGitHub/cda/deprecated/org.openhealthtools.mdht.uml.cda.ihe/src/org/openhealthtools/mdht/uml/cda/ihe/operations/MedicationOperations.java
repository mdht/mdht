/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationActivityOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationConsumableName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Consumable Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Route Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationOperations extends MedicationActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationConsumableName(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Consumable Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConsumableName(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_CONSUMABLE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.consumable.manufacturedProduct.manufacturedLabeledDrug.name.oclIsUndefined()"+
"   or not self.consumable.manufacturedProduct.manufacturedMaterial.name.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationConsumableName(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Consumable Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationConsumableName(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_CONSUMABLE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.consumable.manufacturedProduct.manufacturedLabeledDrug.name.oclIsUndefined()
	 *    or not self.consumable.manufacturedProduct.manufacturedMaterial.name.oclIsUndefined()
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationConsumableName(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_CONSUMABLE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MEDICATION);
			try {
				VALIDATE_MEDICATION_CONSUMABLE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_CONSUMABLE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_CONSUMABLE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.MEDICATION__MEDICATION_CONSUMABLE_NAME,
						 IHEPlugin.INSTANCE.getString("MedicationConsumableName"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationTemplateId(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationTemplateId(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationTemplateId(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationTemplateId(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7')
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationTemplateId(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MEDICATION);
			try {
				VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.MEDICATION__MEDICATION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("MedicationTemplateId"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationApproachSiteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationApproachSiteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.approachSiteCode->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationApproachSiteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationApproachSiteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.approachSiteCode->isEmpty()
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationApproachSiteCode(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MEDICATION);
			try {
				VALIDATE_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.MEDICATION__MEDICATION_APPROACH_SITE_CODE,
						 IHEPlugin.INSTANCE.getString("MedicationApproachSiteCode"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.doseQuantity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.doseQuantity.oclIsUndefined()
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationDoseQuantity(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MEDICATION);
			try {
				VALIDATE_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.MEDICATION__MEDICATION_DOSE_QUANTITY,
						 IHEPlugin.INSTANCE.getString("MedicationDoseQuantity"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationRateQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationRateQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.rateQuantity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationRateQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationRateQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.rateQuantity.oclIsUndefined()
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationRateQuantity(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MEDICATION);
			try {
				VALIDATE_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.MEDICATION__MEDICATION_RATE_QUANTITY,
						 IHEPlugin.INSTANCE.getString("MedicationRateQuantity"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationRouteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationRouteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.routeCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationRouteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationRouteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.routeCode.oclIsUndefined()
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationRouteCode(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MEDICATION);
			try {
				VALIDATE_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.MEDICATION__MEDICATION_ROUTE_CODE,
						 IHEPlugin.INSTANCE.getString("MedicationRouteCode"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

} // MedicationOperations