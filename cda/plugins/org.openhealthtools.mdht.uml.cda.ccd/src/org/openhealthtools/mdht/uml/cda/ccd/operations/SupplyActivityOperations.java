/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SupplyOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Supply Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#SupplyActivity_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#SupplyActivity_id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#SupplyActivity_statusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#SupplyActivity_medicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity medication Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplyActivityOperations extends SupplyOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #SupplyActivity_templateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SupplyActivity_templateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.34')";

	/**
	 * The cached OCL invariant for the '{@link #SupplyActivity_templateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SupplyActivity_templateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.34')
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean SupplyActivity_templateId(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("SupplyActivity_templateId"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #SupplyActivity_id(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SupplyActivity_id(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #SupplyActivity_id(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SupplyActivity_id(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean SupplyActivity_id(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_ID,
						 CCDPlugin.INSTANCE.getString("SupplyActivity_id"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #SupplyActivity_statusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SupplyActivity_statusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #SupplyActivity_statusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SupplyActivity_statusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined()
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean SupplyActivity_statusCode(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("SupplyActivity_statusCode"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #SupplyActivity_medicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SupplyActivity_medicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsTypeOf(ccd::MedicationStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #SupplyActivity_medicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supply Activity medication Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SupplyActivity_medicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsTypeOf(ccd::MedicationStatusObservation))
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean SupplyActivity_medicationStatusObservation(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("SupplyActivity_medicationStatusObservation"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

} // SupplyActivityOperations