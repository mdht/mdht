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
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareProcedure#validatePlanOfCareProcedureMoodCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Mood Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareProcedure#validatePlanOfCareProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareProcedure#validatePlanOfCareProcedureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareProcedure#validatePlanOfCareProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfCareProcedureOperations extends ProcedureOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareProcedureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareProcedureMoodCodeValue(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Mood Code Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareProcedureMoodCodeValue(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentProcedureMood::INT or self.moodCode = vocab::x_DocumentProcedureMood::ARQ"+
"  or self.moodCode = vocab::x_DocumentProcedureMood::PRMS or self.moodCode = vocab::x_DocumentProcedureMood::PRP"+
"  or self.moodCode = vocab::x_DocumentProcedureMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareProcedureMoodCodeValue(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Mood Code Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareProcedureMoodCodeValue(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentProcedureMood::INT or self.moodCode = vocab::x_DocumentProcedureMood::ARQ
	 *   or self.moodCode = vocab::x_DocumentProcedureMood::PRMS or self.moodCode = vocab::x_DocumentProcedureMood::PRP
	 *   or self.moodCode = vocab::x_DocumentProcedureMood::RQO
	 * @param planOfCareProcedure The receiving '<em><b>Plan Of Care Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePlanOfCareProcedureMoodCodeValue(PlanOfCareProcedure planOfCareProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PLAN_OF_CARE_PROCEDURE);
			try {
				VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PLAN_OF_CARE_PROCEDURE__PLAN_OF_CARE_PROCEDURE_MOOD_CODE_VALUE,
						 CCDPlugin.INSTANCE.getString("PlanOfCareProcedureMoodCodeValue"),
						 new Object [] { planOfCareProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareProcedureTemplateId(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareProcedureTemplateId(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.25')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareProcedureTemplateId(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareProcedureTemplateId(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.25')
	 * @param planOfCareProcedure The receiving '<em><b>Plan Of Care Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePlanOfCareProcedureTemplateId(PlanOfCareProcedure planOfCareProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PLAN_OF_CARE_PROCEDURE);
			try {
				VALIDATE_PLAN_OF_CARE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PLAN_OF_CARE_PROCEDURE__PLAN_OF_CARE_PROCEDURE_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("PlanOfCareProcedureTemplateId"),
						 new Object [] { planOfCareProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareProcedureId(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareProcedureId(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareProcedureId(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareProcedureId(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param planOfCareProcedure The receiving '<em><b>Plan Of Care Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePlanOfCareProcedureId(PlanOfCareProcedure planOfCareProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PLAN_OF_CARE_PROCEDURE);
			try {
				VALIDATE_PLAN_OF_CARE_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PLAN_OF_CARE_PROCEDURE__PLAN_OF_CARE_PROCEDURE_ID,
						 CCDPlugin.INSTANCE.getString("PlanOfCareProcedureId"),
						 new Object [] { planOfCareProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareProcedureMoodCode(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareProcedureMoodCode(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareProcedureMoodCode(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Procedure Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareProcedureMoodCode(PlanOfCareProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.moodCode.oclIsUndefined()
	 * @param planOfCareProcedure The receiving '<em><b>Plan Of Care Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePlanOfCareProcedureMoodCode(PlanOfCareProcedure planOfCareProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PLAN_OF_CARE_PROCEDURE);
			try {
				VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PLAN_OF_CARE_PROCEDURE__PLAN_OF_CARE_PROCEDURE_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("PlanOfCareProcedureMoodCode"),
						 new Object [] { planOfCareProcedure }));
			}
			return false;
		}
		return true;
	}

} // PlanOfCareProcedureOperations