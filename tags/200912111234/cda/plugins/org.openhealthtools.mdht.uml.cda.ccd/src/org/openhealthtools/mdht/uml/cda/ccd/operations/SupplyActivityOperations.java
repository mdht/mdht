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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityFulfillmentInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Fulfillment Instruction</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateSupplyActivityTemplateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityTemplateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.34')";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityTemplateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityTemplateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean validateSupplyActivityTemplateId(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("SupplyActivityTemplateId"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean validateSupplyActivityId(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_ID,
						 CCDPlugin.INSTANCE.getString("SupplyActivityId"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityStatusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityStatusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityStatusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityStatusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean validateSupplyActivityStatusCode(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("SupplyActivityStatusCode"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityMedicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityMedicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ccd::MedicationStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityMedicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Medication Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityMedicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ccd::MedicationStatusObservation))
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityMedicationStatusObservation(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("SupplyActivityMedicationStatusObservation"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityFulfillmentInstruction(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Fulfillment Instruction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityFulfillmentInstruction(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | entryRelationship.act.oclIsKindOf(ccd::FulfillmentInstruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityFulfillmentInstruction(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Fulfillment Instruction</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityFulfillmentInstruction(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | entryRelationship.act.oclIsKindOf(ccd::FulfillmentInstruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityFulfillmentInstruction(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION,
						 CCDPlugin.INSTANCE.getString("SupplyActivityFulfillmentInstruction"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

} // SupplyActivityOperations